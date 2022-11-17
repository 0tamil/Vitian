package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.common.util.n.b;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class d1 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    private final long f1738e;

    /* renamed from: f  reason: collision with root package name */
    private final PowerManager.WakeLock f1739f;

    /* renamed from: g  reason: collision with root package name */
    private final FirebaseMessaging f1740g;

    /* loaded from: classes.dex */
    static class a extends BroadcastReceiver {
        private d1 a;

        public a(d1 d1Var) {
            this.a = d1Var;
        }

        public void a() {
            if (d1.c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.a.b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            d1 d1Var = this.a;
            if (d1Var != null && d1Var.d()) {
                if (d1.c()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.a.f1740g.e(this.a, 0L);
                this.a.b().unregisterReceiver(this);
                this.a = null;
            }
        }
    }

    @SuppressLint({"InvalidWakeLockTag"})
    public d1(FirebaseMessaging firebaseMessaging, long j2) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b("firebase-iid-executor"));
        this.f1740g = firebaseMessaging;
        this.f1738e = j2;
        PowerManager.WakeLock newWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f1739f = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    static boolean c() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    Context b() {
        return this.f1740g.f();
    }

    boolean d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    boolean e() {
        String str;
        try {
            if (this.f1740g.c() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            } else if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            } else {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
                return true;
            }
        } catch (IOException e2) {
            if (o0.g(e2.getMessage())) {
                str = "Token retrieval failed: " + e2.getMessage() + ". Will retry token retrieval";
            } else if (e2.getMessage() == null) {
                str = "Token retrieval failed without exception message. Will retry token retrieval";
            } else {
                throw e2;
            }
            Log.w("FirebaseMessaging", str);
            return false;
        } catch (SecurityException unused) {
            str = "Token retrieval failed with SecurityException. Will retry token retrieval";
            Log.w("FirebaseMessaging", str);
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"WakelockTimeout"})
    public void run() {
        if (a1.b().e(b())) {
            this.f1739f.acquire();
        }
        try {
            try {
                this.f1740g.J(true);
            } catch (IOException e2) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e2.getMessage() + ". Won't retry the operation.");
                this.f1740g.J(false);
                if (!a1.b().e(b())) {
                    return;
                }
            }
            if (!this.f1740g.o()) {
                this.f1740g.J(false);
                if (a1.b().e(b())) {
                    this.f1739f.release();
                }
            } else if (!a1.b().d(b()) || d()) {
                if (e()) {
                    this.f1740g.J(false);
                } else {
                    this.f1740g.N(this.f1738e);
                }
                if (!a1.b().e(b())) {
                    return;
                }
                this.f1739f.release();
            } else {
                new a(this).a();
                if (a1.b().e(b())) {
                    this.f1739f.release();
                }
            }
        } catch (Throwable th) {
            if (a1.b().e(b())) {
                this.f1739f.release();
            }
            throw th;
        }
    }
}

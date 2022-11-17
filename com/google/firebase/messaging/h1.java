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
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class h1 implements Runnable {

    /* renamed from: j  reason: collision with root package name */
    private static final Object f1761j = new Object();

    /* renamed from: k  reason: collision with root package name */
    private static Boolean f1762k;
    private static Boolean l;

    /* renamed from: e  reason: collision with root package name */
    private final Context f1763e;

    /* renamed from: f  reason: collision with root package name */
    private final r0 f1764f;

    /* renamed from: g  reason: collision with root package name */
    private final PowerManager.WakeLock f1765g;

    /* renamed from: h  reason: collision with root package name */
    private final g1 f1766h;

    /* renamed from: i  reason: collision with root package name */
    private final long f1767i;

    /* loaded from: classes.dex */
    class a extends BroadcastReceiver {
        private h1 a;

        public a(h1 h1Var) {
            this.a = h1Var;
        }

        public void a() {
            if (h1.j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            h1.this.f1763e.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            h1 h1Var = this.a;
            if (h1Var != null) {
                if (h1Var.i()) {
                    if (h1.j()) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    this.a.f1766h.l(this.a, 0L);
                    context.unregisterReceiver(this);
                    this.a = null;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h1(g1 g1Var, Context context, r0 r0Var, long j2) {
        this.f1766h = g1Var;
        this.f1763e = context;
        this.f1767i = j2;
        this.f1764f = r0Var;
        this.f1765g = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    private static String e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    private static boolean f(Context context) {
        boolean booleanValue;
        synchronized (f1761j) {
            Boolean bool = l;
            Boolean valueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
            l = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    private static boolean g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", e(str));
        }
        return z;
    }

    private static boolean h(Context context) {
        boolean booleanValue;
        synchronized (f1761j) {
            Boolean bool = f1762k;
            Boolean valueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
            f1762k = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean i() {
        boolean z;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f1763e.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo != null) {
            if (activeNetworkInfo.isConnected()) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public void run() {
        PowerManager.WakeLock wakeLock;
        if (h(this.f1763e)) {
            this.f1765g.acquire(i0.a);
        }
        try {
            try {
                try {
                    this.f1766h.n(true);
                } catch (Throwable th) {
                    if (h(this.f1763e)) {
                        try {
                            this.f1765g.release();
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                    throw th;
                }
            } catch (IOException e2) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e2.getMessage());
                this.f1766h.n(false);
                if (h(this.f1763e)) {
                    wakeLock = this.f1765g;
                } else {
                    return;
                }
            }
            if (!this.f1764f.g()) {
                this.f1766h.n(false);
                if (h(this.f1763e)) {
                    try {
                        this.f1765g.release();
                    } catch (RuntimeException unused2) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else if (!f(this.f1763e) || i()) {
                if (this.f1766h.r()) {
                    this.f1766h.n(false);
                } else {
                    this.f1766h.s(this.f1767i);
                }
                if (h(this.f1763e)) {
                    wakeLock = this.f1765g;
                    wakeLock.release();
                }
            } else {
                new a(this).a();
                if (h(this.f1763e)) {
                    try {
                        this.f1765g.release();
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            }
        } catch (RuntimeException unused4) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}

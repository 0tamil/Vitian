package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.util.n.b;
import com.google.firebase.messaging.k1;
import f.b.a.b.g.d;
import f.b.a.b.g.i;
import f.b.a.b.g.j;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
class k1 implements ServiceConnection {
    private final Context a;
    private final Intent b;
    private final ScheduledExecutorService c;

    /* renamed from: d  reason: collision with root package name */
    private final Queue<a> f1774d;

    /* renamed from: e  reason: collision with root package name */
    private j1 f1775e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1776f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        final Intent a;
        private final j<Void> b = new j<>();

        a(Intent intent) {
            this.a = intent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void e() {
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + this.a.getAction() + " App may get closed.");
            b();
        }

        void a(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.messaging.d0
                @Override // java.lang.Runnable
                public final void run() {
                    k1.a.this.e();
                }
            }, 9000L, TimeUnit.MILLISECONDS);
            c().c(scheduledExecutorService, new d() { // from class: com.google.firebase.messaging.e0
                @Override // f.b.a.b.g.d
                public final void a(i iVar) {
                    schedule.cancel(false);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void b() {
            this.b.e(null);
        }

        i<Void> c() {
            return this.b.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k1(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new b("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    k1(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f1774d = new ArrayDeque();
        this.f1776f = false;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.c = scheduledExecutorService;
    }

    private void a() {
        while (!this.f1774d.isEmpty()) {
            this.f1774d.poll().b();
        }
    }

    private synchronized void b() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.f1774d.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            j1 j1Var = this.f1775e;
            if (j1Var == null || !j1Var.isBinderAlive()) {
                d();
                return;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
            }
            this.f1775e.b(this.f1774d.poll());
        }
    }

    private void d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("binder is dead. start connection? ");
            sb.append(!this.f1776f);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (!this.f1776f) {
            this.f1776f = true;
            try {
            } catch (SecurityException e2) {
                Log.e("FirebaseMessaging", "Exception while binding the service", e2);
            }
            if (!com.google.android.gms.common.k.a.b().a(this.a, this.b, this, 65)) {
                Log.e("FirebaseMessaging", "binding to the service failed");
                this.f1776f = false;
                a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized i<Void> c(Intent intent) {
        a aVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        aVar = new a(intent);
        aVar.a(this.c);
        this.f1774d.add(aVar);
        b();
        return aVar.c();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
        }
        this.f1776f = false;
        if (!(iBinder instanceof j1)) {
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            a();
            return;
        }
        this.f1775e = (j1) iBinder;
        b();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        b();
    }
}

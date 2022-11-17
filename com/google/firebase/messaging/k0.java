package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.firebase.messaging.j1;
import f.b.a.b.g.d;
import f.b.a.b.g.i;
import f.b.a.b.g.j;
import f.b.a.b.g.l;
import java.util.concurrent.ExecutorService;
@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* loaded from: classes.dex */
public abstract class k0 extends Service {

    /* renamed from: f  reason: collision with root package name */
    private Binder f1770f;

    /* renamed from: h  reason: collision with root package name */
    private int f1772h;

    /* renamed from: e  reason: collision with root package name */
    final ExecutorService f1769e = m0.b();

    /* renamed from: g  reason: collision with root package name */
    private final Object f1771g = new Object();

    /* renamed from: i  reason: collision with root package name */
    private int f1773i = 0;

    /* loaded from: classes.dex */
    class a implements j1.a {
        a() {
        }

        @Override // com.google.firebase.messaging.j1.a
        public i<Void> a(Intent intent) {
            return k0.this.j(intent);
        }
    }

    private void b(Intent intent) {
        if (intent != null) {
            i1.b(intent);
        }
        synchronized (this.f1771g) {
            int i2 = this.f1773i - 1;
            this.f1773i = i2;
            if (i2 == 0) {
                k(this.f1772h);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void g(Intent intent, i iVar) {
        b(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void i(Intent intent, j jVar) {
        try {
            d(intent);
        } finally {
            jVar.c(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public i<Void> j(final Intent intent) {
        if (e(intent)) {
            return l.e(null);
        }
        final j jVar = new j();
        this.f1769e.execute(new Runnable() { // from class: com.google.firebase.messaging.c
            @Override // java.lang.Runnable
            public final void run() {
                k0.this.i(intent, jVar);
            }
        });
        return jVar.a();
    }

    protected abstract Intent c(Intent intent);

    public abstract void d(Intent intent);

    public boolean e(Intent intent) {
        return false;
    }

    boolean k(int i2) {
        return stopSelfResult(i2);
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f1770f == null) {
            this.f1770f = new j1(new a());
        }
        return this.f1770f;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f1769e.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i2, int i3) {
        synchronized (this.f1771g) {
            this.f1772h = i3;
            this.f1773i++;
        }
        Intent c = c(intent);
        if (c == null) {
            b(intent);
            return 2;
        }
        i<Void> j2 = j(c);
        if (j2.m()) {
            b(intent);
            return 2;
        }
        j2.c(x.f1843e, new d() { // from class: com.google.firebase.messaging.b
            @Override // f.b.a.b.g.d
            public final void a(i iVar) {
                k0.this.g(intent, iVar);
            }
        });
        return 3;
    }
}

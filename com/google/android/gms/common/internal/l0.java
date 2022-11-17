package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.a;
import com.google.android.gms.common.api.f;
import f.b.a.b.d.a.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
/* loaded from: classes.dex */
public final class l0 implements Handler.Callback {
    @NotOnlyInitialized
    private final k0 a;

    /* renamed from: h  reason: collision with root package name */
    private final Handler f1265h;
    private final ArrayList<f.b> b = new ArrayList<>();
    final ArrayList<f.b> c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<f.c> f1261d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f1262e = false;

    /* renamed from: f  reason: collision with root package name */
    private final AtomicInteger f1263f = new AtomicInteger(0);

    /* renamed from: g  reason: collision with root package name */
    private boolean f1264g = false;

    /* renamed from: i  reason: collision with root package name */
    private final Object f1266i = new Object();

    public l0(Looper looper, k0 k0Var) {
        this.a = k0Var;
        this.f1265h = new j(looper, this);
    }

    public final void a() {
        this.f1262e = false;
        this.f1263f.incrementAndGet();
    }

    public final void b() {
        this.f1262e = true;
    }

    public final void c(a aVar) {
        p.d(this.f1265h, "onConnectionFailure must only be called on the Handler thread");
        this.f1265h.removeMessages(1);
        synchronized (this.f1266i) {
            ArrayList arrayList = new ArrayList(this.f1261d);
            int i2 = this.f1263f.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                f.c cVar = (f.c) it.next();
                if (this.f1262e && this.f1263f.get() == i2) {
                    if (this.f1261d.contains(cVar)) {
                        cVar.a(aVar);
                    }
                }
                return;
            }
        }
    }

    public final void d(Bundle bundle) {
        p.d(this.f1265h, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f1266i) {
            p.k(!this.f1264g);
            this.f1265h.removeMessages(1);
            this.f1264g = true;
            p.k(this.c.isEmpty());
            ArrayList arrayList = new ArrayList(this.b);
            int i2 = this.f1263f.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                f.b bVar = (f.b) it.next();
                if (!this.f1262e || !this.a.a() || this.f1263f.get() != i2) {
                    break;
                } else if (!this.c.contains(bVar)) {
                    bVar.d(bundle);
                }
            }
            this.c.clear();
            this.f1264g = false;
        }
    }

    public final void e(int i2) {
        p.d(this.f1265h, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f1265h.removeMessages(1);
        synchronized (this.f1266i) {
            this.f1264g = true;
            ArrayList arrayList = new ArrayList(this.b);
            int i3 = this.f1263f.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                f.b bVar = (f.b) it.next();
                if (!this.f1262e || this.f1263f.get() != i3) {
                    break;
                } else if (this.b.contains(bVar)) {
                    bVar.b(i2);
                }
            }
            this.c.clear();
            this.f1264g = false;
        }
    }

    public final void f(f.b bVar) {
        p.i(bVar);
        synchronized (this.f1266i) {
            if (this.b.contains(bVar)) {
                String valueOf = String.valueOf(bVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
                sb.append("registerConnectionCallbacks(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                Log.w("GmsClientEvents", sb.toString());
            } else {
                this.b.add(bVar);
            }
        }
        if (this.a.a()) {
            Handler handler = this.f1265h;
            handler.sendMessage(handler.obtainMessage(1, bVar));
        }
    }

    public final void g(f.c cVar) {
        p.i(cVar);
        synchronized (this.f1266i) {
            if (this.f1261d.contains(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 67);
                sb.append("registerConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                Log.w("GmsClientEvents", sb.toString());
            } else {
                this.f1261d.add(cVar);
            }
        }
    }

    public final void h(f.c cVar) {
        p.i(cVar);
        synchronized (this.f1266i) {
            if (!this.f1261d.remove(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57);
                sb.append("unregisterConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" not found");
                Log.w("GmsClientEvents", sb.toString());
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 1) {
            f.b bVar = (f.b) message.obj;
            synchronized (this.f1266i) {
                if (this.f1262e && this.a.a() && this.b.contains(bVar)) {
                    bVar.d(null);
                }
            }
            return true;
        }
        StringBuilder sb = new StringBuilder(45);
        sb.append("Don't know how to handle message: ");
        sb.append(i2);
        Log.wtf("GmsClientEvents", sb.toString(), new Exception());
        return false;
    }
}

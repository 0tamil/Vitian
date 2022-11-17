package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.p;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;
/* loaded from: classes.dex */
final class e0 implements c.AbstractC0029c {
    private final WeakReference<p0> a;
    private final a<?> b;
    private final boolean c;

    public e0(p0 p0Var, a<?> aVar, boolean z) {
        this.a = new WeakReference<>(p0Var);
        this.b = aVar;
        this.c = z;
    }

    @Override // com.google.android.gms.common.internal.c.AbstractC0029c
    public final void a(com.google.android.gms.common.a aVar) {
        y0 y0Var;
        Lock lock;
        Lock lock2;
        boolean o;
        boolean p;
        p0 p0Var = this.a.get();
        if (p0Var != null) {
            Looper myLooper = Looper.myLooper();
            y0Var = p0Var.a;
            p.l(myLooper == y0Var.m.k(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            lock = p0Var.b;
            lock.lock();
            try {
                o = p0Var.o(0);
                if (o) {
                    if (!aVar.f()) {
                        p0Var.m(aVar, this.b, this.c);
                    }
                    p = p0Var.p();
                    if (p) {
                        p0Var.n();
                    }
                }
            } finally {
                lock2 = p0Var.b;
                lock2.unlock();
            }
        }
    }
}

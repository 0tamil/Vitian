package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;
/* loaded from: classes.dex */
abstract class o0 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ p0 f1147e;

    protected abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        Lock lock;
        y0 y0Var;
        Lock lock2;
        lock = this.f1147e.b;
        lock.lock();
        try {
            try {
                if (!Thread.interrupted()) {
                    a();
                }
            } catch (RuntimeException e2) {
                y0Var = this.f1147e.a;
                y0Var.p(e2);
            }
        } finally {
            lock2 = this.f1147e.b;
            lock2.unlock();
        }
    }
}

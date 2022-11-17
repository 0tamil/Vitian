package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class w0 {
    private final v0 a;

    /* JADX INFO: Access modifiers changed from: protected */
    public w0(v0 v0Var) {
        this.a = v0Var;
    }

    protected abstract void a();

    public final void b(y0 y0Var) {
        Lock lock;
        Lock lock2;
        v0 v0Var;
        lock = y0Var.a;
        lock.lock();
        try {
            v0Var = y0Var.f1200k;
            if (v0Var == this.a) {
                a();
            }
        } finally {
            lock2 = y0Var.a;
            lock2.unlock();
        }
    }
}

package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.a;
import java.util.concurrent.locks.Lock;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e3 implements o1 {
    final /* synthetic */ t a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ e3(t tVar, d3 d3Var) {
        this.a = tVar;
    }

    @Override // com.google.android.gms.common.api.internal.o1
    public final void a(Bundle bundle) {
        Lock lock;
        Lock lock2;
        lock = this.a.l;
        lock.lock();
        try {
            this.a.f1171j = a.f1038i;
            t.w(this.a);
        } finally {
            lock2 = this.a.l;
            lock2.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.o1
    public final void b(int i2, boolean z) {
        Lock lock;
        Lock lock2;
        boolean z2;
        y0 y0Var;
        lock = this.a.l;
        lock.lock();
        try {
            t tVar = this.a;
            z2 = tVar.f1172k;
            if (z2) {
                tVar.f1172k = false;
                t.u(this.a, i2, z);
            } else {
                tVar.f1172k = true;
                y0Var = this.a.c;
                y0Var.b(i2);
            }
        } finally {
            lock2 = this.a.l;
            lock2.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.o1
    public final void c(a aVar) {
        Lock lock;
        Lock lock2;
        lock = this.a.l;
        lock.lock();
        try {
            this.a.f1171j = aVar;
            t.w(this.a);
        } finally {
            lock2 = this.a.l;
            lock2.unlock();
        }
    }
}

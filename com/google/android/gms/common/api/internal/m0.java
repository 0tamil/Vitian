package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.p;
import f.b.a.b.e.g;
import java.util.concurrent.locks.Lock;
/* loaded from: classes.dex */
final class m0 implements f.b, f.c {
    final /* synthetic */ p0 a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ m0(p0 p0Var, l0 l0Var) {
        this.a = p0Var;
    }

    @Override // com.google.android.gms.common.api.internal.m
    public final void a(a aVar) {
        Lock lock;
        Lock lock2;
        boolean q;
        lock = this.a.b;
        lock.lock();
        try {
            q = this.a.q(aVar);
            if (q) {
                this.a.i();
                this.a.n();
            } else {
                this.a.l(aVar);
            }
        } finally {
            lock2 = this.a.b;
            lock2.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void b(int i2) {
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void d(Bundle bundle) {
        e eVar;
        g gVar;
        eVar = this.a.r;
        p.i(eVar);
        gVar = this.a.f1155k;
        p.i(gVar);
        gVar.t(new k0(this.a));
    }
}

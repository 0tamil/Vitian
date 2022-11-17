package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.c;
import f.b.a.b.g.j;
/* loaded from: classes.dex */
public final class m2<ResultT> extends p1 {
    private final r<a.b, ResultT> b;
    private final j<ResultT> c;

    /* renamed from: d  reason: collision with root package name */
    private final q f1146d;

    public m2(int i2, r<a.b, ResultT> rVar, j<ResultT> jVar, q qVar) {
        super(i2);
        this.c = jVar;
        this.b = rVar;
        this.f1146d = qVar;
        if (i2 == 2 && rVar.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.o2
    public final void a(Status status) {
        this.c.d(this.f1146d.a(status));
    }

    @Override // com.google.android.gms.common.api.internal.o2
    public final void b(Exception exc) {
        this.c.d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.o2
    public final void c(g1<?> g1Var) {
        try {
            this.b.b(g1Var.v(), this.c);
        } catch (DeadObjectException e2) {
            throw e2;
        } catch (RemoteException e3) {
            a(o2.e(e3));
        } catch (RuntimeException e4) {
            this.c.d(e4);
        }
    }

    @Override // com.google.android.gms.common.api.internal.o2
    public final void d(w wVar, boolean z) {
        wVar.d(this.c, z);
    }

    @Override // com.google.android.gms.common.api.internal.p1
    public final boolean f(g1<?> g1Var) {
        return this.b.c();
    }

    @Override // com.google.android.gms.common.api.internal.p1
    public final c[] g(g1<?> g1Var) {
        return this.b.e();
    }
}

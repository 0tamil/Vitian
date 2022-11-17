package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.common.c;
/* loaded from: classes.dex */
public final class n2 extends h2<Boolean> {
    public final j.a<?> c;

    public n2(j.a<?> aVar, f.b.a.b.g.j<Boolean> jVar) {
        super(4, jVar);
        this.c = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.o2
    public final /* bridge */ /* synthetic */ void d(w wVar, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.p1
    public final boolean f(g1<?> g1Var) {
        x1 x1Var = g1Var.x().get(this.c);
        if (x1Var == null) {
            return false;
        }
        x1Var.a.d();
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.p1
    public final c[] g(g1<?> g1Var) {
        x1 x1Var = g1Var.x().get(this.c);
        if (x1Var == null) {
            return null;
        }
        return x1Var.a.b();
    }

    @Override // com.google.android.gms.common.api.internal.h2
    public final void h(g1<?> g1Var) {
        x1 remove = g1Var.x().remove(this.c);
        if (remove != null) {
            remove.b.a(g1Var.v(), this.b);
            remove.a.a();
            return;
        }
        this.b.e(Boolean.FALSE);
    }
}

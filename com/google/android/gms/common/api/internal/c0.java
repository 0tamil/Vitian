package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.internal.p;
import java.util.Set;
/* loaded from: classes.dex */
public final class c0 implements v0 {
    private final y0 a;
    private boolean b = false;

    public c0(y0 y0Var) {
        this.a = y0Var;
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public final void a() {
        if (this.b) {
            this.b = false;
            this.a.o(new b0(this, this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public final void b(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public final <A extends a.b, R extends j, T extends d<R, A>> T c(T t) {
        h(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public final boolean d() {
        if (this.b) {
            return false;
        }
        Set<i2> set = this.a.m.w;
        if (set == null || set.isEmpty()) {
            this.a.n(null);
            return true;
        }
        this.b = true;
        for (i2 i2Var : set) {
            i2Var.f();
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public final void e(com.google.android.gms.common.a aVar, a<?> aVar2, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public final void f(int i2) {
        this.a.n(null);
        this.a.n.b(i2, this.b);
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public final void g() {
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public final <A extends a.b, T extends d<? extends j, A>> T h(T t) {
        try {
            this.a.m.x.a(t);
            u0 u0Var = this.a.m;
            a.f fVar = u0Var.o.get(t.s());
            p.j(fVar, "Appropriate Api was not requested.");
            if (fVar.a() || !this.a.f1196g.containsKey(t.s())) {
                t.u(fVar);
            } else {
                t.w(new Status(17));
            }
        } catch (DeadObjectException unused) {
            this.a.o(new a0(this, this));
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j() {
        if (this.b) {
            this.b = false;
            this.a.m.x.b();
            d();
        }
    }
}

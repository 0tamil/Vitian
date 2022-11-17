package com.google.android.gms.common.api.internal;

import f.b.a.b.e.b.d;
import f.b.a.b.e.b.l;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
final class k0 extends d {
    private final WeakReference<p0> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k0(p0 p0Var) {
        this.a = new WeakReference<>(p0Var);
    }

    @Override // f.b.a.b.e.b.f
    public final void F(l lVar) {
        y0 y0Var;
        p0 p0Var = this.a.get();
        if (p0Var != null) {
            y0Var = p0Var.a;
            y0Var.o(new j0(this, p0Var, p0Var, lVar));
        }
    }
}

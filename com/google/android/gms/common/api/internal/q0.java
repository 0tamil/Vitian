package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.j;
import java.util.Collections;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
/* loaded from: classes.dex */
public final class q0 implements v0 {
    @NotOnlyInitialized
    private final y0 a;

    public q0(y0 y0Var) {
        this.a = y0Var;
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public final void a() {
        this.a.m();
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public final void b(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public final <A extends a.b, R extends j, T extends d<R, A>> T c(T t) {
        this.a.m.f1178h.add(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public final boolean d() {
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public final void e(com.google.android.gms.common.a aVar, a<?> aVar2, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public final void f(int i2) {
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public final void g() {
        for (a.f fVar : this.a.f1195f.values()) {
            fVar.n();
        }
        this.a.m.p = Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public final <A extends a.b, T extends d<? extends j, A>> T h(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}

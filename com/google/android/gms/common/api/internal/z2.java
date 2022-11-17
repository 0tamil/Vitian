package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.p;
/* loaded from: classes.dex */
public final class z2 implements f.b, f.c {
    public final a<?> a;
    private final boolean b;
    private a3 c;

    public z2(a<?> aVar, boolean z) {
        this.a = aVar;
        this.b = z;
    }

    private final a3 e() {
        p.j(this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.c;
    }

    @Override // com.google.android.gms.common.api.internal.m
    public final void a(com.google.android.gms.common.a aVar) {
        e().J(aVar, this.a, this.b);
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void b(int i2) {
        e().b(i2);
    }

    public final void c(a3 a3Var) {
        this.c = a3Var;
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void d(Bundle bundle) {
        e().d(bundle);
    }
}

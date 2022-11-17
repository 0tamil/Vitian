package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.a;
/* loaded from: classes.dex */
public final class d1 extends s0 {

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ c f1222g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(c cVar, int i2, Bundle bundle) {
        super(cVar, i2, null);
        this.f1222g = cVar;
    }

    @Override // com.google.android.gms.common.internal.s0
    protected final void f(a aVar) {
        if (!this.f1222g.x() || !c.k0(this.f1222g)) {
            this.f1222g.n.a(aVar);
            this.f1222g.P(aVar);
            return;
        }
        c.g0(this.f1222g, 16);
    }

    @Override // com.google.android.gms.common.internal.s0
    protected final boolean g() {
        this.f1222g.n.a(a.f1038i);
        return true;
    }
}

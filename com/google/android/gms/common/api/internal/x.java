package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.a;
import com.google.android.gms.common.d;
import com.google.android.gms.common.internal.p;
import e.c.b;
/* loaded from: classes.dex */
public final class x extends v2 {

    /* renamed from: j  reason: collision with root package name */
    private final b<b<?>> f1191j = new b<>();

    /* renamed from: k  reason: collision with root package name */
    private final g f1192k;

    x(i iVar, g gVar, d dVar) {
        super(iVar, dVar);
        this.f1192k = gVar;
        this.f1077e.b("ConnectionlessLifecycleHelper", this);
    }

    public static void u(Activity activity, g gVar, b<?> bVar) {
        i c = LifecycleCallback.c(activity);
        x xVar = (x) c.c("ConnectionlessLifecycleHelper", x.class);
        if (xVar == null) {
            xVar = new x(c, gVar, d.n());
        }
        p.j(bVar, "ApiKey cannot be null");
        xVar.f1191j.add(bVar);
        gVar.c(xVar);
    }

    private final void v() {
        if (!this.f1191j.isEmpty()) {
            this.f1192k.c(this);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void h() {
        super.h();
        v();
    }

    @Override // com.google.android.gms.common.api.internal.v2, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void j() {
        super.j();
        v();
    }

    @Override // com.google.android.gms.common.api.internal.v2, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void k() {
        super.k();
        this.f1192k.d(this);
    }

    @Override // com.google.android.gms.common.api.internal.v2
    protected final void m(a aVar, int i2) {
        this.f1192k.G(aVar, i2);
    }

    @Override // com.google.android.gms.common.api.internal.v2
    protected final void n() {
        this.f1192k.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final b<b<?>> t() {
        return this.f1191j;
    }
}

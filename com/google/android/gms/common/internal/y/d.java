package com.google.android.gms.common.internal.y;

import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.common.internal.w;
import f.b.a.b.g.i;
import f.b.a.b.g.j;
/* loaded from: classes.dex */
public final class d extends e<w> implements v {

    /* renamed from: j  reason: collision with root package name */
    private static final a.g<e> f1300j;

    /* renamed from: k  reason: collision with root package name */
    private static final a.AbstractC0026a<e, w> f1301k;
    private static final a<w> l;
    public static final /* synthetic */ int m = 0;

    static {
        a.g<e> gVar = new a.g<>();
        f1300j = gVar;
        c cVar = new c();
        f1301k = cVar;
        l = new a<>("ClientTelemetry.API", cVar, gVar);
    }

    public d(Context context, w wVar) {
        super(context, l, wVar, e.a.c);
    }

    @Override // com.google.android.gms.common.internal.v
    public final i<Void> a(final t tVar) {
        r.a a = r.a();
        a.d(f.b.a.b.d.a.d.a);
        a.c(false);
        a.b(new o() { // from class: com.google.android.gms.common.internal.y.b
            @Override // com.google.android.gms.common.api.internal.o
            public final void a(Object obj, Object obj2) {
                t tVar2 = t.this;
                int i2 = d.m;
                ((a) ((e) obj).H()).J(tVar2);
                ((j) obj2).c(null);
            }
        });
        return c(a.a());
    }
}

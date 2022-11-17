package f.b.a.a.i;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.u;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.w;
import f.b.a.a.i.a0.e;
import f.b.a.a.i.w.b.b;
import i.a.a;
/* loaded from: classes.dex */
public final class v implements b<t> {
    private final a<f.b.a.a.i.c0.a> a;
    private final a<f.b.a.a.i.c0.a> b;
    private final a<e> c;

    /* renamed from: d  reason: collision with root package name */
    private final a<u> f2308d;

    /* renamed from: e  reason: collision with root package name */
    private final a<w> f2309e;

    public v(a<f.b.a.a.i.c0.a> aVar, a<f.b.a.a.i.c0.a> aVar2, a<e> aVar3, a<u> aVar4, a<w> aVar5) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f2308d = aVar4;
        this.f2309e = aVar5;
    }

    public static v b(a<f.b.a.a.i.c0.a> aVar, a<f.b.a.a.i.c0.a> aVar2, a<e> aVar3, a<u> aVar4, a<w> aVar5) {
        return new v(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static t d(f.b.a.a.i.c0.a aVar, f.b.a.a.i.c0.a aVar2, e eVar, u uVar, w wVar) {
        return new t(aVar, aVar2, eVar, uVar, wVar);
    }

    /* renamed from: c */
    public t a() {
        return d(this.a.a(), this.b.a(), this.c.a(), this.f2308d.a(), this.f2309e.a());
    }
}

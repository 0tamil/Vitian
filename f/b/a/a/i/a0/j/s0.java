package f.b.a.a.i.a0.j;

import f.b.a.a.i.w.b.b;
import i.a.a;
/* loaded from: classes.dex */
public final class s0 implements b<r0> {
    private final a<f.b.a.a.i.c0.a> a;
    private final a<f.b.a.a.i.c0.a> b;
    private final a<k0> c;

    /* renamed from: d  reason: collision with root package name */
    private final a<t0> f2274d;

    /* renamed from: e  reason: collision with root package name */
    private final a<String> f2275e;

    public s0(a<f.b.a.a.i.c0.a> aVar, a<f.b.a.a.i.c0.a> aVar2, a<k0> aVar3, a<t0> aVar4, a<String> aVar5) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f2274d = aVar4;
        this.f2275e = aVar5;
    }

    public static s0 b(a<f.b.a.a.i.c0.a> aVar, a<f.b.a.a.i.c0.a> aVar2, a<k0> aVar3, a<t0> aVar4, a<String> aVar5) {
        return new s0(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static r0 d(f.b.a.a.i.c0.a aVar, f.b.a.a.i.c0.a aVar2, Object obj, Object obj2, f.b.a.a.i.w.a<String> aVar3) {
        return new r0(aVar, aVar2, (k0) obj, (t0) obj2, aVar3);
    }

    /* renamed from: c */
    public r0 a() {
        return d(this.a.a(), this.b.a(), this.c.a(), this.f2274d.a(), f.b.a.a.i.w.b.a.b(this.f2275e));
    }
}

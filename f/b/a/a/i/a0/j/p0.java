package f.b.a.a.i.a0.j;

import f.b.a.a.i.w.b.b;
import f.b.a.a.i.w.b.d;
/* loaded from: classes.dex */
public final class p0 implements b<k0> {

    /* loaded from: classes.dex */
    private static final class a {
        private static final p0 a = new p0();
    }

    public static p0 b() {
        return a.a;
    }

    public static k0 d() {
        k0 d2 = l0.d();
        d.c(d2, "Cannot return null from a non-@Nullable @Provides method");
        return d2;
    }

    /* renamed from: c */
    public k0 a() {
        return d();
    }
}

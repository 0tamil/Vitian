package f.b.a.a.i.c0;

import f.b.a.a.i.w.b.b;
import f.b.a.a.i.w.b.d;
/* loaded from: classes.dex */
public final class c implements b<f.b.a.a.i.c0.a> {

    /* loaded from: classes.dex */
    private static final class a {
        private static final c a = new c();
    }

    public static c b() {
        return a.a;
    }

    public static f.b.a.a.i.c0.a c() {
        f.b.a.a.i.c0.a a2 = b.a();
        d.c(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    /* renamed from: d */
    public f.b.a.a.i.c0.a a() {
        return c();
    }
}

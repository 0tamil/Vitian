package f.b.a.a.i.c0;

import f.b.a.a.i.w.b.b;
/* loaded from: classes.dex */
public final class d implements b<f.b.a.a.i.c0.a> {

    /* loaded from: classes.dex */
    private static final class a {
        private static final d a = new d();
    }

    public static d b() {
        return a.a;
    }

    public static f.b.a.a.i.c0.a d() {
        f.b.a.a.i.c0.a b = b.b();
        f.b.a.a.i.w.b.d.c(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    /* renamed from: c */
    public f.b.a.a.i.c0.a a() {
        return d();
    }
}

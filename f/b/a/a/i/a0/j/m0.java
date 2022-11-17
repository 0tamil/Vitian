package f.b.a.a.i.a0.j;

import f.b.a.a.i.w.b.b;
import f.b.a.a.i.w.b.d;
/* loaded from: classes.dex */
public final class m0 implements b<String> {

    /* loaded from: classes.dex */
    private static final class a {
        private static final m0 a = new m0();
    }

    public static m0 b() {
        return a.a;
    }

    public static String c() {
        String a2 = l0.a();
        d.c(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    /* renamed from: d */
    public String a() {
        return c();
    }
}

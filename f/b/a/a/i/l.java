package f.b.a.a.i;

import f.b.a.a.i.w.b.b;
import f.b.a.a.i.w.b.d;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class l implements b<Executor> {

    /* loaded from: classes.dex */
    private static final class a {
        private static final l a = new l();
    }

    public static l b() {
        return a.a;
    }

    public static Executor c() {
        Executor a2 = k.a();
        d.c(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    /* renamed from: d */
    public Executor a() {
        return c();
    }
}

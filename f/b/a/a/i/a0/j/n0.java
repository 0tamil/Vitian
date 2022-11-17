package f.b.a.a.i.a0.j;

import android.content.Context;
import f.b.a.a.i.w.b.b;
import f.b.a.a.i.w.b.d;
import i.a.a;
/* loaded from: classes.dex */
public final class n0 implements b<String> {
    private final a<Context> a;

    public n0(a<Context> aVar) {
        this.a = aVar;
    }

    public static n0 b(a<Context> aVar) {
        return new n0(aVar);
    }

    public static String d(Context context) {
        String b = l0.b(context);
        d.c(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    /* renamed from: c */
    public String a() {
        return d(this.a.a());
    }
}

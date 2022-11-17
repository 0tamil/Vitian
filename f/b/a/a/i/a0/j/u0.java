package f.b.a.a.i.a0.j;

import android.content.Context;
import f.b.a.a.i.w.b.b;
import i.a.a;
/* loaded from: classes.dex */
public final class u0 implements b<t0> {
    private final a<Context> a;
    private final a<String> b;
    private final a<Integer> c;

    public u0(a<Context> aVar, a<String> aVar2, a<Integer> aVar3) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
    }

    public static u0 b(a<Context> aVar, a<String> aVar2, a<Integer> aVar3) {
        return new u0(aVar, aVar2, aVar3);
    }

    public static t0 d(Context context, String str, int i2) {
        return new t0(context, str, i2);
    }

    /* renamed from: c */
    public t0 a() {
        return d(this.a.a(), this.b.a(), this.c.a().intValue());
    }
}

package f.b.a.a.i.a0;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.t;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.y;
import f.b.a.a.i.a0.j.j0;
import f.b.a.a.i.w.b.b;
import f.b.a.a.i.w.b.d;
import i.a.a;
/* loaded from: classes.dex */
public final class i implements b<y> {
    private final a<Context> a;
    private final a<j0> b;
    private final a<t> c;

    /* renamed from: d  reason: collision with root package name */
    private final a<f.b.a.a.i.c0.a> f2261d;

    public i(a<Context> aVar, a<j0> aVar2, a<t> aVar3, a<f.b.a.a.i.c0.a> aVar4) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f2261d = aVar4;
    }

    public static i b(a<Context> aVar, a<j0> aVar2, a<t> aVar3, a<f.b.a.a.i.c0.a> aVar4) {
        return new i(aVar, aVar2, aVar3, aVar4);
    }

    public static y d(Context context, j0 j0Var, t tVar, f.b.a.a.i.c0.a aVar) {
        y a = h.a(context, j0Var, tVar, aVar);
        d.c(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    /* renamed from: c */
    public y a() {
        return d(this.a.a(), this.b.a(), this.c.a(), this.f2261d.a());
    }
}

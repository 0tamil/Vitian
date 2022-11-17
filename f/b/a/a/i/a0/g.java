package f.b.a.a.i.a0;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.t;
import f.b.a.a.i.w.b.b;
import f.b.a.a.i.w.b.d;
import i.a.a;
/* loaded from: classes.dex */
public final class g implements b<t> {
    private final a<f.b.a.a.i.c0.a> a;

    public g(a<f.b.a.a.i.c0.a> aVar) {
        this.a = aVar;
    }

    public static t b(f.b.a.a.i.c0.a aVar) {
        t a = f.a(aVar);
        d.c(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public static g c(a<f.b.a.a.i.c0.a> aVar) {
        return new g(aVar);
    }

    /* renamed from: d */
    public t a() {
        return b(this.a.a());
    }
}

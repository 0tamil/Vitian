package f.b.a.a.i.a0;

import com.google.android.datatransport.runtime.backends.e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.y;
import f.b.a.a.i.a0.j.j0;
import f.b.a.a.i.w.b.b;
import i.a.a;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class d implements b<c> {
    private final a<Executor> a;
    private final a<e> b;
    private final a<y> c;

    /* renamed from: d  reason: collision with root package name */
    private final a<j0> f2259d;

    /* renamed from: e  reason: collision with root package name */
    private final a<f.b.a.a.i.b0.b> f2260e;

    public d(a<Executor> aVar, a<e> aVar2, a<y> aVar3, a<j0> aVar4, a<f.b.a.a.i.b0.b> aVar5) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f2259d = aVar4;
        this.f2260e = aVar5;
    }

    public static d b(a<Executor> aVar, a<e> aVar2, a<y> aVar3, a<j0> aVar4, a<f.b.a.a.i.b0.b> aVar5) {
        return new d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static c d(Executor executor, e eVar, y yVar, j0 j0Var, f.b.a.a.i.b0.b bVar) {
        return new c(executor, eVar, yVar, j0Var, bVar);
    }

    /* renamed from: c */
    public c a() {
        return d(this.a.a(), this.b.a(), this.c.a(), this.f2259d.a(), this.f2260e.a());
    }
}

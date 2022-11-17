package f.b.a.a.i;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.u;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.w;
import f.b.a.a.b;
import f.b.a.a.g;
import f.b.a.a.h;
import f.b.a.a.i.a0.e;
import f.b.a.a.i.c0.a;
import f.b.a.a.i.j;
import f.b.a.a.i.p;
import f.b.a.a.i.u;
import java.util.Collections;
import java.util.Set;
/* loaded from: classes.dex */
public class t implements s {

    /* renamed from: e  reason: collision with root package name */
    private static volatile u f2306e;
    private final a a;
    private final a b;
    private final e c;

    /* renamed from: d  reason: collision with root package name */
    private final u f2307d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(a aVar, a aVar2, e eVar, u uVar, w wVar) {
        this.a = aVar;
        this.b = aVar2;
        this.c = eVar;
        this.f2307d = uVar;
        wVar.a();
    }

    private j b(o oVar) {
        j.a a = j.a();
        a.i(this.a.a());
        a.k(this.b.a());
        a.j(oVar.g());
        a.h(new i(oVar.b(), oVar.d()));
        a.g(oVar.c().a());
        return a.d();
    }

    public static t c() {
        u uVar = f2306e;
        if (uVar != null) {
            return uVar.c();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set<b> d(g gVar) {
        return gVar instanceof h ? Collections.unmodifiableSet(((h) gVar).b()) : Collections.singleton(b.b("proto"));
    }

    public static void f(Context context) {
        if (f2306e == null) {
            synchronized (t.class) {
                if (f2306e == null) {
                    u.a d2 = f.d();
                    d2.b(context);
                    f2306e = d2.a();
                }
            }
        }
    }

    @Override // f.b.a.a.i.s
    public void a(o oVar, h hVar) {
        this.c.a(oVar.f().f(oVar.c().c()), b(oVar), hVar);
    }

    public com.google.android.datatransport.runtime.scheduling.jobscheduling.u e() {
        return this.f2307d;
    }

    public g g(g gVar) {
        Set<b> d2 = d(gVar);
        p.a a = p.a();
        a.b(gVar.c());
        a.c(gVar.a());
        return new q(d2, a.a(), this);
    }
}

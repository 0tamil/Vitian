package f.b.a.a.i;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.j;
import com.google.android.datatransport.runtime.backends.l;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.t;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.u;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.v;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.w;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.x;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.y;
import f.b.a.a.i.a0.c;
import f.b.a.a.i.a0.g;
import f.b.a.a.i.a0.i;
import f.b.a.a.i.a0.j.j0;
import f.b.a.a.i.a0.j.m0;
import f.b.a.a.i.a0.j.n0;
import f.b.a.a.i.a0.j.o0;
import f.b.a.a.i.a0.j.p0;
import f.b.a.a.i.a0.j.r0;
import f.b.a.a.i.a0.j.s0;
import f.b.a.a.i.a0.j.u0;
import f.b.a.a.i.u;
import f.b.a.a.i.w.b.d;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f extends u {

    /* renamed from: e  reason: collision with root package name */
    private i.a.a<Executor> f2295e;

    /* renamed from: f  reason: collision with root package name */
    private i.a.a<Context> f2296f;

    /* renamed from: g  reason: collision with root package name */
    private i.a.a f2297g;

    /* renamed from: h  reason: collision with root package name */
    private i.a.a f2298h;

    /* renamed from: i  reason: collision with root package name */
    private i.a.a f2299i;

    /* renamed from: j  reason: collision with root package name */
    private i.a.a<String> f2300j;

    /* renamed from: k  reason: collision with root package name */
    private i.a.a<r0> f2301k;
    private i.a.a<t> l;
    private i.a.a<y> m;
    private i.a.a<c> n;
    private i.a.a<u> o;
    private i.a.a<w> p;
    private i.a.a<t> q;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b implements u.a {
        private Context a;

        private b() {
        }

        @Override // f.b.a.a.i.u.a
        public u a() {
            d.a(this.a, Context.class);
            return new f(this.a);
        }

        @Override // f.b.a.a.i.u.a
        public /* bridge */ /* synthetic */ u.a b(Context context) {
            c(context);
            return this;
        }

        public b c(Context context) {
            d.b(context);
            this.a = context;
            return this;
        }
    }

    private f(Context context) {
        f(context);
    }

    public static u.a d() {
        return new b();
    }

    private void f(Context context) {
        this.f2295e = f.b.a.a.i.w.b.a.c(l.b());
        f.b.a.a.i.w.b.b b2 = f.b.a.a.i.w.b.c.b(context);
        this.f2296f = b2;
        j b3 = j.b(b2, f.b.a.a.i.c0.c.b(), f.b.a.a.i.c0.d.b());
        this.f2297g = b3;
        this.f2298h = f.b.a.a.i.w.b.a.c(l.b(this.f2296f, b3));
        this.f2299i = u0.b(this.f2296f, m0.b(), o0.b());
        this.f2300j = n0.b(this.f2296f);
        this.f2301k = f.b.a.a.i.w.b.a.c(s0.b(f.b.a.a.i.c0.c.b(), f.b.a.a.i.c0.d.b(), p0.b(), this.f2299i, this.f2300j));
        g c = g.c(f.b.a.a.i.c0.c.b());
        this.l = c;
        i b4 = i.b(this.f2296f, this.f2301k, c, f.b.a.a.i.c0.d.b());
        this.m = b4;
        i.a.a<Executor> aVar = this.f2295e;
        i.a.a aVar2 = this.f2298h;
        i.a.a<r0> aVar3 = this.f2301k;
        this.n = f.b.a.a.i.a0.d.b(aVar, aVar2, b4, aVar3, aVar3);
        i.a.a<Context> aVar4 = this.f2296f;
        i.a.a aVar5 = this.f2298h;
        i.a.a<r0> aVar6 = this.f2301k;
        this.o = v.b(aVar4, aVar5, aVar6, this.m, this.f2295e, aVar6, f.b.a.a.i.c0.c.b(), f.b.a.a.i.c0.d.b(), this.f2301k);
        i.a.a<Executor> aVar7 = this.f2295e;
        i.a.a<r0> aVar8 = this.f2301k;
        this.p = x.b(aVar7, aVar8, this.m, aVar8);
        this.q = f.b.a.a.i.w.b.a.c(v.b(f.b.a.a.i.c0.c.b(), f.b.a.a.i.c0.d.b(), this.n, this.o, this.p));
    }

    @Override // f.b.a.a.i.u
    j0 b() {
        return this.f2301k.a();
    }

    @Override // f.b.a.a.i.u
    t c() {
        return this.q.a();
    }
}

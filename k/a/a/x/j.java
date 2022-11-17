package k.a.a.x;

import k.a.a.q;
import k.a.a.r;
import k.a.a.u.h;
/* loaded from: classes.dex */
public final class j {
    static final k<q> a = new a();
    static final k<h> b = new b();
    static final k<l> c = new c();

    /* renamed from: d  reason: collision with root package name */
    static final k<q> f3733d = new d();

    /* renamed from: e  reason: collision with root package name */
    static final k<r> f3734e = new e();

    /* renamed from: f  reason: collision with root package name */
    static final k<k.a.a.f> f3735f = new f();

    /* renamed from: g  reason: collision with root package name */
    static final k<k.a.a.h> f3736g = new g();

    /* loaded from: classes.dex */
    class a implements k<q> {
        a() {
        }

        /* renamed from: b */
        public q a(k.a.a.x.e eVar) {
            return (q) eVar.g(this);
        }
    }

    /* loaded from: classes.dex */
    class b implements k<h> {
        b() {
        }

        /* renamed from: b */
        public h a(k.a.a.x.e eVar) {
            return (h) eVar.g(this);
        }
    }

    /* loaded from: classes.dex */
    class c implements k<l> {
        c() {
        }

        /* renamed from: b */
        public l a(k.a.a.x.e eVar) {
            return (l) eVar.g(this);
        }
    }

    /* loaded from: classes.dex */
    class d implements k<q> {
        d() {
        }

        /* renamed from: b */
        public q a(k.a.a.x.e eVar) {
            q qVar = (q) eVar.g(j.a);
            return qVar != null ? qVar : (q) eVar.g(j.f3734e);
        }
    }

    /* loaded from: classes.dex */
    class e implements k<r> {
        e() {
        }

        /* renamed from: b */
        public r a(k.a.a.x.e eVar) {
            k.a.a.x.a aVar = k.a.a.x.a.OFFSET_SECONDS;
            if (eVar.j(aVar)) {
                return r.B(eVar.e(aVar));
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    class f implements k<k.a.a.f> {
        f() {
        }

        /* renamed from: b */
        public k.a.a.f a(k.a.a.x.e eVar) {
            k.a.a.x.a aVar = k.a.a.x.a.EPOCH_DAY;
            if (eVar.j(aVar)) {
                return k.a.a.f.a0(eVar.l(aVar));
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    class g implements k<k.a.a.h> {
        g() {
        }

        /* renamed from: b */
        public k.a.a.h a(k.a.a.x.e eVar) {
            k.a.a.x.a aVar = k.a.a.x.a.NANO_OF_DAY;
            if (eVar.j(aVar)) {
                return k.a.a.h.G(eVar.l(aVar));
            }
            return null;
        }
    }

    public static final k<h> a() {
        return b;
    }

    public static final k<k.a.a.f> b() {
        return f3735f;
    }

    public static final k<k.a.a.h> c() {
        return f3736g;
    }

    public static final k<r> d() {
        return f3734e;
    }

    public static final k<l> e() {
        return c;
    }

    public static final k<q> f() {
        return f3733d;
    }

    public static final k<q> g() {
        return a;
    }
}

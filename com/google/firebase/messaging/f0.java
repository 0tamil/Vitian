package com.google.firebase.messaging;

import com.google.firebase.n.c;
import com.google.firebase.n.d;
import com.google.firebase.n.e;
/* loaded from: classes.dex */
public final class f0 implements com.google.firebase.n.h.a {
    public static final com.google.firebase.n.h.a a = new f0();

    /* loaded from: classes.dex */
    private static final class a implements d<com.google.firebase.messaging.l1.a> {
        static final a a = new a();
        private static final com.google.firebase.n.c b;
        private static final com.google.firebase.n.c c;

        /* renamed from: d  reason: collision with root package name */
        private static final com.google.firebase.n.c f1742d;

        /* renamed from: e  reason: collision with root package name */
        private static final com.google.firebase.n.c f1743e;

        /* renamed from: f  reason: collision with root package name */
        private static final com.google.firebase.n.c f1744f;

        /* renamed from: g  reason: collision with root package name */
        private static final com.google.firebase.n.c f1745g;

        /* renamed from: h  reason: collision with root package name */
        private static final com.google.firebase.n.c f1746h;

        /* renamed from: i  reason: collision with root package name */
        private static final com.google.firebase.n.c f1747i;

        /* renamed from: j  reason: collision with root package name */
        private static final com.google.firebase.n.c f1748j;

        /* renamed from: k  reason: collision with root package name */
        private static final com.google.firebase.n.c f1749k;
        private static final com.google.firebase.n.c l;
        private static final com.google.firebase.n.c m;
        private static final com.google.firebase.n.c n;
        private static final com.google.firebase.n.c o;
        private static final com.google.firebase.n.c p;

        static {
            c.b a2 = com.google.firebase.n.c.a("projectNumber");
            com.google.firebase.n.j.c b2 = com.google.firebase.n.j.c.b();
            b2.c(1);
            a2.b(b2.a());
            b = a2.a();
            c.b a3 = com.google.firebase.n.c.a("messageId");
            com.google.firebase.n.j.c b3 = com.google.firebase.n.j.c.b();
            b3.c(2);
            a3.b(b3.a());
            c = a3.a();
            c.b a4 = com.google.firebase.n.c.a("instanceId");
            com.google.firebase.n.j.c b4 = com.google.firebase.n.j.c.b();
            b4.c(3);
            a4.b(b4.a());
            f1742d = a4.a();
            c.b a5 = com.google.firebase.n.c.a("messageType");
            com.google.firebase.n.j.c b5 = com.google.firebase.n.j.c.b();
            b5.c(4);
            a5.b(b5.a());
            f1743e = a5.a();
            c.b a6 = com.google.firebase.n.c.a("sdkPlatform");
            com.google.firebase.n.j.c b6 = com.google.firebase.n.j.c.b();
            b6.c(5);
            a6.b(b6.a());
            f1744f = a6.a();
            c.b a7 = com.google.firebase.n.c.a("packageName");
            com.google.firebase.n.j.c b7 = com.google.firebase.n.j.c.b();
            b7.c(6);
            a7.b(b7.a());
            f1745g = a7.a();
            c.b a8 = com.google.firebase.n.c.a("collapseKey");
            com.google.firebase.n.j.c b8 = com.google.firebase.n.j.c.b();
            b8.c(7);
            a8.b(b8.a());
            f1746h = a8.a();
            c.b a9 = com.google.firebase.n.c.a("priority");
            com.google.firebase.n.j.c b9 = com.google.firebase.n.j.c.b();
            b9.c(8);
            a9.b(b9.a());
            f1747i = a9.a();
            c.b a10 = com.google.firebase.n.c.a("ttl");
            com.google.firebase.n.j.c b10 = com.google.firebase.n.j.c.b();
            b10.c(9);
            a10.b(b10.a());
            f1748j = a10.a();
            c.b a11 = com.google.firebase.n.c.a("topic");
            com.google.firebase.n.j.c b11 = com.google.firebase.n.j.c.b();
            b11.c(10);
            a11.b(b11.a());
            f1749k = a11.a();
            c.b a12 = com.google.firebase.n.c.a("bulkId");
            com.google.firebase.n.j.c b12 = com.google.firebase.n.j.c.b();
            b12.c(11);
            a12.b(b12.a());
            l = a12.a();
            c.b a13 = com.google.firebase.n.c.a("event");
            com.google.firebase.n.j.c b13 = com.google.firebase.n.j.c.b();
            b13.c(12);
            a13.b(b13.a());
            m = a13.a();
            c.b a14 = com.google.firebase.n.c.a("analyticsLabel");
            com.google.firebase.n.j.c b14 = com.google.firebase.n.j.c.b();
            b14.c(13);
            a14.b(b14.a());
            n = a14.a();
            c.b a15 = com.google.firebase.n.c.a("campaignId");
            com.google.firebase.n.j.c b15 = com.google.firebase.n.j.c.b();
            b15.c(14);
            a15.b(b15.a());
            o = a15.a();
            c.b a16 = com.google.firebase.n.c.a("composerLabel");
            com.google.firebase.n.j.c b16 = com.google.firebase.n.j.c.b();
            b16.c(15);
            a16.b(b16.a());
            p = a16.a();
        }

        private a() {
        }

        /* renamed from: b */
        public void a(com.google.firebase.messaging.l1.a aVar, e eVar) {
            eVar.d(b, aVar.l());
            eVar.f(c, aVar.h());
            eVar.f(f1742d, aVar.g());
            eVar.f(f1743e, aVar.i());
            eVar.f(f1744f, aVar.m());
            eVar.f(f1745g, aVar.j());
            eVar.f(f1746h, aVar.d());
            eVar.e(f1747i, aVar.k());
            eVar.e(f1748j, aVar.o());
            eVar.f(f1749k, aVar.n());
            eVar.d(l, aVar.b());
            eVar.f(m, aVar.f());
            eVar.f(n, aVar.a());
            eVar.d(o, aVar.c());
            eVar.f(p, aVar.e());
        }
    }

    /* loaded from: classes.dex */
    private static final class b implements d<com.google.firebase.messaging.l1.b> {
        static final b a = new b();
        private static final com.google.firebase.n.c b;

        static {
            c.b a2 = com.google.firebase.n.c.a("messagingClientEvent");
            com.google.firebase.n.j.c b2 = com.google.firebase.n.j.c.b();
            b2.c(1);
            a2.b(b2.a());
            b = a2.a();
        }

        private b() {
        }

        /* renamed from: b */
        public void a(com.google.firebase.messaging.l1.b bVar, e eVar) {
            eVar.f(b, bVar.a());
        }
    }

    /* loaded from: classes.dex */
    private static final class c implements d<t0> {
        static final c a = new c();
        private static final com.google.firebase.n.c b = com.google.firebase.n.c.d("messagingClientEventExtension");

        private c() {
        }

        /* renamed from: b */
        public void a(t0 t0Var, e eVar) {
            eVar.f(b, t0Var.b());
        }
    }

    private f0() {
    }

    @Override // com.google.firebase.n.h.a
    public void a(com.google.firebase.n.h.b<?> bVar) {
        bVar.a(t0.class, c.a);
        bVar.a(com.google.firebase.messaging.l1.b.class, b.a);
        bVar.a(com.google.firebase.messaging.l1.a.class, a.a);
    }
}

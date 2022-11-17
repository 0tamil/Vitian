package com.google.firebase.messaging.l1;

import com.google.firebase.n.j.e;
import com.google.firebase.n.j.f;
/* loaded from: classes.dex */
public final class a {
    private final long a;
    private final String b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final c f1778d;

    /* renamed from: e  reason: collision with root package name */
    private final d f1779e;

    /* renamed from: f  reason: collision with root package name */
    private final String f1780f;

    /* renamed from: g  reason: collision with root package name */
    private final String f1781g;

    /* renamed from: h  reason: collision with root package name */
    private final int f1782h;

    /* renamed from: i  reason: collision with root package name */
    private final int f1783i;

    /* renamed from: j  reason: collision with root package name */
    private final String f1784j;

    /* renamed from: k  reason: collision with root package name */
    private final long f1785k;
    private final b l;
    private final String m;
    private final long n;
    private final String o;

    /* renamed from: com.google.firebase.messaging.l1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0055a {
        private long a = 0;
        private String b = "";
        private String c = "";

        /* renamed from: d  reason: collision with root package name */
        private c f1786d = c.UNKNOWN;

        /* renamed from: e  reason: collision with root package name */
        private d f1787e = d.UNKNOWN_OS;

        /* renamed from: f  reason: collision with root package name */
        private String f1788f = "";

        /* renamed from: g  reason: collision with root package name */
        private String f1789g = "";

        /* renamed from: h  reason: collision with root package name */
        private int f1790h = 0;

        /* renamed from: i  reason: collision with root package name */
        private int f1791i = 0;

        /* renamed from: j  reason: collision with root package name */
        private String f1792j = "";

        /* renamed from: k  reason: collision with root package name */
        private long f1793k = 0;
        private b l = b.UNKNOWN_EVENT;
        private String m = "";
        private long n = 0;
        private String o = "";

        C0055a() {
        }

        public a a() {
            return new a(this.a, this.b, this.c, this.f1786d, this.f1787e, this.f1788f, this.f1789g, this.f1790h, this.f1791i, this.f1792j, this.f1793k, this.l, this.m, this.n, this.o);
        }

        public C0055a b(String str) {
            this.m = str;
            return this;
        }

        public C0055a c(String str) {
            this.f1789g = str;
            return this;
        }

        public C0055a d(String str) {
            this.o = str;
            return this;
        }

        public C0055a e(b bVar) {
            this.l = bVar;
            return this;
        }

        public C0055a f(String str) {
            this.c = str;
            return this;
        }

        public C0055a g(String str) {
            this.b = str;
            return this;
        }

        public C0055a h(c cVar) {
            this.f1786d = cVar;
            return this;
        }

        public C0055a i(String str) {
            this.f1788f = str;
            return this;
        }

        public C0055a j(long j2) {
            this.a = j2;
            return this;
        }

        public C0055a k(d dVar) {
            this.f1787e = dVar;
            return this;
        }

        public C0055a l(String str) {
            this.f1792j = str;
            return this;
        }

        public C0055a m(int i2) {
            this.f1791i = i2;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public enum b implements e {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);
        

        /* renamed from: e  reason: collision with root package name */
        private final int f1798e;

        b(int i2) {
            this.f1798e = i2;
        }

        @Override // com.google.firebase.n.j.e
        public int b() {
            return this.f1798e;
        }
    }

    /* loaded from: classes.dex */
    public enum c implements e {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);
        

        /* renamed from: e  reason: collision with root package name */
        private final int f1804e;

        c(int i2) {
            this.f1804e = i2;
        }

        @Override // com.google.firebase.n.j.e
        public int b() {
            return this.f1804e;
        }
    }

    /* loaded from: classes.dex */
    public enum d implements e {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);
        

        /* renamed from: e  reason: collision with root package name */
        private final int f1810e;

        d(int i2) {
            this.f1810e = i2;
        }

        @Override // com.google.firebase.n.j.e
        public int b() {
            return this.f1810e;
        }
    }

    static {
        new C0055a().a();
    }

    a(long j2, String str, String str2, c cVar, d dVar, String str3, String str4, int i2, int i3, String str5, long j3, b bVar, String str6, long j4, String str7) {
        this.a = j2;
        this.b = str;
        this.c = str2;
        this.f1778d = cVar;
        this.f1779e = dVar;
        this.f1780f = str3;
        this.f1781g = str4;
        this.f1782h = i2;
        this.f1783i = i3;
        this.f1784j = str5;
        this.f1785k = j3;
        this.l = bVar;
        this.m = str6;
        this.n = j4;
        this.o = str7;
    }

    public static C0055a p() {
        return new C0055a();
    }

    @f(tag = 13)
    public String a() {
        return this.m;
    }

    @f(tag = 11)
    public long b() {
        return this.f1785k;
    }

    @f(tag = 14)
    public long c() {
        return this.n;
    }

    @f(tag = 7)
    public String d() {
        return this.f1781g;
    }

    @f(tag = 15)
    public String e() {
        return this.o;
    }

    @f(tag = 12)
    public b f() {
        return this.l;
    }

    @f(tag = 3)
    public String g() {
        return this.c;
    }

    @f(tag = 2)
    public String h() {
        return this.b;
    }

    @f(tag = 4)
    public c i() {
        return this.f1778d;
    }

    @f(tag = 6)
    public String j() {
        return this.f1780f;
    }

    @f(tag = 8)
    public int k() {
        return this.f1782h;
    }

    @f(tag = 1)
    public long l() {
        return this.a;
    }

    @f(tag = 5)
    public d m() {
        return this.f1779e;
    }

    @f(tag = 10)
    public String n() {
        return this.f1784j;
    }

    @f(tag = 9)
    public int o() {
        return this.f1783i;
    }
}

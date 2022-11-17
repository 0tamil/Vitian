package com.google.firebase.crashlytics.i.l;

import com.google.firebase.crashlytics.i.l.a0;
import java.util.Objects;
/* loaded from: classes.dex */
final class g extends a0.e {
    private final String a;
    private final String b;
    private final long c;

    /* renamed from: d  reason: collision with root package name */
    private final Long f1536d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f1537e;

    /* renamed from: f  reason: collision with root package name */
    private final a0.e.a f1538f;

    /* renamed from: g  reason: collision with root package name */
    private final a0.e.f f1539g;

    /* renamed from: h  reason: collision with root package name */
    private final a0.e.AbstractC0048e f1540h;

    /* renamed from: i  reason: collision with root package name */
    private final a0.e.c f1541i;

    /* renamed from: j  reason: collision with root package name */
    private final b0<a0.e.d> f1542j;

    /* renamed from: k  reason: collision with root package name */
    private final int f1543k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends a0.e.b {
        private String a;
        private String b;
        private Long c;

        /* renamed from: d  reason: collision with root package name */
        private Long f1544d;

        /* renamed from: e  reason: collision with root package name */
        private Boolean f1545e;

        /* renamed from: f  reason: collision with root package name */
        private a0.e.a f1546f;

        /* renamed from: g  reason: collision with root package name */
        private a0.e.f f1547g;

        /* renamed from: h  reason: collision with root package name */
        private a0.e.AbstractC0048e f1548h;

        /* renamed from: i  reason: collision with root package name */
        private a0.e.c f1549i;

        /* renamed from: j  reason: collision with root package name */
        private b0<a0.e.d> f1550j;

        /* renamed from: k  reason: collision with root package name */
        private Integer f1551k;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(a0.e eVar) {
            this.a = eVar.f();
            this.b = eVar.h();
            this.c = Long.valueOf(eVar.k());
            this.f1544d = eVar.d();
            this.f1545e = Boolean.valueOf(eVar.m());
            this.f1546f = eVar.b();
            this.f1547g = eVar.l();
            this.f1548h = eVar.j();
            this.f1549i = eVar.c();
            this.f1550j = eVar.e();
            this.f1551k = Integer.valueOf(eVar.g());
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.b
        public a0.e a() {
            String str = "";
            if (this.a == null) {
                str = str + " generator";
            }
            if (this.b == null) {
                str = str + " identifier";
            }
            if (this.c == null) {
                str = str + " startedAt";
            }
            if (this.f1545e == null) {
                str = str + " crashed";
            }
            if (this.f1546f == null) {
                str = str + " app";
            }
            if (this.f1551k == null) {
                str = str + " generatorType";
            }
            if (str.isEmpty()) {
                return new g(this.a, this.b, this.c.longValue(), this.f1544d, this.f1545e.booleanValue(), this.f1546f, this.f1547g, this.f1548h, this.f1549i, this.f1550j, this.f1551k.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.b
        public a0.e.b b(a0.e.a aVar) {
            Objects.requireNonNull(aVar, "Null app");
            this.f1546f = aVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.b
        public a0.e.b c(boolean z) {
            this.f1545e = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.b
        public a0.e.b d(a0.e.c cVar) {
            this.f1549i = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.b
        public a0.e.b e(Long l) {
            this.f1544d = l;
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.b
        public a0.e.b f(b0<a0.e.d> b0Var) {
            this.f1550j = b0Var;
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.b
        public a0.e.b g(String str) {
            Objects.requireNonNull(str, "Null generator");
            this.a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.b
        public a0.e.b h(int i2) {
            this.f1551k = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.b
        public a0.e.b i(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.b
        public a0.e.b k(a0.e.AbstractC0048e eVar) {
            this.f1548h = eVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.b
        public a0.e.b l(long j2) {
            this.c = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.b
        public a0.e.b m(a0.e.f fVar) {
            this.f1547g = fVar;
            return this;
        }
    }

    private g(String str, String str2, long j2, Long l, boolean z, a0.e.a aVar, a0.e.f fVar, a0.e.AbstractC0048e eVar, a0.e.c cVar, b0<a0.e.d> b0Var, int i2) {
        this.a = str;
        this.b = str2;
        this.c = j2;
        this.f1536d = l;
        this.f1537e = z;
        this.f1538f = aVar;
        this.f1539g = fVar;
        this.f1540h = eVar;
        this.f1541i = cVar;
        this.f1542j = b0Var;
        this.f1543k = i2;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e
    public a0.e.a b() {
        return this.f1538f;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e
    public a0.e.c c() {
        return this.f1541i;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e
    public Long d() {
        return this.f1536d;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e
    public b0<a0.e.d> e() {
        return this.f1542j;
    }

    public boolean equals(Object obj) {
        Long l;
        a0.e.f fVar;
        a0.e.AbstractC0048e eVar;
        a0.e.c cVar;
        b0<a0.e.d> b0Var;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e)) {
            return false;
        }
        a0.e eVar2 = (a0.e) obj;
        return this.a.equals(eVar2.f()) && this.b.equals(eVar2.h()) && this.c == eVar2.k() && ((l = this.f1536d) != null ? l.equals(eVar2.d()) : eVar2.d() == null) && this.f1537e == eVar2.m() && this.f1538f.equals(eVar2.b()) && ((fVar = this.f1539g) != null ? fVar.equals(eVar2.l()) : eVar2.l() == null) && ((eVar = this.f1540h) != null ? eVar.equals(eVar2.j()) : eVar2.j() == null) && ((cVar = this.f1541i) != null ? cVar.equals(eVar2.c()) : eVar2.c() == null) && ((b0Var = this.f1542j) != null ? b0Var.equals(eVar2.e()) : eVar2.e() == null) && this.f1543k == eVar2.g();
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e
    public String f() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e
    public int g() {
        return this.f1543k;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e
    public String h() {
        return this.b;
    }

    public int hashCode() {
        long j2 = this.c;
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        Long l = this.f1536d;
        int i2 = 0;
        int hashCode2 = (((((hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f1537e ? 1231 : 1237)) * 1000003) ^ this.f1538f.hashCode()) * 1000003;
        a0.e.f fVar = this.f1539g;
        int hashCode3 = (hashCode2 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        a0.e.AbstractC0048e eVar = this.f1540h;
        int hashCode4 = (hashCode3 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        a0.e.c cVar = this.f1541i;
        int hashCode5 = (hashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        b0<a0.e.d> b0Var = this.f1542j;
        if (b0Var != null) {
            i2 = b0Var.hashCode();
        }
        return ((hashCode5 ^ i2) * 1000003) ^ this.f1543k;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e
    public a0.e.AbstractC0048e j() {
        return this.f1540h;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e
    public long k() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e
    public a0.e.f l() {
        return this.f1539g;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e
    public boolean m() {
        return this.f1537e;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e
    public a0.e.b n() {
        return new b(this);
    }

    public String toString() {
        return "Session{generator=" + this.a + ", identifier=" + this.b + ", startedAt=" + this.c + ", endedAt=" + this.f1536d + ", crashed=" + this.f1537e + ", app=" + this.f1538f + ", user=" + this.f1539g + ", os=" + this.f1540h + ", device=" + this.f1541i + ", events=" + this.f1542j + ", generatorType=" + this.f1543k + "}";
    }
}

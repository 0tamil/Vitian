package com.google.firebase.crashlytics.i.l;

import com.google.firebase.crashlytics.i.l.a0;
import java.util.Objects;
/* loaded from: classes.dex */
final class b extends a0 {
    private final String b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1514d;

    /* renamed from: e  reason: collision with root package name */
    private final String f1515e;

    /* renamed from: f  reason: collision with root package name */
    private final String f1516f;

    /* renamed from: g  reason: collision with root package name */
    private final String f1517g;

    /* renamed from: h  reason: collision with root package name */
    private final a0.e f1518h;

    /* renamed from: i  reason: collision with root package name */
    private final a0.d f1519i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.crashlytics.i.l.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0049b extends a0.b {
        private String a;
        private String b;
        private Integer c;

        /* renamed from: d  reason: collision with root package name */
        private String f1520d;

        /* renamed from: e  reason: collision with root package name */
        private String f1521e;

        /* renamed from: f  reason: collision with root package name */
        private String f1522f;

        /* renamed from: g  reason: collision with root package name */
        private a0.e f1523g;

        /* renamed from: h  reason: collision with root package name */
        private a0.d f1524h;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0049b() {
        }

        private C0049b(a0 a0Var) {
            this.a = a0Var.i();
            this.b = a0Var.e();
            this.c = Integer.valueOf(a0Var.h());
            this.f1520d = a0Var.f();
            this.f1521e = a0Var.c();
            this.f1522f = a0Var.d();
            this.f1523g = a0Var.j();
            this.f1524h = a0Var.g();
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.b
        public a0 a() {
            String str = "";
            if (this.a == null) {
                str = str + " sdkVersion";
            }
            if (this.b == null) {
                str = str + " gmpAppId";
            }
            if (this.c == null) {
                str = str + " platform";
            }
            if (this.f1520d == null) {
                str = str + " installationUuid";
            }
            if (this.f1521e == null) {
                str = str + " buildVersion";
            }
            if (this.f1522f == null) {
                str = str + " displayVersion";
            }
            if (str.isEmpty()) {
                return new b(this.a, this.b, this.c.intValue(), this.f1520d, this.f1521e, this.f1522f, this.f1523g, this.f1524h);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.b
        public a0.b b(String str) {
            Objects.requireNonNull(str, "Null buildVersion");
            this.f1521e = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.b
        public a0.b c(String str) {
            Objects.requireNonNull(str, "Null displayVersion");
            this.f1522f = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.b
        public a0.b d(String str) {
            Objects.requireNonNull(str, "Null gmpAppId");
            this.b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.b
        public a0.b e(String str) {
            Objects.requireNonNull(str, "Null installationUuid");
            this.f1520d = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.b
        public a0.b f(a0.d dVar) {
            this.f1524h = dVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.b
        public a0.b g(int i2) {
            this.c = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.b
        public a0.b h(String str) {
            Objects.requireNonNull(str, "Null sdkVersion");
            this.a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.b
        public a0.b i(a0.e eVar) {
            this.f1523g = eVar;
            return this;
        }
    }

    private b(String str, String str2, int i2, String str3, String str4, String str5, a0.e eVar, a0.d dVar) {
        this.b = str;
        this.c = str2;
        this.f1514d = i2;
        this.f1515e = str3;
        this.f1516f = str4;
        this.f1517g = str5;
        this.f1518h = eVar;
        this.f1519i = dVar;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0
    public String c() {
        return this.f1516f;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0
    public String d() {
        return this.f1517g;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0
    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        a0.e eVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (this.b.equals(a0Var.i()) && this.c.equals(a0Var.e()) && this.f1514d == a0Var.h() && this.f1515e.equals(a0Var.f()) && this.f1516f.equals(a0Var.c()) && this.f1517g.equals(a0Var.d()) && ((eVar = this.f1518h) != null ? eVar.equals(a0Var.j()) : a0Var.j() == null)) {
            a0.d dVar = this.f1519i;
            a0.d g2 = a0Var.g();
            if (dVar == null) {
                if (g2 == null) {
                    return true;
                }
            } else if (dVar.equals(g2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0
    public String f() {
        return this.f1515e;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0
    public a0.d g() {
        return this.f1519i;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0
    public int h() {
        return this.f1514d;
    }

    public int hashCode() {
        int hashCode = (((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f1514d) * 1000003) ^ this.f1515e.hashCode()) * 1000003) ^ this.f1516f.hashCode()) * 1000003) ^ this.f1517g.hashCode()) * 1000003;
        a0.e eVar = this.f1518h;
        int i2 = 0;
        int hashCode2 = (hashCode ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        a0.d dVar = this.f1519i;
        if (dVar != null) {
            i2 = dVar.hashCode();
        }
        return hashCode2 ^ i2;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0
    public String i() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0
    public a0.e j() {
        return this.f1518h;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0
    protected a0.b k() {
        return new C0049b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.b + ", gmpAppId=" + this.c + ", platform=" + this.f1514d + ", installationUuid=" + this.f1515e + ", buildVersion=" + this.f1516f + ", displayVersion=" + this.f1517g + ", session=" + this.f1518h + ", ndkPayload=" + this.f1519i + "}";
    }
}

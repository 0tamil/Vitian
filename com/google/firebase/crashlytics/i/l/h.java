package com.google.firebase.crashlytics.i.l;

import com.google.firebase.crashlytics.i.l.a0;
import java.util.Objects;
/* loaded from: classes.dex */
final class h extends a0.e.a {
    private final String a;
    private final String b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final a0.e.a.b f1552d;

    /* renamed from: e  reason: collision with root package name */
    private final String f1553e;

    /* renamed from: f  reason: collision with root package name */
    private final String f1554f;

    /* renamed from: g  reason: collision with root package name */
    private final String f1555g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends a0.e.a.AbstractC0035a {
        private String a;
        private String b;
        private String c;

        /* renamed from: d  reason: collision with root package name */
        private a0.e.a.b f1556d;

        /* renamed from: e  reason: collision with root package name */
        private String f1557e;

        /* renamed from: f  reason: collision with root package name */
        private String f1558f;

        /* renamed from: g  reason: collision with root package name */
        private String f1559g;

        @Override // com.google.firebase.crashlytics.i.l.a0.e.a.AbstractC0035a
        public a0.e.a a() {
            String str = "";
            if (this.a == null) {
                str = str + " identifier";
            }
            if (this.b == null) {
                str = str + " version";
            }
            if (str.isEmpty()) {
                return new h(this.a, this.b, this.c, this.f1556d, this.f1557e, this.f1558f, this.f1559g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.a.AbstractC0035a
        public a0.e.a.AbstractC0035a b(String str) {
            this.f1558f = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.a.AbstractC0035a
        public a0.e.a.AbstractC0035a c(String str) {
            this.f1559g = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.a.AbstractC0035a
        public a0.e.a.AbstractC0035a d(String str) {
            this.c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.a.AbstractC0035a
        public a0.e.a.AbstractC0035a e(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.a.AbstractC0035a
        public a0.e.a.AbstractC0035a f(String str) {
            this.f1557e = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.a.AbstractC0035a
        public a0.e.a.AbstractC0035a g(String str) {
            Objects.requireNonNull(str, "Null version");
            this.b = str;
            return this;
        }
    }

    private h(String str, String str2, String str3, a0.e.a.b bVar, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.f1552d = bVar;
        this.f1553e = str4;
        this.f1554f = str5;
        this.f1555g = str6;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.a
    public String b() {
        return this.f1554f;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.a
    public String c() {
        return this.f1555g;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.a
    public String d() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.a
    public String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        String str;
        a0.e.a.b bVar;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.a)) {
            return false;
        }
        a0.e.a aVar = (a0.e.a) obj;
        if (this.a.equals(aVar.e()) && this.b.equals(aVar.h()) && ((str = this.c) != null ? str.equals(aVar.d()) : aVar.d() == null) && ((bVar = this.f1552d) != null ? bVar.equals(aVar.g()) : aVar.g() == null) && ((str2 = this.f1553e) != null ? str2.equals(aVar.f()) : aVar.f() == null) && ((str3 = this.f1554f) != null ? str3.equals(aVar.b()) : aVar.b() == null)) {
            String str4 = this.f1555g;
            String c = aVar.c();
            if (str4 == null) {
                if (c == null) {
                    return true;
                }
            } else if (str4.equals(c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.a
    public String f() {
        return this.f1553e;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.a
    public a0.e.a.b g() {
        return this.f1552d;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.a
    public String h() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int i2 = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        a0.e.a.b bVar = this.f1552d;
        int hashCode3 = (hashCode2 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        String str2 = this.f1553e;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f1554f;
        int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f1555g;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode5 ^ i2;
    }

    public String toString() {
        return "Application{identifier=" + this.a + ", version=" + this.b + ", displayVersion=" + this.c + ", organization=" + this.f1552d + ", installationUuid=" + this.f1553e + ", developmentPlatform=" + this.f1554f + ", developmentPlatformVersion=" + this.f1555g + "}";
    }
}

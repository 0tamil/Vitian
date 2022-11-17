package com.google.firebase.installations.q;

import com.google.firebase.installations.q.c;
import com.google.firebase.installations.q.d;
import java.util.Objects;
/* loaded from: classes.dex */
final class a extends d {
    private final String a;
    private final c.a b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final String f1677d;

    /* renamed from: e  reason: collision with root package name */
    private final long f1678e;

    /* renamed from: f  reason: collision with root package name */
    private final long f1679f;

    /* renamed from: g  reason: collision with root package name */
    private final String f1680g;

    /* loaded from: classes.dex */
    static final class b extends d.a {
        private String a;
        private c.a b;
        private String c;

        /* renamed from: d  reason: collision with root package name */
        private String f1681d;

        /* renamed from: e  reason: collision with root package name */
        private Long f1682e;

        /* renamed from: f  reason: collision with root package name */
        private Long f1683f;

        /* renamed from: g  reason: collision with root package name */
        private String f1684g;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(d dVar) {
            this.a = dVar.d();
            this.b = dVar.g();
            this.c = dVar.b();
            this.f1681d = dVar.f();
            this.f1682e = Long.valueOf(dVar.c());
            this.f1683f = Long.valueOf(dVar.h());
            this.f1684g = dVar.e();
        }

        @Override // com.google.firebase.installations.q.d.a
        public d a() {
            String str = "";
            if (this.b == null) {
                str = str + " registrationStatus";
            }
            if (this.f1682e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f1683f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new a(this.a, this.b, this.c, this.f1681d, this.f1682e.longValue(), this.f1683f.longValue(), this.f1684g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.q.d.a
        public d.a b(String str) {
            this.c = str;
            return this;
        }

        @Override // com.google.firebase.installations.q.d.a
        public d.a c(long j2) {
            this.f1682e = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.installations.q.d.a
        public d.a d(String str) {
            this.a = str;
            return this;
        }

        @Override // com.google.firebase.installations.q.d.a
        public d.a e(String str) {
            this.f1684g = str;
            return this;
        }

        @Override // com.google.firebase.installations.q.d.a
        public d.a f(String str) {
            this.f1681d = str;
            return this;
        }

        @Override // com.google.firebase.installations.q.d.a
        public d.a g(c.a aVar) {
            Objects.requireNonNull(aVar, "Null registrationStatus");
            this.b = aVar;
            return this;
        }

        @Override // com.google.firebase.installations.q.d.a
        public d.a h(long j2) {
            this.f1683f = Long.valueOf(j2);
            return this;
        }
    }

    private a(String str, c.a aVar, String str2, String str3, long j2, long j3, String str4) {
        this.a = str;
        this.b = aVar;
        this.c = str2;
        this.f1677d = str3;
        this.f1678e = j2;
        this.f1679f = j3;
        this.f1680g = str4;
    }

    @Override // com.google.firebase.installations.q.d
    public String b() {
        return this.c;
    }

    @Override // com.google.firebase.installations.q.d
    public long c() {
        return this.f1678e;
    }

    @Override // com.google.firebase.installations.q.d
    public String d() {
        return this.a;
    }

    @Override // com.google.firebase.installations.q.d
    public String e() {
        return this.f1680g;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str3 = this.a;
        if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
            if (this.b.equals(dVar.g()) && ((str = this.c) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f1677d) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f1678e == dVar.c() && this.f1679f == dVar.h()) {
                String str4 = this.f1680g;
                String e2 = dVar.e();
                if (str4 == null) {
                    if (e2 == null) {
                        return true;
                    }
                } else if (str4.equals(e2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.q.d
    public String f() {
        return this.f1677d;
    }

    @Override // com.google.firebase.installations.q.d
    public c.a g() {
        return this.b;
    }

    @Override // com.google.firebase.installations.q.d
    public long h() {
        return this.f1679f;
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str2 = this.c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f1677d;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j2 = this.f1678e;
        long j3 = this.f1679f;
        int i3 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str4 = this.f1680g;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return i3 ^ i2;
    }

    @Override // com.google.firebase.installations.q.d
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.a + ", registrationStatus=" + this.b + ", authToken=" + this.c + ", refreshToken=" + this.f1677d + ", expiresInSecs=" + this.f1678e + ", tokenCreationEpochInSecs=" + this.f1679f + ", fisError=" + this.f1680g + "}";
    }
}

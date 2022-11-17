package com.google.firebase.installations.r;

import com.google.firebase.installations.r.d;
/* loaded from: classes.dex */
final class a extends d {
    private final String a;
    private final String b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final f f1691d;

    /* renamed from: e  reason: collision with root package name */
    private final d.b f1692e;

    /* loaded from: classes.dex */
    static final class b extends d.a {
        private String a;
        private String b;
        private String c;

        /* renamed from: d  reason: collision with root package name */
        private f f1693d;

        /* renamed from: e  reason: collision with root package name */
        private d.b f1694e;

        @Override // com.google.firebase.installations.r.d.a
        public d a() {
            return new a(this.a, this.b, this.c, this.f1693d, this.f1694e);
        }

        @Override // com.google.firebase.installations.r.d.a
        public d.a b(f fVar) {
            this.f1693d = fVar;
            return this;
        }

        @Override // com.google.firebase.installations.r.d.a
        public d.a c(String str) {
            this.b = str;
            return this;
        }

        @Override // com.google.firebase.installations.r.d.a
        public d.a d(String str) {
            this.c = str;
            return this;
        }

        @Override // com.google.firebase.installations.r.d.a
        public d.a e(d.b bVar) {
            this.f1694e = bVar;
            return this;
        }

        @Override // com.google.firebase.installations.r.d.a
        public d.a f(String str) {
            this.a = str;
            return this;
        }
    }

    private a(String str, String str2, String str3, f fVar, d.b bVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.f1691d = fVar;
        this.f1692e = bVar;
    }

    @Override // com.google.firebase.installations.r.d
    public f b() {
        return this.f1691d;
    }

    @Override // com.google.firebase.installations.r.d
    public String c() {
        return this.b;
    }

    @Override // com.google.firebase.installations.r.d
    public String d() {
        return this.c;
    }

    @Override // com.google.firebase.installations.r.d
    public d.b e() {
        return this.f1692e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.a;
        if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
            String str2 = this.b;
            if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                String str3 = this.c;
                if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                    f fVar = this.f1691d;
                    if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                        d.b bVar = this.f1692e;
                        d.b e2 = dVar.e();
                        if (bVar == null) {
                            if (e2 == null) {
                                return true;
                            }
                        } else if (bVar.equals(e2)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.r.d
    public String f() {
        return this.a;
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f1691d;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.b bVar = this.f1692e;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return hashCode4 ^ i2;
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.a + ", fid=" + this.b + ", refreshToken=" + this.c + ", authToken=" + this.f1691d + ", responseCode=" + this.f1692e + "}";
    }
}

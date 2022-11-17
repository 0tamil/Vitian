package com.google.firebase.installations.r;

import com.google.firebase.installations.r.f;
/* loaded from: classes.dex */
final class b extends f {
    private final String a;
    private final long b;
    private final f.b c;

    /* renamed from: com.google.firebase.installations.r.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0053b extends f.a {
        private String a;
        private Long b;
        private f.b c;

        @Override // com.google.firebase.installations.r.f.a
        public f a() {
            String str = "";
            if (this.b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new b(this.a, this.b.longValue(), this.c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.r.f.a
        public f.a b(f.b bVar) {
            this.c = bVar;
            return this;
        }

        @Override // com.google.firebase.installations.r.f.a
        public f.a c(String str) {
            this.a = str;
            return this;
        }

        @Override // com.google.firebase.installations.r.f.a
        public f.a d(long j2) {
            this.b = Long.valueOf(j2);
            return this;
        }
    }

    private b(String str, long j2, f.b bVar) {
        this.a = str;
        this.b = j2;
        this.c = bVar;
    }

    @Override // com.google.firebase.installations.r.f
    public f.b b() {
        return this.c;
    }

    @Override // com.google.firebase.installations.r.f
    public String c() {
        return this.a;
    }

    @Override // com.google.firebase.installations.r.f
    public long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.a;
        if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
            if (this.b == fVar.d()) {
                f.b bVar = this.c;
                f.b b = fVar.b();
                if (bVar == null) {
                    if (b == null) {
                        return true;
                    }
                } else if (bVar.equals(b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        long j2 = this.b;
        int i3 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        f.b bVar = this.c;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        return "TokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.b + ", responseCode=" + this.c + "}";
    }
}

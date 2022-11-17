package com.google.firebase.installations;

import com.google.firebase.installations.l;
import java.util.Objects;
/* loaded from: classes.dex */
final class e extends l {
    private final String a;
    private final long b;
    private final long c;

    /* loaded from: classes.dex */
    static final class b extends l.a {
        private String a;
        private Long b;
        private Long c;

        @Override // com.google.firebase.installations.l.a
        public l a() {
            String str = "";
            if (this.a == null) {
                str = str + " token";
            }
            if (this.b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new e(this.a, this.b.longValue(), this.c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.l.a
        public l.a b(String str) {
            Objects.requireNonNull(str, "Null token");
            this.a = str;
            return this;
        }

        @Override // com.google.firebase.installations.l.a
        public l.a c(long j2) {
            this.c = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.installations.l.a
        public l.a d(long j2) {
            this.b = Long.valueOf(j2);
            return this;
        }
    }

    private e(String str, long j2, long j3) {
        this.a = str;
        this.b = j2;
        this.c = j3;
    }

    @Override // com.google.firebase.installations.l
    public String b() {
        return this.a;
    }

    @Override // com.google.firebase.installations.l
    public long c() {
        return this.c;
    }

    @Override // com.google.firebase.installations.l
    public long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.a.equals(lVar.b()) && this.b == lVar.d() && this.c == lVar.c();
    }

    public int hashCode() {
        long j2 = this.b;
        long j3 = this.c;
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.b + ", tokenCreationTimestamp=" + this.c + "}";
    }
}

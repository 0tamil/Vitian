package com.google.firebase.crashlytics.i.l;

import com.google.firebase.crashlytics.i.l.a0;
import java.util.Objects;
/* loaded from: classes.dex */
final class p extends a0.e.d.a.b.AbstractC0041d {
    private final String a;
    private final String b;
    private final long c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends a0.e.d.a.b.AbstractC0041d.AbstractC0042a {
        private String a;
        private String b;
        private Long c;

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.AbstractC0041d.AbstractC0042a
        public a0.e.d.a.b.AbstractC0041d a() {
            String str = "";
            if (this.a == null) {
                str = str + " name";
            }
            if (this.b == null) {
                str = str + " code";
            }
            if (this.c == null) {
                str = str + " address";
            }
            if (str.isEmpty()) {
                return new p(this.a, this.b, this.c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.AbstractC0041d.AbstractC0042a
        public a0.e.d.a.b.AbstractC0041d.AbstractC0042a b(long j2) {
            this.c = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.AbstractC0041d.AbstractC0042a
        public a0.e.d.a.b.AbstractC0041d.AbstractC0042a c(String str) {
            Objects.requireNonNull(str, "Null code");
            this.b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.AbstractC0041d.AbstractC0042a
        public a0.e.d.a.b.AbstractC0041d.AbstractC0042a d(String str) {
            Objects.requireNonNull(str, "Null name");
            this.a = str;
            return this;
        }
    }

    private p(String str, String str2, long j2) {
        this.a = str;
        this.b = str2;
        this.c = j2;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.AbstractC0041d
    public long b() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.AbstractC0041d
    public String c() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.AbstractC0041d
    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d.a.b.AbstractC0041d)) {
            return false;
        }
        a0.e.d.a.b.AbstractC0041d dVar = (a0.e.d.a.b.AbstractC0041d) obj;
        return this.a.equals(dVar.d()) && this.b.equals(dVar.c()) && this.c == dVar.b();
    }

    public int hashCode() {
        long j2 = this.c;
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.a + ", code=" + this.b + ", address=" + this.c + "}";
    }
}

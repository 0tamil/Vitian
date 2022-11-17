package com.google.firebase.crashlytics.i.l;

import com.google.firebase.crashlytics.i.l.a0;
import java.util.Objects;
/* loaded from: classes.dex */
final class n extends a0.e.d.a.b.AbstractC0037a {
    private final long a;
    private final long b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final String f1584d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends a0.e.d.a.b.AbstractC0037a.AbstractC0038a {
        private Long a;
        private Long b;
        private String c;

        /* renamed from: d  reason: collision with root package name */
        private String f1585d;

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.AbstractC0037a.AbstractC0038a
        public a0.e.d.a.b.AbstractC0037a a() {
            String str = "";
            if (this.a == null) {
                str = str + " baseAddress";
            }
            if (this.b == null) {
                str = str + " size";
            }
            if (this.c == null) {
                str = str + " name";
            }
            if (str.isEmpty()) {
                return new n(this.a.longValue(), this.b.longValue(), this.c, this.f1585d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.AbstractC0037a.AbstractC0038a
        public a0.e.d.a.b.AbstractC0037a.AbstractC0038a b(long j2) {
            this.a = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.AbstractC0037a.AbstractC0038a
        public a0.e.d.a.b.AbstractC0037a.AbstractC0038a c(String str) {
            Objects.requireNonNull(str, "Null name");
            this.c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.AbstractC0037a.AbstractC0038a
        public a0.e.d.a.b.AbstractC0037a.AbstractC0038a d(long j2) {
            this.b = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.AbstractC0037a.AbstractC0038a
        public a0.e.d.a.b.AbstractC0037a.AbstractC0038a e(String str) {
            this.f1585d = str;
            return this;
        }
    }

    private n(long j2, long j3, String str, String str2) {
        this.a = j2;
        this.b = j3;
        this.c = str;
        this.f1584d = str2;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.AbstractC0037a
    public long b() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.AbstractC0037a
    public String c() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.AbstractC0037a
    public long d() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.AbstractC0037a
    public String e() {
        return this.f1584d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d.a.b.AbstractC0037a)) {
            return false;
        }
        a0.e.d.a.b.AbstractC0037a aVar = (a0.e.d.a.b.AbstractC0037a) obj;
        if (this.a == aVar.b() && this.b == aVar.d() && this.c.equals(aVar.c())) {
            String str = this.f1584d;
            String e2 = aVar.e();
            if (str == null) {
                if (e2 == null) {
                    return true;
                }
            } else if (str.equals(e2)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.a;
        long j3 = this.b;
        int hashCode = (((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.f1584d;
        return (str == null ? 0 : str.hashCode()) ^ hashCode;
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.a + ", size=" + this.b + ", name=" + this.c + ", uuid=" + this.f1584d + "}";
    }
}

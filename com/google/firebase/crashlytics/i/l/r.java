package com.google.firebase.crashlytics.i.l;

import com.google.firebase.crashlytics.i.l.a0;
import java.util.Objects;
/* loaded from: classes.dex */
final class r extends a0.e.d.a.b.AbstractC0043e.AbstractC0045b {
    private final long a;
    private final String b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final long f1590d;

    /* renamed from: e  reason: collision with root package name */
    private final int f1591e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends a0.e.d.a.b.AbstractC0043e.AbstractC0045b.AbstractC0046a {
        private Long a;
        private String b;
        private String c;

        /* renamed from: d  reason: collision with root package name */
        private Long f1592d;

        /* renamed from: e  reason: collision with root package name */
        private Integer f1593e;

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.AbstractC0043e.AbstractC0045b.AbstractC0046a
        public a0.e.d.a.b.AbstractC0043e.AbstractC0045b a() {
            String str = "";
            if (this.a == null) {
                str = str + " pc";
            }
            if (this.b == null) {
                str = str + " symbol";
            }
            if (this.f1592d == null) {
                str = str + " offset";
            }
            if (this.f1593e == null) {
                str = str + " importance";
            }
            if (str.isEmpty()) {
                return new r(this.a.longValue(), this.b, this.c, this.f1592d.longValue(), this.f1593e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.AbstractC0043e.AbstractC0045b.AbstractC0046a
        public a0.e.d.a.b.AbstractC0043e.AbstractC0045b.AbstractC0046a b(String str) {
            this.c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.AbstractC0043e.AbstractC0045b.AbstractC0046a
        public a0.e.d.a.b.AbstractC0043e.AbstractC0045b.AbstractC0046a c(int i2) {
            this.f1593e = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.AbstractC0043e.AbstractC0045b.AbstractC0046a
        public a0.e.d.a.b.AbstractC0043e.AbstractC0045b.AbstractC0046a d(long j2) {
            this.f1592d = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.AbstractC0043e.AbstractC0045b.AbstractC0046a
        public a0.e.d.a.b.AbstractC0043e.AbstractC0045b.AbstractC0046a e(long j2) {
            this.a = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.AbstractC0043e.AbstractC0045b.AbstractC0046a
        public a0.e.d.a.b.AbstractC0043e.AbstractC0045b.AbstractC0046a f(String str) {
            Objects.requireNonNull(str, "Null symbol");
            this.b = str;
            return this;
        }
    }

    private r(long j2, String str, String str2, long j3, int i2) {
        this.a = j2;
        this.b = str;
        this.c = str2;
        this.f1590d = j3;
        this.f1591e = i2;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.AbstractC0043e.AbstractC0045b
    public String b() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.AbstractC0043e.AbstractC0045b
    public int c() {
        return this.f1591e;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.AbstractC0043e.AbstractC0045b
    public long d() {
        return this.f1590d;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.AbstractC0043e.AbstractC0045b
    public long e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d.a.b.AbstractC0043e.AbstractC0045b)) {
            return false;
        }
        a0.e.d.a.b.AbstractC0043e.AbstractC0045b bVar = (a0.e.d.a.b.AbstractC0043e.AbstractC0045b) obj;
        return this.a == bVar.e() && this.b.equals(bVar.f()) && ((str = this.c) != null ? str.equals(bVar.b()) : bVar.b() == null) && this.f1590d == bVar.d() && this.f1591e == bVar.c();
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.AbstractC0043e.AbstractC0045b
    public String f() {
        return this.b;
    }

    public int hashCode() {
        long j2 = this.a;
        int hashCode = (((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j3 = this.f1590d;
        return this.f1591e ^ ((((hashCode ^ hashCode2) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003);
    }

    public String toString() {
        return "Frame{pc=" + this.a + ", symbol=" + this.b + ", file=" + this.c + ", offset=" + this.f1590d + ", importance=" + this.f1591e + "}";
    }
}

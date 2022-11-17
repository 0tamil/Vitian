package com.google.firebase.crashlytics.i.l;

import com.google.firebase.crashlytics.i.l.a0;
/* loaded from: classes.dex */
final class s extends a0.e.d.c {
    private final Double a;
    private final int b;
    private final boolean c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1594d;

    /* renamed from: e  reason: collision with root package name */
    private final long f1595e;

    /* renamed from: f  reason: collision with root package name */
    private final long f1596f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends a0.e.d.c.a {
        private Double a;
        private Integer b;
        private Boolean c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f1597d;

        /* renamed from: e  reason: collision with root package name */
        private Long f1598e;

        /* renamed from: f  reason: collision with root package name */
        private Long f1599f;

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.c.a
        public a0.e.d.c a() {
            String str = "";
            if (this.b == null) {
                str = str + " batteryVelocity";
            }
            if (this.c == null) {
                str = str + " proximityOn";
            }
            if (this.f1597d == null) {
                str = str + " orientation";
            }
            if (this.f1598e == null) {
                str = str + " ramUsed";
            }
            if (this.f1599f == null) {
                str = str + " diskUsed";
            }
            if (str.isEmpty()) {
                return new s(this.a, this.b.intValue(), this.c.booleanValue(), this.f1597d.intValue(), this.f1598e.longValue(), this.f1599f.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.c.a
        public a0.e.d.c.a b(Double d2) {
            this.a = d2;
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.c.a
        public a0.e.d.c.a c(int i2) {
            this.b = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.c.a
        public a0.e.d.c.a d(long j2) {
            this.f1599f = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.c.a
        public a0.e.d.c.a e(int i2) {
            this.f1597d = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.c.a
        public a0.e.d.c.a f(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.c.a
        public a0.e.d.c.a g(long j2) {
            this.f1598e = Long.valueOf(j2);
            return this;
        }
    }

    private s(Double d2, int i2, boolean z, int i3, long j2, long j3) {
        this.a = d2;
        this.b = i2;
        this.c = z;
        this.f1594d = i3;
        this.f1595e = j2;
        this.f1596f = j3;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.d.c
    public Double b() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.d.c
    public int c() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.d.c
    public long d() {
        return this.f1596f;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.d.c
    public int e() {
        return this.f1594d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d.c)) {
            return false;
        }
        a0.e.d.c cVar = (a0.e.d.c) obj;
        Double d2 = this.a;
        if (d2 != null ? d2.equals(cVar.b()) : cVar.b() == null) {
            if (this.b == cVar.c() && this.c == cVar.g() && this.f1594d == cVar.e() && this.f1595e == cVar.f() && this.f1596f == cVar.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.d.c
    public long f() {
        return this.f1595e;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.d.c
    public boolean g() {
        return this.c;
    }

    public int hashCode() {
        Double d2 = this.a;
        int hashCode = ((((d2 == null ? 0 : d2.hashCode()) ^ 1000003) * 1000003) ^ this.b) * 1000003;
        int i2 = this.c ? 1231 : 1237;
        long j2 = this.f1595e;
        long j3 = this.f1596f;
        return ((((((hashCode ^ i2) * 1000003) ^ this.f1594d) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.a + ", batteryVelocity=" + this.b + ", proximityOn=" + this.c + ", orientation=" + this.f1594d + ", ramUsed=" + this.f1595e + ", diskUsed=" + this.f1596f + "}";
    }
}

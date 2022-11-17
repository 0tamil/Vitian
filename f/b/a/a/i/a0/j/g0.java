package f.b.a.a.i.a0.j;

import f.b.a.a.i.a0.j.k0;
/* loaded from: classes.dex */
final class g0 extends k0 {
    private final long b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private final int f2262d;

    /* renamed from: e  reason: collision with root package name */
    private final long f2263e;

    /* renamed from: f  reason: collision with root package name */
    private final int f2264f;

    /* loaded from: classes.dex */
    static final class b extends k0.a {
        private Long a;
        private Integer b;
        private Integer c;

        /* renamed from: d  reason: collision with root package name */
        private Long f2265d;

        /* renamed from: e  reason: collision with root package name */
        private Integer f2266e;

        @Override // f.b.a.a.i.a0.j.k0.a
        k0 a() {
            String str = "";
            if (this.a == null) {
                str = str + " maxStorageSizeInBytes";
            }
            if (this.b == null) {
                str = str + " loadBatchSize";
            }
            if (this.c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f2265d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f2266e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new g0(this.a.longValue(), this.b.intValue(), this.c.intValue(), this.f2265d.longValue(), this.f2266e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // f.b.a.a.i.a0.j.k0.a
        k0.a b(int i2) {
            this.c = Integer.valueOf(i2);
            return this;
        }

        @Override // f.b.a.a.i.a0.j.k0.a
        k0.a c(long j2) {
            this.f2265d = Long.valueOf(j2);
            return this;
        }

        @Override // f.b.a.a.i.a0.j.k0.a
        k0.a d(int i2) {
            this.b = Integer.valueOf(i2);
            return this;
        }

        @Override // f.b.a.a.i.a0.j.k0.a
        k0.a e(int i2) {
            this.f2266e = Integer.valueOf(i2);
            return this;
        }

        @Override // f.b.a.a.i.a0.j.k0.a
        k0.a f(long j2) {
            this.a = Long.valueOf(j2);
            return this;
        }
    }

    private g0(long j2, int i2, int i3, long j3, int i4) {
        this.b = j2;
        this.c = i2;
        this.f2262d = i3;
        this.f2263e = j3;
        this.f2264f = i4;
    }

    @Override // f.b.a.a.i.a0.j.k0
    int b() {
        return this.f2262d;
    }

    @Override // f.b.a.a.i.a0.j.k0
    long c() {
        return this.f2263e;
    }

    @Override // f.b.a.a.i.a0.j.k0
    int d() {
        return this.c;
    }

    @Override // f.b.a.a.i.a0.j.k0
    int e() {
        return this.f2264f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.b == k0Var.f() && this.c == k0Var.d() && this.f2262d == k0Var.b() && this.f2263e == k0Var.c() && this.f2264f == k0Var.e();
    }

    @Override // f.b.a.a.i.a0.j.k0
    long f() {
        return this.b;
    }

    public int hashCode() {
        long j2 = this.b;
        long j3 = this.f2263e;
        return this.f2264f ^ ((((((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.f2262d) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.b + ", loadBatchSize=" + this.c + ", criticalSectionEnterTimeoutMs=" + this.f2262d + ", eventCleanUpAge=" + this.f2263e + ", maxBlobByteSizePerRow=" + this.f2264f + "}";
    }
}

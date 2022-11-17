package f.b.b.a.z.a;

import java.util.Arrays;
/* loaded from: classes.dex */
public abstract class j {
    int a;
    int b;
    k c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b extends j {

        /* renamed from: d  reason: collision with root package name */
        private final byte[] f2535d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f2536e;

        /* renamed from: f  reason: collision with root package name */
        private int f2537f;

        /* renamed from: g  reason: collision with root package name */
        private int f2538g;

        /* renamed from: h  reason: collision with root package name */
        private int f2539h;

        /* renamed from: i  reason: collision with root package name */
        private int f2540i;

        /* renamed from: j  reason: collision with root package name */
        private int f2541j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f2542k;
        private int l;

        private b(byte[] bArr, int i2, int i3, boolean z) {
            super();
            this.l = Integer.MAX_VALUE;
            this.f2535d = bArr;
            this.f2537f = i3 + i2;
            this.f2539h = i2;
            this.f2540i = i2;
            this.f2536e = z;
        }

        private void K() {
            int i2 = this.f2537f + this.f2538g;
            this.f2537f = i2;
            int i3 = i2 - this.f2540i;
            int i4 = this.l;
            if (i3 > i4) {
                int i5 = i3 - i4;
                this.f2538g = i5;
                this.f2537f = i2 - i5;
                return;
            }
            this.f2538g = 0;
        }

        private void N() {
            if (this.f2537f - this.f2539h >= 10) {
                O();
            } else {
                P();
            }
        }

        private void O() {
            for (int i2 = 0; i2 < 10; i2++) {
                byte[] bArr = this.f2535d;
                int i3 = this.f2539h;
                this.f2539h = i3 + 1;
                if (bArr[i3] >= 0) {
                    return;
                }
            }
            throw c0.e();
        }

        private void P() {
            for (int i2 = 0; i2 < 10; i2++) {
                if (D() >= 0) {
                    return;
                }
            }
            throw c0.e();
        }

        @Override // f.b.b.a.z.a.j
        public int A() {
            return H();
        }

        @Override // f.b.b.a.z.a.j
        public long B() {
            return I();
        }

        @Override // f.b.b.a.z.a.j
        public boolean C(int i2) {
            int b = u1.b(i2);
            if (b == 0) {
                N();
                return true;
            } else if (b == 1) {
                M(8);
                return true;
            } else if (b == 2) {
                M(H());
                return true;
            } else if (b == 3) {
                L();
                a(u1.c(u1.a(i2), 4));
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    M(4);
                    return true;
                }
                throw c0.d();
            }
        }

        public byte D() {
            int i2 = this.f2539h;
            if (i2 != this.f2537f) {
                byte[] bArr = this.f2535d;
                this.f2539h = i2 + 1;
                return bArr[i2];
            }
            throw c0.j();
        }

        public byte[] E(int i2) {
            if (i2 > 0) {
                int i3 = this.f2537f;
                int i4 = this.f2539h;
                if (i2 <= i3 - i4) {
                    int i5 = i2 + i4;
                    this.f2539h = i5;
                    return Arrays.copyOfRange(this.f2535d, i4, i5);
                }
            }
            if (i2 > 0) {
                throw c0.j();
            } else if (i2 == 0) {
                return b0.b;
            } else {
                throw c0.f();
            }
        }

        public int F() {
            int i2 = this.f2539h;
            if (this.f2537f - i2 >= 4) {
                byte[] bArr = this.f2535d;
                this.f2539h = i2 + 4;
                return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
            }
            throw c0.j();
        }

        public long G() {
            int i2 = this.f2539h;
            if (this.f2537f - i2 >= 8) {
                byte[] bArr = this.f2535d;
                this.f2539h = i2 + 8;
                return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
            }
            throw c0.j();
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:
            if (r2[r3] < 0) goto L32;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int H() {
            int i2;
            int i3 = this.f2539h;
            int i4 = this.f2537f;
            if (i4 != i3) {
                byte[] bArr = this.f2535d;
                int i5 = i3 + 1;
                byte b = bArr[i3];
                if (b >= 0) {
                    this.f2539h = i5;
                    return b;
                } else if (i4 - i5 >= 9) {
                    int i6 = i5 + 1;
                    int i7 = b ^ (bArr[i5] << 7);
                    if (i7 < 0) {
                        i2 = i7 ^ (-128);
                    } else {
                        int i8 = i6 + 1;
                        int i9 = i7 ^ (bArr[i6] << 14);
                        if (i9 >= 0) {
                            i2 = i9 ^ 16256;
                        } else {
                            i6 = i8 + 1;
                            int i10 = i9 ^ (bArr[i8] << 21);
                            if (i10 < 0) {
                                i2 = i10 ^ (-2080896);
                            } else {
                                i8 = i6 + 1;
                                byte b2 = bArr[i6];
                                i2 = (i10 ^ (b2 << 28)) ^ 266354560;
                                if (b2 < 0) {
                                    i6 = i8 + 1;
                                    if (bArr[i8] < 0) {
                                        i8 = i6 + 1;
                                        if (bArr[i6] < 0) {
                                            i6 = i8 + 1;
                                            if (bArr[i8] < 0) {
                                                i8 = i6 + 1;
                                                if (bArr[i6] < 0) {
                                                    i6 = i8 + 1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i6 = i8;
                    }
                    this.f2539h = i6;
                    return i2;
                }
            }
            return (int) J();
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x00b4, code lost:
            if (r2[r0] < 0) goto L38;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public long I() {
            long j2;
            long j3;
            long j4;
            int i2;
            int i3 = this.f2539h;
            int i4 = this.f2537f;
            if (i4 != i3) {
                byte[] bArr = this.f2535d;
                int i5 = i3 + 1;
                byte b = bArr[i3];
                if (b >= 0) {
                    this.f2539h = i5;
                    return b;
                } else if (i4 - i5 >= 9) {
                    int i6 = i5 + 1;
                    int i7 = b ^ (bArr[i5] << 7);
                    if (i7 < 0) {
                        i2 = i7 ^ (-128);
                    } else {
                        int i8 = i6 + 1;
                        int i9 = i7 ^ (bArr[i6] << 14);
                        if (i9 >= 0) {
                            j2 = i9 ^ 16256;
                            i6 = i8;
                        } else {
                            i6 = i8 + 1;
                            int i10 = i9 ^ (bArr[i8] << 21);
                            if (i10 < 0) {
                                i2 = i10 ^ (-2080896);
                            } else {
                                long j5 = i10;
                                int i11 = i6 + 1;
                                long j6 = j5 ^ (bArr[i6] << 28);
                                if (j6 >= 0) {
                                    j4 = 266354560;
                                } else {
                                    i6 = i11 + 1;
                                    long j7 = j6 ^ (bArr[i11] << 35);
                                    if (j7 < 0) {
                                        j3 = -34093383808L;
                                    } else {
                                        i11 = i6 + 1;
                                        j6 = j7 ^ (bArr[i6] << 42);
                                        if (j6 >= 0) {
                                            j4 = 4363953127296L;
                                        } else {
                                            i6 = i11 + 1;
                                            j7 = j6 ^ (bArr[i11] << 49);
                                            if (j7 < 0) {
                                                j3 = -558586000294016L;
                                            } else {
                                                int i12 = i6 + 1;
                                                long j8 = (j7 ^ (bArr[i6] << 56)) ^ 71499008037633920L;
                                                i6 = j8 < 0 ? i12 + 1 : i12;
                                                j2 = j8;
                                            }
                                        }
                                    }
                                    j2 = j7 ^ j3;
                                }
                                j2 = j6 ^ j4;
                                i6 = i11;
                            }
                        }
                        this.f2539h = i6;
                        return j2;
                    }
                    j2 = i2;
                    this.f2539h = i6;
                    return j2;
                }
            }
            return J();
        }

        long J() {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                byte D = D();
                j2 |= (D & Byte.MAX_VALUE) << i2;
                if ((D & 128) == 0) {
                    return j2;
                }
            }
            throw c0.e();
        }

        public void L() {
            int z;
            do {
                z = z();
                if (z == 0) {
                    return;
                }
            } while (C(z));
        }

        public void M(int i2) {
            if (i2 >= 0) {
                int i3 = this.f2537f;
                int i4 = this.f2539h;
                if (i2 <= i3 - i4) {
                    this.f2539h = i4 + i2;
                    return;
                }
            }
            if (i2 < 0) {
                throw c0.f();
            }
            throw c0.j();
        }

        @Override // f.b.b.a.z.a.j
        public void a(int i2) {
            if (this.f2541j != i2) {
                throw c0.a();
            }
        }

        @Override // f.b.b.a.z.a.j
        public int d() {
            return this.f2539h - this.f2540i;
        }

        @Override // f.b.b.a.z.a.j
        public boolean e() {
            return this.f2539h == this.f2537f;
        }

        @Override // f.b.b.a.z.a.j
        public void i(int i2) {
            this.l = i2;
            K();
        }

        @Override // f.b.b.a.z.a.j
        public int j(int i2) {
            if (i2 >= 0) {
                int d2 = i2 + d();
                int i3 = this.l;
                if (d2 <= i3) {
                    this.l = d2;
                    K();
                    return i3;
                }
                throw c0.j();
            }
            throw c0.f();
        }

        @Override // f.b.b.a.z.a.j
        public boolean k() {
            return I() != 0;
        }

        @Override // f.b.b.a.z.a.j
        public i l() {
            int H = H();
            if (H > 0) {
                int i2 = this.f2537f;
                int i3 = this.f2539h;
                if (H <= i2 - i3) {
                    i l = (!this.f2536e || !this.f2542k) ? i.l(this.f2535d, i3, H) : i.C(this.f2535d, i3, H);
                    this.f2539h += H;
                    return l;
                }
            }
            return H == 0 ? i.f2526f : i.B(E(H));
        }

        @Override // f.b.b.a.z.a.j
        public double m() {
            return Double.longBitsToDouble(G());
        }

        @Override // f.b.b.a.z.a.j
        public int n() {
            return H();
        }

        @Override // f.b.b.a.z.a.j
        public int o() {
            return F();
        }

        @Override // f.b.b.a.z.a.j
        public long p() {
            return G();
        }

        @Override // f.b.b.a.z.a.j
        public float q() {
            return Float.intBitsToFloat(F());
        }

        @Override // f.b.b.a.z.a.j
        public int r() {
            return H();
        }

        @Override // f.b.b.a.z.a.j
        public long s() {
            return I();
        }

        @Override // f.b.b.a.z.a.j
        public int t() {
            return F();
        }

        @Override // f.b.b.a.z.a.j
        public long u() {
            return G();
        }

        @Override // f.b.b.a.z.a.j
        public int v() {
            return j.b(H());
        }

        @Override // f.b.b.a.z.a.j
        public long w() {
            return j.c(I());
        }

        @Override // f.b.b.a.z.a.j
        public String x() {
            int H = H();
            if (H > 0 && H <= this.f2537f - this.f2539h) {
                String str = new String(this.f2535d, this.f2539h, H, b0.a);
                this.f2539h += H;
                return str;
            } else if (H == 0) {
                return "";
            } else {
                if (H < 0) {
                    throw c0.f();
                }
                throw c0.j();
            }
        }

        @Override // f.b.b.a.z.a.j
        public String y() {
            int H = H();
            if (H > 0) {
                int i2 = this.f2537f;
                int i3 = this.f2539h;
                if (H <= i2 - i3) {
                    String e2 = t1.e(this.f2535d, i3, H);
                    this.f2539h += H;
                    return e2;
                }
            }
            if (H == 0) {
                return "";
            }
            if (H <= 0) {
                throw c0.f();
            }
            throw c0.j();
        }

        @Override // f.b.b.a.z.a.j
        public int z() {
            if (e()) {
                this.f2541j = 0;
                return 0;
            }
            int H = H();
            this.f2541j = H;
            if (u1.a(H) != 0) {
                return this.f2541j;
            }
            throw c0.b();
        }
    }

    private j() {
        this.b = 100;
    }

    public static int b(int i2) {
        return (-(i2 & 1)) ^ (i2 >>> 1);
    }

    public static long c(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    public static j f(byte[] bArr) {
        return g(bArr, 0, bArr.length);
    }

    public static j g(byte[] bArr, int i2, int i3) {
        return h(bArr, i2, i3, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j h(byte[] bArr, int i2, int i3, boolean z) {
        b bVar = new b(bArr, i2, i3, z);
        try {
            bVar.j(i3);
            return bVar;
        } catch (c0 e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public abstract int A();

    public abstract long B();

    public abstract boolean C(int i2);

    public abstract void a(int i2);

    public abstract int d();

    public abstract boolean e();

    public abstract void i(int i2);

    public abstract int j(int i2);

    public abstract boolean k();

    public abstract i l();

    public abstract double m();

    public abstract int n();

    public abstract int o();

    public abstract long p();

    public abstract float q();

    public abstract int r();

    public abstract long s();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract String x();

    public abstract String y();

    public abstract int z();
}

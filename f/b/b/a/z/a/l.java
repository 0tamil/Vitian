package f.b.b.a.z.a;

import f.b.b.a.z.a.t1;
import java.io.IOException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public abstract class l extends h {
    private static final Logger c = Logger.getLogger(l.class.getName());

    /* renamed from: d  reason: collision with root package name */
    private static final boolean f2567d = s1.C();
    m a;
    private boolean b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends l {

        /* renamed from: e  reason: collision with root package name */
        private final byte[] f2568e;

        /* renamed from: f  reason: collision with root package name */
        private final int f2569f;

        /* renamed from: g  reason: collision with root package name */
        private int f2570g;

        b(byte[] bArr, int i2, int i3) {
            super();
            Objects.requireNonNull(bArr, "buffer");
            int i4 = i2 + i3;
            if ((i2 | i3 | (bArr.length - i4)) >= 0) {
                this.f2568e = bArr;
                this.f2570g = i2;
                this.f2569f = i4;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }

        @Override // f.b.b.a.z.a.l
        public final void B0(int i2, int i3) {
            T0(i2, 0);
            C0(i3);
        }

        @Override // f.b.b.a.z.a.l
        public final void C0(int i2) {
            if (i2 >= 0) {
                V0(i2);
            } else {
                X0(i2);
            }
        }

        @Override // f.b.b.a.z.a.l
        final void F0(int i2, s0 s0Var, h1 h1Var) {
            T0(i2, 2);
            V0(((f.b.b.a.z.a.a) s0Var).m(h1Var));
            h1Var.e(s0Var, this.a);
        }

        @Override // f.b.b.a.z.a.l
        public final void G0(s0 s0Var) {
            V0(s0Var.e());
            s0Var.c(this);
        }

        @Override // f.b.b.a.z.a.l
        public final void H0(int i2, s0 s0Var) {
            T0(1, 3);
            U0(2, i2);
            Z0(3, s0Var);
            T0(1, 4);
        }

        @Override // f.b.b.a.z.a.l
        public final void I0(int i2, i iVar) {
            T0(1, 3);
            U0(2, i2);
            l0(3, iVar);
            T0(1, 4);
        }

        @Override // f.b.b.a.z.a.l
        public final void R0(int i2, String str) {
            T0(i2, 2);
            S0(str);
        }

        @Override // f.b.b.a.z.a.l
        public final void S0(String str) {
            int f2;
            int i2 = this.f2570g;
            try {
                int W = l.W(str.length() * 3);
                int W2 = l.W(str.length());
                if (W2 == W) {
                    int i3 = i2 + W2;
                    this.f2570g = i3;
                    f2 = t1.f(str, this.f2568e, i3, f0());
                    this.f2570g = i2;
                    V0((f2 - i2) - W2);
                } else {
                    V0(t1.g(str));
                    f2 = t1.f(str, this.f2568e, this.f2570g, f0());
                }
                this.f2570g = f2;
            } catch (t1.d e2) {
                this.f2570g = i2;
                b0(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new c(e3);
            }
        }

        @Override // f.b.b.a.z.a.l
        public final void T0(int i2, int i3) {
            V0(u1.c(i2, i3));
        }

        @Override // f.b.b.a.z.a.l
        public final void U0(int i2, int i3) {
            T0(i2, 0);
            V0(i3);
        }

        @Override // f.b.b.a.z.a.l
        public final void V0(int i2) {
            if (!l.f2567d || d.c() || f0() < 5) {
                while ((i2 & (-128)) != 0) {
                    try {
                        byte[] bArr = this.f2568e;
                        int i3 = this.f2570g;
                        this.f2570g = i3 + 1;
                        bArr[i3] = (byte) ((i2 & 127) | 128);
                        i2 >>>= 7;
                    } catch (IndexOutOfBoundsException e2) {
                        throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2570g), Integer.valueOf(this.f2569f), 1), e2);
                    }
                }
                byte[] bArr2 = this.f2568e;
                int i4 = this.f2570g;
                this.f2570g = i4 + 1;
                bArr2[i4] = (byte) i2;
            } else if ((i2 & (-128)) == 0) {
                byte[] bArr3 = this.f2568e;
                int i5 = this.f2570g;
                this.f2570g = i5 + 1;
                s1.H(bArr3, i5, (byte) i2);
            } else {
                byte[] bArr4 = this.f2568e;
                int i6 = this.f2570g;
                this.f2570g = i6 + 1;
                s1.H(bArr4, i6, (byte) (i2 | 128));
                int i7 = i2 >>> 7;
                if ((i7 & (-128)) == 0) {
                    byte[] bArr5 = this.f2568e;
                    int i8 = this.f2570g;
                    this.f2570g = i8 + 1;
                    s1.H(bArr5, i8, (byte) i7);
                    return;
                }
                byte[] bArr6 = this.f2568e;
                int i9 = this.f2570g;
                this.f2570g = i9 + 1;
                s1.H(bArr6, i9, (byte) (i7 | 128));
                int i10 = i7 >>> 7;
                if ((i10 & (-128)) == 0) {
                    byte[] bArr7 = this.f2568e;
                    int i11 = this.f2570g;
                    this.f2570g = i11 + 1;
                    s1.H(bArr7, i11, (byte) i10);
                    return;
                }
                byte[] bArr8 = this.f2568e;
                int i12 = this.f2570g;
                this.f2570g = i12 + 1;
                s1.H(bArr8, i12, (byte) (i10 | 128));
                int i13 = i10 >>> 7;
                if ((i13 & (-128)) == 0) {
                    byte[] bArr9 = this.f2568e;
                    int i14 = this.f2570g;
                    this.f2570g = i14 + 1;
                    s1.H(bArr9, i14, (byte) i13);
                    return;
                }
                byte[] bArr10 = this.f2568e;
                int i15 = this.f2570g;
                this.f2570g = i15 + 1;
                s1.H(bArr10, i15, (byte) (i13 | 128));
                byte[] bArr11 = this.f2568e;
                int i16 = this.f2570g;
                this.f2570g = i16 + 1;
                s1.H(bArr11, i16, (byte) (i13 >>> 7));
            }
        }

        @Override // f.b.b.a.z.a.l
        public final void W0(int i2, long j2) {
            T0(i2, 0);
            X0(j2);
        }

        @Override // f.b.b.a.z.a.l
        public final void X0(long j2) {
            if (!l.f2567d || f0() < 10) {
                while ((j2 & (-128)) != 0) {
                    try {
                        byte[] bArr = this.f2568e;
                        int i2 = this.f2570g;
                        this.f2570g = i2 + 1;
                        bArr[i2] = (byte) ((((int) j2) & 127) | 128);
                        j2 >>>= 7;
                    } catch (IndexOutOfBoundsException e2) {
                        throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2570g), Integer.valueOf(this.f2569f), 1), e2);
                    }
                }
                byte[] bArr2 = this.f2568e;
                int i3 = this.f2570g;
                this.f2570g = i3 + 1;
                bArr2[i3] = (byte) j2;
                return;
            }
            while ((j2 & (-128)) != 0) {
                byte[] bArr3 = this.f2568e;
                int i4 = this.f2570g;
                this.f2570g = i4 + 1;
                s1.H(bArr3, i4, (byte) ((((int) j2) & 127) | 128));
                j2 >>>= 7;
            }
            byte[] bArr4 = this.f2568e;
            int i5 = this.f2570g;
            this.f2570g = i5 + 1;
            s1.H(bArr4, i5, (byte) j2);
        }

        public final void Y0(byte[] bArr, int i2, int i3) {
            try {
                System.arraycopy(bArr, i2, this.f2568e, this.f2570g, i3);
                this.f2570g += i3;
            } catch (IndexOutOfBoundsException e2) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2570g), Integer.valueOf(this.f2569f), Integer.valueOf(i3)), e2);
            }
        }

        public final void Z0(int i2, s0 s0Var) {
            T0(i2, 2);
            G0(s0Var);
        }

        @Override // f.b.b.a.z.a.h
        public final void a(byte[] bArr, int i2, int i3) {
            Y0(bArr, i2, i3);
        }

        @Override // f.b.b.a.z.a.l
        public final int f0() {
            return this.f2569f - this.f2570g;
        }

        @Override // f.b.b.a.z.a.l
        public final void g0(byte b) {
            try {
                byte[] bArr = this.f2568e;
                int i2 = this.f2570g;
                this.f2570g = i2 + 1;
                bArr[i2] = b;
            } catch (IndexOutOfBoundsException e2) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2570g), Integer.valueOf(this.f2569f), 1), e2);
            }
        }

        @Override // f.b.b.a.z.a.l
        public final void h0(int i2, boolean z) {
            T0(i2, 0);
            g0(z ? (byte) 1 : (byte) 0);
        }

        @Override // f.b.b.a.z.a.l
        public final void k0(byte[] bArr, int i2, int i3) {
            V0(i3);
            Y0(bArr, i2, i3);
        }

        @Override // f.b.b.a.z.a.l
        public final void l0(int i2, i iVar) {
            T0(i2, 2);
            m0(iVar);
        }

        @Override // f.b.b.a.z.a.l
        public final void m0(i iVar) {
            V0(iVar.size());
            iVar.D(this);
        }

        @Override // f.b.b.a.z.a.l
        public final void r0(int i2, int i3) {
            T0(i2, 5);
            s0(i3);
        }

        @Override // f.b.b.a.z.a.l
        public final void s0(int i2) {
            try {
                byte[] bArr = this.f2568e;
                int i3 = this.f2570g;
                int i4 = i3 + 1;
                this.f2570g = i4;
                bArr[i3] = (byte) (i2 & 255);
                int i5 = i4 + 1;
                this.f2570g = i5;
                bArr[i4] = (byte) ((i2 >> 8) & 255);
                int i6 = i5 + 1;
                this.f2570g = i6;
                bArr[i5] = (byte) ((i2 >> 16) & 255);
                this.f2570g = i6 + 1;
                bArr[i6] = (byte) ((i2 >> 24) & 255);
            } catch (IndexOutOfBoundsException e2) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2570g), Integer.valueOf(this.f2569f), 1), e2);
            }
        }

        @Override // f.b.b.a.z.a.l
        public final void t0(int i2, long j2) {
            T0(i2, 1);
            u0(j2);
        }

        @Override // f.b.b.a.z.a.l
        public final void u0(long j2) {
            try {
                byte[] bArr = this.f2568e;
                int i2 = this.f2570g;
                int i3 = i2 + 1;
                this.f2570g = i3;
                bArr[i2] = (byte) (((int) j2) & 255);
                int i4 = i3 + 1;
                this.f2570g = i4;
                bArr[i3] = (byte) (((int) (j2 >> 8)) & 255);
                int i5 = i4 + 1;
                this.f2570g = i5;
                bArr[i4] = (byte) (((int) (j2 >> 16)) & 255);
                int i6 = i5 + 1;
                this.f2570g = i6;
                bArr[i5] = (byte) (((int) (j2 >> 24)) & 255);
                int i7 = i6 + 1;
                this.f2570g = i7;
                bArr[i6] = (byte) (((int) (j2 >> 32)) & 255);
                int i8 = i7 + 1;
                this.f2570g = i8;
                bArr[i7] = (byte) (((int) (j2 >> 40)) & 255);
                int i9 = i8 + 1;
                this.f2570g = i9;
                bArr[i8] = (byte) (((int) (j2 >> 48)) & 255);
                this.f2570g = i9 + 1;
                bArr[i9] = (byte) (((int) (j2 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e2) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2570g), Integer.valueOf(this.f2569f), 1), e2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends IOException {
        c(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }

        c(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    private l() {
    }

    public static int A(int i2, f0 f0Var) {
        return U(i2) + B(f0Var);
    }

    public static int B(f0 f0Var) {
        return C(f0Var.b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int C(int i2) {
        return W(i2) + i2;
    }

    public static int D(int i2, s0 s0Var) {
        return (U(1) * 2) + V(2, i2) + E(3, s0Var);
    }

    public static int E(int i2, s0 s0Var) {
        return U(i2) + G(s0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int F(int i2, s0 s0Var, h1 h1Var) {
        return U(i2) + H(s0Var, h1Var);
    }

    public static int G(s0 s0Var) {
        return C(s0Var.e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int H(s0 s0Var, h1 h1Var) {
        return C(((f.b.b.a.z.a.a) s0Var).m(h1Var));
    }

    public static int I(int i2, i iVar) {
        return (U(1) * 2) + V(2, i2) + g(3, iVar);
    }

    @Deprecated
    public static int J(int i2) {
        return W(i2);
    }

    public static int K(int i2, int i3) {
        return U(i2) + L(i3);
    }

    public static int L(int i2) {
        return 4;
    }

    public static int M(int i2, long j2) {
        return U(i2) + N(j2);
    }

    public static int N(long j2) {
        return 8;
    }

    public static int O(int i2, int i3) {
        return U(i2) + P(i3);
    }

    public static int P(int i2) {
        return W(Z(i2));
    }

    public static int Q(int i2, long j2) {
        return U(i2) + R(j2);
    }

    public static int R(long j2) {
        return Y(a0(j2));
    }

    public static int S(int i2, String str) {
        return U(i2) + T(str);
    }

    public static int T(String str) {
        int i2;
        try {
            i2 = t1.g(str);
        } catch (t1.d unused) {
            i2 = str.getBytes(b0.a).length;
        }
        return C(i2);
    }

    public static int U(int i2) {
        return W(u1.c(i2, 0));
    }

    public static int V(int i2, int i3) {
        return U(i2) + W(i3);
    }

    public static int W(int i2) {
        if ((i2 & (-128)) == 0) {
            return 1;
        }
        if ((i2 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i2) == 0) {
            return 3;
        }
        return (i2 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int X(int i2, long j2) {
        return U(i2) + Y(j2);
    }

    public static int Y(long j2) {
        int i2;
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (j2 < 0) {
            return 10;
        }
        if (((-34359738368L) & j2) != 0) {
            i2 = 6;
            j2 >>>= 28;
        } else {
            i2 = 2;
        }
        if (((-2097152) & j2) != 0) {
            i2 += 2;
            j2 >>>= 14;
        }
        return (j2 & (-16384)) != 0 ? i2 + 1 : i2;
    }

    public static int Z(int i2) {
        return (i2 >> 31) ^ (i2 << 1);
    }

    public static long a0(long j2) {
        return (j2 >> 63) ^ (j2 << 1);
    }

    public static int d(int i2, boolean z) {
        return U(i2) + e(z);
    }

    public static l d0(byte[] bArr) {
        return e0(bArr, 0, bArr.length);
    }

    public static int e(boolean z) {
        return 1;
    }

    public static l e0(byte[] bArr, int i2, int i3) {
        return new b(bArr, i2, i3);
    }

    public static int f(byte[] bArr) {
        return C(bArr.length);
    }

    public static int g(int i2, i iVar) {
        return U(i2) + h(iVar);
    }

    public static int h(i iVar) {
        return C(iVar.size());
    }

    public static int i(int i2, double d2) {
        return U(i2) + j(d2);
    }

    public static int j(double d2) {
        return 8;
    }

    public static int k(int i2, int i3) {
        return U(i2) + l(i3);
    }

    public static int l(int i2) {
        return w(i2);
    }

    public static int m(int i2, int i3) {
        return U(i2) + n(i3);
    }

    public static int n(int i2) {
        return 4;
    }

    public static int o(int i2, long j2) {
        return U(i2) + p(j2);
    }

    public static int p(long j2) {
        return 8;
    }

    public static int q(int i2, float f2) {
        return U(i2) + r(f2);
    }

    public static int r(float f2) {
        return 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static int s(int i2, s0 s0Var, h1 h1Var) {
        return (U(i2) * 2) + u(s0Var, h1Var);
    }

    @Deprecated
    public static int t(s0 s0Var) {
        return s0Var.e();
    }

    @Deprecated
    static int u(s0 s0Var, h1 h1Var) {
        return ((f.b.b.a.z.a.a) s0Var).m(h1Var);
    }

    public static int v(int i2, int i3) {
        return U(i2) + w(i3);
    }

    public static int w(int i2) {
        if (i2 >= 0) {
            return W(i2);
        }
        return 10;
    }

    public static int x(int i2, long j2) {
        return U(i2) + y(j2);
    }

    public static int y(long j2) {
        return Y(j2);
    }

    public static int z(int i2, f0 f0Var) {
        return (U(1) * 2) + V(2, i2) + A(3, f0Var);
    }

    @Deprecated
    final void A0(s0 s0Var, h1 h1Var) {
        h1Var.e(s0Var, this.a);
    }

    public abstract void B0(int i2, int i3);

    public abstract void C0(int i2);

    public final void D0(int i2, long j2) {
        W0(i2, j2);
    }

    public final void E0(long j2) {
        X0(j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void F0(int i2, s0 s0Var, h1 h1Var);

    public abstract void G0(s0 s0Var);

    public abstract void H0(int i2, s0 s0Var);

    public abstract void I0(int i2, i iVar);

    public final void J0(int i2, int i3) {
        r0(i2, i3);
    }

    public final void K0(int i2) {
        s0(i2);
    }

    public final void L0(int i2, long j2) {
        t0(i2, j2);
    }

    public final void M0(long j2) {
        u0(j2);
    }

    public final void N0(int i2, int i3) {
        U0(i2, Z(i3));
    }

    public final void O0(int i2) {
        V0(Z(i2));
    }

    public final void P0(int i2, long j2) {
        W0(i2, a0(j2));
    }

    public final void Q0(long j2) {
        X0(a0(j2));
    }

    public abstract void R0(int i2, String str);

    public abstract void S0(String str);

    public abstract void T0(int i2, int i3);

    public abstract void U0(int i2, int i3);

    public abstract void V0(int i2);

    public abstract void W0(int i2, long j2);

    public abstract void X0(long j2);

    final void b0(String str, t1.d dVar) {
        c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(b0.a);
        try {
            V0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (c e2) {
            throw e2;
        } catch (IndexOutOfBoundsException e3) {
            throw new c(e3);
        }
    }

    public final void c() {
        if (f0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c0() {
        return this.b;
    }

    public abstract int f0();

    public abstract void g0(byte b2);

    public abstract void h0(int i2, boolean z);

    public final void i0(boolean z) {
        g0(z ? (byte) 1 : (byte) 0);
    }

    public final void j0(byte[] bArr) {
        k0(bArr, 0, bArr.length);
    }

    abstract void k0(byte[] bArr, int i2, int i3);

    public abstract void l0(int i2, i iVar);

    public abstract void m0(i iVar);

    public final void n0(int i2, double d2) {
        t0(i2, Double.doubleToRawLongBits(d2));
    }

    public final void o0(double d2) {
        u0(Double.doubleToRawLongBits(d2));
    }

    public final void p0(int i2, int i3) {
        B0(i2, i3);
    }

    public final void q0(int i2) {
        C0(i2);
    }

    public abstract void r0(int i2, int i3);

    public abstract void s0(int i2);

    public abstract void t0(int i2, long j2);

    public abstract void u0(long j2);

    public final void v0(int i2, float f2) {
        r0(i2, Float.floatToRawIntBits(f2));
    }

    public final void w0(float f2) {
        s0(Float.floatToRawIntBits(f2));
    }

    @Deprecated
    public final void x0(int i2, s0 s0Var) {
        T0(i2, 3);
        z0(s0Var);
        T0(i2, 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public final void y0(int i2, s0 s0Var, h1 h1Var) {
        T0(i2, 3);
        A0(s0Var, h1Var);
        T0(i2, 4);
    }

    @Deprecated
    public final void z0(s0 s0Var) {
        s0Var.c(this);
    }
}

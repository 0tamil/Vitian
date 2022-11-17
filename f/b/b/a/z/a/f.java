package f.b.b.a.z.a;

import f.b.b.a.z.a.c0;
import f.b.b.a.z.a.l0;
import f.b.b.a.z.a.u1;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
abstract class f implements g1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[u1.b.values().length];
            a = iArr;
            try {
                iArr[u1.b.n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[u1.b.r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[u1.b.f2597g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[u1.b.t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[u1.b.m.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[u1.b.l.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[u1.b.f2598h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[u1.b.f2601k.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[u1.b.f2599i.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[u1.b.q.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[u1.b.u.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[u1.b.v.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[u1.b.w.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[u1.b.x.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[u1.b.o.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[u1.b.s.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[u1.b.f2600j.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class b extends f {
        private final boolean a;
        private final byte[] b;
        private int c;

        /* renamed from: d  reason: collision with root package name */
        private int f2516d;

        /* renamed from: e  reason: collision with root package name */
        private int f2517e;

        /* renamed from: f  reason: collision with root package name */
        private int f2518f;

        public b(ByteBuffer byteBuffer, boolean z) {
            super(null);
            this.a = z;
            this.b = byteBuffer.array();
            this.c = byteBuffer.arrayOffset() + byteBuffer.position();
            this.f2516d = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        private boolean T() {
            return this.c == this.f2516d;
        }

        private byte U() {
            int i2 = this.c;
            if (i2 != this.f2516d) {
                byte[] bArr = this.b;
                this.c = i2 + 1;
                return bArr[i2];
            }
            throw c0.j();
        }

        private Object V(u1.b bVar, Class<?> cls, q qVar) {
            switch (a.a[bVar.ordinal()]) {
                case 1:
                    return Boolean.valueOf(N());
                case 2:
                    return d();
                case 3:
                    return Double.valueOf(o());
                case 4:
                    return Integer.valueOf(f());
                case 5:
                    return Integer.valueOf(J());
                case 6:
                    return Long.valueOf(n());
                case 7:
                    return Float.valueOf(t());
                case 8:
                    return Integer.valueOf(j());
                case 9:
                    return Long.valueOf(H());
                case 10:
                    return L(cls, qVar);
                case 11:
                    return Integer.valueOf(v());
                case 12:
                    return Long.valueOf(R());
                case 13:
                    return Integer.valueOf(r());
                case 14:
                    return Long.valueOf(u());
                case 15:
                    return I();
                case 16:
                    return Integer.valueOf(i());
                case 17:
                    return Long.valueOf(l());
                default:
                    throw new RuntimeException("unsupported field type.");
            }
        }

        private <T> T W(h1<T> h1Var, q qVar) {
            int i2 = this.f2518f;
            this.f2518f = u1.c(u1.a(this.f2517e), 4);
            try {
                T g2 = h1Var.g();
                h1Var.h(g2, this, qVar);
                h1Var.i(g2);
                if (this.f2517e == this.f2518f) {
                    return g2;
                }
                throw c0.g();
            } finally {
                this.f2518f = i2;
            }
        }

        private int X() {
            h0(4);
            return Y();
        }

        private int Y() {
            int i2 = this.c;
            byte[] bArr = this.b;
            this.c = i2 + 4;
            return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
        }

        private long Z() {
            h0(8);
            return a0();
        }

        private long a0() {
            int i2 = this.c;
            byte[] bArr = this.b;
            this.c = i2 + 8;
            return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
        }

        private <T> T b0(h1<T> h1Var, q qVar) {
            int e0 = e0();
            h0(e0);
            int i2 = this.f2516d;
            int i3 = this.c + e0;
            this.f2516d = i3;
            try {
                T g2 = h1Var.g();
                h1Var.h(g2, this, qVar);
                h1Var.i(g2);
                if (this.c == i3) {
                    return g2;
                }
                throw c0.g();
            } finally {
                this.f2516d = i2;
            }
        }

        private int e0() {
            int i2;
            int i3 = this.c;
            int i4 = this.f2516d;
            if (i4 != i3) {
                byte[] bArr = this.b;
                int i5 = i3 + 1;
                byte b = bArr[i3];
                if (b >= 0) {
                    this.c = i5;
                    return b;
                } else if (i4 - i5 < 9) {
                    return (int) g0();
                } else {
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
                                                    if (bArr[i8] < 0) {
                                                        throw c0.e();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i6 = i8;
                    }
                    this.c = i6;
                    return i2;
                }
            } else {
                throw c0.j();
            }
        }

        private long g0() {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                byte U = U();
                j2 |= (U & Byte.MAX_VALUE) << i2;
                if ((U & 128) == 0) {
                    return j2;
                }
            }
            throw c0.e();
        }

        private void h0(int i2) {
            if (i2 < 0 || i2 > this.f2516d - this.c) {
                throw c0.j();
            }
        }

        private void i0(int i2) {
            if (this.c != i2) {
                throw c0.j();
            }
        }

        private void j0(int i2) {
            if (u1.b(this.f2517e) != i2) {
                throw c0.d();
            }
        }

        private void k0(int i2) {
            h0(i2);
            this.c += i2;
        }

        private void l0() {
            int i2 = this.f2518f;
            this.f2518f = u1.c(u1.a(this.f2517e), 4);
            while (P() != Integer.MAX_VALUE && q()) {
            }
            if (this.f2517e == this.f2518f) {
                this.f2518f = i2;
                return;
            }
            throw c0.g();
        }

        private void m0() {
            int i2 = this.f2516d;
            int i3 = this.c;
            if (i2 - i3 >= 10) {
                byte[] bArr = this.b;
                int i4 = 0;
                while (i4 < 10) {
                    int i5 = i3 + 1;
                    if (bArr[i3] >= 0) {
                        this.c = i5;
                        return;
                    } else {
                        i4++;
                        i3 = i5;
                    }
                }
            }
            n0();
        }

        private void n0() {
            for (int i2 = 0; i2 < 10; i2++) {
                if (U() >= 0) {
                    return;
                }
            }
            throw c0.e();
        }

        private void o0(int i2) {
            h0(i2);
            if ((i2 & 3) != 0) {
                throw c0.g();
            }
        }

        private void p0(int i2) {
            h0(i2);
            if ((i2 & 7) != 0) {
                throw c0.g();
            }
        }

        @Override // f.b.b.a.z.a.g1
        public <T> T A(Class<T> cls, q qVar) {
            j0(3);
            return (T) W(d1.a().d(cls), qVar);
        }

        @Override // f.b.b.a.z.a.g1
        public void B(List<Long> list) {
            int i2;
            int i3;
            int i4;
            if (list instanceof j0) {
                j0 j0Var = (j0) list;
                int b = u1.b(this.f2517e);
                if (b == 0) {
                    do {
                        j0Var.l(H());
                        if (!T()) {
                            i4 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f2517e);
                    this.c = i4;
                    return;
                } else if (b == 2) {
                    i2 = this.c + e0();
                    while (this.c < i2) {
                        j0Var.l(f0());
                    }
                } else {
                    throw c0.d();
                }
            } else {
                int b2 = u1.b(this.f2517e);
                if (b2 == 0) {
                    do {
                        list.add(Long.valueOf(H()));
                        if (!T()) {
                            i3 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f2517e);
                    this.c = i3;
                    return;
                } else if (b2 == 2) {
                    i2 = this.c + e0();
                    while (this.c < i2) {
                        list.add(Long.valueOf(f0()));
                    }
                } else {
                    throw c0.d();
                }
            }
            i0(i2);
        }

        @Override // f.b.b.a.z.a.g1
        public void C(List<Boolean> list) {
            int i2;
            int i3;
            int i4;
            if (list instanceof g) {
                g gVar = (g) list;
                int b = u1.b(this.f2517e);
                if (b == 0) {
                    do {
                        gVar.l(N());
                        if (!T()) {
                            i4 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f2517e);
                    this.c = i4;
                    return;
                } else if (b == 2) {
                    i2 = this.c + e0();
                    while (this.c < i2) {
                        gVar.l(e0() != 0);
                    }
                } else {
                    throw c0.d();
                }
            } else {
                int b2 = u1.b(this.f2517e);
                if (b2 == 0) {
                    do {
                        list.add(Boolean.valueOf(N()));
                        if (!T()) {
                            i3 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f2517e);
                    this.c = i3;
                    return;
                } else if (b2 == 2) {
                    i2 = this.c + e0();
                    while (this.c < i2) {
                        list.add(Boolean.valueOf(e0() != 0));
                    }
                } else {
                    throw c0.d();
                }
            }
            i0(i2);
        }

        @Override // f.b.b.a.z.a.g1
        public void D(List<Long> list) {
            int i2;
            int i3;
            if (list instanceof j0) {
                j0 j0Var = (j0) list;
                int b = u1.b(this.f2517e);
                if (b == 1) {
                    do {
                        j0Var.l(R());
                        if (!T()) {
                            i3 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f2517e);
                    this.c = i3;
                } else if (b == 2) {
                    int e0 = e0();
                    p0(e0);
                    int i4 = this.c + e0;
                    while (this.c < i4) {
                        j0Var.l(a0());
                    }
                } else {
                    throw c0.d();
                }
            } else {
                int b2 = u1.b(this.f2517e);
                if (b2 == 1) {
                    do {
                        list.add(Long.valueOf(R()));
                        if (!T()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f2517e);
                    this.c = i2;
                } else if (b2 == 2) {
                    int e02 = e0();
                    p0(e02);
                    int i5 = this.c + e02;
                    while (this.c < i5) {
                        list.add(Long.valueOf(a0()));
                    }
                } else {
                    throw c0.d();
                }
            }
        }

        @Override // f.b.b.a.z.a.g1
        public String E() {
            return c0(false);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // f.b.b.a.z.a.g1
        public <T> void F(List<T> list, h1<T> h1Var, q qVar) {
            int i2;
            if (u1.b(this.f2517e) == 3) {
                int i3 = this.f2517e;
                do {
                    list.add(W(h1Var, qVar));
                    if (!T()) {
                        i2 = this.c;
                    } else {
                        return;
                    }
                } while (e0() == i3);
                this.c = i2;
                return;
            }
            throw c0.d();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // f.b.b.a.z.a.g1
        public <T> void G(List<T> list, h1<T> h1Var, q qVar) {
            int i2;
            if (u1.b(this.f2517e) == 2) {
                int i3 = this.f2517e;
                do {
                    list.add(b0(h1Var, qVar));
                    if (!T()) {
                        i2 = this.c;
                    } else {
                        return;
                    }
                } while (e0() == i3);
                this.c = i2;
                return;
            }
            throw c0.d();
        }

        @Override // f.b.b.a.z.a.g1
        public long H() {
            j0(0);
            return f0();
        }

        @Override // f.b.b.a.z.a.g1
        public String I() {
            return c0(true);
        }

        @Override // f.b.b.a.z.a.g1
        public int J() {
            j0(5);
            return X();
        }

        @Override // f.b.b.a.z.a.g1
        public void K(List<Long> list) {
            int i2;
            int i3;
            if (list instanceof j0) {
                j0 j0Var = (j0) list;
                int b = u1.b(this.f2517e);
                if (b == 1) {
                    do {
                        j0Var.l(n());
                        if (!T()) {
                            i3 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f2517e);
                    this.c = i3;
                } else if (b == 2) {
                    int e0 = e0();
                    p0(e0);
                    int i4 = this.c + e0;
                    while (this.c < i4) {
                        j0Var.l(a0());
                    }
                } else {
                    throw c0.d();
                }
            } else {
                int b2 = u1.b(this.f2517e);
                if (b2 == 1) {
                    do {
                        list.add(Long.valueOf(n()));
                        if (!T()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f2517e);
                    this.c = i2;
                } else if (b2 == 2) {
                    int e02 = e0();
                    p0(e02);
                    int i5 = this.c + e02;
                    while (this.c < i5) {
                        list.add(Long.valueOf(a0()));
                    }
                } else {
                    throw c0.d();
                }
            }
        }

        @Override // f.b.b.a.z.a.g1
        public <T> T L(Class<T> cls, q qVar) {
            j0(2);
            return (T) b0(d1.a().d(cls), qVar);
        }

        @Override // f.b.b.a.z.a.g1
        public void M(List<Integer> list) {
            int i2;
            int i3;
            int i4;
            if (list instanceof a0) {
                a0 a0Var = (a0) list;
                int b = u1.b(this.f2517e);
                if (b == 0) {
                    do {
                        a0Var.k(j());
                        if (!T()) {
                            i4 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f2517e);
                    this.c = i4;
                    return;
                } else if (b == 2) {
                    i2 = this.c + e0();
                    while (this.c < i2) {
                        a0Var.k(e0());
                    }
                } else {
                    throw c0.d();
                }
            } else {
                int b2 = u1.b(this.f2517e);
                if (b2 == 0) {
                    do {
                        list.add(Integer.valueOf(j()));
                        if (!T()) {
                            i3 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f2517e);
                    this.c = i3;
                    return;
                } else if (b2 == 2) {
                    i2 = this.c + e0();
                    while (this.c < i2) {
                        list.add(Integer.valueOf(e0()));
                    }
                } else {
                    throw c0.d();
                }
            }
            i0(i2);
        }

        @Override // f.b.b.a.z.a.g1
        public boolean N() {
            j0(0);
            return e0() != 0;
        }

        @Override // f.b.b.a.z.a.g1
        public void O(List<Integer> list) {
            int i2;
            int i3;
            if (list instanceof a0) {
                a0 a0Var = (a0) list;
                int b = u1.b(this.f2517e);
                if (b == 0) {
                    do {
                        a0Var.k(f());
                        if (!T()) {
                            i3 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f2517e);
                    this.c = i3;
                } else if (b == 2) {
                    int e0 = this.c + e0();
                    while (this.c < e0) {
                        a0Var.k(e0());
                    }
                } else {
                    throw c0.d();
                }
            } else {
                int b2 = u1.b(this.f2517e);
                if (b2 == 0) {
                    do {
                        list.add(Integer.valueOf(f()));
                        if (!T()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f2517e);
                    this.c = i2;
                } else if (b2 == 2) {
                    int e02 = this.c + e0();
                    while (this.c < e02) {
                        list.add(Integer.valueOf(e0()));
                    }
                } else {
                    throw c0.d();
                }
            }
        }

        @Override // f.b.b.a.z.a.g1
        public int P() {
            if (T()) {
                return Integer.MAX_VALUE;
            }
            int e0 = e0();
            this.f2517e = e0;
            if (e0 == this.f2518f) {
                return Integer.MAX_VALUE;
            }
            return u1.a(e0);
        }

        @Override // f.b.b.a.z.a.g1
        public void Q(List<String> list) {
            d0(list, false);
        }

        @Override // f.b.b.a.z.a.g1
        public long R() {
            j0(1);
            return Z();
        }

        @Override // f.b.b.a.z.a.g1
        public <T> T a(h1<T> h1Var, q qVar) {
            j0(3);
            return (T) W(h1Var, qVar);
        }

        @Override // f.b.b.a.z.a.g1
        public void b(List<Long> list) {
            int i2;
            int i3;
            int i4;
            if (list instanceof j0) {
                j0 j0Var = (j0) list;
                int b = u1.b(this.f2517e);
                if (b == 0) {
                    do {
                        j0Var.l(l());
                        if (!T()) {
                            i4 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f2517e);
                    this.c = i4;
                    return;
                } else if (b == 2) {
                    i2 = this.c + e0();
                    while (this.c < i2) {
                        j0Var.l(f0());
                    }
                } else {
                    throw c0.d();
                }
            } else {
                int b2 = u1.b(this.f2517e);
                if (b2 == 0) {
                    do {
                        list.add(Long.valueOf(l()));
                        if (!T()) {
                            i3 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f2517e);
                    this.c = i3;
                    return;
                } else if (b2 == 2) {
                    i2 = this.c + e0();
                    while (this.c < i2) {
                        list.add(Long.valueOf(f0()));
                    }
                } else {
                    throw c0.d();
                }
            }
            i0(i2);
        }

        @Override // f.b.b.a.z.a.g1
        public void c(List<String> list) {
            d0(list, true);
        }

        public String c0(boolean z) {
            j0(2);
            int e0 = e0();
            if (e0 == 0) {
                return "";
            }
            h0(e0);
            if (z) {
                byte[] bArr = this.b;
                int i2 = this.c;
                if (!t1.n(bArr, i2, i2 + e0)) {
                    throw c0.c();
                }
            }
            String str = new String(this.b, this.c, e0, b0.a);
            this.c += e0;
            return str;
        }

        @Override // f.b.b.a.z.a.g1
        public i d() {
            j0(2);
            int e0 = e0();
            if (e0 == 0) {
                return i.f2526f;
            }
            h0(e0);
            i C = this.a ? i.C(this.b, this.c, e0) : i.l(this.b, this.c, e0);
            this.c += e0;
            return C;
        }

        public void d0(List<String> list, boolean z) {
            int i2;
            int i3;
            if (u1.b(this.f2517e) != 2) {
                throw c0.d();
            } else if (!(list instanceof h0) || z) {
                do {
                    list.add(c0(z));
                    if (!T()) {
                        i2 = this.c;
                    } else {
                        return;
                    }
                } while (e0() == this.f2517e);
                this.c = i2;
            } else {
                h0 h0Var = (h0) list;
                do {
                    h0Var.g(d());
                    if (!T()) {
                        i3 = this.c;
                    } else {
                        return;
                    }
                } while (e0() == this.f2517e);
                this.c = i3;
            }
        }

        @Override // f.b.b.a.z.a.g1
        public void e(List<Integer> list) {
            int i2;
            int i3;
            if (list instanceof a0) {
                a0 a0Var = (a0) list;
                int b = u1.b(this.f2517e);
                if (b == 0) {
                    do {
                        a0Var.k(r());
                        if (!T()) {
                            i3 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f2517e);
                    this.c = i3;
                } else if (b == 2) {
                    int e0 = this.c + e0();
                    while (this.c < e0) {
                        a0Var.k(j.b(e0()));
                    }
                } else {
                    throw c0.d();
                }
            } else {
                int b2 = u1.b(this.f2517e);
                if (b2 == 0) {
                    do {
                        list.add(Integer.valueOf(r()));
                        if (!T()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f2517e);
                    this.c = i2;
                } else if (b2 == 2) {
                    int e02 = this.c + e0();
                    while (this.c < e02) {
                        list.add(Integer.valueOf(j.b(e0())));
                    }
                } else {
                    throw c0.d();
                }
            }
        }

        @Override // f.b.b.a.z.a.g1
        public int f() {
            j0(0);
            return e0();
        }

        public long f0() {
            long j2;
            long j3;
            long j4;
            int i2;
            int i3 = this.c;
            int i4 = this.f2516d;
            if (i4 != i3) {
                byte[] bArr = this.b;
                int i5 = i3 + 1;
                byte b = bArr[i3];
                if (b >= 0) {
                    this.c = i5;
                    return b;
                } else if (i4 - i5 < 9) {
                    return g0();
                } else {
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
                                                if (j8 < 0) {
                                                    i6 = i12 + 1;
                                                    if (bArr[i12] < 0) {
                                                        throw c0.e();
                                                    }
                                                } else {
                                                    i6 = i12;
                                                }
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
                        this.c = i6;
                        return j2;
                    }
                    j2 = i2;
                    this.c = i6;
                    return j2;
                }
            } else {
                throw c0.j();
            }
        }

        @Override // f.b.b.a.z.a.g1
        public <T> T g(h1<T> h1Var, q qVar) {
            j0(2);
            return (T) b0(h1Var, qVar);
        }

        @Override // f.b.b.a.z.a.g1
        public void h(List<Float> list) {
            int i2;
            int i3;
            if (list instanceof x) {
                x xVar = (x) list;
                int b = u1.b(this.f2517e);
                if (b == 2) {
                    int e0 = e0();
                    o0(e0);
                    int i4 = this.c + e0;
                    while (this.c < i4) {
                        xVar.k(Float.intBitsToFloat(Y()));
                    }
                } else if (b == 5) {
                    do {
                        xVar.k(t());
                        if (!T()) {
                            i3 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f2517e);
                    this.c = i3;
                } else {
                    throw c0.d();
                }
            } else {
                int b2 = u1.b(this.f2517e);
                if (b2 == 2) {
                    int e02 = e0();
                    o0(e02);
                    int i5 = this.c + e02;
                    while (this.c < i5) {
                        list.add(Float.valueOf(Float.intBitsToFloat(Y())));
                    }
                } else if (b2 == 5) {
                    do {
                        list.add(Float.valueOf(t()));
                        if (!T()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f2517e);
                    this.c = i2;
                } else {
                    throw c0.d();
                }
            }
        }

        @Override // f.b.b.a.z.a.g1
        public int i() {
            j0(0);
            return e0();
        }

        @Override // f.b.b.a.z.a.g1
        public int j() {
            j0(0);
            return e0();
        }

        @Override // f.b.b.a.z.a.g1
        public int k() {
            return this.f2517e;
        }

        @Override // f.b.b.a.z.a.g1
        public long l() {
            j0(0);
            return f0();
        }

        @Override // f.b.b.a.z.a.g1
        public void m(List<Integer> list) {
            int i2;
            int i3;
            if (list instanceof a0) {
                a0 a0Var = (a0) list;
                int b = u1.b(this.f2517e);
                if (b == 2) {
                    int e0 = e0();
                    o0(e0);
                    int i4 = this.c + e0;
                    while (this.c < i4) {
                        a0Var.k(Y());
                    }
                } else if (b == 5) {
                    do {
                        a0Var.k(J());
                        if (!T()) {
                            i3 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f2517e);
                    this.c = i3;
                } else {
                    throw c0.d();
                }
            } else {
                int b2 = u1.b(this.f2517e);
                if (b2 == 2) {
                    int e02 = e0();
                    o0(e02);
                    int i5 = this.c + e02;
                    while (this.c < i5) {
                        list.add(Integer.valueOf(Y()));
                    }
                } else if (b2 == 5) {
                    do {
                        list.add(Integer.valueOf(J()));
                        if (!T()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f2517e);
                    this.c = i2;
                } else {
                    throw c0.d();
                }
            }
        }

        @Override // f.b.b.a.z.a.g1
        public long n() {
            j0(1);
            return Z();
        }

        @Override // f.b.b.a.z.a.g1
        public double o() {
            j0(1);
            return Double.longBitsToDouble(Z());
        }

        @Override // f.b.b.a.z.a.g1
        public void p(List<Integer> list) {
            int i2;
            int i3;
            if (list instanceof a0) {
                a0 a0Var = (a0) list;
                int b = u1.b(this.f2517e);
                if (b == 2) {
                    int e0 = e0();
                    o0(e0);
                    int i4 = this.c + e0;
                    while (this.c < i4) {
                        a0Var.k(Y());
                    }
                } else if (b == 5) {
                    do {
                        a0Var.k(v());
                        if (!T()) {
                            i3 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f2517e);
                    this.c = i3;
                } else {
                    throw c0.d();
                }
            } else {
                int b2 = u1.b(this.f2517e);
                if (b2 == 2) {
                    int e02 = e0();
                    o0(e02);
                    int i5 = this.c + e02;
                    while (this.c < i5) {
                        list.add(Integer.valueOf(Y()));
                    }
                } else if (b2 == 5) {
                    do {
                        list.add(Integer.valueOf(v()));
                        if (!T()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f2517e);
                    this.c = i2;
                } else {
                    throw c0.d();
                }
            }
        }

        @Override // f.b.b.a.z.a.g1
        public boolean q() {
            int i2;
            int i3;
            if (T() || (i2 = this.f2517e) == this.f2518f) {
                return false;
            }
            int b = u1.b(i2);
            if (b != 0) {
                if (b == 1) {
                    i3 = 8;
                } else if (b == 2) {
                    i3 = e0();
                } else if (b == 3) {
                    l0();
                    return true;
                } else if (b == 5) {
                    i3 = 4;
                } else {
                    throw c0.d();
                }
                k0(i3);
                return true;
            }
            m0();
            return true;
        }

        @Override // f.b.b.a.z.a.g1
        public int r() {
            j0(0);
            return j.b(e0());
        }

        @Override // f.b.b.a.z.a.g1
        public void s(List<Long> list) {
            int i2;
            int i3;
            if (list instanceof j0) {
                j0 j0Var = (j0) list;
                int b = u1.b(this.f2517e);
                if (b == 0) {
                    do {
                        j0Var.l(u());
                        if (!T()) {
                            i3 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f2517e);
                    this.c = i3;
                } else if (b == 2) {
                    int e0 = this.c + e0();
                    while (this.c < e0) {
                        j0Var.l(j.c(f0()));
                    }
                } else {
                    throw c0.d();
                }
            } else {
                int b2 = u1.b(this.f2517e);
                if (b2 == 0) {
                    do {
                        list.add(Long.valueOf(u()));
                        if (!T()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f2517e);
                    this.c = i2;
                } else if (b2 == 2) {
                    int e02 = this.c + e0();
                    while (this.c < e02) {
                        list.add(Long.valueOf(j.c(f0())));
                    }
                } else {
                    throw c0.d();
                }
            }
        }

        @Override // f.b.b.a.z.a.g1
        public float t() {
            j0(5);
            return Float.intBitsToFloat(X());
        }

        @Override // f.b.b.a.z.a.g1
        public long u() {
            j0(0);
            return j.c(f0());
        }

        @Override // f.b.b.a.z.a.g1
        public int v() {
            j0(5);
            return X();
        }

        @Override // f.b.b.a.z.a.g1
        public void w(List<i> list) {
            int i2;
            if (u1.b(this.f2517e) == 2) {
                do {
                    list.add(d());
                    if (!T()) {
                        i2 = this.c;
                    } else {
                        return;
                    }
                } while (e0() == this.f2517e);
                this.c = i2;
                return;
            }
            throw c0.d();
        }

        @Override // f.b.b.a.z.a.g1
        public void x(List<Integer> list) {
            int i2;
            int i3;
            if (list instanceof a0) {
                a0 a0Var = (a0) list;
                int b = u1.b(this.f2517e);
                if (b == 0) {
                    do {
                        a0Var.k(i());
                        if (!T()) {
                            i3 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f2517e);
                    this.c = i3;
                } else if (b == 2) {
                    int e0 = this.c + e0();
                    while (this.c < e0) {
                        a0Var.k(e0());
                    }
                } else {
                    throw c0.d();
                }
            } else {
                int b2 = u1.b(this.f2517e);
                if (b2 == 0) {
                    do {
                        list.add(Integer.valueOf(i()));
                        if (!T()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f2517e);
                    this.c = i2;
                } else if (b2 == 2) {
                    int e02 = this.c + e0();
                    while (this.c < e02) {
                        list.add(Integer.valueOf(e0()));
                    }
                } else {
                    throw c0.d();
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // f.b.b.a.z.a.g1
        public <K, V> void y(Map<K, V> map, l0.a<K, V> aVar, q qVar) {
            j0(2);
            int e0 = e0();
            h0(e0);
            int i2 = this.f2516d;
            this.f2516d = this.c + e0;
            try {
                Object obj = aVar.b;
                Object obj2 = aVar.f2571d;
                while (true) {
                    int P = P();
                    if (P == Integer.MAX_VALUE) {
                        map.put(obj, obj2);
                        return;
                    } else if (P == 1) {
                        obj = V(aVar.a, null, null);
                    } else if (P != 2) {
                        try {
                            if (!q()) {
                                throw new c0("Unable to parse map entry.");
                                break;
                            }
                        } catch (c0.a unused) {
                            if (!q()) {
                                throw new c0("Unable to parse map entry.");
                            }
                        }
                    } else {
                        obj2 = V(aVar.c, aVar.f2571d.getClass(), qVar);
                    }
                }
            } finally {
                this.f2516d = i2;
            }
        }

        @Override // f.b.b.a.z.a.g1
        public void z(List<Double> list) {
            int i2;
            int i3;
            if (list instanceof n) {
                n nVar = (n) list;
                int b = u1.b(this.f2517e);
                if (b == 1) {
                    do {
                        nVar.k(o());
                        if (!T()) {
                            i3 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f2517e);
                    this.c = i3;
                } else if (b == 2) {
                    int e0 = e0();
                    p0(e0);
                    int i4 = this.c + e0;
                    while (this.c < i4) {
                        nVar.k(Double.longBitsToDouble(a0()));
                    }
                } else {
                    throw c0.d();
                }
            } else {
                int b2 = u1.b(this.f2517e);
                if (b2 == 1) {
                    do {
                        list.add(Double.valueOf(o()));
                        if (!T()) {
                            i2 = this.c;
                        } else {
                            return;
                        }
                    } while (e0() == this.f2517e);
                    this.c = i2;
                } else if (b2 == 2) {
                    int e02 = e0();
                    p0(e02);
                    int i5 = this.c + e02;
                    while (this.c < i5) {
                        list.add(Double.valueOf(Double.longBitsToDouble(a0())));
                    }
                } else {
                    throw c0.d();
                }
            }
        }
    }

    private f() {
    }

    /* synthetic */ f(a aVar) {
        this();
    }

    public static f S(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer, z);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }
}

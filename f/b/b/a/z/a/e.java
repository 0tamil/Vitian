package f.b.b.a.z.a;

import f.b.b.a.z.a.b0;
import f.b.b.a.z.a.u1;
import f.b.b.a.z.a.z;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[u1.b.values().length];
            a = iArr;
            try {
                iArr[u1.b.f2597g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[u1.b.f2598h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[u1.b.f2599i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[u1.b.f2600j.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[u1.b.f2601k.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[u1.b.s.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[u1.b.l.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[u1.b.v.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[u1.b.m.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[u1.b.u.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[u1.b.n.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[u1.b.w.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[u1.b.x.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[u1.b.t.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[u1.b.r.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[u1.b.o.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[u1.b.p.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[u1.b.q.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b {
        public int a;
        public long b;
        public Object c;

        /* renamed from: d  reason: collision with root package name */
        public final q f2509d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(q qVar) {
            Objects.requireNonNull(qVar);
            this.f2509d = qVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int A(int i2, byte[] bArr, int i3, int i4, b0.i<?> iVar, b bVar) {
        a0 a0Var = (a0) iVar;
        int I = I(bArr, i3, bVar);
        while (true) {
            a0Var.k(j.b(bVar.a));
            if (I >= i4) {
                break;
            }
            int I2 = I(bArr, I, bVar);
            if (i2 != bVar.a) {
                break;
            }
            I = I(bArr, I2, bVar);
        }
        return I;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int B(int i2, byte[] bArr, int i3, int i4, b0.i<?> iVar, b bVar) {
        j0 j0Var = (j0) iVar;
        int L = L(bArr, i3, bVar);
        while (true) {
            j0Var.l(j.c(bVar.b));
            if (L >= i4) {
                break;
            }
            int I = I(bArr, L, bVar);
            if (i2 != bVar.a) {
                break;
            }
            L = L(bArr, I, bVar);
        }
        return L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int C(byte[] bArr, int i2, b bVar) {
        int I = I(bArr, i2, bVar);
        int i3 = bVar.a;
        if (i3 < 0) {
            throw c0.f();
        } else if (i3 == 0) {
            bVar.c = "";
            return I;
        } else {
            bVar.c = new String(bArr, I, i3, b0.a);
            return I + i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002e -> B:6:0x000c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0017 -> B:9:0x001b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int D(int i2, byte[] bArr, int i3, int i4, b0.i<?> iVar, b bVar) {
        int I = I(bArr, i3, bVar);
        int i5 = bVar.a;
        if (i5 >= 0) {
            if (i5 != 0) {
                String str = new String(bArr, I, i5, b0.a);
                iVar.add(str);
                I += i5;
                if (I < i4) {
                    int I2 = I(bArr, I, bVar);
                    if (i2 == bVar.a) {
                        I = I(bArr, I2, bVar);
                        i5 = bVar.a;
                        if (i5 < 0) {
                            throw c0.f();
                        } else if (i5 != 0) {
                            str = new String(bArr, I, i5, b0.a);
                            iVar.add(str);
                            I += i5;
                            if (I < i4) {
                            }
                        }
                    }
                }
                return I;
            }
            iVar.add("");
            if (I < i4) {
            }
            return I;
        }
        throw c0.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001f -> B:11:0x0023). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0036 -> B:6:0x000c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int E(int i2, byte[] bArr, int i3, int i4, b0.i<?> iVar, b bVar) {
        int I = I(bArr, i3, bVar);
        int i5 = bVar.a;
        if (i5 >= 0) {
            if (i5 != 0) {
                int i6 = I + i5;
                if (t1.n(bArr, I, i6)) {
                    String str = new String(bArr, I, i5, b0.a);
                    iVar.add(str);
                    I = i6;
                    if (I < i4) {
                        int I2 = I(bArr, I, bVar);
                        if (i2 == bVar.a) {
                            I = I(bArr, I2, bVar);
                            int i7 = bVar.a;
                            if (i7 < 0) {
                                throw c0.f();
                            } else if (i7 != 0) {
                                i6 = I + i7;
                                if (t1.n(bArr, I, i6)) {
                                    str = new String(bArr, I, i7, b0.a);
                                    iVar.add(str);
                                    I = i6;
                                    if (I < i4) {
                                    }
                                } else {
                                    throw c0.c();
                                }
                            }
                        }
                    }
                    return I;
                }
                throw c0.c();
            }
            iVar.add("");
            if (I < i4) {
            }
            return I;
        }
        throw c0.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int F(byte[] bArr, int i2, b bVar) {
        int I = I(bArr, i2, bVar);
        int i3 = bVar.a;
        if (i3 < 0) {
            throw c0.f();
        } else if (i3 == 0) {
            bVar.c = "";
            return I;
        } else {
            bVar.c = t1.e(bArr, I, i3);
            return I + i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int G(int i2, byte[] bArr, int i3, int i4, p1 p1Var, b bVar) {
        if (u1.a(i2) != 0) {
            int b2 = u1.b(i2);
            if (b2 == 0) {
                int L = L(bArr, i3, bVar);
                p1Var.n(i2, Long.valueOf(bVar.b));
                return L;
            } else if (b2 == 1) {
                p1Var.n(i2, Long.valueOf(j(bArr, i3)));
                return i3 + 8;
            } else if (b2 == 2) {
                int I = I(bArr, i3, bVar);
                int i5 = bVar.a;
                if (i5 < 0) {
                    throw c0.f();
                } else if (i5 <= bArr.length - I) {
                    p1Var.n(i2, i5 == 0 ? i.f2526f : i.l(bArr, I, i5));
                    return I + i5;
                } else {
                    throw c0.j();
                }
            } else if (b2 == 3) {
                p1 l = p1.l();
                int i6 = (i2 & (-8)) | 4;
                int i7 = 0;
                while (true) {
                    if (i3 >= i4) {
                        break;
                    }
                    int I2 = I(bArr, i3, bVar);
                    int i8 = bVar.a;
                    i7 = i8;
                    if (i8 == i6) {
                        i3 = I2;
                        break;
                    }
                    i3 = G(i7, bArr, I2, i4, l, bVar);
                    i7 = i8;
                }
                if (i3 > i4 || i7 != i6) {
                    throw c0.g();
                }
                p1Var.n(i2, l);
                return i3;
            } else if (b2 == 5) {
                p1Var.n(i2, Integer.valueOf(h(bArr, i3)));
                return i3 + 4;
            } else {
                throw c0.b();
            }
        } else {
            throw c0.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int H(int i2, byte[] bArr, int i3, b bVar) {
        int i4;
        int i5;
        int i6 = i2 & 127;
        int i7 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            i5 = b2 << 7;
        } else {
            int i8 = i6 | ((b2 & Byte.MAX_VALUE) << 7);
            int i9 = i7 + 1;
            byte b3 = bArr[i7];
            if (b3 >= 0) {
                i4 = b3 << 14;
            } else {
                i6 = i8 | ((b3 & Byte.MAX_VALUE) << 14);
                i7 = i9 + 1;
                byte b4 = bArr[i9];
                if (b4 >= 0) {
                    i5 = b4 << 21;
                } else {
                    i8 = i6 | ((b4 & Byte.MAX_VALUE) << 21);
                    i9 = i7 + 1;
                    byte b5 = bArr[i7];
                    if (b5 >= 0) {
                        i4 = b5 << 28;
                    } else {
                        int i10 = i8 | ((b5 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i11 = i9 + 1;
                            if (bArr[i9] < 0) {
                                i9 = i11;
                            } else {
                                bVar.a = i10;
                                return i11;
                            }
                        }
                    }
                }
            }
            bVar.a = i8 | i4;
            return i9;
        }
        bVar.a = i6 | i5;
        return i7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int I(byte[] bArr, int i2, b bVar) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return H(b2, bArr, i3, bVar);
        }
        bVar.a = b2;
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int J(int i2, byte[] bArr, int i3, int i4, b0.i<?> iVar, b bVar) {
        a0 a0Var = (a0) iVar;
        int I = I(bArr, i3, bVar);
        while (true) {
            a0Var.k(bVar.a);
            if (I >= i4) {
                break;
            }
            int I2 = I(bArr, I, bVar);
            if (i2 != bVar.a) {
                break;
            }
            I = I(bArr, I2, bVar);
        }
        return I;
    }

    static int K(long j2, byte[] bArr, int i2, b bVar) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        long j3 = (j2 & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b2 < 0) {
            i3++;
            byte b3 = bArr[i3];
            i4 += 7;
            j3 |= (b3 & Byte.MAX_VALUE) << i4;
            b2 = b3;
        }
        bVar.b = j3;
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int L(byte[] bArr, int i2, b bVar) {
        int i3 = i2 + 1;
        long j2 = bArr[i2];
        if (j2 < 0) {
            return K(j2, bArr, i3, bVar);
        }
        bVar.b = j2;
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int M(int i2, byte[] bArr, int i3, int i4, b0.i<?> iVar, b bVar) {
        j0 j0Var = (j0) iVar;
        int L = L(bArr, i3, bVar);
        while (true) {
            j0Var.l(bVar.b);
            if (L >= i4) {
                break;
            }
            int I = I(bArr, L, bVar);
            if (i2 != bVar.a) {
                break;
            }
            L = L(bArr, I, bVar);
        }
        return L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int N(int i2, byte[] bArr, int i3, int i4, b bVar) {
        if (u1.a(i2) != 0) {
            int b2 = u1.b(i2);
            if (b2 == 0) {
                return L(bArr, i3, bVar);
            }
            if (b2 == 1) {
                return i3 + 8;
            }
            if (b2 == 2) {
                return I(bArr, i3, bVar) + bVar.a;
            }
            if (b2 == 3) {
                int i5 = (i2 & (-8)) | 4;
                int i6 = 0;
                while (i3 < i4) {
                    i3 = I(bArr, i3, bVar);
                    i6 = bVar.a;
                    if (i6 == i5) {
                        break;
                    }
                    i3 = N(i6, bArr, i3, i4, bVar);
                }
                if (i3 <= i4 && i6 == i5) {
                    return i3;
                }
                throw c0.g();
            } else if (b2 == 5) {
                return i3 + 4;
            } else {
                throw c0.b();
            }
        } else {
            throw c0.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
        r9 = L(r8, r0, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
        if (r12.b == 0) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r12.b != 0) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
        r11.l(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r9 >= r10) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        r0 = I(r8, r9, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (r7 == r12.a) goto L10;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0029 -> B:4:0x0010). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:5:0x0012 -> B:6:0x0013). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(int i2, byte[] bArr, int i3, int i4, b0.i<?> iVar, b bVar) {
        g gVar = (g) iVar;
        int L = L(bArr, i3, bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(byte[] bArr, int i2, b bVar) {
        int I = I(bArr, i2, bVar);
        int i3 = bVar.a;
        if (i3 < 0) {
            throw c0.f();
        } else if (i3 > bArr.length - I) {
            throw c0.j();
        } else if (i3 == 0) {
            bVar.c = i.f2526f;
            return I;
        } else {
            bVar.c = i.l(bArr, I, i3);
            return I + i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = I(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r2 == r7.a) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
        r4 = I(r3, r0, r7);
        r0 = r7.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r0 < 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r0 > (r3.length - r4)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
        if (r0 != 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
        throw f.b.b.a.z.a.c0.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
        throw f.b.b.a.z.a.c0.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
        if (r0 == 0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:
        r6.add(f.b.b.a.z.a.i.f2526f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
        r6.add(f.b.b.a.z.a.i.l(r3, r4, r0));
        r4 = r4 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r4 >= r5) goto L21;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0033 -> B:7:0x000e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0014 -> B:9:0x001c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(int i2, byte[] bArr, int i3, int i4, b0.i<?> iVar, b bVar) {
        int I = I(bArr, i3, bVar);
        int i5 = bVar.a;
        if (i5 < 0) {
            throw c0.f();
        } else if (i5 > bArr.length - I) {
            throw c0.j();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double d(byte[] bArr, int i2) {
        return Double.longBitsToDouble(j(bArr, i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(int i2, byte[] bArr, int i3, int i4, b0.i<?> iVar, b bVar) {
        n nVar = (n) iVar;
        nVar.k(d(bArr, i3));
        int i5 = i3 + 8;
        while (i5 < i4) {
            int I = I(bArr, i5, bVar);
            if (i2 != bVar.a) {
                break;
            }
            nVar.k(d(bArr, I));
            i5 = I + 8;
        }
        return i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static int f(int i2, byte[] bArr, int i3, int i4, z.c<?, ?> cVar, z.e<?, ?> eVar, o1<p1, p1> o1Var, b bVar) {
        Object i5;
        int i6;
        long j2;
        int i7;
        b0.i iVar;
        v<z.d> vVar = cVar.extensions;
        int i8 = i2 >>> 3;
        Object obj = null;
        if (!eVar.b.f() || !eVar.b.o()) {
            if (eVar.a() == u1.b.t) {
                i3 = I(bArr, i3, bVar);
                if (eVar.b.c().a(bVar.a) == null) {
                    p1 p1Var = cVar.unknownFields;
                    if (p1Var == p1.e()) {
                        p1Var = p1.l();
                        cVar.unknownFields = p1Var;
                    }
                    j1.L(i8, bVar.a, p1Var, o1Var);
                    return i3;
                }
            } else {
                switch (a.a[eVar.a().ordinal()]) {
                    case 1:
                        obj = Double.valueOf(d(bArr, i3));
                        i3 += 8;
                        break;
                    case 2:
                        obj = Float.valueOf(l(bArr, i3));
                        i3 += 4;
                        break;
                    case 3:
                    case 4:
                        i3 = L(bArr, i3, bVar);
                        j2 = bVar.b;
                        obj = Long.valueOf(j2);
                        break;
                    case 5:
                    case 6:
                        i3 = I(bArr, i3, bVar);
                        break;
                    case 7:
                    case 8:
                        obj = Long.valueOf(j(bArr, i3));
                        i3 += 8;
                        break;
                    case 9:
                    case 10:
                        obj = Integer.valueOf(h(bArr, i3));
                        i3 += 4;
                        break;
                    case 11:
                        i3 = L(bArr, i3, bVar);
                        obj = Boolean.valueOf(bVar.b != 0);
                        break;
                    case 12:
                        i3 = I(bArr, i3, bVar);
                        i6 = j.b(bVar.a);
                        obj = Integer.valueOf(i6);
                        break;
                    case 13:
                        i3 = L(bArr, i3, bVar);
                        j2 = j.c(bVar.b);
                        obj = Long.valueOf(j2);
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        i3 = b(bArr, i3, bVar);
                        obj = bVar.c;
                        break;
                    case 16:
                        i3 = C(bArr, i3, bVar);
                        obj = bVar.c;
                        break;
                    case 17:
                        i3 = n(d1.a().d(eVar.b().getClass()), bArr, i3, i4, (i8 << 3) | 4, bVar);
                        obj = bVar.c;
                        break;
                    case 18:
                        i3 = p(d1.a().d(eVar.b().getClass()), bArr, i3, i4, bVar);
                        obj = bVar.c;
                        break;
                }
                if (!eVar.d()) {
                    vVar.a(eVar.b, obj);
                } else {
                    int i9 = a.a[eVar.a().ordinal()];
                    if ((i9 == 17 || i9 == 18) && (i5 = vVar.i(eVar.b)) != null) {
                        obj = b0.h(i5, obj);
                    }
                    vVar.x(eVar.b, obj);
                }
                return i3;
            }
            i6 = bVar.a;
            obj = Integer.valueOf(i6);
            if (!eVar.d()) {
            }
            return i3;
        }
        switch (a.a[eVar.a().ordinal()]) {
            case 1:
                iVar = new n();
                i7 = s(bArr, i3, iVar, bVar);
                break;
            case 2:
                iVar = new x();
                i7 = v(bArr, i3, iVar, bVar);
                break;
            case 3:
            case 4:
                iVar = new j0();
                i7 = z(bArr, i3, iVar, bVar);
                break;
            case 5:
            case 6:
                iVar = new a0();
                i7 = y(bArr, i3, iVar, bVar);
                break;
            case 7:
            case 8:
                iVar = new j0();
                i7 = u(bArr, i3, iVar, bVar);
                break;
            case 9:
            case 10:
                iVar = new a0();
                i7 = t(bArr, i3, iVar, bVar);
                break;
            case 11:
                iVar = new g();
                i7 = r(bArr, i3, iVar, bVar);
                break;
            case 12:
                iVar = new a0();
                i7 = w(bArr, i3, iVar, bVar);
                break;
            case 13:
                iVar = new j0();
                i7 = x(bArr, i3, iVar, bVar);
                break;
            case 14:
                a0 a0Var = new a0();
                int y = y(bArr, i3, a0Var, bVar);
                p1 p1Var2 = cVar.unknownFields;
                if (p1Var2 != p1.e()) {
                    obj = p1Var2;
                }
                p1 p1Var3 = (p1) j1.z(i8, a0Var, eVar.b.c(), obj, o1Var);
                if (p1Var3 != null) {
                    cVar.unknownFields = p1Var3;
                }
                vVar.x(eVar.b, a0Var);
                return y;
            default:
                throw new IllegalStateException("Type cannot be packed: " + eVar.b.i());
        }
        vVar.x(eVar.b, iVar);
        return i7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(int i2, byte[] bArr, int i3, int i4, Object obj, s0 s0Var, o1<p1, p1> o1Var, b bVar) {
        z.e a2 = bVar.f2509d.a(s0Var, i2 >>> 3);
        if (a2 == null) {
            return G(i2, bArr, i3, i4, v0.w(obj), bVar);
        }
        z.c cVar = (z.c) obj;
        cVar.N();
        return f(i2, bArr, i3, i4, cVar, a2, o1Var, bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(int i2, byte[] bArr, int i3, int i4, b0.i<?> iVar, b bVar) {
        a0 a0Var = (a0) iVar;
        a0Var.k(h(bArr, i3));
        int i5 = i3 + 4;
        while (i5 < i4) {
            int I = I(bArr, i5, bVar);
            if (i2 != bVar.a) {
                break;
            }
            a0Var.k(h(bArr, I));
            i5 = I + 4;
        }
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long j(byte[] bArr, int i2) {
        return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int k(int i2, byte[] bArr, int i3, int i4, b0.i<?> iVar, b bVar) {
        j0 j0Var = (j0) iVar;
        j0Var.l(j(bArr, i3));
        int i5 = i3 + 8;
        while (i5 < i4) {
            int I = I(bArr, i5, bVar);
            if (i2 != bVar.a) {
                break;
            }
            j0Var.l(j(bArr, I));
            i5 = I + 8;
        }
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float l(byte[] bArr, int i2) {
        return Float.intBitsToFloat(h(bArr, i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int m(int i2, byte[] bArr, int i3, int i4, b0.i<?> iVar, b bVar) {
        x xVar = (x) iVar;
        xVar.k(l(bArr, i3));
        int i5 = i3 + 4;
        while (i5 < i4) {
            int I = I(bArr, i5, bVar);
            if (i2 != bVar.a) {
                break;
            }
            xVar.k(l(bArr, I));
            i5 = I + 4;
        }
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int n(h1 h1Var, byte[] bArr, int i2, int i3, int i4, b bVar) {
        v0 v0Var = (v0) h1Var;
        Object g2 = v0Var.g();
        int d0 = v0Var.d0(g2, bArr, i2, i3, i4, bVar);
        v0Var.i(g2);
        bVar.c = g2;
        return d0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int o(h1 h1Var, int i2, byte[] bArr, int i3, int i4, b0.i<?> iVar, b bVar) {
        int i5 = (i2 & (-8)) | 4;
        int n = n(h1Var, bArr, i3, i4, i5, bVar);
        while (true) {
            iVar.add(bVar.c);
            if (n >= i4) {
                break;
            }
            int I = I(bArr, n, bVar);
            if (i2 != bVar.a) {
                break;
            }
            n = n(h1Var, bArr, I, i4, i5, bVar);
        }
        return n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int p(h1 h1Var, byte[] bArr, int i2, int i3, b bVar) {
        int i4 = i2 + 1;
        int i5 = bArr[i2];
        if (i5 < 0) {
            i4 = H(i5, bArr, i4, bVar);
            i5 = bVar.a;
        }
        int i6 = i4;
        if (i5 < 0 || i5 > i3 - i6) {
            throw c0.j();
        }
        Object g2 = h1Var.g();
        int i7 = i5 + i6;
        h1Var.d(g2, bArr, i6, i7, bVar);
        h1Var.i(g2);
        bVar.c = g2;
        return i7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int q(h1<?> h1Var, int i2, byte[] bArr, int i3, int i4, b0.i<?> iVar, b bVar) {
        int p = p(h1Var, bArr, i3, i4, bVar);
        while (true) {
            iVar.add(bVar.c);
            if (p >= i4) {
                break;
            }
            int I = I(bArr, p, bVar);
            if (i2 != bVar.a) {
                break;
            }
            p = p(h1Var, bArr, I, i4, bVar);
        }
        return p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int r(byte[] bArr, int i2, b0.i<?> iVar, b bVar) {
        g gVar = (g) iVar;
        int I = I(bArr, i2, bVar);
        int i3 = bVar.a + I;
        while (I < i3) {
            I = L(bArr, I, bVar);
            gVar.l(bVar.b != 0);
        }
        if (I == i3) {
            return I;
        }
        throw c0.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int s(byte[] bArr, int i2, b0.i<?> iVar, b bVar) {
        n nVar = (n) iVar;
        int I = I(bArr, i2, bVar);
        int i3 = bVar.a + I;
        while (I < i3) {
            nVar.k(d(bArr, I));
            I += 8;
        }
        if (I == i3) {
            return I;
        }
        throw c0.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int t(byte[] bArr, int i2, b0.i<?> iVar, b bVar) {
        a0 a0Var = (a0) iVar;
        int I = I(bArr, i2, bVar);
        int i3 = bVar.a + I;
        while (I < i3) {
            a0Var.k(h(bArr, I));
            I += 4;
        }
        if (I == i3) {
            return I;
        }
        throw c0.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int u(byte[] bArr, int i2, b0.i<?> iVar, b bVar) {
        j0 j0Var = (j0) iVar;
        int I = I(bArr, i2, bVar);
        int i3 = bVar.a + I;
        while (I < i3) {
            j0Var.l(j(bArr, I));
            I += 8;
        }
        if (I == i3) {
            return I;
        }
        throw c0.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int v(byte[] bArr, int i2, b0.i<?> iVar, b bVar) {
        x xVar = (x) iVar;
        int I = I(bArr, i2, bVar);
        int i3 = bVar.a + I;
        while (I < i3) {
            xVar.k(l(bArr, I));
            I += 4;
        }
        if (I == i3) {
            return I;
        }
        throw c0.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int w(byte[] bArr, int i2, b0.i<?> iVar, b bVar) {
        a0 a0Var = (a0) iVar;
        int I = I(bArr, i2, bVar);
        int i3 = bVar.a + I;
        while (I < i3) {
            I = I(bArr, I, bVar);
            a0Var.k(j.b(bVar.a));
        }
        if (I == i3) {
            return I;
        }
        throw c0.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int x(byte[] bArr, int i2, b0.i<?> iVar, b bVar) {
        j0 j0Var = (j0) iVar;
        int I = I(bArr, i2, bVar);
        int i3 = bVar.a + I;
        while (I < i3) {
            I = L(bArr, I, bVar);
            j0Var.l(j.c(bVar.b));
        }
        if (I == i3) {
            return I;
        }
        throw c0.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int y(byte[] bArr, int i2, b0.i<?> iVar, b bVar) {
        a0 a0Var = (a0) iVar;
        int I = I(bArr, i2, bVar);
        int i3 = bVar.a + I;
        while (I < i3) {
            I = I(bArr, I, bVar);
            a0Var.k(bVar.a);
        }
        if (I == i3) {
            return I;
        }
        throw c0.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int z(byte[] bArr, int i2, b0.i<?> iVar, b bVar) {
        j0 j0Var = (j0) iVar;
        int I = I(bArr, i2, bVar);
        int i3 = bVar.a + I;
        while (I < i3) {
            I = L(bArr, I, bVar);
            j0Var.l(bVar.b);
        }
        if (I == i3) {
            return I;
        }
        throw c0.j();
    }
}

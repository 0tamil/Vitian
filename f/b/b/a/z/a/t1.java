package f.b.b.a.z.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class t1 {
    private static final b a;

    /* loaded from: classes.dex */
    private static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static void h(byte b, byte b2, byte b3, byte b4, char[] cArr, int i2) {
            if (m(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m(b3) || m(b4)) {
                throw c0.c();
            }
            int r = ((b & 7) << 18) | (r(b2) << 12) | (r(b3) << 6) | r(b4);
            cArr[i2] = l(r);
            cArr[i2 + 1] = q(r);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void i(byte b, char[] cArr, int i2) {
            cArr[i2] = (char) b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void j(byte b, byte b2, byte b3, char[] cArr, int i2) {
            if (m(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m(b3)))) {
                throw c0.c();
            }
            cArr[i2] = (char) (((b & 15) << 12) | (r(b2) << 6) | r(b3));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void k(byte b, byte b2, char[] cArr, int i2) {
            if (b < -62 || m(b2)) {
                throw c0.c();
            }
            cArr[i2] = (char) (((b & 31) << 6) | r(b2));
        }

        private static char l(int i2) {
            return (char) ((i2 >>> 10) + 55232);
        }

        private static boolean m(byte b) {
            return b > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean n(byte b) {
            return b >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean o(byte b) {
            return b < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean p(byte b) {
            return b < -32;
        }

        private static char q(int i2) {
            return (char) ((i2 & 1023) + 56320);
        }

        private static int r(byte b) {
            return b & 63;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class b {
        b() {
        }

        abstract String a(byte[] bArr, int i2, int i3);

        abstract int b(CharSequence charSequence, byte[] bArr, int i2, int i3);

        final boolean c(byte[] bArr, int i2, int i3) {
            return d(0, bArr, i2, i3) == 0;
        }

        abstract int d(int i2, byte[] bArr, int i3, int i4);
    }

    /* loaded from: classes.dex */
    static final class c extends b {
        c() {
        }

        private static int e(byte[] bArr, int i2, int i3) {
            while (i2 < i3 && bArr[i2] >= 0) {
                i2++;
            }
            if (i2 >= i3) {
                return 0;
            }
            return f(bArr, i2, i3);
        }

        private static int f(byte[] bArr, int i2, int i3) {
            while (i2 < i3) {
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b < 0) {
                    if (b < -32) {
                        if (i4 >= i3) {
                            return b;
                        }
                        if (b >= -62) {
                            i2 = i4 + 1;
                            if (bArr[i4] > -65) {
                            }
                        }
                        return -1;
                    } else if (b < -16) {
                        if (i4 >= i3 - 1) {
                            return t1.l(bArr, i4, i3);
                        }
                        int i5 = i4 + 1;
                        byte b2 = bArr[i4];
                        if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                            i2 = i5 + 1;
                            if (bArr[i5] > -65) {
                            }
                        }
                        return -1;
                    } else if (i4 >= i3 - 2) {
                        return t1.l(bArr, i4, i3);
                    } else {
                        int i6 = i4 + 1;
                        byte b3 = bArr[i4];
                        if (b3 <= -65 && (((b << 28) + (b3 + 112)) >> 30) == 0) {
                            int i7 = i6 + 1;
                            if (bArr[i6] <= -65) {
                                i4 = i7 + 1;
                                if (bArr[i7] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                }
                i2 = i4;
            }
            return 0;
        }

        @Override // f.b.b.a.z.a.t1.b
        String a(byte[] bArr, int i2, int i3) {
            if ((i2 | i3 | ((bArr.length - i2) - i3)) >= 0) {
                int i4 = i2 + i3;
                char[] cArr = new char[i3];
                int i5 = 0;
                while (i2 < i4) {
                    byte b = bArr[i2];
                    if (!a.n(b)) {
                        break;
                    }
                    i2++;
                    i5++;
                    a.i(b, cArr, i5);
                }
                int i6 = i5;
                while (i2 < i4) {
                    int i7 = i2 + 1;
                    byte b2 = bArr[i2];
                    if (a.n(b2)) {
                        int i8 = i6 + 1;
                        a.i(b2, cArr, i6);
                        while (i7 < i4) {
                            byte b3 = bArr[i7];
                            if (!a.n(b3)) {
                                break;
                            }
                            i7++;
                            i8++;
                            a.i(b3, cArr, i8);
                        }
                        i2 = i7;
                        i6 = i8;
                    } else if (a.p(b2)) {
                        if (i7 < i4) {
                            i2 = i7 + 1;
                            i6++;
                            a.k(b2, bArr[i7], cArr, i6);
                        } else {
                            throw c0.c();
                        }
                    } else if (a.o(b2)) {
                        if (i7 < i4 - 1) {
                            int i9 = i7 + 1;
                            i2 = i9 + 1;
                            i6++;
                            a.j(b2, bArr[i7], bArr[i9], cArr, i6);
                        } else {
                            throw c0.c();
                        }
                    } else if (i7 < i4 - 2) {
                        int i10 = i7 + 1;
                        byte b4 = bArr[i7];
                        int i11 = i10 + 1;
                        i2 = i11 + 1;
                        a.h(b2, b4, bArr[i10], bArr[i11], cArr, i6);
                        i6 = i6 + 1 + 1;
                    } else {
                        throw c0.c();
                    }
                }
                return new String(cArr, 0, i6);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
            return r10 + r0;
         */
        @Override // f.b.b.a.z.a.t1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        int b(CharSequence charSequence, byte[] bArr, int i2, int i3) {
            int i4;
            int i5;
            int i6;
            char charAt;
            int length = charSequence.length();
            int i7 = i3 + i2;
            int i8 = 0;
            while (i8 < length && (i6 = i8 + i2) < i7 && (charAt = charSequence.charAt(i8)) < 128) {
                bArr[i6] = (byte) charAt;
                i8++;
            }
            int i9 = i2 + i8;
            while (i8 < length) {
                char charAt2 = charSequence.charAt(i8);
                if (charAt2 >= 128 || i9 >= i7) {
                    if (charAt2 < 2048 && i9 <= i7 - 2) {
                        int i10 = i9 + 1;
                        bArr[i9] = (byte) ((charAt2 >>> 6) | 960);
                        i9 = i10 + 1;
                        bArr[i10] = (byte) ((charAt2 & '?') | 128);
                    } else if ((charAt2 < 55296 || 57343 < charAt2) && i9 <= i7 - 3) {
                        int i11 = i9 + 1;
                        bArr[i9] = (byte) ((charAt2 >>> '\f') | 480);
                        int i12 = i11 + 1;
                        bArr[i11] = (byte) (((charAt2 >>> 6) & 63) | 128);
                        i5 = i12 + 1;
                        bArr[i12] = (byte) ((charAt2 & '?') | 128);
                    } else if (i9 <= i7 - 4) {
                        int i13 = i8 + 1;
                        if (i13 != charSequence.length()) {
                            char charAt3 = charSequence.charAt(i13);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                int i14 = i9 + 1;
                                bArr[i9] = (byte) ((codePoint >>> 18) | 240);
                                int i15 = i14 + 1;
                                bArr[i14] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i16 = i15 + 1;
                                bArr[i15] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i9 = i16 + 1;
                                bArr[i16] = (byte) ((codePoint & 63) | 128);
                                i8 = i13;
                            } else {
                                i8 = i13;
                            }
                        }
                        throw new d(i8 - 1, length);
                    } else if (55296 > charAt2 || charAt2 > 57343 || ((i4 = i8 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i4)))) {
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i9);
                    } else {
                        throw new d(i8, length);
                    }
                    i8++;
                } else {
                    i5 = i9 + 1;
                    bArr[i9] = (byte) charAt2;
                }
                i9 = i5;
                i8++;
            }
            return i9;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
            if (r8[r9] > (-65)) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0046, code lost:
            if (r8[r9] > (-65)) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x007f, code lost:
            if (r8[r9] > (-65)) goto L52;
         */
        @Override // f.b.b.a.z.a.t1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        int d(int i2, byte[] bArr, int i3, int i4) {
            int i5;
            if (i2 != 0) {
                if (i3 >= i4) {
                    return i2;
                }
                byte b = (byte) i2;
                if (b < -32) {
                    if (b >= -62) {
                        i5 = i3 + 1;
                    }
                    return -1;
                } else if (b < -16) {
                    byte b2 = (byte) (~(i2 >> 8));
                    if (b2 == 0) {
                        int i6 = i3 + 1;
                        byte b3 = bArr[i3];
                        if (i6 >= i4) {
                            return t1.j(b, b3);
                        }
                        i3 = i6;
                        b2 = b3;
                    }
                    if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                        i5 = i3 + 1;
                    }
                    return -1;
                } else {
                    byte b4 = (byte) (~(i2 >> 8));
                    byte b5 = 0;
                    if (b4 == 0) {
                        int i7 = i3 + 1;
                        b4 = bArr[i3];
                        if (i7 >= i4) {
                            return t1.j(b, b4);
                        }
                        i3 = i7;
                    } else {
                        b5 = (byte) (i2 >> 16);
                    }
                    if (b5 == 0) {
                        int i8 = i3 + 1;
                        b5 = bArr[i3];
                        if (i8 >= i4) {
                            return t1.k(b, b4, b5);
                        }
                        i3 = i8;
                    }
                    if (b4 <= -65 && (((b << 28) + (b4 + 112)) >> 30) == 0 && b5 <= -65) {
                        i5 = i3 + 1;
                    }
                    return -1;
                }
                i3 = i5;
            }
            return e(bArr, i3, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d extends IllegalArgumentException {
        d(int i2, int i3) {
            super("Unpaired surrogate at index " + i2 + " of " + i3);
        }
    }

    /* loaded from: classes.dex */
    static final class e extends b {
        e() {
        }

        static boolean e() {
            return s1.C() && s1.D();
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x008e, code lost:
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static int f(byte[] bArr, long j2, int i2) {
            long j3;
            int g2 = g(bArr, j2, i2);
            int i3 = i2 - g2;
            long j4 = j2 + g2;
            while (true) {
                byte b = 0;
                while (true) {
                    if (i3 <= 0) {
                        break;
                    }
                    long j5 = j4 + 1;
                    b = s1.s(bArr, j4);
                    if (b < 0) {
                        j4 = j5;
                        break;
                    }
                    i3--;
                    j4 = j5;
                }
                if (i3 == 0) {
                    return 0;
                }
                int i4 = i3 - 1;
                if (b >= -32) {
                    if (b >= -16) {
                        if (i4 >= 3) {
                            i3 = i4 - 3;
                            long j6 = j4 + 1;
                            byte s = s1.s(bArr, j4);
                            if (s > -65 || (((b << 28) + (s + 112)) >> 30) != 0) {
                                break;
                            }
                            long j7 = j6 + 1;
                            if (s1.s(bArr, j6) > -65) {
                                break;
                            }
                            j3 = 1 + j7;
                            if (s1.s(bArr, j7) > -65) {
                                break;
                            }
                        } else {
                            return h(bArr, b, j4, i4);
                        }
                    } else if (i4 >= 2) {
                        i3 = i4 - 2;
                        long j8 = j4 + 1;
                        byte s2 = s1.s(bArr, j4);
                        if (s2 > -65 || ((b == -32 && s2 < -96) || (b == -19 && s2 >= -96))) {
                            break;
                        }
                        j3 = 1 + j8;
                        if (s1.s(bArr, j8) > -65) {
                            break;
                        }
                    } else {
                        return h(bArr, b, j4, i4);
                    }
                } else if (i4 != 0) {
                    i3 = i4 - 1;
                    if (b < -62) {
                        break;
                    }
                    j3 = 1 + j4;
                    if (s1.s(bArr, j4) > -65) {
                        break;
                    }
                } else {
                    return b;
                }
                j4 = j3;
            }
        }

        private static int g(byte[] bArr, long j2, int i2) {
            if (i2 < 16) {
                return 0;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                j2 = 1 + j2;
                if (s1.s(bArr, j2) < 0) {
                    return i3;
                }
            }
            return i2;
        }

        private static int h(byte[] bArr, int i2, long j2, int i3) {
            if (i3 == 0) {
                return t1.i(i2);
            }
            if (i3 == 1) {
                return t1.j(i2, s1.s(bArr, j2));
            }
            if (i3 == 2) {
                return t1.k(i2, s1.s(bArr, j2), s1.s(bArr, j2 + 1));
            }
            throw new AssertionError();
        }

        @Override // f.b.b.a.z.a.t1.b
        String a(byte[] bArr, int i2, int i3) {
            if ((i2 | i3 | ((bArr.length - i2) - i3)) >= 0) {
                int i4 = i2 + i3;
                char[] cArr = new char[i3];
                int i5 = 0;
                while (i2 < i4) {
                    byte s = s1.s(bArr, i2);
                    if (!a.n(s)) {
                        break;
                    }
                    i2++;
                    i5++;
                    a.i(s, cArr, i5);
                }
                int i6 = i5;
                while (i2 < i4) {
                    int i7 = i2 + 1;
                    byte s2 = s1.s(bArr, i2);
                    if (a.n(s2)) {
                        int i8 = i6 + 1;
                        a.i(s2, cArr, i6);
                        while (i7 < i4) {
                            byte s3 = s1.s(bArr, i7);
                            if (!a.n(s3)) {
                                break;
                            }
                            i7++;
                            i8++;
                            a.i(s3, cArr, i8);
                        }
                        i2 = i7;
                        i6 = i8;
                    } else if (a.p(s2)) {
                        if (i7 < i4) {
                            i2 = i7 + 1;
                            i6++;
                            a.k(s2, s1.s(bArr, i7), cArr, i6);
                        } else {
                            throw c0.c();
                        }
                    } else if (a.o(s2)) {
                        if (i7 < i4 - 1) {
                            int i9 = i7 + 1;
                            i2 = i9 + 1;
                            i6++;
                            a.j(s2, s1.s(bArr, i7), s1.s(bArr, i9), cArr, i6);
                        } else {
                            throw c0.c();
                        }
                    } else if (i7 < i4 - 2) {
                        int i10 = i7 + 1;
                        int i11 = i10 + 1;
                        i2 = i11 + 1;
                        a.h(s2, s1.s(bArr, i7), s1.s(bArr, i10), s1.s(bArr, i11), cArr, i6);
                        i6 = i6 + 1 + 1;
                    } else {
                        throw c0.c();
                    }
                }
                return new String(cArr, 0, i6);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }

        @Override // f.b.b.a.z.a.t1.b
        int b(CharSequence charSequence, byte[] bArr, int i2, int i3) {
            char c;
            long j2;
            long j3;
            long j4;
            int i4;
            char charAt;
            long j5 = i2;
            long j6 = i3 + j5;
            int length = charSequence.length();
            if (length > i3 || bArr.length - i3 < i2) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i2 + i3));
            }
            int i5 = 0;
            while (true) {
                c = 128;
                j2 = 1;
                if (i5 >= length || (charAt = charSequence.charAt(i5)) >= 128) {
                    break;
                }
                j5 = 1 + j5;
                s1.H(bArr, j5, (byte) charAt);
                i5++;
            }
            if (i5 == length) {
                return (int) j5;
            }
            while (i5 < length) {
                char charAt2 = charSequence.charAt(i5);
                if (charAt2 >= c || j5 >= j6) {
                    if (charAt2 < 2048 && j5 <= j6 - 2) {
                        long j7 = j5 + j2;
                        s1.H(bArr, j5, (byte) ((charAt2 >>> 6) | 960));
                        j3 = j7 + j2;
                        s1.H(bArr, j7, (byte) ((charAt2 & '?') | 128));
                        j4 = j2;
                    } else if ((charAt2 < 55296 || 57343 < charAt2) && j5 <= j6 - 3) {
                        long j8 = j5 + j2;
                        s1.H(bArr, j5, (byte) ((charAt2 >>> '\f') | 480));
                        long j9 = j8 + j2;
                        s1.H(bArr, j8, (byte) (((charAt2 >>> 6) & 63) | 128));
                        j3 = j9 + 1;
                        s1.H(bArr, j9, (byte) ((charAt2 & '?') | 128));
                        j4 = 1;
                    } else if (j5 <= j6 - 4) {
                        int i6 = i5 + 1;
                        if (i6 != length) {
                            char charAt3 = charSequence.charAt(i6);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                long j10 = j5 + 1;
                                s1.H(bArr, j5, (byte) ((codePoint >>> 18) | 240));
                                long j11 = j10 + 1;
                                s1.H(bArr, j10, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j12 = j11 + 1;
                                s1.H(bArr, j11, (byte) (((codePoint >>> 6) & 63) | 128));
                                j4 = 1;
                                j3 = j12 + 1;
                                s1.H(bArr, j12, (byte) ((codePoint & 63) | 128));
                                i5 = i6;
                            } else {
                                i5 = i6;
                            }
                        }
                        throw new d(i5 - 1, length);
                    } else if (55296 > charAt2 || charAt2 > 57343 || ((i4 = i5 + 1) != length && Character.isSurrogatePair(charAt2, charSequence.charAt(i4)))) {
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + j5);
                    } else {
                        throw new d(i5, length);
                    }
                    i5++;
                    c = 128;
                    j2 = j4;
                    j5 = j3;
                } else {
                    j3 = j5 + j2;
                    s1.H(bArr, j5, (byte) charAt2);
                    j4 = j2;
                }
                i5++;
                c = 128;
                j2 = j4;
                j5 = j3;
            }
            return (int) j5;
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
            if (f.b.b.a.z.a.s1.s(r13, r2) > (-65)) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x009e, code lost:
            if (f.b.b.a.z.a.s1.s(r13, r2) > (-65)) goto L57;
         */
        @Override // f.b.b.a.z.a.t1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        int d(int i2, byte[] bArr, int i3, int i4) {
            long j2;
            byte b = 0;
            if ((i3 | i4 | (bArr.length - i4)) >= 0) {
                long j3 = i3;
                long j4 = i4;
                if (i2 != 0) {
                    if (j3 >= j4) {
                        return i2;
                    }
                    byte b2 = (byte) i2;
                    if (b2 < -32) {
                        if (b2 >= -62) {
                            j3 = 1 + j3;
                            if (s1.s(bArr, j3) <= -65) {
                            }
                        }
                        return -1;
                    }
                    if (b2 < -16) {
                        byte b3 = (byte) (~(i2 >> 8));
                        if (b3 == 0) {
                            long j5 = j3 + 1;
                            b3 = s1.s(bArr, j3);
                            if (j5 >= j4) {
                                return t1.j(b2, b3);
                            }
                            j3 = j5;
                        }
                        if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                            j2 = j3 + 1;
                        }
                        return -1;
                    }
                    byte b4 = (byte) (~(i2 >> 8));
                    if (b4 == 0) {
                        long j6 = j3 + 1;
                        b4 = s1.s(bArr, j3);
                        if (j6 >= j4) {
                            return t1.j(b2, b4);
                        }
                        j3 = j6;
                    } else {
                        b = (byte) (i2 >> 16);
                    }
                    if (b == 0) {
                        long j7 = j3 + 1;
                        b = s1.s(bArr, j3);
                        if (j7 >= j4) {
                            return t1.k(b2, b4, b);
                        }
                        j3 = j7;
                    }
                    if (b4 <= -65 && (((b2 << 28) + (b4 + 112)) >> 30) == 0 && b <= -65) {
                        j2 = j3 + 1;
                    }
                    return -1;
                    j3 = j2;
                }
                return f(bArr, j3, (int) (j4 - j3));
            }
            throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i3), Integer.valueOf(i4)));
        }
    }

    static {
        a = (!e.e() || f.b.b.a.z.a.d.c()) ? new c() : new e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String e(byte[] bArr, int i2, int i3) {
        return a.a(bArr, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(CharSequence charSequence, byte[] bArr, int i2, int i3) {
        return a.b(charSequence, bArr, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 < length) {
                char charAt = charSequence.charAt(i2);
                if (charAt >= 2048) {
                    i3 += h(charSequence, i2);
                    break;
                }
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                break;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i3 + 4294967296L));
    }

    private static int h(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        int i3 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
            } else {
                i3 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i2) >= 65536) {
                        i2++;
                    } else {
                        throw new d(i2, length);
                    }
                }
            }
            i2++;
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(int i2) {
        if (i2 > -12) {
            return -1;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int j(int i2, int i3) {
        if (i2 > -12 || i3 > -65) {
            return -1;
        }
        return i2 ^ (i3 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(int i2, int i3, int i4) {
        if (i2 > -12 || i3 > -65 || i4 > -65) {
            return -1;
        }
        return (i2 ^ (i3 << 8)) ^ (i4 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(byte[] bArr, int i2, int i3) {
        byte b2 = bArr[i2 - 1];
        int i4 = i3 - i2;
        if (i4 == 0) {
            return i(b2);
        }
        if (i4 == 1) {
            return j(b2, bArr[i2]);
        }
        if (i4 == 2) {
            return k(b2, bArr[i2], bArr[i2 + 1]);
        }
        throw new AssertionError();
    }

    public static boolean m(byte[] bArr) {
        return a.c(bArr, 0, bArr.length);
    }

    public static boolean n(byte[] bArr, int i2, int i3) {
        return a.c(bArr, i2, i3);
    }
}

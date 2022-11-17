package f.b.b.a.a0;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
/* loaded from: classes.dex */
public final class f {
    private static final Charset a = Charset.forName("UTF-8");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class a {
        public byte[] a;
        public int b;

        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b extends a {

        /* renamed from: f  reason: collision with root package name */
        private static final int[] f2435f = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: g  reason: collision with root package name */
        private static final int[] f2436g = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private int c;

        /* renamed from: d  reason: collision with root package name */
        private int f2437d;

        /* renamed from: e  reason: collision with root package name */
        private final int[] f2438e;

        public b(int i2, byte[] bArr) {
            this.a = bArr;
            this.f2438e = (i2 & 8) == 0 ? f2435f : f2436g;
            this.c = 0;
            this.f2437d = 0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:63:0x00fe, code lost:
            if (r5 != 4) goto L66;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean a(byte[] bArr, int i2, int i3, boolean z) {
            int i4 = this.c;
            if (i4 == 6) {
                return false;
            }
            int i5 = i3 + i2;
            int i6 = this.f2437d;
            byte[] bArr2 = this.a;
            int[] iArr = this.f2438e;
            int i7 = 0;
            int i8 = i4;
            int i9 = i2;
            while (i9 < i5) {
                if (i8 == 0) {
                    while (true) {
                        int i10 = i9 + 4;
                        if (i10 > i5 || (i6 = (iArr[bArr[i9] & 255] << 18) | (iArr[bArr[i9 + 1] & 255] << 12) | (iArr[bArr[i9 + 2] & 255] << 6) | iArr[bArr[i9 + 3] & 255]) < 0) {
                            break;
                        }
                        bArr2[i7 + 2] = (byte) i6;
                        bArr2[i7 + 1] = (byte) (i6 >> 8);
                        bArr2[i7] = (byte) (i6 >> 16);
                        i7 += 3;
                        i9 = i10;
                    }
                    if (i9 >= i5) {
                        break;
                    }
                }
                i9++;
                int i11 = iArr[bArr[i9] & 255];
                if (i8 != 0) {
                    if (i8 == 1) {
                        if (i11 < 0) {
                            if (i11 != -1) {
                                this.c = 6;
                                return false;
                            }
                        }
                        i11 |= i6 << 6;
                    } else if (i8 == 2) {
                        if (i11 < 0) {
                            if (i11 == -2) {
                                i7++;
                                bArr2[i7] = (byte) (i6 >> 4);
                                i8 = 4;
                            } else if (i11 != -1) {
                                this.c = 6;
                                return false;
                            }
                        }
                        i11 |= i6 << 6;
                    } else if (i8 != 3) {
                        if (i8 != 4) {
                            if (i8 == 5 && i11 != -1) {
                                this.c = 6;
                                return false;
                            }
                        } else if (i11 == -2) {
                            i8++;
                        } else if (i11 != -1) {
                            this.c = 6;
                            return false;
                        }
                    } else if (i11 >= 0) {
                        int i12 = i11 | (i6 << 6);
                        bArr2[i7 + 2] = (byte) i12;
                        bArr2[i7 + 1] = (byte) (i12 >> 8);
                        bArr2[i7] = (byte) (i12 >> 16);
                        i7 += 3;
                        i6 = i12;
                        i8 = 0;
                    } else if (i11 == -2) {
                        bArr2[i7 + 1] = (byte) (i6 >> 2);
                        bArr2[i7] = (byte) (i6 >> 10);
                        i7 += 2;
                        i8 = 5;
                    } else if (i11 != -1) {
                        break;
                    }
                    i8++;
                    i6 = i11;
                } else {
                    if (i11 < 0) {
                        if (i11 != -1) {
                            this.c = 6;
                            return false;
                        }
                    }
                    i8++;
                    i6 = i11;
                }
            }
            if (!z) {
                this.c = i8;
                this.f2437d = i6;
            } else {
                if (i8 != 1) {
                    if (i8 == 2) {
                        i7++;
                        bArr2[i7] = (byte) (i6 >> 4);
                    } else if (i8 == 3) {
                        int i13 = i7 + 1;
                        bArr2[i7] = (byte) (i6 >> 10);
                        i7 = i13 + 1;
                        bArr2[i13] = (byte) (i6 >> 2);
                    }
                    this.c = i8;
                }
                this.c = 6;
                return false;
            }
            this.b = i7;
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c extends a {

        /* renamed from: j  reason: collision with root package name */
        private static final byte[] f2439j = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* renamed from: k  reason: collision with root package name */
        private static final byte[] f2440k = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        private final byte[] c;

        /* renamed from: d  reason: collision with root package name */
        int f2441d;

        /* renamed from: e  reason: collision with root package name */
        private int f2442e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f2443f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f2444g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f2445h;

        /* renamed from: i  reason: collision with root package name */
        private final byte[] f2446i;

        public c(int i2, byte[] bArr) {
            this.a = bArr;
            boolean z = true;
            this.f2443f = (i2 & 1) == 0;
            boolean z2 = (i2 & 2) == 0;
            this.f2444g = z2;
            this.f2445h = (i2 & 4) == 0 ? false : z;
            this.f2446i = (i2 & 8) == 0 ? f2439j : f2440k;
            this.c = new byte[2];
            this.f2441d = 0;
            this.f2442e = z2 ? 19 : -1;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x00e6 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00dd -> B:21:0x008a). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean a(byte[] r18, int r19, int r20, boolean r21) {
            /*
                Method dump skipped, instructions count: 477
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: f.b.b.a.a0.f.c.a(byte[], int, int, boolean):boolean");
        }
    }

    public static byte[] a(String str, int i2) {
        return b(str.getBytes(a), i2);
    }

    public static byte[] b(byte[] bArr, int i2) {
        return c(bArr, 0, bArr.length, i2);
    }

    public static byte[] c(byte[] bArr, int i2, int i3, int i4) {
        b bVar = new b(i4, new byte[(i3 * 3) / 4]);
        if (bVar.a(bArr, i2, i3, true)) {
            int i5 = bVar.b;
            byte[] bArr2 = bVar.a;
            if (i5 == bArr2.length) {
                return bArr2;
            }
            byte[] bArr3 = new byte[i5];
            System.arraycopy(bArr2, 0, bArr3, 0, i5);
            return bArr3;
        }
        throw new IllegalArgumentException("bad base-64");
    }

    public static String d(byte[] bArr) {
        return g(bArr, 2);
    }

    public static byte[] e(byte[] bArr, int i2) {
        return f(bArr, 0, bArr.length, i2);
    }

    public static byte[] f(byte[] bArr, int i2, int i3, int i4) {
        c cVar = new c(i4, null);
        int i5 = (i3 / 3) * 4;
        int i6 = 2;
        if (!cVar.f2443f) {
            int i7 = i3 % 3;
            if (i7 == 1) {
                i5 += 2;
            } else if (i7 == 2) {
                i5 += 3;
            }
        } else if (i3 % 3 > 0) {
            i5 += 4;
        }
        if (cVar.f2444g && i3 > 0) {
            int i8 = ((i3 - 1) / 57) + 1;
            if (!cVar.f2445h) {
                i6 = 1;
            }
            i5 += i8 * i6;
        }
        cVar.a = new byte[i5];
        cVar.a(bArr, i2, i3, true);
        return cVar.a;
    }

    public static String g(byte[] bArr, int i2) {
        try {
            return new String(e(bArr, i2), "US-ASCII");
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }
}

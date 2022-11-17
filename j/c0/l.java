package j.c0;

import j.x.d.i;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class l extends k {
    public static Integer f(String str) {
        i.d(str, "<this>");
        return g(str, 10);
    }

    public static final Integer g(String str, int i2) {
        boolean z;
        int i3;
        i.d(str, "<this>");
        a.a(i2);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i4 = 0;
        char charAt = str.charAt(0);
        int i5 = -2147483647;
        int i6 = 1;
        if (i.e(charAt, 48) >= 0) {
            z = false;
            i6 = 0;
        } else if (length == 1) {
            return null;
        } else {
            if (charAt == '-') {
                i5 = Integer.MIN_VALUE;
                z = true;
            } else if (charAt != '+') {
                return null;
            } else {
                z = false;
            }
        }
        int i7 = -59652323;
        while (i6 < length) {
            int b = a.b(str.charAt(i6), i2);
            if (b < 0) {
                return null;
            }
            if ((i4 < i7 && (i7 != -59652323 || i4 < (i7 = i5 / i2))) || (i3 = i4 * i2) < i5 + b) {
                return null;
            }
            i4 = i3 - b;
            i6++;
        }
        return z ? Integer.valueOf(i4) : Integer.valueOf(-i4);
    }

    public static Long h(String str) {
        i.d(str, "<this>");
        return i(str, 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Long i(String str, int i2) {
        i.d(str, "<this>");
        a.a(i2);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char charAt = str.charAt(0);
        long j2 = -9223372036854775807L;
        boolean z = true;
        if (i.e(charAt, 48) < 0) {
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                j2 = Long.MIN_VALUE;
                i3 = 1;
                long j3 = -256204778801521550L;
                long j4 = 0;
                long j5 = -256204778801521550L;
                while (i3 < length) {
                    int b = a.b(str.charAt(i3), i2);
                    if (b < 0) {
                        return null;
                    }
                    if (j4 < j5) {
                        if (j5 == j3) {
                            j5 = j2 / i2;
                            if (j4 < j5) {
                            }
                        }
                        return null;
                    }
                    long j6 = j4 * i2;
                    long j7 = b;
                    if (j6 < j2 + j7) {
                        return null;
                    }
                    j4 = j6 - j7;
                    i3++;
                    j3 = -256204778801521550L;
                }
                return !z ? Long.valueOf(j4) : Long.valueOf(-j4);
            } else if (charAt != '+') {
                return null;
            } else {
                i3 = 1;
            }
        }
        z = false;
        long j32 = -256204778801521550L;
        long j42 = 0;
        long j52 = -256204778801521550L;
        while (i3 < length) {
        }
        if (!z) {
        }
    }
}

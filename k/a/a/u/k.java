package k.a.a.u;

import e.a.j;
import java.io.BufferedReader;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.text.ParseException;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import k.a.a.b;
import k.a.a.c;
import k.a.a.w.d;
import k.a.a.x.f;
import k.a.a.x.h;
import k.a.a.x.i;
import k.a.a.x.l;
import k.a.a.x.m;
import k.a.a.x.n;
/* loaded from: classes.dex */
public final class k extends k.a.a.u.a<k> implements Serializable {
    private static final Integer[] A;
    private static final Integer[] B;
    private static final Integer[] C;
    private static final Integer[] D;
    private static final Integer[] E;
    private static final Integer[] F;
    private static final Integer[] G;
    private static final Integer[] H;
    private static final int[] l;
    private static final char t;
    private static final String v;
    private static final Long[] z;

    /* renamed from: e  reason: collision with root package name */
    private final transient l f3572e;

    /* renamed from: f  reason: collision with root package name */
    private final transient int f3573f;

    /* renamed from: g  reason: collision with root package name */
    private final transient int f3574g;

    /* renamed from: h  reason: collision with root package name */
    private final transient int f3575h;

    /* renamed from: i  reason: collision with root package name */
    private final transient int f3576i;

    /* renamed from: j  reason: collision with root package name */
    private final transient c f3577j;

    /* renamed from: k  reason: collision with root package name */
    private final long f3578k;
    private static final int[] m = {0, 30, 59, 89, j.A0, 148, 177, 207, 236, 266, 295, 325};
    private static final int[] n = {30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29};
    private static final int[] o = {30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 30};
    private static final int[] p = {0, 1, 0, 1, 0, 1, 1};
    private static final int[] q = {1, 9999, 11, 51, 5, 29, 354};
    private static final int[] r = {1, 9999, 11, 52, 6, 30, 355};
    private static final int[] s = {0, 354, 709, 1063, 1417, 1772, 2126, 2481, 2835, 3189, 3544, 3898, 4252, 4607, 4961, 5315, 5670, 6024, 6379, 6733, 7087, 7442, 7796, 8150, 8505, 8859, 9214, 9568, 9922, 10277};
    private static final String u = File.pathSeparator;
    private static final HashMap<Integer, Integer[]> w = new HashMap<>();
    private static final HashMap<Integer, Integer[]> x = new HashMap<>();
    private static final HashMap<Integer, Integer[]> y = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[k.a.a.x.a.values().length];
            a = iArr;
            try {
                iArr[k.a.a.x.a.DAY_OF_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[k.a.a.x.a.DAY_OF_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[k.a.a.x.a.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[k.a.a.x.a.YEAR_OF_ERA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[k.a.a.x.a.DAY_OF_WEEK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[k.a.a.x.a.ALIGNED_DAY_OF_WEEK_IN_MONTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[k.a.a.x.a.ALIGNED_DAY_OF_WEEK_IN_YEAR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[k.a.a.x.a.EPOCH_DAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[k.a.a.x.a.ALIGNED_WEEK_OF_YEAR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[k.a.a.x.a.MONTH_OF_YEAR.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[k.a.a.x.a.YEAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[k.a.a.x.a.ERA.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        int[] iArr = {0, 30, 59, 89, j.A0, 148, 177, 207, 236, 266, 295, 325};
        l = iArr;
        char c = File.separatorChar;
        t = c;
        v = "org" + c + "threeten" + c + "bp" + c + "chrono";
        D = new Integer[iArr.length];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr2 = l;
            if (i3 >= iArr2.length) {
                break;
            }
            D[i3] = Integer.valueOf(iArr2[i3]);
            i3++;
        }
        E = new Integer[m.length];
        int i4 = 0;
        while (true) {
            int[] iArr3 = m;
            if (i4 >= iArr3.length) {
                break;
            }
            E[i4] = Integer.valueOf(iArr3[i4]);
            i4++;
        }
        F = new Integer[n.length];
        int i5 = 0;
        while (true) {
            int[] iArr4 = n;
            if (i5 >= iArr4.length) {
                break;
            }
            F[i5] = Integer.valueOf(iArr4[i5]);
            i5++;
        }
        G = new Integer[o.length];
        int i6 = 0;
        while (true) {
            int[] iArr5 = o;
            if (i6 >= iArr5.length) {
                break;
            }
            G[i6] = Integer.valueOf(iArr5[i6]);
            i6++;
        }
        H = new Integer[s.length];
        int i7 = 0;
        while (true) {
            int[] iArr6 = s;
            if (i7 >= iArr6.length) {
                break;
            }
            H[i7] = Integer.valueOf(iArr6[i7]);
            i7++;
        }
        z = new Long[334];
        int i8 = 0;
        while (true) {
            Long[] lArr = z;
            if (i8 >= lArr.length) {
                break;
            }
            lArr[i8] = Long.valueOf(i8 * 10631);
            i8++;
        }
        A = new Integer[p.length];
        int i9 = 0;
        while (true) {
            int[] iArr7 = p;
            if (i9 >= iArr7.length) {
                break;
            }
            A[i9] = Integer.valueOf(iArr7[i9]);
            i9++;
        }
        B = new Integer[q.length];
        int i10 = 0;
        while (true) {
            int[] iArr8 = q;
            if (i10 >= iArr8.length) {
                break;
            }
            B[i10] = Integer.valueOf(iArr8[i10]);
            i10++;
        }
        C = new Integer[r.length];
        while (true) {
            int[] iArr9 = r;
            if (i2 < iArr9.length) {
                C[i2] = Integer.valueOf(iArr9[i2]);
                i2++;
            } else {
                try {
                    u0();
                    return;
                } catch (IOException | ParseException unused) {
                    return;
                }
            }
        }
    }

    private k(long j2) {
        int[] Z = Z(j2);
        N(Z[1]);
        M(Z[2]);
        K(Z[3]);
        L(Z[4]);
        this.f3572e = l.a(Z[0]);
        int i2 = Z[1];
        this.f3573f = i2;
        this.f3574g = Z[2];
        this.f3575h = Z[3];
        this.f3576i = Z[4];
        this.f3577j = c.a(Z[5]);
        this.f3578k = j2;
        h0(i2);
    }

    private static long A0(int i2) {
        Long l2;
        int i3 = i2 - 1;
        int i4 = i3 / 30;
        int i5 = i3 % 30;
        int intValue = O(i4)[Math.abs(i5)].intValue();
        if (i5 < 0) {
            intValue = -intValue;
        }
        try {
            l2 = z[i4];
        } catch (ArrayIndexOutOfBoundsException unused) {
            l2 = null;
        }
        if (l2 == null) {
            l2 = Long.valueOf(i4 * 10631);
        }
        return ((l2.longValue() + intValue) - 492148) - 1;
    }

    private static void J(int i2, int i3, int i4, int i5, int i6) {
        if (i2 < 1) {
            throw new IllegalArgumentException("startYear < 1");
        } else if (i4 < 1) {
            throw new IllegalArgumentException("endYear < 1");
        } else if (i3 < 0 || i3 > 11) {
            throw new IllegalArgumentException("startMonth < 0 || startMonth > 11");
        } else if (i5 < 0 || i5 > 11) {
            throw new IllegalArgumentException("endMonth < 0 || endMonth > 11");
        } else if (i4 > 9999) {
            throw new IllegalArgumentException("endYear > 9999");
        } else if (i4 < i2) {
            throw new IllegalArgumentException("startYear > endYear");
        } else if (i4 != i2 || i5 >= i3) {
            boolean h0 = h0(i2);
            Integer[] numArr = w.get(Integer.valueOf(i2));
            if (numArr == null) {
                if (!h0) {
                    numArr = new Integer[l.length];
                    int i7 = 0;
                    while (true) {
                        int[] iArr = l;
                        if (i7 >= iArr.length) {
                            break;
                        }
                        numArr[i7] = Integer.valueOf(iArr[i7]);
                        i7++;
                    }
                } else {
                    numArr = new Integer[m.length];
                    int i8 = 0;
                    while (true) {
                        int[] iArr2 = m;
                        if (i8 >= iArr2.length) {
                            break;
                        }
                        numArr[i8] = Integer.valueOf(iArr2[i8]);
                        i8++;
                    }
                }
            }
            Integer[] numArr2 = new Integer[numArr.length];
            for (int i9 = 0; i9 < 12; i9++) {
                if (i9 > i3) {
                    numArr2[i9] = Integer.valueOf(numArr[i9].intValue() - i6);
                } else {
                    numArr2[i9] = Integer.valueOf(numArr[i9].intValue());
                }
            }
            w.put(Integer.valueOf(i2), numArr2);
            Integer[] numArr3 = x.get(Integer.valueOf(i2));
            if (numArr3 == null) {
                if (!h0) {
                    numArr3 = new Integer[n.length];
                    int i10 = 0;
                    while (true) {
                        int[] iArr3 = n;
                        if (i10 >= iArr3.length) {
                            break;
                        }
                        numArr3[i10] = Integer.valueOf(iArr3[i10]);
                        i10++;
                    }
                } else {
                    numArr3 = new Integer[o.length];
                    int i11 = 0;
                    while (true) {
                        int[] iArr4 = o;
                        if (i11 >= iArr4.length) {
                            break;
                        }
                        numArr3[i11] = Integer.valueOf(iArr4[i11]);
                        i11++;
                    }
                }
            }
            Integer[] numArr4 = new Integer[numArr3.length];
            for (int i12 = 0; i12 < 12; i12++) {
                if (i12 == i3) {
                    numArr4[i12] = Integer.valueOf(numArr3[i12].intValue() - i6);
                } else {
                    numArr4[i12] = Integer.valueOf(numArr3[i12].intValue());
                }
            }
            x.put(Integer.valueOf(i2), numArr4);
            if (i2 != i4) {
                int i13 = i2 - 1;
                int i14 = i13 / 30;
                int i15 = i13 % 30;
                Integer[] numArr5 = y.get(Integer.valueOf(i14));
                if (numArr5 == null) {
                    int length = s.length;
                    Integer[] numArr6 = new Integer[length];
                    for (int i16 = 0; i16 < length; i16++) {
                        numArr6[i16] = Integer.valueOf(s[i16]);
                    }
                    numArr5 = numArr6;
                }
                for (int i17 = i15 + 1; i17 < s.length; i17++) {
                    numArr5[i17] = Integer.valueOf(numArr5[i17].intValue() - i6);
                }
                y.put(Integer.valueOf(i14), numArr5);
                int i18 = i4 - 1;
                int i19 = i18 / 30;
                if (i14 != i19) {
                    int i20 = i14 + 1;
                    while (true) {
                        Long[] lArr = z;
                        if (i20 >= lArr.length) {
                            break;
                        }
                        lArr[i20] = Long.valueOf(lArr[i20].longValue() - i6);
                        i20++;
                    }
                    int i21 = i19 + 1;
                    while (true) {
                        Long[] lArr2 = z;
                        if (i21 >= lArr2.length) {
                            break;
                        }
                        i19 = i19;
                        lArr2[i21] = Long.valueOf(lArr2[i21].longValue() + i6);
                        i21++;
                    }
                }
                int i22 = i19;
                int i23 = i18 % 30;
                Integer[] numArr7 = y.get(Integer.valueOf(i22));
                if (numArr7 == null) {
                    int length2 = s.length;
                    Integer[] numArr8 = new Integer[length2];
                    for (int i24 = 0; i24 < length2; i24++) {
                        numArr8[i24] = Integer.valueOf(s[i24]);
                    }
                    numArr7 = numArr8;
                }
                for (int i25 = i23 + 1; i25 < s.length; i25++) {
                    numArr7[i25] = Integer.valueOf(numArr7[i25].intValue() + i6);
                }
                y.put(Integer.valueOf(i22), numArr7);
            }
            boolean h02 = h0(i4);
            Integer[] numArr9 = w.get(Integer.valueOf(i4));
            if (numArr9 == null) {
                if (!h02) {
                    numArr9 = new Integer[l.length];
                    int i26 = 0;
                    while (true) {
                        int[] iArr5 = l;
                        if (i26 >= iArr5.length) {
                            break;
                        }
                        numArr9[i26] = Integer.valueOf(iArr5[i26]);
                        i26++;
                    }
                } else {
                    numArr9 = new Integer[m.length];
                    int i27 = 0;
                    while (true) {
                        int[] iArr6 = m;
                        if (i27 >= iArr6.length) {
                            break;
                        }
                        numArr9[i27] = Integer.valueOf(iArr6[i27]);
                        i27++;
                    }
                }
            }
            Integer[] numArr10 = new Integer[numArr9.length];
            for (int i28 = 0; i28 < 12; i28++) {
                if (i28 > i5) {
                    numArr10[i28] = Integer.valueOf(numArr9[i28].intValue() + i6);
                } else {
                    numArr10[i28] = Integer.valueOf(numArr9[i28].intValue());
                }
            }
            w.put(Integer.valueOf(i4), numArr10);
            Integer[] numArr11 = x.get(Integer.valueOf(i4));
            if (numArr11 == null) {
                if (!h02) {
                    numArr11 = new Integer[n.length];
                    int i29 = 0;
                    while (true) {
                        int[] iArr7 = n;
                        if (i29 >= iArr7.length) {
                            break;
                        }
                        numArr11[i29] = Integer.valueOf(iArr7[i29]);
                        i29++;
                    }
                } else {
                    numArr11 = new Integer[o.length];
                    int i30 = 0;
                    while (true) {
                        int[] iArr8 = o;
                        if (i30 >= iArr8.length) {
                            break;
                        }
                        numArr11[i30] = Integer.valueOf(iArr8[i30]);
                        i30++;
                    }
                }
            }
            Integer[] numArr12 = new Integer[numArr11.length];
            for (int i31 = 0; i31 < 12; i31++) {
                if (i31 == i5) {
                    numArr12[i31] = Integer.valueOf(numArr11[i31].intValue() + i6);
                } else {
                    numArr12[i31] = Integer.valueOf(numArr11[i31].intValue());
                }
            }
            HashMap<Integer, Integer[]> hashMap = x;
            hashMap.put(Integer.valueOf(i4), numArr12);
            Integer[] numArr13 = hashMap.get(Integer.valueOf(i2));
            Integer[] numArr14 = hashMap.get(Integer.valueOf(i4));
            HashMap<Integer, Integer[]> hashMap2 = w;
            int intValue = numArr13[i3].intValue();
            int intValue2 = numArr14[i5].intValue();
            int intValue3 = hashMap2.get(Integer.valueOf(i2))[11].intValue() + numArr13[11].intValue();
            int intValue4 = hashMap2.get(Integer.valueOf(i4))[11].intValue() + numArr14[11].intValue();
            Integer[] numArr15 = C;
            int intValue5 = numArr15[5].intValue();
            Integer[] numArr16 = B;
            int intValue6 = numArr16[5].intValue();
            if (intValue5 < intValue) {
                intValue5 = intValue;
            }
            if (intValue5 < intValue2) {
                intValue5 = intValue2;
            }
            numArr15[5] = Integer.valueOf(intValue5);
            if (intValue6 <= intValue) {
                intValue = intValue6;
            }
            if (intValue <= intValue2) {
                intValue2 = intValue;
            }
            numArr16[5] = Integer.valueOf(intValue2);
            int intValue7 = numArr15[6].intValue();
            int intValue8 = numArr16[6].intValue();
            if (intValue7 < intValue3) {
                intValue7 = intValue3;
            }
            if (intValue7 < intValue4) {
                intValue7 = intValue4;
            }
            numArr15[6] = Integer.valueOf(intValue7);
            if (intValue8 <= intValue3) {
                intValue3 = intValue8;
            }
            if (intValue3 <= intValue4) {
                intValue4 = intValue3;
            }
            numArr16[6] = Integer.valueOf(intValue4);
        } else {
            throw new IllegalArgumentException("startYear == endYear && endMonth < startMonth");
        }
    }

    private static void K(int i2) {
        if (i2 < 1 || i2 > a0()) {
            throw new b("Invalid day of month of Hijrah date, day " + i2 + " greater than " + a0() + " or less than 1");
        }
    }

    private static void L(int i2) {
        if (i2 < 1 || i2 > b0()) {
            throw new b("Invalid day of year of Hijrah date");
        }
    }

    private static void M(int i2) {
        if (i2 < 1 || i2 > 12) {
            throw new b("Invalid month of Hijrah date");
        }
    }

    private static void N(int i2) {
        if (i2 < 1 || i2 > 9999) {
            throw new b("Invalid year of Hijrah Era");
        }
    }

    private static Integer[] O(int i2) {
        Integer[] numArr;
        try {
            numArr = y.get(Integer.valueOf(i2));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        return numArr == null ? H : numArr;
    }

    private static Integer[] P(int i2) {
        Integer[] numArr;
        try {
            numArr = w.get(Integer.valueOf(i2));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        return numArr == null ? h0((long) i2) ? E : D : numArr;
    }

    private static Integer[] Q(int i2) {
        Integer[] numArr;
        try {
            numArr = x.get(Integer.valueOf(i2));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        return numArr == null ? h0((long) i2) ? G : F : numArr;
    }

    private static InputStream S() {
        ZipFile zipFile;
        String property = System.getProperty("org.threeten.bp.i18n.HijrahDate.deviationConfigFile");
        if (property == null) {
            property = "hijrah_deviation.cfg";
        }
        String property2 = System.getProperty("org.threeten.bp.i18n.HijrahDate.deviationConfigDir");
        if (property2 != null) {
            if (property2.length() != 0 || !property2.endsWith(System.getProperty("file.separator"))) {
                property2 = property2 + System.getProperty("file.separator");
            }
            File file = new File(property2 + t + property);
            if (!file.exists()) {
                return null;
            }
            try {
                return new FileInputStream(file);
            } catch (IOException e2) {
                throw e2;
            }
        } else {
            StringTokenizer stringTokenizer = new StringTokenizer(System.getProperty("java.class.path"), u);
            while (stringTokenizer.hasMoreTokens()) {
                String nextToken = stringTokenizer.nextToken();
                File file2 = new File(nextToken);
                if (file2.exists()) {
                    if (file2.isDirectory()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(nextToken);
                        char c = t;
                        sb.append(c);
                        String str = v;
                        sb.append(str);
                        if (new File(sb.toString(), property).exists()) {
                            try {
                                return new FileInputStream(nextToken + c + str + c + property);
                            } catch (IOException e3) {
                                throw e3;
                            }
                        }
                    } else {
                        try {
                            zipFile = new ZipFile(file2);
                        } catch (IOException unused) {
                            zipFile = null;
                        }
                        if (zipFile != null) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(v);
                            char c2 = t;
                            sb2.append(c2);
                            sb2.append(property);
                            String sb3 = sb2.toString();
                            ZipEntry entry = zipFile.getEntry(sb3);
                            if (entry == null) {
                                if (c2 == '/') {
                                    sb3 = sb3.replace('/', '\\');
                                } else if (c2 == '\\') {
                                    sb3 = sb3.replace('\\', '/');
                                }
                                entry = zipFile.getEntry(sb3);
                            }
                            if (entry != null) {
                                try {
                                    return zipFile.getInputStream(entry);
                                } catch (IOException e4) {
                                    throw e4;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return null;
        }
    }

    private static int T(long j2) {
        Long[] lArr = z;
        for (int i2 = 0; i2 < lArr.length; i2++) {
            try {
                if (j2 < lArr[i2].longValue()) {
                    return i2 - 1;
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
                return ((int) j2) / 10631;
            }
        }
        return ((int) j2) / 10631;
    }

    private static int U(long j2, int i2) {
        Long l2;
        try {
            l2 = z[i2];
        } catch (ArrayIndexOutOfBoundsException unused) {
            l2 = null;
        }
        if (l2 == null) {
            l2 = Long.valueOf(i2 * 10631);
        }
        return (int) (j2 - l2.longValue());
    }

    private static int V(int i2, int i3, int i4) {
        Integer num;
        Integer[] P = P(i4);
        if (i2 < 0) {
            i2 = h0((long) i4) ? i2 + 355 : i2 + 354;
            if (i3 <= 0) {
                return i2;
            }
            num = P[i3];
        } else if (i3 <= 0) {
            return i2;
        } else {
            num = P[i3];
        }
        return i2 - num.intValue();
    }

    private static int W(int i2, int i3, int i4) {
        Integer[] O = O(i2);
        return i3 > 0 ? i3 - O[i4].intValue() : O[i4].intValue() + i3;
    }

    private static long Y(int i2, int i3, int i4) {
        return A0(i2) + c0(i3 - 1, i2) + i4;
    }

    private static int[] Z(long j2) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j3 = j2 - (-492148);
        if (j3 >= 0) {
            int T = T(j3);
            int U = U(j3, T);
            int f0 = f0(T, U);
            i5 = W(T, U, f0);
            i6 = (T * 30) + f0 + 1;
            i4 = e0(i5, i6);
            i3 = V(i5, i4, i6) + 1;
            i2 = l.AH.getValue();
        } else {
            int i7 = (int) j3;
            int i8 = i7 / 10631;
            int i9 = i7 % 10631;
            if (i9 == 0) {
                i9 = -10631;
                i8++;
            }
            int f02 = f0(i8, i9);
            int W = W(i8, i9, f02);
            int i10 = 1 - ((i8 * 30) - f02);
            int i11 = h0((long) i10) ? W + 355 : W + 354;
            i4 = e0(i11, i10);
            i3 = V(i11, i4, i10) + 1;
            i2 = l.BEFORE_AH.getValue();
            i5 = i11;
            i6 = i10;
        }
        int i12 = (int) ((j3 + 5) % 7);
        return new int[]{i2, i6, i4 + 1, i3, i5 + 1, i12 + (i12 <= 0 ? 7 : 0)};
    }

    static int a0() {
        return C[5].intValue();
    }

    static int b0() {
        return C[6].intValue();
    }

    private static int c0(int i2, int i3) {
        return P(i3)[i2].intValue();
    }

    static int d0(int i2, int i3) {
        return Q(i3)[i2].intValue();
    }

    private static int e0(int i2, int i3) {
        Integer[] P = P(i3);
        int i4 = 0;
        if (i2 >= 0) {
            while (i4 < P.length) {
                if (i2 < P[i4].intValue()) {
                    return i4 - 1;
                }
                i4++;
            }
            return 11;
        }
        int i5 = h0((long) i3) ? i2 + 355 : i2 + 354;
        while (i4 < P.length) {
            if (i5 < P[i4].intValue()) {
                return i4 - 1;
            }
            i4++;
        }
        return 11;
    }

    private static int f0(int i2, long j2) {
        Integer[] O = O(i2);
        int i3 = 0;
        int i4 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i4 == 0) {
            return 0;
        }
        if (i4 > 0) {
            while (i3 < O.length) {
                if (j2 < O[i3].intValue()) {
                    return i3 - 1;
                }
                i3++;
            }
            return 29;
        }
        long j3 = -j2;
        while (i3 < O.length) {
            if (j3 <= O[i3].intValue()) {
                return i3 - 1;
            }
            i3++;
        }
        return 29;
    }

    static int g0(int i2) {
        Integer[] numArr;
        int i3 = i2 - 1;
        int i4 = i3 / 30;
        try {
            numArr = y.get(Integer.valueOf(i4));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        if (numArr == null) {
            return h0((long) i2) ? 355 : 354;
        }
        int i5 = i3 % 30;
        if (i5 != 29) {
            return numArr[i5 + 1].intValue() - numArr[i5].intValue();
        }
        Long[] lArr = z;
        return (lArr[i4 + 1].intValue() - lArr[i4].intValue()) - numArr[i5].intValue();
    }

    static boolean h0(long j2) {
        if (j2 <= 0) {
            j2 = -j2;
        }
        return ((j2 * 11) + 14) % 30 < 11;
    }

    public static k l0(int i2, int i3, int i4) {
        return i2 >= 1 ? m0(l.AH, i2, i3, i4) : m0(l.BEFORE_AH, 1 - i2, i3, i4);
    }

    static k m0(l lVar, int i2, int i3, int i4) {
        d.i(lVar, "era");
        N(i2);
        M(i3);
        K(i4);
        return new k(Y(lVar.d(i2), i3, i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static k n0(long j2) {
        return new k(j2);
    }

    private static void o0(String str, int i2) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ";");
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            int indexOf = nextToken.indexOf(58);
            if (indexOf != -1) {
                try {
                    int parseInt = Integer.parseInt(nextToken.substring(indexOf + 1, nextToken.length()));
                    int indexOf2 = nextToken.indexOf(45);
                    if (indexOf2 != -1) {
                        String substring = nextToken.substring(0, indexOf2);
                        String substring2 = nextToken.substring(indexOf2 + 1, indexOf);
                        int indexOf3 = substring.indexOf(47);
                        int indexOf4 = substring2.indexOf(47);
                        if (indexOf3 != -1) {
                            String substring3 = substring.substring(0, indexOf3);
                            String substring4 = substring.substring(indexOf3 + 1, substring.length());
                            try {
                                int parseInt2 = Integer.parseInt(substring3);
                                try {
                                    int parseInt3 = Integer.parseInt(substring4);
                                    if (indexOf4 != -1) {
                                        String substring5 = substring2.substring(0, indexOf4);
                                        String substring6 = substring2.substring(indexOf4 + 1, substring2.length());
                                        try {
                                            int parseInt4 = Integer.parseInt(substring5);
                                            try {
                                                int parseInt5 = Integer.parseInt(substring6);
                                                if (parseInt2 == -1 || parseInt3 == -1 || parseInt4 == -1 || parseInt5 == -1) {
                                                    throw new ParseException("Unknown error at line " + i2 + ".", i2);
                                                }
                                                J(parseInt2, parseInt3, parseInt4, parseInt5, parseInt);
                                            } catch (NumberFormatException unused) {
                                                throw new ParseException("End month is not properly set at line " + i2 + ".", i2);
                                            }
                                        } catch (NumberFormatException unused2) {
                                            throw new ParseException("End year is not properly set at line " + i2 + ".", i2);
                                        }
                                    } else {
                                        throw new ParseException("End year/month has incorrect format at line " + i2 + ".", i2);
                                    }
                                } catch (NumberFormatException unused3) {
                                    throw new ParseException("Start month is not properly set at line " + i2 + ".", i2);
                                }
                            } catch (NumberFormatException unused4) {
                                throw new ParseException("Start year is not properly set at line " + i2 + ".", i2);
                            }
                        } else {
                            throw new ParseException("Start year/month has incorrect format at line " + i2 + ".", i2);
                        }
                    } else {
                        throw new ParseException("Start and end year/month has incorrect format at line " + i2 + ".", i2);
                    }
                } catch (NumberFormatException unused5) {
                    throw new ParseException("Offset is not properly set at line " + i2 + ".", i2);
                }
            } else {
                throw new ParseException("Offset has incorrect format at line " + i2 + ".", i2);
            }
        }
    }

    private Object readResolve() {
        return new k(this.f3578k);
    }

    private static void u0() {
        Throwable th;
        InputStream S = S();
        if (S != null) {
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(S));
                int i2 = 0;
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine != null) {
                            i2++;
                            o0(readLine.trim(), i2);
                        } else {
                            bufferedReader2.close();
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b v0(DataInput dataInput) {
        return j.f3568g.x(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }

    private static k w0(int i2, int i3, int i4) {
        int c0 = c0(i3 - 1, i2);
        if (i4 > c0) {
            i4 = c0;
        }
        return l0(i2, i3, i4);
    }

    private Object writeReplace() {
        return new u((byte) 3, this);
    }

    @Override // k.a.a.u.b
    public long C() {
        return Y(this.f3573f, this.f3574g, this.f3575h);
    }

    /* renamed from: R */
    public j w() {
        return j.f3568g;
    }

    /* renamed from: X */
    public l x() {
        return this.f3572e;
    }

    @Override // k.a.a.w.c, k.a.a.x.e
    public n c(i iVar) {
        if (!(iVar instanceof k.a.a.x.a)) {
            return iVar.k(this);
        }
        if (j(iVar)) {
            k.a.a.x.a aVar = (k.a.a.x.a) iVar;
            int i2 = a.a[aVar.ordinal()];
            return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? w().A(aVar) : n.i(1L, 1000L) : n.i(1L, 5L) : n.i(1L, j0()) : n.i(1L, i0());
        }
        throw new m("Unsupported field: " + iVar);
    }

    public int i0() {
        return d0(this.f3574g - 1, this.f3573f);
    }

    public int j0() {
        return g0(this.f3573f);
    }

    /* renamed from: k0 */
    public k z(long j2, l lVar) {
        return (k) super.k(j2, lVar);
    }

    @Override // k.a.a.x.e
    public long l(i iVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (!(iVar instanceof k.a.a.x.a)) {
            return iVar.g(this);
        }
        switch (a.a[((k.a.a.x.a) iVar).ordinal()]) {
            case 1:
                i2 = this.f3575h;
                break;
            case 2:
                i2 = this.f3576i;
                break;
            case 3:
                i3 = this.f3575h;
                i5 = (i3 - 1) / 7;
                i2 = i5 + 1;
                break;
            case 4:
            case 11:
                i2 = this.f3573f;
                break;
            case 5:
                i2 = this.f3577j.getValue();
                break;
            case 6:
                i4 = this.f3575h;
                i5 = (i4 - 1) % 7;
                i2 = i5 + 1;
                break;
            case 7:
                i4 = this.f3576i;
                i5 = (i4 - 1) % 7;
                i2 = i5 + 1;
                break;
            case 8:
                return C();
            case 9:
                i3 = this.f3576i;
                i5 = (i3 - 1) / 7;
                i2 = i5 + 1;
                break;
            case 10:
                i2 = this.f3574g;
                break;
            case 12:
                i2 = this.f3572e.getValue();
                break;
            default:
                throw new m("Unsupported field: " + iVar);
        }
        return i2;
    }

    /* renamed from: p0 */
    public k r(long j2, l lVar) {
        return (k) super.r(j2, lVar);
    }

    /* renamed from: q0 */
    public k B(h hVar) {
        return (k) super.B(hVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r0 */
    public k G(long j2) {
        return new k(this.f3578k + j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s0 */
    public k H(long j2) {
        if (j2 == 0) {
            return this;
        }
        int i2 = (this.f3574g - 1) + ((int) j2);
        int i3 = i2 / 12;
        int i4 = i2 % 12;
        while (i4 < 0) {
            i4 += 12;
            i3 = d.n(i3, 1);
        }
        return m0(this.f3572e, d.j(this.f3573f, i3), i4 + 1, this.f3575h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t0 */
    public k I(long j2) {
        if (j2 == 0) {
            return this;
        }
        return m0(this.f3572e, d.j(this.f3573f, (int) j2), this.f3574g, this.f3575h);
    }

    @Override // k.a.a.u.a, k.a.a.u.b
    public final c<k> u(k.a.a.h hVar) {
        return super.u(hVar);
    }

    /* renamed from: x0 */
    public k h(f fVar) {
        return (k) super.h(fVar);
    }

    /* renamed from: y0 */
    public k q(i iVar, long j2) {
        if (!(iVar instanceof k.a.a.x.a)) {
            return (k) iVar.d(this, j2);
        }
        k.a.a.x.a aVar = (k.a.a.x.a) iVar;
        aVar.p(j2);
        int i2 = (int) j2;
        switch (a.a[aVar.ordinal()]) {
            case 1:
                return w0(this.f3573f, this.f3574g, i2);
            case 2:
                int i3 = i2 - 1;
                return w0(this.f3573f, (i3 / 30) + 1, (i3 % 30) + 1);
            case 3:
                return G((j2 - l(k.a.a.x.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                if (this.f3573f < 1) {
                    i2 = 1 - i2;
                }
                return w0(i2, this.f3574g, this.f3575h);
            case 5:
                return G(j2 - this.f3577j.getValue());
            case 6:
                return G(j2 - l(k.a.a.x.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return G(j2 - l(k.a.a.x.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return new k(i2);
            case 9:
                return G((j2 - l(k.a.a.x.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 10:
                return w0(this.f3573f, i2, this.f3575h);
            case 11:
                return w0(i2, this.f3574g, this.f3575h);
            case 12:
                return w0(1 - this.f3573f, this.f3574g, this.f3575h);
            default:
                throw new m("Unsupported field: " + iVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z0(DataOutput dataOutput) {
        dataOutput.writeInt(e(k.a.a.x.a.YEAR));
        dataOutput.writeByte(e(k.a.a.x.a.MONTH_OF_YEAR));
        dataOutput.writeByte(e(k.a.a.x.a.DAY_OF_MONTH));
    }
}

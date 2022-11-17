package k.a.a.v;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import k.a.a.q;
import k.a.a.r;
import k.a.a.v.k;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: i  reason: collision with root package name */
    private static final Map<Character, k.a.a.x.i> f3633i;
    private c a;
    private final c b;
    private final List<g> c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f3635d;

    /* renamed from: e  reason: collision with root package name */
    private int f3636e;

    /* renamed from: f  reason: collision with root package name */
    private char f3637f;

    /* renamed from: g  reason: collision with root package name */
    private int f3638g;

    /* renamed from: h  reason: collision with root package name */
    private static final k.a.a.x.k<q> f3632h = new a();

    /* renamed from: j  reason: collision with root package name */
    static final Comparator<String> f3634j = new C0147c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements k.a.a.x.k<q> {
        a() {
        }

        /* renamed from: b */
        public q a(k.a.a.x.e eVar) {
            q qVar = (q) eVar.g(k.a.a.x.j.g());
            if (qVar == null || (qVar instanceof r)) {
                return null;
            }
            return qVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends k.a.a.v.g {
        final /* synthetic */ k.b a;

        b(c cVar, k.b bVar) {
            this.a = bVar;
        }

        @Override // k.a.a.v.g
        public String a(k.a.a.x.i iVar, long j2, k.a.a.v.l lVar, Locale locale) {
            return this.a.a(j2, lVar);
        }

        @Override // k.a.a.v.g
        public Iterator<Map.Entry<String, Long>> b(k.a.a.x.i iVar, k.a.a.v.l lVar, Locale locale) {
            return this.a.b(lVar);
        }
    }

    /* renamed from: k.a.a.v.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0147c implements Comparator<String> {
        C0147c() {
        }

        /* renamed from: a */
        public int compare(String str, String str2) {
            return str.length() == str2.length() ? str.compareTo(str2) : str.length() - str2.length();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class d {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[k.a.a.v.j.values().length];
            a = iArr;
            try {
                iArr[k.a.a.v.j.EXCEEDS_PAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[k.a.a.v.j.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[k.a.a.v.j.NORMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[k.a.a.v.j.NOT_NEGATIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e implements g {

        /* renamed from: e  reason: collision with root package name */
        private final char f3639e;

        e(char c) {
            this.f3639e = c;
        }

        @Override // k.a.a.v.c.g
        public boolean a(k.a.a.v.f fVar, StringBuilder sb) {
            sb.append(this.f3639e);
            return true;
        }

        @Override // k.a.a.v.c.g
        public int c(k.a.a.v.d dVar, CharSequence charSequence, int i2) {
            if (i2 == charSequence.length()) {
                return ~i2;
            }
            return !dVar.b(this.f3639e, charSequence.charAt(i2)) ? ~i2 : i2 + 1;
        }

        public String toString() {
            if (this.f3639e == '\'') {
                return "''";
            }
            return "'" + this.f3639e + "'";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class f implements g {

        /* renamed from: e  reason: collision with root package name */
        private final g[] f3640e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f3641f;

        f(List<g> list, boolean z) {
            this((g[]) list.toArray(new g[list.size()]), z);
        }

        f(g[] gVarArr, boolean z) {
            this.f3640e = gVarArr;
            this.f3641f = z;
        }

        @Override // k.a.a.v.c.g
        public boolean a(k.a.a.v.f fVar, StringBuilder sb) {
            int length = sb.length();
            if (this.f3641f) {
                fVar.h();
            }
            try {
                for (g gVar : this.f3640e) {
                    if (!gVar.a(fVar, sb)) {
                        sb.setLength(length);
                        return true;
                    }
                }
                if (this.f3641f) {
                    fVar.b();
                }
                return true;
            } finally {
                if (this.f3641f) {
                    fVar.b();
                }
            }
        }

        public f b(boolean z) {
            return z == this.f3641f ? this : new f(this.f3640e, z);
        }

        @Override // k.a.a.v.c.g
        public int c(k.a.a.v.d dVar, CharSequence charSequence, int i2) {
            if (this.f3641f) {
                dVar.r();
                int i3 = i2;
                for (g gVar : this.f3640e) {
                    i3 = gVar.c(dVar, charSequence, i3);
                    if (i3 < 0) {
                        dVar.f(false);
                        return i2;
                    }
                }
                dVar.f(true);
                return i3;
            }
            for (g gVar2 : this.f3640e) {
                i2 = gVar2.c(dVar, charSequence, i2);
                if (i2 < 0) {
                    break;
                }
            }
            return i2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.f3640e != null) {
                sb.append(this.f3641f ? "[" : "(");
                for (g gVar : this.f3640e) {
                    sb.append(gVar);
                }
                sb.append(this.f3641f ? "]" : ")");
            }
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface g {
        boolean a(k.a.a.v.f fVar, StringBuilder sb);

        int c(k.a.a.v.d dVar, CharSequence charSequence, int i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class h implements g {

        /* renamed from: e  reason: collision with root package name */
        private final k.a.a.x.i f3642e;

        /* renamed from: f  reason: collision with root package name */
        private final int f3643f;

        /* renamed from: g  reason: collision with root package name */
        private final int f3644g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f3645h;

        h(k.a.a.x.i iVar, int i2, int i3, boolean z) {
            k.a.a.w.d.i(iVar, "field");
            if (!iVar.h().e()) {
                throw new IllegalArgumentException("Field must have a fixed set of values: " + iVar);
            } else if (i2 < 0 || i2 > 9) {
                throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i2);
            } else if (i3 < 1 || i3 > 9) {
                throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i3);
            } else if (i3 >= i2) {
                this.f3642e = iVar;
                this.f3643f = i2;
                this.f3644g = i3;
                this.f3645h = z;
            } else {
                throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i3 + " < " + i2);
            }
        }

        private long b(BigDecimal bigDecimal) {
            k.a.a.x.n h2 = this.f3642e.h();
            BigDecimal valueOf = BigDecimal.valueOf(h2.d());
            return bigDecimal.multiply(BigDecimal.valueOf(h2.c()).subtract(valueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(valueOf).longValueExact();
        }

        private BigDecimal d(long j2) {
            k.a.a.x.n h2 = this.f3642e.h();
            h2.b(j2, this.f3642e);
            BigDecimal valueOf = BigDecimal.valueOf(h2.d());
            BigDecimal divide = BigDecimal.valueOf(j2).subtract(valueOf).divide(BigDecimal.valueOf(h2.c()).subtract(valueOf).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
            return divide.compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : divide.stripTrailingZeros();
        }

        @Override // k.a.a.v.c.g
        public boolean a(k.a.a.v.f fVar, StringBuilder sb) {
            Long f2 = fVar.f(this.f3642e);
            if (f2 == null) {
                return false;
            }
            k.a.a.v.h d2 = fVar.d();
            BigDecimal d3 = d(f2.longValue());
            if (d3.scale() != 0) {
                String a = d2.a(d3.setScale(Math.min(Math.max(d3.scale(), this.f3643f), this.f3644g), RoundingMode.FLOOR).toPlainString().substring(2));
                if (this.f3645h) {
                    sb.append(d2.c());
                }
                sb.append(a);
                return true;
            } else if (this.f3643f <= 0) {
                return true;
            } else {
                if (this.f3645h) {
                    sb.append(d2.c());
                }
                for (int i2 = 0; i2 < this.f3643f; i2++) {
                    sb.append(d2.f());
                }
                return true;
            }
        }

        @Override // k.a.a.v.c.g
        public int c(k.a.a.v.d dVar, CharSequence charSequence, int i2) {
            int i3;
            int i4 = 0;
            int i5 = dVar.l() ? this.f3643f : 0;
            int i6 = dVar.l() ? this.f3644g : 9;
            int length = charSequence.length();
            if (i2 == length) {
                return i5 > 0 ? ~i2 : i2;
            }
            if (this.f3645h) {
                if (charSequence.charAt(i2) != dVar.j().c()) {
                    return i5 > 0 ? ~i2 : i2;
                }
                i2++;
            }
            int i7 = i2;
            int i8 = i5 + i7;
            if (i8 > length) {
                return ~i7;
            }
            int min = Math.min(i6 + i7, length);
            int i9 = i7;
            while (true) {
                if (i9 >= min) {
                    i3 = i9;
                    break;
                }
                int i10 = i9 + 1;
                int b = dVar.j().b(charSequence.charAt(i9));
                if (b >= 0) {
                    i4 = (i4 * 10) + b;
                    i9 = i10;
                } else if (i10 < i8) {
                    return ~i7;
                } else {
                    i3 = i10 - 1;
                }
            }
            return dVar.o(this.f3642e, b(new BigDecimal(i4).movePointLeft(i3 - i7)), i7, i3);
        }

        public String toString() {
            String str = this.f3645h ? ",DecimalPoint" : "";
            return "Fraction(" + this.f3642e + "," + this.f3643f + "," + this.f3644g + str + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class i implements g {

        /* renamed from: e  reason: collision with root package name */
        private final int f3646e;

        i(int i2) {
            this.f3646e = i2;
        }

        @Override // k.a.a.v.c.g
        public boolean a(k.a.a.v.f fVar, StringBuilder sb) {
            int i2;
            Long f2 = fVar.f(k.a.a.x.a.INSTANT_SECONDS);
            Long l = 0L;
            k.a.a.x.e e2 = fVar.e();
            k.a.a.x.a aVar = k.a.a.x.a.NANO_OF_SECOND;
            if (e2.j(aVar)) {
                l = Long.valueOf(fVar.e().l(aVar));
            }
            int i3 = 0;
            if (f2 == null) {
                return false;
            }
            long longValue = f2.longValue();
            int l2 = aVar.l(l.longValue());
            if (longValue >= -62167219200L) {
                long j2 = (longValue - 315569520000L) + 62167219200L;
                long e3 = k.a.a.w.d.e(j2, 315569520000L) + 1;
                k.a.a.g W = k.a.a.g.W(k.a.a.w.d.h(j2, 315569520000L) - 62167219200L, 0, r.f3550i);
                if (e3 > 0) {
                    sb.append('+');
                    sb.append(e3);
                }
                sb.append(W);
                if (W.R() == 0) {
                    sb.append(":00");
                }
            } else {
                long j3 = longValue + 62167219200L;
                long j4 = j3 / 315569520000L;
                long j5 = j3 % 315569520000L;
                k.a.a.g W2 = k.a.a.g.W(j5 - 62167219200L, 0, r.f3550i);
                int length = sb.length();
                sb.append(W2);
                if (W2.R() == 0) {
                    sb.append(":00");
                }
                if (j4 < 0) {
                    if (W2.S() == -10000) {
                        sb.replace(length, length + 2, Long.toString(j4 - 1));
                    } else {
                        if (j5 != 0) {
                            length++;
                            j4 = Math.abs(j4);
                        }
                        sb.insert(length, j4);
                    }
                }
            }
            int i4 = this.f3646e;
            if (i4 == -2) {
                if (l2 != 0) {
                    sb.append('.');
                    int i5 = 1000000;
                    if (l2 % 1000000 == 0) {
                        i2 = (l2 / 1000000) + 1000;
                    } else {
                        if (l2 % 1000 == 0) {
                            l2 /= 1000;
                        } else {
                            i5 = 1000000000;
                        }
                        i2 = l2 + i5;
                    }
                    sb.append(Integer.toString(i2).substring(1));
                }
            } else if (i4 > 0 || (i4 == -1 && l2 > 0)) {
                sb.append('.');
                int i6 = 100000000;
                while (true) {
                    int i7 = this.f3646e;
                    if ((i7 != -1 || l2 <= 0) && i3 >= i7) {
                        break;
                    }
                    int i8 = l2 / i6;
                    sb.append((char) (i8 + 48));
                    l2 -= i8 * i6;
                    i6 /= 10;
                    i3++;
                }
            }
            sb.append('Z');
            return true;
        }

        @Override // k.a.a.v.c.g
        public int c(k.a.a.v.d dVar, CharSequence charSequence, int i2) {
            int i3;
            int i4;
            int i5;
            k.a.a.v.d d2 = dVar.d();
            int i6 = this.f3646e;
            int i7 = i6 < 0 ? 0 : i6;
            if (i6 < 0) {
                i6 = 9;
            }
            c cVar = new c();
            cVar.a(k.a.a.v.b.f3624h);
            cVar.e('T');
            k.a.a.x.a aVar = k.a.a.x.a.HOUR_OF_DAY;
            cVar.k(aVar, 2);
            cVar.e(':');
            k.a.a.x.a aVar2 = k.a.a.x.a.MINUTE_OF_HOUR;
            cVar.k(aVar2, 2);
            cVar.e(':');
            k.a.a.x.a aVar3 = k.a.a.x.a.SECOND_OF_MINUTE;
            cVar.k(aVar3, 2);
            k.a.a.x.a aVar4 = k.a.a.x.a.NANO_OF_SECOND;
            cVar.b(aVar4, i7, i6, true);
            cVar.e('Z');
            int c = cVar.s().k(false).c(d2, charSequence, i2);
            if (c < 0) {
                return c;
            }
            long longValue = d2.i(k.a.a.x.a.YEAR).longValue();
            int intValue = d2.i(k.a.a.x.a.MONTH_OF_YEAR).intValue();
            int intValue2 = d2.i(k.a.a.x.a.DAY_OF_MONTH).intValue();
            int intValue3 = d2.i(aVar).intValue();
            int intValue4 = d2.i(aVar2).intValue();
            Long i8 = d2.i(aVar3);
            Long i9 = d2.i(aVar4);
            int intValue5 = i8 != null ? i8.intValue() : 0;
            int intValue6 = i9 != null ? i9.intValue() : 0;
            int i10 = ((int) longValue) % 10000;
            if (intValue3 == 24 && intValue4 == 0 && intValue5 == 0 && intValue6 == 0) {
                i3 = intValue5;
                i5 = 1;
                i4 = 0;
            } else if (intValue3 == 23 && intValue4 == 59 && intValue5 == 60) {
                dVar.p();
                i4 = intValue3;
                i5 = 0;
                i3 = 59;
            } else {
                i4 = intValue3;
                i3 = intValue5;
                i5 = 0;
            }
            try {
                return dVar.o(aVar4, intValue6, i2, dVar.o(k.a.a.x.a.INSTANT_SECONDS, k.a.a.w.d.m(longValue / 10000, 315569520000L) + k.a.a.g.U(i10, intValue, intValue2, i4, intValue4, i3, 0).a0(i5).B(r.f3550i), i2, c));
            } catch (RuntimeException unused) {
                return ~i2;
            }
        }

        public String toString() {
            return "Instant()";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class j implements g {

        /* renamed from: j  reason: collision with root package name */
        static final int[] f3647j = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

        /* renamed from: e  reason: collision with root package name */
        final k.a.a.x.i f3648e;

        /* renamed from: f  reason: collision with root package name */
        final int f3649f;

        /* renamed from: g  reason: collision with root package name */
        final int f3650g;

        /* renamed from: h  reason: collision with root package name */
        final k.a.a.v.j f3651h;

        /* renamed from: i  reason: collision with root package name */
        final int f3652i;

        j(k.a.a.x.i iVar, int i2, int i3, k.a.a.v.j jVar) {
            this.f3648e = iVar;
            this.f3649f = i2;
            this.f3650g = i3;
            this.f3651h = jVar;
            this.f3652i = 0;
        }

        private j(k.a.a.x.i iVar, int i2, int i3, k.a.a.v.j jVar, int i4) {
            this.f3648e = iVar;
            this.f3649f = i2;
            this.f3650g = i3;
            this.f3651h = jVar;
            this.f3652i = i4;
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x00a2 A[LOOP:0: B:32:0x0099->B:34:0x00a2, LOOP_END] */
        @Override // k.a.a.v.c.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean a(k.a.a.v.f fVar, StringBuilder sb) {
            char d2;
            int i2;
            Long f2 = fVar.f(this.f3648e);
            if (f2 == null) {
                return false;
            }
            long longValue = f2.longValue();
            b(fVar, longValue);
            k.a.a.v.h d3 = fVar.d();
            String l = longValue == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(longValue));
            if (l.length() <= this.f3650g) {
                String a = d3.a(l);
                int i3 = (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1));
                int[] iArr = d.a;
                int ordinal = this.f3651h.ordinal();
                if (i3 >= 0) {
                    int i4 = iArr[ordinal];
                    if (i4 == 1 ? !((i2 = this.f3649f) >= 19 || longValue < f3647j[i2]) : i4 == 2) {
                        d2 = d3.e();
                        sb.append(d2);
                    }
                    for (int i5 = 0; i5 < this.f3649f - a.length(); i5++) {
                        sb.append(d3.f());
                    }
                    sb.append(a);
                    return true;
                }
                int i6 = iArr[ordinal];
                if (i6 == 1 || i6 == 2 || i6 == 3) {
                    d2 = d3.d();
                    sb.append(d2);
                    while (i5 < this.f3649f - a.length()) {
                    }
                    sb.append(a);
                    return true;
                }
                if (i6 == 4) {
                    throw new k.a.a.b("Field " + this.f3648e + " cannot be printed as the value " + longValue + " cannot be negative according to the SignStyle");
                }
                while (i5 < this.f3649f - a.length()) {
                }
                sb.append(a);
                return true;
            }
            throw new k.a.a.b("Field " + this.f3648e + " cannot be printed as the value " + longValue + " exceeds the maximum print width of " + this.f3650g);
        }

        long b(k.a.a.v.f fVar, long j2) {
            return j2;
        }

        /* JADX WARN: Removed duplicated region for block: B:107:0x015b  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x0179  */
        @Override // k.a.a.v.c.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int c(k.a.a.v.d dVar, CharSequence charSequence, int i2) {
            int i3;
            boolean z;
            boolean z2;
            BigInteger bigInteger;
            int i4;
            long j2;
            long j3;
            int i5;
            int i6;
            int i7;
            int length = charSequence.length();
            if (i2 == length) {
                return ~i2;
            }
            char charAt = charSequence.charAt(i2);
            int i8 = 0;
            if (charAt == dVar.j().e()) {
                if (!this.f3651h.a(true, dVar.l(), this.f3649f == this.f3650g)) {
                    return ~i2;
                }
                i3 = i2 + 1;
                z2 = false;
                z = true;
            } else {
                if (charAt == dVar.j().d()) {
                    if (!this.f3651h.a(false, dVar.l(), this.f3649f == this.f3650g)) {
                        return ~i2;
                    }
                    i3 = i2 + 1;
                    z2 = true;
                } else if (this.f3651h == k.a.a.v.j.ALWAYS && dVar.l()) {
                    return ~i2;
                } else {
                    i3 = i2;
                    z2 = false;
                }
                z = false;
            }
            int i9 = (dVar.l() || d(dVar)) ? this.f3649f : 1;
            int i10 = i3 + i9;
            if (i10 > length) {
                return ~i3;
            }
            int max = ((dVar.l() || d(dVar)) ? this.f3650g : 9) + Math.max(this.f3652i, 0);
            while (true) {
                bigInteger = null;
                if (i8 >= 2) {
                    i4 = i3;
                    j2 = 0;
                    break;
                }
                int min = Math.min(max + i3, length);
                i5 = i3;
                j2 = 0;
                while (true) {
                    if (i5 >= min) {
                        break;
                    }
                    int i11 = i5 + 1;
                    int b = dVar.j().b(charSequence.charAt(i5));
                    if (b < 0) {
                        i5 = i11 - 1;
                        if (i5 < i10) {
                            return ~i3;
                        }
                    } else {
                        if (i11 - i3 > 18) {
                            if (bigInteger == null) {
                                bigInteger = BigInteger.valueOf(j2);
                            }
                            bigInteger = bigInteger.multiply(BigInteger.TEN).add(BigInteger.valueOf(b));
                            i7 = i10;
                            i6 = min;
                        } else {
                            i7 = i10;
                            i6 = min;
                            j2 = (j2 * 10) + b;
                        }
                        min = i6;
                        i10 = i7;
                        i5 = i11;
                    }
                }
                i10 = i10;
                int i12 = this.f3652i;
                if (i12 <= 0 || i8 != 0) {
                    break;
                }
                max = Math.max(i9, (i5 - i3) - i12);
                i8++;
            }
            i4 = i5;
            if (z2) {
                if (bigInteger != null) {
                    if (bigInteger.equals(BigInteger.ZERO) && dVar.l()) {
                        return ~(i3 - 1);
                    }
                    bigInteger = bigInteger.negate();
                } else if (j2 == 0 && dVar.l()) {
                    return ~(i3 - 1);
                } else {
                    j3 = -j2;
                    if (bigInteger != null) {
                        return e(dVar, j3, i3, i4);
                    }
                    if (bigInteger.bitLength() > 63) {
                        bigInteger = bigInteger.divide(BigInteger.TEN);
                        i4--;
                    }
                    return e(dVar, bigInteger.longValue(), i3, i4);
                }
            } else if (this.f3651h == k.a.a.v.j.EXCEEDS_PAD && dVar.l()) {
                int i13 = i4 - i3;
                int i14 = this.f3649f;
                if (z) {
                    if (i13 <= i14) {
                        return ~(i3 - 1);
                    }
                } else if (i13 > i14) {
                    return ~i3;
                }
            }
            j3 = j2;
            if (bigInteger != null) {
            }
        }

        boolean d(k.a.a.v.d dVar) {
            int i2 = this.f3652i;
            return i2 == -1 || (i2 > 0 && this.f3649f == this.f3650g && this.f3651h == k.a.a.v.j.NOT_NEGATIVE);
        }

        int e(k.a.a.v.d dVar, long j2, int i2, int i3) {
            return dVar.o(this.f3648e, j2, i2, i3);
        }

        j f() {
            return this.f3652i == -1 ? this : new j(this.f3648e, this.f3649f, this.f3650g, this.f3651h, -1);
        }

        j g(int i2) {
            return new j(this.f3648e, this.f3649f, this.f3650g, this.f3651h, this.f3652i + i2);
        }

        public String toString() {
            StringBuilder sb;
            Object obj;
            int i2 = this.f3649f;
            if (i2 == 1 && this.f3650g == 19 && this.f3651h == k.a.a.v.j.NORMAL) {
                sb = new StringBuilder();
                sb.append("Value(");
                obj = this.f3648e;
            } else if (i2 == this.f3650g && this.f3651h == k.a.a.v.j.NOT_NEGATIVE) {
                sb = new StringBuilder();
                sb.append("Value(");
                sb.append(this.f3648e);
                sb.append(",");
                sb.append(this.f3649f);
                sb.append(")");
                return sb.toString();
            } else {
                sb = new StringBuilder();
                sb.append("Value(");
                sb.append(this.f3648e);
                sb.append(",");
                sb.append(this.f3649f);
                sb.append(",");
                sb.append(this.f3650g);
                sb.append(",");
                obj = this.f3651h;
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class k implements g {

        /* renamed from: g  reason: collision with root package name */
        static final String[] f3653g = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS"};

        /* renamed from: h  reason: collision with root package name */
        static final k f3654h = new k("Z", "+HH:MM:ss");

        /* renamed from: e  reason: collision with root package name */
        private final String f3655e;

        /* renamed from: f  reason: collision with root package name */
        private final int f3656f;

        k(String str, String str2) {
            k.a.a.w.d.i(str, "noOffsetText");
            k.a.a.w.d.i(str2, "pattern");
            this.f3655e = str;
            this.f3656f = b(str2);
        }

        private int b(String str) {
            int i2 = 0;
            while (true) {
                String[] strArr = f3653g;
                if (i2 >= strArr.length) {
                    throw new IllegalArgumentException("Invalid zone offset pattern: " + str);
                } else if (strArr[i2].equals(str)) {
                    return i2;
                } else {
                    i2++;
                }
            }
        }

        private boolean d(int[] iArr, int i2, CharSequence charSequence, boolean z) {
            int i3;
            int i4 = this.f3656f;
            if ((i4 + 3) / 2 < i2) {
                return false;
            }
            int i5 = iArr[0];
            if (i4 % 2 == 0 && i2 > 1) {
                int i6 = i5 + 1;
                if (i6 > charSequence.length() || charSequence.charAt(i5) != ':') {
                    return z;
                }
                i5 = i6;
            }
            if (i5 + 2 > charSequence.length()) {
                return z;
            }
            int i7 = i5 + 1;
            char charAt = charSequence.charAt(i5);
            int i8 = i7 + 1;
            char charAt2 = charSequence.charAt(i7);
            if (charAt < '0' || charAt > '9' || charAt2 < '0' || charAt2 > '9' || (i3 = ((charAt - '0') * 10) + (charAt2 - '0')) < 0 || i3 > 59) {
                return z;
            }
            iArr[i2] = i3;
            iArr[0] = i8;
            return false;
        }

        @Override // k.a.a.v.c.g
        public boolean a(k.a.a.v.f fVar, StringBuilder sb) {
            Long f2 = fVar.f(k.a.a.x.a.OFFSET_SECONDS);
            if (f2 == null) {
                return false;
            }
            int p = k.a.a.w.d.p(f2.longValue());
            if (p != 0) {
                int abs = Math.abs((p / 3600) % 100);
                int abs2 = Math.abs((p / 60) % 60);
                int abs3 = Math.abs(p % 60);
                int length = sb.length();
                sb.append(p < 0 ? "-" : "+");
                sb.append((char) ((abs / 10) + 48));
                sb.append((char) ((abs % 10) + 48));
                int i2 = this.f3656f;
                if (i2 >= 3 || (i2 >= 1 && abs2 > 0)) {
                    String str = ":";
                    sb.append(i2 % 2 == 0 ? str : "");
                    sb.append((char) ((abs2 / 10) + 48));
                    sb.append((char) ((abs2 % 10) + 48));
                    abs += abs2;
                    int i3 = this.f3656f;
                    if (i3 >= 7 || (i3 >= 5 && abs3 > 0)) {
                        if (i3 % 2 != 0) {
                            str = "";
                        }
                        sb.append(str);
                        sb.append((char) ((abs3 / 10) + 48));
                        sb.append((char) ((abs3 % 10) + 48));
                        abs += abs3;
                    }
                }
                if (abs == 0) {
                    sb.setLength(length);
                }
                return true;
            }
            sb.append(this.f3655e);
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
            if (r16.s(r17, r18, r15.f3655e, 0, r9) != false) goto L13;
         */
        /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
        @Override // k.a.a.v.c.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int c(k.a.a.v.d dVar, CharSequence charSequence, int i2) {
            boolean z;
            k.a.a.x.a aVar;
            k.a.a.v.d dVar2;
            long j2;
            int i3;
            int i4;
            int length = charSequence.length();
            int length2 = this.f3655e.length();
            if (length2 == 0) {
                if (i2 == length) {
                    aVar = k.a.a.x.a.OFFSET_SECONDS;
                    j2 = 0;
                    dVar2 = dVar;
                    i3 = i2;
                    i4 = i2;
                    return dVar2.o(aVar, j2, i3, i4);
                }
            } else if (i2 == length) {
                return ~i2;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt == '+' || charAt == '-') {
                int i5 = charAt == '-' ? -1 : 1;
                int[] iArr = new int[4];
                iArr[0] = i2 + 1;
                if (!d(iArr, 1, charSequence, true)) {
                    if (!d(iArr, 2, charSequence, this.f3656f >= 3) && !d(iArr, 3, charSequence, false)) {
                        z = false;
                        if (!z) {
                            j2 = i5 * ((iArr[1] * 3600) + (iArr[2] * 60) + iArr[3]);
                            aVar = k.a.a.x.a.OFFSET_SECONDS;
                            i4 = iArr[0];
                            dVar2 = dVar;
                            i3 = i2;
                            return dVar2.o(aVar, j2, i3, i4);
                        }
                    }
                }
                z = true;
                if (!z) {
                }
            }
            if (length2 != 0) {
                return ~i2;
            }
            aVar = k.a.a.x.a.OFFSET_SECONDS;
            j2 = 0;
            i4 = i2 + length2;
            dVar2 = dVar;
            i3 = i2;
            return dVar2.o(aVar, j2, i3, i4);
        }

        public String toString() {
            String replace = this.f3655e.replace("'", "''");
            return "Offset(" + f3653g[this.f3656f] + ",'" + replace + "')";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class l implements g {

        /* renamed from: e  reason: collision with root package name */
        private final g f3657e;

        /* renamed from: f  reason: collision with root package name */
        private final int f3658f;

        /* renamed from: g  reason: collision with root package name */
        private final char f3659g;

        l(g gVar, int i2, char c) {
            this.f3657e = gVar;
            this.f3658f = i2;
            this.f3659g = c;
        }

        @Override // k.a.a.v.c.g
        public boolean a(k.a.a.v.f fVar, StringBuilder sb) {
            int length = sb.length();
            if (!this.f3657e.a(fVar, sb)) {
                return false;
            }
            int length2 = sb.length() - length;
            if (length2 <= this.f3658f) {
                for (int i2 = 0; i2 < this.f3658f - length2; i2++) {
                    sb.insert(length, this.f3659g);
                }
                return true;
            }
            throw new k.a.a.b("Cannot print as output of " + length2 + " characters exceeds pad width of " + this.f3658f);
        }

        @Override // k.a.a.v.c.g
        public int c(k.a.a.v.d dVar, CharSequence charSequence, int i2) {
            boolean l = dVar.l();
            boolean k2 = dVar.k();
            if (i2 > charSequence.length()) {
                throw new IndexOutOfBoundsException();
            } else if (i2 == charSequence.length()) {
                return ~i2;
            } else {
                int i3 = this.f3658f + i2;
                if (i3 > charSequence.length()) {
                    if (l) {
                        return ~i2;
                    }
                    i3 = charSequence.length();
                }
                int i4 = i2;
                while (i4 < i3) {
                    char charAt = charSequence.charAt(i4);
                    char c = this.f3659g;
                    if (!k2) {
                        if (!dVar.b(charAt, c)) {
                            break;
                        }
                        i4++;
                    } else if (charAt != c) {
                        break;
                    } else {
                        i4++;
                    }
                }
                int c2 = this.f3657e.c(dVar, charSequence.subSequence(0, i3), i4);
                return (c2 == i3 || !l) ? c2 : ~(i2 + i4);
            }
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("Pad(");
            sb.append(this.f3657e);
            sb.append(",");
            sb.append(this.f3658f);
            if (this.f3659g == ' ') {
                str = ")";
            } else {
                str = ",'" + this.f3659g + "')";
            }
            sb.append(str);
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum m implements g {
        SENSITIVE,
        INSENSITIVE,
        STRICT,
        LENIENT;

        @Override // k.a.a.v.c.g
        public boolean a(k.a.a.v.f fVar, StringBuilder sb) {
            return true;
        }

        @Override // k.a.a.v.c.g
        public int c(k.a.a.v.d dVar, CharSequence charSequence, int i2) {
            int ordinal = ordinal();
            if (ordinal == 0) {
                dVar.m(true);
            } else if (ordinal == 1) {
                dVar.m(false);
            } else if (ordinal == 2) {
                dVar.q(true);
            } else if (ordinal == 3) {
                dVar.q(false);
            }
            return i2;
        }

        @Override // java.lang.Enum
        public String toString() {
            int ordinal = ordinal();
            if (ordinal == 0) {
                return "ParseCaseSensitive(true)";
            }
            if (ordinal == 1) {
                return "ParseCaseSensitive(false)";
            }
            if (ordinal == 2) {
                return "ParseStrict(true)";
            }
            if (ordinal == 3) {
                return "ParseStrict(false)";
            }
            throw new IllegalStateException("Unreachable");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class n implements g {

        /* renamed from: e  reason: collision with root package name */
        private final String f3665e;

        n(String str) {
            this.f3665e = str;
        }

        @Override // k.a.a.v.c.g
        public boolean a(k.a.a.v.f fVar, StringBuilder sb) {
            sb.append(this.f3665e);
            return true;
        }

        @Override // k.a.a.v.c.g
        public int c(k.a.a.v.d dVar, CharSequence charSequence, int i2) {
            if (i2 > charSequence.length() || i2 < 0) {
                throw new IndexOutOfBoundsException();
            }
            String str = this.f3665e;
            return !dVar.s(charSequence, i2, str, 0, str.length()) ? ~i2 : i2 + this.f3665e.length();
        }

        public String toString() {
            String replace = this.f3665e.replace("'", "''");
            return "'" + replace + "'";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class o implements g {

        /* renamed from: e  reason: collision with root package name */
        private final k.a.a.x.i f3666e;

        /* renamed from: f  reason: collision with root package name */
        private final k.a.a.v.l f3667f;

        /* renamed from: g  reason: collision with root package name */
        private final k.a.a.v.g f3668g;

        /* renamed from: h  reason: collision with root package name */
        private volatile j f3669h;

        o(k.a.a.x.i iVar, k.a.a.v.l lVar, k.a.a.v.g gVar) {
            this.f3666e = iVar;
            this.f3667f = lVar;
            this.f3668g = gVar;
        }

        private j b() {
            if (this.f3669h == null) {
                this.f3669h = new j(this.f3666e, 1, 19, k.a.a.v.j.NORMAL);
            }
            return this.f3669h;
        }

        @Override // k.a.a.v.c.g
        public boolean a(k.a.a.v.f fVar, StringBuilder sb) {
            Long f2 = fVar.f(this.f3666e);
            if (f2 == null) {
                return false;
            }
            String a = this.f3668g.a(this.f3666e, f2.longValue(), this.f3667f, fVar.c());
            if (a == null) {
                return b().a(fVar, sb);
            }
            sb.append(a);
            return true;
        }

        @Override // k.a.a.v.c.g
        public int c(k.a.a.v.d dVar, CharSequence charSequence, int i2) {
            int length = charSequence.length();
            if (i2 < 0 || i2 > length) {
                throw new IndexOutOfBoundsException();
            }
            Iterator<Map.Entry<String, Long>> b = this.f3668g.b(this.f3666e, dVar.l() ? this.f3667f : null, dVar.h());
            if (b != null) {
                while (b.hasNext()) {
                    Map.Entry<String, Long> next = b.next();
                    String key = next.getKey();
                    if (dVar.s(key, 0, charSequence, i2, key.length())) {
                        return dVar.o(this.f3666e, next.getValue().longValue(), i2, i2 + key.length());
                    }
                }
                if (dVar.l()) {
                    return ~i2;
                }
            }
            return b().c(dVar, charSequence, i2);
        }

        public String toString() {
            StringBuilder sb;
            Object obj;
            if (this.f3667f == k.a.a.v.l.FULL) {
                sb = new StringBuilder();
                sb.append("Text(");
                obj = this.f3666e;
            } else {
                sb = new StringBuilder();
                sb.append("Text(");
                sb.append(this.f3666e);
                sb.append(",");
                obj = this.f3667f;
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class p implements g {

        /* renamed from: g  reason: collision with root package name */
        private static volatile Map.Entry<Integer, a> f3670g;

        /* renamed from: e  reason: collision with root package name */
        private final k.a.a.x.k<q> f3671e;

        /* renamed from: f  reason: collision with root package name */
        private final String f3672f;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static final class a {
            final int a;
            private final Map<CharSequence, a> b;
            private final Map<String, a> c;

            private a(int i2) {
                this.b = new HashMap();
                this.c = new HashMap();
                this.a = i2;
            }

            /* synthetic */ a(int i2, a aVar) {
                this(i2);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void c(String str) {
                int length = str.length();
                int i2 = this.a;
                if (length == i2) {
                    this.b.put(str, null);
                    this.c.put(str.toLowerCase(Locale.ENGLISH), null);
                } else if (length > i2) {
                    String substring = str.substring(0, i2);
                    a aVar = this.b.get(substring);
                    if (aVar == null) {
                        aVar = new a(length);
                        this.b.put(substring, aVar);
                        this.c.put(substring.toLowerCase(Locale.ENGLISH), aVar);
                    }
                    aVar.c(str);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public a d(CharSequence charSequence, boolean z) {
                Map map;
                if (z) {
                    map = this.b;
                } else {
                    map = this.c;
                    charSequence = charSequence.toString().toLowerCase(Locale.ENGLISH);
                }
                return (a) map.get(charSequence);
            }
        }

        p(k.a.a.x.k<q> kVar, String str) {
            this.f3671e = kVar;
            this.f3672f = str;
        }

        private q b(Set<String> set, String str, boolean z) {
            if (str == null) {
                return null;
            }
            if (!z) {
                for (String str2 : set) {
                    if (str2.equalsIgnoreCase(str)) {
                        return q.t(str2);
                    }
                }
                return null;
            } else if (set.contains(str)) {
                return q.t(str);
            } else {
                return null;
            }
        }

        private int d(k.a.a.v.d dVar, CharSequence charSequence, int i2, int i3) {
            int c;
            String upperCase = charSequence.subSequence(i2, i3).toString().toUpperCase();
            k.a.a.v.d d2 = dVar.d();
            if ((i3 >= charSequence.length() || !dVar.b(charSequence.charAt(i3), 'Z')) && (c = k.f3654h.c(d2, charSequence, i3)) >= 0) {
                dVar.n(q.u(upperCase, r.B((int) d2.i(k.a.a.x.a.OFFSET_SECONDS).longValue())));
                return c;
            }
            dVar.n(q.u(upperCase, r.f3550i));
            return i3;
        }

        private static a e(Set<String> set) {
            ArrayList<String> arrayList = new ArrayList(set);
            Collections.sort(arrayList, c.f3634j);
            a aVar = new a(((String) arrayList.get(0)).length(), null);
            for (String str : arrayList) {
                aVar.c(str);
            }
            return aVar;
        }

        @Override // k.a.a.v.c.g
        public boolean a(k.a.a.v.f fVar, StringBuilder sb) {
            q qVar = (q) fVar.g(this.f3671e);
            if (qVar == null) {
                return false;
            }
            sb.append(qVar.a());
            return true;
        }

        @Override // k.a.a.v.c.g
        public int c(k.a.a.v.d dVar, CharSequence charSequence, int i2) {
            int i3;
            int length = charSequence.length();
            if (i2 > length) {
                throw new IndexOutOfBoundsException();
            } else if (i2 == length) {
                return ~i2;
            } else {
                char charAt = charSequence.charAt(i2);
                if (charAt == '+' || charAt == '-') {
                    k.a.a.v.d d2 = dVar.d();
                    int c = k.f3654h.c(d2, charSequence, i2);
                    if (c < 0) {
                        return c;
                    }
                    dVar.n(r.B((int) d2.i(k.a.a.x.a.OFFSET_SECONDS).longValue()));
                    return c;
                }
                int i4 = i2 + 2;
                if (length >= i4) {
                    char charAt2 = charSequence.charAt(i2 + 1);
                    if (dVar.b(charAt, 'U') && dVar.b(charAt2, 'T')) {
                        int i5 = i2 + 3;
                        return (length < i5 || !dVar.b(charSequence.charAt(i4), 'C')) ? d(dVar, charSequence, i2, i4) : d(dVar, charSequence, i2, i5);
                    } else if (dVar.b(charAt, 'G') && length >= (i3 = i2 + 3) && dVar.b(charAt2, 'M') && dVar.b(charSequence.charAt(i4), 'T')) {
                        return d(dVar, charSequence, i2, i3);
                    }
                }
                Set<String> a2 = k.a.a.y.i.a();
                int size = a2.size();
                Map.Entry<Integer, a> entry = f3670g;
                if (entry == null || entry.getKey().intValue() != size) {
                    synchronized (this) {
                        entry = f3670g;
                        if (entry == null || entry.getKey().intValue() != size) {
                            entry = new AbstractMap.SimpleImmutableEntry<>(Integer.valueOf(size), e(a2));
                            f3670g = entry;
                        }
                    }
                }
                a value = entry.getValue();
                String str = null;
                String str2 = null;
                while (value != null) {
                    int i6 = value.a + i2;
                    if (i6 > length) {
                        break;
                    }
                    String charSequence2 = charSequence.subSequence(i2, i6).toString();
                    value = value.d(charSequence2, dVar.k());
                    str2 = str;
                    str = charSequence2;
                }
                q b = b(a2, str, dVar.k());
                if (b == null) {
                    b = b(a2, str2, dVar.k());
                    if (b != null) {
                        str = str2;
                    } else if (!dVar.b(charAt, 'Z')) {
                        return ~i2;
                    } else {
                        dVar.n(r.f3550i);
                        return i2 + 1;
                    }
                }
                dVar.n(b);
                return i2 + str.length();
            }
        }

        public String toString() {
            return this.f3672f;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f3633i = hashMap;
        hashMap.put('G', k.a.a.x.a.ERA);
        hashMap.put('y', k.a.a.x.a.YEAR_OF_ERA);
        hashMap.put('u', k.a.a.x.a.YEAR);
        k.a.a.x.i iVar = k.a.a.x.c.a;
        hashMap.put('Q', iVar);
        hashMap.put('q', iVar);
        k.a.a.x.a aVar = k.a.a.x.a.MONTH_OF_YEAR;
        hashMap.put('M', aVar);
        hashMap.put('L', aVar);
        hashMap.put('D', k.a.a.x.a.DAY_OF_YEAR);
        hashMap.put('d', k.a.a.x.a.DAY_OF_MONTH);
        hashMap.put('F', k.a.a.x.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        k.a.a.x.a aVar2 = k.a.a.x.a.DAY_OF_WEEK;
        hashMap.put('E', aVar2);
        hashMap.put('c', aVar2);
        hashMap.put('e', aVar2);
        hashMap.put('a', k.a.a.x.a.AMPM_OF_DAY);
        hashMap.put('H', k.a.a.x.a.HOUR_OF_DAY);
        hashMap.put('k', k.a.a.x.a.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', k.a.a.x.a.HOUR_OF_AMPM);
        hashMap.put('h', k.a.a.x.a.CLOCK_HOUR_OF_AMPM);
        hashMap.put('m', k.a.a.x.a.MINUTE_OF_HOUR);
        hashMap.put('s', k.a.a.x.a.SECOND_OF_MINUTE);
        k.a.a.x.a aVar3 = k.a.a.x.a.NANO_OF_SECOND;
        hashMap.put('S', aVar3);
        hashMap.put('A', k.a.a.x.a.MILLI_OF_DAY);
        hashMap.put('n', aVar3);
        hashMap.put('N', k.a.a.x.a.NANO_OF_DAY);
    }

    public c() {
        this.a = this;
        this.c = new ArrayList();
        this.f3638g = -1;
        this.b = null;
        this.f3635d = false;
    }

    private c(c cVar, boolean z) {
        this.a = this;
        this.c = new ArrayList();
        this.f3638g = -1;
        this.b = cVar;
        this.f3635d = z;
    }

    private int d(g gVar) {
        k.a.a.w.d.i(gVar, "pp");
        c cVar = this.a;
        int i2 = cVar.f3636e;
        if (i2 > 0) {
            if (gVar != null) {
                gVar = new l(gVar, i2, cVar.f3637f);
            }
            cVar.f3636e = 0;
            cVar.f3637f = (char) 0;
        }
        cVar.c.add(gVar);
        c cVar2 = this.a;
        cVar2.f3638g = -1;
        return cVar2.c.size() - 1;
    }

    private c j(j jVar) {
        j jVar2;
        c cVar = this.a;
        int i2 = cVar.f3638g;
        if (i2 < 0 || !(cVar.c.get(i2) instanceof j)) {
            this.a.f3638g = d(jVar);
        } else {
            c cVar2 = this.a;
            int i3 = cVar2.f3638g;
            j jVar3 = (j) cVar2.c.get(i3);
            int i4 = jVar.f3649f;
            int i5 = jVar.f3650g;
            if (i4 == i5 && jVar.f3651h == k.a.a.v.j.NOT_NEGATIVE) {
                jVar2 = jVar3.g(i5);
                d(jVar.f());
                this.a.f3638g = i3;
            } else {
                jVar2 = jVar3.f();
                this.a.f3638g = d(jVar);
            }
            this.a.c.set(i3, jVar2);
        }
        return this;
    }

    public c a(k.a.a.v.b bVar) {
        k.a.a.w.d.i(bVar, "formatter");
        d(bVar.k(false));
        return this;
    }

    public c b(k.a.a.x.i iVar, int i2, int i3, boolean z) {
        d(new h(iVar, i2, i3, z));
        return this;
    }

    public c c() {
        d(new i(-2));
        return this;
    }

    public c e(char c) {
        d(new e(c));
        return this;
    }

    public c f(String str) {
        k.a.a.w.d.i(str, "literal");
        if (str.length() > 0) {
            d(str.length() == 1 ? new e(str.charAt(0)) : new n(str));
        }
        return this;
    }

    public c g(String str, String str2) {
        d(new k(str2, str));
        return this;
    }

    public c h() {
        d(k.f3654h);
        return this;
    }

    public c i(k.a.a.x.i iVar, Map<Long, String> map) {
        k.a.a.w.d.i(iVar, "field");
        k.a.a.w.d.i(map, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        k.a.a.v.l lVar = k.a.a.v.l.FULL;
        d(new o(iVar, lVar, new b(this, new k.b(Collections.singletonMap(lVar, linkedHashMap)))));
        return this;
    }

    public c k(k.a.a.x.i iVar, int i2) {
        k.a.a.w.d.i(iVar, "field");
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i2);
        }
        j(new j(iVar, i2, i2, k.a.a.v.j.NOT_NEGATIVE));
        return this;
    }

    public c l(k.a.a.x.i iVar, int i2, int i3, k.a.a.v.j jVar) {
        if (i2 == i3 && jVar == k.a.a.v.j.NOT_NEGATIVE) {
            k(iVar, i3);
            return this;
        }
        k.a.a.w.d.i(iVar, "field");
        k.a.a.w.d.i(jVar, "signStyle");
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i2);
        } else if (i3 < 1 || i3 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i3);
        } else if (i3 >= i2) {
            j(new j(iVar, i2, i3, jVar));
            return this;
        } else {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i3 + " < " + i2);
        }
    }

    public c m() {
        d(new p(f3632h, "ZoneRegionId()"));
        return this;
    }

    public c n() {
        c cVar = this.a;
        if (cVar.b != null) {
            if (cVar.c.size() > 0) {
                c cVar2 = this.a;
                f fVar = new f(cVar2.c, cVar2.f3635d);
                this.a = this.a.b;
                d(fVar);
            } else {
                this.a = this.a.b;
            }
            return this;
        }
        throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
    }

    public c o() {
        c cVar = this.a;
        cVar.f3638g = -1;
        this.a = new c(cVar, true);
        return this;
    }

    public c p() {
        d(m.INSENSITIVE);
        return this;
    }

    public c q() {
        d(m.SENSITIVE);
        return this;
    }

    public c r() {
        d(m.LENIENT);
        return this;
    }

    public k.a.a.v.b s() {
        return t(Locale.getDefault());
    }

    public k.a.a.v.b t(Locale locale) {
        k.a.a.w.d.i(locale, "locale");
        while (this.a.b != null) {
            n();
        }
        return new k.a.a.v.b(new f(this.c, false), locale, k.a.a.v.h.f3688e, k.a.a.v.i.SMART, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k.a.a.v.b u(k.a.a.v.i iVar) {
        return s().m(iVar);
    }
}

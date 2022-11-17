package j.c0;

import j.b0.h;
import j.k;
import j.o;
import j.s.d;
import j.s.e;
import j.s.g;
import j.x.c.l;
import j.x.c.p;
import j.x.d.i;
import j.x.d.j;
import j.z.c;
import j.z.f;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class n extends m {

    /* loaded from: classes.dex */
    public static final class a extends j implements p<CharSequence, Integer, k<? extends Integer, ? extends Integer>> {

        /* renamed from: e */
        final /* synthetic */ List<String> f3435e;

        /* renamed from: f */
        final /* synthetic */ boolean f3436f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<String> list, boolean z) {
            super(2);
            this.f3435e = list;
            this.f3436f = z;
        }

        public final k<Integer, Integer> a(CharSequence charSequence, int i2) {
            i.d(charSequence, "$this$$receiver");
            k s = n.s(charSequence, this.f3435e, i2, this.f3436f, false);
            if (s != null) {
                return o.a(s.c(), Integer.valueOf(((String) s.d()).length()));
            }
            return null;
        }

        @Override // j.x.c.p
        public /* bridge */ /* synthetic */ k<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return a(charSequence, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends j implements l<c, String> {

        /* renamed from: e */
        final /* synthetic */ CharSequence f3437e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(CharSequence charSequence) {
            super(1);
            this.f3437e = charSequence;
        }

        /* renamed from: a */
        public final String invoke(c cVar) {
            i.d(cVar, "it");
            return n.P(this.f3437e, cVar);
        }
    }

    public static /* synthetic */ int A(CharSequence charSequence, String str, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return w(charSequence, str, i2, z);
    }

    public static final int B(CharSequence charSequence, char[] cArr, int i2, boolean z) {
        int a2;
        boolean z2;
        char h2;
        i.d(charSequence, "<this>");
        i.d(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            a2 = f.a(i2, 0);
            int u = u(charSequence);
            if (a2 > u) {
                return -1;
            }
            while (true) {
                char charAt = charSequence.charAt(a2);
                int length = cArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        z2 = false;
                        break;
                    } else if (j.c0.b.d(cArr[i3], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (z2) {
                    return a2;
                }
                if (a2 == u) {
                    return -1;
                }
                a2++;
            }
        } else {
            h2 = e.h(cArr);
            return ((String) charSequence).indexOf(h2, i2);
        }
    }

    public static final int C(CharSequence charSequence, char c, int i2, boolean z) {
        i.d(charSequence, "<this>");
        return (z || !(charSequence instanceof String)) ? G(charSequence, new char[]{c}, i2, z) : ((String) charSequence).lastIndexOf(c, i2);
    }

    public static final int D(CharSequence charSequence, String str, int i2, boolean z) {
        i.d(charSequence, "<this>");
        i.d(str, "string");
        return (z || !(charSequence instanceof String)) ? x(charSequence, str, i2, 0, z, true) : ((String) charSequence).lastIndexOf(str, i2);
    }

    public static /* synthetic */ int E(CharSequence charSequence, char c, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = u(charSequence);
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return C(charSequence, c, i2, z);
    }

    public static /* synthetic */ int F(CharSequence charSequence, String str, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = u(charSequence);
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return D(charSequence, str, i2, z);
    }

    public static final int G(CharSequence charSequence, char[] cArr, int i2, boolean z) {
        int c;
        char h2;
        i.d(charSequence, "<this>");
        i.d(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            for (c = f.c(i2, u(charSequence)); -1 < c; c--) {
                char charAt = charSequence.charAt(c);
                int length = cArr.length;
                boolean z2 = false;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    } else if (j.c0.b.d(cArr[i3], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (z2) {
                    return c;
                }
            }
            return -1;
        }
        h2 = e.h(cArr);
        return ((String) charSequence).lastIndexOf(h2, i2);
    }

    public static final j.b0.b<String> H(CharSequence charSequence) {
        i.d(charSequence, "<this>");
        return O(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    public static final List<String> I(CharSequence charSequence) {
        List<String> e2;
        i.d(charSequence, "<this>");
        e2 = h.e(H(charSequence));
        return e2;
    }

    private static final j.b0.b<c> J(CharSequence charSequence, String[] strArr, int i2, boolean z, int i3) {
        List a2;
        M(i3);
        a2 = d.a(strArr);
        return new c(charSequence, i2, i3, new a(a2, z));
    }

    static /* synthetic */ j.b0.b K(CharSequence charSequence, String[] strArr, int i2, boolean z, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            z = false;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        return J(charSequence, strArr, i2, z, i3);
    }

    public static final boolean L(CharSequence charSequence, int i2, CharSequence charSequence2, int i3, int i4, boolean z) {
        i.d(charSequence, "<this>");
        i.d(charSequence2, "other");
        if (i3 < 0 || i2 < 0 || i2 > charSequence.length() - i4 || i3 > charSequence2.length() - i4) {
            return false;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if (!j.c0.b.d(charSequence.charAt(i2 + i5), charSequence2.charAt(i3 + i5), z)) {
                return false;
            }
        }
        return true;
    }

    public static final void M(int i2) {
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + i2).toString());
        }
    }

    public static final j.b0.b<String> N(CharSequence charSequence, String[] strArr, boolean z, int i2) {
        j.b0.b<String> c;
        i.d(charSequence, "<this>");
        i.d(strArr, "delimiters");
        c = h.c(K(charSequence, strArr, 0, z, i2, 2, null), new b(charSequence));
        return c;
    }

    public static /* synthetic */ j.b0.b O(CharSequence charSequence, String[] strArr, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return N(charSequence, strArr, z, i2);
    }

    public static final String P(CharSequence charSequence, c cVar) {
        i.d(charSequence, "<this>");
        i.d(cVar, "range");
        return charSequence.subSequence(cVar.n().intValue(), cVar.m().intValue() + 1).toString();
    }

    public static final String Q(String str, char c, String str2) {
        int z;
        i.d(str, "<this>");
        i.d(str2, "missingDelimiterValue");
        z = z(str, c, 0, false, 6, null);
        if (z == -1) {
            return str2;
        }
        String substring = str.substring(z + 1, str.length());
        i.c(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String R(String str, String str2, String str3) {
        int A;
        i.d(str, "<this>");
        i.d(str2, "delimiter");
        i.d(str3, "missingDelimiterValue");
        A = A(str, str2, 0, false, 6, null);
        if (A == -1) {
            return str3;
        }
        String substring = str.substring(A + str2.length(), str.length());
        i.c(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String S(String str, char c, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = str;
        }
        return Q(str, c, str2);
    }

    public static /* synthetic */ String T(String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str3 = str;
        }
        return R(str, str2, str3);
    }

    public static final String U(String str, char c, String str2) {
        i.d(str, "<this>");
        i.d(str2, "missingDelimiterValue");
        int E = E(str, c, 0, false, 6, null);
        if (E == -1) {
            return str2;
        }
        String substring = str.substring(E + 1, str.length());
        i.c(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String V(String str, char c, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = str;
        }
        return U(str, c, str2);
    }

    public static final String W(String str, char c, String str2) {
        int z;
        i.d(str, "<this>");
        i.d(str2, "missingDelimiterValue");
        z = z(str, c, 0, false, 6, null);
        if (z == -1) {
            return str2;
        }
        String substring = str.substring(0, z);
        i.c(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String X(String str, String str2, String str3) {
        int A;
        i.d(str, "<this>");
        i.d(str2, "delimiter");
        i.d(str3, "missingDelimiterValue");
        A = A(str, str2, 0, false, 6, null);
        if (A == -1) {
            return str3;
        }
        String substring = str.substring(0, A);
        i.c(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String Y(String str, char c, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = str;
        }
        return W(str, c, str2);
    }

    public static /* synthetic */ String Z(String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str3 = str;
        }
        return X(str, str2, str3);
    }

    public static CharSequence a0(CharSequence charSequence) {
        i.d(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            boolean c = j.c0.a.c(charSequence.charAt(!z ? i2 : length));
            if (!z) {
                if (!c) {
                    z = true;
                } else {
                    i2++;
                }
            } else if (!c) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    public static final boolean q(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        int A;
        i.d(charSequence, "<this>");
        i.d(charSequence2, "other");
        if (charSequence2 instanceof String) {
            A = A(charSequence, (String) charSequence2, 0, z, 2, null);
            if (A >= 0) {
                return true;
            }
        } else if (y(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean r(CharSequence charSequence, CharSequence charSequence2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return q(charSequence, charSequence2, z);
    }

    public static final k<Integer, String> s(CharSequence charSequence, Collection<String> collection, int i2, boolean z, boolean z2) {
        j.z.a aVar;
        int h2;
        Object obj;
        String str;
        Object obj2;
        int c;
        int a2;
        if (z || collection.size() != 1) {
            if (!z2) {
                a2 = f.a(i2, 0);
                aVar = new c(a2, charSequence.length());
            } else {
                c = f.c(i2, u(charSequence));
                aVar = f.f(c, 0);
            }
            if (charSequence instanceof String) {
                h2 = aVar.h();
                int i3 = aVar.i();
                int j2 = aVar.j();
                if ((j2 > 0 && h2 <= i3) || (j2 < 0 && i3 <= h2)) {
                    while (true) {
                        Iterator<T> it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            String str2 = (String) obj2;
                            if (m.m(str2, 0, (String) charSequence, h2, str2.length(), z)) {
                                break;
                            }
                        }
                        str = (String) obj2;
                        if (str == null) {
                            if (h2 == i3) {
                                break;
                            }
                            h2 += j2;
                        } else {
                            break;
                        }
                    }
                    return o.a(Integer.valueOf(h2), str);
                }
                return null;
            }
            h2 = aVar.h();
            int i4 = aVar.i();
            int j3 = aVar.j();
            if ((j3 > 0 && h2 <= i4) || (j3 < 0 && i4 <= h2)) {
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        String str3 = (String) obj;
                        if (L(str3, 0, charSequence, h2, str3.length(), z)) {
                            break;
                        }
                    }
                    str = (String) obj;
                    if (str == null) {
                        if (h2 == i4) {
                            break;
                        }
                        h2 += j3;
                    } else {
                        break;
                    }
                }
                return o.a(Integer.valueOf(h2), str);
            }
            return null;
        }
        String str4 = (String) g.n(collection);
        int A = !z2 ? A(charSequence, str4, i2, false, 4, null) : F(charSequence, str4, i2, false, 4, null);
        if (A < 0) {
            return null;
        }
        return o.a(Integer.valueOf(A), str4);
    }

    public static final c t(CharSequence charSequence) {
        i.d(charSequence, "<this>");
        return new c(0, charSequence.length() - 1);
    }

    public static final int u(CharSequence charSequence) {
        i.d(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int v(CharSequence charSequence, char c, int i2, boolean z) {
        i.d(charSequence, "<this>");
        return (z || !(charSequence instanceof String)) ? B(charSequence, new char[]{c}, i2, z) : ((String) charSequence).indexOf(c, i2);
    }

    public static final int w(CharSequence charSequence, String str, int i2, boolean z) {
        i.d(charSequence, "<this>");
        i.d(str, "string");
        return (z || !(charSequence instanceof String)) ? y(charSequence, str, i2, charSequence.length(), z, false, 16, null) : ((String) charSequence).indexOf(str, i2);
    }

    private static final int x(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z, boolean z2) {
        j.z.a aVar;
        int c;
        int a2;
        int a3;
        int c2;
        if (!z2) {
            a3 = f.a(i2, 0);
            c2 = f.c(i3, charSequence.length());
            aVar = new c(a3, c2);
        } else {
            c = f.c(i2, u(charSequence));
            a2 = f.a(i3, 0);
            aVar = f.f(c, a2);
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int h2 = aVar.h();
            int i4 = aVar.i();
            int j2 = aVar.j();
            if ((j2 <= 0 || h2 > i4) && (j2 >= 0 || i4 > h2)) {
                return -1;
            }
            while (!L(charSequence2, 0, charSequence, h2, charSequence2.length(), z)) {
                if (h2 == i4) {
                    return -1;
                }
                h2 += j2;
            }
            return h2;
        }
        int h3 = aVar.h();
        int i5 = aVar.i();
        int j3 = aVar.j();
        if ((j3 <= 0 || h3 > i5) && (j3 >= 0 || i5 > h3)) {
            return -1;
        }
        while (!m.m((String) charSequence2, 0, (String) charSequence, h3, charSequence2.length(), z)) {
            if (h3 == i5) {
                return -1;
            }
            h3 += j3;
        }
        return h3;
    }

    static /* synthetic */ int y(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z, boolean z2, int i4, Object obj) {
        return x(charSequence, charSequence2, i2, i3, z, (i4 & 16) != 0 ? false : z2);
    }

    public static /* synthetic */ int z(CharSequence charSequence, char c, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return v(charSequence, c, i2, z);
    }
}

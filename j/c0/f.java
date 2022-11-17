package j.c0;

import j.s.g;
import j.x.c.l;
import j.x.d.i;
import j.x.d.j;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f extends e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends j implements l<String, String> {

        /* renamed from: e  reason: collision with root package name */
        public static final a f3433e = new a();

        a() {
            super(1);
        }

        public final String a(String str) {
            i.d(str, "line");
            return str;
        }

        @Override // j.x.c.l
        public /* bridge */ /* synthetic */ String invoke(String str) {
            String str2 = str;
            a(str2);
            return str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends j implements l<String, String> {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f3434e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f3434e = str;
        }

        /* renamed from: a */
        public final String invoke(String str) {
            i.d(str, "line");
            return this.f3434e + str;
        }
    }

    private static final l<String, String> b(String str) {
        return str.length() == 0 ? a.f3433e : new b(str);
    }

    private static final int c(String str) {
        int length = str.length();
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            } else if (!j.c0.a.c(str.charAt(i2))) {
                break;
            } else {
                i2++;
            }
        }
        return i2 == -1 ? str.length() : i2;
    }

    public static final String d(String str, String str2) {
        String b0;
        i.d(str, "<this>");
        i.d(str2, "newIndent");
        List<String> I = n.I(str);
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : I) {
            if (!d.l((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(g.g(arrayList, 10));
        for (String str3 : arrayList) {
            arrayList2.add(Integer.valueOf(c(str3)));
        }
        Integer num = (Integer) g.m(arrayList2);
        int i2 = 0;
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * I.size());
        l<String, String> b2 = b(str2);
        int c = g.c(I);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : I) {
            i2++;
            String str4 = null;
            if (i2 >= 0) {
                String str5 = (String) obj2;
                if ((!(i2 == 0 || i2 == c) || !d.l(str5)) && ((b0 = p.b0(str5, intValue)) == null || (str4 = b2.invoke(b0)) == null)) {
                    str4 = str5;
                }
                if (str4 != null) {
                    arrayList3.add(str4);
                }
            } else {
                g.f();
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder(length);
        g.j(arrayList3, sb, "\n", null, null, 0, null, null, e.a.j.G0, null);
        String sb2 = sb.toString();
        i.c(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb2;
    }

    public static String e(String str) {
        i.d(str, "<this>");
        return d(str, "");
    }
}

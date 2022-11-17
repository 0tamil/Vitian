package androidx.core.content.d;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import e.d.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class c {

    /* loaded from: classes.dex */
    public interface a {
    }

    /* loaded from: classes.dex */
    public static final class b implements a {
        private final C0017c[] a;

        public b(C0017c[] cVarArr) {
            this.a = cVarArr;
        }

        public C0017c[] a() {
            return this.a;
        }
    }

    /* renamed from: androidx.core.content.d.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0017c {
        private final String a;
        private int b;
        private boolean c;

        /* renamed from: d  reason: collision with root package name */
        private String f620d;

        /* renamed from: e  reason: collision with root package name */
        private int f621e;

        /* renamed from: f  reason: collision with root package name */
        private int f622f;

        public C0017c(String str, int i2, boolean z, String str2, int i3, int i4) {
            this.a = str;
            this.b = i2;
            this.c = z;
            this.f620d = str2;
            this.f621e = i3;
            this.f622f = i4;
        }

        public String a() {
            return this.a;
        }

        public int b() {
            return this.f622f;
        }

        public int c() {
            return this.f621e;
        }

        public String d() {
            return this.f620d;
        }

        public int e() {
            return this.b;
        }

        public boolean f() {
            return this.c;
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements a {
        private final e.d.m.d a;
        private final int b;
        private final int c;

        /* renamed from: d  reason: collision with root package name */
        private final String f623d;

        public d(e.d.m.d dVar, int i2, int i3, String str) {
            this.a = dVar;
            this.c = i2;
            this.b = i3;
            this.f623d = str;
        }

        public int a() {
            return this.c;
        }

        public e.d.m.d b() {
            return this.a;
        }

        public String c() {
            return this.f623d;
        }

        public int d() {
            return this.b;
        }
    }

    private static int a(TypedArray typedArray, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(i2);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i2, typedValue);
        return typedValue.type;
    }

    public static a b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> c(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i2)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    private static a d(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static a e(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), i.f2057e);
        String string = obtainAttributes.getString(i.f2058f);
        String string2 = obtainAttributes.getString(i.f2062j);
        String string3 = obtainAttributes.getString(i.f2063k);
        int resourceId = obtainAttributes.getResourceId(i.f2059g, 0);
        int integer = obtainAttributes.getInteger(i.f2060h, 1);
        int integer2 = obtainAttributes.getInteger(i.f2061i, 500);
        String string4 = obtainAttributes.getString(i.l);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(f(xmlPullParser, resources));
                    } else {
                        g(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new b((C0017c[]) arrayList.toArray(new C0017c[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new d(new e.d.m.d(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
    }

    private static C0017c f(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), i.m);
        int i2 = i.v;
        if (!obtainAttributes.hasValue(i2)) {
            i2 = i.o;
        }
        int i3 = obtainAttributes.getInt(i2, 400);
        int i4 = i.t;
        if (!obtainAttributes.hasValue(i4)) {
            i4 = i.p;
        }
        boolean z = 1 == obtainAttributes.getInt(i4, 0);
        int i5 = i.w;
        if (!obtainAttributes.hasValue(i5)) {
            i5 = i.q;
        }
        int i6 = i.u;
        if (!obtainAttributes.hasValue(i6)) {
            i6 = i.r;
        }
        String string = obtainAttributes.getString(i6);
        int i7 = obtainAttributes.getInt(i5, 0);
        int i8 = i.s;
        if (!obtainAttributes.hasValue(i8)) {
            i8 = i.n;
        }
        int resourceId = obtainAttributes.getResourceId(i8, 0);
        String string2 = obtainAttributes.getString(i8);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new C0017c(string2, i3, z, string, i7, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    private static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}

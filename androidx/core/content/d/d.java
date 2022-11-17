package androidx.core.content.d;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import e.d.i;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a {
        final int[] a;
        final float[] b;

        a(int i2, int i3) {
            this.a = new int[]{i2, i3};
            this.b = new float[]{0.0f, 1.0f};
        }

        a(int i2, int i3, int i4) {
            this.a = new int[]{i2, i3, i4};
            this.b = new float[]{0.0f, 0.5f, 1.0f};
        }

        a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.a = new int[size];
            this.b = new float[size];
            for (int i2 = 0; i2 < size; i2++) {
                this.a[i2] = list.get(i2).intValue();
                this.b[i2] = list2.get(i2).floatValue();
            }
        }
    }

    private static a a(a aVar, int i2, int i3, boolean z, int i4) {
        return aVar != null ? aVar : z ? new a(i2, i4, i3) : new a(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            TypedArray k2 = g.k(resources, theme, attributeSet, i.x);
            float f2 = g.f(k2, xmlPullParser, "startX", i.G, 0.0f);
            float f3 = g.f(k2, xmlPullParser, "startY", i.H, 0.0f);
            float f4 = g.f(k2, xmlPullParser, "endX", i.I, 0.0f);
            float f5 = g.f(k2, xmlPullParser, "endY", i.J, 0.0f);
            float f6 = g.f(k2, xmlPullParser, "centerX", i.B, 0.0f);
            float f7 = g.f(k2, xmlPullParser, "centerY", i.C, 0.0f);
            int g2 = g.g(k2, xmlPullParser, "type", i.A, 0);
            int b = g.b(k2, xmlPullParser, "startColor", i.y, 0);
            boolean j2 = g.j(xmlPullParser, "centerColor");
            int b2 = g.b(k2, xmlPullParser, "centerColor", i.F, 0);
            int b3 = g.b(k2, xmlPullParser, "endColor", i.z, 0);
            int g3 = g.g(k2, xmlPullParser, "tileMode", i.E, 0);
            float f8 = g.f(k2, xmlPullParser, "gradientRadius", i.D, 0.0f);
            k2.recycle();
            a a2 = a(c(resources, xmlPullParser, attributeSet, theme), b, b3, j2, b2);
            if (g2 != 1) {
                return g2 != 2 ? new LinearGradient(f2, f3, f4, f5, a2.a, a2.b, d(g3)) : new SweepGradient(f6, f7, a2.a, a2.b);
            }
            if (f8 > 0.0f) {
                return new RadialGradient(f6, f7, f8, a2.a, a2.b, d(g3));
            }
            throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static a c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int depth2 = xmlPullParser.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            } else if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray k2 = g.k(resources, theme, attributeSet, i.K);
                int i2 = i.L;
                boolean hasValue = k2.hasValue(i2);
                int i3 = i.M;
                boolean hasValue2 = k2.hasValue(i3);
                if (!hasValue || !hasValue2) {
                    break;
                }
                int color = k2.getColor(i2, 0);
                float f2 = k2.getFloat(i3, 0.0f);
                k2.recycle();
                arrayList2.add(Integer.valueOf(color));
                arrayList.add(Float.valueOf(f2));
            }
        }
        if (arrayList2.size() > 0) {
            return new a(arrayList2, arrayList);
        }
        return null;
    }

    private static Shader.TileMode d(int i2) {
        return i2 != 1 ? i2 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }
}

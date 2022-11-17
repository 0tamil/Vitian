package androidx.core.content.d;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import e.d.i;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public final class a {
    private static final ThreadLocal<TypedValue> a = new ThreadLocal<>();

    public static ColorStateList a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return e(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    private static TypedValue c() {
        ThreadLocal<TypedValue> threadLocal = a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static ColorStateList d(Resources resources, int i2, Resources.Theme theme) {
        try {
            return a(resources, resources.getXml(i2), theme);
        } catch (Exception e2) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
        if (r9.hasValue(r12) != false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ColorStateList e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int i2;
        int i3;
        int attributeCount;
        int i4;
        int i5 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20];
        int[] iArr2 = new int[20];
        int i6 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i5 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray h2 = h(resources, theme, attributeSet, i.a);
                int i7 = i.b;
                int resourceId = h2.getResourceId(i7, -1);
                if (resourceId != -1 && !f(resources, resourceId)) {
                    try {
                        i2 = a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                    } catch (Exception unused) {
                        i7 = i.b;
                    }
                    float f2 = 1.0f;
                    i3 = i.c;
                    if (!h2.hasValue(i3)) {
                        i3 = i.f2056d;
                    }
                    f2 = h2.getFloat(i3, 1.0f);
                    h2.recycle();
                    attributeCount = attributeSet.getAttributeCount();
                    int[] iArr3 = new int[attributeCount];
                    int i8 = 0;
                    for (i4 = 0; i4 < attributeCount; i4++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i4);
                        if (!(attributeNameResource == 16843173 || attributeNameResource == 16843551 || attributeNameResource == e.d.a.a_res_0x7f03002b)) {
                            i8++;
                            if (!attributeSet.getAttributeBooleanValue(i4, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr3[i8] = attributeNameResource;
                        }
                    }
                    int[] trimStateSet = StateSet.trimStateSet(iArr3, i8);
                    iArr2 = e.a(iArr2, i6, g(i2, f2));
                    iArr = (int[][]) e.b(iArr, i6, trimStateSet);
                    i6++;
                }
                i2 = h2.getColor(i7, -65281);
                float f22 = 1.0f;
                i3 = i.c;
                if (!h2.hasValue(i3)) {
                }
                f22 = h2.getFloat(i3, 1.0f);
                h2.recycle();
                attributeCount = attributeSet.getAttributeCount();
                int[] iArr32 = new int[attributeCount];
                int i82 = 0;
                while (i4 < attributeCount) {
                }
                int[] trimStateSet2 = StateSet.trimStateSet(iArr32, i82);
                iArr2 = e.a(iArr2, i6, g(i2, f22));
                iArr = (int[][]) e.b(iArr, i6, trimStateSet2);
                i6++;
            }
            i5 = 1;
        }
        int[] iArr4 = new int[i6];
        int[][] iArr5 = new int[i6];
        System.arraycopy(iArr2, 0, iArr4, 0, i6);
        System.arraycopy(iArr, 0, iArr5, 0, i6);
        return new ColorStateList(iArr5, iArr4);
    }

    private static boolean f(Resources resources, int i2) {
        TypedValue c = c();
        resources.getValue(i2, c, true);
        int i3 = c.type;
        return i3 >= 28 && i3 <= 31;
    }

    private static int g(int i2, float f2) {
        return (i2 & 16777215) | (Math.round(Color.alpha(i2) * f2) << 24);
    }

    private static TypedArray h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}

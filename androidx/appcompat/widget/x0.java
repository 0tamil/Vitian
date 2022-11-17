package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.d.f;
import e.a.k.a.a;
/* loaded from: classes.dex */
public class x0 {
    private final Context a;
    private final TypedArray b;
    private TypedValue c;

    private x0(Context context, TypedArray typedArray) {
        this.a = context;
        this.b = typedArray;
    }

    public static x0 s(Context context, int i2, int[] iArr) {
        return new x0(context, context.obtainStyledAttributes(i2, iArr));
    }

    public static x0 t(Context context, AttributeSet attributeSet, int[] iArr) {
        return new x0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static x0 u(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3) {
        return new x0(context, context.obtainStyledAttributes(attributeSet, iArr, i2, i3));
    }

    public boolean a(int i2, boolean z) {
        return this.b.getBoolean(i2, z);
    }

    public int b(int i2, int i3) {
        return this.b.getColor(i2, i3);
    }

    public ColorStateList c(int i2) {
        int resourceId;
        ColorStateList c;
        return (!this.b.hasValue(i2) || (resourceId = this.b.getResourceId(i2, 0)) == 0 || (c = a.c(this.a, resourceId)) == null) ? this.b.getColorStateList(i2) : c;
    }

    public int d(int i2, int i3) {
        return this.b.getDimensionPixelOffset(i2, i3);
    }

    public int e(int i2, int i3) {
        return this.b.getDimensionPixelSize(i2, i3);
    }

    public Drawable f(int i2) {
        int resourceId;
        return (!this.b.hasValue(i2) || (resourceId = this.b.getResourceId(i2, 0)) == 0) ? this.b.getDrawable(i2) : a.d(this.a, resourceId);
    }

    public Drawable g(int i2) {
        int resourceId;
        if (!this.b.hasValue(i2) || (resourceId = this.b.getResourceId(i2, 0)) == 0) {
            return null;
        }
        return j.b().d(this.a, resourceId, true);
    }

    public float h(int i2, float f2) {
        return this.b.getFloat(i2, f2);
    }

    public Typeface i(int i2, int i3, f.c cVar) {
        int resourceId = this.b.getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.c == null) {
            this.c = new TypedValue();
        }
        return f.e(this.a, resourceId, this.c, i3, cVar);
    }

    public int j(int i2, int i3) {
        return this.b.getInt(i2, i3);
    }

    public int k(int i2, int i3) {
        return this.b.getInteger(i2, i3);
    }

    public int l(int i2, int i3) {
        return this.b.getLayoutDimension(i2, i3);
    }

    public int m(int i2, int i3) {
        return this.b.getResourceId(i2, i3);
    }

    public String n(int i2) {
        return this.b.getString(i2);
    }

    public CharSequence o(int i2) {
        return this.b.getText(i2);
    }

    public CharSequence[] p(int i2) {
        return this.b.getTextArray(i2);
    }

    public TypedArray q() {
        return this.b;
    }

    public boolean r(int i2) {
        return this.b.hasValue(i2);
    }

    public void v() {
        this.b.recycle();
    }
}

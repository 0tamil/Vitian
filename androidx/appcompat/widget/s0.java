package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import e.a.j;
import e.d.j.a;
/* loaded from: classes.dex */
public class s0 {
    private static final ThreadLocal<TypedValue> a = new ThreadLocal<>();
    static final int[] b = {-16842910};
    static final int[] c = {16842908};

    /* renamed from: d  reason: collision with root package name */
    static final int[] f482d = {16842919};

    /* renamed from: e  reason: collision with root package name */
    static final int[] f483e = {16842912};

    /* renamed from: f  reason: collision with root package name */
    static final int[] f484f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f485g = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(j.u0);
        try {
            if (!obtainStyledAttributes.hasValue(j.z0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i2) {
        ColorStateList e2 = e(context, i2);
        if (e2 != null && e2.isStateful()) {
            return e2.getColorForState(b, e2.getDefaultColor());
        }
        TypedValue f2 = f();
        context.getTheme().resolveAttribute(16842803, f2, true);
        return d(context, i2, f2.getFloat());
    }

    public static int c(Context context, int i2) {
        int[] iArr = f485g;
        iArr[0] = i2;
        x0 t = x0.t(context, null, iArr);
        try {
            return t.b(0, 0);
        } finally {
            t.v();
        }
    }

    static int d(Context context, int i2, float f2) {
        int c2 = c(context, i2);
        return a.d(c2, Math.round(Color.alpha(c2) * f2));
    }

    public static ColorStateList e(Context context, int i2) {
        int[] iArr = f485g;
        iArr[0] = i2;
        x0 t = x0.t(context, null, iArr);
        try {
            return t.c(0);
        } finally {
            t.v();
        }
    }

    private static TypedValue f() {
        ThreadLocal<TypedValue> threadLocal = a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}

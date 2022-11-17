package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import e.c.h;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: i  reason: collision with root package name */
    private static n0 f444i;
    private WeakHashMap<Context, h<ColorStateList>> a;
    private e.c.g<String, e> b;
    private h<String> c;

    /* renamed from: d  reason: collision with root package name */
    private final WeakHashMap<Context, e.c.d<WeakReference<Drawable.ConstantState>>> f446d = new WeakHashMap<>(0);

    /* renamed from: e  reason: collision with root package name */
    private TypedValue f447e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f448f;

    /* renamed from: g  reason: collision with root package name */
    private f f449g;

    /* renamed from: h  reason: collision with root package name */
    private static final PorterDuff.Mode f443h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j  reason: collision with root package name */
    private static final c f445j = new c(6);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements e {
        a() {
        }

        @Override // androidx.appcompat.widget.n0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return e.a.l.a.a.m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e2);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements e {
        b() {
        }

        @Override // androidx.appcompat.widget.n0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return e.m.a.a.b.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e2);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends e.c.e<Integer, PorterDuffColorFilter> {
        public c(int i2) {
            super(i2);
        }

        private static int h(int i2, PorterDuff.Mode mode) {
            return ((i2 + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter i(int i2, PorterDuff.Mode mode) {
            return c(Integer.valueOf(h(i2, mode)));
        }

        PorterDuffColorFilter j(int i2, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return d(Integer.valueOf(h(i2, mode)), porterDuffColorFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d implements e {
        d() {
        }

        @Override // androidx.appcompat.widget.n0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    if (Build.VERSION.SDK_INT >= 21) {
                        drawable.inflate(context.getResources(), xmlPullParser, attributeSet, theme);
                    } else {
                        drawable.inflate(context.getResources(), xmlPullParser, attributeSet);
                    }
                    return drawable;
                } catch (Exception e2) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e2);
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface e {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* loaded from: classes.dex */
    public interface f {
        Drawable a(n0 n0Var, Context context, int i2);

        boolean b(Context context, int i2, Drawable drawable);

        ColorStateList c(Context context, int i2);

        boolean d(Context context, int i2, Drawable drawable);

        PorterDuff.Mode e(int i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class g implements e {
        g() {
        }

        @Override // androidx.appcompat.widget.n0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return e.m.a.a.h.c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e2);
                return null;
            }
        }
    }

    private void a(String str, e eVar) {
        if (this.b == null) {
            this.b = new e.c.g<>();
        }
        this.b.put(str, eVar);
    }

    private synchronized boolean b(Context context, long j2, Drawable drawable) {
        boolean z;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            e.c.d<WeakReference<Drawable.ConstantState>> dVar = this.f446d.get(context);
            if (dVar == null) {
                dVar = new e.c.d<>();
                this.f446d.put(context, dVar);
            }
            dVar.j(j2, new WeakReference<>(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    private void c(Context context, int i2, ColorStateList colorStateList) {
        if (this.a == null) {
            this.a = new WeakHashMap<>();
        }
        h<ColorStateList> hVar = this.a.get(context);
        if (hVar == null) {
            hVar = new h<>();
            this.a.put(context, hVar);
        }
        hVar.b(i2, colorStateList);
    }

    private void d(Context context) {
        if (!this.f448f) {
            this.f448f = true;
            Drawable j2 = j(context, e.a.m.a.a_res_0x7f07004e);
            if (j2 == null || !q(j2)) {
                this.f448f = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    private static long e(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private Drawable f(Context context, int i2) {
        if (this.f447e == null) {
            this.f447e = new TypedValue();
        }
        TypedValue typedValue = this.f447e;
        context.getResources().getValue(i2, typedValue, true);
        long e2 = e(typedValue);
        Drawable i3 = i(context, e2);
        if (i3 != null) {
            return i3;
        }
        f fVar = this.f449g;
        Drawable a2 = fVar == null ? null : fVar.a(this, context, i2);
        if (a2 != null) {
            a2.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, e2, a2);
        }
        return a2;
    }

    private static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return l(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized n0 h() {
        n0 n0Var;
        synchronized (n0.class) {
            if (f444i == null) {
                n0 n0Var2 = new n0();
                f444i = n0Var2;
                p(n0Var2);
            }
            n0Var = f444i;
        }
        return n0Var;
    }

    private synchronized Drawable i(Context context, long j2) {
        e.c.d<WeakReference<Drawable.ConstantState>> dVar = this.f446d.get(context);
        if (dVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> g2 = dVar.g(j2);
        if (g2 != null) {
            Drawable.ConstantState constantState = g2.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            dVar.k(j2);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter l(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter i3;
        synchronized (n0.class) {
            c cVar = f445j;
            i3 = cVar.i(i2, mode);
            if (i3 == null) {
                i3 = new PorterDuffColorFilter(i2, mode);
                cVar.j(i2, mode, i3);
            }
        }
        return i3;
    }

    private ColorStateList n(Context context, int i2) {
        h<ColorStateList> hVar;
        WeakHashMap<Context, h<ColorStateList>> weakHashMap = this.a;
        if (weakHashMap == null || (hVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return hVar.g(i2);
    }

    private static void p(n0 n0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            n0Var.a("vector", new g());
            n0Var.a("animated-vector", new b());
            n0Var.a("animated-selector", new a());
            n0Var.a("drawable", new d());
        }
    }

    private static boolean q(Drawable drawable) {
        return (drawable instanceof e.m.a.a.h) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private Drawable r(Context context, int i2) {
        int next;
        e.c.g<String, e> gVar = this.b;
        if (gVar == null || gVar.isEmpty()) {
            return null;
        }
        h<String> hVar = this.c;
        if (hVar != null) {
            String g2 = hVar.g(i2);
            if ("appcompat_skip_skip".equals(g2) || (g2 != null && this.b.get(g2) == null)) {
                return null;
            }
        } else {
            this.c = new h<>();
        }
        if (this.f447e == null) {
            this.f447e = new TypedValue();
        }
        TypedValue typedValue = this.f447e;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long e2 = e(typedValue);
        Drawable i3 = i(context, e2);
        if (i3 != null) {
            return i3;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                }
                if (next == 2) {
                    String name = xml.getName();
                    this.c.b(i2, name);
                    e eVar = this.b.get(name);
                    if (eVar != null) {
                        i3 = eVar.a(context, xml, asAttributeSet, context.getTheme());
                    }
                    if (i3 != null) {
                        i3.setChangingConfigurations(typedValue.changingConfigurations);
                        b(context, e2, i3);
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (Exception e3) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e3);
            }
        }
        if (i3 == null) {
            this.c.b(i2, "appcompat_skip_skip");
        }
        return i3;
    }

    private Drawable v(Context context, int i2, boolean z, Drawable drawable) {
        ColorStateList m = m(context, i2);
        if (m != null) {
            if (f0.a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable p = androidx.core.graphics.drawable.a.p(drawable);
            androidx.core.graphics.drawable.a.n(p, m);
            PorterDuff.Mode o = o(i2);
            if (o == null) {
                return p;
            }
            androidx.core.graphics.drawable.a.o(p, o);
            return p;
        }
        f fVar = this.f449g;
        if ((fVar == null || !fVar.d(context, i2, drawable)) && !x(context, i2, drawable) && z) {
            return null;
        }
        return drawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void w(Drawable drawable, v0 v0Var, int[] iArr) {
        if (!f0.a(drawable) || drawable.mutate() == drawable) {
            boolean z = v0Var.f489d;
            if (z || v0Var.c) {
                drawable.setColorFilter(g(z ? v0Var.a : null, v0Var.c ? v0Var.b : f443h, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    public synchronized Drawable j(Context context, int i2) {
        return k(context, i2, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized Drawable k(Context context, int i2, boolean z) {
        Drawable r;
        d(context);
        r = r(context, i2);
        if (r == null) {
            r = f(context, i2);
        }
        if (r == null) {
            r = androidx.core.content.a.f(context, i2);
        }
        if (r != null) {
            r = v(context, i2, z, r);
        }
        if (r != null) {
            f0.b(r);
        }
        return r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized ColorStateList m(Context context, int i2) {
        ColorStateList n;
        n = n(context, i2);
        if (n == null) {
            f fVar = this.f449g;
            n = fVar == null ? null : fVar.c(context, i2);
            if (n != null) {
                c(context, i2, n);
            }
        }
        return n;
    }

    PorterDuff.Mode o(int i2) {
        f fVar = this.f449g;
        if (fVar == null) {
            return null;
        }
        return fVar.e(i2);
    }

    public synchronized void s(Context context) {
        e.c.d<WeakReference<Drawable.ConstantState>> dVar = this.f446d.get(context);
        if (dVar != null) {
            dVar.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized Drawable t(Context context, c1 c1Var, int i2) {
        Drawable r = r(context, i2);
        if (r == null) {
            r = c1Var.c(i2);
        }
        if (r == null) {
            return null;
        }
        return v(context, i2, false, r);
    }

    public synchronized void u(f fVar) {
        this.f449g = fVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean x(Context context, int i2, Drawable drawable) {
        f fVar = this.f449g;
        return fVar != null && fVar.b(context, i2, drawable);
    }
}

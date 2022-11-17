package e.d.p;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
/* loaded from: classes.dex */
public class c0 {
    public static final c0 b;
    private final l a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        private static Field a;
        private static Field b;
        private static Field c;

        /* renamed from: d  reason: collision with root package name */
        private static boolean f2113d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                c = declaredField3;
                declaredField3.setAccessible(true);
                f2113d = true;
            } catch (ReflectiveOperationException e2) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e2.getMessage(), e2);
            }
        }

        public static c0 a(View view) {
            if (f2113d && view.isAttachedToWindow()) {
                try {
                    Object obj = a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) b.get(obj);
                        Rect rect2 = (Rect) c.get(obj);
                        if (!(rect == null || rect2 == null)) {
                            b bVar = new b();
                            bVar.b(e.d.j.b.c(rect));
                            bVar.c(e.d.j.b.c(rect2));
                            c0 a2 = bVar.a();
                            a2.r(a2);
                            a2.d(view.getRootView());
                            return a2;
                        }
                    }
                } catch (IllegalAccessException e2) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e2.getMessage(), e2);
                }
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private final f a;

        public b() {
            int i2 = Build.VERSION.SDK_INT;
            this.a = i2 >= 30 ? new e() : i2 >= 29 ? new d() : i2 >= 20 ? new c() : new f();
        }

        public b(c0 c0Var) {
            int i2 = Build.VERSION.SDK_INT;
            this.a = i2 >= 30 ? new e(c0Var) : i2 >= 29 ? new d(c0Var) : i2 >= 20 ? new c(c0Var) : new f(c0Var);
        }

        public c0 a() {
            return this.a.b();
        }

        @Deprecated
        public b b(e.d.j.b bVar) {
            this.a.d(bVar);
            return this;
        }

        @Deprecated
        public b c(e.d.j.b bVar) {
            this.a.f(bVar);
            return this;
        }
    }

    /* loaded from: classes.dex */
    private static class c extends f {

        /* renamed from: e  reason: collision with root package name */
        private static Field f2114e = null;

        /* renamed from: f  reason: collision with root package name */
        private static boolean f2115f = false;

        /* renamed from: g  reason: collision with root package name */
        private static Constructor<WindowInsets> f2116g = null;

        /* renamed from: h  reason: collision with root package name */
        private static boolean f2117h = false;
        private WindowInsets c;

        /* renamed from: d  reason: collision with root package name */
        private e.d.j.b f2118d;

        c() {
            this.c = h();
        }

        c(c0 c0Var) {
            super(c0Var);
            this.c = c0Var.t();
        }

        private static WindowInsets h() {
            if (!f2115f) {
                try {
                    f2114e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
                }
                f2115f = true;
            }
            Field field = f2114e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
                }
            }
            if (!f2117h) {
                try {
                    f2116g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
                }
                f2117h = true;
            }
            Constructor<WindowInsets> constructor = f2116g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e5) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
                }
            }
            return null;
        }

        @Override // e.d.p.c0.f
        c0 b() {
            a();
            c0 u = c0.u(this.c);
            u.p(this.b);
            u.s(this.f2118d);
            return u;
        }

        @Override // e.d.p.c0.f
        void d(e.d.j.b bVar) {
            this.f2118d = bVar;
        }

        @Override // e.d.p.c0.f
        void f(e.d.j.b bVar) {
            WindowInsets windowInsets = this.c;
            if (windowInsets != null) {
                this.c = windowInsets.replaceSystemWindowInsets(bVar.a, bVar.b, bVar.c, bVar.f2065d);
            }
        }
    }

    /* loaded from: classes.dex */
    private static class d extends f {
        final WindowInsets.Builder c;

        d() {
            this.c = new WindowInsets.Builder();
        }

        d(c0 c0Var) {
            super(c0Var);
            WindowInsets t = c0Var.t();
            this.c = t != null ? new WindowInsets.Builder(t) : new WindowInsets.Builder();
        }

        @Override // e.d.p.c0.f
        c0 b() {
            a();
            c0 u = c0.u(this.c.build());
            u.p(this.b);
            return u;
        }

        @Override // e.d.p.c0.f
        void c(e.d.j.b bVar) {
            this.c.setMandatorySystemGestureInsets(bVar.e());
        }

        @Override // e.d.p.c0.f
        void d(e.d.j.b bVar) {
            this.c.setStableInsets(bVar.e());
        }

        @Override // e.d.p.c0.f
        void e(e.d.j.b bVar) {
            this.c.setSystemGestureInsets(bVar.e());
        }

        @Override // e.d.p.c0.f
        void f(e.d.j.b bVar) {
            this.c.setSystemWindowInsets(bVar.e());
        }

        @Override // e.d.p.c0.f
        void g(e.d.j.b bVar) {
            this.c.setTappableElementInsets(bVar.e());
        }
    }

    /* loaded from: classes.dex */
    private static class e extends d {
        e() {
        }

        e(c0 c0Var) {
            super(c0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f {
        private final c0 a;
        e.d.j.b[] b;

        f() {
            this(new c0((c0) null));
        }

        f(c0 c0Var) {
            this.a = c0Var;
        }

        protected final void a() {
            e.d.j.b[] bVarArr = this.b;
            if (bVarArr != null) {
                e.d.j.b bVar = bVarArr[m.a(1)];
                e.d.j.b bVar2 = this.b[m.a(2)];
                if (bVar2 == null) {
                    bVar2 = this.a.f(2);
                }
                if (bVar == null) {
                    bVar = this.a.f(1);
                }
                f(e.d.j.b.a(bVar, bVar2));
                e.d.j.b bVar3 = this.b[m.a(16)];
                if (bVar3 != null) {
                    e(bVar3);
                }
                e.d.j.b bVar4 = this.b[m.a(32)];
                if (bVar4 != null) {
                    c(bVar4);
                }
                e.d.j.b bVar5 = this.b[m.a(64)];
                if (bVar5 != null) {
                    g(bVar5);
                }
            }
        }

        c0 b() {
            a();
            return this.a;
        }

        void c(e.d.j.b bVar) {
        }

        void d(e.d.j.b bVar) {
        }

        void e(e.d.j.b bVar) {
        }

        void f(e.d.j.b bVar) {
        }

        void g(e.d.j.b bVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class g extends l {

        /* renamed from: h  reason: collision with root package name */
        private static boolean f2119h = false;

        /* renamed from: i  reason: collision with root package name */
        private static Method f2120i;

        /* renamed from: j  reason: collision with root package name */
        private static Class<?> f2121j;

        /* renamed from: k  reason: collision with root package name */
        private static Class<?> f2122k;
        private static Field l;
        private static Field m;
        final WindowInsets c;

        /* renamed from: d  reason: collision with root package name */
        private e.d.j.b[] f2123d;

        /* renamed from: e  reason: collision with root package name */
        private e.d.j.b f2124e;

        /* renamed from: f  reason: collision with root package name */
        private c0 f2125f;

        /* renamed from: g  reason: collision with root package name */
        e.d.j.b f2126g;

        g(c0 c0Var, WindowInsets windowInsets) {
            super(c0Var);
            this.f2124e = null;
            this.c = windowInsets;
        }

        g(c0 c0Var, g gVar) {
            this(c0Var, new WindowInsets(gVar.c));
        }

        @SuppressLint({"WrongConstant"})
        private e.d.j.b t(int i2, boolean z) {
            e.d.j.b bVar = e.d.j.b.f2064e;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) != 0) {
                    bVar = e.d.j.b.a(bVar, u(i3, z));
                }
            }
            return bVar;
        }

        private e.d.j.b v() {
            c0 c0Var = this.f2125f;
            return c0Var != null ? c0Var.g() : e.d.j.b.f2064e;
        }

        private e.d.j.b w(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f2119h) {
                    x();
                }
                Method method = f2120i;
                if (!(method == null || f2122k == null || l == null)) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) l.get(m.get(invoke));
                        if (rect != null) {
                            return e.d.j.b.c(rect);
                        }
                        return null;
                    } catch (ReflectiveOperationException e2) {
                        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @SuppressLint({"PrivateApi"})
        private static void x() {
            try {
                f2120i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                f2121j = Class.forName("android.view.ViewRootImpl");
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f2122k = cls;
                l = cls.getDeclaredField("mVisibleInsets");
                m = f2121j.getDeclaredField("mAttachInfo");
                l.setAccessible(true);
                m.setAccessible(true);
            } catch (ReflectiveOperationException e2) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
            }
            f2119h = true;
        }

        @Override // e.d.p.c0.l
        void d(View view) {
            e.d.j.b w = w(view);
            if (w == null) {
                w = e.d.j.b.f2064e;
            }
            q(w);
        }

        @Override // e.d.p.c0.l
        void e(c0 c0Var) {
            c0Var.r(this.f2125f);
            c0Var.q(this.f2126g);
        }

        @Override // e.d.p.c0.l
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f2126g, ((g) obj).f2126g);
        }

        @Override // e.d.p.c0.l
        public e.d.j.b g(int i2) {
            return t(i2, false);
        }

        @Override // e.d.p.c0.l
        final e.d.j.b k() {
            if (this.f2124e == null) {
                this.f2124e = e.d.j.b.b(this.c.getSystemWindowInsetLeft(), this.c.getSystemWindowInsetTop(), this.c.getSystemWindowInsetRight(), this.c.getSystemWindowInsetBottom());
            }
            return this.f2124e;
        }

        @Override // e.d.p.c0.l
        c0 m(int i2, int i3, int i4, int i5) {
            b bVar = new b(c0.u(this.c));
            bVar.c(c0.m(k(), i2, i3, i4, i5));
            bVar.b(c0.m(i(), i2, i3, i4, i5));
            return bVar.a();
        }

        @Override // e.d.p.c0.l
        boolean o() {
            return this.c.isRound();
        }

        @Override // e.d.p.c0.l
        public void p(e.d.j.b[] bVarArr) {
            this.f2123d = bVarArr;
        }

        @Override // e.d.p.c0.l
        void q(e.d.j.b bVar) {
            this.f2126g = bVar;
        }

        @Override // e.d.p.c0.l
        void r(c0 c0Var) {
            this.f2125f = c0Var;
        }

        protected e.d.j.b u(int i2, boolean z) {
            int i3;
            if (i2 == 1) {
                return z ? e.d.j.b.b(0, Math.max(v().b, k().b), 0, 0) : e.d.j.b.b(0, k().b, 0, 0);
            }
            e.d.j.b bVar = null;
            if (i2 != 2) {
                if (i2 == 8) {
                    e.d.j.b[] bVarArr = this.f2123d;
                    if (bVarArr != null) {
                        bVar = bVarArr[m.a(8)];
                    }
                    if (bVar != null) {
                        return bVar;
                    }
                    e.d.j.b k2 = k();
                    e.d.j.b v = v();
                    int i4 = k2.f2065d;
                    if (i4 > v.f2065d) {
                        return e.d.j.b.b(0, 0, 0, i4);
                    }
                    e.d.j.b bVar2 = this.f2126g;
                    return (bVar2 == null || bVar2.equals(e.d.j.b.f2064e) || (i3 = this.f2126g.f2065d) <= v.f2065d) ? e.d.j.b.f2064e : e.d.j.b.b(0, 0, 0, i3);
                } else if (i2 == 16) {
                    return j();
                } else {
                    if (i2 == 32) {
                        return h();
                    }
                    if (i2 == 64) {
                        return l();
                    }
                    if (i2 != 128) {
                        return e.d.j.b.f2064e;
                    }
                    c0 c0Var = this.f2125f;
                    e.d.p.d e2 = c0Var != null ? c0Var.e() : f();
                    return e2 != null ? e.d.j.b.b(e2.b(), e2.d(), e2.c(), e2.a()) : e.d.j.b.f2064e;
                }
            } else if (z) {
                e.d.j.b v2 = v();
                e.d.j.b i5 = i();
                return e.d.j.b.b(Math.max(v2.a, i5.a), 0, Math.max(v2.c, i5.c), Math.max(v2.f2065d, i5.f2065d));
            } else {
                e.d.j.b k3 = k();
                c0 c0Var2 = this.f2125f;
                if (c0Var2 != null) {
                    bVar = c0Var2.g();
                }
                int i6 = k3.f2065d;
                if (bVar != null) {
                    i6 = Math.min(i6, bVar.f2065d);
                }
                return e.d.j.b.b(k3.a, 0, k3.c, i6);
            }
        }
    }

    /* loaded from: classes.dex */
    private static class h extends g {
        private e.d.j.b n;

        h(c0 c0Var, WindowInsets windowInsets) {
            super(c0Var, windowInsets);
            this.n = null;
        }

        h(c0 c0Var, h hVar) {
            super(c0Var, hVar);
            this.n = null;
            this.n = hVar.n;
        }

        @Override // e.d.p.c0.l
        c0 b() {
            return c0.u(this.c.consumeStableInsets());
        }

        @Override // e.d.p.c0.l
        c0 c() {
            return c0.u(this.c.consumeSystemWindowInsets());
        }

        @Override // e.d.p.c0.l
        final e.d.j.b i() {
            if (this.n == null) {
                this.n = e.d.j.b.b(this.c.getStableInsetLeft(), this.c.getStableInsetTop(), this.c.getStableInsetRight(), this.c.getStableInsetBottom());
            }
            return this.n;
        }

        @Override // e.d.p.c0.l
        boolean n() {
            return this.c.isConsumed();
        }

        @Override // e.d.p.c0.l
        public void s(e.d.j.b bVar) {
            this.n = bVar;
        }
    }

    /* loaded from: classes.dex */
    private static class i extends h {
        i(c0 c0Var, WindowInsets windowInsets) {
            super(c0Var, windowInsets);
        }

        i(c0 c0Var, i iVar) {
            super(c0Var, iVar);
        }

        @Override // e.d.p.c0.l
        c0 a() {
            return c0.u(this.c.consumeDisplayCutout());
        }

        @Override // e.d.p.c0.g, e.d.p.c0.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.c, iVar.c) && Objects.equals(this.f2126g, iVar.f2126g);
        }

        @Override // e.d.p.c0.l
        e.d.p.d f() {
            return e.d.p.d.e(this.c.getDisplayCutout());
        }

        @Override // e.d.p.c0.l
        public int hashCode() {
            return this.c.hashCode();
        }
    }

    /* loaded from: classes.dex */
    private static class j extends i {
        private e.d.j.b o = null;
        private e.d.j.b p = null;
        private e.d.j.b q = null;

        j(c0 c0Var, WindowInsets windowInsets) {
            super(c0Var, windowInsets);
        }

        j(c0 c0Var, j jVar) {
            super(c0Var, jVar);
        }

        @Override // e.d.p.c0.l
        e.d.j.b h() {
            if (this.p == null) {
                this.p = e.d.j.b.d(this.c.getMandatorySystemGestureInsets());
            }
            return this.p;
        }

        @Override // e.d.p.c0.l
        e.d.j.b j() {
            if (this.o == null) {
                this.o = e.d.j.b.d(this.c.getSystemGestureInsets());
            }
            return this.o;
        }

        @Override // e.d.p.c0.l
        e.d.j.b l() {
            if (this.q == null) {
                this.q = e.d.j.b.d(this.c.getTappableElementInsets());
            }
            return this.q;
        }

        @Override // e.d.p.c0.g, e.d.p.c0.l
        c0 m(int i2, int i3, int i4, int i5) {
            return c0.u(this.c.inset(i2, i3, i4, i5));
        }

        @Override // e.d.p.c0.h, e.d.p.c0.l
        public void s(e.d.j.b bVar) {
        }
    }

    /* loaded from: classes.dex */
    private static class k extends j {
        static final c0 r = c0.u(WindowInsets.CONSUMED);

        k(c0 c0Var, WindowInsets windowInsets) {
            super(c0Var, windowInsets);
        }

        k(c0 c0Var, k kVar) {
            super(c0Var, kVar);
        }

        @Override // e.d.p.c0.g, e.d.p.c0.l
        final void d(View view) {
        }

        @Override // e.d.p.c0.g, e.d.p.c0.l
        public e.d.j.b g(int i2) {
            return e.d.j.b.d(this.c.getInsets(n.a(i2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class l {
        static final c0 b = new b().a().a().b().c();
        final c0 a;

        l(c0 c0Var) {
            this.a = c0Var;
        }

        c0 a() {
            return this.a;
        }

        c0 b() {
            return this.a;
        }

        c0 c() {
            return this.a;
        }

        void d(View view) {
        }

        void e(c0 c0Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return o() == lVar.o() && n() == lVar.n() && e.d.o.c.a(k(), lVar.k()) && e.d.o.c.a(i(), lVar.i()) && e.d.o.c.a(f(), lVar.f());
        }

        e.d.p.d f() {
            return null;
        }

        e.d.j.b g(int i2) {
            return e.d.j.b.f2064e;
        }

        e.d.j.b h() {
            return k();
        }

        public int hashCode() {
            return e.d.o.c.b(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), f());
        }

        e.d.j.b i() {
            return e.d.j.b.f2064e;
        }

        e.d.j.b j() {
            return k();
        }

        e.d.j.b k() {
            return e.d.j.b.f2064e;
        }

        e.d.j.b l() {
            return k();
        }

        c0 m(int i2, int i3, int i4, int i5) {
            return b;
        }

        boolean n() {
            return false;
        }

        boolean o() {
            return false;
        }

        public void p(e.d.j.b[] bVarArr) {
        }

        void q(e.d.j.b bVar) {
        }

        void r(c0 c0Var) {
        }

        public void s(e.d.j.b bVar) {
        }
    }

    /* loaded from: classes.dex */
    public static final class m {
        static int a(int i2) {
            if (i2 == 1) {
                return 0;
            }
            if (i2 == 2) {
                return 1;
            }
            if (i2 == 4) {
                return 2;
            }
            if (i2 == 8) {
                return 3;
            }
            if (i2 == 16) {
                return 4;
            }
            if (i2 == 32) {
                return 5;
            }
            if (i2 == 64) {
                return 6;
            }
            if (i2 == 128) {
                return 7;
            }
            if (i2 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i2);
        }
    }

    /* loaded from: classes.dex */
    private static final class n {
        static int a(int i2) {
            int i3;
            int i4 = 0;
            for (int i5 = 1; i5 <= 256; i5 <<= 1) {
                if ((i2 & i5) != 0) {
                    if (i5 == 1) {
                        i3 = WindowInsets.Type.statusBars();
                    } else if (i5 == 2) {
                        i3 = WindowInsets.Type.navigationBars();
                    } else if (i5 == 4) {
                        i3 = WindowInsets.Type.captionBar();
                    } else if (i5 == 8) {
                        i3 = WindowInsets.Type.ime();
                    } else if (i5 == 16) {
                        i3 = WindowInsets.Type.systemGestures();
                    } else if (i5 == 32) {
                        i3 = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i5 == 64) {
                        i3 = WindowInsets.Type.tappableElement();
                    } else if (i5 == 128) {
                        i3 = WindowInsets.Type.displayCutout();
                    }
                    i4 |= i3;
                }
            }
            return i4;
        }
    }

    static {
        b = Build.VERSION.SDK_INT >= 30 ? k.r : l.b;
    }

    private c0(WindowInsets windowInsets) {
        l gVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            gVar = new k(this, windowInsets);
        } else if (i2 >= 29) {
            gVar = new j(this, windowInsets);
        } else if (i2 >= 28) {
            gVar = new i(this, windowInsets);
        } else if (i2 >= 21) {
            gVar = new h(this, windowInsets);
        } else if (i2 >= 20) {
            gVar = new g(this, windowInsets);
        } else {
            this.a = new l(this);
            return;
        }
        this.a = gVar;
    }

    public c0(c0 c0Var) {
        if (c0Var != null) {
            l lVar = c0Var.a;
            int i2 = Build.VERSION.SDK_INT;
            this.a = (i2 < 30 || !(lVar instanceof k)) ? (i2 < 29 || !(lVar instanceof j)) ? (i2 < 28 || !(lVar instanceof i)) ? (i2 < 21 || !(lVar instanceof h)) ? (i2 < 20 || !(lVar instanceof g)) ? new l(this) : new g(this, (g) lVar) : new h(this, (h) lVar) : new i(this, (i) lVar) : new j(this, (j) lVar) : new k(this, (k) lVar);
            lVar.e(this);
            return;
        }
        this.a = new l(this);
    }

    static e.d.j.b m(e.d.j.b bVar, int i2, int i3, int i4, int i5) {
        int max = Math.max(0, bVar.a - i2);
        int max2 = Math.max(0, bVar.b - i3);
        int max3 = Math.max(0, bVar.c - i4);
        int max4 = Math.max(0, bVar.f2065d - i5);
        return (max == i2 && max2 == i3 && max3 == i4 && max4 == i5) ? bVar : e.d.j.b.b(max, max2, max3, max4);
    }

    public static c0 u(WindowInsets windowInsets) {
        return v(windowInsets, null);
    }

    public static c0 v(WindowInsets windowInsets, View view) {
        e.d.o.d.d(windowInsets);
        c0 c0Var = new c0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            c0Var.r(u.r(view));
            c0Var.d(view.getRootView());
        }
        return c0Var;
    }

    @Deprecated
    public c0 a() {
        return this.a.a();
    }

    @Deprecated
    public c0 b() {
        return this.a.b();
    }

    @Deprecated
    public c0 c() {
        return this.a.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(View view) {
        this.a.d(view);
    }

    public e.d.p.d e() {
        return this.a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        return e.d.o.c.a(this.a, ((c0) obj).a);
    }

    public e.d.j.b f(int i2) {
        return this.a.g(i2);
    }

    @Deprecated
    public e.d.j.b g() {
        return this.a.i();
    }

    @Deprecated
    public int h() {
        return this.a.k().f2065d;
    }

    public int hashCode() {
        l lVar = this.a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    public int i() {
        return this.a.k().a;
    }

    @Deprecated
    public int j() {
        return this.a.k().c;
    }

    @Deprecated
    public int k() {
        return this.a.k().b;
    }

    public c0 l(int i2, int i3, int i4, int i5) {
        return this.a.m(i2, i3, i4, i5);
    }

    public boolean n() {
        return this.a.n();
    }

    @Deprecated
    public c0 o(int i2, int i3, int i4, int i5) {
        b bVar = new b(this);
        bVar.c(e.d.j.b.b(i2, i3, i4, i5));
        return bVar.a();
    }

    void p(e.d.j.b[] bVarArr) {
        this.a.p(bVarArr);
    }

    void q(e.d.j.b bVar) {
        this.a.q(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(c0 c0Var) {
        this.a.r(c0Var);
    }

    void s(e.d.j.b bVar) {
        this.a.s(bVar);
    }

    public WindowInsets t() {
        l lVar = this.a;
        if (lVar instanceof g) {
            return ((g) lVar).c;
        }
        return null;
    }
}

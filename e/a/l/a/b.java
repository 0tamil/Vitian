package e.a.l.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.SparseArray;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b extends Drawable implements Drawable.Callback {

    /* renamed from: e  reason: collision with root package name */
    private d f1948e;

    /* renamed from: f  reason: collision with root package name */
    private Rect f1949f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f1950g;

    /* renamed from: h  reason: collision with root package name */
    private Drawable f1951h;

    /* renamed from: j  reason: collision with root package name */
    private boolean f1953j;
    private boolean l;
    private Runnable m;
    private long n;
    private long o;
    private c p;

    /* renamed from: i  reason: collision with root package name */
    private int f1952i = 255;

    /* renamed from: k  reason: collision with root package name */
    private int f1954k = -1;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e.a.l.a.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0064b {
        public static boolean a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static void b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        public static Resources c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c implements Drawable.Callback {

        /* renamed from: e  reason: collision with root package name */
        private Drawable.Callback f1956e;

        c() {
        }

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f1956e;
            this.f1956e = null;
            return callback;
        }

        public c b(Drawable.Callback callback) {
            this.f1956e = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
            Drawable.Callback callback = this.f1956e;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j2);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f1956e;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class d extends Drawable.ConstantState {
        int A;
        int B;
        boolean C;
        ColorFilter D;
        boolean E;
        ColorStateList F;
        PorterDuff.Mode G;
        boolean H;
        boolean I;
        final b a;
        Resources b;
        int c;

        /* renamed from: d  reason: collision with root package name */
        int f1957d;

        /* renamed from: e  reason: collision with root package name */
        int f1958e;

        /* renamed from: f  reason: collision with root package name */
        SparseArray<Drawable.ConstantState> f1959f;

        /* renamed from: g  reason: collision with root package name */
        Drawable[] f1960g;

        /* renamed from: h  reason: collision with root package name */
        int f1961h;

        /* renamed from: i  reason: collision with root package name */
        boolean f1962i;

        /* renamed from: j  reason: collision with root package name */
        boolean f1963j;

        /* renamed from: k  reason: collision with root package name */
        Rect f1964k;
        boolean l;
        boolean m;
        int n;
        int o;
        int p;
        int q;
        boolean r;
        int s;
        boolean t;
        boolean u;
        boolean v;
        boolean w;
        boolean x;
        boolean y;
        int z;

        /* JADX INFO: Access modifiers changed from: package-private */
        public d(d dVar, b bVar, Resources resources) {
            this.f1962i = false;
            this.l = false;
            this.x = true;
            this.A = 0;
            this.B = 0;
            this.a = bVar;
            Rect rect = null;
            this.b = resources != null ? resources : dVar != null ? dVar.b : null;
            int f2 = b.f(resources, dVar != null ? dVar.c : 0);
            this.c = f2;
            if (dVar != null) {
                this.f1957d = dVar.f1957d;
                this.f1958e = dVar.f1958e;
                this.v = true;
                this.w = true;
                this.f1962i = dVar.f1962i;
                this.l = dVar.l;
                this.x = dVar.x;
                this.y = dVar.y;
                this.z = dVar.z;
                this.A = dVar.A;
                this.B = dVar.B;
                this.C = dVar.C;
                this.D = dVar.D;
                this.E = dVar.E;
                this.F = dVar.F;
                this.G = dVar.G;
                this.H = dVar.H;
                this.I = dVar.I;
                if (dVar.c == f2) {
                    if (dVar.f1963j) {
                        this.f1964k = dVar.f1964k != null ? new Rect(dVar.f1964k) : rect;
                        this.f1963j = true;
                    }
                    if (dVar.m) {
                        this.n = dVar.n;
                        this.o = dVar.o;
                        this.p = dVar.p;
                        this.q = dVar.q;
                        this.m = true;
                    }
                }
                if (dVar.r) {
                    this.s = dVar.s;
                    this.r = true;
                }
                if (dVar.t) {
                    this.u = dVar.u;
                    this.t = true;
                }
                Drawable[] drawableArr = dVar.f1960g;
                this.f1960g = new Drawable[drawableArr.length];
                this.f1961h = dVar.f1961h;
                SparseArray<Drawable.ConstantState> sparseArray = dVar.f1959f;
                this.f1959f = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.f1961h);
                int i2 = this.f1961h;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3] != null) {
                        Drawable.ConstantState constantState = drawableArr[i3].getConstantState();
                        if (constantState != null) {
                            this.f1959f.put(i3, constantState);
                        } else {
                            this.f1960g[i3] = drawableArr[i3];
                        }
                    }
                }
                return;
            }
            this.f1960g = new Drawable[10];
            this.f1961h = 0;
        }

        private void e() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f1959f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.f1960g[this.f1959f.keyAt(i2)] = s(this.f1959f.valueAt(i2).newDrawable(this.b));
                }
                this.f1959f = null;
            }
        }

        private Drawable s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                androidx.core.graphics.drawable.a.l(drawable, this.z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.a);
            return mutate;
        }

        public final int a(Drawable drawable) {
            int i2 = this.f1961h;
            if (i2 >= this.f1960g.length) {
                o(i2, i2 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.a);
            this.f1960g[i2] = drawable;
            this.f1961h++;
            this.f1958e = drawable.getChangingConfigurations() | this.f1958e;
            p();
            this.f1964k = null;
            this.f1963j = false;
            this.m = false;
            this.v = false;
            return i2;
        }

        final void b(Resources.Theme theme) {
            if (theme != null) {
                e();
                int i2 = this.f1961h;
                Drawable[] drawableArr = this.f1960g;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3] != null && androidx.core.graphics.drawable.a.b(drawableArr[i3])) {
                        androidx.core.graphics.drawable.a.a(drawableArr[i3], theme);
                        this.f1958e |= drawableArr[i3].getChangingConfigurations();
                    }
                }
                y(C0064b.c(theme));
            }
        }

        public boolean c() {
            if (this.v) {
                return this.w;
            }
            e();
            this.v = true;
            int i2 = this.f1961h;
            Drawable[] drawableArr = this.f1960g;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3].getConstantState() == null) {
                    this.w = false;
                    return false;
                }
            }
            this.w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i2 = this.f1961h;
            Drawable[] drawableArr = this.f1960g;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f1959f.get(i3);
                    if (constantState != null && C0064b.a(constantState)) {
                        return true;
                    }
                } else if (androidx.core.graphics.drawable.a.b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        protected void d() {
            this.m = true;
            e();
            int i2 = this.f1961h;
            Drawable[] drawableArr = this.f1960g;
            this.o = -1;
            this.n = -1;
            this.q = 0;
            this.p = 0;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.n) {
                    this.n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.o) {
                    this.o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.p) {
                    this.p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.q) {
                    this.q = minimumHeight;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final int f() {
            return this.f1960g.length;
        }

        public final Drawable g(int i2) {
            int indexOfKey;
            Drawable drawable = this.f1960g[i2];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f1959f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i2)) < 0) {
                return null;
            }
            Drawable s = s(this.f1959f.valueAt(indexOfKey).newDrawable(this.b));
            this.f1960g[i2] = s;
            this.f1959f.removeAt(indexOfKey);
            if (this.f1959f.size() == 0) {
                this.f1959f = null;
            }
            return s;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f1957d | this.f1958e;
        }

        public final int h() {
            return this.f1961h;
        }

        public final int i() {
            if (!this.m) {
                d();
            }
            return this.o;
        }

        public final int j() {
            if (!this.m) {
                d();
            }
            return this.q;
        }

        public final int k() {
            if (!this.m) {
                d();
            }
            return this.p;
        }

        public final Rect l() {
            Rect rect = null;
            if (this.f1962i) {
                return null;
            }
            Rect rect2 = this.f1964k;
            if (rect2 != null || this.f1963j) {
                return rect2;
            }
            e();
            Rect rect3 = new Rect();
            int i2 = this.f1961h;
            Drawable[] drawableArr = this.f1960g;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i4 = rect3.left;
                    if (i4 > rect.left) {
                        rect.left = i4;
                    }
                    int i5 = rect3.top;
                    if (i5 > rect.top) {
                        rect.top = i5;
                    }
                    int i6 = rect3.right;
                    if (i6 > rect.right) {
                        rect.right = i6;
                    }
                    int i7 = rect3.bottom;
                    if (i7 > rect.bottom) {
                        rect.bottom = i7;
                    }
                }
            }
            this.f1963j = true;
            this.f1964k = rect;
            return rect;
        }

        public final int m() {
            if (!this.m) {
                d();
            }
            return this.n;
        }

        public final int n() {
            if (this.r) {
                return this.s;
            }
            e();
            int i2 = this.f1961h;
            Drawable[] drawableArr = this.f1960g;
            int opacity = i2 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i3 = 1; i3 < i2; i3++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i3].getOpacity());
            }
            this.s = opacity;
            this.r = true;
            return opacity;
        }

        public void o(int i2, int i3) {
            Drawable[] drawableArr = new Drawable[i3];
            Drawable[] drawableArr2 = this.f1960g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i2);
            }
            this.f1960g = drawableArr;
        }

        void p() {
            this.r = false;
            this.t = false;
        }

        public final boolean q() {
            return this.l;
        }

        abstract void r();

        public final void t(boolean z) {
            this.l = z;
        }

        public final void u(int i2) {
            this.A = i2;
        }

        public final void v(int i2) {
            this.B = i2;
        }

        final boolean w(int i2, int i3) {
            int i4 = this.f1961h;
            Drawable[] drawableArr = this.f1960g;
            boolean z = false;
            for (int i5 = 0; i5 < i4; i5++) {
                if (drawableArr[i5] != null) {
                    boolean l = Build.VERSION.SDK_INT >= 23 ? androidx.core.graphics.drawable.a.l(drawableArr[i5], i2) : false;
                    if (i5 == i3) {
                        z = l;
                    }
                }
            }
            this.z = i2;
            return z;
        }

        public final void x(boolean z) {
            this.f1962i = z;
        }

        final void y(Resources resources) {
            if (resources != null) {
                this.b = resources;
                int f2 = b.f(resources, this.c);
                int i2 = this.c;
                this.c = f2;
                if (i2 != f2) {
                    this.m = false;
                    this.f1963j = false;
                }
            }
        }
    }

    private void d(Drawable drawable) {
        if (this.p == null) {
            this.p = new c();
        }
        c cVar = this.p;
        cVar.b(drawable.getCallback());
        drawable.setCallback(cVar);
        try {
            if (this.f1948e.A <= 0 && this.f1953j) {
                drawable.setAlpha(this.f1952i);
            }
            d dVar = this.f1948e;
            if (dVar.E) {
                drawable.setColorFilter(dVar.D);
            } else {
                if (dVar.H) {
                    androidx.core.graphics.drawable.a.n(drawable, dVar.F);
                }
                d dVar2 = this.f1948e;
                if (dVar2.I) {
                    androidx.core.graphics.drawable.a.o(drawable, dVar2.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f1948e.x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 23) {
                androidx.core.graphics.drawable.a.l(drawable, androidx.core.graphics.drawable.a.e(this));
            }
            if (i2 >= 19) {
                androidx.core.graphics.drawable.a.i(drawable, this.f1948e.C);
            }
            Rect rect = this.f1949f;
            if (i2 >= 21 && rect != null) {
                androidx.core.graphics.drawable.a.k(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.p.a());
        }
    }

    private boolean e() {
        return isAutoMirrored() && androidx.core.graphics.drawable.a.e(this) == 1;
    }

    static int f(Resources resources, int i2) {
        if (resources != null) {
            i2 = resources.getDisplayMetrics().densityDpi;
        }
        if (i2 == 0) {
            return 160;
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void a(boolean z) {
        boolean z2;
        Drawable drawable;
        boolean z3 = true;
        this.f1953j = true;
        long uptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.f1950g;
        if (drawable2 != null) {
            long j2 = this.n;
            if (j2 != 0) {
                if (j2 <= uptimeMillis) {
                    drawable2.setAlpha(this.f1952i);
                } else {
                    drawable2.setAlpha(((255 - (((int) ((j2 - uptimeMillis) * 255)) / this.f1948e.A)) * this.f1952i) / 255);
                    z2 = true;
                    drawable = this.f1951h;
                    if (drawable != null) {
                        long j3 = this.o;
                        if (j3 != 0) {
                            if (j3 <= uptimeMillis) {
                                drawable.setVisible(false, false);
                                this.f1951h = null;
                            } else {
                                drawable.setAlpha(((((int) ((j3 - uptimeMillis) * 255)) / this.f1948e.B) * this.f1952i) / 255);
                                if (!z && z3) {
                                    scheduleSelf(this.m, uptimeMillis + 16);
                                    return;
                                }
                                return;
                            }
                        }
                        z3 = z2;
                        if (!z) {
                            return;
                        }
                        return;
                    }
                    this.o = 0L;
                    z3 = z2;
                    if (!z) {
                    }
                }
            }
            z2 = false;
            drawable = this.f1951h;
            if (drawable != null) {
            }
            this.o = 0L;
            z3 = z2;
            if (!z) {
            }
        }
        this.n = 0L;
        z2 = false;
        drawable = this.f1951h;
        if (drawable != null) {
        }
        this.o = 0L;
        z3 = z2;
        if (!z) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f1948e.b(theme);
    }

    d b() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.f1954k;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f1948e.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f1950g;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f1951h;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean g(int i2) {
        Runnable runnable;
        if (i2 == this.f1954k) {
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f1948e.B > 0) {
            Drawable drawable = this.f1951h;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.f1950g;
            if (drawable2 != null) {
                this.f1951h = drawable2;
                this.o = this.f1948e.B + uptimeMillis;
            } else {
                this.f1951h = null;
                this.o = 0L;
            }
        } else {
            Drawable drawable3 = this.f1950g;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i2 >= 0) {
            d dVar = this.f1948e;
            if (i2 < dVar.f1961h) {
                Drawable g2 = dVar.g(i2);
                this.f1950g = g2;
                this.f1954k = i2;
                if (g2 != null) {
                    int i3 = this.f1948e.A;
                    if (i3 > 0) {
                        this.n = uptimeMillis + i3;
                    }
                    d(g2);
                }
                if (this.n == 0 || this.o != 0) {
                    runnable = this.m;
                    if (runnable != null) {
                        this.m = new a();
                    } else {
                        unscheduleSelf(runnable);
                    }
                    a(true);
                }
                invalidateSelf();
                return true;
            }
        }
        this.f1950g = null;
        this.f1954k = -1;
        if (this.n == 0) {
        }
        runnable = this.m;
        if (runnable != null) {
        }
        a(true);
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f1952i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f1948e.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f1948e.c()) {
            return null;
        }
        this.f1948e.f1957d = getChangingConfigurations();
        return this.f1948e;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f1950g;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f1949f;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f1948e.q()) {
            return this.f1948e.i();
        }
        Drawable drawable = this.f1950g;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f1948e.q()) {
            return this.f1948e.m();
        }
        Drawable drawable = this.f1950g;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f1948e.q()) {
            return this.f1948e.j();
        }
        Drawable drawable = this.f1950g;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f1948e.q()) {
            return this.f1948e.k();
        }
        Drawable drawable = this.f1950g;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f1950g;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f1948e.n();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f1950g;
        if (drawable != null) {
            C0064b.b(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean z;
        Rect l = this.f1948e.l();
        if (l != null) {
            rect.set(l);
            z = (l.right | ((l.left | l.top) | l.bottom)) != 0;
        } else {
            Drawable drawable = this.f1950g;
            z = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (e()) {
            int i2 = rect.left;
            rect.left = rect.right;
            rect.right = i2;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(d dVar) {
        this.f1948e = dVar;
        int i2 = this.f1954k;
        if (i2 >= 0) {
            Drawable g2 = dVar.g(i2);
            this.f1950g = g2;
            if (g2 != null) {
                d(g2);
            }
        }
        this.f1951h = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(Resources resources) {
        this.f1948e.y(resources);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        d dVar = this.f1948e;
        if (dVar != null) {
            dVar.p();
        }
        if (drawable == this.f1950g && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f1948e.C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f1951h;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f1951h = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f1950g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f1953j) {
                this.f1950g.setAlpha(this.f1952i);
            }
        }
        if (this.o != 0) {
            this.o = 0L;
            z = true;
        }
        if (this.n != 0) {
            this.n = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.l && super.mutate() == this) {
            d b = b();
            b.r();
            h(b);
            this.l = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1951h;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f1950g;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i2) {
        return this.f1948e.w(i2, c());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i2) {
        Drawable drawable = this.f1951h;
        if (drawable != null) {
            return drawable.setLevel(i2);
        }
        Drawable drawable2 = this.f1950g;
        if (drawable2 != null) {
            return drawable2.setLevel(i2);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f1951h;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f1950g;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        if (drawable == this.f1950g && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        if (!this.f1953j || this.f1952i != i2) {
            this.f1953j = true;
            this.f1952i = i2;
            Drawable drawable = this.f1950g;
            if (drawable == null) {
                return;
            }
            if (this.n == 0) {
                drawable.setAlpha(i2);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        d dVar = this.f1948e;
        if (dVar.C != z) {
            dVar.C = z;
            Drawable drawable = this.f1950g;
            if (drawable != null) {
                androidx.core.graphics.drawable.a.i(drawable, z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        d dVar = this.f1948e;
        dVar.E = true;
        if (dVar.D != colorFilter) {
            dVar.D = colorFilter;
            Drawable drawable = this.f1950g;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        d dVar = this.f1948e;
        if (dVar.x != z) {
            dVar.x = z;
            Drawable drawable = this.f1950g;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f2, float f3) {
        Drawable drawable = this.f1950g;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, f2, f3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        Rect rect = this.f1949f;
        if (rect == null) {
            this.f1949f = new Rect(i2, i3, i4, i5);
        } else {
            rect.set(i2, i3, i4, i5);
        }
        Drawable drawable = this.f1950g;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.k(drawable, i2, i3, i4, i5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        d dVar = this.f1948e;
        dVar.H = true;
        if (dVar.F != colorStateList) {
            dVar.F = colorStateList;
            androidx.core.graphics.drawable.a.n(this.f1950g, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        d dVar = this.f1948e;
        dVar.I = true;
        if (dVar.G != mode) {
            dVar.G = mode;
            androidx.core.graphics.drawable.a.o(this.f1950g, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f1951h;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f1950g;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f1950g && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}

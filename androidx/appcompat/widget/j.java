package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.n0;
import e.a.c;
import e.a.d;
import e.a.e;
/* loaded from: classes.dex */
public final class j {
    private static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    private static j c;
    private n0 a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements n0.f {
        private final int[] a = {e.R, e.P, e.a};
        private final int[] b = {e.o, e.B, e.t, e.p, e.q, e.s, e.r};
        private final int[] c = {e.O, e.Q, e.f1931k, e.K, e.L, e.M, e.N};

        /* renamed from: d  reason: collision with root package name */
        private final int[] f415d = {e.w, e.f1929i, e.v};

        /* renamed from: e  reason: collision with root package name */
        private final int[] f416e = {e.J, e.S};

        /* renamed from: f  reason: collision with root package name */
        private final int[] f417f = {e.c_res_0x7f070003, e.f1927g, e.d_res_0x7f070004, e.f1928h};

        a() {
        }

        private boolean f(int[] iArr, int i2) {
            for (int i3 : iArr) {
                if (i3 == i2) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i2) {
            int c = s0.c(context, e.a.a.v);
            return new ColorStateList(new int[][]{s0.b, s0.f482d, s0.c, s0.f484f}, new int[]{s0.b(context, e.a.a.t), e.d.j.a.b(c, i2), e.d.j.a.b(c, i2), i2});
        }

        private ColorStateList i(Context context) {
            return h(context, s0.c(context, e.a.a.s));
        }

        private ColorStateList j(Context context) {
            return h(context, s0.c(context, e.a.a.t));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            int i2 = e.a.a.x;
            ColorStateList e2 = s0.e(context, i2);
            if (e2 == null || !e2.isStateful()) {
                iArr[0] = s0.b;
                iArr2[0] = s0.b(context, i2);
                iArr[1] = s0.f483e;
                iArr2[1] = s0.c(context, e.a.a.u);
                iArr[2] = s0.f484f;
                iArr2[2] = s0.c(context, i2);
            } else {
                iArr[0] = s0.b;
                iArr2[0] = e2.getColorForState(iArr[0], 0);
                iArr[1] = s0.f483e;
                iArr2[1] = s0.c(context, e.a.a.u);
                iArr[2] = s0.f484f;
                iArr2[2] = e2.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable l(n0 n0Var, Context context, int i2) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i2);
            Drawable j2 = n0Var.j(context, e.F);
            Drawable j3 = n0Var.j(context, e.G);
            if ((j2 instanceof BitmapDrawable) && j2.getIntrinsicWidth() == dimensionPixelSize && j2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable2 = (BitmapDrawable) j2;
                bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                j2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j2.draw(canvas);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
            if ((j3 instanceof BitmapDrawable) && j3.getIntrinsicWidth() == dimensionPixelSize && j3.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) j3;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                j3.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j3.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        private void m(Drawable drawable, int i2, PorterDuff.Mode mode) {
            if (f0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = j.b;
            }
            drawable.setColorFilter(j.e(i2, mode));
        }

        @Override // androidx.appcompat.widget.n0.f
        public Drawable a(n0 n0Var, Context context, int i2) {
            int i3;
            if (i2 == e.f1930j) {
                return new LayerDrawable(new Drawable[]{n0Var.j(context, e.f1929i), n0Var.j(context, e.f1931k)});
            }
            if (i2 == e.y) {
                i3 = d.i_res_0x7f06003b;
            } else if (i2 == e.x) {
                i3 = d.j_res_0x7f06003c;
            } else if (i2 != e.z) {
                return null;
            } else {
                i3 = d.f1925k;
            }
            return l(n0Var, context, i3);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[RETURN] */
        @Override // androidx.appcompat.widget.n0.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean b(Context context, int i2, Drawable drawable) {
            int i3;
            boolean z;
            PorterDuff.Mode mode = j.b;
            int i4 = 16842801;
            if (f(this.a, i2)) {
                i4 = e.a.a.w;
            } else if (f(this.c, i2)) {
                i4 = e.a.a.u;
            } else if (f(this.f415d, i2)) {
                mode = PorterDuff.Mode.MULTIPLY;
            } else if (i2 == e.u) {
                i4 = 16842800;
                i3 = Math.round(40.8f);
                z = true;
                if (!z) {
                    return false;
                }
                if (f0.a(drawable)) {
                    drawable = drawable.mutate();
                }
                drawable.setColorFilter(j.e(s0.c(context, i4), mode));
                if (i3 != -1) {
                    drawable.setAlpha(i3);
                }
                return true;
            } else if (i2 != e.l) {
                i3 = -1;
                z = false;
                i4 = 0;
                if (!z) {
                }
            }
            i3 = -1;
            z = true;
            if (!z) {
            }
        }

        @Override // androidx.appcompat.widget.n0.f
        public ColorStateList c(Context context, int i2) {
            if (i2 == e.m) {
                return e.a.k.a.a.c(context, c.f1921e);
            }
            if (i2 == e.I) {
                return e.a.k.a.a.c(context, c.f1924h);
            }
            if (i2 == e.H) {
                return k(context);
            }
            if (i2 == e.f1926f) {
                return j(context);
            }
            if (i2 == e.b_res_0x7f070002) {
                return g(context);
            }
            if (i2 == e.e_res_0x7f070007) {
                return i(context);
            }
            if (i2 == e.D || i2 == e.E) {
                return e.a.k.a.a.c(context, c.f1923g);
            }
            if (f(this.b, i2)) {
                return s0.e(context, e.a.a.w);
            }
            if (f(this.f416e, i2)) {
                return e.a.k.a.a.c(context, c.f1920d);
            }
            if (f(this.f417f, i2)) {
                return e.a.k.a.a.c(context, c.c);
            }
            if (i2 == e.A) {
                return e.a.k.a.a.c(context, c.f1922f);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.n0.f
        public boolean d(Context context, int i2, Drawable drawable) {
            Drawable findDrawableByLayerId;
            int c;
            if (i2 == e.C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(16908288);
                int i3 = e.a.a.w;
                m(findDrawableByLayerId2, s0.c(context, i3), j.b);
                m(layerDrawable.findDrawableByLayerId(16908303), s0.c(context, i3), j.b);
                findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908301);
                c = s0.c(context, e.a.a.u);
            } else if (i2 != e.y && i2 != e.x && i2 != e.z) {
                return false;
            } else {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m(layerDrawable2.findDrawableByLayerId(16908288), s0.b(context, e.a.a.w), j.b);
                Drawable findDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(16908303);
                int i4 = e.a.a.u;
                m(findDrawableByLayerId3, s0.c(context, i4), j.b);
                findDrawableByLayerId = layerDrawable2.findDrawableByLayerId(16908301);
                c = s0.c(context, i4);
            }
            m(findDrawableByLayerId, c, j.b);
            return true;
        }

        @Override // androidx.appcompat.widget.n0.f
        public PorterDuff.Mode e(int i2) {
            if (i2 == e.H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }
    }

    public static synchronized j b() {
        j jVar;
        synchronized (j.class) {
            if (c == null) {
                h();
            }
            jVar = c;
        }
        return jVar;
    }

    public static synchronized PorterDuffColorFilter e(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter l;
        synchronized (j.class) {
            l = n0.l(i2, mode);
        }
        return l;
    }

    public static synchronized void h() {
        synchronized (j.class) {
            if (c == null) {
                j jVar = new j();
                c = jVar;
                jVar.a = n0.h();
                c.a.u(new a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(Drawable drawable, v0 v0Var, int[] iArr) {
        n0.w(drawable, v0Var, iArr);
    }

    public synchronized Drawable c(Context context, int i2) {
        return this.a.j(context, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized Drawable d(Context context, int i2, boolean z) {
        return this.a.k(context, i2, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized ColorStateList f(Context context, int i2) {
        return this.a.m(context, i2);
    }

    public synchronized void g(Context context) {
        this.a.s(context);
    }
}

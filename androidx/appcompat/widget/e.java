package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import e.a.j;
import e.d.p.u;
/* loaded from: classes.dex */
class e {
    private final View a;

    /* renamed from: d  reason: collision with root package name */
    private v0 f384d;

    /* renamed from: e  reason: collision with root package name */
    private v0 f385e;

    /* renamed from: f  reason: collision with root package name */
    private v0 f386f;
    private int c = -1;
    private final j b = j.b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(View view) {
        this.a = view;
    }

    private boolean a(Drawable drawable) {
        if (this.f386f == null) {
            this.f386f = new v0();
        }
        v0 v0Var = this.f386f;
        v0Var.a();
        ColorStateList k2 = u.k(this.a);
        if (k2 != null) {
            v0Var.f489d = true;
            v0Var.a = k2;
        }
        PorterDuff.Mode l = u.l(this.a);
        if (l != null) {
            v0Var.c = true;
            v0Var.b = l;
        }
        if (!v0Var.f489d && !v0Var.c) {
            return false;
        }
        j.i(drawable, v0Var, this.a.getDrawableState());
        return true;
    }

    private boolean k() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 > 21 ? this.f384d != null : i2 == 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        Drawable background = this.a.getBackground();
        if (background == null) {
            return;
        }
        if (!k() || !a(background)) {
            v0 v0Var = this.f385e;
            if (v0Var != null) {
                j.i(background, v0Var, this.a.getDrawableState());
                return;
            }
            v0 v0Var2 = this.f384d;
            if (v0Var2 != null) {
                j.i(background, v0Var2, this.a.getDrawableState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList c() {
        v0 v0Var = this.f385e;
        if (v0Var != null) {
            return v0Var.a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        v0 v0Var = this.f385e;
        if (v0Var != null) {
            return v0Var.b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(AttributeSet attributeSet, int i2) {
        Context context = this.a.getContext();
        int[] iArr = j.l3;
        x0 u = x0.u(context, attributeSet, iArr, i2, 0);
        View view = this.a;
        u.I(view, view.getContext(), iArr, attributeSet, u.q(), i2, 0);
        try {
            int i3 = j.m3;
            if (u.r(i3)) {
                this.c = u.m(i3, -1);
                ColorStateList f2 = this.b.f(this.a.getContext(), this.c);
                if (f2 != null) {
                    h(f2);
                }
            }
            int i4 = j.n3;
            if (u.r(i4)) {
                u.M(this.a, u.c(i4));
            }
            int i5 = j.o3;
            if (u.r(i5)) {
                u.N(this.a, f0.d(u.j(i5, -1), null));
            }
        } finally {
            u.v();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(Drawable drawable) {
        this.c = -1;
        h(null);
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(int i2) {
        this.c = i2;
        j jVar = this.b;
        h(jVar != null ? jVar.f(this.a.getContext(), i2) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f384d == null) {
                this.f384d = new v0();
            }
            v0 v0Var = this.f384d;
            v0Var.a = colorStateList;
            v0Var.f489d = true;
        } else {
            this.f384d = null;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(ColorStateList colorStateList) {
        if (this.f385e == null) {
            this.f385e = new v0();
        }
        v0 v0Var = this.f385e;
        v0Var.a = colorStateList;
        v0Var.f489d = true;
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(PorterDuff.Mode mode) {
        if (this.f385e == null) {
            this.f385e = new v0();
        }
        v0 v0Var = this.f385e;
        v0Var.b = mode;
        v0Var.c = true;
        b();
    }
}

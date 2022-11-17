package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.widget.e;
import e.a.j;
import e.a.k.a.a;
import e.d.p.u;
/* loaded from: classes.dex */
public class n {
    private final ImageView a;
    private v0 b;
    private v0 c;

    /* renamed from: d  reason: collision with root package name */
    private v0 f442d;

    public n(ImageView imageView) {
        this.a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f442d == null) {
            this.f442d = new v0();
        }
        v0 v0Var = this.f442d;
        v0Var.a();
        ColorStateList a = e.a(this.a);
        if (a != null) {
            v0Var.f489d = true;
            v0Var.a = a;
        }
        PorterDuff.Mode b = e.b(this.a);
        if (b != null) {
            v0Var.c = true;
            v0Var.b = b;
        }
        if (!v0Var.f489d && !v0Var.c) {
            return false;
        }
        j.i(drawable, v0Var, this.a.getDrawableState());
        return true;
    }

    private boolean j() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 > 21 ? this.b != null : i2 == 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            f0.b(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (!j() || !a(drawable)) {
            v0 v0Var = this.c;
            if (v0Var != null) {
                j.i(drawable, v0Var, this.a.getDrawableState());
                return;
            }
            v0 v0Var2 = this.b;
            if (v0Var2 != null) {
                j.i(drawable, v0Var2, this.a.getDrawableState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList c() {
        v0 v0Var = this.c;
        if (v0Var != null) {
            return v0Var.a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        v0 v0Var = this.c;
        if (v0Var != null) {
            return v0Var.b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        return Build.VERSION.SDK_INT < 21 || !(this.a.getBackground() instanceof RippleDrawable);
    }

    public void f(AttributeSet attributeSet, int i2) {
        int m;
        Context context = this.a.getContext();
        int[] iArr = j.M;
        x0 u = x0.u(context, attributeSet, iArr, i2, 0);
        ImageView imageView = this.a;
        u.I(imageView, imageView.getContext(), iArr, attributeSet, u.q(), i2, 0);
        try {
            Drawable drawable = this.a.getDrawable();
            if (!(drawable != null || (m = u.m(j.N, -1)) == -1 || (drawable = a.d(this.a.getContext(), m)) == null)) {
                this.a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                f0.b(drawable);
            }
            int i3 = j.O;
            if (u.r(i3)) {
                e.c(this.a, u.c(i3));
            }
            int i4 = j.P;
            if (u.r(i4)) {
                e.d(this.a, f0.d(u.j(i4, -1), null));
            }
        } finally {
            u.v();
        }
    }

    public void g(int i2) {
        if (i2 != 0) {
            Drawable d2 = a.d(this.a.getContext(), i2);
            if (d2 != null) {
                f0.b(d2);
            }
            this.a.setImageDrawable(d2);
        } else {
            this.a.setImageDrawable(null);
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(ColorStateList colorStateList) {
        if (this.c == null) {
            this.c = new v0();
        }
        v0 v0Var = this.c;
        v0Var.a = colorStateList;
        v0Var.f489d = true;
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(PorterDuff.Mode mode) {
        if (this.c == null) {
            this.c = new v0();
        }
        v0 v0Var = this.c;
        v0Var.b = mode;
        v0Var.c = true;
        b();
    }
}

package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.a;
import e.a.j;
import e.d.p.u;
/* loaded from: classes.dex */
class w extends r {

    /* renamed from: d  reason: collision with root package name */
    private final SeekBar f490d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f491e;

    /* renamed from: f  reason: collision with root package name */
    private ColorStateList f492f = null;

    /* renamed from: g  reason: collision with root package name */
    private PorterDuff.Mode f493g = null;

    /* renamed from: h  reason: collision with root package name */
    private boolean f494h = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f495i = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(SeekBar seekBar) {
        super(seekBar);
        this.f490d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f491e;
        if (drawable == null) {
            return;
        }
        if (this.f494h || this.f495i) {
            Drawable p = a.p(drawable.mutate());
            this.f491e = p;
            if (this.f494h) {
                a.n(p, this.f492f);
            }
            if (this.f495i) {
                a.o(this.f491e, this.f493g);
            }
            if (this.f491e.isStateful()) {
                this.f491e.setState(this.f490d.getDrawableState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.widget.r
    public void c(AttributeSet attributeSet, int i2) {
        super.c(attributeSet, i2);
        Context context = this.f490d.getContext();
        int[] iArr = j.Q;
        x0 u = x0.u(context, attributeSet, iArr, i2, 0);
        SeekBar seekBar = this.f490d;
        u.I(seekBar, seekBar.getContext(), iArr, attributeSet, u.q(), i2, 0);
        Drawable g2 = u.g(j.R);
        if (g2 != null) {
            this.f490d.setThumb(g2);
        }
        j(u.f(j.S));
        int i3 = j.U;
        if (u.r(i3)) {
            this.f493g = f0.d(u.j(i3, -1), this.f493g);
            this.f495i = true;
        }
        int i4 = j.T;
        if (u.r(i4)) {
            this.f492f = u.c(i4);
            this.f494h = true;
        }
        u.v();
        f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(Canvas canvas) {
        if (this.f491e != null) {
            int max = this.f490d.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f491e.getIntrinsicWidth();
                int intrinsicHeight = this.f491e.getIntrinsicHeight();
                int i3 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight / 2;
                }
                this.f491e.setBounds(-i3, -i2, i3, i2);
                float width = ((this.f490d.getWidth() - this.f490d.getPaddingLeft()) - this.f490d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f490d.getPaddingLeft(), this.f490d.getHeight() / 2);
                for (int i4 = 0; i4 <= max; i4++) {
                    this.f491e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        Drawable drawable = this.f491e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f490d.getDrawableState())) {
            this.f490d.invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        Drawable drawable = this.f491e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) {
        Drawable drawable2 = this.f491e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f491e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f490d);
            a.l(drawable, u.o(this.f490d));
            if (drawable.isStateful()) {
                drawable.setState(this.f490d.getDrawableState());
            }
            f();
        }
        this.f490d.invalidate();
    }
}

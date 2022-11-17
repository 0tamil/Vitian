package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import e.d.p.t;
/* loaded from: classes.dex */
public class c0 extends ToggleButton implements t {

    /* renamed from: e  reason: collision with root package name */
    private final e f379e;

    /* renamed from: f  reason: collision with root package name */
    private final z f380f;

    public c0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842827);
    }

    public c0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        s0.a(this, getContext());
        e eVar = new e(this);
        this.f379e = eVar;
        eVar.e(attributeSet, i2);
        z zVar = new z(this);
        this.f380f = zVar;
        zVar.m(attributeSet, i2);
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f379e;
        if (eVar != null) {
            eVar.b();
        }
        z zVar = this.f380f;
        if (zVar != null) {
            zVar.b();
        }
    }

    @Override // e.d.p.t
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f379e;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // e.d.p.t
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f379e;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f379e;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f379e;
        if (eVar != null) {
            eVar.g(i2);
        }
    }

    @Override // e.d.p.t
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f379e;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // e.d.p.t
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f379e;
        if (eVar != null) {
            eVar.j(mode);
        }
    }
}

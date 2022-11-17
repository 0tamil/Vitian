package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.widget.b;
import androidx.core.widget.i;
import androidx.core.widget.l;
import e.a.a;
import e.d.p.t;
/* loaded from: classes.dex */
public class f extends Button implements t, b, l {

    /* renamed from: e  reason: collision with root package name */
    private final e f387e;

    /* renamed from: f  reason: collision with root package name */
    private final z f388f;

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.q);
    }

    public f(Context context, AttributeSet attributeSet, int i2) {
        super(u0.b(context), attributeSet, i2);
        s0.a(this, getContext());
        e eVar = new e(this);
        this.f387e = eVar;
        eVar.e(attributeSet, i2);
        z zVar = new z(this);
        this.f388f = zVar;
        zVar.m(attributeSet, i2);
        zVar.b();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f387e;
        if (eVar != null) {
            eVar.b();
        }
        z zVar = this.f388f;
        if (zVar != null) {
            zVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (b.a) {
            return super.getAutoSizeMaxTextSize();
        }
        z zVar = this.f388f;
        if (zVar != null) {
            return zVar.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (b.a) {
            return super.getAutoSizeMinTextSize();
        }
        z zVar = this.f388f;
        if (zVar != null) {
            return zVar.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (b.a) {
            return super.getAutoSizeStepGranularity();
        }
        z zVar = this.f388f;
        if (zVar != null) {
            return zVar.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (b.a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        z zVar = this.f388f;
        return zVar != null ? zVar.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (b.a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        z zVar = this.f388f;
        if (zVar != null) {
            return zVar.i();
        }
        return 0;
    }

    @Override // e.d.p.t
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f387e;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // e.d.p.t
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f387e;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f388f.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f388f.k();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        z zVar = this.f388f;
        if (zVar != null) {
            zVar.o(z, i2, i3, i4, i5);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        z zVar = this.f388f;
        if (zVar != null && !b.a && zVar.l()) {
            this.f388f.c();
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        if (b.a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        z zVar = this.f388f;
        if (zVar != null) {
            zVar.t(i2, i3, i4, i5);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (b.a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        z zVar = this.f388f;
        if (zVar != null) {
            zVar.u(iArr, i2);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (b.a) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        z zVar = this.f388f;
        if (zVar != null) {
            zVar.v(i2);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f387e;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f387e;
        if (eVar != null) {
            eVar.g(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.m(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        z zVar = this.f388f;
        if (zVar != null) {
            zVar.s(z);
        }
    }

    @Override // e.d.p.t
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f387e;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // e.d.p.t
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f387e;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // androidx.core.widget.l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f388f.w(colorStateList);
        this.f388f.b();
    }

    @Override // androidx.core.widget.l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f388f.x(mode);
        this.f388f.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        z zVar = this.f388f;
        if (zVar != null) {
            zVar.q(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i2, float f2) {
        if (b.a) {
            super.setTextSize(i2, f2);
            return;
        }
        z zVar = this.f388f;
        if (zVar != null) {
            zVar.A(i2, f2);
        }
    }
}

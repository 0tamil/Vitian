package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.widget.b;
import androidx.core.widget.i;
import androidx.core.widget.l;
import e.a.k.a.a;
import e.d.j.d;
import e.d.n.c;
import e.d.p.t;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* loaded from: classes.dex */
public class a0 extends TextView implements t, l, b {

    /* renamed from: e  reason: collision with root package name */
    private final e f349e;

    /* renamed from: f  reason: collision with root package name */
    private final z f350f;

    /* renamed from: g  reason: collision with root package name */
    private final y f351g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f352h;

    /* renamed from: i  reason: collision with root package name */
    private Future<c> f353i;

    public a0(Context context) {
        this(context, null);
    }

    public a0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public a0(Context context, AttributeSet attributeSet, int i2) {
        super(u0.b(context), attributeSet, i2);
        this.f352h = false;
        s0.a(this, getContext());
        e eVar = new e(this);
        this.f349e = eVar;
        eVar.e(attributeSet, i2);
        z zVar = new z(this);
        this.f350f = zVar;
        zVar.m(attributeSet, i2);
        zVar.b();
        this.f351g = new y(this);
    }

    private void e() {
        Future<c> future = this.f353i;
        if (future != null) {
            try {
                this.f353i = null;
                i.k(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f349e;
        if (eVar != null) {
            eVar.b();
        }
        z zVar = this.f350f;
        if (zVar != null) {
            zVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (b.a) {
            return super.getAutoSizeMaxTextSize();
        }
        z zVar = this.f350f;
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
        z zVar = this.f350f;
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
        z zVar = this.f350f;
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
        z zVar = this.f350f;
        return zVar != null ? zVar.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (b.a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        z zVar = this.f350f;
        if (zVar != null) {
            return zVar.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return i.a(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return i.b(this);
    }

    @Override // e.d.p.t
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f349e;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // e.d.p.t
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f349e;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f350f.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f350f.k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        e();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        y yVar;
        return (Build.VERSION.SDK_INT >= 28 || (yVar = this.f351g) == null) ? super.getTextClassifier() : yVar.a();
    }

    public c.a getTextMetricsParamsCompat() {
        return i.e(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f350f.r(this, onCreateInputConnection, editorInfo);
        l.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        z zVar = this.f350f;
        if (zVar != null) {
            zVar.o(z, i2, i3, i4, i5);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        e();
        super.onMeasure(i2, i3);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        z zVar = this.f350f;
        if (zVar != null && !b.a && zVar.l()) {
            this.f350f.c();
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        if (b.a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        z zVar = this.f350f;
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
        z zVar = this.f350f;
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
        z zVar = this.f350f;
        if (zVar != null) {
            zVar.v(i2);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f349e;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f349e;
        if (eVar != null) {
            eVar.g(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        z zVar = this.f350f;
        if (zVar != null) {
            zVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        z zVar = this.f350f;
        if (zVar != null) {
            zVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable d2 = i2 != 0 ? a.d(context, i2) : null;
        Drawable d3 = i3 != 0 ? a.d(context, i3) : null;
        Drawable d4 = i4 != 0 ? a.d(context, i4) : null;
        if (i5 != 0) {
            drawable = a.d(context, i5);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(d2, d3, d4, drawable);
        z zVar = this.f350f;
        if (zVar != null) {
            zVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        z zVar = this.f350f;
        if (zVar != null) {
            zVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable d2 = i2 != 0 ? a.d(context, i2) : null;
        Drawable d3 = i3 != 0 ? a.d(context, i3) : null;
        Drawable d4 = i4 != 0 ? a.d(context, i4) : null;
        if (i5 != 0) {
            drawable = a.d(context, i5);
        }
        setCompoundDrawablesWithIntrinsicBounds(d2, d3, d4, drawable);
        z zVar = this.f350f;
        if (zVar != null) {
            zVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        z zVar = this.f350f;
        if (zVar != null) {
            zVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.m(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i2);
        } else {
            i.h(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i2);
        } else {
            i.i(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i2) {
        i.j(this, i2);
    }

    public void setPrecomputedText(c cVar) {
        i.k(this, cVar);
    }

    @Override // e.d.p.t
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f349e;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // e.d.p.t
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f349e;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // androidx.core.widget.l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f350f.w(colorStateList);
        this.f350f.b();
    }

    @Override // androidx.core.widget.l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f350f.x(mode);
        this.f350f.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        z zVar = this.f350f;
        if (zVar != null) {
            zVar.q(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        y yVar;
        if (Build.VERSION.SDK_INT >= 28 || (yVar = this.f351g) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            yVar.b(textClassifier);
        }
    }

    public void setTextFuture(Future<c> future) {
        this.f353i = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(c.a aVar) {
        i.l(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i2, float f2) {
        if (b.a) {
            super.setTextSize(i2, f2);
            return;
        }
        z zVar = this.f350f;
        if (zVar != null) {
            zVar.A(i2, f2);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i2) {
        if (!this.f352h) {
            Typeface typeface2 = null;
            if (typeface != null && i2 > 0) {
                typeface2 = d.a(getContext(), typeface, i2);
            }
            this.f352h = true;
            if (typeface2 != null) {
                typeface = typeface2;
            }
            try {
                super.setTypeface(typeface, i2);
            } finally {
                this.f352h = false;
            }
        }
    }
}

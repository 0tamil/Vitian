package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import e.a.a;
import e.d.p.t;
/* loaded from: classes.dex */
public class p extends MultiAutoCompleteTextView implements t {

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f452g = {16843126};

    /* renamed from: e  reason: collision with root package name */
    private final e f453e;

    /* renamed from: f  reason: collision with root package name */
    private final z f454f;

    public p(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.p);
    }

    public p(Context context, AttributeSet attributeSet, int i2) {
        super(u0.b(context), attributeSet, i2);
        s0.a(this, getContext());
        x0 u = x0.u(getContext(), attributeSet, f452g, i2, 0);
        if (u.r(0)) {
            setDropDownBackgroundDrawable(u.f(0));
        }
        u.v();
        e eVar = new e(this);
        this.f453e = eVar;
        eVar.e(attributeSet, i2);
        z zVar = new z(this);
        this.f454f = zVar;
        zVar.m(attributeSet, i2);
        zVar.b();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f453e;
        if (eVar != null) {
            eVar.b();
        }
        z zVar = this.f454f;
        if (zVar != null) {
            zVar.b();
        }
    }

    @Override // e.d.p.t
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f453e;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // e.d.p.t
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f453e;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        l.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f453e;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f453e;
        if (eVar != null) {
            eVar.g(i2);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(e.a.k.a.a.d(getContext(), i2));
    }

    @Override // e.d.p.t
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f453e;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // e.d.p.t
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f453e;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        z zVar = this.f454f;
        if (zVar != null) {
            zVar.q(context, i2);
        }
    }
}

package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.widget.i;
import androidx.core.widget.j;
import e.a.a;
import e.d.p.c;
import e.d.p.f0.b;
import e.d.p.r;
import e.d.p.t;
import e.d.p.u;
/* loaded from: classes.dex */
public class k extends EditText implements t, r {

    /* renamed from: e  reason: collision with root package name */
    private final e f425e;

    /* renamed from: f  reason: collision with root package name */
    private final z f426f;

    /* renamed from: g  reason: collision with root package name */
    private final y f427g;

    /* renamed from: h  reason: collision with root package name */
    private final j f428h;

    public k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.A);
    }

    public k(Context context, AttributeSet attributeSet, int i2) {
        super(u0.b(context), attributeSet, i2);
        s0.a(this, getContext());
        e eVar = new e(this);
        this.f425e = eVar;
        eVar.e(attributeSet, i2);
        z zVar = new z(this);
        this.f426f = zVar;
        zVar.m(attributeSet, i2);
        zVar.b();
        this.f427g = new y(this);
        this.f428h = new j();
    }

    @Override // e.d.p.r
    public c a(c cVar) {
        return this.f428h.a(this, cVar);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f425e;
        if (eVar != null) {
            eVar.b();
        }
        z zVar = this.f426f;
        if (zVar != null) {
            zVar.b();
        }
    }

    @Override // e.d.p.t
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f425e;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // e.d.p.t
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f425e;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        y yVar;
        return (Build.VERSION.SDK_INT >= 28 || (yVar = this.f427g) == null) ? super.getTextClassifier() : yVar.a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f426f.r(this, onCreateInputConnection, editorInfo);
        l.a(onCreateInputConnection, editorInfo, this);
        String[] q = u.q(this);
        if (onCreateInputConnection == null || q == null) {
            return onCreateInputConnection;
        }
        e.d.p.f0.a.d(editorInfo, q);
        return b.a(onCreateInputConnection, editorInfo, u.a(this));
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (u.b(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.TextView
    public boolean onTextContextMenuItem(int i2) {
        if (u.c(this, i2)) {
            return true;
        }
        return super.onTextContextMenuItem(i2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f425e;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f425e;
        if (eVar != null) {
            eVar.g(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.m(this, callback));
    }

    @Override // e.d.p.t
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f425e;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // e.d.p.t
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f425e;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        z zVar = this.f426f;
        if (zVar != null) {
            zVar.q(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        y yVar;
        if (Build.VERSION.SDK_INT >= 28 || (yVar = this.f427g) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            yVar.b(textClassifier);
        }
    }
}

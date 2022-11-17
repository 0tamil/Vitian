package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import e.a.a;
import e.d.p.t;
/* loaded from: classes.dex */
public class m extends ImageButton implements t, androidx.core.widget.m {

    /* renamed from: e  reason: collision with root package name */
    private final e f440e;

    /* renamed from: f  reason: collision with root package name */
    private final n f441f;

    public m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.B);
    }

    public m(Context context, AttributeSet attributeSet, int i2) {
        super(u0.b(context), attributeSet, i2);
        s0.a(this, getContext());
        e eVar = new e(this);
        this.f440e = eVar;
        eVar.e(attributeSet, i2);
        n nVar = new n(this);
        this.f441f = nVar;
        nVar.f(attributeSet, i2);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f440e;
        if (eVar != null) {
            eVar.b();
        }
        n nVar = this.f441f;
        if (nVar != null) {
            nVar.b();
        }
    }

    @Override // e.d.p.t
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f440e;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // e.d.p.t
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f440e;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.m
    public ColorStateList getSupportImageTintList() {
        n nVar = this.f441f;
        if (nVar != null) {
            return nVar.c();
        }
        return null;
    }

    @Override // androidx.core.widget.m
    public PorterDuff.Mode getSupportImageTintMode() {
        n nVar = this.f441f;
        if (nVar != null) {
            return nVar.d();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f441f.e() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f440e;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f440e;
        if (eVar != null) {
            eVar.g(i2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        n nVar = this.f441f;
        if (nVar != null) {
            nVar.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        n nVar = this.f441f;
        if (nVar != null) {
            nVar.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        this.f441f.g(i2);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        n nVar = this.f441f;
        if (nVar != null) {
            nVar.b();
        }
    }

    @Override // e.d.p.t
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f440e;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // e.d.p.t
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f440e;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // androidx.core.widget.m
    public void setSupportImageTintList(ColorStateList colorStateList) {
        n nVar = this.f441f;
        if (nVar != null) {
            nVar.h(colorStateList);
        }
    }

    @Override // androidx.core.widget.m
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        n nVar = this.f441f;
        if (nVar != null) {
            nVar.i(mode);
        }
    }
}

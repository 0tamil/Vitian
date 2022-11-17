package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f extends Drawable.ConstantState {
    int a;
    Drawable.ConstantState b;
    ColorStateList c;

    /* renamed from: d  reason: collision with root package name */
    PorterDuff.Mode f644d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(f fVar) {
        this.c = null;
        this.f644d = d.f637k;
        if (fVar != null) {
            this.a = fVar.a;
            this.b = fVar.b;
            this.c = fVar.c;
            this.f644d = fVar.f644d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        return this.b != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i2 = this.a;
        Drawable.ConstantState constantState = this.b;
        return i2 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return Build.VERSION.SDK_INT >= 21 ? new e(this, resources) : new d(this, resources);
    }
}

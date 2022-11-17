package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.a;
import androidx.core.widget.c;
import e.a.j;
import e.d.p.u;
/* loaded from: classes.dex */
class i {
    private final CompoundButton a;
    private ColorStateList b = null;
    private PorterDuff.Mode c = null;

    /* renamed from: d  reason: collision with root package name */
    private boolean f403d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f404e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f405f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(CompoundButton compoundButton) {
        this.a = compoundButton;
    }

    void a() {
        Drawable a = c.a(this.a);
        if (a == null) {
            return;
        }
        if (this.f403d || this.f404e) {
            Drawable mutate = a.p(a).mutate();
            if (this.f403d) {
                a.n(mutate, this.b);
            }
            if (this.f404e) {
                a.o(mutate, this.c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.a.getDrawableState());
            }
            this.a.setButtonDrawable(mutate);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(int i2) {
        Drawable a;
        return (Build.VERSION.SDK_INT >= 17 || (a = c.a(this.a)) == null) ? i2 : i2 + a.getIntrinsicWidth();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList c() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode d() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003d A[Catch: all -> 0x0084, TRY_ENTER, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:30:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[Catch: all -> 0x0084, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:30:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[Catch: all -> 0x0084, TRY_LEAVE, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:30:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(AttributeSet attributeSet, int i2) {
        boolean z;
        int i3;
        int i4;
        int m;
        int m2;
        Context context = this.a.getContext();
        int[] iArr = j.L0;
        x0 u = x0.u(context, attributeSet, iArr, i2, 0);
        CompoundButton compoundButton = this.a;
        u.I(compoundButton, compoundButton.getContext(), iArr, attributeSet, u.q(), i2, 0);
        try {
            int i5 = j.N0;
            if (u.r(i5) && (m2 = u.m(i5, 0)) != 0) {
                try {
                    CompoundButton compoundButton2 = this.a;
                    compoundButton2.setButtonDrawable(e.a.k.a.a.d(compoundButton2.getContext(), m2));
                    z = true;
                } catch (Resources.NotFoundException unused) {
                }
                if (!z) {
                    int i6 = j.M0;
                    if (u.r(i6) && (m = u.m(i6, 0)) != 0) {
                        CompoundButton compoundButton3 = this.a;
                        compoundButton3.setButtonDrawable(e.a.k.a.a.d(compoundButton3.getContext(), m));
                    }
                }
                i3 = j.O0;
                if (u.r(i3)) {
                    c.b(this.a, u.c(i3));
                }
                i4 = j.P0;
                if (u.r(i4)) {
                    c.c(this.a, f0.d(u.j(i4, -1), null));
                }
            }
            z = false;
            if (!z) {
            }
            i3 = j.O0;
            if (u.r(i3)) {
            }
            i4 = j.P0;
            if (u.r(i4)) {
            }
        } finally {
            u.v();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        if (this.f405f) {
            this.f405f = false;
            return;
        }
        this.f405f = true;
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(ColorStateList colorStateList) {
        this.b = colorStateList;
        this.f403d = true;
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(PorterDuff.Mode mode) {
        this.c = mode;
        this.f404e = true;
        a();
    }
}

package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import e.d.p.c0;
import e.d.p.u;
import e.g.c;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class h extends FrameLayout {

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<View> f755e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<View> f756f;

    /* renamed from: g  reason: collision with root package name */
    private View.OnApplyWindowInsetsListener f757g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f758h = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(Context context, AttributeSet attributeSet, n nVar) {
        super(context, attributeSet);
        String str;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f2161e);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(c.f2162f) : classAttribute;
        String string = obtainStyledAttributes.getString(c.f2163g);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment g0 = nVar.g0(id);
        if (classAttribute != null && g0 == null) {
            if (id <= 0) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment a = nVar.p0().a(context.getClassLoader(), classAttribute);
            a.w0(context, attributeSet, null);
            w l = nVar.l();
            l.l(true);
            l.c(this, a, string);
            l.h();
        }
        nVar.R0(this);
    }

    private void a(View view) {
        ArrayList<View> arrayList = this.f756f;
        if (arrayList != null && arrayList.contains(view)) {
            if (this.f755e == null) {
                this.f755e = new ArrayList<>();
            }
            this.f755e.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (n.y0(view) != null) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z) {
        if (n.y0(view) != null) {
            return super.addViewInLayout(view, i2, layoutParams, z);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        c0 u = c0.u(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f757g;
        c0 u2 = onApplyWindowInsetsListener != null ? c0.u(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets)) : u.B(this, u);
        if (!u2.n()) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                u.d(getChildAt(i2), u2);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (this.f758h && this.f755e != null) {
            for (int i2 = 0; i2 < this.f755e.size(); i2++) {
                super.drawChild(canvas, this.f755e.get(i2), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j2) {
        ArrayList<View> arrayList;
        if (!this.f758h || (arrayList = this.f755e) == null || arrayList.size() <= 0 || !this.f755e.contains(view)) {
            return super.drawChild(canvas, view, j2);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f756f;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f755e;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f758h = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z) {
        if (z) {
            a(view);
        }
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i2) {
        a(getChildAt(i2));
        super.removeViewAt(i2);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            a(getChildAt(i4));
        }
        super.removeViews(i2, i3);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            a(getChildAt(i4));
        }
        super.removeViewsInLayout(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setDrawDisappearingViewsLast(boolean z) {
        this.f758h = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            super.setLayoutTransition(layoutTransition);
            return;
        }
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f757g = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f756f == null) {
                this.f756f = new ArrayList<>();
            }
            this.f756f.add(view);
        }
        super.startViewTransition(view);
    }
}

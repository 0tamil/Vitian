package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import e.a.f;
import e.a.j;
import e.d.p.u;
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: e  reason: collision with root package name */
    private boolean f273e;

    /* renamed from: f  reason: collision with root package name */
    private View f274f;

    /* renamed from: g  reason: collision with root package name */
    private View f275g;

    /* renamed from: h  reason: collision with root package name */
    private View f276h;

    /* renamed from: i  reason: collision with root package name */
    Drawable f277i;

    /* renamed from: j  reason: collision with root package name */
    Drawable f278j;

    /* renamed from: k  reason: collision with root package name */
    Drawable f279k;
    boolean l;
    boolean m;
    private int n;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        u.L(this, new b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.a);
        this.f277i = obtainStyledAttributes.getDrawable(j.b);
        this.f278j = obtainStyledAttributes.getDrawable(j.f1940d);
        this.n = obtainStyledAttributes.getDimensionPixelSize(j.f1946j, -1);
        boolean z = true;
        if (getId() == f.H) {
            this.l = true;
            this.f279k = obtainStyledAttributes.getDrawable(j.c);
        }
        obtainStyledAttributes.recycle();
        if (!this.l ? !(this.f277i == null && this.f278j == null) : this.f279k != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f277i;
        if (drawable != null && drawable.isStateful()) {
            this.f277i.setState(getDrawableState());
        }
        Drawable drawable2 = this.f278j;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f278j.setState(getDrawableState());
        }
        Drawable drawable3 = this.f279k;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f279k.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f274f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f277i;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f278j;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f279k;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f275g = findViewById(f.a_res_0x7f080028);
        this.f276h = findViewById(f.f_res_0x7f080030);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f273e || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z, i2, i3, i4, i5);
        View view2 = this.f274f;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (!(view2 == null || view2.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            int i6 = ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin;
            view2.layout(i2, (measuredHeight - view2.getMeasuredHeight()) - i6, i4, measuredHeight - i6);
        }
        if (this.l) {
            Drawable drawable3 = this.f279k;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f277i != null) {
                if (this.f275g.getVisibility() == 0) {
                    drawable2 = this.f277i;
                    left = this.f275g.getLeft();
                    top = this.f275g.getTop();
                    right = this.f275g.getRight();
                    view = this.f275g;
                } else {
                    View view3 = this.f276h;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f277i.setBounds(0, 0, 0, 0);
                        z3 = true;
                    } else {
                        drawable2 = this.f277i;
                        left = this.f276h.getLeft();
                        top = this.f276h.getTop();
                        right = this.f276h.getRight();
                        view = this.f276h;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z3 = true;
            }
            this.m = z4;
            if (!z4 || (drawable = this.f278j) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i2, int i3) {
        int i4;
        View view;
        int i5;
        if (this.f275g == null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && (i5 = this.n) >= 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i5, View.MeasureSpec.getSize(i3)), Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i3);
        if (this.f275g != null) {
            int mode = View.MeasureSpec.getMode(i3);
            View view2 = this.f274f;
            if (view2 != null && view2.getVisibility() != 8 && mode != 1073741824) {
                if (!b(this.f275g)) {
                    view = this.f275g;
                } else if (!b(this.f276h)) {
                    view = this.f276h;
                } else {
                    i4 = 0;
                    setMeasuredDimension(getMeasuredWidth(), Math.min(i4 + a(this.f274f), mode != Integer.MIN_VALUE ? View.MeasureSpec.getSize(i3) : Integer.MAX_VALUE));
                }
                i4 = a(view);
                setMeasuredDimension(getMeasuredWidth(), Math.min(i4 + a(this.f274f), mode != Integer.MIN_VALUE ? View.MeasureSpec.getSize(i3) : Integer.MAX_VALUE));
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f277i;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f277i);
        }
        this.f277i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f275g;
            if (view != null) {
                this.f277i.setBounds(view.getLeft(), this.f275g.getTop(), this.f275g.getRight(), this.f275g.getBottom());
            }
        }
        boolean z = true;
        if (!this.l ? !(this.f277i == null && this.f278j == null) : this.f279k != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f279k;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f279k);
        }
        this.f279k = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.l && (drawable2 = this.f279k) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.l ? this.f277i == null && this.f278j == null : this.f279k == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f278j;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f278j);
        }
        this.f278j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.m && (drawable2 = this.f278j) != null) {
                drawable2.setBounds(this.f274f.getLeft(), this.f274f.getTop(), this.f274f.getRight(), this.f274f.getBottom());
            }
        }
        boolean z = true;
        if (!this.l ? !(this.f277i == null && this.f278j == null) : this.f279k != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setTabContainer(q0 q0Var) {
        View view = this.f274f;
        if (view != null) {
            removeView(view);
        }
        this.f274f = q0Var;
        if (q0Var != null) {
            addView(q0Var);
            ViewGroup.LayoutParams layoutParams = q0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            q0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f273e = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.f277i;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f278j;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f279k;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f277i && !this.l) || (drawable == this.f278j && this.m) || ((drawable == this.f279k && this.l) || super.verifyDrawable(drawable));
    }
}

package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import e.a.f;
import e.a.g;
import e.a.j;
import e.a.n.b;
import e.d.p.u;
/* loaded from: classes.dex */
public class ActionBarContextView extends androidx.appcompat.widget.a {
    private CharSequence m;
    private CharSequence n;
    private View o;
    private View p;
    private View q;
    private LinearLayout r;
    private TextView s;
    private TextView t;
    private int u;
    private int v;
    private boolean w;
    private int x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b f280e;

        a(ActionBarContextView actionBarContextView, b bVar) {
            this.f280e = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f280e.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.a.f1918j);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        x0 u = x0.u(context, attributeSet, j.x, i2, 0);
        u.L(this, u.f(j.y));
        this.u = u.m(j.C, 0);
        this.v = u.m(j.B, 0);
        this.f346i = u.l(j.A, 0);
        this.x = u.m(j.z, g.d_res_0x7f0b0005);
        u.v();
    }

    private void i() {
        if (this.r == null) {
            LayoutInflater.from(getContext()).inflate(g.a_res_0x7f0b0000, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.r = linearLayout;
            this.s = (TextView) linearLayout.findViewById(f.e_res_0x7f08002e);
            this.t = (TextView) this.r.findViewById(f.d_res_0x7f08002d);
            if (this.u != 0) {
                this.s.setTextAppearance(getContext(), this.u);
            }
            if (this.v != 0) {
                this.t.setTextAppearance(getContext(), this.v);
            }
        }
        this.s.setText(this.m);
        this.t.setText(this.n);
        boolean z = !TextUtils.isEmpty(this.m);
        boolean z2 = !TextUtils.isEmpty(this.n);
        int i2 = 0;
        this.t.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.r;
        if (!z && !z2) {
            i2 = 8;
        }
        linearLayout2.setVisibility(i2);
        if (this.r.getParent() == null) {
            addView(this.r);
        }
    }

    public void g() {
        if (this.o == null) {
            k();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.n;
    }

    public CharSequence getTitle() {
        return this.m;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(b bVar) {
        c cVar;
        View view;
        View view2 = this.o;
        if (view2 == null) {
            view = LayoutInflater.from(getContext()).inflate(this.x, (ViewGroup) this, false);
            this.o = view;
        } else {
            if (view2.getParent() == null) {
                view = this.o;
            }
            View findViewById = this.o.findViewById(f.i_res_0x7f080037);
            this.p = findViewById;
            findViewById.setOnClickListener(new a(this, bVar));
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) bVar.e();
            cVar = this.f345h;
            if (cVar != null) {
                cVar.y();
            }
            c cVar2 = new c(getContext());
            this.f345h = cVar2;
            cVar2.J(true);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
            gVar.c(this.f345h, this.f343f);
            ActionMenuView actionMenuView = (ActionMenuView) this.f345h.o(this);
            this.f344g = actionMenuView;
            u.L(actionMenuView, null);
            addView(this.f344g, layoutParams);
        }
        addView(view);
        View findViewById2 = this.o.findViewById(f.i_res_0x7f080037);
        this.p = findViewById2;
        findViewById2.setOnClickListener(new a(this, bVar));
        androidx.appcompat.view.menu.g gVar2 = (androidx.appcompat.view.menu.g) bVar.e();
        cVar = this.f345h;
        if (cVar != null) {
        }
        c cVar22 = new c(getContext());
        this.f345h = cVar22;
        cVar22.J(true);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-2, -1);
        gVar2.c(this.f345h, this.f343f);
        ActionMenuView actionMenuView2 = (ActionMenuView) this.f345h.o(this);
        this.f344g = actionMenuView2;
        u.L(actionMenuView2, null);
        addView(this.f344g, layoutParams2);
    }

    public boolean j() {
        return this.w;
    }

    public void k() {
        removeAllViews();
        this.q = null;
        this.f344g = null;
        this.f345h = null;
        View view = this.p;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public boolean l() {
        c cVar = this.f345h;
        if (cVar != null) {
            return cVar.K();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f345h;
        if (cVar != null) {
            cVar.B();
            this.f345h.C();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.m);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean b = d1.b(this);
        int paddingRight = b ? (i4 - i2) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        View view = this.o;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.o.getLayoutParams();
            int i6 = b ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = b ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int d2 = androidx.appcompat.widget.a.d(paddingRight, i6, b);
            paddingRight = androidx.appcompat.widget.a.d(d2 + e(this.o, d2, paddingTop, paddingTop2, b), i7, b);
        }
        int i8 = paddingRight;
        LinearLayout linearLayout = this.r;
        if (!(linearLayout == null || this.q != null || linearLayout.getVisibility() == 8)) {
            i8 += e(this.r, i8, paddingTop, paddingTop2, b);
        }
        int i9 = i8;
        View view2 = this.q;
        if (view2 != null) {
            e(view2, i9, paddingTop, paddingTop2, b);
        }
        int paddingLeft = b ? getPaddingLeft() : (i4 - i2) - getPaddingRight();
        ActionMenuView actionMenuView = this.f344g;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        int i4 = 1073741824;
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i3) != 0) {
            int size = View.MeasureSpec.getSize(i2);
            int i5 = this.f346i;
            if (i5 <= 0) {
                i5 = View.MeasureSpec.getSize(i3);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i6 = i5 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
            View view = this.o;
            if (view != null) {
                int c = c(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.o.getLayoutParams();
                paddingLeft = c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f344g;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = c(this.f344g, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.r;
            if (linearLayout != null && this.q == null) {
                if (this.w) {
                    this.r.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.r.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.r.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.q;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i7 = layoutParams.width;
                int i8 = i7 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i7 >= 0) {
                    paddingLeft = Math.min(i7, paddingLeft);
                }
                int i9 = layoutParams.height;
                if (i9 == -2) {
                    i4 = Integer.MIN_VALUE;
                }
                if (i9 >= 0) {
                    i6 = Math.min(i9, i6);
                }
                this.q.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i8), View.MeasureSpec.makeMeasureSpec(i6, i4));
            }
            if (this.f346i <= 0) {
                int childCount = getChildCount();
                int i10 = 0;
                for (int i11 = 0; i11 < childCount; i11++) {
                    int measuredHeight = getChildAt(i11).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i10) {
                        i10 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i10);
                return;
            }
            setMeasuredDimension(size, i5);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    @Override // androidx.appcompat.widget.a
    public void setContentHeight(int i2) {
        this.f346i = i2;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.q;
        if (view2 != null) {
            removeView(view2);
        }
        this.q = view;
        if (!(view == null || (linearLayout = this.r) == null)) {
            removeView(linearLayout);
            this.r = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.n = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.m = charSequence;
        i();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.w) {
            requestLayout();
        }
        this.w = z;
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i2) {
        super.setVisibility(i2);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}

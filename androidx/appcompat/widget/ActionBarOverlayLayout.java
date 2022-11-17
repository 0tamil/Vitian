package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.m;
import e.a.f;
import e.d.p.c0;
import e.d.p.l;
import e.d.p.m;
import e.d.p.n;
import e.d.p.o;
import e.d.p.u;
@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements d0, n, l, m {
    static final int[] J = {e.a.a.b_res_0x7f030003, 16842841};
    private c0 A;
    private c0 B;
    private d C;
    private OverScroller D;
    ViewPropertyAnimator E;

    /* renamed from: e  reason: collision with root package name */
    private int f281e;

    /* renamed from: g  reason: collision with root package name */
    private ContentFrameLayout f283g;

    /* renamed from: h  reason: collision with root package name */
    ActionBarContainer f284h;

    /* renamed from: i  reason: collision with root package name */
    private e0 f285i;

    /* renamed from: j  reason: collision with root package name */
    private Drawable f286j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f287k;
    private boolean l;
    private boolean m;
    private boolean n;
    boolean o;
    private int p;
    private int q;
    private c0 y;
    private c0 z;

    /* renamed from: f  reason: collision with root package name */
    private int f282f = 0;
    private final Rect r = new Rect();
    private final Rect s = new Rect();
    private final Rect t = new Rect();
    private final Rect u = new Rect();
    private final Rect v = new Rect();
    private final Rect w = new Rect();
    private final Rect x = new Rect();
    final AnimatorListenerAdapter F = new a();
    private final Runnable G = new b();
    private final Runnable H = new c();
    private final o I = new o(this);

    /* loaded from: classes.dex */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.E = null;
            actionBarOverlayLayout.o = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.E = null;
            actionBarOverlayLayout.o = false;
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.E = actionBarOverlayLayout.f284h.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.F);
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.E = actionBarOverlayLayout.f284h.animate().translationY(-ActionBarOverlayLayout.this.f284h.getHeight()).setListener(ActionBarOverlayLayout.this.F);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(boolean z);

        void b();

        void c();

        void d(int i2);

        void e();

        void f();
    }

    /* loaded from: classes.dex */
    public static class e extends ViewGroup.MarginLayoutParams {
        public e(int i2, int i3) {
            super(i2, i3);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c0 c0Var = c0.b;
        this.y = c0Var;
        this.z = c0Var;
        this.A = c0Var;
        this.B = c0Var;
        v(context);
    }

    private void A() {
        u();
        this.G.run();
    }

    private boolean B(float f2) {
        this.D.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.D.getFinalY() > this.f284h.getHeight();
    }

    private void p() {
        u();
        this.H.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean q(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        e eVar = (e) view.getLayoutParams();
        if (z) {
            int i2 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
            int i3 = rect.left;
            if (i2 != i3) {
                ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i3;
                z5 = true;
                if (z2) {
                    int i4 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                    int i5 = rect.top;
                    if (i4 != i5) {
                        ((ViewGroup.MarginLayoutParams) eVar).topMargin = i5;
                        z5 = true;
                    }
                }
                if (z4) {
                    int i6 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                    int i7 = rect.right;
                    if (i6 != i7) {
                        ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i7;
                        z5 = true;
                    }
                }
                if (z3) {
                    int i8 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                    int i9 = rect.bottom;
                    if (i8 != i9) {
                        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i9;
                        return true;
                    }
                }
                return z5;
            }
        }
        z5 = false;
        if (z2) {
        }
        if (z4) {
        }
        if (z3) {
        }
        return z5;
    }

    private e0 t(View view) {
        if (view instanceof e0) {
            return (e0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void v(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(J);
        boolean z = false;
        this.f281e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f286j = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.f287k = z;
        this.D = new OverScroller(context);
    }

    private void x() {
        u();
        postDelayed(this.H, 600L);
    }

    private void y() {
        u();
        postDelayed(this.G, 600L);
    }

    @Override // androidx.appcompat.widget.d0
    public void a(Menu menu, m.a aVar) {
        z();
        this.f285i.a(menu, aVar);
    }

    @Override // androidx.appcompat.widget.d0
    public boolean b() {
        z();
        return this.f285i.b();
    }

    @Override // androidx.appcompat.widget.d0
    public boolean c() {
        z();
        return this.f285i.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.d0
    public boolean d() {
        z();
        return this.f285i.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f286j != null && !this.f287k) {
            int bottom = this.f284h.getVisibility() == 0 ? (int) (this.f284h.getBottom() + this.f284h.getTranslationY() + 0.5f) : 0;
            this.f286j.setBounds(0, bottom, getWidth(), this.f286j.getIntrinsicHeight() + bottom);
            this.f286j.draw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.d0
    public boolean e() {
        z();
        return this.f285i.e();
    }

    @Override // androidx.appcompat.widget.d0
    public void f() {
        z();
        this.f285i.f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT >= 21) {
            return super.fitSystemWindows(rect);
        }
        z();
        boolean q = q(this.f284h, rect, true, true, false, true);
        this.u.set(rect);
        d1.a(this, this.u, this.r);
        if (!this.v.equals(this.u)) {
            this.v.set(this.u);
            q = true;
        }
        if (!this.s.equals(this.r)) {
            this.s.set(this.r);
            q = true;
        }
        if (q) {
            requestLayout();
        }
        return true;
    }

    @Override // androidx.appcompat.widget.d0
    public boolean g() {
        z();
        return this.f285i.g();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f284h;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.I.a();
    }

    public CharSequence getTitle() {
        z();
        return this.f285i.getTitle();
    }

    @Override // e.d.p.l
    public void h(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    @Override // e.d.p.l
    public void i(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // e.d.p.l
    public void j(View view, int i2, int i3, int[] iArr, int i4) {
        if (i4 == 0) {
            onNestedPreScroll(view, i2, i3, iArr);
        }
    }

    @Override // androidx.appcompat.widget.d0
    public void k(int i2) {
        z();
        if (i2 == 2) {
            this.f285i.q();
        } else if (i2 == 5) {
            this.f285i.s();
        } else if (i2 == 109) {
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.d0
    public void l() {
        z();
        this.f285i.h();
    }

    @Override // e.d.p.m
    public void m(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        n(view, i2, i3, i4, i5, i6);
    }

    @Override // e.d.p.l
    public void n(View view, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(view, i2, i3, i4, i5);
        }
    }

    @Override // e.d.p.l
    public boolean o(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        z();
        c0 v = c0.v(windowInsets, this);
        boolean q = q(this.f284h, new Rect(v.i(), v.k(), v.j(), v.h()), true, true, false, true);
        u.c(this, v, this.r);
        Rect rect = this.r;
        c0 l = v.l(rect.left, rect.top, rect.right, rect.bottom);
        this.y = l;
        boolean z = true;
        if (!this.z.equals(l)) {
            this.z = this.y;
            q = true;
        }
        if (!this.s.equals(this.r)) {
            this.s.set(this.r);
        } else {
            z = q;
        }
        if (z) {
            requestLayout();
        }
        return v.a().c().b().t();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v(getContext());
        u.H(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i8 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        int i4;
        c0 c0Var;
        z();
        measureChildWithMargins(this.f284h, i2, 0, i3, 0);
        e eVar = (e) this.f284h.getLayoutParams();
        int max = Math.max(0, this.f284h.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.f284h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f284h.getMeasuredState());
        boolean z = (u.u(this) & 256) != 0;
        if (z) {
            i4 = this.f281e;
            if (this.m && this.f284h.getTabContainer() != null) {
                i4 += this.f281e;
            }
        } else {
            i4 = this.f284h.getVisibility() != 8 ? this.f284h.getMeasuredHeight() : 0;
        }
        this.t.set(this.r);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 21) {
            this.A = this.y;
        } else {
            this.w.set(this.u);
        }
        if (!this.l && !z) {
            Rect rect = this.t;
            rect.top += i4;
            rect.bottom += 0;
            if (i5 >= 21) {
                c0Var = this.A.l(0, i4, 0, 0);
                this.A = c0Var;
            }
        } else if (i5 >= 21) {
            e.d.j.b b2 = e.d.j.b.b(this.A.i(), this.A.k() + i4, this.A.j(), this.A.h() + 0);
            c0.b bVar = new c0.b(this.A);
            bVar.c(b2);
            c0Var = bVar.a();
            this.A = c0Var;
        } else {
            Rect rect2 = this.w;
            rect2.top += i4;
            rect2.bottom += 0;
        }
        q(this.f283g, this.t, true, true, true, true);
        if (i5 >= 21 && !this.B.equals(this.A)) {
            c0 c0Var2 = this.A;
            this.B = c0Var2;
            u.d(this.f283g, c0Var2);
        } else if (i5 < 21 && !this.x.equals(this.w)) {
            this.x.set(this.w);
            this.f283g.a(this.w);
        }
        measureChildWithMargins(this.f283g, i2, 0, i3, 0);
        e eVar2 = (e) this.f283g.getLayoutParams();
        int max3 = Math.max(max, this.f283g.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.f283g.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f283g.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, e.d.p.n
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        if (!this.n || !z) {
            return false;
        }
        if (B(f3)) {
            p();
        } else {
            A();
        }
        this.o = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, e.d.p.n
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, e.d.p.n
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, e.d.p.n
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.p + i3;
        this.p = i6;
        setActionBarHideOffset(i6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, e.d.p.n
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.I.b(view, view2, i2);
        this.p = getActionBarHideOffset();
        u();
        d dVar = this.C;
        if (dVar != null) {
            dVar.c();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, e.d.p.n
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.f284h.getVisibility() != 0) {
            return false;
        }
        return this.n;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, e.d.p.n
    public void onStopNestedScroll(View view) {
        if (this.n && !this.o) {
            if (this.p <= this.f284h.getHeight()) {
                y();
            } else {
                x();
            }
        }
        d dVar = this.C;
        if (dVar != null) {
            dVar.f();
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i2) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i2);
        }
        z();
        int i3 = this.q ^ i2;
        this.q = i2;
        boolean z = false;
        boolean z2 = (i2 & 4) == 0;
        if ((i2 & 256) != 0) {
            z = true;
        }
        d dVar = this.C;
        if (dVar != null) {
            dVar.a(!z);
            if (z2 || !z) {
                this.C.b();
            } else {
                this.C.e();
            }
        }
        if ((i3 & 256) != 0 && this.C != null) {
            u.H(this);
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.f282f = i2;
        d dVar = this.C;
        if (dVar != null) {
            dVar.d(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    /* renamed from: s */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i2) {
        u();
        this.f284h.setTranslationY(-Math.max(0, Math.min(i2, this.f284h.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.C = dVar;
        if (getWindowToken() != null) {
            this.C.d(this.f282f);
            int i2 = this.q;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                u.H(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.m = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.n) {
            this.n = z;
            if (!z) {
                u();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i2) {
        z();
        this.f285i.setIcon(i2);
    }

    public void setIcon(Drawable drawable) {
        z();
        this.f285i.setIcon(drawable);
    }

    public void setLogo(int i2) {
        z();
        this.f285i.k(i2);
    }

    public void setOverlayMode(boolean z) {
        this.l = z;
        this.f287k = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i2) {
    }

    @Override // androidx.appcompat.widget.d0
    public void setWindowCallback(Window.Callback callback) {
        z();
        this.f285i.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.d0
    public void setWindowTitle(CharSequence charSequence) {
        z();
        this.f285i.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    void u() {
        removeCallbacks(this.G);
        removeCallbacks(this.H);
        ViewPropertyAnimator viewPropertyAnimator = this.E;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean w() {
        return this.l;
    }

    void z() {
        if (this.f283g == null) {
            this.f283g = (ContentFrameLayout) findViewById(f.b_res_0x7f080029);
            this.f284h = (ActionBarContainer) findViewById(f.c_res_0x7f08002a);
            this.f285i = t(findViewById(f.a_res_0x7f080028));
        }
    }
}

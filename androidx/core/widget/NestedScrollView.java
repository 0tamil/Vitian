package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import e.d.p.e0.b;
import e.d.p.e0.d;
import e.d.p.j;
import e.d.p.k;
import e.d.p.m;
import e.d.p.o;
import e.d.p.u;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements m, j {
    private static final a E = new a();
    private static final int[] F = {16843130};
    private final o A;
    private final k B;
    private float C;
    private b D;

    /* renamed from: e  reason: collision with root package name */
    private long f645e;

    /* renamed from: f  reason: collision with root package name */
    private final Rect f646f;

    /* renamed from: g  reason: collision with root package name */
    private OverScroller f647g;

    /* renamed from: h  reason: collision with root package name */
    private EdgeEffect f648h;

    /* renamed from: i  reason: collision with root package name */
    private EdgeEffect f649i;

    /* renamed from: j  reason: collision with root package name */
    private int f650j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f651k;
    private boolean l;
    private View m;
    private boolean n;
    private VelocityTracker o;
    private boolean p;
    private boolean q;
    private int r;
    private int s;
    private int t;
    private int u;
    private final int[] v;
    private final int[] w;
    private int x;
    private int y;
    private c z;

    /* loaded from: classes.dex */
    static class a extends e.d.p.a {
        a() {
        }

        @Override // e.d.p.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            d.a(accessibilityEvent, nestedScrollView.getScrollX());
            d.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // e.d.p.a
        public void g(View view, e.d.p.e0.b bVar) {
            int scrollRange;
            super.g(view, bVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            bVar.I(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                bVar.M(true);
                if (nestedScrollView.getScrollY() > 0) {
                    bVar.a(b.a.f2132e);
                    bVar.a(b.a.f2133f);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    bVar.a(b.a.f2131d);
                    bVar.a(b.a.f2134g);
                }
            }
        }

        @Override // e.d.p.a
        public boolean j(View view, int i2, Bundle bundle) {
            if (super.j(view, i2, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i2 != 4096) {
                if (i2 == 8192 || i2 == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.O(0, max, true);
                    return true;
                } else if (i2 != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.O(0, min, true);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c extends View.BaseSavedState {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: e  reason: collision with root package name */
        public int f652e;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<c> {
            a() {
            }

            /* renamed from: a */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            /* renamed from: b */
            public c[] newArray(int i2) {
                return new c[i2];
            }
        }

        c(Parcel parcel) {
            super(parcel);
            this.f652e = parcel.readInt();
        }

        c(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f652e + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f652e);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.d.a.b_res_0x7f0300c6);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f646f = new Rect();
        this.f651k = true;
        this.l = false;
        this.m = null;
        this.n = false;
        this.q = true;
        this.u = -1;
        this.v = new int[2];
        this.w = new int[2];
        x();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, F, i2, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.A = new o(this);
        this.B = new k(this);
        setNestedScrollingEnabled(true);
        u.K(this, E);
    }

    private static boolean A(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && A((View) parent, view2);
    }

    private boolean B(View view, int i2, int i3) {
        view.getDrawingRect(this.f646f);
        offsetDescendantRectToMyCoords(view, this.f646f);
        return this.f646f.bottom + i2 >= getScrollY() && this.f646f.top - i2 <= getScrollY() + i3;
    }

    private void C(int i2, int i3, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.B.d(0, scrollY2, 0, i2 - scrollY2, null, i3, iArr);
    }

    private void D(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.u) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f650j = (int) motionEvent.getY(i2);
            this.u = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.o;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void G() {
        VelocityTracker velocityTracker = this.o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.o = null;
        }
    }

    private void H(boolean z) {
        if (z) {
            P(2, 1);
        } else {
            Q(1);
        }
        this.y = getScrollY();
        u.E(this);
    }

    private boolean I(int i2, int i3, int i4) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = height + scrollY;
        boolean z = false;
        boolean z2 = i2 == 33;
        View r = r(z2, i3, i4);
        if (r == null) {
            r = this;
        }
        if (i3 < scrollY || i4 > i5) {
            k(z2 ? i3 - scrollY : i4 - i5);
            z = true;
        }
        if (r != findFocus()) {
            r.requestFocus(i2);
        }
        return z;
    }

    private void J(View view) {
        view.getDrawingRect(this.f646f);
        offsetDescendantRectToMyCoords(view, this.f646f);
        int e2 = e(this.f646f);
        if (e2 != 0) {
            scrollBy(0, e2);
        }
    }

    private boolean K(Rect rect, boolean z) {
        int e2 = e(rect);
        boolean z2 = e2 != 0;
        if (z2) {
            if (z) {
                scrollBy(0, e2);
            } else {
                L(0, e2);
            }
        }
        return z2;
    }

    private void M(int i2, int i3, int i4, boolean z) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f645e > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f647g;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i3 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i4);
                H(z);
            } else {
                if (!this.f647g.isFinished()) {
                    a();
                }
                scrollBy(i2, i3);
            }
            this.f645e = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    private void a() {
        this.f647g.abortAnimation();
        Q(1);
    }

    private boolean c() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private static int d(int i2, int i3, int i4) {
        if (i3 >= i4 || i2 < 0) {
            return 0;
        }
        return i3 + i2 > i4 ? i4 - i3 : i2;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.C == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.C = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.C;
    }

    private void k(int i2) {
        if (i2 == 0) {
            return;
        }
        if (this.q) {
            L(0, i2);
        } else {
            scrollBy(0, i2);
        }
    }

    private void l() {
        this.n = false;
        G();
        Q(0);
        EdgeEffect edgeEffect = this.f648h;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f649i.onRelease();
        }
    }

    private void p() {
        if (getOverScrollMode() == 2) {
            this.f648h = null;
            this.f649i = null;
        } else if (this.f648h == null) {
            Context context = getContext();
            this.f648h = new EdgeEffect(context);
            this.f649i = new EdgeEffect(context);
        }
    }

    private View r(boolean z, int i2, int i3) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) focusables.get(i4);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z3 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = (z && top < view.getTop()) || (!z && bottom > view.getBottom());
                    if (z2) {
                        if (z3) {
                            if (!z4) {
                            }
                            view = view2;
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else {
                        if (!z4) {
                        }
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    private boolean v(int i2, int i3) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i3 >= childAt.getTop() - scrollY && i3 < childAt.getBottom() - scrollY && i2 >= childAt.getLeft() && i2 < childAt.getRight();
    }

    private void w() {
        VelocityTracker velocityTracker = this.o;
        if (velocityTracker == null) {
            this.o = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void x() {
        this.f647g = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.r = viewConfiguration.getScaledTouchSlop();
        this.s = viewConfiguration.getScaledMinimumFlingVelocity();
        this.t = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void y() {
        if (this.o == null) {
            this.o = VelocityTracker.obtain();
        }
    }

    private boolean z(View view) {
        return !B(view, 0, getHeight());
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    boolean E(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z) {
        boolean z2;
        boolean z3;
        int overScrollMode = getOverScrollMode();
        boolean z4 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z5 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z6 = overScrollMode == 0 || (overScrollMode == 1 && z4);
        boolean z7 = overScrollMode == 0 || (overScrollMode == 1 && z5);
        int i10 = i4 + i2;
        int i11 = !z6 ? 0 : i8;
        int i12 = i5 + i3;
        int i13 = !z7 ? 0 : i9;
        int i14 = -i11;
        int i15 = i11 + i6;
        int i16 = -i13;
        int i17 = i13 + i7;
        if (i10 > i15) {
            i10 = i15;
        } else if (i10 < i14) {
            i10 = i14;
        } else {
            z2 = false;
            if (i12 <= i17) {
                i12 = i17;
            } else if (i12 < i16) {
                i12 = i16;
            } else {
                z3 = false;
                if (z3 && !u(1)) {
                    this.f647g.springBack(i10, i12, 0, 0, 0, getScrollRange());
                }
                onOverScrolled(i10, i12, z2, z3);
                return !z2 || z3;
            }
            z3 = true;
            if (z3) {
                this.f647g.springBack(i10, i12, 0, 0, 0, getScrollRange());
            }
            onOverScrolled(i10, i12, z2, z3);
            if (!z2) {
            }
        }
        z2 = true;
        if (i12 <= i17) {
        }
        z3 = true;
        if (z3) {
        }
        onOverScrolled(i10, i12, z2, z3);
        if (!z2) {
        }
    }

    public boolean F(int i2) {
        boolean z = i2 == 130;
        int height = getHeight();
        if (z) {
            this.f646f.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f646f;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f646f.top = getScrollY() - height;
            Rect rect2 = this.f646f;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f646f;
        int i3 = rect3.top;
        int i4 = height + i3;
        rect3.bottom = i4;
        return I(i2, i3, i4);
    }

    public final void L(int i2, int i3) {
        M(i2, i3, 250, false);
    }

    void N(int i2, int i3, int i4, boolean z) {
        M(i2 - getScrollX(), i3 - getScrollY(), i4, z);
    }

    void O(int i2, int i3, boolean z) {
        N(i2, i3, 250, z);
    }

    public boolean P(int i2, int i3) {
        return this.B.m(i2, i3);
    }

    public void Q(int i2) {
        this.B.n(i2);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i2);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public boolean b(int i2) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i2);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !B(findNextFocus, maxScrollAmount, getHeight())) {
            if (i2 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i2 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            k(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f646f);
            offsetDescendantRectToMyCoords(findNextFocus, this.f646f);
            k(e(this.f646f));
            findNextFocus.requestFocus(i2);
        }
        if (findFocus == null || !findFocus.isFocused() || !z(findFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (!this.f647g.isFinished()) {
            this.f647g.computeScrollOffset();
            int currY = this.f647g.getCurrY();
            int i2 = currY - this.y;
            this.y = currY;
            int[] iArr = this.w;
            boolean z = false;
            iArr[1] = 0;
            f(0, i2, iArr, null, 1);
            int i3 = i2 - this.w[1];
            int scrollRange = getScrollRange();
            if (i3 != 0) {
                int scrollY = getScrollY();
                E(0, i3, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - scrollY;
                int i4 = i3 - scrollY2;
                int[] iArr2 = this.w;
                iArr2[1] = 0;
                g(0, scrollY2, 0, i4, this.v, 1, iArr2);
                i3 = i4 - this.w[1];
            }
            if (i3 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z = true;
                }
                if (z) {
                    p();
                    if (i3 < 0) {
                        if (this.f648h.isFinished()) {
                            edgeEffect = this.f648h;
                            edgeEffect.onAbsorb((int) this.f647g.getCurrVelocity());
                        }
                    } else if (this.f649i.isFinished()) {
                        edgeEffect = this.f649i;
                        edgeEffect.onAbsorb((int) this.f647g.getCurrVelocity());
                    }
                }
                a();
            }
            if (!this.f647g.isFinished()) {
                u.E(this);
            } else {
                Q(1);
            }
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || q(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f2, float f3, boolean z) {
        return this.B.a(f2, f3, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.B.b(f2, f3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return f(i2, i3, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.B.e(i2, i3, i4, i5, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        super.draw(canvas);
        if (this.f648h != null) {
            int scrollY = getScrollY();
            int i4 = 0;
            if (!this.f648h.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (i3 < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i2 = getPaddingLeft() + 0;
                } else {
                    i2 = 0;
                }
                if (i3 >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate(i2, min);
                this.f648h.setSize(width, height);
                if (this.f648h.draw(canvas)) {
                    u.E(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f649i.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(getScrollRange(), scrollY) + height2;
                if (i3 < 21 || getClipToPadding()) {
                    width2 -= getPaddingLeft() + getPaddingRight();
                    i4 = 0 + getPaddingLeft();
                }
                if (i3 >= 21 && getClipToPadding()) {
                    height2 -= getPaddingTop() + getPaddingBottom();
                    max -= getPaddingBottom();
                }
                canvas.translate(i4 - width2, max);
                canvas.rotate(180.0f, width2, 0.0f);
                this.f649i.setSize(width2, height2);
                if (this.f649i.draw(canvas)) {
                    u.E(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    protected int e(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i3 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i2 - verticalFadingEdgeLength : i2;
        int i4 = rect.bottom;
        if (i4 > i3 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i3) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i2);
        } else if (rect.top >= scrollY || i4 >= i3) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i3 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    public boolean f(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return this.B.c(i2, i3, iArr, iArr2, i4);
    }

    public void g(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        this.B.d(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.A.a();
    }

    int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // e.d.p.l
    public void h(View view, View view2, int i2, int i3) {
        this.A.c(view, view2, i2, i3);
        P(2, i3);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return u(0);
    }

    @Override // e.d.p.l
    public void i(View view, int i2) {
        this.A.d(view, i2);
        Q(i2);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.B.j();
    }

    @Override // e.d.p.l
    public void j(View view, int i2, int i3, int[] iArr, int i4) {
        f(i2, i3, iArr, null, i4);
    }

    @Override // e.d.p.m
    public void m(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        C(i5, i6, iArr);
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i2, int i3) {
        view.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // e.d.p.l
    public void n(View view, int i2, int i3, int i4, int i5, int i6) {
        C(i5, i6, null);
    }

    @Override // e.d.p.l
    public boolean o(View view, View view2, int i2, int i3) {
        return (i2 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.l = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.n) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int verticalScrollFactorCompat = scrollY - ((int) (axisValue * getVerticalScrollFactorCompat()));
                if (verticalScrollFactorCompat < 0) {
                    scrollRange = 0;
                } else if (verticalScrollFactorCompat <= scrollRange) {
                    scrollRange = verticalScrollFactorCompat;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.n) {
            return true;
        }
        int i2 = action & 255;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    int i3 = this.u;
                    if (i3 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i3);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i3 + " in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.f650j) > this.r && (2 & getNestedScrollAxes()) == 0) {
                                this.n = true;
                                this.f650j = y;
                                y();
                                this.o.addMovement(motionEvent);
                                this.x = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i2 != 3) {
                    if (i2 == 6) {
                        D(motionEvent);
                    }
                }
            }
            this.n = false;
            this.u = -1;
            G();
            if (this.f647g.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                u.E(this);
            }
            Q(0);
        } else {
            int y2 = (int) motionEvent.getY();
            if (!v((int) motionEvent.getX(), y2)) {
                this.n = false;
                G();
            } else {
                this.f650j = y2;
                this.u = motionEvent.getPointerId(0);
                w();
                this.o.addMovement(motionEvent);
                this.f647g.computeScrollOffset();
                this.n = !this.f647g.isFinished();
                P(2, 0);
            }
        }
        return this.n;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        int i6 = 0;
        this.f651k = false;
        View view = this.m;
        if (view != null && A(view, this)) {
            J(this.m);
        }
        this.m = null;
        if (!this.l) {
            if (this.z != null) {
                scrollTo(getScrollX(), this.z.f652e);
                this.z = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i6 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int d2 = d(scrollY, paddingTop, i6);
            if (d2 != scrollY) {
                scrollTo(getScrollX(), d2);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.l = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.p && View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, e.d.p.n
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f3, true);
        s((int) f3);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, e.d.p.n
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, e.d.p.n
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        j(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, e.d.p.n
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        C(i5, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, e.d.p.n
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        h(view, view2, i2, 0);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i2, int i3, boolean z, boolean z2) {
        super.scrollTo(i2, i3);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        View findNextFocus = rect == null ? focusFinder.findNextFocus(this, null, i2) : focusFinder.findNextFocusFromRect(this, rect, i2);
        if (findNextFocus != null && !z(findNextFocus)) {
            return findNextFocus.requestFocus(i2, rect);
        }
        return false;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        this.z = cVar;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f652e = getScrollY();
        return cVar;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        b bVar = this.D;
        if (bVar != null) {
            bVar.a(this, i2, i3, i4, i5);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && B(findFocus, 0, i5)) {
            findFocus.getDrawingRect(this.f646f);
            offsetDescendantRectToMyCoords(findFocus, this.f646f);
            k(e(this.f646f));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, e.d.p.n
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return o(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, e.d.p.n
    public void onStopNestedScroll(View view) {
        i(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
        if (r23.f647g.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
        e.d.p.u.E(r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0210, code lost:
        if (r23.f647g.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L24;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        y();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.x = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, this.x);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.o;
                velocityTracker.computeCurrentVelocity(1000, this.t);
                int yVelocity = (int) velocityTracker.getYVelocity(this.u);
                if (Math.abs(yVelocity) >= this.s) {
                    int i2 = -yVelocity;
                    float f2 = i2;
                    if (!dispatchNestedPreFling(0.0f, f2)) {
                        dispatchNestedFling(0.0f, f2, true);
                        s(i2);
                    }
                }
                this.u = -1;
                l();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.u);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.u + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(findPointerIndex);
                    int i3 = this.f650j - y;
                    if (!this.n && Math.abs(i3) > this.r) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.n = true;
                        int i4 = this.r;
                        i3 = i3 > 0 ? i3 - i4 : i3 + i4;
                    }
                    int i5 = i3;
                    if (this.n) {
                        if (f(0, i5, this.w, this.v, 0)) {
                            i5 -= this.w[1];
                            this.x += this.v[1];
                        }
                        int i6 = i5;
                        this.f650j = y - this.v[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int overScrollMode = getOverScrollMode();
                        boolean z = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
                        if (E(0, i6, 0, getScrollY(), 0, scrollRange, 0, 0, true) && !u(0)) {
                            this.o.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        int[] iArr = this.w;
                        iArr[1] = 0;
                        g(0, scrollY2, 0, i6 - scrollY2, this.v, 0, iArr);
                        int i7 = this.f650j;
                        int[] iArr2 = this.v;
                        this.f650j = i7 - iArr2[1];
                        this.x += iArr2[1];
                        if (z) {
                            int i8 = i6 - this.w[1];
                            p();
                            int i9 = scrollY + i8;
                            if (i9 < 0) {
                                d.a(this.f648h, i8 / getHeight(), motionEvent.getX(findPointerIndex) / getWidth());
                                if (!this.f649i.isFinished()) {
                                    edgeEffect2 = this.f649i;
                                    edgeEffect2.onRelease();
                                }
                                edgeEffect = this.f648h;
                                if (edgeEffect != null && (!edgeEffect.isFinished() || !this.f649i.isFinished())) {
                                    u.E(this);
                                }
                            } else {
                                if (i9 > scrollRange) {
                                    d.a(this.f649i, i8 / getHeight(), 1.0f - (motionEvent.getX(findPointerIndex) / getWidth()));
                                    if (!this.f648h.isFinished()) {
                                        edgeEffect2 = this.f648h;
                                        edgeEffect2.onRelease();
                                    }
                                }
                                edgeEffect = this.f648h;
                                if (edgeEffect != null) {
                                    u.E(this);
                                }
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.n) {
                    if (getChildCount() > 0) {
                    }
                }
                this.u = -1;
                l();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f650j = (int) motionEvent.getY(actionIndex);
                this.u = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                D(motionEvent);
                this.f650j = (int) motionEvent.getY(motionEvent.findPointerIndex(this.u));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            boolean z2 = !this.f647g.isFinished();
            this.n = z2;
            if (z2 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f647g.isFinished()) {
                a();
            }
            this.f650j = (int) motionEvent.getY();
            this.u = motionEvent.getPointerId(0);
            P(2, 0);
        }
        VelocityTracker velocityTracker2 = this.o;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public boolean q(KeyEvent keyEvent) {
        this.f646f.setEmpty();
        int i2 = 130;
        if (!c()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return !keyEvent.isAltPressed() ? b(33) : t(33);
            }
            if (keyCode == 20) {
                return !keyEvent.isAltPressed() ? b(130) : t(130);
            }
            if (keyCode != 62) {
                return false;
            }
            if (keyEvent.isShiftPressed()) {
                i2 = 33;
            }
            F(i2);
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f651k) {
            J(view2);
        } else {
            this.m = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return K(rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            G();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f651k = true;
        super.requestLayout();
    }

    public void s(int i2) {
        if (getChildCount() > 0) {
            this.f647g.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            H(true);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int d2 = d(i2, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int d3 = d(i3, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (d2 != getScrollX() || d3 != getScrollY()) {
                super.scrollTo(d2, d3);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.p) {
            this.p = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.B.k(z);
    }

    public void setOnScrollChangeListener(b bVar) {
        this.D = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.q = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i2) {
        return P(i2, 0);
    }

    @Override // android.view.View, e.d.p.j
    public void stopNestedScroll() {
        Q(0);
    }

    public boolean t(int i2) {
        int childCount;
        boolean z = i2 == 130;
        int height = getHeight();
        Rect rect = this.f646f;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f646f.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f646f;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f646f;
        return I(i2, rect3.top, rect3.bottom);
    }

    public boolean u(int i2) {
        return this.B.i(i2);
    }
}

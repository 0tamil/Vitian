package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import e.a.j;
import e.d.p.e;
import e.d.p.u;
/* loaded from: classes.dex */
public class j0 extends ViewGroup {

    /* renamed from: e  reason: collision with root package name */
    private boolean f418e;

    /* renamed from: f  reason: collision with root package name */
    private int f419f;

    /* renamed from: g  reason: collision with root package name */
    private int f420g;

    /* renamed from: h  reason: collision with root package name */
    private int f421h;

    /* renamed from: i  reason: collision with root package name */
    private int f422i;

    /* renamed from: j  reason: collision with root package name */
    private int f423j;

    /* renamed from: k  reason: collision with root package name */
    private float f424k;
    private boolean l;
    private int[] m;
    private int[] n;
    private Drawable o;
    private int p;
    private int q;
    private int r;
    private int s;

    /* loaded from: classes.dex */
    public static class a extends LinearLayout.LayoutParams {
        public a(int i2, int i3) {
            super(i2, i3);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public j0(Context context) {
        this(context, null);
    }

    public j0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public j0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f418e = true;
        this.f419f = -1;
        this.f420g = 0;
        this.f422i = 8388659;
        int[] iArr = j.Q0;
        x0 u = x0.u(context, attributeSet, iArr, i2, 0);
        u.I(this, context, iArr, attributeSet, u.q(), i2, 0);
        int j2 = u.j(j.S0, -1);
        if (j2 >= 0) {
            setOrientation(j2);
        }
        int j3 = u.j(j.R0, -1);
        if (j3 >= 0) {
            setGravity(j3);
        }
        boolean a2 = u.a(j.T0, true);
        if (!a2) {
            setBaselineAligned(a2);
        }
        this.f424k = u.h(j.V0, -1.0f);
        this.f419f = u.j(j.U0, -1);
        this.l = u.a(j.Y0, false);
        setDividerDrawable(u.f(j.W0));
        this.r = u.j(j.Z0, 0);
        this.s = u.e(j.X0, 0);
        u.v();
    }

    private void i(int i2, int i3) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i4 = 0; i4 < i2; i4++) {
            View q = q(i4);
            if (q.getVisibility() != 8) {
                a aVar = (a) q.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).height == -1) {
                    int i5 = ((LinearLayout.LayoutParams) aVar).width;
                    ((LinearLayout.LayoutParams) aVar).width = q.getMeasuredWidth();
                    measureChildWithMargins(q, i3, 0, makeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) aVar).width = i5;
                }
            }
        }
    }

    private void j(int i2, int i3) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i4 = 0; i4 < i2; i4++) {
            View q = q(i4);
            if (q.getVisibility() != 8) {
                a aVar = (a) q.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i5 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = q.getMeasuredHeight();
                    measureChildWithMargins(q, makeMeasureSpec, 0, i3, 0);
                    ((LinearLayout.LayoutParams) aVar).height = i5;
                }
            }
        }
    }

    private void y(View view, int i2, int i3, int i4, int i5) {
        view.layout(i2, i3, i4 + i2, i5 + i3);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    void e(Canvas canvas) {
        int i2;
        int i3;
        int i4;
        int virtualChildCount = getVirtualChildCount();
        boolean b = d1.b(this);
        for (int i5 = 0; i5 < virtualChildCount; i5++) {
            View q = q(i5);
            if (!(q == null || q.getVisibility() == 8 || !r(i5))) {
                a aVar = (a) q.getLayoutParams();
                h(canvas, b ? q.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (q.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.p);
            }
        }
        if (r(virtualChildCount)) {
            View q2 = q(virtualChildCount - 1);
            if (q2 != null) {
                a aVar2 = (a) q2.getLayoutParams();
                if (b) {
                    i4 = q2.getLeft();
                    i3 = ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    i2 = (i4 - i3) - this.p;
                    h(canvas, i2);
                }
                i2 = q2.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                h(canvas, i2);
            } else if (b) {
                i2 = getPaddingLeft();
                h(canvas, i2);
            } else {
                i4 = getWidth();
                i3 = getPaddingRight();
                i2 = (i4 - i3) - this.p;
                h(canvas, i2);
            }
        }
    }

    void f(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View q = q(i2);
            if (!(q == null || q.getVisibility() == 8 || !r(i2))) {
                g(canvas, (q.getTop() - ((LinearLayout.LayoutParams) ((a) q.getLayoutParams())).topMargin) - this.q);
            }
        }
        if (r(virtualChildCount)) {
            View q2 = q(virtualChildCount - 1);
            g(canvas, q2 == null ? (getHeight() - getPaddingBottom()) - this.q : q2.getBottom() + ((LinearLayout.LayoutParams) ((a) q2.getLayoutParams())).bottomMargin);
        }
    }

    void g(Canvas canvas, int i2) {
        this.o.setBounds(getPaddingLeft() + this.s, i2, (getWidth() - getPaddingRight()) - this.s, this.q + i2);
        this.o.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i2;
        if (this.f419f < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.f419f;
        if (childCount > i3) {
            View childAt = getChildAt(i3);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i4 = this.f420g;
                if (this.f421h == 1 && (i2 = this.f422i & 112) != 48) {
                    if (i2 == 16) {
                        i4 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f423j) / 2;
                    } else if (i2 == 80) {
                        i4 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f423j;
                    }
                }
                return i4 + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
            } else if (this.f419f == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f419f;
    }

    public Drawable getDividerDrawable() {
        return this.o;
    }

    public int getDividerPadding() {
        return this.s;
    }

    public int getDividerWidth() {
        return this.p;
    }

    public int getGravity() {
        return this.f422i;
    }

    public int getOrientation() {
        return this.f421h;
    }

    public int getShowDividers() {
        return this.r;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f424k;
    }

    void h(Canvas canvas, int i2) {
        this.o.setBounds(i2, getPaddingTop() + this.s, this.p + i2, (getHeight() - getPaddingBottom()) - this.s);
        this.o.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public a generateDefaultLayoutParams() {
        int i2 = this.f421h;
        if (i2 == 0) {
            return new a(-2, -2);
        }
        if (i2 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    /* renamed from: l */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    int n(View view, int i2) {
        return 0;
    }

    int o(View view) {
        return 0;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.o != null) {
            if (this.f421h == 1) {
                f(canvas);
            } else {
                e(canvas);
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (this.f421h == 1) {
            t(i2, i3, i4, i5);
        } else {
            s(i2, i3, i4, i5);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        if (this.f421h == 1) {
            x(i2, i3);
        } else {
            v(i2, i3);
        }
    }

    int p(View view) {
        return 0;
    }

    View q(int i2) {
        return getChildAt(i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean r(int i2) {
        if (i2 == 0) {
            return (this.r & 1) != 0;
        }
        if (i2 == getChildCount()) {
            return (this.r & 4) != 0;
        }
        if ((this.r & 2) == 0) {
            return false;
        }
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            if (getChildAt(i3).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void s(int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean b = d1.b(this);
        int paddingTop = getPaddingTop();
        int i15 = i5 - i3;
        int paddingBottom = i15 - getPaddingBottom();
        int paddingBottom2 = (i15 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i16 = this.f422i;
        int i17 = i16 & 112;
        boolean z = this.f418e;
        int[] iArr = this.m;
        int[] iArr2 = this.n;
        int a2 = e.a(8388615 & i16, u.o(this));
        int paddingLeft = a2 != 1 ? a2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i4) - i2) - this.f423j : getPaddingLeft() + (((i4 - i2) - this.f423j) / 2);
        if (b) {
            i7 = virtualChildCount - 1;
            i6 = -1;
        } else {
            i7 = 0;
            i6 = 1;
        }
        int i18 = 0;
        while (i18 < virtualChildCount) {
            int i19 = i7 + (i6 * i18);
            View q = q(i19);
            if (q == null) {
                paddingLeft += w(i19);
            } else if (q.getVisibility() != 8) {
                int measuredWidth = q.getMeasuredWidth();
                int measuredHeight = q.getMeasuredHeight();
                a aVar = (a) q.getLayoutParams();
                int i20 = i18;
                if (z) {
                    i10 = virtualChildCount;
                    if (((LinearLayout.LayoutParams) aVar).height != -1) {
                        i11 = q.getBaseline();
                        i12 = ((LinearLayout.LayoutParams) aVar).gravity;
                        if (i12 < 0) {
                            i12 = i17;
                        }
                        i13 = i12 & 112;
                        i9 = i17;
                        if (i13 != 16) {
                            i14 = ((((paddingBottom2 - measuredHeight) / 2) + paddingTop) + ((LinearLayout.LayoutParams) aVar).topMargin) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                        } else if (i13 == 48) {
                            i14 = ((LinearLayout.LayoutParams) aVar).topMargin + paddingTop;
                            if (i11 != -1) {
                                i14 += iArr[1] - i11;
                            }
                        } else if (i13 != 80) {
                            i14 = paddingTop;
                        } else {
                            i14 = (paddingBottom - measuredHeight) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                            if (i11 != -1) {
                                i14 -= iArr2[2] - (q.getMeasuredHeight() - i11);
                            }
                        }
                        if (r(i19)) {
                            paddingLeft += this.p;
                        }
                        int i21 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                        i8 = paddingTop;
                        y(q, i21 + o(q), i14, measuredWidth, measuredHeight);
                        paddingLeft = i21 + measuredWidth + ((LinearLayout.LayoutParams) aVar).rightMargin + p(q);
                        i18 = i20 + n(q, i19);
                        i18++;
                        virtualChildCount = i10;
                        i17 = i9;
                        paddingTop = i8;
                    }
                } else {
                    i10 = virtualChildCount;
                }
                i11 = -1;
                i12 = ((LinearLayout.LayoutParams) aVar).gravity;
                if (i12 < 0) {
                }
                i13 = i12 & 112;
                i9 = i17;
                if (i13 != 16) {
                }
                if (r(i19)) {
                }
                int i212 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                i8 = paddingTop;
                y(q, i212 + o(q), i14, measuredWidth, measuredHeight);
                paddingLeft = i212 + measuredWidth + ((LinearLayout.LayoutParams) aVar).rightMargin + p(q);
                i18 = i20 + n(q, i19);
                i18++;
                virtualChildCount = i10;
                i17 = i9;
                paddingTop = i8;
            }
            i8 = paddingTop;
            i10 = virtualChildCount;
            i9 = i17;
            i18++;
            virtualChildCount = i10;
            i17 = i9;
            paddingTop = i8;
        }
    }

    public void setBaselineAligned(boolean z) {
        this.f418e = z;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 < 0 || i2 >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.f419f = i2;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.o) {
            this.o = drawable;
            boolean z = false;
            if (drawable != null) {
                this.p = drawable.getIntrinsicWidth();
                this.q = drawable.getIntrinsicHeight();
            } else {
                this.p = 0;
                this.q = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i2) {
        this.s = i2;
    }

    public void setGravity(int i2) {
        if (this.f422i != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f422i = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        int i4 = this.f422i;
        if ((8388615 & i4) != i3) {
            this.f422i = i3 | ((-8388616) & i4);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.l = z;
    }

    public void setOrientation(int i2) {
        if (this.f421h != i2) {
            this.f421h = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.r) {
            requestLayout();
        }
        this.r = i2;
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & 112;
        int i4 = this.f422i;
        if ((i4 & 112) != i3) {
            this.f422i = i3 | (i4 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.f424k = Math.max(0.0f, f2);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void t(int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int paddingLeft = getPaddingLeft();
        int i8 = i4 - i2;
        int paddingRight = i8 - getPaddingRight();
        int paddingRight2 = (i8 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i9 = this.f422i;
        int i10 = i9 & 112;
        int i11 = i9 & 8388615;
        int paddingTop = i10 != 16 ? i10 != 80 ? getPaddingTop() : ((getPaddingTop() + i5) - i3) - this.f423j : getPaddingTop() + (((i5 - i3) - this.f423j) / 2);
        int i12 = 0;
        while (i12 < virtualChildCount) {
            View q = q(i12);
            if (q == null) {
                paddingTop += w(i12);
            } else if (q.getVisibility() != 8) {
                int measuredWidth = q.getMeasuredWidth();
                int measuredHeight = q.getMeasuredHeight();
                a aVar = (a) q.getLayoutParams();
                i11 = ((LinearLayout.LayoutParams) aVar).gravity;
                if (i11 < 0) {
                }
                int a2 = e.a(i11, u.o(this)) & 7;
                if (a2 == 1) {
                    i7 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) aVar).leftMargin;
                } else if (a2 != 5) {
                    i6 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                    int i13 = i6;
                    if (r(i12)) {
                        paddingTop += this.q;
                    }
                    int i14 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                    y(q, i13, i14 + o(q), measuredWidth, measuredHeight);
                    paddingTop = i14 + measuredHeight + ((LinearLayout.LayoutParams) aVar).bottomMargin + p(q);
                    i12 += n(q, i12);
                } else {
                    i7 = paddingRight - measuredWidth;
                }
                i6 = i7 - ((LinearLayout.LayoutParams) aVar).rightMargin;
                int i132 = i6;
                if (r(i12)) {
                }
                int i142 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                y(q, i132, i142 + o(q), measuredWidth, measuredHeight);
                paddingTop = i142 + measuredHeight + ((LinearLayout.LayoutParams) aVar).bottomMargin + p(q);
                i12 += n(q, i12);
            }
            i12++;
        }
    }

    void u(View view, int i2, int i3, int i4, int i5, int i6) {
        measureChildWithMargins(view, i3, i4, i5, i6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x03a1, code lost:
        if (r8 > 0) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x03ac, code lost:
        if (r8 < 0) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x03ae, code lost:
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x03af, code lost:
        r14.measure(android.view.View.MeasureSpec.makeMeasureSpec(r8, r3), r0);
        r9 = android.view.View.combineMeasuredStates(r9, r14.getMeasuredState() & (-16777216));
     */
    /* JADX WARN: Removed duplicated region for block: B:189:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void v(int i2, int i3) {
        int[] iArr;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        float f2;
        int i11;
        boolean z;
        int baseline;
        int i12;
        int i13;
        int i14;
        boolean z2;
        boolean z3;
        int i15;
        int i16;
        View view;
        int i17;
        boolean z4;
        int measuredHeight;
        int baseline2;
        int i18;
        int i19;
        int i20;
        this.f423j = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        if (this.m == null || this.n == null) {
            this.m = new int[4];
            this.n = new int[4];
        }
        int[] iArr2 = this.m;
        int[] iArr3 = this.n;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        iArr3[3] = -1;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        boolean z5 = this.f418e;
        boolean z6 = this.l;
        int i21 = 1073741824;
        boolean z7 = mode == 1073741824;
        float f3 = 0.0f;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        boolean z8 = false;
        int i27 = 0;
        boolean z9 = true;
        boolean z10 = false;
        while (true) {
            iArr = iArr3;
            if (i22 >= virtualChildCount) {
                break;
            }
            View q = q(i22);
            if (q == null) {
                this.f423j += w(i22);
            } else if (q.getVisibility() == 8) {
                i22 += n(q, i22);
            } else {
                if (r(i22)) {
                    this.f423j += this.p;
                }
                a aVar = (a) q.getLayoutParams();
                float f4 = ((LinearLayout.LayoutParams) aVar).weight;
                float f5 = f3 + f4;
                if (mode == i21 && ((LinearLayout.LayoutParams) aVar).width == 0 && f4 > 0.0f) {
                    int i28 = this.f423j;
                    this.f423j = z7 ? i28 + ((LinearLayout.LayoutParams) aVar).leftMargin + ((LinearLayout.LayoutParams) aVar).rightMargin : Math.max(i28, ((LinearLayout.LayoutParams) aVar).leftMargin + i28 + ((LinearLayout.LayoutParams) aVar).rightMargin);
                    if (z5) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        q.measure(makeMeasureSpec, makeMeasureSpec);
                        i16 = i22;
                        z3 = z6;
                        z2 = z5;
                        view = q;
                    } else {
                        i16 = i22;
                        z3 = z6;
                        z2 = z5;
                        view = q;
                        i17 = 1073741824;
                        z8 = true;
                        if (mode2 == i17 && ((LinearLayout.LayoutParams) aVar).height == -1) {
                            z4 = true;
                            z10 = true;
                        } else {
                            z4 = false;
                        }
                        int i29 = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                        measuredHeight = view.getMeasuredHeight() + i29;
                        i27 = View.combineMeasuredStates(i27, view.getMeasuredState());
                        if (z2 && (baseline2 = view.getBaseline()) != -1) {
                            i18 = ((LinearLayout.LayoutParams) aVar).gravity;
                            if (i18 < 0) {
                                i18 = this.f422i;
                            }
                            int i30 = (((i18 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i30] = Math.max(iArr2[i30], baseline2);
                            iArr[i30] = Math.max(iArr[i30], measuredHeight - baseline2);
                        }
                        i24 = Math.max(i24, measuredHeight);
                        z9 = !z9 && ((LinearLayout.LayoutParams) aVar).height == -1;
                        if (((LinearLayout.LayoutParams) aVar).weight <= 0.0f) {
                            if (!z4) {
                                i29 = measuredHeight;
                            }
                            i26 = Math.max(i26, i29);
                        } else {
                            i26 = i26;
                            if (!z4) {
                                i29 = measuredHeight;
                            }
                            i25 = Math.max(i25, i29);
                        }
                        int i31 = i16;
                        i15 = n(view, i31) + i31;
                        f3 = f5;
                        i22 = i15 + 1;
                        iArr3 = iArr;
                        z6 = z3;
                        z5 = z2;
                        i21 = 1073741824;
                    }
                } else {
                    if (((LinearLayout.LayoutParams) aVar).width != 0 || f4 <= 0.0f) {
                        i19 = Integer.MIN_VALUE;
                    } else {
                        ((LinearLayout.LayoutParams) aVar).width = -2;
                        i19 = 0;
                    }
                    i16 = i22;
                    int i32 = i19;
                    z3 = z6;
                    z2 = z5;
                    u(q, i16, i2, f5 == 0.0f ? this.f423j : 0, i3, 0);
                    if (i32 != Integer.MIN_VALUE) {
                        ((LinearLayout.LayoutParams) aVar).width = i32;
                    }
                    int measuredWidth = q.getMeasuredWidth();
                    if (z7) {
                        view = q;
                        i20 = this.f423j + ((LinearLayout.LayoutParams) aVar).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) aVar).rightMargin + p(view);
                    } else {
                        view = q;
                        int i33 = this.f423j;
                        i20 = Math.max(i33, i33 + measuredWidth + ((LinearLayout.LayoutParams) aVar).leftMargin + ((LinearLayout.LayoutParams) aVar).rightMargin + p(view));
                    }
                    this.f423j = i20;
                    if (z3) {
                        i23 = Math.max(measuredWidth, i23);
                    }
                }
                i17 = 1073741824;
                if (mode2 == i17) {
                }
                z4 = false;
                int i292 = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                measuredHeight = view.getMeasuredHeight() + i292;
                i27 = View.combineMeasuredStates(i27, view.getMeasuredState());
                if (z2) {
                    i18 = ((LinearLayout.LayoutParams) aVar).gravity;
                    if (i18 < 0) {
                    }
                    int i302 = (((i18 & 112) >> 4) & (-2)) >> 1;
                    iArr2[i302] = Math.max(iArr2[i302], baseline2);
                    iArr[i302] = Math.max(iArr[i302], measuredHeight - baseline2);
                }
                i24 = Math.max(i24, measuredHeight);
                if (!z9) {
                }
                if (((LinearLayout.LayoutParams) aVar).weight <= 0.0f) {
                }
                int i312 = i16;
                i15 = n(view, i312) + i312;
                f3 = f5;
                i22 = i15 + 1;
                iArr3 = iArr;
                z6 = z3;
                z5 = z2;
                i21 = 1073741824;
            }
            i15 = i22;
            z3 = z6;
            z2 = z5;
            i22 = i15 + 1;
            iArr3 = iArr;
            z6 = z3;
            z5 = z2;
            i21 = 1073741824;
        }
        boolean z11 = z6;
        boolean z12 = z5;
        int i34 = i24;
        int i35 = i25;
        int i36 = i26;
        int i37 = i27;
        if (this.f423j > 0 && r(virtualChildCount)) {
            this.f423j += this.p;
        }
        if (iArr2[1] == -1 && iArr2[0] == -1 && iArr2[2] == -1 && iArr2[3] == -1) {
            i5 = i34;
            i4 = i37;
        } else {
            i4 = i37;
            i5 = Math.max(i34, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
        }
        if (z11 && (mode == Integer.MIN_VALUE || mode == 0)) {
            this.f423j = 0;
            int i38 = 0;
            while (i38 < virtualChildCount) {
                View q2 = q(i38);
                if (q2 == null) {
                    this.f423j += w(i38);
                } else if (q2.getVisibility() == 8) {
                    i38 += n(q2, i38);
                } else {
                    a aVar2 = (a) q2.getLayoutParams();
                    int i39 = this.f423j;
                    if (z7) {
                        this.f423j = i39 + ((LinearLayout.LayoutParams) aVar2).leftMargin + i23 + ((LinearLayout.LayoutParams) aVar2).rightMargin + p(q2);
                    } else {
                        i14 = i5;
                        this.f423j = Math.max(i39, i39 + i23 + ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin + p(q2));
                        i38++;
                        i5 = i14;
                    }
                }
                i14 = i5;
                i38++;
                i5 = i14;
            }
        }
        int i40 = i5;
        int paddingLeft = this.f423j + getPaddingLeft() + getPaddingRight();
        this.f423j = paddingLeft;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i2, 0);
        int i41 = (16777215 & resolveSizeAndState) - this.f423j;
        if (z8 || (i41 != 0 && f3 > 0.0f)) {
            float f6 = this.f424k;
            if (f6 > 0.0f) {
                f3 = f6;
            }
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            this.f423j = 0;
            int i42 = i35;
            int i43 = i4;
            int i44 = -1;
            int i45 = 0;
            while (i45 < virtualChildCount) {
                View q3 = q(i45);
                if (q3 == null || q3.getVisibility() == 8) {
                    i10 = i41;
                    i9 = virtualChildCount;
                } else {
                    a aVar3 = (a) q3.getLayoutParams();
                    float f7 = ((LinearLayout.LayoutParams) aVar3).weight;
                    if (f7 > 0.0f) {
                        int i46 = (int) ((i41 * f7) / f3);
                        f3 -= f7;
                        i10 = i41 - i46;
                        i9 = virtualChildCount;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin, ((LinearLayout.LayoutParams) aVar3).height);
                        if (((LinearLayout.LayoutParams) aVar3).width == 0) {
                            i13 = 1073741824;
                            if (mode == 1073741824) {
                            }
                        } else {
                            i13 = 1073741824;
                        }
                        i46 = q3.getMeasuredWidth() + i46;
                    } else {
                        i10 = i41;
                        i9 = virtualChildCount;
                    }
                    int i47 = this.f423j;
                    if (z7) {
                        this.f423j = i47 + q3.getMeasuredWidth() + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin + p(q3);
                        f2 = f3;
                    } else {
                        f2 = f3;
                        this.f423j = Math.max(i47, q3.getMeasuredWidth() + i47 + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin + p(q3));
                    }
                    boolean z13 = mode2 != 1073741824 && ((LinearLayout.LayoutParams) aVar3).height == -1;
                    int i48 = ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin;
                    int measuredHeight2 = q3.getMeasuredHeight() + i48;
                    i44 = Math.max(i44, measuredHeight2);
                    if (!z13) {
                        i48 = measuredHeight2;
                    }
                    i42 = Math.max(i42, i48);
                    if (z9) {
                        i11 = -1;
                        if (((LinearLayout.LayoutParams) aVar3).height == -1) {
                            z = true;
                            if (z12 && (baseline = q3.getBaseline()) != i11) {
                                i12 = ((LinearLayout.LayoutParams) aVar3).gravity;
                                if (i12 < 0) {
                                    i12 = this.f422i;
                                }
                                int i49 = (((i12 & 112) >> 4) & (-2)) >> 1;
                                iArr2[i49] = Math.max(iArr2[i49], baseline);
                                iArr[i49] = Math.max(iArr[i49], measuredHeight2 - baseline);
                            }
                            z9 = z;
                            f3 = f2;
                        }
                    } else {
                        i11 = -1;
                    }
                    z = false;
                    if (z12) {
                        i12 = ((LinearLayout.LayoutParams) aVar3).gravity;
                        if (i12 < 0) {
                        }
                        int i492 = (((i12 & 112) >> 4) & (-2)) >> 1;
                        iArr2[i492] = Math.max(iArr2[i492], baseline);
                        iArr[i492] = Math.max(iArr[i492], measuredHeight2 - baseline);
                    }
                    z9 = z;
                    f3 = f2;
                }
                i45++;
                i41 = i10;
                virtualChildCount = i9;
            }
            i7 = i3;
            i6 = virtualChildCount;
            this.f423j += getPaddingLeft() + getPaddingRight();
            i40 = (iArr2[1] == -1 && iArr2[0] == -1 && iArr2[2] == -1 && iArr2[3] == -1) ? i44 : Math.max(i44, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
            i8 = i42;
            i4 = i43;
        } else {
            i8 = Math.max(i35, i36);
            if (z11 && mode != 1073741824) {
                for (int i50 = 0; i50 < virtualChildCount; i50++) {
                    View q4 = q(i50);
                    if (!(q4 == null || q4.getVisibility() == 8 || ((LinearLayout.LayoutParams) ((a) q4.getLayoutParams())).weight <= 0.0f)) {
                        q4.measure(View.MeasureSpec.makeMeasureSpec(i23, 1073741824), View.MeasureSpec.makeMeasureSpec(q4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i7 = i3;
            i6 = virtualChildCount;
        }
        if (z9 || mode2 == 1073741824) {
            i8 = i40;
        }
        setMeasuredDimension(resolveSizeAndState | (i4 & (-16777216)), View.resolveSizeAndState(Math.max(i8 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i7, i4 << 16));
        if (z10) {
            i(i6, i2);
        }
    }

    int w(int i2) {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x02ce, code lost:
        if (r15 > 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02d9, code lost:
        if (r15 < 0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02db, code lost:
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02dc, code lost:
        r13.measure(r0, android.view.View.MeasureSpec.makeMeasureSpec(r15, r10));
        r1 = android.view.View.combineMeasuredStates(r1, r13.getMeasuredState() & (-256));
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0319  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void x(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        int i11;
        int max;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        View view;
        int i19;
        boolean z2;
        int i20;
        int i21;
        this.f423j = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int i22 = this.f419f;
        boolean z3 = this.l;
        float f2 = 0.0f;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        boolean z4 = false;
        boolean z5 = true;
        boolean z6 = false;
        while (true) {
            int i29 = 8;
            int i30 = i26;
            if (i28 < virtualChildCount) {
                View q = q(i28);
                if (q == null) {
                    this.f423j += w(i28);
                    i12 = virtualChildCount;
                    i13 = mode2;
                    i26 = i30;
                } else {
                    int i31 = i23;
                    if (q.getVisibility() == 8) {
                        i28 += n(q, i28);
                        i12 = virtualChildCount;
                        i26 = i30;
                        i23 = i31;
                        i13 = mode2;
                    } else {
                        if (r(i28)) {
                            this.f423j += this.q;
                        }
                        a aVar = (a) q.getLayoutParams();
                        float f3 = ((LinearLayout.LayoutParams) aVar).weight;
                        float f4 = f2 + f3;
                        if (mode2 == 1073741824 && ((LinearLayout.LayoutParams) aVar).height == 0 && f3 > 0.0f) {
                            int i32 = this.f423j;
                            i15 = i24;
                            this.f423j = Math.max(i32, ((LinearLayout.LayoutParams) aVar).topMargin + i32 + ((LinearLayout.LayoutParams) aVar).bottomMargin);
                            i19 = i25;
                            view = q;
                            i14 = i27;
                            i18 = i31;
                            z4 = true;
                            i12 = virtualChildCount;
                            i13 = mode2;
                            i16 = i30;
                            i17 = i28;
                        } else {
                            i15 = i24;
                            if (((LinearLayout.LayoutParams) aVar).height != 0 || f3 <= 0.0f) {
                                i21 = Integer.MIN_VALUE;
                            } else {
                                ((LinearLayout.LayoutParams) aVar).height = -2;
                                i21 = 0;
                            }
                            i18 = i31;
                            int i33 = i21;
                            int i34 = i25;
                            i12 = virtualChildCount;
                            i13 = mode2;
                            i16 = i30;
                            i14 = i27;
                            i17 = i28;
                            u(q, i28, i2, 0, i3, f4 == 0.0f ? this.f423j : 0);
                            if (i33 != Integer.MIN_VALUE) {
                                ((LinearLayout.LayoutParams) aVar).height = i33;
                            }
                            int measuredHeight = q.getMeasuredHeight();
                            int i35 = this.f423j;
                            view = q;
                            this.f423j = Math.max(i35, i35 + measuredHeight + ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin + p(view));
                            i19 = z3 ? Math.max(measuredHeight, i34) : i34;
                        }
                        if (i22 >= 0 && i22 == i17 + 1) {
                            this.f420g = this.f423j;
                        }
                        if (i17 >= i22 || ((LinearLayout.LayoutParams) aVar).weight <= 0.0f) {
                            if (mode == 1073741824 || ((LinearLayout.LayoutParams) aVar).width != -1) {
                                z2 = false;
                            } else {
                                z2 = true;
                                z6 = true;
                            }
                            int i36 = ((LinearLayout.LayoutParams) aVar).leftMargin + ((LinearLayout.LayoutParams) aVar).rightMargin;
                            int measuredWidth = view.getMeasuredWidth() + i36;
                            i24 = Math.max(i15, measuredWidth);
                            i23 = View.combineMeasuredStates(i18, view.getMeasuredState());
                            z5 = z5 && ((LinearLayout.LayoutParams) aVar).width == -1;
                            if (((LinearLayout.LayoutParams) aVar).weight > 0.0f) {
                                if (!z2) {
                                    i36 = measuredWidth;
                                }
                                i26 = Math.max(i16, i36);
                                i20 = i14;
                            } else {
                                if (!z2) {
                                    i36 = measuredWidth;
                                }
                                i20 = Math.max(i14, i36);
                                i26 = i16;
                            }
                            i28 = n(view, i17) + i17;
                            i25 = i19;
                            f2 = f4;
                            i27 = i20;
                        } else {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                    }
                }
                i28++;
                mode2 = i13;
                virtualChildCount = i12;
            } else {
                int i37 = i23;
                int i38 = i25;
                int i39 = i27;
                int i40 = virtualChildCount;
                int i41 = mode2;
                int i42 = i24;
                if (this.f423j > 0) {
                    i4 = i40;
                    if (r(i4)) {
                        this.f423j += this.q;
                    }
                } else {
                    i4 = i40;
                }
                if (z3 && (i41 == Integer.MIN_VALUE || i41 == 0)) {
                    this.f423j = 0;
                    int i43 = 0;
                    while (i43 < i4) {
                        View q2 = q(i43);
                        if (q2 == null) {
                            max = this.f423j + w(i43);
                        } else if (q2.getVisibility() == i29) {
                            i43 += n(q2, i43);
                            i43++;
                            i29 = 8;
                        } else {
                            a aVar2 = (a) q2.getLayoutParams();
                            int i44 = this.f423j;
                            max = Math.max(i44, i44 + i38 + ((LinearLayout.LayoutParams) aVar2).topMargin + ((LinearLayout.LayoutParams) aVar2).bottomMargin + p(q2));
                        }
                        this.f423j = max;
                        i43++;
                        i29 = 8;
                    }
                }
                int paddingTop = this.f423j + getPaddingTop() + getPaddingBottom();
                this.f423j = paddingTop;
                int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i3, 0);
                int i45 = (16777215 & resolveSizeAndState) - this.f423j;
                if (z4 || (i45 != 0 && f2 > 0.0f)) {
                    float f5 = this.f424k;
                    if (f5 > 0.0f) {
                        f2 = f5;
                    }
                    this.f423j = 0;
                    int i46 = i45;
                    int i47 = i39;
                    i6 = i37;
                    int i48 = 0;
                    while (i48 < i4) {
                        View q3 = q(i48);
                        if (q3.getVisibility() == 8) {
                            i8 = i46;
                        } else {
                            a aVar3 = (a) q3.getLayoutParams();
                            float f6 = ((LinearLayout.LayoutParams) aVar3).weight;
                            if (f6 > 0.0f) {
                                int i49 = (int) ((i46 * f6) / f2);
                                f2 -= f6;
                                i8 = i46 - i49;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin, ((LinearLayout.LayoutParams) aVar3).width);
                                if (((LinearLayout.LayoutParams) aVar3).height == 0) {
                                    i11 = 1073741824;
                                    if (i41 == 1073741824) {
                                    }
                                } else {
                                    i11 = 1073741824;
                                }
                                i49 = q3.getMeasuredHeight() + i49;
                            } else {
                                i8 = i46;
                            }
                            int i50 = ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin;
                            int measuredWidth2 = q3.getMeasuredWidth() + i50;
                            i42 = Math.max(i42, measuredWidth2);
                            f2 = f2;
                            if (mode != 1073741824) {
                                i9 = i6;
                                i10 = -1;
                                if (((LinearLayout.LayoutParams) aVar3).width == -1) {
                                    z = true;
                                    if (!z) {
                                        i50 = measuredWidth2;
                                    }
                                    i47 = Math.max(i47, i50);
                                    boolean z7 = !z5 && ((LinearLayout.LayoutParams) aVar3).width == i10;
                                    int i51 = this.f423j;
                                    this.f423j = Math.max(i51, q3.getMeasuredHeight() + i51 + ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin + p(q3));
                                    z5 = z7;
                                    i6 = i9;
                                }
                            } else {
                                i9 = i6;
                                i10 = -1;
                            }
                            z = false;
                            if (!z) {
                            }
                            i47 = Math.max(i47, i50);
                            if (!z5) {
                            }
                            int i512 = this.f423j;
                            this.f423j = Math.max(i512, q3.getMeasuredHeight() + i512 + ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin + p(q3));
                            z5 = z7;
                            i6 = i9;
                        }
                        i48++;
                        i46 = i8;
                    }
                    i5 = i2;
                    this.f423j += getPaddingTop() + getPaddingBottom();
                    i7 = i47;
                } else {
                    i7 = Math.max(i39, i30);
                    if (z3 && i41 != 1073741824) {
                        for (int i52 = 0; i52 < i4; i52++) {
                            View q4 = q(i52);
                            if (!(q4 == null || q4.getVisibility() == 8 || ((LinearLayout.LayoutParams) ((a) q4.getLayoutParams())).weight <= 0.0f)) {
                                q4.measure(View.MeasureSpec.makeMeasureSpec(q4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i38, 1073741824));
                            }
                        }
                    }
                    i5 = i2;
                    i6 = i37;
                }
                if (z5 || mode == 1073741824) {
                    i7 = i42;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(i7 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i5, i6), resolveSizeAndState);
                if (z6) {
                    j(i4, i3);
                    return;
                }
                return;
            }
        }
    }
}

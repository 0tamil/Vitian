package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.j0;
/* loaded from: classes.dex */
public class ActionMenuView extends j0 implements g.b, n {
    private boolean A;
    private int B;
    private int C;
    private int D;
    e E;
    private g t;
    private Context u;
    private int v;
    private boolean w;
    private androidx.appcompat.widget.c x;
    private m.a y;
    g.a z;

    /* loaded from: classes.dex */
    public interface a {
        boolean a();

        boolean b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements m.a {
        b() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void b(g gVar, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean c(g gVar) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends j0.a {
        @ViewDebug.ExportedProperty
        public boolean a;
        @ViewDebug.ExportedProperty
        public int b;
        @ViewDebug.ExportedProperty
        public int c;
        @ViewDebug.ExportedProperty

        /* renamed from: d  reason: collision with root package name */
        public boolean f290d;
        @ViewDebug.ExportedProperty

        /* renamed from: e  reason: collision with root package name */
        public boolean f291e;

        /* renamed from: f  reason: collision with root package name */
        boolean f292f;

        public c(int i2, int i3) {
            super(i2, i3);
            this.a = false;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.a = cVar.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d implements g.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(g gVar, MenuItem menuItem) {
            e eVar = ActionMenuView.this.E;
            return eVar != null && eVar.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(g gVar) {
            g.a aVar = ActionMenuView.this.z;
            if (aVar != null) {
                aVar.b(gVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.C = (int) (56.0f * f2);
        this.D = (int) (f2 * 4.0f);
        this.u = context;
        this.v = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int J(View view, int i2, int i3, int i4, int i5) {
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i4) - i5, View.MeasureSpec.getMode(i4));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = true;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.f();
        int i6 = 2;
        if (i3 <= 0 || (z2 && i3 < 2)) {
            i6 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i3 * i2, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i7 = measuredWidth / i2;
            if (measuredWidth % i2 != 0) {
                i7++;
            }
            if (!z2 || i7 >= 2) {
                i6 = i7;
            }
        }
        if (cVar.a || !z2) {
            z = false;
        }
        cVar.f290d = z;
        cVar.b = i6;
        view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i6, 1073741824), makeMeasureSpec);
        return i6;
    }

    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v8, types: [boolean, int] */
    private void K(int i2, int i3) {
        int i4;
        boolean z;
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        int i7;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, paddingTop, -2);
        int i8 = size - paddingLeft;
        int i9 = this.C;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = i9 + (i11 / i10);
        int childCount = getChildCount();
        int i13 = 0;
        boolean z4 = false;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        long j2 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            size2 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z5 = childAt instanceof ActionMenuItemView;
                int i18 = i14 + 1;
                if (z5) {
                    int i19 = this.D;
                    i7 = i18;
                    r14 = 0;
                    childAt.setPadding(i19, 0, i19, 0);
                } else {
                    i7 = i18;
                    r14 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f292f = r14;
                int i20 = r14 == true ? 1 : 0;
                int i21 = r14 == true ? 1 : 0;
                cVar.c = i20;
                cVar.b = r14;
                cVar.f290d = r14;
                ((LinearLayout.LayoutParams) cVar).leftMargin = r14;
                ((LinearLayout.LayoutParams) cVar).rightMargin = r14;
                cVar.f291e = z5 && ((ActionMenuItemView) childAt).f();
                int J = J(childAt, i12, cVar.a ? 1 : i10, childMeasureSpec, paddingTop);
                i15 = Math.max(i15, J);
                if (cVar.f290d) {
                    i16++;
                }
                if (cVar.a) {
                    z4 = true;
                }
                i10 -= J;
                i13 = Math.max(i13, childAt.getMeasuredHeight());
                if (J == 1) {
                    j2 |= 1 << i17;
                    i13 = i13;
                }
                i14 = i7;
            }
        }
        int i22 = size2;
        boolean z6 = z4 && i14 == 2;
        boolean z7 = false;
        while (i16 > 0 && i10 > 0) {
            int i23 = 0;
            int i24 = Integer.MAX_VALUE;
            long j3 = 0;
            for (int i25 = 0; i25 < childCount; i25++) {
                z7 = z7;
                c cVar2 = (c) getChildAt(i25).getLayoutParams();
                i13 = i13;
                if (cVar2.f290d) {
                    int i26 = cVar2.b;
                    if (i26 < i24) {
                        j3 = 1 << i25;
                        i24 = i26;
                        i23 = 1;
                    } else if (i26 == i24) {
                        j3 |= 1 << i25;
                        i23++;
                    }
                }
            }
            z = z7;
            i5 = i13;
            j2 |= j3;
            if (i23 > i10) {
                i6 = mode;
                i4 = i8;
                break;
            }
            int i27 = i24 + 1;
            int i28 = 0;
            while (i28 < childCount) {
                View childAt2 = getChildAt(i28);
                c cVar3 = (c) childAt2.getLayoutParams();
                i8 = i8;
                mode = mode;
                long j4 = 1 << i28;
                if ((j3 & j4) == 0) {
                    if (cVar3.b == i27) {
                        j2 |= j4;
                    }
                    z3 = z6;
                } else {
                    if (!z6 || !cVar3.f291e || i10 != 1) {
                        z3 = z6;
                    } else {
                        int i29 = this.D;
                        z3 = z6;
                        childAt2.setPadding(i29 + i12, 0, i29, 0);
                    }
                    cVar3.b++;
                    cVar3.f292f = true;
                    i10--;
                }
                i28++;
                z6 = z3;
            }
            i13 = i5;
            z7 = true;
        }
        i6 = mode;
        i4 = i8;
        z = z7;
        i5 = i13;
        boolean z8 = !z4 && i14 == 1;
        if (i10 <= 0 || j2 == 0 || (i10 >= i14 - 1 && !z8 && i15 <= 1)) {
            z2 = z;
        } else {
            float bitCount = Long.bitCount(j2);
            if (!z8) {
                if ((j2 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f291e) {
                    bitCount -= 0.5f;
                }
                int i30 = childCount - 1;
                if ((j2 & (1 << i30)) != 0 && !((c) getChildAt(i30).getLayoutParams()).f291e) {
                    bitCount -= 0.5f;
                }
            }
            int i31 = bitCount > 0.0f ? (int) ((i10 * i12) / bitCount) : 0;
            z2 = z;
            for (int i32 = 0; i32 < childCount; i32++) {
                if ((j2 & (1 << i32)) != 0) {
                    View childAt3 = getChildAt(i32);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.c = i31;
                        cVar4.f292f = true;
                        if (i32 == 0 && !cVar4.f291e) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = (-i31) / 2;
                        }
                    } else if (cVar4.a) {
                        cVar4.c = i31;
                        cVar4.f292f = true;
                        ((LinearLayout.LayoutParams) cVar4).rightMargin = (-i31) / 2;
                    } else {
                        if (i32 != 0) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = i31 / 2;
                        }
                        if (i32 != childCount - 1) {
                            ((LinearLayout.LayoutParams) cVar4).rightMargin = i31 / 2;
                        }
                    }
                    z2 = true;
                }
            }
        }
        if (z2) {
            for (int i33 = 0; i33 < childCount; i33++) {
                View childAt4 = getChildAt(i33);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f292f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.b * i12) + cVar5.c, 1073741824), childMeasureSpec);
                }
            }
        }
        if (i6 != 1073741824) {
            i22 = i5;
        }
        setMeasuredDimension(i4, i22);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A */
    public c k() {
        c cVar = new c(-2, -2);
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    /* renamed from: B */
    public c l(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: C */
    public c m(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return k();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) cVar).gravity = 16;
        }
        return cVar;
    }

    public c D() {
        c A = k();
        A.a = true;
        return A;
    }

    protected boolean E(int i2) {
        boolean z = false;
        if (i2 == 0) {
            return false;
        }
        View childAt = getChildAt(i2 - 1);
        View childAt2 = getChildAt(i2);
        if (i2 < getChildCount() && (childAt instanceof a)) {
            z = false | ((a) childAt).a();
        }
        return (i2 <= 0 || !(childAt2 instanceof a)) ? z : z | ((a) childAt2).b();
    }

    public boolean F() {
        androidx.appcompat.widget.c cVar = this.x;
        return cVar != null && cVar.B();
    }

    public boolean G() {
        androidx.appcompat.widget.c cVar = this.x;
        return cVar != null && cVar.D();
    }

    public boolean H() {
        androidx.appcompat.widget.c cVar = this.x;
        return cVar != null && cVar.E();
    }

    public boolean I() {
        return this.w;
    }

    public g L() {
        return this.t;
    }

    public void M(m.a aVar, g.a aVar2) {
        this.y = aVar;
        this.z = aVar2;
    }

    public boolean N() {
        androidx.appcompat.widget.c cVar = this.x;
        return cVar != null && cVar.K();
    }

    @Override // androidx.appcompat.view.menu.g.b
    public boolean a(i iVar) {
        return this.t.L(iVar, 0);
    }

    @Override // androidx.appcompat.view.menu.n
    public void b(g gVar) {
        this.t = gVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.j0, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.t == null) {
            Context context = getContext();
            g gVar = new g(context);
            this.t = gVar;
            gVar.R(new d());
            androidx.appcompat.widget.c cVar = new androidx.appcompat.widget.c(context);
            this.x = cVar;
            cVar.J(true);
            androidx.appcompat.widget.c cVar2 = this.x;
            m.a aVar = this.y;
            if (aVar == null) {
                aVar = new b();
            }
            cVar2.h(aVar);
            this.t.c(this.x, this.u);
            this.x.H(this);
        }
        return this.t;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.x.A();
    }

    public int getPopupTheme() {
        return this.v;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.c cVar = this.x;
        if (cVar != null) {
            cVar.j(false);
            if (this.x.E()) {
                this.x.B();
                this.x.K();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.j0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        if (!this.A) {
            super.onLayout(z, i2, i3, i4, i5);
            return;
        }
        int childCount = getChildCount();
        int i8 = (i5 - i3) / 2;
        int dividerWidth = getDividerWidth();
        int i9 = i4 - i2;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean b2 = d1.b(this);
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (E(i12)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b2) {
                        i6 = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        i7 = i6 + measuredWidth;
                    } else {
                        i7 = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        i6 = i7 - measuredWidth;
                    }
                    int i13 = i8 - (measuredHeight / 2);
                    childAt.layout(i6, i13, i7, measuredHeight + i13);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    E(i12);
                    i11++;
                }
            }
        }
        if (childCount == 1 && i10 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i14 = (i9 / 2) - (measuredWidth2 / 2);
            int i15 = i8 - (measuredHeight2 / 2);
            childAt2.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
            return;
        }
        int i16 = i11 - (i10 ^ 1);
        int max = Math.max(0, i16 > 0 ? paddingRight / i16 : 0);
        if (b2) {
            int width = getWidth() - getPaddingRight();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt3 = getChildAt(i17);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.a) {
                    int i18 = width - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i8 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width = i18 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt4 = getChildAt(i20);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.a) {
                int i21 = paddingLeft + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i8 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft = i21 + measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + max;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.j0, android.view.View
    public void onMeasure(int i2, int i3) {
        g gVar;
        boolean z = this.A;
        boolean z2 = View.MeasureSpec.getMode(i2) == 1073741824;
        this.A = z2;
        if (z != z2) {
            this.B = 0;
        }
        int size = View.MeasureSpec.getSize(i2);
        if (!(!this.A || (gVar = this.t) == null || size == this.B)) {
            this.B = size;
            gVar.K(true);
        }
        int childCount = getChildCount();
        if (!this.A || childCount <= 0) {
            for (int i4 = 0; i4 < childCount; i4++) {
                c cVar = (c) getChildAt(i4).getLayoutParams();
                ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
                ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
            }
            super.onMeasure(i2, i3);
            return;
        }
        K(i2, i3);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.x.G(z);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.E = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.x.I(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.w = z;
    }

    public void setPopupTheme(int i2) {
        if (this.v != i2) {
            this.v = i2;
            if (i2 == 0) {
                this.u = getContext();
            } else {
                this.u = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setPresenter(androidx.appcompat.widget.c cVar) {
        this.x = cVar;
        cVar.H(this);
    }

    public void z() {
        androidx.appcompat.widget.c cVar = this.x;
        if (cVar != null) {
            cVar.y();
        }
    }
}

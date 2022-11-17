package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.r;
import androidx.appcompat.widget.ActionMenuView;
import e.a.j;
import e.d.p.h;
import e.d.p.u;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    private int A;
    private CharSequence B;
    private CharSequence C;
    private ColorStateList D;
    private ColorStateList E;
    private boolean F;
    private boolean G;
    private final ArrayList<View> H;
    private final ArrayList<View> I;
    private final int[] J;
    f K;
    private final ActionMenuView.e L;
    private y0 M;
    private androidx.appcompat.widget.c N;
    private d O;
    private m.a P;
    private g.a Q;
    private boolean R;
    private final Runnable S;

    /* renamed from: e  reason: collision with root package name */
    private ActionMenuView f323e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f324f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f325g;

    /* renamed from: h  reason: collision with root package name */
    private ImageButton f326h;

    /* renamed from: i  reason: collision with root package name */
    private ImageView f327i;

    /* renamed from: j  reason: collision with root package name */
    private Drawable f328j;

    /* renamed from: k  reason: collision with root package name */
    private CharSequence f329k;
    ImageButton l;
    View m;
    private Context n;
    private int o;
    private int p;
    private int q;
    int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private p0 x;
    private int y;
    private int z;

    /* loaded from: classes.dex */
    class a implements ActionMenuView.e {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            f fVar = Toolbar.this.K;
            if (fVar != null) {
                return fVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.N();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d implements m {

        /* renamed from: e  reason: collision with root package name */
        androidx.appcompat.view.menu.g f332e;

        /* renamed from: f  reason: collision with root package name */
        i f333f;

        d() {
        }

        @Override // androidx.appcompat.view.menu.m
        public void b(androidx.appcompat.view.menu.g gVar, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean d() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.m
        public void e(Context context, androidx.appcompat.view.menu.g gVar) {
            i iVar;
            androidx.appcompat.view.menu.g gVar2 = this.f332e;
            if (!(gVar2 == null || (iVar = this.f333f) == null)) {
                gVar2.f(iVar);
            }
            this.f332e = gVar;
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean f(androidx.appcompat.view.menu.g gVar, i iVar) {
            View view = Toolbar.this.m;
            if (view instanceof e.a.n.c) {
                ((e.a.n.c) view).d();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.m);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.l);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.m = null;
            toolbar3.a();
            this.f333f = null;
            Toolbar.this.requestLayout();
            iVar.r(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean g(androidx.appcompat.view.menu.g gVar, i iVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.l.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.l);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.l);
            }
            Toolbar.this.m = iVar.getActionView();
            this.f333f = iVar;
            ViewParent parent2 = Toolbar.this.m.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.m);
                }
                e m = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                m.a = 8388611 | (toolbar4.r & 112);
                m.b = 2;
                toolbar4.m.setLayoutParams(m);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.m);
            }
            Toolbar.this.G();
            Toolbar.this.requestLayout();
            iVar.r(true);
            View view = Toolbar.this.m;
            if (view instanceof e.a.n.c) {
                ((e.a.n.c) view).c();
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean i(r rVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.m
        public void j(boolean z) {
            if (this.f333f != null) {
                androidx.appcompat.view.menu.g gVar = this.f332e;
                boolean z2 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        } else if (this.f332e.getItem(i2) == this.f333f) {
                            z2 = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                if (!z2) {
                    f(this.f332e, this.f333f);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class e extends a.C0008a {
        int b;

        public e(int i2, int i3) {
            super(i2, i3);
            this.b = 0;
            this.a = 8388627;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = 0;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = 0;
            a(marginLayoutParams);
        }

        public e(a.C0008a aVar) {
            super(aVar);
            this.b = 0;
        }

        public e(e eVar) {
            super((a.C0008a) eVar);
            this.b = 0;
            this.b = eVar.b;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* loaded from: classes.dex */
    public static class g extends e.f.a.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        int f335g;

        /* renamed from: h  reason: collision with root package name */
        boolean f336h;

        /* loaded from: classes.dex */
        class a implements Parcelable.ClassLoaderCreator<g> {
            a() {
            }

            /* renamed from: a */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            /* renamed from: b */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            /* renamed from: c */
            public g[] newArray(int i2) {
                return new g[i2];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f335g = parcel.readInt();
            this.f336h = parcel.readInt() != 0;
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // e.f.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f335g);
            parcel.writeInt(this.f336h ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.a.L);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.A = 8388627;
        this.H = new ArrayList<>();
        this.I = new ArrayList<>();
        this.J = new int[2];
        this.L = new a();
        this.S = new b();
        Context context2 = getContext();
        int[] iArr = j.E2;
        x0 u = x0.u(context2, attributeSet, iArr, i2, 0);
        u.I(this, context, iArr, attributeSet, u.q(), i2, 0);
        this.p = u.m(j.g3, 0);
        this.q = u.m(j.X2, 0);
        this.A = u.k(j.F2, this.A);
        this.r = u.k(j.G2, 48);
        int d2 = u.d(j.a3, 0);
        int i3 = j.f3;
        d2 = u.r(i3) ? u.d(i3, d2) : d2;
        this.w = d2;
        this.v = d2;
        this.u = d2;
        this.t = d2;
        int d3 = u.d(j.d3, -1);
        if (d3 >= 0) {
            this.t = d3;
        }
        int d4 = u.d(j.c3, -1);
        if (d4 >= 0) {
            this.u = d4;
        }
        int d5 = u.d(j.e3, -1);
        if (d5 >= 0) {
            this.v = d5;
        }
        int d6 = u.d(j.b3, -1);
        if (d6 >= 0) {
            this.w = d6;
        }
        this.s = u.e(j.R2, -1);
        int d7 = u.d(j.N2, Integer.MIN_VALUE);
        int d8 = u.d(j.J2, Integer.MIN_VALUE);
        int e2 = u.e(j.L2, 0);
        int e3 = u.e(j.M2, 0);
        h();
        this.x.e(e2, e3);
        if (!(d7 == Integer.MIN_VALUE && d8 == Integer.MIN_VALUE)) {
            this.x.g(d7, d8);
        }
        this.y = u.d(j.O2, Integer.MIN_VALUE);
        this.z = u.d(j.K2, Integer.MIN_VALUE);
        this.f328j = u.f(j.I2);
        this.f329k = u.o(j.H2);
        CharSequence o = u.o(j.Z2);
        if (!TextUtils.isEmpty(o)) {
            setTitle(o);
        }
        CharSequence o2 = u.o(j.W2);
        if (!TextUtils.isEmpty(o2)) {
            setSubtitle(o2);
        }
        this.n = getContext();
        setPopupTheme(u.m(j.V2, 0));
        Drawable f2 = u.f(j.U2);
        if (f2 != null) {
            setNavigationIcon(f2);
        }
        CharSequence o3 = u.o(j.T2);
        if (!TextUtils.isEmpty(o3)) {
            setNavigationContentDescription(o3);
        }
        Drawable f3 = u.f(j.P2);
        if (f3 != null) {
            setLogo(f3);
        }
        CharSequence o4 = u.o(j.Q2);
        if (!TextUtils.isEmpty(o4)) {
            setLogoDescription(o4);
        }
        int i4 = j.h3;
        if (u.r(i4)) {
            setTitleTextColor(u.c(i4));
        }
        int i5 = j.Y2;
        if (u.r(i5)) {
            setSubtitleTextColor(u.c(i5));
        }
        int i6 = j.S2;
        if (u.r(i6)) {
            x(u.m(i6, 0));
        }
        u.v();
    }

    private int B(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - iArr[0];
        int max = i2 + Math.max(0, i4);
        iArr[0] = Math.max(0, -i4);
        int q = q(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, q, max + measuredWidth, view.getMeasuredHeight() + q);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
    }

    private int C(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - iArr[1];
        int max = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int q = q(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, q, max, view.getMeasuredHeight() + q);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    private int D(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i7);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + max + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void E(View view, int i2, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void F() {
        removeCallbacks(this.S);
        post(this.S);
    }

    private boolean L() {
        if (!this.R) {
            return false;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (M(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean M(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List<View> list, int i2) {
        boolean z = u.o(this) == 1;
        int childCount = getChildCount();
        int a2 = e.d.p.e.a(i2, u.o(this));
        list.clear();
        if (z) {
            for (int i3 = childCount - 1; i3 >= 0; i3--) {
                View childAt = getChildAt(i3);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.b == 0 && M(childAt) && p(eVar.a) == a2) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.b == 0 && M(childAt2) && p(eVar2.a) == a2) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        e m = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (e) layoutParams;
        m.b = 1;
        if (!z || this.m == null) {
            addView(view, m);
            return;
        }
        view.setLayoutParams(m);
        this.I.add(view);
    }

    private MenuInflater getMenuInflater() {
        return new e.a.n.g(getContext());
    }

    private void h() {
        if (this.x == null) {
            this.x = new p0();
        }
    }

    private void i() {
        if (this.f327i == null) {
            this.f327i = new o(getContext());
        }
    }

    private void j() {
        k();
        if (this.f323e.L() == null) {
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) this.f323e.getMenu();
            if (this.O == null) {
                this.O = new d();
            }
            this.f323e.setExpandedActionViewsExclusive(true);
            gVar.c(this.O, this.n);
        }
    }

    private void k() {
        if (this.f323e == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f323e = actionMenuView;
            actionMenuView.setPopupTheme(this.o);
            this.f323e.setOnMenuItemClickListener(this.L);
            this.f323e.M(this.P, this.Q);
            e m = generateDefaultLayoutParams();
            m.a = 8388613 | (this.r & 112);
            this.f323e.setLayoutParams(m);
            c(this.f323e, false);
        }
    }

    private void l() {
        if (this.f326h == null) {
            this.f326h = new m(getContext(), null, e.a.a.K);
            e m = generateDefaultLayoutParams();
            m.a = 8388611 | (this.r & 112);
            this.f326h.setLayoutParams(m);
        }
    }

    private int p(int i2) {
        int o = u.o(this);
        int a2 = e.d.p.e.a(i2, o) & 7;
        return (a2 == 1 || a2 == 3 || a2 == 5) ? a2 : o == 1 ? 5 : 3;
    }

    private int q(View view, int i2) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int r = r(eVar.a);
        if (r == 48) {
            return getPaddingTop() - i3;
        }
        if (r == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            if (i6 < i7) {
                i4 = Math.max(0, i4 - (i7 - i6));
            }
        }
        return paddingTop + i4;
    }

    private int r(int i2) {
        int i3 = i2 & 112;
        return (i3 == 16 || i3 == 48 || i3 == 80) ? i3 : this.A & 112;
    }

    private int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return h.b(marginLayoutParams) + h.a(marginLayoutParams);
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int u(List<View> list, int[] iArr) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int size = list.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            View view = list.get(i5);
            e eVar = (e) view.getLayoutParams();
            int i6 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - i2;
            int i7 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - i3;
            int max = Math.max(0, i6);
            int max2 = Math.max(0, i7);
            i2 = Math.max(0, -i6);
            i3 = Math.max(0, -i7);
            i4 += max + view.getMeasuredWidth() + max2;
        }
        return i4;
    }

    private boolean y(View view) {
        return view.getParent() == this || this.I.contains(view);
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f323e;
        return actionMenuView != null && actionMenuView.H();
    }

    void G() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((e) childAt.getLayoutParams()).b == 2 || childAt == this.f323e)) {
                removeViewAt(childCount);
                this.I.add(childAt);
            }
        }
    }

    public void H(int i2, int i3) {
        h();
        this.x.g(i2, i3);
    }

    public void I(androidx.appcompat.view.menu.g gVar, androidx.appcompat.widget.c cVar) {
        if (gVar != null || this.f323e != null) {
            k();
            androidx.appcompat.view.menu.g L = this.f323e.L();
            if (L != gVar) {
                if (L != null) {
                    L.O(this.N);
                    L.O(this.O);
                }
                if (this.O == null) {
                    this.O = new d();
                }
                cVar.G(true);
                if (gVar != null) {
                    gVar.c(cVar, this.n);
                    gVar.c(this.O, this.n);
                } else {
                    cVar.e(this.n, null);
                    this.O.e(this.n, null);
                    cVar.j(true);
                    this.O.j(true);
                }
                this.f323e.setPopupTheme(this.o);
                this.f323e.setPresenter(cVar);
                this.N = cVar;
            }
        }
    }

    public void J(Context context, int i2) {
        this.q = i2;
        TextView textView = this.f325g;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public void K(Context context, int i2) {
        this.p = i2;
        TextView textView = this.f324f;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public boolean N() {
        ActionMenuView actionMenuView = this.f323e;
        return actionMenuView != null && actionMenuView.N();
    }

    void a() {
        for (int size = this.I.size() - 1; size >= 0; size--) {
            addView(this.I.get(size));
        }
        this.I.clear();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f323e) != null && actionMenuView.I();
    }

    public void e() {
        d dVar = this.O;
        i iVar = dVar == null ? null : dVar.f333f;
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f323e;
        if (actionMenuView != null) {
            actionMenuView.z();
        }
    }

    void g() {
        if (this.l == null) {
            m mVar = new m(getContext(), null, e.a.a.K);
            this.l = mVar;
            mVar.setImageDrawable(this.f328j);
            this.l.setContentDescription(this.f329k);
            e m = generateDefaultLayoutParams();
            m.a = 8388611 | (this.r & 112);
            m.b = 2;
            this.l.setLayoutParams(m);
            this.l.setOnClickListener(new c());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.l;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.l;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        p0 p0Var = this.x;
        if (p0Var != null) {
            return p0Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.z;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        p0 p0Var = this.x;
        if (p0Var != null) {
            return p0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        p0 p0Var = this.x;
        if (p0Var != null) {
            return p0Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        p0 p0Var = this.x;
        if (p0Var != null) {
            return p0Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.y;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.g L;
        ActionMenuView actionMenuView = this.f323e;
        return actionMenuView != null && (L = actionMenuView.L()) != null && L.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.z, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return u.o(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return u.o(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.y, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f327i;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f327i;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f323e.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f326h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f326h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    androidx.appcompat.widget.c getOuterActionMenuPresenter() {
        return this.N;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f323e.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.n;
    }

    public int getPopupTheme() {
        return this.o;
    }

    public CharSequence getSubtitle() {
        return this.C;
    }

    final TextView getSubtitleTextView() {
        return this.f325g;
    }

    public CharSequence getTitle() {
        return this.B;
    }

    public int getTitleMarginBottom() {
        return this.w;
    }

    public int getTitleMarginEnd() {
        return this.u;
    }

    public int getTitleMarginStart() {
        return this.t;
    }

    public int getTitleMarginTop() {
        return this.v;
    }

    final TextView getTitleTextView() {
        return this.f324f;
    }

    public e0 getWrapper() {
        if (this.M == null) {
            this.M = new y0(this, true);
        }
        return this.M;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    /* renamed from: n */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof a.C0008a ? new e((a.C0008a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.S);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.G = false;
        }
        if (!this.G) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.G = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.G = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0299 A[LOOP:0: B:108:0x0297->B:109:0x0299, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02bb A[LOOP:1: B:111:0x02b9->B:112:0x02bb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02f4 A[LOOP:2: B:119:0x02f2->B:120:0x02f4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x021f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        boolean M;
        boolean M2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int size;
        int i14;
        int size2;
        int i15;
        int i16;
        int size3;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z2 = u.o(this) == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i25 = width - paddingRight;
        int[] iArr = this.J;
        iArr[1] = 0;
        iArr[0] = 0;
        int p = u.p(this);
        int min = p >= 0 ? Math.min(p, i5 - i3) : 0;
        if (M(this.f326h)) {
            ImageButton imageButton = this.f326h;
            if (z2) {
                i6 = C(imageButton, i25, iArr, min);
                i7 = paddingLeft;
                if (M(this.l)) {
                    ImageButton imageButton2 = this.l;
                    if (z2) {
                        i6 = C(imageButton2, i6, iArr, min);
                    } else {
                        i7 = B(imageButton2, i7, iArr, min);
                    }
                }
                if (M(this.f323e)) {
                    ActionMenuView actionMenuView = this.f323e;
                    if (z2) {
                        i7 = B(actionMenuView, i7, iArr, min);
                    } else {
                        i6 = C(actionMenuView, i6, iArr, min);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i7);
                iArr[1] = Math.max(0, currentContentInsetRight - (i25 - i6));
                int max = Math.max(i7, currentContentInsetLeft);
                int min2 = Math.min(i6, i25 - currentContentInsetRight);
                if (M(this.m)) {
                    View view = this.m;
                    if (z2) {
                        min2 = C(view, min2, iArr, min);
                    } else {
                        max = B(view, max, iArr, min);
                    }
                }
                if (M(this.f327i)) {
                    ImageView imageView = this.f327i;
                    if (z2) {
                        min2 = C(imageView, min2, iArr, min);
                    } else {
                        max = B(imageView, max, iArr, min);
                    }
                }
                M = M(this.f324f);
                M2 = M(this.f325g);
                if (!M) {
                    e eVar = (e) this.f324f.getLayoutParams();
                    i8 = paddingRight;
                    i9 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + this.f324f.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin + 0;
                } else {
                    i8 = paddingRight;
                    i9 = 0;
                }
                if (!M2) {
                    e eVar2 = (e) this.f325g.getLayoutParams();
                    i10 = width;
                    i9 += ((ViewGroup.MarginLayoutParams) eVar2).topMargin + this.f325g.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin;
                } else {
                    i10 = width;
                }
                if (!M || M2) {
                    TextView textView = !M ? this.f324f : this.f325g;
                    TextView textView2 = !M2 ? this.f325g : this.f324f;
                    e eVar3 = (e) textView.getLayoutParams();
                    e eVar4 = (e) textView2.getLayoutParams();
                    boolean z3 = (!M && this.f324f.getMeasuredWidth() > 0) || (M2 && this.f325g.getMeasuredWidth() > 0);
                    i17 = this.A & 112;
                    i12 = paddingLeft;
                    if (i17 != 48) {
                        i18 = max;
                        i11 = min;
                        i19 = getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar3).topMargin + this.v;
                    } else if (i17 != 80) {
                        int i26 = (((height - paddingTop) - paddingBottom) - i9) / 2;
                        int i27 = ((ViewGroup.MarginLayoutParams) eVar3).topMargin;
                        i11 = min;
                        int i28 = this.v;
                        i18 = max;
                        if (i26 < i27 + i28) {
                            i26 = i27 + i28;
                        } else {
                            int i29 = (((height - paddingBottom) - i9) - i26) - paddingTop;
                            int i30 = ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin;
                            int i31 = this.w;
                            if (i29 < i30 + i31) {
                                i26 = Math.max(0, i26 - ((((ViewGroup.MarginLayoutParams) eVar4).bottomMargin + i31) - i29));
                            }
                        }
                        i19 = paddingTop + i26;
                    } else {
                        i18 = max;
                        i11 = min;
                        i19 = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) eVar4).bottomMargin) - this.w) - i9;
                    }
                    if (!z2) {
                        int i32 = (z3 ? this.t : 0) - iArr[1];
                        min2 -= Math.max(0, i32);
                        iArr[1] = Math.max(0, -i32);
                        if (M) {
                            int measuredWidth = min2 - this.f324f.getMeasuredWidth();
                            int measuredHeight = this.f324f.getMeasuredHeight() + i19;
                            this.f324f.layout(measuredWidth, i19, min2, measuredHeight);
                            i23 = measuredWidth - this.u;
                            i19 = measuredHeight + ((ViewGroup.MarginLayoutParams) ((e) this.f324f.getLayoutParams())).bottomMargin;
                        } else {
                            i23 = min2;
                        }
                        if (M2) {
                            e eVar5 = (e) this.f325g.getLayoutParams();
                            int i33 = i19 + ((ViewGroup.MarginLayoutParams) eVar5).topMargin;
                            this.f325g.layout(min2 - this.f325g.getMeasuredWidth(), i33, min2, this.f325g.getMeasuredHeight() + i33);
                            i24 = min2 - this.u;
                            int i34 = ((ViewGroup.MarginLayoutParams) eVar5).bottomMargin;
                        } else {
                            i24 = min2;
                        }
                        if (z3) {
                            min2 = Math.min(i23, i24);
                        }
                        max = i18;
                    } else {
                        if (z3) {
                            i20 = this.t;
                            i13 = 0;
                        } else {
                            i13 = 0;
                            i20 = 0;
                        }
                        int i35 = i20 - iArr[i13];
                        max = i18 + Math.max(i13, i35);
                        iArr[i13] = Math.max(i13, -i35);
                        if (M) {
                            int measuredWidth2 = this.f324f.getMeasuredWidth() + max;
                            int measuredHeight2 = this.f324f.getMeasuredHeight() + i19;
                            this.f324f.layout(max, i19, measuredWidth2, measuredHeight2);
                            i21 = measuredWidth2 + this.u;
                            i19 = measuredHeight2 + ((ViewGroup.MarginLayoutParams) ((e) this.f324f.getLayoutParams())).bottomMargin;
                        } else {
                            i21 = max;
                        }
                        if (M2) {
                            e eVar6 = (e) this.f325g.getLayoutParams();
                            int i36 = i19 + ((ViewGroup.MarginLayoutParams) eVar6).topMargin;
                            int measuredWidth3 = this.f325g.getMeasuredWidth() + max;
                            this.f325g.layout(max, i36, measuredWidth3, this.f325g.getMeasuredHeight() + i36);
                            i22 = measuredWidth3 + this.u;
                            int i37 = ((ViewGroup.MarginLayoutParams) eVar6).bottomMargin;
                        } else {
                            i22 = max;
                        }
                        if (z3) {
                            max = Math.max(i21, i22);
                        }
                        b(this.H, 3);
                        size = this.H.size();
                        for (i14 = 0; i14 < size; i14++) {
                            max = B(this.H.get(i14), max, iArr, i11);
                        }
                        int i38 = i11;
                        b(this.H, 5);
                        size2 = this.H.size();
                        for (i15 = 0; i15 < size2; i15++) {
                            min2 = C(this.H.get(i15), min2, iArr, i38);
                        }
                        b(this.H, 1);
                        int u = u(this.H, iArr);
                        i16 = (i12 + (((i10 - i12) - i8) / 2)) - (u / 2);
                        int i39 = u + i16;
                        if (i16 >= max) {
                            max = i39 > min2 ? i16 - (i39 - min2) : i16;
                        }
                        size3 = this.H.size();
                        while (i13 < size3) {
                            max = B(this.H.get(i13), max, iArr, i38);
                            i13++;
                        }
                        this.H.clear();
                        return;
                    }
                } else {
                    i12 = paddingLeft;
                    i11 = min;
                }
                i13 = 0;
                b(this.H, 3);
                size = this.H.size();
                while (i14 < size) {
                }
                int i382 = i11;
                b(this.H, 5);
                size2 = this.H.size();
                while (i15 < size2) {
                }
                b(this.H, 1);
                int u2 = u(this.H, iArr);
                i16 = (i12 + (((i10 - i12) - i8) / 2)) - (u2 / 2);
                int i392 = u2 + i16;
                if (i16 >= max) {
                }
                size3 = this.H.size();
                while (i13 < size3) {
                }
                this.H.clear();
                return;
            }
            i7 = B(imageButton, paddingLeft, iArr, min);
        } else {
            i7 = paddingLeft;
        }
        i6 = i25;
        if (M(this.l)) {
        }
        if (M(this.f323e)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i7);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i25 - i6));
        int max2 = Math.max(i7, currentContentInsetLeft2);
        int min22 = Math.min(i6, i25 - currentContentInsetRight2);
        if (M(this.m)) {
        }
        if (M(this.f327i)) {
        }
        M = M(this.f324f);
        M2 = M(this.f325g);
        if (!M) {
        }
        if (!M2) {
        }
        if (!M) {
        }
        if (!M) {
        }
        if (!M2) {
        }
        e eVar32 = (e) textView.getLayoutParams();
        e eVar42 = (e) textView2.getLayoutParams();
        if (!M) {
        }
        i17 = this.A & 112;
        i12 = paddingLeft;
        if (i17 != 48) {
        }
        if (!z2) {
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        char c2;
        char c3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr = this.J;
        int i11 = 0;
        if (d1.b(this)) {
            c3 = 1;
            c2 = 0;
        } else {
            c3 = 0;
            c2 = 1;
        }
        if (M(this.f326h)) {
            E(this.f326h, i2, 0, i3, 0, this.s);
            i6 = this.f326h.getMeasuredWidth() + s(this.f326h);
            i5 = Math.max(0, this.f326h.getMeasuredHeight() + t(this.f326h));
            i4 = View.combineMeasuredStates(0, this.f326h.getMeasuredState());
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
        }
        if (M(this.l)) {
            E(this.l, i2, 0, i3, 0, this.s);
            i6 = this.l.getMeasuredWidth() + s(this.l);
            i5 = Math.max(i5, this.l.getMeasuredHeight() + t(this.l));
            i4 = View.combineMeasuredStates(i4, this.l.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i6);
        iArr[c3] = Math.max(0, currentContentInsetStart - i6);
        if (M(this.f323e)) {
            E(this.f323e, i2, max, i3, 0, this.s);
            i7 = this.f323e.getMeasuredWidth() + s(this.f323e);
            i5 = Math.max(i5, this.f323e.getMeasuredHeight() + t(this.f323e));
            i4 = View.combineMeasuredStates(i4, this.f323e.getMeasuredState());
        } else {
            i7 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i7);
        iArr[c2] = Math.max(0, currentContentInsetEnd - i7);
        if (M(this.m)) {
            max2 += D(this.m, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, this.m.getMeasuredHeight() + t(this.m));
            i4 = View.combineMeasuredStates(i4, this.m.getMeasuredState());
        }
        if (M(this.f327i)) {
            max2 += D(this.f327i, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, this.f327i.getMeasuredHeight() + t(this.f327i));
            i4 = View.combineMeasuredStates(i4, this.f327i.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((e) childAt.getLayoutParams()).b == 0 && M(childAt)) {
                max2 += D(childAt, i2, max2, i3, 0, iArr);
                i5 = Math.max(i5, childAt.getMeasuredHeight() + t(childAt));
                i4 = View.combineMeasuredStates(i4, childAt.getMeasuredState());
            }
        }
        int i13 = this.v + this.w;
        int i14 = this.t + this.u;
        if (M(this.f324f)) {
            D(this.f324f, i2, max2 + i14, i3, i13, iArr);
            i9 = this.f324f.getMeasuredWidth() + s(this.f324f);
            i8 = this.f324f.getMeasuredHeight() + t(this.f324f);
            i10 = View.combineMeasuredStates(i4, this.f324f.getMeasuredState());
        } else {
            i10 = i4;
            i9 = 0;
            i8 = 0;
        }
        if (M(this.f325g)) {
            i9 = Math.max(i9, D(this.f325g, i2, max2 + i14, i3, i8 + i13, iArr));
            i8 += this.f325g.getMeasuredHeight() + t(this.f325g);
            i10 = View.combineMeasuredStates(i10, this.f325g.getMeasuredState());
        }
        int max3 = Math.max(i5, i8);
        int paddingLeft = max2 + i9 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i2, (-16777216) & i10);
        i11 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i3, i10 << 16);
        if (!L()) {
        }
        setMeasuredDimension(resolveSizeAndState, i11);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        ActionMenuView actionMenuView = this.f323e;
        androidx.appcompat.view.menu.g L = actionMenuView != null ? actionMenuView.L() : null;
        int i2 = gVar.f335g;
        if (!(i2 == 0 || this.O == null || L == null || (findItem = L.findItem(i2)) == null)) {
            findItem.expandActionView();
        }
        if (gVar.f336h) {
            F();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i2);
        }
        h();
        p0 p0Var = this.x;
        boolean z = true;
        if (i2 != 1) {
            z = false;
        }
        p0Var.f(z);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        i iVar;
        g gVar = new g(super.onSaveInstanceState());
        d dVar = this.O;
        if (!(dVar == null || (iVar = dVar.f333f) == null)) {
            gVar.f335g = iVar.getItemId();
        }
        gVar.f336h = A();
        return gVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.F = false;
        }
        if (!this.F) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.F = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.F = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.l;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(e.a.k.a.a.d(getContext(), i2));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.l.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.l;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f328j);
        }
    }

    public void setCollapsible(boolean z) {
        this.R = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.z) {
            this.z = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.y) {
            this.y = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(e.a.k.a.a.d(getContext(), i2));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!y(this.f327i)) {
                c(this.f327i, true);
            }
        } else {
            ImageView imageView = this.f327i;
            if (imageView != null && y(imageView)) {
                removeView(this.f327i);
                this.I.remove(this.f327i);
            }
        }
        ImageView imageView2 = this.f327i;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f327i;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f326h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(e.a.k.a.a.d(getContext(), i2));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!y(this.f326h)) {
                c(this.f326h, true);
            }
        } else {
            ImageButton imageButton = this.f326h;
            if (imageButton != null && y(imageButton)) {
                removeView(this.f326h);
                this.I.remove(this.f326h);
            }
        }
        ImageButton imageButton2 = this.f326h;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f326h.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.K = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f323e.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.o != i2) {
            this.o = i2;
            if (i2 == 0) {
                this.n = getContext();
            } else {
                this.n = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f325g == null) {
                Context context = getContext();
                a0 a0Var = new a0(context);
                this.f325g = a0Var;
                a0Var.setSingleLine();
                this.f325g.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.q;
                if (i2 != 0) {
                    this.f325g.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.E;
                if (colorStateList != null) {
                    this.f325g.setTextColor(colorStateList);
                }
            }
            if (!y(this.f325g)) {
                c(this.f325g, true);
            }
        } else {
            TextView textView = this.f325g;
            if (textView != null && y(textView)) {
                removeView(this.f325g);
                this.I.remove(this.f325g);
            }
        }
        TextView textView2 = this.f325g;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.C = charSequence;
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.E = colorStateList;
        TextView textView = this.f325g;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f324f == null) {
                Context context = getContext();
                a0 a0Var = new a0(context);
                this.f324f = a0Var;
                a0Var.setSingleLine();
                this.f324f.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.p;
                if (i2 != 0) {
                    this.f324f.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.D;
                if (colorStateList != null) {
                    this.f324f.setTextColor(colorStateList);
                }
            }
            if (!y(this.f324f)) {
                c(this.f324f, true);
            }
        } else {
            TextView textView = this.f324f;
            if (textView != null && y(textView)) {
                removeView(this.f324f);
                this.I.remove(this.f324f);
            }
        }
        TextView textView2 = this.f324f;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.B = charSequence;
    }

    public void setTitleMarginBottom(int i2) {
        this.w = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.u = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.t = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.v = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.D = colorStateList;
        TextView textView = this.f324f;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public boolean v() {
        d dVar = this.O;
        return (dVar == null || dVar.f333f == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f323e;
        return actionMenuView != null && actionMenuView.F();
    }

    public void x(int i2) {
        getMenuInflater().inflate(i2, getMenu());
    }

    public boolean z() {
        ActionMenuView actionMenuView = this.f323e;
        return actionMenuView != null && actionMenuView.G();
    }
}

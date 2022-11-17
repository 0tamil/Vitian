package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.view.menu.r;
import androidx.appcompat.widget.ActionMenuView;
import e.d.p.b;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c extends androidx.appcompat.view.menu.b implements b.a {
    e A;
    a B;
    RunnableC0012c C;
    private b D;
    int F;
    d m;
    private Drawable n;
    private boolean o;
    private boolean p;
    private boolean q;
    private int r;
    private int s;
    private int t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private int y;
    private final SparseBooleanArray z = new SparseBooleanArray();
    final f E = new f();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a extends l {
        public a(Context context, r rVar, View view) {
            super(context, rVar, view, false, e.a.a.l);
            if (!((i) rVar.getItem()).l()) {
                View view2 = c.this.m;
                f(view2 == null ? (View) ((androidx.appcompat.view.menu.b) c.this).l : view2);
            }
            j(c.this.E);
        }

        @Override // androidx.appcompat.view.menu.l
        protected void e() {
            c cVar = c.this;
            cVar.B = null;
            cVar.F = 0;
            super.e();
        }
    }

    /* loaded from: classes.dex */
    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public p a() {
            a aVar = c.this.B;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0012c implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        private e f375e;

        public RunnableC0012c(e eVar) {
            this.f375e = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.b) c.this).f196g != null) {
                ((androidx.appcompat.view.menu.b) c.this).f196g.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.b) c.this).l;
            if (!(view == null || view.getWindowToken() == null || !this.f375e.m())) {
                c.this.A = this.f375e;
            }
            c.this.C = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d extends o implements ActionMenuView.a {

        /* loaded from: classes.dex */
        class a extends i0 {
            a(View view, c cVar) {
                super(view);
            }

            @Override // androidx.appcompat.widget.i0
            public p b() {
                e eVar = c.this.A;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // androidx.appcompat.widget.i0
            public boolean c() {
                c.this.K();
                return true;
            }

            @Override // androidx.appcompat.widget.i0
            public boolean d() {
                c cVar = c.this;
                if (cVar.C != null) {
                    return false;
                }
                cVar.B();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, e.a.a.f1919k);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            z0.a(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.K();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i2, int i3, int i4, int i5) {
            boolean frame = super.setFrame(i2, i3, i4, i5);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.a.k(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class e extends l {
        public e(Context context, g gVar, View view, boolean z) {
            super(context, gVar, view, z, e.a.a.l);
            h(8388613);
            j(c.this.E);
        }

        @Override // androidx.appcompat.view.menu.l
        protected void e() {
            if (((androidx.appcompat.view.menu.b) c.this).f196g != null) {
                ((androidx.appcompat.view.menu.b) c.this).f196g.close();
            }
            c.this.A = null;
            super.e();
        }
    }

    /* loaded from: classes.dex */
    private class f implements m.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void b(g gVar, boolean z) {
            if (gVar instanceof r) {
                gVar.D().e(false);
            }
            m.a m = c.this.m();
            if (m != null) {
                m.b(gVar, z);
            }
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean c(g gVar) {
            if (gVar == ((androidx.appcompat.view.menu.b) c.this).f196g) {
                return false;
            }
            c.this.F = ((r) gVar).getItem().getItemId();
            m.a m = c.this.m();
            if (m != null) {
                return m.c(gVar);
            }
            return false;
        }
    }

    public c(Context context) {
        super(context, e.a.g.c_res_0x7f0b0003, e.a.g.b_res_0x7f0b0002);
    }

    private View z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.l;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof n.a) && ((n.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable A() {
        d dVar = this.m;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.o) {
            return this.n;
        }
        return null;
    }

    public boolean B() {
        n nVar;
        RunnableC0012c cVar = this.C;
        if (cVar == null || (nVar = this.l) == null) {
            e eVar = this.A;
            if (eVar == null) {
                return false;
            }
            eVar.b();
            return true;
        }
        ((View) nVar).removeCallbacks(cVar);
        this.C = null;
        return true;
    }

    public boolean C() {
        a aVar = this.B;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean D() {
        return this.C != null || E();
    }

    public boolean E() {
        e eVar = this.A;
        return eVar != null && eVar.d();
    }

    public void F(Configuration configuration) {
        if (!this.u) {
            this.t = e.a.n.a.b(this.f195f).d();
        }
        g gVar = this.f196g;
        if (gVar != null) {
            gVar.K(true);
        }
    }

    public void G(boolean z) {
        this.x = z;
    }

    public void H(ActionMenuView actionMenuView) {
        this.l = actionMenuView;
        actionMenuView.b(this.f196g);
    }

    public void I(Drawable drawable) {
        d dVar = this.m;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.o = true;
        this.n = drawable;
    }

    public void J(boolean z) {
        this.p = z;
        this.q = true;
    }

    public boolean K() {
        g gVar;
        if (!this.p || E() || (gVar = this.f196g) == null || this.l == null || this.C != null || gVar.z().isEmpty()) {
            return false;
        }
        RunnableC0012c cVar = new RunnableC0012c(new e(this.f195f, this.f196g, this.m, true));
        this.C = cVar;
        ((View) this.l).post(cVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public void b(g gVar, boolean z) {
        y();
        super.b(gVar, z);
    }

    @Override // androidx.appcompat.view.menu.b
    public void c(i iVar, n.a aVar) {
        aVar.d(iVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.l);
        if (this.D == null) {
            this.D = new b();
        }
        actionMenuItemView.setPopupCallback(this.D);
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean d() {
        int i2;
        ArrayList<i> arrayList;
        int i3;
        int i4;
        int i5;
        c cVar = this;
        g gVar = cVar.f196g;
        View view = null;
        int i6 = 0;
        if (gVar != null) {
            arrayList = gVar.E();
            i2 = arrayList.size();
        } else {
            arrayList = null;
            i2 = 0;
        }
        int i7 = cVar.t;
        int i8 = cVar.s;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.l;
        boolean z = false;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i2; i11++) {
            i iVar = arrayList.get(i11);
            if (iVar.o()) {
                i9++;
            } else if (iVar.n()) {
                i10++;
            } else {
                z = true;
            }
            if (cVar.x && iVar.isActionViewExpanded()) {
                i7 = 0;
            }
        }
        if (cVar.p && (z || i10 + i9 > i7)) {
            i7--;
        }
        int i12 = i7 - i9;
        SparseBooleanArray sparseBooleanArray = cVar.z;
        sparseBooleanArray.clear();
        if (cVar.v) {
            int i13 = cVar.y;
            i3 = i8 / i13;
            i4 = i13 + ((i8 % i13) / i3);
        } else {
            i4 = 0;
            i3 = 0;
        }
        int i14 = 0;
        int i15 = 0;
        while (i14 < i2) {
            i iVar2 = arrayList.get(i14);
            if (iVar2.o()) {
                View n = cVar.n(iVar2, view, viewGroup);
                if (cVar.v) {
                    i3 -= ActionMenuView.J(n, i4, i3, makeMeasureSpec, i6);
                } else {
                    n.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = n.getMeasuredWidth();
                i8 -= measuredWidth;
                if (i15 == 0) {
                    i15 = measuredWidth;
                }
                int groupId = iVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                iVar2.u(true);
                i5 = i2;
            } else if (iVar2.n()) {
                int groupId2 = iVar2.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId2);
                boolean z3 = (i12 > 0 || z2) && i8 > 0 && (!cVar.v || i3 > 0);
                boolean z4 = z3;
                i5 = i2;
                if (z3) {
                    View n2 = cVar.n(iVar2, null, viewGroup);
                    if (cVar.v) {
                        int J = ActionMenuView.J(n2, i4, i3, makeMeasureSpec, 0);
                        i3 -= J;
                        if (J == 0) {
                            z4 = false;
                        }
                    } else {
                        n2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z5 = z4;
                    int measuredWidth2 = n2.getMeasuredWidth();
                    i8 -= measuredWidth2;
                    if (i15 == 0) {
                        i15 = measuredWidth2;
                    }
                    z3 = z5 & (!cVar.v ? i8 + i15 > 0 : i8 >= 0);
                }
                if (z3 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z2) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i16 = 0; i16 < i14; i16++) {
                        i iVar3 = arrayList.get(i16);
                        if (iVar3.getGroupId() == groupId2) {
                            if (iVar3.l()) {
                                i12++;
                            }
                            iVar3.u(false);
                        }
                    }
                }
                if (z3) {
                    i12--;
                }
                iVar2.u(z3);
            } else {
                i5 = i2;
                iVar2.u(false);
                i14++;
                view = null;
                cVar = this;
                i2 = i5;
                i6 = 0;
            }
            i14++;
            view = null;
            cVar = this;
            i2 = i5;
            i6 = 0;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public void e(Context context, g gVar) {
        super.e(context, gVar);
        Resources resources = context.getResources();
        e.a.n.a b2 = e.a.n.a.b(context);
        if (!this.q) {
            this.p = b2.h();
        }
        if (!this.w) {
            this.r = b2.c();
        }
        if (!this.u) {
            this.t = b2.d();
        }
        int i2 = this.r;
        if (this.p) {
            if (this.m == null) {
                d dVar = new d(this.f194e);
                this.m = dVar;
                if (this.o) {
                    dVar.setImageDrawable(this.n);
                    this.n = null;
                    this.o = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.m.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i2 -= this.m.getMeasuredWidth();
        } else {
            this.m = null;
        }
        this.s = i2;
        this.y = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public boolean i(r rVar) {
        boolean z = false;
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        r rVar2 = rVar;
        while (rVar2.e0() != this.f196g) {
            rVar2 = (r) rVar2.e0();
        }
        View z2 = z(rVar2.getItem());
        if (z2 == null) {
            return false;
        }
        rVar.getItem().getItemId();
        int size = rVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            MenuItem item = rVar.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i2++;
        }
        a aVar = new a(this.f195f, rVar, z2);
        this.B = aVar;
        aVar.g(z);
        this.B.k();
        super.i(rVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public void j(boolean z) {
        super.j(z);
        ((View) this.l).requestLayout();
        g gVar = this.f196g;
        boolean z2 = false;
        if (gVar != null) {
            ArrayList<i> s = gVar.s();
            int size = s.size();
            for (int i2 = 0; i2 < size; i2++) {
                e.d.p.b b2 = s.get(i2).b();
                if (b2 != null) {
                    b2.i(this);
                }
            }
        }
        g gVar2 = this.f196g;
        ArrayList<i> z3 = gVar2 != null ? gVar2.z() : null;
        if (this.p && z3 != null) {
            int size2 = z3.size();
            if (size2 == 1) {
                z2 = !z3.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        d dVar = this.m;
        if (z2) {
            if (dVar == null) {
                this.m = new d(this.f194e);
            }
            ViewGroup viewGroup = (ViewGroup) this.m.getParent();
            if (viewGroup != this.l) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.m);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.l;
                actionMenuView.addView(this.m, actionMenuView.D());
            }
        } else if (dVar != null) {
            ViewParent parent = dVar.getParent();
            n nVar = this.l;
            if (parent == nVar) {
                ((ViewGroup) nVar).removeView(this.m);
            }
        }
        ((ActionMenuView) this.l).setOverflowReserved(this.p);
    }

    @Override // androidx.appcompat.view.menu.b
    public boolean l(ViewGroup viewGroup, int i2) {
        if (viewGroup.getChildAt(i2) == this.m) {
            return false;
        }
        return super.l(viewGroup, i2);
    }

    @Override // androidx.appcompat.view.menu.b
    public View n(i iVar, View view, ViewGroup viewGroup) {
        View actionView = iVar.getActionView();
        if (actionView == null || iVar.j()) {
            actionView = super.n(iVar, view, viewGroup);
        }
        actionView.setVisibility(iVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.m(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.b
    public n o(ViewGroup viewGroup) {
        n nVar = this.l;
        n o = super.o(viewGroup);
        if (nVar != o) {
            ((ActionMenuView) o).setPresenter(this);
        }
        return o;
    }

    @Override // androidx.appcompat.view.menu.b
    public boolean q(int i2, i iVar) {
        return iVar.l();
    }

    public boolean y() {
        return B() | C();
    }
}

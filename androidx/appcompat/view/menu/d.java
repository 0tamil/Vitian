package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.l0;
import androidx.appcompat.widget.m0;
import e.a.g;
import e.d.p.e;
import e.d.p.u;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d extends k implements m, View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int F = g.f1932e;
    private boolean A;
    private m.a B;
    ViewTreeObserver C;
    private PopupWindow.OnDismissListener D;
    boolean E;

    /* renamed from: f  reason: collision with root package name */
    private final Context f201f;

    /* renamed from: g  reason: collision with root package name */
    private final int f202g;

    /* renamed from: h  reason: collision with root package name */
    private final int f203h;

    /* renamed from: i  reason: collision with root package name */
    private final int f204i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f205j;
    private View s;
    View t;
    private boolean v;
    private boolean w;
    private int x;
    private int y;
    private final List<g> l = new ArrayList();
    final List<C0010d> m = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener n = new a();
    private final View.OnAttachStateChangeListener o = new b();
    private final l0 p = new c();
    private int q = 0;
    private int r = 0;
    private boolean z = false;
    private int u = D();

    /* renamed from: k  reason: collision with root package name */
    final Handler f206k = new Handler();

    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (d.this.c() && d.this.m.size() > 0 && !d.this.m.get(0).a.x()) {
                View view = d.this.t;
                if (view == null || !view.isShown()) {
                    d.this.dismiss();
                    return;
                }
                for (C0010d dVar : d.this.m) {
                    dVar.a.a();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = d.this.C;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    d.this.C = view.getViewTreeObserver();
                }
                d dVar = d.this;
                dVar.C.removeGlobalOnLayoutListener(dVar.n);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* loaded from: classes.dex */
    class c implements l0 {

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C0010d f210e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ MenuItem f211f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ g f212g;

            a(C0010d dVar, MenuItem menuItem, g gVar) {
                this.f210e = dVar;
                this.f211f = menuItem;
                this.f212g = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0010d dVar = this.f210e;
                if (dVar != null) {
                    d.this.E = true;
                    dVar.b.e(false);
                    d.this.E = false;
                }
                if (this.f211f.isEnabled() && this.f211f.hasSubMenu()) {
                    this.f212g.L(this.f211f, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.l0
        public void f(g gVar, MenuItem menuItem) {
            C0010d dVar = null;
            d.this.f206k.removeCallbacksAndMessages(null);
            int size = d.this.m.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (gVar == d.this.m.get(i2).b) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 != -1) {
                int i3 = i2 + 1;
                if (i3 < d.this.m.size()) {
                    dVar = d.this.m.get(i3);
                }
                d.this.f206k.postAtTime(new a(dVar, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
            }
        }

        @Override // androidx.appcompat.widget.l0
        public void h(g gVar, MenuItem menuItem) {
            d.this.f206k.removeCallbacksAndMessages(gVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.view.menu.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0010d {
        public final m0 a;
        public final g b;
        public final int c;

        public C0010d(m0 m0Var, g gVar, int i2) {
            this.a = m0Var;
            this.b = gVar;
            this.c = i2;
        }

        public ListView a() {
            return this.a.k();
        }
    }

    public d(Context context, View view, int i2, int i3, boolean z) {
        this.f201f = context;
        this.s = view;
        this.f203h = i2;
        this.f204i = i3;
        this.f205j = z;
        Resources resources = context.getResources();
        this.f202g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(e.a.d.d_res_0x7f060017));
    }

    private int A(g gVar) {
        int size = this.m.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (gVar == this.m.get(i2).b) {
                return i2;
            }
        }
        return -1;
    }

    private MenuItem B(g gVar, g gVar2) {
        int size = gVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = gVar.getItem(i2);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View C(C0010d dVar, g gVar) {
        int i2;
        f fVar;
        int firstVisiblePosition;
        MenuItem B = B(dVar.b, gVar);
        if (B == null) {
            return null;
        }
        ListView a2 = dVar.a();
        ListAdapter adapter = a2.getAdapter();
        int i3 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i2 = headerViewListAdapter.getHeadersCount();
            fVar = (f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (f) adapter;
            i2 = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i3 >= count) {
                i3 = -1;
                break;
            } else if (B == fVar.getItem(i3)) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 != -1 && (firstVisiblePosition = (i3 + i2) - a2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a2.getChildCount()) {
            return a2.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int D() {
        return u.o(this.s) == 1 ? 0 : 1;
    }

    private int E(int i2) {
        List<C0010d> list = this.m;
        ListView a2 = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        a2.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.t.getWindowVisibleDisplayFrame(rect);
        return this.u == 1 ? (iArr[0] + a2.getWidth()) + i2 > rect.right ? 0 : 1 : iArr[0] - i2 < 0 ? 1 : 0;
    }

    private void F(g gVar) {
        View view;
        C0010d dVar;
        int i2;
        int i3;
        int i4;
        LayoutInflater from = LayoutInflater.from(this.f201f);
        f fVar = new f(gVar, from, this.f205j, F);
        if (!c() && this.z) {
            fVar.d(true);
        } else if (c()) {
            fVar.d(k.x(gVar));
        }
        int o = k.o(fVar, null, this.f201f, this.f202g);
        m0 z = z();
        z.o(fVar);
        z.B(o);
        z.C(this.r);
        if (this.m.size() > 0) {
            List<C0010d> list = this.m;
            dVar = list.get(list.size() - 1);
            view = C(dVar, gVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            z.Q(false);
            z.N(null);
            int E = E(o);
            boolean z2 = E == 1;
            this.u = E;
            if (Build.VERSION.SDK_INT >= 26) {
                z.z(view);
                i3 = 0;
                i2 = 0;
            } else {
                int[] iArr = new int[2];
                this.s.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.r & 7) == 5) {
                    iArr[0] = iArr[0] + this.s.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i2 = iArr2[0] - iArr[0];
                i3 = iArr2[1] - iArr[1];
            }
            if ((this.r & 5) == 5) {
                if (!z2) {
                    o = view.getWidth();
                    i4 = i2 - o;
                }
                i4 = i2 + o;
            } else {
                if (z2) {
                    o = view.getWidth();
                    i4 = i2 + o;
                }
                i4 = i2 - o;
            }
            z.b(i4);
            z.I(true);
            z.n(i3);
        } else {
            if (this.v) {
                z.b(this.x);
            }
            if (this.w) {
                z.n(this.y);
            }
            z.D(n());
        }
        this.m.add(new C0010d(z, gVar, this.u));
        z.a();
        ListView k2 = z.k();
        k2.setOnKeyListener(this);
        if (dVar == null && this.A && gVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(g.l, (ViewGroup) k2, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(gVar.x());
            k2.addHeaderView(frameLayout, null, false);
            z.a();
        }
    }

    private m0 z() {
        m0 m0Var = new m0(this.f201f, null, this.f203h, this.f204i);
        m0Var.P(this.p);
        m0Var.H(this);
        m0Var.G(this);
        m0Var.z(this.s);
        m0Var.C(this.r);
        m0Var.F(true);
        m0Var.E(2);
        return m0Var;
    }

    @Override // androidx.appcompat.view.menu.p
    public void a() {
        if (!c()) {
            for (g gVar : this.l) {
                F(gVar);
            }
            this.l.clear();
            View view = this.s;
            this.t = view;
            if (view != null) {
                boolean z = this.C == null;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.C = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.n);
                }
                this.t.addOnAttachStateChangeListener(this.o);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void b(g gVar, boolean z) {
        int A = A(gVar);
        if (A >= 0) {
            int i2 = A + 1;
            if (i2 < this.m.size()) {
                this.m.get(i2).b.e(false);
            }
            C0010d remove = this.m.remove(A);
            remove.b.O(this);
            if (this.E) {
                remove.a.O(null);
                remove.a.A(0);
            }
            remove.a.dismiss();
            int size = this.m.size();
            this.u = size > 0 ? this.m.get(size - 1).c : D();
            if (size == 0) {
                dismiss();
                m.a aVar = this.B;
                if (aVar != null) {
                    aVar.b(gVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.C;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.C.removeGlobalOnLayoutListener(this.n);
                    }
                    this.C = null;
                }
                this.t.removeOnAttachStateChangeListener(this.o);
                this.D.onDismiss();
            } else if (z) {
                this.m.get(0).b.e(false);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean c() {
        return this.m.size() > 0 && this.m.get(0).a.c();
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        int size = this.m.size();
        if (size > 0) {
            C0010d[] dVarArr = (C0010d[]) this.m.toArray(new C0010d[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                C0010d dVar = dVarArr[i2];
                if (dVar.a.c()) {
                    dVar.a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void h(m.a aVar) {
        this.B = aVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean i(r rVar) {
        for (C0010d dVar : this.m) {
            if (rVar == dVar.b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        l(rVar);
        m.a aVar = this.B;
        if (aVar != null) {
            aVar.c(rVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.m
    public void j(boolean z) {
        for (C0010d dVar : this.m) {
            k.y(dVar.a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView k() {
        if (this.m.isEmpty()) {
            return null;
        }
        List<C0010d> list = this.m;
        return list.get(list.size() - 1).a();
    }

    @Override // androidx.appcompat.view.menu.k
    public void l(g gVar) {
        gVar.c(this, this.f201f);
        if (c()) {
            F(gVar);
        } else {
            this.l.add(gVar);
        }
    }

    @Override // androidx.appcompat.view.menu.k
    protected boolean m() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        C0010d dVar;
        int size = this.m.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                dVar = null;
                break;
            }
            dVar = this.m.get(i2);
            if (!dVar.a.c()) {
                break;
            }
            i2++;
        }
        if (dVar != null) {
            dVar.b.e(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.k
    public void p(View view) {
        if (this.s != view) {
            this.s = view;
            this.r = e.a(this.q, u.o(view));
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void r(boolean z) {
        this.z = z;
    }

    @Override // androidx.appcompat.view.menu.k
    public void s(int i2) {
        if (this.q != i2) {
            this.q = i2;
            this.r = e.a(i2, u.o(this.s));
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void t(int i2) {
        this.v = true;
        this.x = i2;
    }

    @Override // androidx.appcompat.view.menu.k
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.D = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.k
    public void v(boolean z) {
        this.A = z;
    }

    @Override // androidx.appcompat.view.menu.k
    public void w(int i2) {
        this.w = true;
        this.y = i2;
    }
}

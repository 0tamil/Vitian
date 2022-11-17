package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.m0;
import e.a.d;
import e.a.g;
import e.d.p.u;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q extends k implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, m, View.OnKeyListener {
    private static final int z = g.m;

    /* renamed from: f  reason: collision with root package name */
    private final Context f264f;

    /* renamed from: g  reason: collision with root package name */
    private final g f265g;

    /* renamed from: h  reason: collision with root package name */
    private final f f266h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f267i;

    /* renamed from: j  reason: collision with root package name */
    private final int f268j;

    /* renamed from: k  reason: collision with root package name */
    private final int f269k;
    private final int l;
    final m0 m;
    private PopupWindow.OnDismissListener p;
    private View q;
    View r;
    private m.a s;
    ViewTreeObserver t;
    private boolean u;
    private boolean v;
    private int w;
    private boolean y;
    final ViewTreeObserver.OnGlobalLayoutListener n = new a();
    private final View.OnAttachStateChangeListener o = new b();
    private int x = 0;

    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (q.this.c() && !q.this.m.x()) {
                View view = q.this.r;
                if (view == null || !view.isShown()) {
                    q.this.dismiss();
                } else {
                    q.this.m.a();
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
            ViewTreeObserver viewTreeObserver = q.this.t;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    q.this.t = view.getViewTreeObserver();
                }
                q qVar = q.this;
                qVar.t.removeGlobalOnLayoutListener(qVar.n);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public q(Context context, g gVar, View view, int i2, int i3, boolean z2) {
        this.f264f = context;
        this.f265g = gVar;
        this.f267i = z2;
        this.f266h = new f(gVar, LayoutInflater.from(context), z2, z);
        this.f269k = i2;
        this.l = i3;
        Resources resources = context.getResources();
        this.f268j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(d.d_res_0x7f060017));
        this.q = view;
        this.m = new m0(context, null, i2, i3);
        gVar.c(this, context);
    }

    private boolean z() {
        View view;
        if (c()) {
            return true;
        }
        if (this.u || (view = this.q) == null) {
            return false;
        }
        this.r = view;
        this.m.G(this);
        this.m.H(this);
        this.m.F(true);
        View view2 = this.r;
        boolean z2 = this.t == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.t = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.n);
        }
        view2.addOnAttachStateChangeListener(this.o);
        this.m.z(view2);
        this.m.C(this.x);
        if (!this.v) {
            this.w = k.o(this.f266h, null, this.f264f, this.f268j);
            this.v = true;
        }
        this.m.B(this.w);
        this.m.E(2);
        this.m.D(n());
        this.m.a();
        ListView k2 = this.m.k();
        k2.setOnKeyListener(this);
        if (this.y && this.f265g.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f264f).inflate(g.l, (ViewGroup) k2, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f265g.x());
            }
            frameLayout.setEnabled(false);
            k2.addHeaderView(frameLayout, null, false);
        }
        this.m.o(this.f266h);
        this.m.a();
        return true;
    }

    @Override // androidx.appcompat.view.menu.p
    public void a() {
        if (!z()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void b(g gVar, boolean z2) {
        if (gVar == this.f265g) {
            dismiss();
            m.a aVar = this.s;
            if (aVar != null) {
                aVar.b(gVar, z2);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean c() {
        return !this.u && this.m.c();
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        if (c()) {
            this.m.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void h(m.a aVar) {
        this.s = aVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean i(r rVar) {
        if (rVar.hasVisibleItems()) {
            l lVar = new l(this.f264f, rVar, this.r, this.f267i, this.f269k, this.l);
            lVar.j(this.s);
            lVar.g(k.x(rVar));
            lVar.i(this.p);
            this.p = null;
            this.f265g.e(false);
            int d2 = this.m.d();
            int g2 = this.m.g();
            if ((Gravity.getAbsoluteGravity(this.x, u.o(this.q)) & 7) == 5) {
                d2 += this.q.getWidth();
            }
            if (lVar.n(d2, g2)) {
                m.a aVar = this.s;
                if (aVar == null) {
                    return true;
                }
                aVar.c(rVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void j(boolean z2) {
        this.v = false;
        f fVar = this.f266h;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView k() {
        return this.m.k();
    }

    @Override // androidx.appcompat.view.menu.k
    public void l(g gVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.u = true;
        this.f265g.close();
        ViewTreeObserver viewTreeObserver = this.t;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.t = this.r.getViewTreeObserver();
            }
            this.t.removeGlobalOnLayoutListener(this.n);
            this.t = null;
        }
        this.r.removeOnAttachStateChangeListener(this.o);
        PopupWindow.OnDismissListener onDismissListener = this.p;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.q = view;
    }

    @Override // androidx.appcompat.view.menu.k
    public void r(boolean z2) {
        this.f266h.d(z2);
    }

    @Override // androidx.appcompat.view.menu.k
    public void s(int i2) {
        this.x = i2;
    }

    @Override // androidx.appcompat.view.menu.k
    public void t(int i2) {
        this.m.b(i2);
    }

    @Override // androidx.appcompat.view.menu.k
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.p = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.k
    public void v(boolean z2) {
        this.y = z2;
    }

    @Override // androidx.appcompat.view.menu.k
    public void w(int i2) {
        this.m.n(i2);
    }
}

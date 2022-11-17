package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.Toolbar;
import e.a.e;
import e.a.f;
import e.a.h;
import e.a.j;
import e.d.p.a0;
import e.d.p.u;
import e.d.p.y;
/* loaded from: classes.dex */
public class y0 implements e0 {
    Toolbar a;
    private int b;
    private View c;

    /* renamed from: d  reason: collision with root package name */
    private View f515d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f516e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f517f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f518g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f519h;

    /* renamed from: i  reason: collision with root package name */
    CharSequence f520i;

    /* renamed from: j  reason: collision with root package name */
    private CharSequence f521j;

    /* renamed from: k  reason: collision with root package name */
    private CharSequence f522k;
    Window.Callback l;
    boolean m;
    private c n;
    private int o;
    private int p;
    private Drawable q;

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {

        /* renamed from: e  reason: collision with root package name */
        final androidx.appcompat.view.menu.a f523e;

        a() {
            this.f523e = new androidx.appcompat.view.menu.a(y0.this.a.getContext(), 0, 16908332, 0, 0, y0.this.f520i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            y0 y0Var = y0.this;
            Window.Callback callback = y0Var.l;
            if (callback != null && y0Var.m) {
                callback.onMenuItemSelected(0, this.f523e);
            }
        }
    }

    /* loaded from: classes.dex */
    class b extends a0 {
        private boolean a = false;
        final /* synthetic */ int b;

        b(int i2) {
            this.b = i2;
        }

        @Override // e.d.p.z
        public void a(View view) {
            if (!this.a) {
                y0.this.a.setVisibility(this.b);
            }
        }

        @Override // e.d.p.a0, e.d.p.z
        public void b(View view) {
            y0.this.a.setVisibility(0);
        }

        @Override // e.d.p.a0, e.d.p.z
        public void c(View view) {
            this.a = true;
        }
    }

    public y0(Toolbar toolbar, boolean z) {
        this(toolbar, z, h.a_res_0x7f0e0001, e.n);
    }

    public y0(Toolbar toolbar, boolean z, int i2, int i3) {
        Drawable drawable;
        this.o = 0;
        this.p = 0;
        this.a = toolbar;
        this.f520i = toolbar.getTitle();
        this.f521j = toolbar.getSubtitle();
        this.f519h = this.f520i != null;
        this.f518g = toolbar.getNavigationIcon();
        x0 u = x0.u(toolbar.getContext(), null, j.a, e.a.a.c, 0);
        this.q = u.f(j.l);
        if (z) {
            CharSequence o = u.o(j.r);
            if (!TextUtils.isEmpty(o)) {
                D(o);
            }
            CharSequence o2 = u.o(j.p);
            if (!TextUtils.isEmpty(o2)) {
                C(o2);
            }
            Drawable f2 = u.f(j.n);
            if (f2 != null) {
                y(f2);
            }
            Drawable f3 = u.f(j.m);
            if (f3 != null) {
                setIcon(f3);
            }
            if (this.f518g == null && (drawable = this.q) != null) {
                B(drawable);
            }
            u(u.j(j.f1944h, 0));
            int m = u.m(j.f1943g, 0);
            if (m != 0) {
                w(LayoutInflater.from(this.a.getContext()).inflate(m, (ViewGroup) this.a, false));
                u(this.b | 16);
            }
            int l = u.l(j.f1946j, 0);
            if (l > 0) {
                ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
                layoutParams.height = l;
                this.a.setLayoutParams(layoutParams);
            }
            int d2 = u.d(j.f1942f, -1);
            int d3 = u.d(j.f1941e, -1);
            if (d2 >= 0 || d3 >= 0) {
                this.a.H(Math.max(d2, 0), Math.max(d3, 0));
            }
            int m2 = u.m(j.s, 0);
            if (m2 != 0) {
                Toolbar toolbar2 = this.a;
                toolbar2.K(toolbar2.getContext(), m2);
            }
            int m3 = u.m(j.q, 0);
            if (m3 != 0) {
                Toolbar toolbar3 = this.a;
                toolbar3.J(toolbar3.getContext(), m3);
            }
            int m4 = u.m(j.o, 0);
            if (m4 != 0) {
                this.a.setPopupTheme(m4);
            }
        } else {
            this.b = v();
        }
        u.v();
        x(i2);
        this.f522k = this.a.getNavigationContentDescription();
        this.a.setNavigationOnClickListener(new a());
    }

    private void E(CharSequence charSequence) {
        this.f520i = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setTitle(charSequence);
        }
    }

    private void F() {
        if ((this.b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f522k)) {
            this.a.setNavigationContentDescription(this.p);
        } else {
            this.a.setNavigationContentDescription(this.f522k);
        }
    }

    private void G() {
        Drawable drawable;
        Toolbar toolbar;
        if ((this.b & 4) != 0) {
            toolbar = this.a;
            drawable = this.f518g;
            if (drawable == null) {
                drawable = this.q;
            }
        } else {
            toolbar = this.a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void H() {
        Drawable drawable;
        int i2 = this.b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) == 0 || (drawable = this.f517f) == null) {
            drawable = this.f516e;
        }
        this.a.setLogo(drawable);
    }

    private int v() {
        if (this.a.getNavigationIcon() == null) {
            return 11;
        }
        this.q = this.a.getNavigationIcon();
        return 15;
    }

    public void A(CharSequence charSequence) {
        this.f522k = charSequence;
        F();
    }

    public void B(Drawable drawable) {
        this.f518g = drawable;
        G();
    }

    public void C(CharSequence charSequence) {
        this.f521j = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setSubtitle(charSequence);
        }
    }

    public void D(CharSequence charSequence) {
        this.f519h = true;
        E(charSequence);
    }

    @Override // androidx.appcompat.widget.e0
    public void a(Menu menu, m.a aVar) {
        if (this.n == null) {
            c cVar = new c(this.a.getContext());
            this.n = cVar;
            cVar.p(f.g_res_0x7f080034);
        }
        this.n.h(aVar);
        this.a.I((g) menu, this.n);
    }

    @Override // androidx.appcompat.widget.e0
    public boolean b() {
        return this.a.z();
    }

    @Override // androidx.appcompat.widget.e0
    public boolean c() {
        return this.a.A();
    }

    @Override // androidx.appcompat.widget.e0
    public void collapseActionView() {
        this.a.e();
    }

    @Override // androidx.appcompat.widget.e0
    public boolean d() {
        return this.a.w();
    }

    @Override // androidx.appcompat.widget.e0
    public boolean e() {
        return this.a.N();
    }

    @Override // androidx.appcompat.widget.e0
    public void f() {
        this.m = true;
    }

    @Override // androidx.appcompat.widget.e0
    public boolean g() {
        return this.a.d();
    }

    @Override // androidx.appcompat.widget.e0
    public Context getContext() {
        return this.a.getContext();
    }

    @Override // androidx.appcompat.widget.e0
    public CharSequence getTitle() {
        return this.a.getTitle();
    }

    @Override // androidx.appcompat.widget.e0
    public void h() {
        this.a.f();
    }

    @Override // androidx.appcompat.widget.e0
    public int i() {
        return this.b;
    }

    @Override // androidx.appcompat.widget.e0
    public void j(int i2) {
        this.a.setVisibility(i2);
    }

    @Override // androidx.appcompat.widget.e0
    public void k(int i2) {
        y(i2 != 0 ? e.a.k.a.a.d(getContext(), i2) : null);
    }

    @Override // androidx.appcompat.widget.e0
    public void l(q0 q0Var) {
        View view = this.c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.a;
            if (parent == toolbar) {
                toolbar.removeView(this.c);
            }
        }
        this.c = q0Var;
        if (q0Var != null && this.o == 2) {
            this.a.addView(q0Var, 0);
            Toolbar.e eVar = (Toolbar.e) this.c.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) eVar).width = -2;
            ((ViewGroup.MarginLayoutParams) eVar).height = -2;
            eVar.a = 8388691;
            q0Var.setAllowCollapse(true);
        }
    }

    @Override // androidx.appcompat.widget.e0
    public ViewGroup m() {
        return this.a;
    }

    @Override // androidx.appcompat.widget.e0
    public void n(boolean z) {
    }

    @Override // androidx.appcompat.widget.e0
    public int o() {
        return this.o;
    }

    @Override // androidx.appcompat.widget.e0
    public y p(int i2, long j2) {
        y b2 = u.b(this.a);
        b2.a(i2 == 0 ? 1.0f : 0.0f);
        b2.d(j2);
        b2.f(new b(i2));
        return b2;
    }

    @Override // androidx.appcompat.widget.e0
    public void q() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.e0
    public boolean r() {
        return this.a.v();
    }

    @Override // androidx.appcompat.widget.e0
    public void s() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.e0
    public void setIcon(int i2) {
        setIcon(i2 != 0 ? e.a.k.a.a.d(getContext(), i2) : null);
    }

    @Override // androidx.appcompat.widget.e0
    public void setIcon(Drawable drawable) {
        this.f516e = drawable;
        H();
    }

    @Override // androidx.appcompat.widget.e0
    public void setWindowCallback(Window.Callback callback) {
        this.l = callback;
    }

    @Override // androidx.appcompat.widget.e0
    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f519h) {
            E(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.e0
    public void t(boolean z) {
        this.a.setCollapsible(z);
    }

    @Override // androidx.appcompat.widget.e0
    public void u(int i2) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i3 = this.b ^ i2;
        this.b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    F();
                }
                G();
            }
            if ((i3 & 3) != 0) {
                H();
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    this.a.setTitle(this.f520i);
                    toolbar = this.a;
                    charSequence = this.f521j;
                } else {
                    charSequence = null;
                    this.a.setTitle((CharSequence) null);
                    toolbar = this.a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i3 & 16) != 0 && (view = this.f515d) != null) {
                if ((i2 & 16) != 0) {
                    this.a.addView(view);
                } else {
                    this.a.removeView(view);
                }
            }
        }
    }

    public void w(View view) {
        View view2 = this.f515d;
        if (!(view2 == null || (this.b & 16) == 0)) {
            this.a.removeView(view2);
        }
        this.f515d = view;
        if (view != null && (this.b & 16) != 0) {
            this.a.addView(view);
        }
    }

    public void x(int i2) {
        if (i2 != this.p) {
            this.p = i2;
            if (TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
                z(this.p);
            }
        }
    }

    public void y(Drawable drawable) {
        this.f517f = drawable;
        H();
    }

    public void z(int i2) {
        A(i2 == 0 ? null : getContext().getString(i2));
    }
}

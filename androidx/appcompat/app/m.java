package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.e0;
import androidx.appcompat.widget.q0;
import e.a.f;
import e.a.j;
import e.a.n.b;
import e.a.n.h;
import e.d.p.a0;
import e.d.p.b0;
import e.d.p.u;
import e.d.p.y;
import e.d.p.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class m extends androidx.appcompat.app.a implements ActionBarOverlayLayout.d {
    private static final Interpolator B = new AccelerateInterpolator();
    private static final Interpolator C = new DecelerateInterpolator();
    Context a;
    private Context b;
    ActionBarOverlayLayout c;

    /* renamed from: d  reason: collision with root package name */
    ActionBarContainer f161d;

    /* renamed from: e  reason: collision with root package name */
    e0 f162e;

    /* renamed from: f  reason: collision with root package name */
    ActionBarContextView f163f;

    /* renamed from: g  reason: collision with root package name */
    View f164g;

    /* renamed from: h  reason: collision with root package name */
    q0 f165h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f166i;

    /* renamed from: j  reason: collision with root package name */
    d f167j;

    /* renamed from: k  reason: collision with root package name */
    e.a.n.b f168k;
    b.a l;
    private boolean m;
    private boolean o;
    boolean r;
    boolean s;
    private boolean t;
    h v;
    private boolean w;
    boolean x;
    private ArrayList<a.b> n = new ArrayList<>();
    private int p = 0;
    boolean q = true;
    private boolean u = true;
    final z y = new a();
    final z z = new b();
    final b0 A = new c();

    /* loaded from: classes.dex */
    class a extends a0 {
        a() {
        }

        @Override // e.d.p.z
        public void a(View view) {
            View view2;
            m mVar = m.this;
            if (mVar.q && (view2 = mVar.f164g) != null) {
                view2.setTranslationY(0.0f);
                m.this.f161d.setTranslationY(0.0f);
            }
            m.this.f161d.setVisibility(8);
            m.this.f161d.setTransitioning(false);
            m mVar2 = m.this;
            mVar2.v = null;
            mVar2.x();
            ActionBarOverlayLayout actionBarOverlayLayout = m.this.c;
            if (actionBarOverlayLayout != null) {
                u.H(actionBarOverlayLayout);
            }
        }
    }

    /* loaded from: classes.dex */
    class b extends a0 {
        b() {
        }

        @Override // e.d.p.z
        public void a(View view) {
            m mVar = m.this;
            mVar.v = null;
            mVar.f161d.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    class c implements b0 {
        c() {
        }

        @Override // e.d.p.b0
        public void a(View view) {
            ((View) m.this.f161d.getParent()).invalidate();
        }
    }

    /* loaded from: classes.dex */
    public class d extends e.a.n.b implements g.a {

        /* renamed from: g  reason: collision with root package name */
        private final Context f169g;

        /* renamed from: h  reason: collision with root package name */
        private final g f170h;

        /* renamed from: i  reason: collision with root package name */
        private b.a f171i;

        /* renamed from: j  reason: collision with root package name */
        private WeakReference<View> f172j;

        public d(Context context, b.a aVar) {
            this.f169g = context;
            this.f171i = aVar;
            g gVar = new g(context);
            gVar.S(1);
            this.f170h = gVar;
            gVar.R(this);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(g gVar, MenuItem menuItem) {
            b.a aVar = this.f171i;
            if (aVar != null) {
                return aVar.b(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(g gVar) {
            if (this.f171i != null) {
                k();
                m.this.f163f.l();
            }
        }

        @Override // e.a.n.b
        public void c() {
            m mVar = m.this;
            if (mVar.f167j == this) {
                if (!m.w(mVar.r, mVar.s, false)) {
                    m mVar2 = m.this;
                    mVar2.f168k = this;
                    mVar2.l = this.f171i;
                } else {
                    this.f171i.d(this);
                }
                this.f171i = null;
                m.this.v(false);
                m.this.f163f.g();
                m.this.f162e.m().sendAccessibilityEvent(32);
                m mVar3 = m.this;
                mVar3.c.setHideOnContentScrollEnabled(mVar3.x);
                m.this.f167j = null;
            }
        }

        @Override // e.a.n.b
        public View d() {
            WeakReference<View> weakReference = this.f172j;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // e.a.n.b
        public Menu e() {
            return this.f170h;
        }

        @Override // e.a.n.b
        public MenuInflater f() {
            return new e.a.n.g(this.f169g);
        }

        @Override // e.a.n.b
        public CharSequence g() {
            return m.this.f163f.getSubtitle();
        }

        @Override // e.a.n.b
        public CharSequence i() {
            return m.this.f163f.getTitle();
        }

        @Override // e.a.n.b
        public void k() {
            if (m.this.f167j == this) {
                this.f170h.d0();
                try {
                    this.f171i.a(this, this.f170h);
                } finally {
                    this.f170h.c0();
                }
            }
        }

        @Override // e.a.n.b
        public boolean l() {
            return m.this.f163f.j();
        }

        @Override // e.a.n.b
        public void m(View view) {
            m.this.f163f.setCustomView(view);
            this.f172j = new WeakReference<>(view);
        }

        @Override // e.a.n.b
        public void n(int i2) {
            o(m.this.a.getResources().getString(i2));
        }

        @Override // e.a.n.b
        public void o(CharSequence charSequence) {
            m.this.f163f.setSubtitle(charSequence);
        }

        @Override // e.a.n.b
        public void q(int i2) {
            r(m.this.a.getResources().getString(i2));
        }

        @Override // e.a.n.b
        public void r(CharSequence charSequence) {
            m.this.f163f.setTitle(charSequence);
        }

        @Override // e.a.n.b
        public void s(boolean z) {
            super.s(z);
            m.this.f163f.setTitleOptional(z);
        }

        public boolean t() {
            this.f170h.d0();
            try {
                return this.f171i.c(this, this.f170h);
            } finally {
                this.f170h.c0();
            }
        }
    }

    public m(Activity activity, boolean z) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        D(decorView);
        if (!z) {
            this.f164g = decorView.findViewById(16908290);
        }
    }

    public m(Dialog dialog) {
        new ArrayList();
        D(dialog.getWindow().getDecorView());
    }

    private e0 A(View view) {
        if (view instanceof e0) {
            return (e0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    private void C() {
        if (this.t) {
            this.t = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            M(false);
        }
    }

    private void D(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(f.p_res_0x7f080057);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f162e = A(view.findViewById(f.a_res_0x7f080028));
        this.f163f = (ActionBarContextView) view.findViewById(f.f_res_0x7f080030);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(f.c_res_0x7f08002a);
        this.f161d = actionBarContainer;
        e0 e0Var = this.f162e;
        if (e0Var == null || this.f163f == null || actionBarContainer == null) {
            throw new IllegalStateException(m.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.a = e0Var.getContext();
        boolean z = (this.f162e.i() & 4) != 0;
        if (z) {
            this.f166i = true;
        }
        e.a.n.a b2 = e.a.n.a.b(this.a);
        J(b2.a() || z);
        H(b2.g());
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, j.a, e.a.a.c, 0);
        if (obtainStyledAttributes.getBoolean(j.f1947k, false)) {
            I(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(j.f1945i, 0);
        if (dimensionPixelSize != 0) {
            G(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private void H(boolean z) {
        this.o = z;
        if (!z) {
            this.f162e.l(null);
            this.f161d.setTabContainer(this.f165h);
        } else {
            this.f161d.setTabContainer(null);
            this.f162e.l(this.f165h);
        }
        boolean z2 = true;
        boolean z3 = B() == 2;
        q0 q0Var = this.f165h;
        if (q0Var != null) {
            if (z3) {
                q0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    u.H(actionBarOverlayLayout);
                }
            } else {
                q0Var.setVisibility(8);
            }
        }
        this.f162e.t(!this.o && z3);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
        if (this.o || !z3) {
            z2 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z2);
    }

    private boolean K() {
        return u.y(this.f161d);
    }

    private void L() {
        if (!this.t) {
            this.t = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            M(false);
        }
    }

    private void M(boolean z) {
        if (w(this.r, this.s, this.t)) {
            if (!this.u) {
                this.u = true;
                z(z);
            }
        } else if (this.u) {
            this.u = false;
            y(z);
        }
    }

    static boolean w(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return !z && !z2;
    }

    public int B() {
        return this.f162e.o();
    }

    public void E(boolean z) {
        F(z ? 4 : 0, 4);
    }

    public void F(int i2, int i3) {
        int i4 = this.f162e.i();
        if ((i3 & 4) != 0) {
            this.f166i = true;
        }
        this.f162e.u((i2 & i3) | ((~i3) & i4));
    }

    public void G(float f2) {
        u.O(this.f161d, f2);
    }

    public void I(boolean z) {
        if (!z || this.c.w()) {
            this.x = z;
            this.c.setHideOnContentScrollEnabled(z);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    public void J(boolean z) {
        this.f162e.n(z);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a(boolean z) {
        this.q = z;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
        if (this.s) {
            this.s = false;
            M(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c() {
        h hVar = this.v;
        if (hVar != null) {
            hVar.a();
            this.v = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d(int i2) {
        this.p = i2;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        if (!this.s) {
            this.s = true;
            M(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void f() {
    }

    @Override // androidx.appcompat.app.a
    public boolean h() {
        e0 e0Var = this.f162e;
        if (e0Var == null || !e0Var.r()) {
            return false;
        }
        this.f162e.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void i(boolean z) {
        if (z != this.m) {
            this.m = z;
            int size = this.n.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.n.get(i2).a(z);
            }
        }
    }

    @Override // androidx.appcompat.app.a
    public int j() {
        return this.f162e.i();
    }

    @Override // androidx.appcompat.app.a
    public Context k() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(e.a.a.f1915g, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.b = new ContextThemeWrapper(this.a, i2);
            } else {
                this.b = this.a;
            }
        }
        return this.b;
    }

    @Override // androidx.appcompat.app.a
    public void m(Configuration configuration) {
        H(e.a.n.a.b(this.a).g());
    }

    @Override // androidx.appcompat.app.a
    public boolean o(int i2, KeyEvent keyEvent) {
        Menu e2;
        d dVar = this.f167j;
        if (dVar == null || (e2 = dVar.e()) == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        e2.setQwertyMode(z);
        return e2.performShortcut(i2, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public void r(boolean z) {
        if (!this.f166i) {
            E(z);
        }
    }

    @Override // androidx.appcompat.app.a
    public void s(boolean z) {
        h hVar;
        this.w = z;
        if (!z && (hVar = this.v) != null) {
            hVar.a();
        }
    }

    @Override // androidx.appcompat.app.a
    public void t(CharSequence charSequence) {
        this.f162e.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public e.a.n.b u(b.a aVar) {
        d dVar = this.f167j;
        if (dVar != null) {
            dVar.c();
        }
        this.c.setHideOnContentScrollEnabled(false);
        this.f163f.k();
        d dVar2 = new d(this.f163f.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f167j = dVar2;
        dVar2.k();
        this.f163f.h(dVar2);
        v(true);
        this.f163f.sendAccessibilityEvent(32);
        return dVar2;
    }

    public void v(boolean z) {
        y yVar;
        y yVar2;
        if (z) {
            L();
        } else {
            C();
        }
        if (K()) {
            if (z) {
                yVar = this.f162e.p(4, 100L);
                yVar2 = this.f163f.f(0, 200L);
            } else {
                yVar2 = this.f162e.p(0, 200L);
                yVar = this.f163f.f(8, 100L);
            }
            h hVar = new h();
            hVar.d(yVar, yVar2);
            hVar.h();
        } else if (z) {
            this.f162e.j(4);
            this.f163f.setVisibility(0);
        } else {
            this.f162e.j(0);
            this.f163f.setVisibility(8);
        }
    }

    void x() {
        b.a aVar = this.l;
        if (aVar != null) {
            aVar.d(this.f168k);
            this.f168k = null;
            this.l = null;
        }
    }

    public void y(boolean z) {
        View view;
        int[] iArr;
        h hVar = this.v;
        if (hVar != null) {
            hVar.a();
        }
        if (this.p != 0 || (!this.w && !z)) {
            this.y.a(null);
            return;
        }
        this.f161d.setAlpha(1.0f);
        this.f161d.setTransitioning(true);
        h hVar2 = new h();
        float f2 = -this.f161d.getHeight();
        if (z) {
            this.f161d.getLocationInWindow(new int[]{0, 0});
            f2 -= iArr[1];
        }
        y b2 = u.b(this.f161d);
        b2.k(f2);
        b2.i(this.A);
        hVar2.c(b2);
        if (this.q && (view = this.f164g) != null) {
            y b3 = u.b(view);
            b3.k(f2);
            hVar2.c(b3);
        }
        hVar2.f(B);
        hVar2.e(250L);
        hVar2.g(this.y);
        this.v = hVar2;
        hVar2.h();
    }

    public void z(boolean z) {
        View view;
        View view2;
        int[] iArr;
        h hVar = this.v;
        if (hVar != null) {
            hVar.a();
        }
        this.f161d.setVisibility(0);
        if (this.p != 0 || (!this.w && !z)) {
            this.f161d.setAlpha(1.0f);
            this.f161d.setTranslationY(0.0f);
            if (this.q && (view = this.f164g) != null) {
                view.setTranslationY(0.0f);
            }
            this.z.a(null);
        } else {
            this.f161d.setTranslationY(0.0f);
            float f2 = -this.f161d.getHeight();
            if (z) {
                this.f161d.getLocationInWindow(new int[]{0, 0});
                f2 -= iArr[1];
            }
            this.f161d.setTranslationY(f2);
            h hVar2 = new h();
            y b2 = u.b(this.f161d);
            b2.k(0.0f);
            b2.i(this.A);
            hVar2.c(b2);
            if (this.q && (view2 = this.f164g) != null) {
                view2.setTranslationY(f2);
                y b3 = u.b(this.f164g);
                b3.k(0.0f);
                hVar2.c(b3);
            }
            hVar2.f(C);
            hVar2.e(250L);
            hVar2.g(this.z);
            this.v = hVar2;
            hVar2.h();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            u.H(actionBarOverlayLayout);
        }
    }
}

package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.c0;
import androidx.lifecycle.d;
import androidx.lifecycle.t;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class u {
    private final m a;
    private final v b;
    private final Fragment c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f799d = false;

    /* renamed from: e  reason: collision with root package name */
    private int f800e = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ View f801e;

        a(u uVar, View view) {
            this.f801e = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f801e.removeOnAttachStateChangeListener(this);
            e.d.p.u.H(this.f801e);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.c.values().length];
            a = iArr;
            try {
                iArr[d.c.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.c.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[d.c.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[d.c.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(m mVar, v vVar, Fragment fragment) {
        this.a = mVar;
        this.b = vVar;
        this.c = fragment;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(m mVar, v vVar, Fragment fragment, t tVar) {
        this.a = mVar;
        this.b = vVar;
        this.c = fragment;
        fragment.f675g = null;
        fragment.f676h = null;
        fragment.v = 0;
        fragment.s = false;
        fragment.p = false;
        Fragment fragment2 = fragment.l;
        fragment.m = fragment2 != null ? fragment2.f678j : null;
        fragment.l = null;
        Bundle bundle = tVar.q;
        fragment.f674f = bundle == null ? new Bundle() : bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(m mVar, v vVar, ClassLoader classLoader, j jVar, t tVar) {
        this.a = mVar;
        this.b = vVar;
        Fragment a2 = jVar.a(classLoader, tVar.f792e);
        this.c = a2;
        Bundle bundle = tVar.n;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a2.o1(tVar.n);
        a2.f678j = tVar.f793f;
        a2.r = tVar.f794g;
        a2.t = true;
        a2.A = tVar.f795h;
        a2.B = tVar.f796i;
        a2.C = tVar.f797j;
        a2.F = tVar.f798k;
        a2.q = tVar.l;
        a2.E = tVar.m;
        a2.D = tVar.o;
        a2.U = d.c.values()[tVar.p];
        Bundle bundle2 = tVar.q;
        a2.f674f = bundle2 == null ? new Bundle() : bundle2;
        if (n.E0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a2);
        }
    }

    private boolean l(View view) {
        if (view == this.c.L) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.c.L) {
                return true;
            }
        }
        return false;
    }

    private Bundle q() {
        Bundle bundle = new Bundle();
        this.c.b1(bundle);
        this.a.j(this.c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.c.L != null) {
            s();
        }
        if (this.c.f675g != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.c.f675g);
        }
        if (this.c.f676h != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.c.f676h);
        }
        if (!this.c.N) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.c.N);
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        if (n.E0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.c);
        }
        Fragment fragment = this.c;
        fragment.H0(fragment.f674f);
        m mVar = this.a;
        Fragment fragment2 = this.c;
        mVar.a(fragment2, fragment2.f674f, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        int j2 = this.b.j(this.c);
        Fragment fragment = this.c;
        fragment.K.addView(fragment.L, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        if (n.E0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.c);
        }
        Fragment fragment = this.c;
        Fragment fragment2 = fragment.l;
        u uVar = null;
        if (fragment2 != null) {
            u m = this.b.m(fragment2.f678j);
            if (m != null) {
                Fragment fragment3 = this.c;
                fragment3.m = fragment3.l.f678j;
                fragment3.l = null;
                uVar = m;
            } else {
                throw new IllegalStateException("Fragment " + this.c + " declared target fragment " + this.c.l + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = fragment.m;
            if (str != null && (uVar = this.b.m(str)) == null) {
                throw new IllegalStateException("Fragment " + this.c + " declared target fragment " + this.c.m + " that does not belong to this FragmentManager!");
            }
        }
        if (uVar != null && (n.P || uVar.k().f673e < 1)) {
            uVar.m();
        }
        Fragment fragment4 = this.c;
        fragment4.x = fragment4.w.s0();
        Fragment fragment5 = this.c;
        fragment5.z = fragment5.w.v0();
        this.a.g(this.c, false);
        this.c.I0();
        this.a.b(this.c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        Fragment fragment;
        ViewGroup viewGroup;
        Fragment fragment2 = this.c;
        if (fragment2.w == null) {
            return fragment2.f673e;
        }
        int i2 = this.f800e;
        int i3 = b.a[fragment2.U.ordinal()];
        if (i3 != 1) {
            i2 = i3 != 2 ? i3 != 3 ? i3 != 4 ? Math.min(i2, -1) : Math.min(i2, 0) : Math.min(i2, 1) : Math.min(i2, 5);
        }
        Fragment fragment3 = this.c;
        if (fragment3.r) {
            if (fragment3.s) {
                i2 = Math.max(this.f800e, 2);
                View view = this.c.L;
                if (view != null && view.getParent() == null) {
                    i2 = Math.min(i2, 2);
                }
            } else {
                i2 = this.f800e < 4 ? Math.min(i2, fragment3.f673e) : Math.min(i2, 1);
            }
        }
        if (!this.c.p) {
            i2 = Math.min(i2, 1);
        }
        c0.e.b bVar = null;
        if (n.P && (viewGroup = (fragment = this.c).K) != null) {
            bVar = c0.n(viewGroup, fragment.G()).l(this);
        }
        if (bVar == c0.e.b.ADDING) {
            i2 = Math.min(i2, 6);
        } else if (bVar == c0.e.b.REMOVING) {
            i2 = Math.max(i2, 3);
        } else {
            Fragment fragment4 = this.c;
            if (fragment4.q) {
                i2 = fragment4.Z() ? Math.min(i2, 1) : Math.min(i2, -1);
            }
        }
        Fragment fragment5 = this.c;
        if (fragment5.M && fragment5.f673e < 5) {
            i2 = Math.min(i2, 4);
        }
        if (n.E0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i2 + " for " + this.c);
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        if (n.E0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.c);
        }
        Fragment fragment = this.c;
        if (!fragment.T) {
            this.a.h(fragment, fragment.f674f, false);
            Fragment fragment2 = this.c;
            fragment2.L0(fragment2.f674f);
            m mVar = this.a;
            Fragment fragment3 = this.c;
            mVar.c(fragment3, fragment3.f674f, false);
            return;
        }
        fragment.i1(fragment.f674f);
        this.c.f673e = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        String str;
        if (!this.c.r) {
            if (n.E0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.c);
            }
            Fragment fragment = this.c;
            LayoutInflater R0 = fragment.R0(fragment.f674f);
            ViewGroup viewGroup = null;
            Fragment fragment2 = this.c;
            ViewGroup viewGroup2 = fragment2.K;
            if (viewGroup2 != null) {
                viewGroup = viewGroup2;
            } else {
                int i2 = fragment2.B;
                if (i2 != 0) {
                    if (i2 != -1) {
                        viewGroup = (ViewGroup) fragment2.w.n0().e(this.c.B);
                        if (viewGroup == null) {
                            Fragment fragment3 = this.c;
                            if (!fragment3.t) {
                                try {
                                    str = fragment3.M().getResourceName(this.c.B);
                                } catch (Resources.NotFoundException unused) {
                                    str = "unknown";
                                }
                                throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.c.B) + " (" + str + ") for fragment " + this.c);
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create fragment " + this.c + " for a container view with no id");
                    }
                }
            }
            Fragment fragment4 = this.c;
            fragment4.K = viewGroup;
            fragment4.N0(R0, viewGroup, fragment4.f674f);
            View view = this.c.L;
            if (view != null) {
                boolean z = false;
                view.setSaveFromParentEnabled(false);
                Fragment fragment5 = this.c;
                fragment5.L.setTag(e.g.b.a_res_0x7f080064, fragment5);
                if (viewGroup != null) {
                    b();
                }
                Fragment fragment6 = this.c;
                if (fragment6.D) {
                    fragment6.L.setVisibility(8);
                }
                if (e.d.p.u.x(this.c.L)) {
                    e.d.p.u.H(this.c.L);
                } else {
                    View view2 = this.c.L;
                    view2.addOnAttachStateChangeListener(new a(this, view2));
                }
                this.c.e1();
                m mVar = this.a;
                Fragment fragment7 = this.c;
                mVar.m(fragment7, fragment7.L, fragment7.f674f, false);
                int visibility = this.c.L.getVisibility();
                float alpha = this.c.L.getAlpha();
                if (n.P) {
                    this.c.u1(alpha);
                    Fragment fragment8 = this.c;
                    if (fragment8.K != null && visibility == 0) {
                        View findFocus = fragment8.L.findFocus();
                        if (findFocus != null) {
                            this.c.p1(findFocus);
                            if (n.E0(2)) {
                                Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.c);
                            }
                        }
                        this.c.L.setAlpha(0.0f);
                    }
                } else {
                    Fragment fragment9 = this.c;
                    if (visibility == 0 && fragment9.K != null) {
                        z = true;
                    }
                    fragment9.P = z;
                }
            }
            this.c.f673e = 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        Fragment f2;
        if (n.E0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.c);
        }
        Fragment fragment = this.c;
        boolean z = true;
        boolean z2 = fragment.q && !fragment.Z();
        if (z2 || this.b.o().o(this.c)) {
            k<?> kVar = this.c.x;
            if (kVar instanceof t) {
                z = this.b.o().l();
            } else if (kVar.k() instanceof Activity) {
                z = true ^ ((Activity) kVar.k()).isChangingConfigurations();
            }
            if (z2 || z) {
                this.b.o().f(this.c);
            }
            this.c.O0();
            this.a.d(this.c, false);
            for (u uVar : this.b.k()) {
                if (uVar != null) {
                    Fragment k2 = uVar.k();
                    if (this.c.f678j.equals(k2.m)) {
                        k2.l = this.c;
                        k2.m = null;
                    }
                }
            }
            Fragment fragment2 = this.c;
            String str = fragment2.m;
            if (str != null) {
                fragment2.l = this.b.f(str);
            }
            this.b.q(this);
            return;
        }
        String str2 = this.c.m;
        if (!(str2 == null || (f2 = this.b.f(str2)) == null || !f2.F)) {
            this.c.l = f2;
        }
        this.c.f673e = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        View view;
        if (n.E0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.c);
        }
        Fragment fragment = this.c;
        ViewGroup viewGroup = fragment.K;
        if (!(viewGroup == null || (view = fragment.L) == null)) {
            viewGroup.removeView(view);
        }
        this.c.P0();
        this.a.n(this.c, false);
        Fragment fragment2 = this.c;
        fragment2.K = null;
        fragment2.L = null;
        fragment2.W = null;
        fragment2.X.j(null);
        this.c.s = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        if (n.E0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.c);
        }
        this.c.Q0();
        boolean z = false;
        this.a.e(this.c, false);
        Fragment fragment = this.c;
        fragment.f673e = -1;
        fragment.x = null;
        fragment.z = null;
        fragment.w = null;
        if (fragment.q && !fragment.Z()) {
            z = true;
        }
        if (z || this.b.o().o(this.c)) {
            if (n.E0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.c);
            }
            this.c.W();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        Fragment fragment = this.c;
        if (fragment.r && fragment.s && !fragment.u) {
            if (n.E0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.c);
            }
            Fragment fragment2 = this.c;
            fragment2.N0(fragment2.R0(fragment2.f674f), null, this.c.f674f);
            View view = this.c.L;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.c;
                fragment3.L.setTag(e.g.b.a_res_0x7f080064, fragment3);
                Fragment fragment4 = this.c;
                if (fragment4.D) {
                    fragment4.L.setVisibility(8);
                }
                this.c.e1();
                m mVar = this.a;
                Fragment fragment5 = this.c;
                mVar.m(fragment5, fragment5.L, fragment5.f674f, false);
                this.c.f673e = 2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment k() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (!this.f799d) {
            try {
                this.f799d = true;
                while (true) {
                    int d2 = d();
                    Fragment fragment = this.c;
                    int i2 = fragment.f673e;
                    if (d2 == i2) {
                        if (n.P && fragment.Q) {
                            if (!(fragment.L == null || (viewGroup = fragment.K) == null)) {
                                c0 n = c0.n(viewGroup, fragment.G());
                                if (this.c.D) {
                                    n.c(this);
                                } else {
                                    n.e(this);
                                }
                            }
                            Fragment fragment2 = this.c;
                            n nVar = fragment2.w;
                            if (nVar != null) {
                                nVar.C0(fragment2);
                            }
                            Fragment fragment3 = this.c;
                            fragment3.Q = false;
                            fragment3.u0(fragment3.D);
                        }
                        return;
                    } else if (d2 > i2) {
                        switch (i2 + 1) {
                            case 0:
                                c();
                                continue;
                            case 1:
                                e();
                                continue;
                            case 2:
                                j();
                                f();
                                continue;
                            case 3:
                                a();
                                continue;
                            case 4:
                                if (!(fragment.L == null || (viewGroup2 = fragment.K) == null)) {
                                    c0.n(viewGroup2, fragment.G()).b(c0.e.c.c(this.c.L.getVisibility()), this);
                                }
                                this.c.f673e = 4;
                                continue;
                            case 5:
                                u();
                                continue;
                            case 6:
                                fragment.f673e = 6;
                                continue;
                            case 7:
                                p();
                                continue;
                            default:
                                continue;
                        }
                    } else {
                        switch (i2 - 1) {
                            case -1:
                                i();
                                continue;
                            case 0:
                                g();
                                continue;
                            case 1:
                                h();
                                this.c.f673e = 1;
                                continue;
                            case 2:
                                fragment.s = false;
                                fragment.f673e = 2;
                                continue;
                            case 3:
                                if (n.E0(3)) {
                                    Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.c);
                                }
                                Fragment fragment4 = this.c;
                                if (fragment4.L != null && fragment4.f675g == null) {
                                    s();
                                }
                                Fragment fragment5 = this.c;
                                if (!(fragment5.L == null || (viewGroup3 = fragment5.K) == null)) {
                                    c0.n(viewGroup3, fragment5.G()).d(this);
                                }
                                this.c.f673e = 3;
                                continue;
                            case 4:
                                v();
                                continue;
                            case 5:
                                fragment.f673e = 5;
                                continue;
                            case 6:
                                n();
                                continue;
                            default:
                                continue;
                        }
                    }
                }
            } finally {
                this.f799d = false;
            }
        } else if (n.E0(2)) {
            Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n() {
        if (n.E0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.c);
        }
        this.c.W0();
        this.a.f(this.c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(ClassLoader classLoader) {
        Bundle bundle = this.c.f674f;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            Fragment fragment = this.c;
            fragment.f675g = fragment.f674f.getSparseParcelableArray("android:view_state");
            Fragment fragment2 = this.c;
            fragment2.f676h = fragment2.f674f.getBundle("android:view_registry_state");
            Fragment fragment3 = this.c;
            fragment3.m = fragment3.f674f.getString("android:target_state");
            Fragment fragment4 = this.c;
            if (fragment4.m != null) {
                fragment4.n = fragment4.f674f.getInt("android:target_req_state", 0);
            }
            Fragment fragment5 = this.c;
            Boolean bool = fragment5.f677i;
            if (bool != null) {
                fragment5.N = bool.booleanValue();
                this.c.f677i = null;
            } else {
                fragment5.N = fragment5.f674f.getBoolean("android:user_visible_hint", true);
            }
            Fragment fragment6 = this.c;
            if (!fragment6.N) {
                fragment6.M = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() {
        if (n.E0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.c);
        }
        View A = this.c.A();
        if (A != null && l(A)) {
            boolean requestFocus = A.requestFocus();
            if (n.E0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(A);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(this.c);
                sb.append(" resulting in focused view ");
                sb.append(this.c.L.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.c.p1(null);
        this.c.a1();
        this.a.i(this.c, false);
        Fragment fragment = this.c;
        fragment.f674f = null;
        fragment.f675g = null;
        fragment.f676h = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t r() {
        t tVar = new t(this.c);
        Fragment fragment = this.c;
        if (fragment.f673e <= -1 || tVar.q != null) {
            tVar.q = fragment.f674f;
        } else {
            Bundle q = q();
            tVar.q = q;
            if (this.c.m != null) {
                if (q == null) {
                    tVar.q = new Bundle();
                }
                tVar.q.putString("android:target_state", this.c.m);
                int i2 = this.c.n;
                if (i2 != 0) {
                    tVar.q.putInt("android:target_req_state", i2);
                }
            }
        }
        return tVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s() {
        if (this.c.L != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.c.L.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.c.f675g = sparseArray;
            }
            Bundle bundle = new Bundle();
            this.c.W.f(bundle);
            if (!bundle.isEmpty()) {
                this.c.f676h = bundle;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(int i2) {
        this.f800e = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u() {
        if (n.E0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.c);
        }
        this.c.c1();
        this.a.k(this.c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v() {
        if (n.E0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.c);
        }
        this.c.d1();
        this.a.l(this.c, false);
    }
}

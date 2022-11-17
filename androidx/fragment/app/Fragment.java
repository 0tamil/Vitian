package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.p;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.d;
import androidx.lifecycle.h;
import androidx.lifecycle.l;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.g, t, androidx.savedstate.c {
    static final Object b0 = new Object();
    int A;
    int B;
    String C;
    boolean D;
    boolean E;
    boolean F;
    boolean G;
    boolean H;
    private boolean J;
    ViewGroup K;
    View L;
    boolean M;
    d O;
    boolean P;
    boolean Q;
    float R;
    LayoutInflater S;
    boolean T;
    h V;
    a0 W;
    androidx.savedstate.b Y;
    private int Z;

    /* renamed from: f  reason: collision with root package name */
    Bundle f674f;

    /* renamed from: g  reason: collision with root package name */
    SparseArray<Parcelable> f675g;

    /* renamed from: h  reason: collision with root package name */
    Bundle f676h;

    /* renamed from: i  reason: collision with root package name */
    Boolean f677i;

    /* renamed from: k  reason: collision with root package name */
    Bundle f679k;
    Fragment l;
    int n;
    boolean p;
    boolean q;
    boolean r;
    boolean s;
    boolean t;
    boolean u;
    int v;
    n w;
    k<?> x;
    Fragment z;

    /* renamed from: e  reason: collision with root package name */
    int f673e = -1;

    /* renamed from: j  reason: collision with root package name */
    String f678j = UUID.randomUUID().toString();
    String m = null;
    private Boolean o = null;
    n y = new o();
    boolean I = true;
    boolean N = true;
    d.c U = d.c.RESUMED;
    l<androidx.lifecycle.g> X = new l<>();
    private final ArrayList<f> a0 = new ArrayList<>();

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.e(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ c0 f681e;

        b(Fragment fragment, c0 c0Var) {
            this.f681e = c0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f681e.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends androidx.fragment.app.g {
        c() {
        }

        @Override // androidx.fragment.app.g
        public View e(int i2) {
            View view = Fragment.this.L;
            if (view != null) {
                return view.findViewById(i2);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        @Override // androidx.fragment.app.g
        public boolean f() {
            return Fragment.this.L != null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d {
        View a;
        Animator b;
        boolean c;

        /* renamed from: d  reason: collision with root package name */
        int f682d;

        /* renamed from: e  reason: collision with root package name */
        int f683e;

        /* renamed from: f  reason: collision with root package name */
        int f684f;

        /* renamed from: g  reason: collision with root package name */
        int f685g;

        /* renamed from: h  reason: collision with root package name */
        int f686h;

        /* renamed from: i  reason: collision with root package name */
        ArrayList<String> f687i;

        /* renamed from: j  reason: collision with root package name */
        ArrayList<String> f688j;
        Object l;
        Object n;
        Object p;
        Boolean q;
        Boolean r;
        p s;
        p t;
        boolean w;
        g x;
        boolean y;

        /* renamed from: k  reason: collision with root package name */
        Object f689k = null;
        Object m = null;
        Object o = null;
        float u = 1.0f;
        View v = null;

        d() {
            Object obj = Fragment.b0;
            this.l = obj;
            this.n = obj;
            this.p = obj;
        }
    }

    /* loaded from: classes.dex */
    public static class e extends RuntimeException {
        public e(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* loaded from: classes.dex */
    private static abstract class f {
        private f() {
        }

        abstract void a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface g {
        void a();

        void b();
    }

    public Fragment() {
        new AtomicInteger();
        V();
    }

    private int D() {
        d.c cVar = this.U;
        return (cVar == d.c.INITIALIZED || this.z == null) ? cVar.ordinal() : Math.min(cVar.ordinal(), this.z.D());
    }

    private void V() {
        this.V = new h(this);
        this.Y = androidx.savedstate.b.a(this);
    }

    @Deprecated
    public static Fragment X(Context context, String str, Bundle bundle) {
        try {
            Fragment newInstance = j.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(newInstance.getClass().getClassLoader());
                newInstance.o1(bundle);
            }
            return newInstance;
        } catch (IllegalAccessException e2) {
            throw new e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new e("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new e("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }

    private void j1() {
        if (n.E0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.L != null) {
            k1(this.f674f);
        }
        this.f674f = null;
    }

    private d k() {
        if (this.O == null) {
            this.O = new d();
        }
        return this.O;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View A() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        return dVar.v;
    }

    public void A0(boolean z) {
    }

    public final Object B() {
        k<?> kVar = this.x;
        if (kVar == null) {
            return null;
        }
        return kVar.m();
    }

    public void B0(Menu menu) {
    }

    @Deprecated
    public LayoutInflater C(Bundle bundle) {
        k<?> kVar = this.x;
        if (kVar != null) {
            LayoutInflater n = kVar.n();
            e.d.p.g.b(n, this.y.t0());
            return n;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void C0(boolean z) {
    }

    @Deprecated
    public void D0(int i2, String[] strArr, int[] iArr) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int E() {
        d dVar = this.O;
        if (dVar == null) {
            return 0;
        }
        return dVar.f686h;
    }

    public void E0(Bundle bundle) {
    }

    public final Fragment F() {
        return this.z;
    }

    public void F0(View view, Bundle bundle) {
    }

    public final n G() {
        n nVar = this.w;
        if (nVar != null) {
            return nVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public void G0(Bundle bundle) {
        this.J = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean H() {
        d dVar = this.O;
        if (dVar == null) {
            return false;
        }
        return dVar.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H0(Bundle bundle) {
        this.y.Q0();
        this.f673e = 3;
        this.J = false;
        g0(bundle);
        if (this.J) {
            j1();
            this.y.y();
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int I() {
        d dVar = this.O;
        if (dVar == null) {
            return 0;
        }
        return dVar.f684f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I0() {
        Iterator<f> it = this.a0.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.a0.clear();
        this.y.j(this.x, f(), this);
        this.f673e = 0;
        this.J = false;
        j0(this.x.k());
        if (this.J) {
            this.w.I(this);
            this.y.z();
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onAttach()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int J() {
        d dVar = this.O;
        if (dVar == null) {
            return 0;
        }
        return dVar.f685g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J0(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.y.A(configuration);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float K() {
        d dVar = this.O;
        if (dVar == null) {
            return 1.0f;
        }
        return dVar.u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean K0(MenuItem menuItem) {
        if (this.D) {
            return false;
        }
        if (l0(menuItem)) {
            return true;
        }
        return this.y.B(menuItem);
    }

    public Object L() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.n;
        return obj == b0 ? y() : obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void L0(Bundle bundle) {
        this.y.Q0();
        this.f673e = 1;
        this.J = false;
        if (Build.VERSION.SDK_INT >= 19) {
            this.V.a(new androidx.lifecycle.e() { // from class: androidx.fragment.app.Fragment.5
                @Override // androidx.lifecycle.e
                public void d(androidx.lifecycle.g gVar, d.b bVar) {
                    View view;
                    if (bVar == d.b.ON_STOP && (view = Fragment.this.L) != null) {
                        view.cancelPendingInputEvents();
                    }
                }
            });
        }
        this.Y.c(bundle);
        onCreate(bundle);
        this.T = true;
        if (this.J) {
            this.V.h(d.b.ON_CREATE);
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onCreate()");
    }

    public final Resources M() {
        return g1().getResources();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean M0(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.D) {
            return false;
        }
        if (this.H && this.I) {
            z = true;
            o0(menu, menuInflater);
        }
        return z | this.y.D(menu, menuInflater);
    }

    public Object N() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.l;
        return obj == b0 ? v() : obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void N0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.y.Q0();
        this.u = true;
        this.W = new a0(this, g());
        View p0 = p0(layoutInflater, viewGroup, bundle);
        this.L = p0;
        if (p0 != null) {
            this.W.c();
            u.a(this.L, this.W);
            v.a(this.L, this.W);
            androidx.savedstate.d.a(this.L, this.W);
            this.X.j(this.W);
        } else if (!this.W.d()) {
            this.W = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public Object O() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        return dVar.o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O0() {
        this.y.E();
        this.V.h(d.b.ON_DESTROY);
        this.f673e = 0;
        this.J = false;
        this.T = false;
        onDestroy();
        if (!this.J) {
            throw new e0("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }

    public Object P() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.p;
        return obj == b0 ? O() : obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void P0() {
        this.y.F();
        if (this.L != null && this.W.a().b().a(d.c.CREATED)) {
            this.W.b(d.b.ON_DESTROY);
        }
        this.f673e = 1;
        this.J = false;
        r0();
        if (this.J) {
            e.i.a.a.b(this).c();
            this.u = false;
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList<String> Q() {
        ArrayList<String> arrayList;
        d dVar = this.O;
        return (dVar == null || (arrayList = dVar.f687i) == null) ? new ArrayList<>() : arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Q0() {
        this.f673e = -1;
        this.J = false;
        s0();
        this.S = null;
        if (!this.J) {
            throw new e0("Fragment " + this + " did not call through to super.onDetach()");
        } else if (!this.y.D0()) {
            this.y.E();
            this.y = new o();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList<String> R() {
        ArrayList<String> arrayList;
        d dVar = this.O;
        return (dVar == null || (arrayList = dVar.f688j) == null) ? new ArrayList<>() : arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LayoutInflater R0(Bundle bundle) {
        LayoutInflater t0 = t0(bundle);
        this.S = t0;
        return t0;
    }

    @Deprecated
    public final Fragment S() {
        String str;
        Fragment fragment = this.l;
        if (fragment != null) {
            return fragment;
        }
        n nVar = this.w;
        if (nVar == null || (str = this.m) == null) {
            return null;
        }
        return nVar.f0(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void S0() {
        onLowMemory();
        this.y.G();
    }

    public View T() {
        return this.L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T0(boolean z) {
        x0(z);
        this.y.H(z);
    }

    public LiveData<androidx.lifecycle.g> U() {
        return this.X;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean U0(MenuItem menuItem) {
        if (this.D) {
            return false;
        }
        if (!this.H || !this.I || !y0(menuItem)) {
            return this.y.J(menuItem);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void V0(Menu menu) {
        if (!this.D) {
            if (this.H && this.I) {
                z0(menu);
            }
            this.y.K(menu);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void W() {
        V();
        this.f678j = UUID.randomUUID().toString();
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = false;
        this.v = 0;
        this.w = null;
        this.y = new o();
        this.x = null;
        this.A = 0;
        this.B = 0;
        this.C = null;
        this.D = false;
        this.E = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void W0() {
        this.y.M();
        if (this.L != null) {
            this.W.b(d.b.ON_PAUSE);
        }
        this.V.h(d.b.ON_PAUSE);
        this.f673e = 6;
        this.J = false;
        onPause();
        if (!this.J) {
            throw new e0("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void X0(boolean z) {
        A0(z);
        this.y.N(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean Y() {
        d dVar = this.O;
        if (dVar == null) {
            return false;
        }
        return dVar.y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean Y0(Menu menu) {
        boolean z = false;
        if (this.D) {
            return false;
        }
        if (this.H && this.I) {
            z = true;
            B0(menu);
        }
        return z | this.y.O(menu);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean Z() {
        return this.v > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Z0() {
        boolean H0 = this.w.H0(this);
        Boolean bool = this.o;
        if (bool == null || bool.booleanValue() != H0) {
            this.o = Boolean.valueOf(H0);
            C0(H0);
            this.y.P();
        }
    }

    @Override // androidx.lifecycle.g
    public androidx.lifecycle.d a() {
        return this.V;
    }

    public final boolean a0() {
        n nVar;
        return this.I && ((nVar = this.w) == null || nVar.G0(this.z));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a1() {
        this.y.Q0();
        this.y.a0(true);
        this.f673e = 7;
        this.J = false;
        onResume();
        if (this.J) {
            h hVar = this.V;
            d.b bVar = d.b.ON_RESUME;
            hVar.h(bVar);
            if (this.L != null) {
                this.W.b(bVar);
            }
            this.y.Q();
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onResume()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b0() {
        d dVar = this.O;
        if (dVar == null) {
            return false;
        }
        return dVar.w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b1(Bundle bundle) {
        E0(bundle);
        this.Y.d(bundle);
        Parcelable e1 = this.y.e1();
        if (e1 != null) {
            bundle.putParcelable("android:support:fragments", e1);
        }
    }

    public final boolean c0() {
        return this.q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c1() {
        this.y.Q0();
        this.y.a0(true);
        this.f673e = 5;
        this.J = false;
        onStart();
        if (this.J) {
            h hVar = this.V;
            d.b bVar = d.b.ON_START;
            hVar.h(bVar);
            if (this.L != null) {
                this.W.b(bVar);
            }
            this.y.R();
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onStart()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d0() {
        Fragment F = F();
        return F != null && (F.c0() || F.d0());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d1() {
        this.y.T();
        if (this.L != null) {
            this.W.b(d.b.ON_STOP);
        }
        this.V.h(d.b.ON_STOP);
        this.f673e = 4;
        this.J = false;
        onStop();
        if (!this.J) {
            throw new e0("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    void e(boolean z) {
        ViewGroup viewGroup;
        n nVar;
        d dVar = this.O;
        g gVar = null;
        if (dVar != null) {
            dVar.w = false;
            gVar = dVar.x;
            dVar.x = null;
        }
        if (gVar != null) {
            gVar.a();
        } else if (n.P && this.L != null && (viewGroup = this.K) != null && (nVar = this.w) != null) {
            c0 n = c0.n(viewGroup, nVar);
            n.p();
            if (z) {
                this.x.l().post(new b(this, n));
            } else {
                n.g();
            }
        }
    }

    public final boolean e0() {
        n nVar = this.w;
        if (nVar == null) {
            return false;
        }
        return nVar.J0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e1() {
        F0(this.L, this.f674f);
        this.y.U();
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.fragment.app.g f() {
        return new c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f0() {
        this.y.Q0();
    }

    public final androidx.fragment.app.e f1() {
        androidx.fragment.app.e m = m();
        if (m != null) {
            return m;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // androidx.lifecycle.t
    public s g() {
        if (this.w == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (D() != d.c.INITIALIZED.ordinal()) {
            return this.w.z0(this);
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    @Deprecated
    public void g0(Bundle bundle) {
        this.J = true;
    }

    public final Context g1() {
        Context t = t();
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.A));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.B));
        printWriter.print(" mTag=");
        printWriter.println(this.C);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f673e);
        printWriter.print(" mWho=");
        printWriter.print(this.f678j);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.v);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.p);
        printWriter.print(" mRemoving=");
        printWriter.print(this.q);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.r);
        printWriter.print(" mInLayout=");
        printWriter.println(this.s);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.D);
        printWriter.print(" mDetached=");
        printWriter.print(this.E);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.I);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.H);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.F);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.N);
        if (this.w != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.w);
        }
        if (this.x != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.x);
        }
        if (this.z != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.z);
        }
        if (this.f679k != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f679k);
        }
        if (this.f674f != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f674f);
        }
        if (this.f675g != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f675g);
        }
        if (this.f676h != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f676h);
        }
        Fragment S = S();
        if (S != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(S);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.n);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(H());
        if (u() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(u());
        }
        if (x() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(x());
        }
        if (I() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(I());
        }
        if (J() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(J());
        }
        if (this.K != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.K);
        }
        if (this.L != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.L);
        }
        if (p() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(p());
        }
        if (t() != null) {
            e.i.a.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.y + ":");
        n nVar = this.y;
        nVar.W(str + "  ", fileDescriptor, printWriter, strArr);
    }

    @Deprecated
    public void h0(int i2, int i3, Intent intent) {
        if (n.E0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i2 + " resultCode: " + i3 + " data: " + intent);
        }
    }

    public final View h1() {
        View T = T();
        if (T != null) {
            return T;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final int hashCode() {
        return super.hashCode();
    }

    @Deprecated
    public void i0(Activity activity) {
        this.J = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i1(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.y.c1(parcelable);
            this.y.C();
        }
    }

    @Override // androidx.savedstate.c
    public final SavedStateRegistry j() {
        return this.Y.b();
    }

    public void j0(Context context) {
        this.J = true;
        k<?> kVar = this.x;
        Activity h2 = kVar == null ? null : kVar.h();
        if (h2 != null) {
            this.J = false;
            i0(h2);
        }
    }

    @Deprecated
    public void k0(Fragment fragment) {
    }

    final void k1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f675g;
        if (sparseArray != null) {
            this.L.restoreHierarchyState(sparseArray);
            this.f675g = null;
        }
        if (this.L != null) {
            this.W.e(this.f676h);
            this.f676h = null;
        }
        this.J = false;
        G0(bundle);
        if (!this.J) {
            throw new e0("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.L != null) {
            this.W.b(d.b.ON_CREATE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment l(String str) {
        return str.equals(this.f678j) ? this : this.y.i0(str);
    }

    public boolean l0(MenuItem menuItem) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l1(View view) {
        k().a = view;
    }

    public final androidx.fragment.app.e m() {
        k<?> kVar = this.x;
        if (kVar == null) {
            return null;
        }
        return (androidx.fragment.app.e) kVar.h();
    }

    public Animation m0(int i2, boolean z, int i3) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m1(int i2, int i3, int i4, int i5) {
        if (this.O != null || i2 != 0 || i3 != 0 || i4 != 0 || i5 != 0) {
            k().f682d = i2;
            k().f683e = i3;
            k().f684f = i4;
            k().f685g = i5;
        }
    }

    public boolean n() {
        Boolean bool;
        d dVar = this.O;
        if (dVar == null || (bool = dVar.r) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public Animator n0(int i2, boolean z, int i3) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n1(Animator animator) {
        k().b = animator;
    }

    public boolean o() {
        Boolean bool;
        d dVar = this.O;
        if (dVar == null || (bool = dVar.q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void o0(Menu menu, MenuInflater menuInflater) {
    }

    public void o1(Bundle bundle) {
        if (this.w == null || !e0()) {
            this.f679k = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.J = true;
    }

    public void onCreate(Bundle bundle) {
        this.J = true;
        i1(bundle);
        if (!this.y.I0(1)) {
            this.y.C();
        }
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        f1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onDestroy() {
        this.J = true;
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.J = true;
    }

    public void onPause() {
        this.J = true;
    }

    public void onResume() {
        this.J = true;
    }

    public void onStart() {
        this.J = true;
    }

    public void onStop() {
        this.J = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View p() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        return dVar.a;
    }

    public View p0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = this.Z;
        if (i2 != 0) {
            return layoutInflater.inflate(i2, viewGroup, false);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p1(View view) {
        k().v = view;
    }

    public void q0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q1(boolean z) {
        k().y = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Animator r() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        return dVar.b;
    }

    public void r0() {
        this.J = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r1(int i2) {
        if (this.O != null || i2 != 0) {
            k();
            this.O.f686h = i2;
        }
    }

    public final n s() {
        if (this.x != null) {
            return this.y;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public void s0() {
        this.J = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s1(g gVar) {
        k();
        d dVar = this.O;
        g gVar2 = dVar.x;
        if (gVar != gVar2) {
            if (gVar == null || gVar2 == null) {
                if (dVar.w) {
                    dVar.x = gVar;
                }
                if (gVar != null) {
                    gVar.b();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2) {
        w1(intent, i2, null);
    }

    public Context t() {
        k<?> kVar = this.x;
        if (kVar == null) {
            return null;
        }
        return kVar.k();
    }

    public LayoutInflater t0(Bundle bundle) {
        return C(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t1(boolean z) {
        if (this.O != null) {
            k().c = z;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f678j);
        if (this.A != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.A));
        }
        if (this.C != null) {
            sb.append(" tag=");
            sb.append(this.C);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int u() {
        d dVar = this.O;
        if (dVar == null) {
            return 0;
        }
        return dVar.f682d;
    }

    public void u0(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u1(float f2) {
        k().u = f2;
    }

    public Object v() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        return dVar.f689k;
    }

    @Deprecated
    public void v0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.J = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v1(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        k();
        d dVar = this.O;
        dVar.f687i = arrayList;
        dVar.f688j = arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p w() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        return dVar.s;
    }

    public void w0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.J = true;
        k<?> kVar = this.x;
        Activity h2 = kVar == null ? null : kVar.h();
        if (h2 != null) {
            this.J = false;
            v0(h2, attributeSet, bundle);
        }
    }

    @Deprecated
    public void w1(@SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        if (this.x != null) {
            G().K0(this, intent, i2, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int x() {
        d dVar = this.O;
        if (dVar == null) {
            return 0;
        }
        return dVar.f683e;
    }

    public void x0(boolean z) {
    }

    public void x1() {
        if (this.O != null && k().w) {
            if (this.x == null) {
                k().w = false;
            } else if (Looper.myLooper() != this.x.l().getLooper()) {
                this.x.l().postAtFrontOfQueue(new a());
            } else {
                e(true);
            }
        }
    }

    public Object y() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        return dVar.m;
    }

    public boolean y0(MenuItem menuItem) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p z() {
        d dVar = this.O;
        if (dVar == null) {
            return null;
        }
        return dVar.t;
    }

    public void z0(Menu menu) {
    }
}

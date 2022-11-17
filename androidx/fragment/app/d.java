package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.g;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
/* loaded from: classes.dex */
public class d extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private Handler c0;
    private boolean l0;
    private Dialog n0;
    private boolean o0;
    private boolean p0;
    private boolean q0;
    private Runnable d0 = new a();
    private DialogInterface.OnCancelListener e0 = new b();
    private DialogInterface.OnDismissListener f0 = new c();
    private int g0 = 0;
    private int h0 = 0;
    private boolean i0 = true;
    private boolean j0 = true;
    private int k0 = -1;
    private m<g> m0 = new C0020d();
    private boolean r0 = false;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            d.this.f0.onDismiss(d.this.n0);
        }
    }

    /* loaded from: classes.dex */
    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            if (d.this.n0 != null) {
                d dVar = d.this;
                dVar.onCancel(dVar.n0);
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements DialogInterface.OnDismissListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            if (d.this.n0 != null) {
                d dVar = d.this;
                dVar.onDismiss(dVar.n0);
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0020d implements m<g> {
        C0020d() {
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public void a(g gVar) {
            if (gVar != null && d.this.j0) {
                View h1 = d.this.h1();
                if (h1.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                } else if (d.this.n0 != null) {
                    if (n.E0(3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + d.this.n0);
                    }
                    d.this.n0.setContentView(h1);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    class e extends g {
        final /* synthetic */ g a;

        e(g gVar) {
            this.a = gVar;
        }

        @Override // androidx.fragment.app.g
        public View e(int i2) {
            return this.a.f() ? this.a.e(i2) : d.this.E1(i2);
        }

        @Override // androidx.fragment.app.g
        public boolean f() {
            return this.a.f() || d.this.F1();
        }
    }

    private void B1(boolean z, boolean z2) {
        if (!this.p0) {
            this.p0 = true;
            this.q0 = false;
            Dialog dialog = this.n0;
            if (dialog != null) {
                dialog.setOnDismissListener(null);
                this.n0.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.c0.getLooper()) {
                        onDismiss(this.n0);
                    } else {
                        this.c0.post(this.d0);
                    }
                }
            }
            this.o0 = true;
            if (this.k0 >= 0) {
                G().T0(this.k0, 1);
                this.k0 = -1;
                return;
            }
            w l = G().l();
            l.k(this);
            if (z) {
                l.g();
            } else {
                l.f();
            }
        }
    }

    private void G1(Bundle bundle) {
        if (this.j0 && !this.r0) {
            try {
                this.l0 = true;
                Dialog D1 = D1(bundle);
                this.n0 = D1;
                if (this.j0) {
                    I1(D1, this.g0);
                    Context t = t();
                    if (t instanceof Activity) {
                        this.n0.setOwnerActivity((Activity) t);
                    }
                    this.n0.setCancelable(this.i0);
                    this.n0.setOnCancelListener(this.e0);
                    this.n0.setOnDismissListener(this.f0);
                    this.r0 = true;
                } else {
                    this.n0 = null;
                }
            } finally {
                this.l0 = false;
            }
        }
    }

    public int C1() {
        return this.h0;
    }

    public Dialog D1(Bundle bundle) {
        if (n.E0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(g1(), C1());
    }

    @Override // androidx.fragment.app.Fragment
    public void E0(Bundle bundle) {
        super.E0(bundle);
        Dialog dialog = this.n0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i2 = this.g0;
        if (i2 != 0) {
            bundle.putInt("android:style", i2);
        }
        int i3 = this.h0;
        if (i3 != 0) {
            bundle.putInt("android:theme", i3);
        }
        boolean z = this.i0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.j0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i4 = this.k0;
        if (i4 != -1) {
            bundle.putInt("android:backStackId", i4);
        }
    }

    View E1(int i2) {
        Dialog dialog = this.n0;
        if (dialog != null) {
            return dialog.findViewById(i2);
        }
        return null;
    }

    boolean F1() {
        return this.r0;
    }

    @Override // androidx.fragment.app.Fragment
    public void G0(Bundle bundle) {
        Bundle bundle2;
        super.G0(bundle);
        if (this.n0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.n0.onRestoreInstanceState(bundle2);
        }
    }

    public void H1(boolean z) {
        this.j0 = z;
    }

    public void I1(Dialog dialog, int i2) {
        if (!(i2 == 1 || i2 == 2)) {
            if (i2 == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void J1(n nVar, String str) {
        this.p0 = false;
        this.q0 = true;
        w l = nVar.l();
        l.d(this, str);
        l.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.fragment.app.Fragment
    public void N0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.N0(layoutInflater, viewGroup, bundle);
        if (this.L == null && this.n0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.n0.onRestoreInstanceState(bundle2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.fragment.app.Fragment
    public g f() {
        return new e(super.f());
    }

    @Override // androidx.fragment.app.Fragment
    public void j0(Context context) {
        super.j0(context);
        U().f(this.m0);
        if (!this.q0) {
            this.p0 = false;
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.c0 = new Handler();
        this.j0 = this.B == 0;
        if (bundle != null) {
            this.g0 = bundle.getInt("android:style", 0);
            this.h0 = bundle.getInt("android:theme", 0);
            this.i0 = bundle.getBoolean("android:cancelable", true);
            this.j0 = bundle.getBoolean("android:showsDialog", this.j0);
            this.k0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.o0) {
            if (n.E0(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            B1(true, true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = this.n0;
        if (dialog != null) {
            this.o0 = false;
            dialog.show();
            View decorView = this.n0.getWindow().getDecorView();
            u.a(decorView, this);
            v.a(decorView, this);
            androidx.savedstate.d.a(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Dialog dialog = this.n0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void r0() {
        super.r0();
        Dialog dialog = this.n0;
        if (dialog != null) {
            this.o0 = true;
            dialog.setOnDismissListener(null);
            this.n0.dismiss();
            if (!this.p0) {
                onDismiss(this.n0);
            }
            this.n0 = null;
            this.r0 = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void s0() {
        super.s0();
        if (!this.q0 && !this.p0) {
            this.p0 = true;
        }
        U().i(this.m0);
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater t0(Bundle bundle) {
        String str;
        StringBuilder sb;
        LayoutInflater t0 = super.t0(bundle);
        if (!this.j0 || this.l0) {
            if (n.E0(2)) {
                String str2 = "getting layout inflater for DialogFragment " + this;
                if (!this.j0) {
                    sb = new StringBuilder();
                    str = "mShowsDialog = false: ";
                } else {
                    sb = new StringBuilder();
                    str = "mCreatingDialog = true: ";
                }
                sb.append(str);
                sb.append(str2);
                Log.d("FragmentManager", sb.toString());
            }
            return t0;
        }
        G1(bundle);
        if (n.E0(2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.n0;
        return dialog != null ? t0.cloneInContext(dialog.getContext()) : t0;
    }
}

package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.app.a;
import androidx.lifecycle.d;
import androidx.lifecycle.h;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* loaded from: classes.dex */
public class e extends ComponentActivity implements a.c, a.e {
    boolean o;
    boolean p;
    final i m = i.b(new c());
    final h n = new h(this);
    boolean q = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements SavedStateRegistry.b {
        a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.b
        public Bundle a() {
            Bundle bundle = new Bundle();
            e.this.u();
            e.this.n.h(d.b.ON_STOP);
            Parcelable x = e.this.m.x();
            if (x != null) {
                bundle.putParcelable("android:support:fragments", x);
            }
            return bundle;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements androidx.activity.d.b {
        b() {
        }

        @Override // androidx.activity.d.b
        public void a(Context context) {
            e.this.m.a(null);
            Bundle a = e.this.j().a("android:support:fragments");
            if (a != null) {
                e.this.m.w(a.getParcelable("android:support:fragments"));
            }
        }
    }

    /* loaded from: classes.dex */
    class c extends k<e> implements t, androidx.activity.c, androidx.activity.result.e, r {
        public c() {
            super(e.this);
        }

        @Override // androidx.lifecycle.g
        public d a() {
            return e.this.n;
        }

        @Override // androidx.fragment.app.r
        public void b(n nVar, Fragment fragment) {
            e.this.w(fragment);
        }

        @Override // androidx.activity.result.e
        public androidx.activity.result.d c() {
            return e.this.c();
        }

        @Override // androidx.fragment.app.k, androidx.fragment.app.g
        public View e(int i2) {
            return e.this.findViewById(i2);
        }

        @Override // androidx.fragment.app.k, androidx.fragment.app.g
        public boolean f() {
            Window window = e.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.lifecycle.t
        public s g() {
            return e.this.g();
        }

        @Override // androidx.activity.c
        public OnBackPressedDispatcher i() {
            return e.this.i();
        }

        @Override // androidx.fragment.app.k
        public LayoutInflater n() {
            return e.this.getLayoutInflater().cloneInContext(e.this);
        }

        @Override // androidx.fragment.app.k
        public boolean o(Fragment fragment) {
            return !e.this.isFinishing();
        }

        @Override // androidx.fragment.app.k
        public void q() {
            e.this.z();
        }

        /* renamed from: r */
        public e m() {
            return e.this;
        }
    }

    public e() {
        t();
    }

    private void t() {
        j().d("android:support:fragments", new a());
        m(new b());
    }

    private static boolean v(n nVar, d.c cVar) {
        boolean z = false;
        for (Fragment fragment : nVar.r0()) {
            if (fragment != null) {
                if (fragment.B() != null) {
                    z |= v(fragment.s(), cVar);
                }
                a0 a0Var = fragment.W;
                if (a0Var != null && a0Var.a().b().a(d.c.STARTED)) {
                    fragment.W.h(cVar);
                    z = true;
                }
                if (fragment.V.b().a(d.c.STARTED)) {
                    fragment.V.o(cVar);
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // androidx.core.app.a.e
    @Deprecated
    public final void b(int i2) {
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.o);
        printWriter.print(" mResumed=");
        printWriter.print(this.p);
        printWriter.print(" mStopped=");
        printWriter.print(this.q);
        if (getApplication() != null) {
            e.i.a.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.m.t().W(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        this.m.u();
        super.onActivityResult(i2, i3, intent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.m.u();
        this.m.d(configuration);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.n.h(d.b.ON_CREATE);
        this.m.f();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i2, Menu menu) {
        return i2 == 0 ? super.onCreatePanelMenu(i2, menu) | this.m.g(menu, getMenuInflater()) : super.onCreatePanelMenu(i2, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View r = r(view, str, context, attributeSet);
        return r == null ? super.onCreateView(view, str, context, attributeSet) : r;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View r = r(null, str, context, attributeSet);
        return r == null ? super.onCreateView(str, context, attributeSet) : r;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.m.h();
        this.n.h(d.b.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.m.i();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 == 0) {
            return this.m.k(menuItem);
        }
        if (i2 != 6) {
            return false;
        }
        return this.m.e(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.m.j(z);
    }

    @Override // android.app.Activity
    protected void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.m.u();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i2, Menu menu) {
        if (i2 == 0) {
            this.m.l(menu);
        }
        super.onPanelClosed(i2, menu);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.p = false;
        this.m.m();
        this.n.h(d.b.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.m.n(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        y();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i2, View view, Menu menu) {
        return i2 == 0 ? x(view, menu) | this.m.o(menu) : super.onPreparePanel(i2, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        this.m.u();
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.p = true;
        this.m.u();
        this.m.s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.q = false;
        if (!this.o) {
            this.o = true;
            this.m.c();
        }
        this.m.u();
        this.m.s();
        this.n.h(d.b.ON_START);
        this.m.q();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.m.u();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.q = true;
        u();
        this.m.r();
        this.n.h(d.b.ON_STOP);
    }

    final View r(View view, String str, Context context, AttributeSet attributeSet) {
        return this.m.v(view, str, context, attributeSet);
    }

    public n s() {
        return this.m.t();
    }

    void u() {
        do {
        } while (v(s(), d.c.CREATED));
    }

    @Deprecated
    public void w(Fragment fragment) {
    }

    @Deprecated
    protected boolean x(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    protected void y() {
        this.n.h(d.b.ON_RESUME);
        this.m.p();
    }

    @Deprecated
    public void z() {
        invalidateOptionsMenu();
    }
}

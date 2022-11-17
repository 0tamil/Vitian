package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.t;
import e.d.o.d;
/* loaded from: classes.dex */
public class i {
    private final k<?> a;

    private i(k<?> kVar) {
        this.a = kVar;
    }

    public static i b(k<?> kVar) {
        d.e(kVar, "callbacks == null");
        return new i(kVar);
    }

    public void a(Fragment fragment) {
        k<?> kVar = this.a;
        kVar.f762h.j(kVar, kVar, fragment);
    }

    public void c() {
        this.a.f762h.y();
    }

    public void d(Configuration configuration) {
        this.a.f762h.A(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.a.f762h.B(menuItem);
    }

    public void f() {
        this.a.f762h.C();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.a.f762h.D(menu, menuInflater);
    }

    public void h() {
        this.a.f762h.E();
    }

    public void i() {
        this.a.f762h.G();
    }

    public void j(boolean z) {
        this.a.f762h.H(z);
    }

    public boolean k(MenuItem menuItem) {
        return this.a.f762h.J(menuItem);
    }

    public void l(Menu menu) {
        this.a.f762h.K(menu);
    }

    public void m() {
        this.a.f762h.M();
    }

    public void n(boolean z) {
        this.a.f762h.N(z);
    }

    public boolean o(Menu menu) {
        return this.a.f762h.O(menu);
    }

    public void p() {
        this.a.f762h.Q();
    }

    public void q() {
        this.a.f762h.R();
    }

    public void r() {
        this.a.f762h.T();
    }

    public boolean s() {
        return this.a.f762h.a0(true);
    }

    public n t() {
        return this.a.f762h;
    }

    public void u() {
        this.a.f762h.Q0();
    }

    public View v(View view, String str, Context context, AttributeSet attributeSet) {
        return this.a.f762h.t0().onCreateView(view, str, context, attributeSet);
    }

    public void w(Parcelable parcelable) {
        k<?> kVar = this.a;
        if (kVar instanceof t) {
            kVar.f762h.c1(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    public Parcelable x() {
        return this.a.f762h.e1();
    }
}

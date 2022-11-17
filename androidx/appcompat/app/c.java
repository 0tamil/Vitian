package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.c1;
import androidx.core.app.h;
import androidx.core.app.q;
import androidx.fragment.app.e;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.d;
import e.a.n.b;
/* loaded from: classes.dex */
public class c extends e implements d, q.a {
    private e r;
    private Resources s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements SavedStateRegistry.b {
        a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.b
        public Bundle a() {
            Bundle bundle = new Bundle();
            c.this.A().u(bundle);
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
            e A = c.this.A();
            A.n();
            A.q(c.this.j().a("androidx:appcompat"));
        }
    }

    public c() {
        C();
    }

    private void C() {
        j().d("androidx:appcompat", new a());
        m(new b());
    }

    private boolean I(KeyEvent keyEvent) {
        Window window;
        return Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent);
    }

    private void o() {
        u.a(getWindow().getDecorView(), this);
        v.a(getWindow().getDecorView(), this);
        d.a(getWindow().getDecorView(), this);
    }

    public e A() {
        if (this.r == null) {
            this.r = e.g(this, this);
        }
        return this.r;
    }

    public androidx.appcompat.app.a B() {
        return A().m();
    }

    public void D(q qVar) {
        qVar.i(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void E(int i2) {
    }

    public void F(q qVar) {
    }

    @Deprecated
    public void G() {
    }

    public boolean H() {
        Intent e2 = e();
        if (e2 == null) {
            return false;
        }
        if (K(e2)) {
            q k2 = q.k(this);
            D(k2);
            F(k2);
            k2.l();
            try {
                androidx.core.app.a.n(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            J(e2);
            return true;
        }
    }

    public void J(Intent intent) {
        h.e(this, intent);
    }

    public boolean K(Intent intent) {
        return h.f(this, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        o();
        A().d(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(A().f(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        androidx.appcompat.app.a B = B();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (B == null || !B.g()) {
            super.closeOptionsMenu();
        }
    }

    @Override // androidx.core.app.g, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        androidx.appcompat.app.a B = B();
        if (keyCode != 82 || B == null || !B.p(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.core.app.q.a
    public Intent e() {
        return h.a(this);
    }

    @Override // androidx.appcompat.app.d
    public void f(e.a.n.b bVar) {
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i2) {
        return (T) A().i(i2);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return A().l();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.s == null && c1.b()) {
            this.s = new c1(this, super.getResources());
        }
        Resources resources = this.s;
        return resources == null ? super.getResources() : resources;
    }

    @Override // androidx.appcompat.app.d
    public void h(e.a.n.b bVar) {
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        A().o();
    }

    @Override // androidx.appcompat.app.d
    public e.a.n.b k(b.a aVar) {
        return null;
    }

    @Override // androidx.fragment.app.e, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.s != null) {
            this.s.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        A().p(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        G();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        A().r();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (I(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // androidx.fragment.app.e, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        androidx.appcompat.app.a B = B();
        if (menuItem.getItemId() != 16908332 || B == null || (B.j() & 4) == 0) {
            return false;
        }
        return H();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i2, Menu menu) {
        return super.onMenuOpened(i2, menu);
    }

    @Override // androidx.fragment.app.e, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i2, Menu menu) {
        super.onPanelClosed(i2, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        A().s(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.e, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        A().t();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.e, android.app.Activity
    public void onStart() {
        super.onStart();
        A().v();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.e, android.app.Activity
    public void onStop() {
        super.onStop();
        A().w();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i2) {
        super.onTitleChanged(charSequence, i2);
        A().E(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        androidx.appcompat.app.a B = B();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (B == null || !B.q()) {
            super.openOptionsMenu();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i2) {
        o();
        A().A(i2);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        o();
        A().B(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        o();
        A().C(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
        super.setTheme(i2);
        A().D(i2);
    }

    @Override // androidx.fragment.app.e
    public void z() {
        A().o();
    }
}

package e.d.p;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* loaded from: classes.dex */
public abstract class b {
    private AbstractC0074b a;

    /* loaded from: classes.dex */
    public interface a {
    }

    /* renamed from: e.d.p.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface AbstractC0074b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public b(Context context) {
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public void f(SubMenu subMenu) {
    }

    public boolean g() {
        return false;
    }

    public void h() {
        this.a = null;
    }

    public void i(a aVar) {
    }

    public void j(AbstractC0074b bVar) {
        if (!(this.a == null || bVar == null)) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.a = bVar;
    }
}

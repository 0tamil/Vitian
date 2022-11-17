package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import e.c.g;
import e.d.k.a.b;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class c {
    final Context a;
    private g<b, MenuItem> b;
    private g<e.d.k.a.c, SubMenu> c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context) {
        this.a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof b)) {
            return menuItem;
        }
        b bVar = (b) menuItem;
        if (this.b == null) {
            this.b = new g<>();
        }
        MenuItem menuItem2 = this.b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        j jVar = new j(this.a, bVar);
        this.b.put(bVar, jVar);
        return jVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof e.d.k.a.c)) {
            return subMenu;
        }
        e.d.k.a.c cVar = (e.d.k.a.c) subMenu;
        if (this.c == null) {
            this.c = new g<>();
        }
        SubMenu subMenu2 = this.c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        s sVar = new s(this.a, cVar);
        this.c.put(cVar, sVar);
        return sVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        g<b, MenuItem> gVar = this.b;
        if (gVar != null) {
            gVar.clear();
        }
        g<e.d.k.a.c, SubMenu> gVar2 = this.c;
        if (gVar2 != null) {
            gVar2.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(int i2) {
        if (this.b != null) {
            int i3 = 0;
            while (i3 < this.b.size()) {
                if (this.b.i(i3).getGroupId() == i2) {
                    this.b.j(i3);
                    i3--;
                }
                i3++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(int i2) {
        if (this.b != null) {
            for (int i3 = 0; i3 < this.b.size(); i3++) {
                if (this.b.i(i3).getItemId() == i2) {
                    this.b.j(i3);
                    return;
                }
            }
        }
    }
}

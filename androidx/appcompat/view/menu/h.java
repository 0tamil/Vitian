package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.m;
import e.a.g;
/* loaded from: classes.dex */
class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, m.a {

    /* renamed from: e  reason: collision with root package name */
    private g f237e;

    /* renamed from: f  reason: collision with root package name */
    private b f238f;

    /* renamed from: g  reason: collision with root package name */
    e f239g;

    /* renamed from: h  reason: collision with root package name */
    private m.a f240h;

    public h(g gVar) {
        this.f237e = gVar;
    }

    public void a() {
        b bVar = this.f238f;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.m.a
    public void b(g gVar, boolean z) {
        if (z || gVar == this.f237e) {
            a();
        }
        m.a aVar = this.f240h;
        if (aVar != null) {
            aVar.b(gVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.m.a
    public boolean c(g gVar) {
        m.a aVar = this.f240h;
        if (aVar != null) {
            return aVar.c(gVar);
        }
        return false;
    }

    public void d(IBinder iBinder) {
        g gVar = this.f237e;
        b.a aVar = new b.a(gVar.u());
        e eVar = new e(aVar.b(), g.f1937j);
        this.f239g = eVar;
        eVar.h(this);
        this.f237e.b(this.f239g);
        aVar.c(this.f239g.a(), this);
        View y = gVar.y();
        if (y != null) {
            aVar.d(y);
        } else {
            aVar.e(gVar.w());
            aVar.h(gVar.x());
        }
        aVar.f(this);
        b a = aVar.a();
        this.f238f = a;
        a.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f238f.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f238f.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i2) {
        this.f237e.L((i) this.f239g.a().getItem(i2), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f239g.b(this.f237e, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i2 == 82 || i2 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f238f.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f238f.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f237e.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f237e.performShortcut(i2, keyEvent, 0);
    }
}

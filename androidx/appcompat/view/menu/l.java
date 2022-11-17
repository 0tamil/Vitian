package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.m;
import e.a.d;
import e.d.p.e;
import e.d.p.u;
/* loaded from: classes.dex */
public class l {
    private final Context a;
    private final g b;
    private final boolean c;

    /* renamed from: d  reason: collision with root package name */
    private final int f254d;

    /* renamed from: e  reason: collision with root package name */
    private final int f255e;

    /* renamed from: f  reason: collision with root package name */
    private View f256f;

    /* renamed from: g  reason: collision with root package name */
    private int f257g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f258h;

    /* renamed from: i  reason: collision with root package name */
    private m.a f259i;

    /* renamed from: j  reason: collision with root package name */
    private k f260j;

    /* renamed from: k  reason: collision with root package name */
    private PopupWindow.OnDismissListener f261k;
    private final PopupWindow.OnDismissListener l;

    /* loaded from: classes.dex */
    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            l.this.e();
        }
    }

    public l(Context context, g gVar, View view, boolean z, int i2) {
        this(context, gVar, view, z, i2, 0);
    }

    public l(Context context, g gVar, View view, boolean z, int i2, int i3) {
        this.f257g = 8388611;
        this.l = new a();
        this.a = context;
        this.b = gVar;
        this.f256f = view;
        this.c = z;
        this.f254d = i2;
        this.f255e = i3;
    }

    private k a() {
        Display defaultDisplay = ((WindowManager) this.a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else {
            defaultDisplay.getSize(point);
        }
        k dVar = Math.min(point.x, point.y) >= this.a.getResources().getDimensionPixelSize(d.c_res_0x7f060016) ? new d(this.a, this.f256f, this.f254d, this.f255e, this.c) : new q(this.a, this.b, this.f256f, this.f254d, this.f255e, this.c);
        dVar.l(this.b);
        dVar.u(this.l);
        dVar.p(this.f256f);
        dVar.h(this.f259i);
        dVar.r(this.f258h);
        dVar.s(this.f257g);
        return dVar;
    }

    private void l(int i2, int i3, boolean z, boolean z2) {
        k c = c();
        c.v(z2);
        if (z) {
            if ((e.a(this.f257g, u.o(this.f256f)) & 7) == 5) {
                i2 -= this.f256f.getWidth();
            }
            c.t(i2);
            c.w(i3);
            int i4 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c.q(new Rect(i2 - i4, i3 - i4, i2 + i4, i3 + i4));
        }
        c.a();
    }

    public void b() {
        if (d()) {
            this.f260j.dismiss();
        }
    }

    public k c() {
        if (this.f260j == null) {
            this.f260j = a();
        }
        return this.f260j;
    }

    public boolean d() {
        k kVar = this.f260j;
        return kVar != null && kVar.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e() {
        this.f260j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f261k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f256f = view;
    }

    public void g(boolean z) {
        this.f258h = z;
        k kVar = this.f260j;
        if (kVar != null) {
            kVar.r(z);
        }
    }

    public void h(int i2) {
        this.f257g = i2;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f261k = onDismissListener;
    }

    public void j(m.a aVar) {
        this.f259i = aVar;
        k kVar = this.f260j;
        if (kVar != null) {
            kVar.h(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f256f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i2, int i3) {
        if (d()) {
            return true;
        }
        if (this.f256f == null) {
            return false;
        }
        l(i2, i3, true, true);
        return true;
    }
}

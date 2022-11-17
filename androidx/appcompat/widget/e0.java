package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.m;
import e.d.p.y;
/* loaded from: classes.dex */
public interface e0 {
    void a(Menu menu, m.a aVar);

    boolean b();

    boolean c();

    void collapseActionView();

    boolean d();

    boolean e();

    void f();

    boolean g();

    Context getContext();

    CharSequence getTitle();

    void h();

    int i();

    void j(int i2);

    void k(int i2);

    void l(q0 q0Var);

    ViewGroup m();

    void n(boolean z);

    int o();

    y p(int i2, long j2);

    void q();

    boolean r();

    void s();

    void setIcon(int i2);

    void setIcon(Drawable drawable);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    void t(boolean z);

    void u(int i2);
}

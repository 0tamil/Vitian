package e.a.n;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContextView;
import e.a.n.b;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class e extends b implements g.a {

    /* renamed from: g  reason: collision with root package name */
    private Context f1978g;

    /* renamed from: h  reason: collision with root package name */
    private ActionBarContextView f1979h;

    /* renamed from: i  reason: collision with root package name */
    private b.a f1980i;

    /* renamed from: j  reason: collision with root package name */
    private WeakReference<View> f1981j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f1982k;
    private g l;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z) {
        this.f1978g = context;
        this.f1979h = actionBarContextView;
        this.f1980i = aVar;
        g gVar = new g(actionBarContextView.getContext());
        gVar.S(1);
        this.l = gVar;
        gVar.R(this);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(g gVar, MenuItem menuItem) {
        return this.f1980i.b(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void b(g gVar) {
        k();
        this.f1979h.l();
    }

    @Override // e.a.n.b
    public void c() {
        if (!this.f1982k) {
            this.f1982k = true;
            this.f1979h.sendAccessibilityEvent(32);
            this.f1980i.d(this);
        }
    }

    @Override // e.a.n.b
    public View d() {
        WeakReference<View> weakReference = this.f1981j;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // e.a.n.b
    public Menu e() {
        return this.l;
    }

    @Override // e.a.n.b
    public MenuInflater f() {
        return new g(this.f1979h.getContext());
    }

    @Override // e.a.n.b
    public CharSequence g() {
        return this.f1979h.getSubtitle();
    }

    @Override // e.a.n.b
    public CharSequence i() {
        return this.f1979h.getTitle();
    }

    @Override // e.a.n.b
    public void k() {
        this.f1980i.a(this, this.l);
    }

    @Override // e.a.n.b
    public boolean l() {
        return this.f1979h.j();
    }

    @Override // e.a.n.b
    public void m(View view) {
        this.f1979h.setCustomView(view);
        this.f1981j = view != null ? new WeakReference<>(view) : null;
    }

    @Override // e.a.n.b
    public void n(int i2) {
        o(this.f1978g.getString(i2));
    }

    @Override // e.a.n.b
    public void o(CharSequence charSequence) {
        this.f1979h.setSubtitle(charSequence);
    }

    @Override // e.a.n.b
    public void q(int i2) {
        r(this.f1978g.getString(i2));
    }

    @Override // e.a.n.b
    public void r(CharSequence charSequence) {
        this.f1979h.setTitle(charSequence);
    }

    @Override // e.a.n.b
    public void s(boolean z) {
        super.s(z);
        this.f1979h.setTitleOptional(z);
    }
}

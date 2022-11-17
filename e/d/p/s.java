package e.d.p;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;
/* loaded from: classes.dex */
public final class s implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: e  reason: collision with root package name */
    private final View f2138e;

    /* renamed from: f  reason: collision with root package name */
    private ViewTreeObserver f2139f;

    /* renamed from: g  reason: collision with root package name */
    private final Runnable f2140g;

    private s(View view, Runnable runnable) {
        this.f2138e = view;
        this.f2139f = view.getViewTreeObserver();
        this.f2140g = runnable;
    }

    public static s a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        Objects.requireNonNull(runnable, "runnable == null");
        s sVar = new s(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(sVar);
        view.addOnAttachStateChangeListener(sVar);
        return sVar;
    }

    public void b() {
        (this.f2139f.isAlive() ? this.f2139f : this.f2138e.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f2138e.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f2140g.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f2139f = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}

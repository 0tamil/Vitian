package e.d.p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class y {
    private WeakReference<View> a;
    Runnable b = null;
    Runnable c = null;

    /* renamed from: d  reason: collision with root package name */
    int f2147d = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        final /* synthetic */ z a;
        final /* synthetic */ View b;

        a(y yVar, z zVar, View view) {
            this.a = zVar;
            this.b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a.c(this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.a(this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.a.b(this.b);
        }
    }

    /* loaded from: classes.dex */
    class b implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ b0 a;
        final /* synthetic */ View b;

        b(y yVar, b0 b0Var, View view) {
            this.a = b0Var;
            this.b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.a.a(this.b);
        }
    }

    /* loaded from: classes.dex */
    static class c implements z {
        y a;
        boolean b;

        c(y yVar) {
            this.a = yVar;
        }

        @Override // e.d.p.z
        @SuppressLint({"WrongConstant"})
        public void a(View view) {
            int i2 = this.a.f2147d;
            z zVar = null;
            if (i2 > -1) {
                view.setLayerType(i2, null);
                this.a.f2147d = -1;
            }
            if (Build.VERSION.SDK_INT >= 16 || !this.b) {
                y yVar = this.a;
                Runnable runnable = yVar.c;
                if (runnable != null) {
                    yVar.c = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                if (tag instanceof z) {
                    zVar = (z) tag;
                }
                if (zVar != null) {
                    zVar.a(view);
                }
                this.b = true;
            }
        }

        @Override // e.d.p.z
        public void b(View view) {
            this.b = false;
            z zVar = null;
            if (this.a.f2147d > -1) {
                view.setLayerType(2, null);
            }
            y yVar = this.a;
            Runnable runnable = yVar.b;
            if (runnable != null) {
                yVar.b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            if (tag instanceof z) {
                zVar = (z) tag;
            }
            if (zVar != null) {
                zVar.b(view);
            }
        }

        @Override // e.d.p.z
        public void c(View view) {
            Object tag = view.getTag(2113929216);
            z zVar = tag instanceof z ? (z) tag : null;
            if (zVar != null) {
                zVar.c(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(View view) {
        this.a = new WeakReference<>(view);
    }

    private void g(View view, z zVar) {
        if (zVar != null) {
            view.animate().setListener(new a(this, zVar, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public y a(float f2) {
        View view = this.a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
        return this;
    }

    public void b() {
        View view = this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long c() {
        View view = this.a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public y d(long j2) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setDuration(j2);
        }
        return this;
    }

    public y e(Interpolator interpolator) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public y f(z zVar) {
        View view = this.a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT < 16) {
                view.setTag(2113929216, zVar);
                zVar = new c(this);
            }
            g(view, zVar);
        }
        return this;
    }

    public y h(long j2) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setStartDelay(j2);
        }
        return this;
    }

    public y i(b0 b0Var) {
        View view = this.a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            b bVar = null;
            if (b0Var != null) {
                bVar = new b(this, b0Var, view);
            }
            view.animate().setUpdateListener(bVar);
        }
        return this;
    }

    public void j() {
        View view = this.a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public y k(float f2) {
        View view = this.a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
        return this;
    }
}

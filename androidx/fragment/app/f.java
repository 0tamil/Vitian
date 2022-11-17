package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.fragment.app.x;
import e.d.l.b;
import e.d.p.s;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements b.a {
        final /* synthetic */ Fragment a;

        a(Fragment fragment) {
            this.a = fragment;
        }

        @Override // e.d.l.b.a
        public void a() {
            if (this.a.p() != null) {
                View p = this.a.p();
                this.a.l1(null);
                p.clearAnimation();
            }
            this.a.n1(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Animation.AnimationListener {
        final /* synthetic */ ViewGroup a;
        final /* synthetic */ Fragment b;
        final /* synthetic */ x.g c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e.d.l.b f746d;

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.this.b.p() != null) {
                    b.this.b.l1(null);
                    b bVar = b.this;
                    bVar.c.a(bVar.b, bVar.f746d);
                }
            }
        }

        b(ViewGroup viewGroup, Fragment fragment, x.g gVar, e.d.l.b bVar) {
            this.a = viewGroup;
            this.b = fragment;
            this.c = gVar;
            this.f746d = bVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        final /* synthetic */ ViewGroup a;
        final /* synthetic */ View b;
        final /* synthetic */ Fragment c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ x.g f748d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e.d.l.b f749e;

        c(ViewGroup viewGroup, View view, Fragment fragment, x.g gVar, e.d.l.b bVar) {
            this.a = viewGroup;
            this.b = view;
            this.c = fragment;
            this.f748d = gVar;
            this.f749e = bVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.endViewTransition(this.b);
            Animator r = this.c.r();
            this.c.n1(null);
            if (r != null && this.a.indexOfChild(this.b) < 0) {
                this.f748d.a(this.c, this.f749e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d {
        public final Animation a;
        public final Animator b;

        d(Animator animator) {
            this.a = null;
            this.b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        d(Animation animation) {
            this.a = animation;
            this.b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class e extends AnimationSet implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        private final ViewGroup f750e;

        /* renamed from: f  reason: collision with root package name */
        private final View f751f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f752g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f753h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f754i = true;

        /* JADX INFO: Access modifiers changed from: package-private */
        public e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f750e = viewGroup;
            this.f751f = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j2, Transformation transformation) {
            this.f754i = true;
            if (this.f752g) {
                return !this.f753h;
            }
            if (!super.getTransformation(j2, transformation)) {
                this.f752g = true;
                s.a(this.f750e, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j2, Transformation transformation, float f2) {
            this.f754i = true;
            if (this.f752g) {
                return !this.f753h;
            }
            if (!super.getTransformation(j2, transformation, f2)) {
                this.f752g = true;
                s.a(this.f750e, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f752g || !this.f754i) {
                this.f750e.endViewTransition(this.f751f);
                this.f753h = true;
                return;
            }
            this.f754i = false;
            this.f750e.post(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Fragment fragment, d dVar, x.g gVar) {
        View view = fragment.L;
        ViewGroup viewGroup = fragment.K;
        viewGroup.startViewTransition(view);
        e.d.l.b bVar = new e.d.l.b();
        bVar.c(new a(fragment));
        gVar.b(fragment, bVar);
        if (dVar.a != null) {
            e eVar = new e(dVar.a, viewGroup, view);
            fragment.l1(fragment.L);
            eVar.setAnimationListener(new b(viewGroup, fragment, gVar, bVar));
            fragment.L.startAnimation(eVar);
            return;
        }
        Animator animator = dVar.b;
        fragment.n1(animator);
        animator.addListener(new c(viewGroup, view, fragment, gVar, bVar));
        animator.setTarget(fragment.L);
        animator.start();
    }

    private static int b(Fragment fragment, boolean z, boolean z2) {
        return z2 ? z ? fragment.I() : fragment.J() : z ? fragment.u() : fragment.x();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d c(Context context, Fragment fragment, boolean z, boolean z2) {
        int E = fragment.E();
        int b2 = b(fragment, z, z2);
        boolean z3 = false;
        fragment.m1(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.K;
        if (viewGroup != null) {
            int i2 = e.g.b.c_res_0x7f0800c8;
            if (viewGroup.getTag(i2) != null) {
                fragment.K.setTag(i2, null);
            }
        }
        ViewGroup viewGroup2 = fragment.K;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation m0 = fragment.m0(E, z, b2);
        if (m0 != null) {
            return new d(m0);
        }
        Animator n0 = fragment.n0(E, z, b2);
        if (n0 != null) {
            return new d(n0);
        }
        if (b2 == 0 && E != 0) {
            b2 = d(E, z);
        }
        if (b2 != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(b2));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, b2);
                    if (loadAnimation != null) {
                        return new d(loadAnimation);
                    }
                    z3 = true;
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                }
            }
            if (!z3) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, b2);
                    if (loadAnimator != null) {
                        return new d(loadAnimator);
                    }
                } catch (RuntimeException e3) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, b2);
                        if (loadAnimation2 != null) {
                            return new d(loadAnimation2);
                        }
                    } else {
                        throw e3;
                    }
                }
            }
        }
        return null;
    }

    private static int d(int i2, boolean z) {
        if (i2 == 4097) {
            return z ? e.g.a.f2158e : e.g.a.f2159f;
        }
        if (i2 == 4099) {
            return z ? e.g.a.c : e.g.a.f2157d;
        }
        if (i2 != 8194) {
            return -1;
        }
        return z ? e.g.a.a : e.g.a.b;
    }
}

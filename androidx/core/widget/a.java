package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import e.d.p.u;
/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {
    private static final int v = ViewConfiguration.getTapTimeout();

    /* renamed from: g  reason: collision with root package name */
    final View f655g;

    /* renamed from: h  reason: collision with root package name */
    private Runnable f656h;

    /* renamed from: k  reason: collision with root package name */
    private int f659k;
    private int l;
    private boolean p;
    boolean q;
    boolean r;
    boolean s;
    private boolean t;
    private boolean u;

    /* renamed from: e  reason: collision with root package name */
    final C0018a f653e = new C0018a();

    /* renamed from: f  reason: collision with root package name */
    private final Interpolator f654f = new AccelerateInterpolator();

    /* renamed from: i  reason: collision with root package name */
    private float[] f657i = {0.0f, 0.0f};

    /* renamed from: j  reason: collision with root package name */
    private float[] f658j = {Float.MAX_VALUE, Float.MAX_VALUE};
    private float[] m = {0.0f, 0.0f};
    private float[] n = {0.0f, 0.0f};
    private float[] o = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0018a {
        private int a;
        private int b;
        private float c;

        /* renamed from: d  reason: collision with root package name */
        private float f660d;

        /* renamed from: j  reason: collision with root package name */
        private float f666j;

        /* renamed from: k  reason: collision with root package name */
        private int f667k;

        /* renamed from: e  reason: collision with root package name */
        private long f661e = Long.MIN_VALUE;

        /* renamed from: i  reason: collision with root package name */
        private long f665i = -1;

        /* renamed from: f  reason: collision with root package name */
        private long f662f = 0;

        /* renamed from: g  reason: collision with root package name */
        private int f663g = 0;

        /* renamed from: h  reason: collision with root package name */
        private int f664h = 0;

        C0018a() {
        }

        private float e(long j2) {
            long j3 = this.f661e;
            if (j2 < j3) {
                return 0.0f;
            }
            long j4 = this.f665i;
            if (j4 < 0 || j2 < j4) {
                return a.e(((float) (j2 - j3)) / this.a, 0.0f, 1.0f) * 0.5f;
            }
            float f2 = this.f666j;
            return (1.0f - f2) + (f2 * a.e(((float) (j2 - j4)) / this.f667k, 0.0f, 1.0f));
        }

        private float g(float f2) {
            return ((-4.0f) * f2 * f2) + (f2 * 4.0f);
        }

        public void a() {
            if (this.f662f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float g2 = g(e(currentAnimationTimeMillis));
                this.f662f = currentAnimationTimeMillis;
                float f2 = ((float) (currentAnimationTimeMillis - this.f662f)) * g2;
                this.f663g = (int) (this.c * f2);
                this.f664h = (int) (f2 * this.f660d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        public int b() {
            return this.f663g;
        }

        public int c() {
            return this.f664h;
        }

        public int d() {
            float f2 = this.c;
            return (int) (f2 / Math.abs(f2));
        }

        public int f() {
            float f2 = this.f660d;
            return (int) (f2 / Math.abs(f2));
        }

        public boolean h() {
            return this.f665i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f665i + ((long) this.f667k);
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f667k = a.f((int) (currentAnimationTimeMillis - this.f661e), 0, this.b);
            this.f666j = e(currentAnimationTimeMillis);
            this.f665i = currentAnimationTimeMillis;
        }

        public void j(int i2) {
            this.b = i2;
        }

        public void k(int i2) {
            this.a = i2;
        }

        public void l(float f2, float f3) {
            this.c = f2;
            this.f660d = f3;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f661e = currentAnimationTimeMillis;
            this.f665i = -1L;
            this.f662f = currentAnimationTimeMillis;
            this.f666j = 0.5f;
            this.f663g = 0;
            this.f664h = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.s) {
                if (aVar.q) {
                    aVar.q = false;
                    aVar.f653e.m();
                }
                C0018a aVar2 = a.this.f653e;
                if (aVar2.h() || !a.this.u()) {
                    a.this.s = false;
                    return;
                }
                a aVar3 = a.this;
                if (aVar3.r) {
                    aVar3.r = false;
                    aVar3.c();
                }
                aVar2.a();
                a.this.j(aVar2.b(), aVar2.c());
                u.F(a.this.f655g, this);
            }
        }
    }

    public a(View view) {
        this.f655g = view;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f3 = (int) ((1575.0f * f2) + 0.5f);
        o(f3, f3);
        float f4 = (int) ((f2 * 315.0f) + 0.5f);
        p(f4, f4);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(v);
        r(500);
        q(500);
    }

    private float d(int i2, float f2, float f3, float f4) {
        float h2 = h(this.f657i[i2], f3, this.f658j[i2], f2);
        int i3 = (h2 > 0.0f ? 1 : (h2 == 0.0f ? 0 : -1));
        if (i3 == 0) {
            return 0.0f;
        }
        float f5 = this.m[i2];
        float f6 = this.n[i2];
        float f7 = this.o[i2];
        float f8 = f5 * f4;
        return i3 > 0 ? e(h2 * f8, f6, f7) : -e((-h2) * f8, f6, f7);
    }

    static float e(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    static int f(int i2, int i3, int i4) {
        return i2 > i4 ? i4 : i2 < i3 ? i3 : i2;
    }

    private float g(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i2 = this.f659k;
        if (i2 == 0 || i2 == 1) {
            if (f2 < f3) {
                if (f2 >= 0.0f) {
                    return 1.0f - (f2 / f3);
                }
                if (this.s && i2 == 1) {
                    return 1.0f;
                }
            }
        } else if (i2 == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
        return 0.0f;
    }

    private float h(float f2, float f3, float f4, float f5) {
        float f6;
        float e2 = e(f2 * f3, 0.0f, f4);
        float g2 = g(f3 - f5, e2) - g(f5, e2);
        if (g2 < 0.0f) {
            f6 = -this.f654f.getInterpolation(-g2);
        } else if (g2 <= 0.0f) {
            return 0.0f;
        } else {
            f6 = this.f654f.getInterpolation(g2);
        }
        return e(f6, -1.0f, 1.0f);
    }

    private void i() {
        if (this.q) {
            this.s = false;
        } else {
            this.f653e.i();
        }
    }

    private void v() {
        int i2;
        if (this.f656h == null) {
            this.f656h = new b();
        }
        this.s = true;
        this.q = true;
        if (this.p || (i2 = this.l) <= 0) {
            this.f656h.run();
        } else {
            u.G(this.f655g, this.f656h, i2);
        }
        this.p = true;
    }

    public abstract boolean a(int i2);

    public abstract boolean b(int i2);

    void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f655g.onTouchEvent(obtain);
        obtain.recycle();
    }

    public abstract void j(int i2, int i3);

    public a k(int i2) {
        this.l = i2;
        return this;
    }

    public a l(int i2) {
        this.f659k = i2;
        return this;
    }

    public a m(boolean z) {
        if (this.t && !z) {
            i();
        }
        this.t = z;
        return this;
    }

    public a n(float f2, float f3) {
        float[] fArr = this.f658j;
        fArr[0] = f2;
        fArr[1] = f3;
        return this;
    }

    public a o(float f2, float f3) {
        float[] fArr = this.o;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 != 3) goto L19;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.t) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                }
            }
            i();
            return this.u && this.s;
        }
        this.r = true;
        this.p = false;
        this.f653e.l(d(0, motionEvent.getX(), view.getWidth(), this.f655g.getWidth()), d(1, motionEvent.getY(), view.getHeight(), this.f655g.getHeight()));
        if (!this.s && u()) {
            v();
        }
        if (this.u) {
            return false;
        }
    }

    public a p(float f2, float f3) {
        float[] fArr = this.n;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    public a q(int i2) {
        this.f653e.j(i2);
        return this;
    }

    public a r(int i2) {
        this.f653e.k(i2);
        return this;
    }

    public a s(float f2, float f3) {
        float[] fArr = this.f657i;
        fArr[0] = f2;
        fArr[1] = f3;
        return this;
    }

    public a t(float f2, float f3) {
        float[] fArr = this.m;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    boolean u() {
        C0018a aVar = this.f653e;
        int f2 = aVar.f();
        int d2 = aVar.d();
        return (f2 != 0 && b(f2)) || (d2 != 0 && a(d2));
    }
}

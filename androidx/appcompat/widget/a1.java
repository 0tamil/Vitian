package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import e.d.p.u;
import e.d.p.v;
/* loaded from: classes.dex */
class a1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    private static a1 n;
    private static a1 o;

    /* renamed from: e  reason: collision with root package name */
    private final View f354e;

    /* renamed from: f  reason: collision with root package name */
    private final CharSequence f355f;

    /* renamed from: g  reason: collision with root package name */
    private final int f356g;

    /* renamed from: h  reason: collision with root package name */
    private final Runnable f357h = new a();

    /* renamed from: i  reason: collision with root package name */
    private final Runnable f358i = new b();

    /* renamed from: j  reason: collision with root package name */
    private int f359j;

    /* renamed from: k  reason: collision with root package name */
    private int f360k;
    private b1 l;
    private boolean m;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a1.this.g(false);
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a1.this.c();
        }
    }

    private a1(View view, CharSequence charSequence) {
        this.f354e = view;
        this.f355f = charSequence;
        this.f356g = v.a(ViewConfiguration.get(view.getContext()));
        b();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void a() {
        this.f354e.removeCallbacks(this.f357h);
    }

    private void b() {
        this.f359j = Integer.MAX_VALUE;
        this.f360k = Integer.MAX_VALUE;
    }

    private void d() {
        this.f354e.postDelayed(this.f357h, ViewConfiguration.getLongPressTimeout());
    }

    private static void e(a1 a1Var) {
        a1 a1Var2 = n;
        if (a1Var2 != null) {
            a1Var2.a();
        }
        n = a1Var;
        if (a1Var != null) {
            a1Var.d();
        }
    }

    public static void f(View view, CharSequence charSequence) {
        a1 a1Var = n;
        if (a1Var != null && a1Var.f354e == view) {
            e(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            a1 a1Var2 = o;
            if (a1Var2 != null && a1Var2.f354e == view) {
                a1Var2.c();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new a1(view, charSequence);
    }

    private boolean h(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.f359j) <= this.f356g && Math.abs(y - this.f360k) <= this.f356g) {
            return false;
        }
        this.f359j = x;
        this.f360k = y;
        return true;
    }

    void c() {
        if (o == this) {
            o = null;
            b1 b1Var = this.l;
            if (b1Var != null) {
                b1Var.c();
                this.l = null;
                b();
                this.f354e.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (n == this) {
            e(null);
        }
        this.f354e.removeCallbacks(this.f358i);
    }

    void g(boolean z) {
        long j2;
        if (u.x(this.f354e)) {
            e(null);
            a1 a1Var = o;
            if (a1Var != null) {
                a1Var.c();
            }
            o = this;
            this.m = z;
            b1 b1Var = new b1(this.f354e.getContext());
            this.l = b1Var;
            b1Var.e(this.f354e, this.f359j, this.f360k, this.m, this.f355f);
            this.f354e.addOnAttachStateChangeListener(this);
            if (this.m) {
                j2 = 2500;
            } else {
                j2 = ((u.u(this.f354e) & 1) == 1 ? 3000L : 15000L) - ViewConfiguration.getLongPressTimeout();
            }
            this.f354e.removeCallbacks(this.f358i);
            this.f354e.postDelayed(this.f358i, j2);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.l != null && this.m) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f354e.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                b();
                c();
            }
        } else if (this.f354e.isEnabled() && this.l == null && h(motionEvent)) {
            e(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f359j = view.getWidth() / 2;
        this.f360k = view.getHeight() / 2;
        g(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        c();
    }
}

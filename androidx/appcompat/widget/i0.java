package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.appcompat.view.menu.p;
/* loaded from: classes.dex */
public abstract class i0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: e  reason: collision with root package name */
    private final float f406e;

    /* renamed from: f  reason: collision with root package name */
    private final int f407f;

    /* renamed from: g  reason: collision with root package name */
    private final int f408g;

    /* renamed from: h  reason: collision with root package name */
    final View f409h;

    /* renamed from: i  reason: collision with root package name */
    private Runnable f410i;

    /* renamed from: j  reason: collision with root package name */
    private Runnable f411j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f412k;
    private int l;
    private final int[] m = new int[2];

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = i0.this.f409h.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i0.this.e();
        }
    }

    public i0(View view) {
        this.f409h = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f406e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f407f = tapTimeout;
        this.f408g = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        Runnable runnable = this.f411j;
        if (runnable != null) {
            this.f409h.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f410i;
        if (runnable2 != null) {
            this.f409h.removeCallbacks(runnable2);
        }
    }

    private boolean f(MotionEvent motionEvent) {
        g0 g0Var;
        View view = this.f409h;
        p b2 = b();
        if (b2 == null || !b2.c() || (g0Var = (g0) b2.k()) == null || !g0Var.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        i(view, obtainNoHistory);
        j(g0Var, obtainNoHistory);
        boolean e2 = g0Var.e(obtainNoHistory, this.l);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return e2 && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
        if (r1 != 3) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean g(MotionEvent motionEvent) {
        View view = this.f409h;
        if (!view.isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.l);
                    if (findPointerIndex >= 0 && !h(view, motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex), this.f406e)) {
                        a();
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                        return true;
                    }
                }
            }
            a();
        } else {
            this.l = motionEvent.getPointerId(0);
            if (this.f410i == null) {
                this.f410i = new a();
            }
            view.postDelayed(this.f410i, this.f407f);
            if (this.f411j == null) {
                this.f411j = new b();
            }
            view.postDelayed(this.f411j, this.f408g);
        }
        return false;
    }

    private static boolean h(View view, float f2, float f3, float f4) {
        float f5 = -f4;
        return f2 >= f5 && f3 >= f5 && f2 < ((float) (view.getRight() - view.getLeft())) + f4 && f3 < ((float) (view.getBottom() - view.getTop())) + f4;
    }

    private boolean i(View view, MotionEvent motionEvent) {
        int[] iArr = this.m;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(iArr[0], iArr[1]);
        return true;
    }

    private boolean j(View view, MotionEvent motionEvent) {
        int[] iArr = this.m;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
        return true;
    }

    public abstract p b();

    protected abstract boolean c();

    protected boolean d() {
        p b2 = b();
        if (b2 == null || !b2.c()) {
            return true;
        }
        b2.dismiss();
        return true;
    }

    void e() {
        a();
        View view = this.f409h;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f412k = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f412k;
        if (z2) {
            z = f(motionEvent) || !d();
        } else {
            z = g(motionEvent) && c();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f409h.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f412k = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f412k = false;
        this.l = -1;
        Runnable runnable = this.f410i;
        if (runnable != null) {
            this.f409h.removeCallbacks(runnable);
        }
    }
}

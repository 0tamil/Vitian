package h.a.d.d;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import h.a.e.e;
import io.flutter.view.h;
import java.util.concurrent.atomic.AtomicLong;
/* JADX INFO: Access modifiers changed from: package-private */
@TargetApi(e.a.j.b3)
/* loaded from: classes.dex */
public class j extends FrameLayout {

    /* renamed from: e  reason: collision with root package name */
    private int f2890e;

    /* renamed from: f  reason: collision with root package name */
    private int f2891f;

    /* renamed from: g  reason: collision with root package name */
    private int f2892g;

    /* renamed from: h  reason: collision with root package name */
    private int f2893h;

    /* renamed from: i  reason: collision with root package name */
    private int f2894i;

    /* renamed from: j  reason: collision with root package name */
    private int f2895j;

    /* renamed from: k  reason: collision with root package name */
    private SurfaceTexture f2896k;
    private Surface l;
    private io.flutter.embedding.android.b m;
    ViewTreeObserver.OnGlobalFocusChangeListener n;
    private final AtomicLong o;
    private final h.a p;

    /* loaded from: classes.dex */
    class a implements h.a {
        a() {
        }

        @Override // io.flutter.view.h.a
        public void a() {
            if (Build.VERSION.SDK_INT == 29) {
                j.this.o.decrementAndGet();
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements ViewTreeObserver.OnGlobalFocusChangeListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ View.OnFocusChangeListener f2897e;

        b(View.OnFocusChangeListener onFocusChangeListener) {
            this.f2897e = onFocusChangeListener;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
        public void onGlobalFocusChanged(View view, View view2) {
            View.OnFocusChangeListener onFocusChangeListener = this.f2897e;
            j jVar = j.this;
            onFocusChangeListener.onFocusChange(jVar, e.a(jVar));
        }
    }

    public j(Context context) {
        super(context);
        this.o = new AtomicLong(0L);
        this.p = new a();
        setWillNotDraw(false);
    }

    public j(Context context, h.b bVar) {
        this(context);
        bVar.b(this.p);
        j(bVar.c());
    }

    private void e() {
        if (Build.VERSION.SDK_INT == 29) {
            this.o.incrementAndGet();
        }
    }

    private boolean l() {
        return Build.VERSION.SDK_INT != 29 || this.o.get() <= 0;
    }

    protected Surface b(SurfaceTexture surfaceTexture) {
        return new Surface(surfaceTexture);
    }

    public int c() {
        return this.f2895j;
    }

    public int d() {
        return this.f2894i;
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public void draw(Canvas canvas) {
        String str;
        Surface surface = this.l;
        if (surface == null) {
            super.draw(canvas);
            str = "Platform view cannot be composed without a surface.";
        } else if (!surface.isValid()) {
            str = "Invalid surface. The platform view cannot be displayed.";
        } else {
            SurfaceTexture surfaceTexture = this.f2896k;
            if (surfaceTexture == null || surfaceTexture.isReleased()) {
                str = "Invalid texture. The platform view cannot be displayed.";
            } else if (!l()) {
                invalidate();
                return;
            } else {
                Canvas lockHardwareCanvas = this.l.lockHardwareCanvas();
                try {
                    if (Build.VERSION.SDK_INT >= 29) {
                        lockHardwareCanvas.drawColor(0, BlendMode.CLEAR);
                    } else {
                        lockHardwareCanvas.drawColor(0);
                    }
                    super.draw(lockHardwareCanvas);
                    e();
                    return;
                } finally {
                    this.l.unlockCanvasAndPost(lockHardwareCanvas);
                }
            }
        }
        h.a.b.b("PlatformViewWrapper", str);
    }

    public void f() {
        this.f2896k = null;
        Surface surface = this.l;
        if (surface != null) {
            surface.release();
            this.l = null;
        }
    }

    public void g(int i2, int i3) {
        this.f2894i = i2;
        this.f2895j = i3;
        SurfaceTexture surfaceTexture = this.f2896k;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i2, i3);
        }
    }

    public void h(FrameLayout.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        this.f2892g = layoutParams.leftMargin;
        this.f2893h = layoutParams.topMargin;
    }

    public void i(View.OnFocusChangeListener onFocusChangeListener) {
        m();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.n == null) {
            b bVar = new b(onFocusChangeListener);
            this.n = bVar;
            viewTreeObserver.addOnGlobalFocusChangeListener(bVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        invalidate();
        return super.invalidateChildInParent(iArr, rect);
    }

    @SuppressLint({"NewApi"})
    public void j(SurfaceTexture surfaceTexture) {
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 23) {
            h.a.b.b("PlatformViewWrapper", "Platform views cannot be displayed below API level 23. You can prevent this issue by setting `minSdkVersion: 23` in build.gradle.");
            return;
        }
        this.f2896k = surfaceTexture;
        int i4 = this.f2894i;
        if (i4 > 0 && (i2 = this.f2895j) > 0) {
            surfaceTexture.setDefaultBufferSize(i4, i2);
        }
        Surface surface = this.l;
        if (surface != null) {
            surface.release();
        }
        Surface b2 = b(surfaceTexture);
        this.l = b2;
        Canvas lockHardwareCanvas = b2.lockHardwareCanvas();
        try {
            if (i3 >= 29) {
                lockHardwareCanvas.drawColor(0, BlendMode.CLEAR);
            } else {
                lockHardwareCanvas.drawColor(0);
            }
            e();
        } finally {
            this.l.unlockCanvasAndPost(lockHardwareCanvas);
        }
    }

    public void k(io.flutter.embedding.android.b bVar) {
        this.m = bVar;
    }

    public void m() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && (onGlobalFocusChangeListener = this.n) != null) {
            this.n = null;
            viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @SuppressLint({"NewApi"})
    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i2;
        float f2;
        if (this.m == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i3 = this.f2892g;
            this.f2890e = i3;
            i2 = this.f2893h;
            this.f2891f = i2;
            f2 = i3;
        } else if (action != 2) {
            f2 = this.f2892g;
            i2 = this.f2893h;
        } else {
            matrix.postTranslate(this.f2890e, this.f2891f);
            this.f2890e = this.f2892g;
            this.f2891f = this.f2893h;
            return this.m.f(motionEvent, matrix);
        }
        matrix.postTranslate(f2, i2);
        return this.m.f(motionEvent, matrix);
    }
}

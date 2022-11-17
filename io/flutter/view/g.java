package io.flutter.view;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import e.a.j;
import h.a.d.a.d;
import h.a.d.c.a;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.j.h;
import io.flutter.embedding.engine.j.i;
import io.flutter.embedding.engine.j.l;
import io.flutter.embedding.engine.j.m;
import io.flutter.embedding.engine.j.n;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.view.c;
import io.flutter.view.h;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
@Deprecated
/* loaded from: classes.dex */
public class g extends SurfaceView implements h.a.d.a.d, h, a.c {

    /* renamed from: e  reason: collision with root package name */
    private final io.flutter.embedding.engine.f.d f3395e;

    /* renamed from: f  reason: collision with root package name */
    private final io.flutter.embedding.engine.renderer.a f3396f;

    /* renamed from: g  reason: collision with root package name */
    private final h f3397g;

    /* renamed from: h  reason: collision with root package name */
    private final io.flutter.embedding.engine.j.d f3398h;

    /* renamed from: i  reason: collision with root package name */
    private final io.flutter.embedding.engine.j.e f3399i;

    /* renamed from: j  reason: collision with root package name */
    private final io.flutter.embedding.engine.j.f f3400j;

    /* renamed from: k  reason: collision with root package name */
    private final i f3401k;
    private final l l;
    private final m m;
    private final io.flutter.plugin.editing.e n;
    private final h.a.d.b.a o;
    private final io.flutter.embedding.android.m p;
    private final io.flutter.embedding.android.b q;
    private io.flutter.view.c r;
    private final SurfaceHolder.Callback s;
    private final f t;
    private final List<h.a.d.a.a> u;
    private final List<d> v;
    private io.flutter.view.e x;
    private boolean y;
    private final AtomicLong w = new AtomicLong(0);
    private final c.k z = new a();

    /* loaded from: classes.dex */
    class a implements c.k {
        a() {
        }

        @Override // io.flutter.view.c.k
        public void a(boolean z, boolean z2) {
            g.this.E(z, z2);
        }
    }

    /* loaded from: classes.dex */
    class b implements SurfaceHolder.Callback {
        b() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
            g.this.l();
            g.this.x.n().onSurfaceChanged(i3, i4);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            g.this.l();
            g.this.x.n().onSurfaceCreated(surfaceHolder.getSurface());
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            g.this.l();
            g.this.x.n().onSurfaceDestroyed();
        }
    }

    /* loaded from: classes.dex */
    class c implements h.a.d.a.a {
        final /* synthetic */ h.a.d.d.e a;

        c(g gVar, h.a.d.d.e eVar) {
            this.a = eVar;
        }

        @Override // h.a.d.a.a
        public void onPostResume() {
            this.a.A();
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class e implements h.b {
        private final long a;
        private final SurfaceTextureWrapper b;
        private boolean c;

        /* renamed from: d  reason: collision with root package name */
        private SurfaceTexture.OnFrameAvailableListener f3402d = new a();

        /* loaded from: classes.dex */
        class a implements SurfaceTexture.OnFrameAvailableListener {
            a() {
            }

            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                if (!e.this.c && g.this.x != null) {
                    g.this.x.n().markTextureFrameAvailable(e.this.a);
                }
            }
        }

        e(long j2, SurfaceTexture surfaceTexture) {
            this.a = j2;
            this.b = new SurfaceTextureWrapper(surfaceTexture);
            if (Build.VERSION.SDK_INT >= 21) {
                c().setOnFrameAvailableListener(this.f3402d, new Handler());
            } else {
                c().setOnFrameAvailableListener(this.f3402d);
            }
        }

        @Override // io.flutter.view.h.b
        public long a() {
            return this.a;
        }

        @Override // io.flutter.view.h.b
        public /* synthetic */ void b(h.a aVar) {
            i.a(this, aVar);
        }

        @Override // io.flutter.view.h.b
        public SurfaceTexture c() {
            return this.b.surfaceTexture();
        }

        public SurfaceTextureWrapper f() {
            return this.b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class f {
        float a = 1.0f;
        int b = 0;
        int c = 0;

        /* renamed from: d  reason: collision with root package name */
        int f3404d = 0;

        /* renamed from: e  reason: collision with root package name */
        int f3405e = 0;

        /* renamed from: f  reason: collision with root package name */
        int f3406f = 0;

        /* renamed from: g  reason: collision with root package name */
        int f3407g = 0;

        /* renamed from: h  reason: collision with root package name */
        int f3408h = 0;

        /* renamed from: i  reason: collision with root package name */
        int f3409i = 0;

        /* renamed from: j  reason: collision with root package name */
        int f3410j = 0;

        /* renamed from: k  reason: collision with root package name */
        int f3411k = 0;
        int l = 0;
        int m = 0;
        int n = 0;
        int o = 0;
        int p = -1;

        f() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.flutter.view.g$g  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0138g {
        NONE,
        LEFT,
        RIGHT,
        BOTH
    }

    public g(Context context, AttributeSet attributeSet, io.flutter.view.e eVar) {
        super(context, attributeSet);
        this.y = false;
        Activity c2 = h.a.e.e.c(getContext());
        if (c2 != null) {
            this.x = eVar == null ? new io.flutter.view.e(c2.getApplicationContext()) : eVar;
            io.flutter.embedding.engine.f.d m = this.x.m();
            this.f3395e = m;
            io.flutter.embedding.engine.renderer.a aVar = new io.flutter.embedding.engine.renderer.a(this.x.n());
            this.f3396f = aVar;
            this.y = this.x.n().getIsSoftwareRenderingEnabled();
            f fVar = new f();
            this.t = fVar;
            fVar.a = context.getResources().getDisplayMetrics().density;
            fVar.p = ViewConfiguration.get(context).getScaledTouchSlop();
            setFocusable(true);
            setFocusableInTouchMode(true);
            this.x.j(this, c2);
            b bVar = new b();
            this.s = bVar;
            getHolder().addCallback(bVar);
            this.u = new ArrayList();
            this.v = new ArrayList();
            this.f3397g = new io.flutter.embedding.engine.j.h(m);
            io.flutter.embedding.engine.j.d dVar = new io.flutter.embedding.engine.j.d(m);
            this.f3398h = dVar;
            this.f3399i = new io.flutter.embedding.engine.j.e(m);
            io.flutter.embedding.engine.j.f fVar2 = new io.flutter.embedding.engine.j.f(m);
            this.f3400j = fVar2;
            i iVar = new i(m);
            this.f3401k = iVar;
            this.m = new m(m);
            this.l = new l(m);
            j(new c(this, new h.a.d.d.e(c2, iVar)));
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            h.a.d.d.l f2 = this.x.o().f();
            io.flutter.plugin.editing.e eVar2 = new io.flutter.plugin.editing.e(this, new n(m), f2);
            this.n = eVar2;
            this.p = new io.flutter.embedding.android.m(this, eVar2, new io.flutter.embedding.android.l[]{new io.flutter.embedding.android.l(dVar)});
            if (Build.VERSION.SDK_INT >= 24) {
                new h.a.d.c.a(this, new io.flutter.embedding.engine.j.g(m));
            }
            h.a.d.b.a aVar2 = new h.a.d.b.a(context, fVar2);
            this.o = aVar2;
            this.q = new io.flutter.embedding.android.b(aVar, false);
            f2.u(aVar);
            this.x.o().f().t(eVar2);
            this.x.n().setLocalizationPlugin(aVar2);
            aVar2.d(getResources().getConfiguration());
            G();
            return;
        }
        throw new IllegalArgumentException("Bad context");
    }

    private void B() {
        io.flutter.view.c cVar = this.r;
        if (cVar != null) {
            cVar.L();
            this.r = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(boolean z, boolean z2) {
        boolean z3 = false;
        if (!this.y && !z && !z2) {
            z3 = true;
        }
        setWillNotDraw(z3);
    }

    private void G() {
        l.b bVar = (getResources().getConfiguration().uiMode & 48) == 32 ? l.b.dark : l.b.light;
        l.a a2 = this.l.a();
        a2.d(getResources().getConfiguration().fontScale);
        a2.e(DateFormat.is24HourFormat(getContext()));
        a2.c(bVar);
        a2.a();
    }

    private void H() {
        if (q()) {
            FlutterJNI n = this.x.n();
            f fVar = this.t;
            n.setViewportMetrics(fVar.a, fVar.b, fVar.c, fVar.f3404d, fVar.f3405e, fVar.f3406f, fVar.f3407g, fVar.f3408h, fVar.f3409i, fVar.f3410j, fVar.f3411k, fVar.l, fVar.m, fVar.n, fVar.o, fVar.p, new int[0], new int[0], new int[0]);
        }
    }

    private EnumC0138g m() {
        Context context = getContext();
        int i2 = context.getResources().getConfiguration().orientation;
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i2 == 2) {
            if (rotation == 1) {
                return EnumC0138g.RIGHT;
            }
            if (rotation == 3) {
                return Build.VERSION.SDK_INT >= 23 ? EnumC0138g.LEFT : EnumC0138g.RIGHT;
            }
            if (rotation == 0 || rotation == 2) {
                return EnumC0138g.BOTH;
            }
        }
        return EnumC0138g.NONE;
    }

    @TargetApi(20)
    private int p(WindowInsets windowInsets) {
        if (windowInsets.getSystemWindowInsetBottom() < getRootView().getHeight() * 0.18d) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }

    private boolean q() {
        io.flutter.view.e eVar = this.x;
        return eVar != null && eVar.q();
    }

    private void y() {
    }

    private void z() {
        D();
    }

    public h.b A(SurfaceTexture surfaceTexture) {
        surfaceTexture.detachFromGLContext();
        e eVar = new e(this.w.getAndIncrement(), surfaceTexture);
        this.x.n().registerTexture(eVar.a(), eVar.f());
        return eVar;
    }

    public void C(d dVar) {
        this.v.remove(dVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D() {
        io.flutter.view.c cVar = this.r;
        if (cVar != null) {
            cVar.M();
        }
    }

    public void F(io.flutter.view.f fVar) {
        l();
        z();
        this.x.r(fVar);
        y();
    }

    @Override // h.a.d.a.d
    public d.c a(d.C0120d dVar) {
        return null;
    }

    @Override // android.view.View
    public void autofill(SparseArray<AutofillValue> sparseArray) {
        this.n.j(sparseArray);
    }

    @Override // h.a.d.a.d
    public void b(String str, ByteBuffer byteBuffer, d.b bVar) {
        if (!q()) {
            h.a.b.a("FlutterView", "FlutterView.send called on a detached view, channel=" + str);
            return;
        }
        this.x.b(str, byteBuffer, bVar);
    }

    @Override // io.flutter.view.h
    public h.b c() {
        return A(new SurfaceTexture(0));
    }

    @Override // h.a.d.a.d
    public void d(String str, d.a aVar) {
        this.x.d(str, aVar);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        h.a.b.b("FlutterView", "dispatchKeyEvent: " + keyEvent.toString());
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (q() && this.p.c(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // h.a.d.a.d
    public /* synthetic */ d.c e() {
        return h.a.d.a.c.a(this);
    }

    @Override // h.a.d.c.a.c
    @TargetApi(j.c3)
    public PointerIcon f(int i2) {
        return PointerIcon.getSystemIcon(getContext(), i2);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT > 19) {
            return super.fitSystemWindows(rect);
        }
        f fVar = this.t;
        fVar.f3404d = rect.top;
        fVar.f3405e = rect.right;
        fVar.f3406f = 0;
        fVar.f3407g = rect.left;
        fVar.f3408h = 0;
        fVar.f3409i = 0;
        fVar.f3410j = rect.bottom;
        fVar.f3411k = 0;
        H();
        return true;
    }

    @Override // h.a.d.a.d
    public void g(String str, d.a aVar, d.c cVar) {
        this.x.g(str, aVar, cVar);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.c cVar = this.r;
        if (cVar == null || !cVar.z()) {
            return null;
        }
        return this.r;
    }

    public Bitmap getBitmap() {
        l();
        return this.x.n().getBitmap();
    }

    public io.flutter.embedding.engine.f.d getDartExecutor() {
        return this.f3395e;
    }

    float getDevicePixelRatio() {
        return this.t.a;
    }

    public io.flutter.view.e getFlutterNativeView() {
        return this.x;
    }

    public h.a.c.e getPluginRegistry() {
        return this.x.o();
    }

    public void j(h.a.d.a.a aVar) {
        this.u.add(aVar);
    }

    public void k(d dVar) {
        this.v.add(dVar);
    }

    void l() {
        if (!q()) {
            throw new AssertionError("Platform view is not attached");
        }
    }

    public void n() {
        if (q()) {
            getHolder().removeCallback(this.s);
            B();
            this.x.k();
            this.x = null;
        }
    }

    public io.flutter.view.e o() {
        if (!q()) {
            return null;
        }
        getHolder().removeCallback(this.s);
        this.x.l();
        io.flutter.view.e eVar = this.x;
        this.x = null;
        return eVar;
    }

    @Override // android.view.View
    @SuppressLint({"InlinedApi", "NewApi"})
    @TargetApi(20)
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 == 29) {
            Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
            f fVar = this.t;
            fVar.l = systemGestureInsets.top;
            fVar.m = systemGestureInsets.right;
            fVar.n = systemGestureInsets.bottom;
            fVar.o = systemGestureInsets.left;
        }
        boolean z = true;
        int i3 = 0;
        boolean z2 = (getWindowSystemUiVisibility() & 4) == 0;
        if ((getWindowSystemUiVisibility() & 2) != 0) {
            z = false;
        }
        if (i2 >= 30) {
            if (z) {
                i3 = 0 | WindowInsets.Type.navigationBars();
            }
            if (z2) {
                i3 |= WindowInsets.Type.statusBars();
            }
            Insets insets = windowInsets.getInsets(i3);
            f fVar2 = this.t;
            fVar2.f3404d = insets.top;
            fVar2.f3405e = insets.right;
            fVar2.f3406f = insets.bottom;
            fVar2.f3407g = insets.left;
            Insets insets2 = windowInsets.getInsets(WindowInsets.Type.ime());
            f fVar3 = this.t;
            fVar3.f3408h = insets2.top;
            fVar3.f3409i = insets2.right;
            fVar3.f3410j = insets2.bottom;
            fVar3.f3411k = insets2.left;
            Insets insets3 = windowInsets.getInsets(WindowInsets.Type.systemGestures());
            f fVar4 = this.t;
            fVar4.l = insets3.top;
            fVar4.m = insets3.right;
            fVar4.n = insets3.bottom;
            fVar4.o = insets3.left;
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            if (displayCutout != null) {
                Insets waterfallInsets = displayCutout.getWaterfallInsets();
                f fVar5 = this.t;
                fVar5.f3404d = Math.max(Math.max(fVar5.f3404d, waterfallInsets.top), displayCutout.getSafeInsetTop());
                f fVar6 = this.t;
                fVar6.f3405e = Math.max(Math.max(fVar6.f3405e, waterfallInsets.right), displayCutout.getSafeInsetRight());
                f fVar7 = this.t;
                fVar7.f3406f = Math.max(Math.max(fVar7.f3406f, waterfallInsets.bottom), displayCutout.getSafeInsetBottom());
                f fVar8 = this.t;
                fVar8.f3407g = Math.max(Math.max(fVar8.f3407g, waterfallInsets.left), displayCutout.getSafeInsetLeft());
            }
        } else {
            EnumC0138g gVar = EnumC0138g.NONE;
            if (!z) {
                gVar = m();
            }
            this.t.f3404d = z2 ? windowInsets.getSystemWindowInsetTop() : 0;
            this.t.f3405e = (gVar == EnumC0138g.RIGHT || gVar == EnumC0138g.BOTH) ? 0 : windowInsets.getSystemWindowInsetRight();
            this.t.f3406f = (!z || p(windowInsets) != 0) ? 0 : windowInsets.getSystemWindowInsetBottom();
            this.t.f3407g = (gVar == EnumC0138g.LEFT || gVar == EnumC0138g.BOTH) ? 0 : windowInsets.getSystemWindowInsetLeft();
            f fVar9 = this.t;
            fVar9.f3408h = 0;
            fVar9.f3409i = 0;
            fVar9.f3410j = p(windowInsets);
            this.t.f3411k = 0;
        }
        H();
        return super.onApplyWindowInsets(windowInsets);
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        io.flutter.view.c cVar = new io.flutter.view.c(this, new io.flutter.embedding.engine.j.b(this.f3395e, getFlutterNativeView().n()), (AccessibilityManager) getContext().getSystemService("accessibility"), getContext().getContentResolver(), getPluginRegistry().f());
        this.r = cVar;
        cVar.S(this.z);
        E(this.r.z(), this.r.A());
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.o.d(configuration);
        G();
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.n.o(this, this.p, editorInfo);
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        B();
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (q() && this.q.d(motionEvent)) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        return !q() ? super.onHoverEvent(motionEvent) : this.r.F(motionEvent);
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i2) {
        super.onProvideAutofillVirtualStructure(viewStructure, i2);
        this.n.y(viewStructure, i2);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        f fVar = this.t;
        fVar.b = i2;
        fVar.c = i3;
        H();
        super.onSizeChanged(i2, i3, i4, i5);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!q()) {
            return super.onTouchEvent(motionEvent);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            requestUnbufferedDispatch(motionEvent);
        }
        return this.q.e(motionEvent);
    }

    public void r() {
        for (d dVar : new ArrayList(this.v)) {
            dVar.a();
        }
    }

    public void s() {
        this.x.n().notifyLowMemoryWarning();
        this.m.a();
    }

    public void setInitialRoute(String str) {
        this.f3397g.c(str);
    }

    public void t() {
        this.f3399i.b();
    }

    public void u() {
        for (h.a.d.a.a aVar : this.u) {
            aVar.onPostResume();
        }
        this.f3399i.d();
    }

    public void v() {
        this.f3399i.b();
    }

    public void w() {
        this.f3399i.c();
    }

    public void x() {
        this.f3397g.a();
    }
}

package io.flutter.embedding.android;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.FrameLayout;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import androidx.window.layout.DisplayFeature;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import e.a.j;
import h.a.d.c.a;
import io.flutter.embedding.android.h;
import io.flutter.embedding.engine.j.l;
import io.flutter.embedding.engine.renderer.a;
import io.flutter.view.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
public class k extends FrameLayout implements a.c {

    /* renamed from: e  reason: collision with root package name */
    private i f2954e;

    /* renamed from: f  reason: collision with root package name */
    private j f2955f;

    /* renamed from: g  reason: collision with root package name */
    private h f2956g;

    /* renamed from: h  reason: collision with root package name */
    io.flutter.embedding.engine.renderer.c f2957h;

    /* renamed from: i  reason: collision with root package name */
    private io.flutter.embedding.engine.renderer.c f2958i;

    /* renamed from: j  reason: collision with root package name */
    private final Set<io.flutter.embedding.engine.renderer.b> f2959j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f2960k;
    private io.flutter.embedding.engine.b l;
    private final Set<f> m;
    private h.a.d.c.a n;
    private io.flutter.plugin.editing.e o;
    private h.a.d.b.a p;
    private m q;
    private io.flutter.embedding.android.b r;
    private io.flutter.view.c s;
    private s t;
    private final a.g u;
    private final c.k v;
    private final ContentObserver w;
    private final io.flutter.embedding.engine.renderer.b x;
    private final e.d.o.a<WindowLayoutInfo> y;

    /* loaded from: classes.dex */
    class a implements c.k {
        a() {
        }

        @Override // io.flutter.view.c.k
        public void a(boolean z, boolean z2) {
            k.this.w(z, z2);
        }
    }

    /* loaded from: classes.dex */
    class b extends ContentObserver {
        b(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            super.onChange(z);
            if (k.this.l != null) {
                h.a.b.e("FlutterView", "System settings changed. Sending user settings to Flutter.");
                k.this.y();
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements io.flutter.embedding.engine.renderer.b {
        c() {
        }

        @Override // io.flutter.embedding.engine.renderer.b
        public void c() {
            k.this.f2960k = false;
            for (io.flutter.embedding.engine.renderer.b bVar : k.this.f2959j) {
                bVar.c();
            }
        }

        @Override // io.flutter.embedding.engine.renderer.b
        public void f() {
            k.this.f2960k = true;
            for (io.flutter.embedding.engine.renderer.b bVar : k.this.f2959j) {
                bVar.f();
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements e.d.o.a<WindowLayoutInfo> {
        d() {
        }

        /* renamed from: a */
        public void accept(WindowLayoutInfo windowLayoutInfo) {
            k.this.setWindowInfoListenerDisplayFeatures(windowLayoutInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements io.flutter.embedding.engine.renderer.b {
        final /* synthetic */ io.flutter.embedding.engine.renderer.a a;
        final /* synthetic */ Runnable b;

        e(io.flutter.embedding.engine.renderer.a aVar, Runnable runnable) {
            this.a = aVar;
            this.b = runnable;
        }

        @Override // io.flutter.embedding.engine.renderer.b
        public void c() {
        }

        @Override // io.flutter.embedding.engine.renderer.b
        public void f() {
            this.a.m(this);
            this.b.run();
            k kVar = k.this;
            if (!(kVar.f2957h instanceof h)) {
                kVar.f2956g.c();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(io.flutter.embedding.engine.b bVar);

        void b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum g {
        NONE,
        LEFT,
        RIGHT,
        BOTH
    }

    private k(Context context, AttributeSet attributeSet, i iVar) {
        super(context, attributeSet);
        this.f2959j = new HashSet();
        this.m = new HashSet();
        this.u = new a.g();
        this.v = new a();
        this.w = new b(new Handler(Looper.getMainLooper()));
        this.x = new c();
        this.y = new d();
        this.f2954e = iVar;
        this.f2957h = iVar;
        s();
    }

    private k(Context context, AttributeSet attributeSet, j jVar) {
        super(context, attributeSet);
        this.f2959j = new HashSet();
        this.m = new HashSet();
        this.u = new a.g();
        this.v = new a();
        this.w = new b(new Handler(Looper.getMainLooper()));
        this.x = new c();
        this.y = new d();
        this.f2955f = jVar;
        this.f2957h = jVar;
        s();
    }

    public k(Context context, i iVar) {
        this(context, (AttributeSet) null, iVar);
    }

    public k(Context context, j jVar) {
        this(context, (AttributeSet) null, jVar);
    }

    private g l() {
        Context context = getContext();
        int i2 = context.getResources().getConfiguration().orientation;
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i2 == 2) {
            if (rotation == 1) {
                return g.RIGHT;
            }
            if (rotation == 3) {
                return Build.VERSION.SDK_INT >= 23 ? g.LEFT : g.RIGHT;
            }
            if (rotation == 0 || rotation == 2) {
                return g.BOTH;
            }
        }
        return g.NONE;
    }

    @TargetApi(20)
    private int q(WindowInsets windowInsets) {
        if (windowInsets.getSystemWindowInsetBottom() < getRootView().getHeight() * 0.18d) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }

    private void s() {
        View view;
        h.a.b.e("FlutterView", "Initializing FlutterView");
        if (this.f2954e != null) {
            h.a.b.e("FlutterView", "Internally using a FlutterSurfaceView.");
            view = this.f2954e;
        } else if (this.f2955f != null) {
            h.a.b.e("FlutterView", "Internally using a FlutterTextureView.");
            view = this.f2955f;
        } else {
            h.a.b.e("FlutterView", "Internally using a FlutterImageView.");
            view = this.f2956g;
        }
        addView(view);
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(boolean z, boolean z2) {
        boolean z3 = false;
        if (!this.l.q().i() && !z && !z2) {
            z3 = true;
        }
        setWillNotDraw(z3);
    }

    private void z() {
        if (!t()) {
            h.a.b.f("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        this.u.a = getResources().getDisplayMetrics().density;
        this.u.p = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.l.q().o(this.u);
    }

    @Override // android.view.View
    public void autofill(SparseArray<AutofillValue> sparseArray) {
        this.o.j(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (t() && this.q.c(keyEvent)) || super.dispatchKeyEvent(keyEvent);
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
        a.g gVar = this.u;
        gVar.f3166d = rect.top;
        gVar.f3167e = rect.right;
        gVar.f3168f = 0;
        gVar.f3169g = rect.left;
        gVar.f3170h = 0;
        gVar.f3171i = 0;
        gVar.f3172j = rect.bottom;
        gVar.f3173k = 0;
        h.a.b.e("FlutterView", "Updating window insets (fitSystemWindows()):\nStatus bar insets: Top: " + this.u.f3166d + ", Left: " + this.u.f3169g + ", Right: " + this.u.f3167e + "\nKeyboard insets: Bottom: " + this.u.f3172j + ", Left: " + this.u.f3173k + ", Right: " + this.u.f3171i);
        z();
        return true;
    }

    public boolean g() {
        h hVar = this.f2956g;
        if (hVar != null) {
            return hVar.d();
        }
        return false;
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.c cVar = this.s;
        if (cVar == null || !cVar.z()) {
            return null;
        }
        return this.s;
    }

    public io.flutter.embedding.engine.b getAttachedFlutterEngine() {
        return this.l;
    }

    public void h(f fVar) {
        this.m.add(fVar);
    }

    public void i(io.flutter.embedding.engine.renderer.b bVar) {
        this.f2959j.add(bVar);
    }

    public void j(h hVar) {
        io.flutter.embedding.engine.b bVar = this.l;
        if (bVar != null) {
            hVar.a(bVar.q());
        }
    }

    public void k(io.flutter.embedding.engine.b bVar) {
        h.a.b.e("FlutterView", "Attaching to a FlutterEngine: " + bVar);
        if (t()) {
            if (bVar == this.l) {
                h.a.b.e("FlutterView", "Already attached to this engine. Doing nothing.");
                return;
            } else {
                h.a.b.e("FlutterView", "Currently attached to a different engine. Detaching and then attaching to new engine.");
                p();
            }
        }
        this.l = bVar;
        io.flutter.embedding.engine.renderer.a q = bVar.q();
        this.f2960k = q.h();
        this.f2957h.a(q);
        q.f(this.x);
        if (Build.VERSION.SDK_INT >= 24) {
            this.n = new h.a.d.c.a(this, this.l.l());
        }
        this.o = new io.flutter.plugin.editing.e(this, this.l.u(), this.l.o());
        this.p = this.l.k();
        this.q = new m(this, this.o, new l[]{new l(bVar.i())});
        this.r = new io.flutter.embedding.android.b(this.l.q(), false);
        io.flutter.view.c cVar = new io.flutter.view.c(this, bVar.f(), (AccessibilityManager) getContext().getSystemService("accessibility"), getContext().getContentResolver(), this.l.o());
        this.s = cVar;
        cVar.S(this.v);
        w(this.s.z(), this.s.A());
        this.l.o().b(this.s);
        this.l.o().u(this.l.q());
        this.o.q().restartInput(this);
        y();
        getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, this.w);
        this.p.d(getResources().getConfiguration());
        z();
        bVar.o().v(this);
        for (f fVar : this.m) {
            fVar.a(bVar);
        }
        if (this.f2960k) {
            this.x.f();
        }
    }

    public void m() {
        this.f2957h.b();
        h hVar = this.f2956g;
        if (hVar == null) {
            h n = n();
            this.f2956g = n;
            addView(n);
        } else {
            hVar.j(getWidth(), getHeight());
        }
        this.f2958i = this.f2957h;
        h hVar2 = this.f2956g;
        this.f2957h = hVar2;
        io.flutter.embedding.engine.b bVar = this.l;
        if (bVar != null) {
            hVar2.a(bVar.q());
        }
    }

    public h n() {
        return new h(getContext(), getWidth(), getHeight(), h.b.background);
    }

    protected s o() {
        try {
            return new s(new WindowInfoTrackerCallbackAdapter(WindowInfoTracker.Companion.getOrCreate(getContext())));
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }

    @Override // android.view.View
    @SuppressLint({"InlinedApi", "NewApi"})
    @TargetApi(20)
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 == 29) {
            Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
            a.g gVar = this.u;
            gVar.l = systemGestureInsets.top;
            gVar.m = systemGestureInsets.right;
            gVar.n = systemGestureInsets.bottom;
            gVar.o = systemGestureInsets.left;
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
            a.g gVar2 = this.u;
            gVar2.f3166d = insets.top;
            gVar2.f3167e = insets.right;
            gVar2.f3168f = insets.bottom;
            gVar2.f3169g = insets.left;
            Insets insets2 = windowInsets.getInsets(WindowInsets.Type.ime());
            a.g gVar3 = this.u;
            gVar3.f3170h = insets2.top;
            gVar3.f3171i = insets2.right;
            gVar3.f3172j = insets2.bottom;
            gVar3.f3173k = insets2.left;
            Insets insets3 = windowInsets.getInsets(WindowInsets.Type.systemGestures());
            a.g gVar4 = this.u;
            gVar4.l = insets3.top;
            gVar4.m = insets3.right;
            gVar4.n = insets3.bottom;
            gVar4.o = insets3.left;
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            if (displayCutout != null) {
                Insets waterfallInsets = displayCutout.getWaterfallInsets();
                a.g gVar5 = this.u;
                gVar5.f3166d = Math.max(Math.max(gVar5.f3166d, waterfallInsets.top), displayCutout.getSafeInsetTop());
                a.g gVar6 = this.u;
                gVar6.f3167e = Math.max(Math.max(gVar6.f3167e, waterfallInsets.right), displayCutout.getSafeInsetRight());
                a.g gVar7 = this.u;
                gVar7.f3168f = Math.max(Math.max(gVar7.f3168f, waterfallInsets.bottom), displayCutout.getSafeInsetBottom());
                a.g gVar8 = this.u;
                gVar8.f3169g = Math.max(Math.max(gVar8.f3169g, waterfallInsets.left), displayCutout.getSafeInsetLeft());
            }
        } else {
            g gVar9 = g.NONE;
            if (!z) {
                gVar9 = l();
            }
            this.u.f3166d = z2 ? windowInsets.getSystemWindowInsetTop() : 0;
            this.u.f3167e = (gVar9 == g.RIGHT || gVar9 == g.BOTH) ? 0 : windowInsets.getSystemWindowInsetRight();
            this.u.f3168f = (!z || q(windowInsets) != 0) ? 0 : windowInsets.getSystemWindowInsetBottom();
            this.u.f3169g = (gVar9 == g.LEFT || gVar9 == g.BOTH) ? 0 : windowInsets.getSystemWindowInsetLeft();
            a.g gVar10 = this.u;
            gVar10.f3170h = 0;
            gVar10.f3171i = 0;
            gVar10.f3172j = q(windowInsets);
            this.u.f3173k = 0;
        }
        h.a.b.e("FlutterView", "Updating window insets (onApplyWindowInsets()):\nStatus bar insets: Top: " + this.u.f3166d + ", Left: " + this.u.f3169g + ", Right: " + this.u.f3167e + "\nKeyboard insets: Bottom: " + this.u.f3172j + ", Left: " + this.u.f3173k + ", Right: " + this.u.f3171i + "System Gesture Insets - Left: " + this.u.o + ", Top: " + this.u.l + ", Right: " + this.u.m + ", Bottom: " + this.u.f3172j);
        z();
        return onApplyWindowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.t = o();
        Activity c2 = h.a.e.e.c(getContext());
        s sVar = this.t;
        if (sVar != null && c2 != null) {
            sVar.a(c2, androidx.core.content.a.i(getContext()), this.y);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.l != null) {
            h.a.b.e("FlutterView", "Configuration changed. Sending locales and user settings to Flutter.");
            this.p.d(configuration);
            y();
        }
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return !t() ? super.onCreateInputConnection(editorInfo) : this.o.o(this, this.q, editorInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        s sVar = this.t;
        if (sVar != null) {
            sVar.b(this.y);
        }
        this.t = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (t() && this.r.d(motionEvent)) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        return !t() ? super.onHoverEvent(motionEvent) : this.s.F(motionEvent);
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i2) {
        super.onProvideAutofillVirtualStructure(viewStructure, i2);
        this.o.y(viewStructure, i2);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        h.a.b.e("FlutterView", "Size changed. Sending Flutter new viewport metrics. FlutterView was " + i4 + " x " + i5 + ", it is now " + i2 + " x " + i3);
        a.g gVar = this.u;
        gVar.b = i2;
        gVar.c = i3;
        z();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!t()) {
            return super.onTouchEvent(motionEvent);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            requestUnbufferedDispatch(motionEvent);
        }
        return this.r.e(motionEvent);
    }

    public void p() {
        h.a.b.e("FlutterView", "Detaching from a FlutterEngine: " + this.l);
        if (!t()) {
            h.a.b.e("FlutterView", "FlutterView not attached to an engine. Not detaching.");
            return;
        }
        for (f fVar : this.m) {
            fVar.b();
        }
        getContext().getContentResolver().unregisterContentObserver(this.w);
        this.l.o().A();
        this.l.o().a();
        this.s.L();
        this.s = null;
        this.o.q().restartInput(this);
        this.o.p();
        this.q.b();
        h.a.d.c.a aVar = this.n;
        if (aVar != null) {
            aVar.c();
        }
        io.flutter.embedding.engine.renderer.a q = this.l.q();
        this.f2960k = false;
        q.m(this.x);
        q.q();
        q.n(false);
        io.flutter.embedding.engine.renderer.c cVar = this.f2958i;
        if (cVar != null && this.f2957h == this.f2956g) {
            this.f2957h = cVar;
        }
        this.f2957h.c();
        h hVar = this.f2956g;
        if (hVar != null) {
            hVar.f();
            removeView(this.f2956g);
            this.f2956g = null;
        }
        this.f2958i = null;
        this.l = null;
    }

    public boolean r() {
        return this.f2960k;
    }

    @TargetApi(28)
    protected void setWindowInfoListenerDisplayFeatures(WindowLayoutInfo windowLayoutInfo) {
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        List<DisplayFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        ArrayList arrayList = new ArrayList();
        for (DisplayFeature displayFeature : displayFeatures) {
            h.a.b.e("FlutterView", "WindowInfoTracker Display Feature reported with bounds = " + displayFeature.getBounds().toString() + " and type = " + displayFeature.getClass().getSimpleName());
            if (displayFeature instanceof FoldingFeature) {
                FoldingFeature foldingFeature = (FoldingFeature) displayFeature;
                arrayList.add(new a.b(displayFeature.getBounds(), foldingFeature.getOcclusionType() == FoldingFeature.OcclusionType.FULL ? a.d.HINGE : a.d.FOLD, foldingFeature.getState() == FoldingFeature.State.FLAT ? a.c.POSTURE_FLAT : foldingFeature.getState() == FoldingFeature.State.HALF_OPENED ? a.c.POSTURE_HALF_OPENED : a.c.UNKNOWN));
            } else {
                arrayList.add(new a.b(displayFeature.getBounds(), a.d.UNKNOWN, a.c.UNKNOWN));
            }
        }
        if (!(Build.VERSION.SDK_INT < 28 || (rootWindowInsets = getRootWindowInsets()) == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null)) {
            for (Rect rect : displayCutout.getBoundingRects()) {
                h.a.b.e("FlutterView", "DisplayCutout area reported with bounds = " + rect.toString());
                arrayList.add(new a.b(rect, a.d.CUTOUT));
            }
        }
        this.u.q = arrayList;
        z();
    }

    public boolean t() {
        io.flutter.embedding.engine.b bVar = this.l;
        return bVar != null && bVar.q() == this.f2957h.getAttachedRenderer();
    }

    public void u(f fVar) {
        this.m.remove(fVar);
    }

    public void v(io.flutter.embedding.engine.renderer.b bVar) {
        this.f2959j.remove(bVar);
    }

    public void x(Runnable runnable) {
        h hVar = this.f2956g;
        if (hVar == null) {
            h.a.b.e("FlutterView", "Tried to revert the image view, but no image view is used.");
            return;
        }
        io.flutter.embedding.engine.renderer.c cVar = this.f2958i;
        if (cVar == null) {
            h.a.b.e("FlutterView", "Tried to revert the image view, but no previous surface was used.");
            return;
        }
        this.f2957h = cVar;
        this.f2958i = null;
        io.flutter.embedding.engine.b bVar = this.l;
        if (bVar == null) {
            hVar.c();
            runnable.run();
            return;
        }
        io.flutter.embedding.engine.renderer.a q = bVar.q();
        if (q == null) {
            this.f2956g.c();
            runnable.run();
            return;
        }
        this.f2957h.a(q);
        q.f(new e(q, runnable));
    }

    void y() {
        boolean z = false;
        l.b bVar = (getResources().getConfiguration().uiMode & 48) == 32 ? l.b.dark : l.b.light;
        l.a a2 = this.l.s().a();
        a2.d(getResources().getConfiguration().fontScale);
        if (Settings.System.getInt(getContext().getContentResolver(), "show_password", 1) == 1) {
            z = true;
        }
        a2.b(z);
        a2.e(DateFormat.is24HourFormat(getContext()));
        a2.c(bVar);
        a2.a();
    }
}

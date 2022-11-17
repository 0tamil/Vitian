package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import io.flutter.embedding.engine.renderer.c;
/* loaded from: classes.dex */
public class i extends SurfaceView implements c {

    /* renamed from: e  reason: collision with root package name */
    private final boolean f2941e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f2942f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f2943g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f2944h;

    /* renamed from: i  reason: collision with root package name */
    private io.flutter.embedding.engine.renderer.a f2945i;

    /* renamed from: j  reason: collision with root package name */
    private final SurfaceHolder.Callback f2946j;

    /* renamed from: k  reason: collision with root package name */
    private final io.flutter.embedding.engine.renderer.b f2947k;

    /* loaded from: classes.dex */
    class a implements SurfaceHolder.Callback {
        a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
            h.a.b.e("FlutterSurfaceView", "SurfaceHolder.Callback.surfaceChanged()");
            if (i.this.f2944h) {
                i.this.j(i3, i4);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            h.a.b.e("FlutterSurfaceView", "SurfaceHolder.Callback.startRenderingToSurface()");
            i.this.f2942f = true;
            if (i.this.f2944h) {
                i.this.k();
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            h.a.b.e("FlutterSurfaceView", "SurfaceHolder.Callback.stopRenderingToSurface()");
            i.this.f2942f = false;
            if (i.this.f2944h) {
                i.this.l();
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements io.flutter.embedding.engine.renderer.b {
        b() {
        }

        @Override // io.flutter.embedding.engine.renderer.b
        public void c() {
        }

        @Override // io.flutter.embedding.engine.renderer.b
        public void f() {
            h.a.b.e("FlutterSurfaceView", "onFlutterUiDisplayed()");
            i.this.setAlpha(1.0f);
            if (i.this.f2945i != null) {
                i.this.f2945i.m(this);
            }
        }
    }

    private i(Context context, AttributeSet attributeSet, boolean z) {
        super(context, attributeSet);
        this.f2942f = false;
        this.f2943g = false;
        this.f2944h = false;
        this.f2946j = new a();
        this.f2947k = new b();
        this.f2941e = z;
        m();
    }

    public i(Context context, boolean z) {
        this(context, null, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(int i2, int i3) {
        if (this.f2945i != null) {
            h.a.b.e("FlutterSurfaceView", "Notifying FlutterRenderer that Android surface size has changed to " + i2 + " x " + i3);
            this.f2945i.r(i2, i3);
            return;
        }
        throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.f2945i == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        this.f2945i.p(getHolder().getSurface(), this.f2943g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        io.flutter.embedding.engine.renderer.a aVar = this.f2945i;
        if (aVar != null) {
            aVar.q();
            return;
        }
        throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
    }

    private void m() {
        if (this.f2941e) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(this.f2946j);
        setAlpha(0.0f);
    }

    @Override // io.flutter.embedding.engine.renderer.c
    public void a(io.flutter.embedding.engine.renderer.a aVar) {
        h.a.b.e("FlutterSurfaceView", "Attaching to FlutterRenderer.");
        if (this.f2945i != null) {
            h.a.b.e("FlutterSurfaceView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f2945i.q();
            this.f2945i.m(this.f2947k);
        }
        this.f2945i = aVar;
        this.f2944h = true;
        aVar.f(this.f2947k);
        if (this.f2942f) {
            h.a.b.e("FlutterSurfaceView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            k();
        }
        this.f2943g = false;
    }

    @Override // io.flutter.embedding.engine.renderer.c
    public void b() {
        if (this.f2945i != null) {
            this.f2945i = null;
            this.f2943g = true;
            this.f2944h = false;
            return;
        }
        h.a.b.f("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
    }

    @Override // io.flutter.embedding.engine.renderer.c
    public void c() {
        if (this.f2945i != null) {
            if (getWindowToken() != null) {
                h.a.b.e("FlutterSurfaceView", "Disconnecting FlutterRenderer from Android surface.");
                l();
            }
            setAlpha(0.0f);
            this.f2945i.m(this.f2947k);
            this.f2945i = null;
            this.f2944h = false;
            return;
        }
        h.a.b.f("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
    }

    @Override // android.view.SurfaceView, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        region.op(iArr[0], iArr[1], (iArr[0] + getRight()) - getLeft(), (iArr[1] + getBottom()) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // io.flutter.embedding.engine.renderer.c
    public io.flutter.embedding.engine.renderer.a getAttachedRenderer() {
        return this.f2945i;
    }
}

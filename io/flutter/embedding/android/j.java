package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import h.a.b;
import io.flutter.embedding.engine.renderer.c;
/* loaded from: classes.dex */
public class j extends TextureView implements c {

    /* renamed from: e  reason: collision with root package name */
    private boolean f2948e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f2949f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f2950g;

    /* renamed from: h  reason: collision with root package name */
    private io.flutter.embedding.engine.renderer.a f2951h;

    /* renamed from: i  reason: collision with root package name */
    private Surface f2952i;

    /* renamed from: j  reason: collision with root package name */
    private final TextureView.SurfaceTextureListener f2953j;

    /* loaded from: classes.dex */
    class a implements TextureView.SurfaceTextureListener {
        a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
            b.e("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureAvailable()");
            j.this.f2948e = true;
            if (j.this.f2949f) {
                j.this.l();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            b.e("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureDestroyed()");
            j.this.f2948e = false;
            if (j.this.f2949f) {
                j.this.m();
            }
            if (j.this.f2952i == null) {
                return true;
            }
            j.this.f2952i.release();
            j.this.f2952i = null;
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
            b.e("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureSizeChanged()");
            if (j.this.f2949f) {
                j.this.k(i2, i3);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public j(Context context) {
        this(context, null);
    }

    public j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2948e = false;
        this.f2949f = false;
        this.f2950g = false;
        this.f2953j = new a();
        n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(int i2, int i3) {
        if (this.f2951h != null) {
            b.e("FlutterTextureView", "Notifying FlutterRenderer that Android surface size has changed to " + i2 + " x " + i3);
            this.f2951h.r(i2, i3);
            return;
        }
        throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (this.f2951h == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.f2952i;
        if (surface != null) {
            surface.release();
            this.f2952i = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.f2952i = surface2;
        this.f2951h.p(surface2, this.f2950g);
        this.f2950g = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        io.flutter.embedding.engine.renderer.a aVar = this.f2951h;
        if (aVar != null) {
            aVar.q();
            Surface surface = this.f2952i;
            if (surface != null) {
                surface.release();
                this.f2952i = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
    }

    private void n() {
        setSurfaceTextureListener(this.f2953j);
    }

    @Override // io.flutter.embedding.engine.renderer.c
    public void a(io.flutter.embedding.engine.renderer.a aVar) {
        b.e("FlutterTextureView", "Attaching to FlutterRenderer.");
        if (this.f2951h != null) {
            b.e("FlutterTextureView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f2951h.q();
        }
        this.f2951h = aVar;
        this.f2949f = true;
        if (this.f2948e) {
            b.e("FlutterTextureView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            l();
        }
    }

    @Override // io.flutter.embedding.engine.renderer.c
    public void b() {
        if (this.f2951h != null) {
            this.f2951h = null;
            this.f2950g = true;
            this.f2949f = false;
            return;
        }
        b.f("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
    }

    @Override // io.flutter.embedding.engine.renderer.c
    public void c() {
        if (this.f2951h != null) {
            if (getWindowToken() != null) {
                b.e("FlutterTextureView", "Disconnecting FlutterRenderer from Android surface.");
                m();
            }
            this.f2951h = null;
            this.f2949f = false;
            return;
        }
        b.f("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
    }

    @Override // io.flutter.embedding.engine.renderer.c
    public io.flutter.embedding.engine.renderer.a getAttachedRenderer() {
        return this.f2951h;
    }

    public void setRenderSurface(Surface surface) {
        this.f2952i = surface;
    }
}

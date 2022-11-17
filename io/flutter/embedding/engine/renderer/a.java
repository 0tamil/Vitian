package io.flutter.embedding.engine.renderer;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.h;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
@TargetApi(16)
/* loaded from: classes.dex */
public class a implements h {

    /* renamed from: e  reason: collision with root package name */
    private final FlutterJNI f3142e;

    /* renamed from: g  reason: collision with root package name */
    private Surface f3144g;

    /* renamed from: j  reason: collision with root package name */
    private final io.flutter.embedding.engine.renderer.b f3147j;

    /* renamed from: f  reason: collision with root package name */
    private final AtomicLong f3143f = new AtomicLong(0);

    /* renamed from: h  reason: collision with root package name */
    private boolean f3145h = false;

    /* renamed from: i  reason: collision with root package name */
    private Handler f3146i = new Handler();

    /* renamed from: io.flutter.embedding.engine.renderer.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0132a implements io.flutter.embedding.engine.renderer.b {
        C0132a() {
        }

        @Override // io.flutter.embedding.engine.renderer.b
        public void c() {
            a.this.f3145h = false;
        }

        @Override // io.flutter.embedding.engine.renderer.b
        public void f() {
            a.this.f3145h = true;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final Rect a;
        public final d b;
        public final c c;

        public b(Rect rect, d dVar) {
            this.a = rect;
            this.b = dVar;
            this.c = c.UNKNOWN;
        }

        public b(Rect rect, d dVar, c cVar) {
            this.a = rect;
            this.b = dVar;
            this.c = cVar;
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        UNKNOWN(0),
        POSTURE_FLAT(1),
        POSTURE_HALF_OPENED(2);
        

        /* renamed from: e  reason: collision with root package name */
        public final int f3152e;

        c(int i2) {
            this.f3152e = i2;
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        UNKNOWN(0),
        FOLD(1),
        HINGE(2),
        CUTOUT(3);
        

        /* renamed from: e  reason: collision with root package name */
        public final int f3158e;

        d(int i2) {
            this.f3158e = i2;
        }
    }

    /* loaded from: classes.dex */
    static final class e implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        private final long f3159e;

        /* renamed from: f  reason: collision with root package name */
        private final FlutterJNI f3160f;

        e(long j2, FlutterJNI flutterJNI) {
            this.f3159e = j2;
            this.f3160f = flutterJNI;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3160f.isAttached()) {
                h.a.b.e("FlutterRenderer", "Releasing a SurfaceTexture (" + this.f3159e + ").");
                this.f3160f.unregisterTexture(this.f3159e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class f implements h.b {
        private final long a;
        private final SurfaceTextureWrapper b;
        private boolean c;

        /* renamed from: d  reason: collision with root package name */
        private h.a f3161d;

        /* renamed from: e  reason: collision with root package name */
        private final Runnable f3162e;

        /* renamed from: f  reason: collision with root package name */
        private SurfaceTexture.OnFrameAvailableListener f3163f = new b();

        /* renamed from: io.flutter.embedding.engine.renderer.a$f$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0133a implements Runnable {
            RunnableC0133a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (f.this.f3161d != null) {
                    f.this.f3161d.a();
                }
            }
        }

        /* loaded from: classes.dex */
        class b implements SurfaceTexture.OnFrameAvailableListener {
            b() {
            }

            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                if (!f.this.c && a.this.f3142e.isAttached()) {
                    f fVar = f.this;
                    a.this.j(fVar.a);
                }
            }
        }

        f(long j2, SurfaceTexture surfaceTexture) {
            RunnableC0133a aVar = new RunnableC0133a();
            this.f3162e = aVar;
            this.a = j2;
            this.b = new SurfaceTextureWrapper(surfaceTexture, aVar);
            if (Build.VERSION.SDK_INT >= 21) {
                c().setOnFrameAvailableListener(this.f3163f, new Handler());
            } else {
                c().setOnFrameAvailableListener(this.f3163f);
            }
        }

        @Override // io.flutter.view.h.b
        public long a() {
            return this.a;
        }

        @Override // io.flutter.view.h.b
        public void b(h.a aVar) {
            this.f3161d = aVar;
        }

        @Override // io.flutter.view.h.b
        public SurfaceTexture c() {
            return this.b.surfaceTexture();
        }

        protected void finalize() {
            try {
                if (!this.c) {
                    a.this.f3146i.post(new e(this.a, a.this.f3142e));
                }
            } finally {
                super.finalize();
            }
        }

        public SurfaceTextureWrapper g() {
            return this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class g {
        public float a = 1.0f;
        public int b = 0;
        public int c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f3166d = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f3167e = 0;

        /* renamed from: f  reason: collision with root package name */
        public int f3168f = 0;

        /* renamed from: g  reason: collision with root package name */
        public int f3169g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f3170h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f3171i = 0;

        /* renamed from: j  reason: collision with root package name */
        public int f3172j = 0;

        /* renamed from: k  reason: collision with root package name */
        public int f3173k = 0;
        public int l = 0;
        public int m = 0;
        public int n = 0;
        public int o = 0;
        public int p = -1;
        public List<b> q = new ArrayList();

        boolean a() {
            return this.b > 0 && this.c > 0 && this.a > 0.0f;
        }
    }

    public a(FlutterJNI flutterJNI) {
        C0132a aVar = new C0132a();
        this.f3147j = aVar;
        this.f3142e = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(long j2) {
        this.f3142e.markTextureFrameAvailable(j2);
    }

    private void l(long j2, SurfaceTextureWrapper surfaceTextureWrapper) {
        this.f3142e.registerTexture(j2, surfaceTextureWrapper);
    }

    @Override // io.flutter.view.h
    public h.b c() {
        h.a.b.e("FlutterRenderer", "Creating a SurfaceTexture.");
        return k(new SurfaceTexture(0));
    }

    public void f(io.flutter.embedding.engine.renderer.b bVar) {
        this.f3142e.addIsDisplayingFlutterUiListener(bVar);
        if (this.f3145h) {
            bVar.f();
        }
    }

    public void g(ByteBuffer byteBuffer, int i2) {
        this.f3142e.dispatchPointerDataPacket(byteBuffer, i2);
    }

    public boolean h() {
        return this.f3145h;
    }

    public boolean i() {
        return this.f3142e.getIsSoftwareRenderingEnabled();
    }

    public h.b k(SurfaceTexture surfaceTexture) {
        surfaceTexture.detachFromGLContext();
        f fVar = new f(this.f3143f.getAndIncrement(), surfaceTexture);
        h.a.b.e("FlutterRenderer", "New SurfaceTexture ID: " + fVar.a());
        l(fVar.a(), fVar.g());
        return fVar;
    }

    public void m(io.flutter.embedding.engine.renderer.b bVar) {
        this.f3142e.removeIsDisplayingFlutterUiListener(bVar);
    }

    public void n(boolean z) {
        this.f3142e.setSemanticsEnabled(z);
    }

    public void o(g gVar) {
        if (gVar.a()) {
            h.a.b.e("FlutterRenderer", "Setting viewport metrics\nSize: " + gVar.b + " x " + gVar.c + "\nPadding - L: " + gVar.f3169g + ", T: " + gVar.f3166d + ", R: " + gVar.f3167e + ", B: " + gVar.f3168f + "\nInsets - L: " + gVar.f3173k + ", T: " + gVar.f3170h + ", R: " + gVar.f3171i + ", B: " + gVar.f3172j + "\nSystem Gesture Insets - L: " + gVar.o + ", T: " + gVar.l + ", R: " + gVar.m + ", B: " + gVar.m + "\nDisplay Features: " + gVar.q.size());
            int[] iArr = new int[gVar.q.size() * 4];
            int[] iArr2 = new int[gVar.q.size()];
            int[] iArr3 = new int[gVar.q.size()];
            for (int i2 = 0; i2 < gVar.q.size(); i2++) {
                b bVar = gVar.q.get(i2);
                int i3 = i2 * 4;
                Rect rect = bVar.a;
                iArr[i3] = rect.left;
                iArr[i3 + 1] = rect.top;
                iArr[i3 + 2] = rect.right;
                iArr[i3 + 3] = rect.bottom;
                iArr2[i2] = bVar.b.f3158e;
                iArr3[i2] = bVar.c.f3152e;
            }
            this.f3142e.setViewportMetrics(gVar.a, gVar.b, gVar.c, gVar.f3166d, gVar.f3167e, gVar.f3168f, gVar.f3169g, gVar.f3170h, gVar.f3171i, gVar.f3172j, gVar.f3173k, gVar.l, gVar.m, gVar.n, gVar.o, gVar.p, iArr, iArr2, iArr3);
        }
    }

    public void p(Surface surface, boolean z) {
        if (this.f3144g != null && !z) {
            q();
        }
        this.f3144g = surface;
        this.f3142e.onSurfaceCreated(surface);
    }

    public void q() {
        this.f3142e.onSurfaceDestroyed();
        this.f3144g = null;
        if (this.f3145h) {
            this.f3147j.c();
        }
        this.f3145h = false;
    }

    public void r(int i2, int i3) {
        this.f3142e.onSurfaceChanged(i2, i3);
    }

    public void s(Surface surface) {
        this.f3144g = surface;
        this.f3142e.onSurfaceWindowChanged(surface);
    }
}

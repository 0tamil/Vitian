package io.flutter.view;

import android.app.Activity;
import android.content.Context;
import h.a.d.a.c;
import h.a.d.a.d;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.b;
import java.nio.ByteBuffer;
@Deprecated
/* loaded from: classes.dex */
public class e implements d {

    /* renamed from: e  reason: collision with root package name */
    private final h.a.c.e f3388e;

    /* renamed from: f  reason: collision with root package name */
    private final io.flutter.embedding.engine.f.d f3389f;

    /* renamed from: g  reason: collision with root package name */
    private g f3390g;

    /* renamed from: h  reason: collision with root package name */
    private final FlutterJNI f3391h;

    /* renamed from: i  reason: collision with root package name */
    private final Context f3392i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f3393j;

    /* renamed from: k  reason: collision with root package name */
    private final io.flutter.embedding.engine.renderer.b f3394k;

    /* loaded from: classes.dex */
    class a implements io.flutter.embedding.engine.renderer.b {
        a() {
        }

        @Override // io.flutter.embedding.engine.renderer.b
        public void c() {
        }

        @Override // io.flutter.embedding.engine.renderer.b
        public void f() {
            if (e.this.f3390g != null) {
                e.this.f3390g.r();
            }
        }
    }

    /* loaded from: classes.dex */
    private final class b implements b.AbstractC0124b {
        private b() {
        }

        /* synthetic */ b(e eVar, a aVar) {
            this();
        }

        @Override // io.flutter.embedding.engine.b.AbstractC0124b
        public void a() {
            if (e.this.f3390g != null) {
                e.this.f3390g.D();
            }
            if (e.this.f3388e != null) {
                e.this.f3388e.g();
            }
        }

        @Override // io.flutter.embedding.engine.b.AbstractC0124b
        public void b() {
        }
    }

    public e(Context context) {
        this(context, false);
    }

    public e(Context context, boolean z) {
        a aVar = new a();
        this.f3394k = aVar;
        if (z) {
            h.a.b.f("FlutterNativeView", "'isBackgroundView' is no longer supported and will be ignored");
        }
        this.f3392i = context;
        this.f3388e = new h.a.c.e(this, context);
        FlutterJNI flutterJNI = new FlutterJNI();
        this.f3391h = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(aVar);
        this.f3389f = new io.flutter.embedding.engine.f.d(flutterJNI, context.getAssets());
        flutterJNI.addEngineLifecycleListener(new b(this, null));
        i(this);
        h();
    }

    private void i(e eVar) {
        this.f3391h.attachToNative();
        this.f3389f.o();
    }

    @Override // h.a.d.a.d
    public d.c a(d.C0120d dVar) {
        return this.f3389f.k().a(dVar);
    }

    @Override // h.a.d.a.d
    public void b(String str, ByteBuffer byteBuffer, d.b bVar) {
        if (!q()) {
            h.a.b.a("FlutterNativeView", "FlutterView.send called on a detached view, channel=" + str);
            return;
        }
        this.f3389f.k().b(str, byteBuffer, bVar);
    }

    @Override // h.a.d.a.d
    public void d(String str, d.a aVar) {
        this.f3389f.k().d(str, aVar);
    }

    @Override // h.a.d.a.d
    public /* synthetic */ d.c e() {
        return c.a(this);
    }

    @Override // h.a.d.a.d
    public void g(String str, d.a aVar, d.c cVar) {
        this.f3389f.k().g(str, aVar, cVar);
    }

    public void h() {
        if (!q()) {
            throw new AssertionError("Platform view is not attached");
        }
    }

    public void j(g gVar, Activity activity) {
        this.f3390g = gVar;
        this.f3388e.c(gVar, activity);
    }

    public void k() {
        this.f3388e.d();
        this.f3389f.p();
        this.f3390g = null;
        this.f3391h.removeIsDisplayingFlutterUiListener(this.f3394k);
        this.f3391h.detachFromNativeAndReleaseResources();
        this.f3393j = false;
    }

    public void l() {
        this.f3388e.e();
        this.f3390g = null;
    }

    public io.flutter.embedding.engine.f.d m() {
        return this.f3389f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlutterJNI n() {
        return this.f3391h;
    }

    public h.a.c.e o() {
        return this.f3388e;
    }

    public boolean p() {
        return this.f3393j;
    }

    public boolean q() {
        return this.f3391h.isAttached();
    }

    public void r(f fVar) {
        if (fVar.b != null) {
            h();
            if (!this.f3393j) {
                this.f3391h.runBundleAndSnapshotFromLibrary(fVar.a, fVar.b, fVar.c, this.f3392i.getResources().getAssets(), null);
                this.f3393j = true;
                return;
            }
            throw new AssertionError("This Flutter engine instance is already running an application");
        }
        throw new AssertionError("An entrypoint must be specified");
    }
}

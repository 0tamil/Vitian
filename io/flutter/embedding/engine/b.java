package io.flutter.embedding.engine;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import io.flutter.embedding.engine.f.d;
import io.flutter.embedding.engine.j.c;
import io.flutter.embedding.engine.j.e;
import io.flutter.embedding.engine.j.f;
import io.flutter.embedding.engine.j.g;
import io.flutter.embedding.engine.j.h;
import io.flutter.embedding.engine.j.i;
import io.flutter.embedding.engine.j.k;
import io.flutter.embedding.engine.j.l;
import io.flutter.embedding.engine.j.m;
import io.flutter.embedding.engine.j.n;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class b {
    private final FlutterJNI a;
    private final io.flutter.embedding.engine.renderer.a b;
    private final d c;

    /* renamed from: d  reason: collision with root package name */
    private final d f2975d;

    /* renamed from: e  reason: collision with root package name */
    private final h.a.d.b.a f2976e;

    /* renamed from: f  reason: collision with root package name */
    private final io.flutter.embedding.engine.j.b f2977f;

    /* renamed from: g  reason: collision with root package name */
    private final c f2978g;

    /* renamed from: h  reason: collision with root package name */
    private final io.flutter.embedding.engine.j.d f2979h;

    /* renamed from: i  reason: collision with root package name */
    private final e f2980i;

    /* renamed from: j  reason: collision with root package name */
    private final f f2981j;

    /* renamed from: k  reason: collision with root package name */
    private final g f2982k;
    private final h l;
    private final k m;
    private final i n;
    private final l o;
    private final m p;
    private final n q;
    private final h.a.d.d.l r;
    private final Set<AbstractC0124b> s;
    private final AbstractC0124b t;

    /* loaded from: classes.dex */
    class a implements AbstractC0124b {
        a() {
        }

        @Override // io.flutter.embedding.engine.b.AbstractC0124b
        public void a() {
            h.a.b.e("FlutterEngine", "onPreEngineRestart()");
            for (AbstractC0124b bVar : b.this.s) {
                bVar.a();
            }
            b.this.r.S();
            b.this.m.g();
        }

        @Override // io.flutter.embedding.engine.b.AbstractC0124b
        public void b() {
        }
    }

    /* renamed from: io.flutter.embedding.engine.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface AbstractC0124b {
        void a();

        void b();
    }

    public b(Context context) {
        this(context, null);
    }

    public b(Context context, io.flutter.embedding.engine.h.f fVar, FlutterJNI flutterJNI, h.a.d.d.l lVar, String[] strArr, boolean z) {
        this(context, fVar, flutterJNI, lVar, strArr, z, false);
    }

    public b(Context context, io.flutter.embedding.engine.h.f fVar, FlutterJNI flutterJNI, h.a.d.d.l lVar, String[] strArr, boolean z, boolean z2) {
        AssetManager assetManager;
        this.s = new HashSet();
        this.t = new a();
        try {
            assetManager = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assetManager = context.getAssets();
        }
        h.a.a e2 = h.a.a.e();
        flutterJNI = flutterJNI == null ? e2.d().a() : flutterJNI;
        this.a = flutterJNI;
        d dVar = new d(flutterJNI, assetManager);
        this.c = dVar;
        dVar.o();
        io.flutter.embedding.engine.g.a a2 = h.a.a.e().a();
        this.f2977f = new io.flutter.embedding.engine.j.b(dVar, flutterJNI);
        c cVar = new c(dVar);
        this.f2978g = cVar;
        this.f2979h = new io.flutter.embedding.engine.j.d(dVar);
        this.f2980i = new e(dVar);
        f fVar2 = new f(dVar);
        this.f2981j = fVar2;
        this.f2982k = new g(dVar);
        this.l = new h(dVar);
        this.n = new i(dVar);
        this.m = new k(dVar, z2);
        this.o = new l(dVar);
        this.p = new m(dVar);
        this.q = new n(dVar);
        if (a2 != null) {
            a2.f(cVar);
        }
        h.a.d.b.a aVar = new h.a.d.b.a(context, fVar2);
        this.f2976e = aVar;
        fVar = fVar == null ? e2.c() : fVar;
        if (!flutterJNI.isAttached()) {
            fVar.p(context.getApplicationContext());
            fVar.e(context, strArr);
        }
        flutterJNI.addEngineLifecycleListener(this.t);
        flutterJNI.setPlatformViewsController(lVar);
        flutterJNI.setLocalizationPlugin(aVar);
        flutterJNI.setDeferredComponentManager(e2.a());
        if (!flutterJNI.isAttached()) {
            d();
        }
        this.b = new io.flutter.embedding.engine.renderer.a(flutterJNI);
        this.r = lVar;
        lVar.M();
        this.f2975d = new d(context.getApplicationContext(), this, fVar);
        if (z && fVar.d()) {
            io.flutter.embedding.engine.i.g.a.a(this);
        }
    }

    public b(Context context, io.flutter.embedding.engine.h.f fVar, FlutterJNI flutterJNI, String[] strArr, boolean z) {
        this(context, fVar, flutterJNI, new h.a.d.d.l(), strArr, z);
    }

    public b(Context context, String[] strArr) {
        this(context, null, null, strArr, true);
    }

    public b(Context context, String[] strArr, boolean z, boolean z2) {
        this(context, null, null, new h.a.d.d.l(), strArr, z, z2);
    }

    private void d() {
        h.a.b.e("FlutterEngine", "Attaching to JNI.");
        this.a.attachToNative();
        if (!v()) {
            throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
        }
    }

    private boolean v() {
        return this.a.isAttached();
    }

    public void e() {
        h.a.b.e("FlutterEngine", "Destroying.");
        for (AbstractC0124b bVar : this.s) {
            bVar.b();
        }
        this.f2975d.i();
        this.r.O();
        this.c.p();
        this.a.removeEngineLifecycleListener(this.t);
        this.a.setDeferredComponentManager(null);
        this.a.detachFromNativeAndReleaseResources();
        if (h.a.a.e().a() != null) {
            h.a.a.e().a().b();
            this.f2978g.c(null);
        }
    }

    public io.flutter.embedding.engine.j.b f() {
        return this.f2977f;
    }

    public io.flutter.embedding.engine.i.c.b g() {
        return this.f2975d;
    }

    public d h() {
        return this.c;
    }

    public io.flutter.embedding.engine.j.d i() {
        return this.f2979h;
    }

    public e j() {
        return this.f2980i;
    }

    public h.a.d.b.a k() {
        return this.f2976e;
    }

    public g l() {
        return this.f2982k;
    }

    public h m() {
        return this.l;
    }

    public i n() {
        return this.n;
    }

    public h.a.d.d.l o() {
        return this.r;
    }

    public io.flutter.embedding.engine.i.b p() {
        return this.f2975d;
    }

    public io.flutter.embedding.engine.renderer.a q() {
        return this.b;
    }

    public k r() {
        return this.m;
    }

    public l s() {
        return this.o;
    }

    public m t() {
        return this.p;
    }

    public n u() {
        return this.q;
    }
}

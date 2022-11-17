package io.flutter.plugins.urllauncher;

import android.util.Log;
import io.flutter.embedding.engine.i.a;
/* loaded from: classes.dex */
public final class c implements a, io.flutter.embedding.engine.i.c.a {

    /* renamed from: e  reason: collision with root package name */
    private a f3338e;

    /* renamed from: f  reason: collision with root package name */
    private b f3339f;

    @Override // io.flutter.embedding.engine.i.c.a
    public void onAttachedToActivity(io.flutter.embedding.engine.i.c.c cVar) {
        if (this.f3338e == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            this.f3339f.d(cVar.d());
        }
    }

    @Override // io.flutter.embedding.engine.i.a
    public void onAttachedToEngine(a.b bVar) {
        b bVar2 = new b(bVar.a(), null);
        this.f3339f = bVar2;
        a aVar = new a(bVar2);
        this.f3338e = aVar;
        aVar.e(bVar.b());
    }

    @Override // io.flutter.embedding.engine.i.c.a
    public void onDetachedFromActivity() {
        if (this.f3338e == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            this.f3339f.d(null);
        }
    }

    @Override // io.flutter.embedding.engine.i.c.a
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.i.a
    public void onDetachedFromEngine(a.b bVar) {
        a aVar = this.f3338e;
        if (aVar == null) {
            Log.wtf("UrlLauncherPlugin", "Already detached from the engine.");
            return;
        }
        aVar.f();
        this.f3338e = null;
        this.f3339f = null;
    }

    @Override // io.flutter.embedding.engine.i.c.a
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.i.c.c cVar) {
        onAttachedToActivity(cVar);
    }
}

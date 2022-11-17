package io.flutter.plugins.b;

import android.content.Context;
import h.a.d.a.d;
import h.a.d.a.k;
import io.flutter.embedding.engine.i.a;
/* loaded from: classes.dex */
public class b implements a {

    /* renamed from: e  reason: collision with root package name */
    private k f3217e;

    /* renamed from: f  reason: collision with root package name */
    private a f3218f;

    private void a(d dVar, Context context) {
        this.f3217e = new k(dVar, "plugins.flutter.io/shared_preferences_android");
        a aVar = new a(context);
        this.f3218f = aVar;
        this.f3217e.e(aVar);
    }

    private void b() {
        this.f3218f.f();
        this.f3218f = null;
        this.f3217e.e(null);
        this.f3217e = null;
    }

    @Override // io.flutter.embedding.engine.i.a
    public void onAttachedToEngine(a.b bVar) {
        a(bVar.b(), bVar.a());
    }

    @Override // io.flutter.embedding.engine.i.a
    public void onDetachedFromEngine(a.b bVar) {
        b();
    }
}

package io.flutter.embedding.engine.j;

import h.a.b;
import h.a.d.a.g;
import h.a.d.a.j;
import h.a.d.a.k;
import io.flutter.embedding.engine.f.d;
/* loaded from: classes.dex */
public class h {
    public final k a;
    private final k.c b;

    /* loaded from: classes.dex */
    class a implements k.c {
        a(h hVar) {
        }

        @Override // h.a.d.a.k.c
        public void onMethodCall(j jVar, k.d dVar) {
            dVar.b(null);
        }
    }

    public h(d dVar) {
        a aVar = new a(this);
        this.b = aVar;
        k kVar = new k(dVar, "flutter/navigation", g.a);
        this.a = kVar;
        kVar.e(aVar);
    }

    public void a() {
        b.e("NavigationChannel", "Sending message to pop route.");
        this.a.c("popRoute", null);
    }

    public void b(String str) {
        b.e("NavigationChannel", "Sending message to push route '" + str + "'");
        this.a.c("pushRoute", str);
    }

    public void c(String str) {
        b.e("NavigationChannel", "Sending message to set initial route to '" + str + "'");
        this.a.c("setInitialRoute", str);
    }
}

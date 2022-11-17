package io.flutter.embedding.engine.j;

import h.a.d.a.b;
import h.a.d.a.u;
import io.flutter.embedding.engine.f.d;
/* loaded from: classes.dex */
public class e {
    public final b<String> a;

    public e(d dVar) {
        this.a = new b<>(dVar, "flutter/lifecycle", u.b);
    }

    public void a() {
        h.a.b.e("LifecycleChannel", "Sending AppLifecycleState.detached message.");
        this.a.c("AppLifecycleState.detached");
    }

    public void b() {
        h.a.b.e("LifecycleChannel", "Sending AppLifecycleState.inactive message.");
        this.a.c("AppLifecycleState.inactive");
    }

    public void c() {
        h.a.b.e("LifecycleChannel", "Sending AppLifecycleState.paused message.");
        this.a.c("AppLifecycleState.paused");
    }

    public void d() {
        h.a.b.e("LifecycleChannel", "Sending AppLifecycleState.resumed message.");
        this.a.c("AppLifecycleState.resumed");
    }
}

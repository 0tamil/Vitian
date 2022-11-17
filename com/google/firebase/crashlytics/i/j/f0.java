package com.google.firebase.crashlytics.i.j;

import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class f0 {
    private final AtomicInteger a = new AtomicInteger();
    private final AtomicInteger b = new AtomicInteger();

    public int a() {
        return this.b.get();
    }

    public int b() {
        return this.a.get();
    }

    public void c() {
        this.b.getAndIncrement();
    }

    public void d() {
        this.a.getAndIncrement();
    }

    public void e() {
        this.b.set(0);
    }
}

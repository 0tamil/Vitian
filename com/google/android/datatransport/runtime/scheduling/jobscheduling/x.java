package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import f.b.a.a.i.a0.j.j0;
import f.b.a.a.i.w.b.b;
import i.a.a;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class x implements b<w> {
    private final a<Executor> a;
    private final a<j0> b;
    private final a<y> c;

    /* renamed from: d  reason: collision with root package name */
    private final a<f.b.a.a.i.b0.b> f1029d;

    public x(a<Executor> aVar, a<j0> aVar2, a<y> aVar3, a<f.b.a.a.i.b0.b> aVar4) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f1029d = aVar4;
    }

    public static x b(a<Executor> aVar, a<j0> aVar2, a<y> aVar3, a<f.b.a.a.i.b0.b> aVar4) {
        return new x(aVar, aVar2, aVar3, aVar4);
    }

    public static w d(Executor executor, j0 j0Var, y yVar, f.b.a.a.i.b0.b bVar) {
        return new w(executor, j0Var, yVar, bVar);
    }

    /* renamed from: c */
    public w a() {
        return d(this.a.a(), this.b.a(), this.c.a(), this.f1029d.a());
    }
}

package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.e;
import f.b.a.a.i.a0.j.i0;
import f.b.a.a.i.a0.j.j0;
import f.b.a.a.i.w.b.b;
import i.a.a;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class v implements b<u> {
    private final a<Context> a;
    private final a<e> b;
    private final a<j0> c;

    /* renamed from: d  reason: collision with root package name */
    private final a<y> f1022d;

    /* renamed from: e  reason: collision with root package name */
    private final a<Executor> f1023e;

    /* renamed from: f  reason: collision with root package name */
    private final a<f.b.a.a.i.b0.b> f1024f;

    /* renamed from: g  reason: collision with root package name */
    private final a<f.b.a.a.i.c0.a> f1025g;

    /* renamed from: h  reason: collision with root package name */
    private final a<f.b.a.a.i.c0.a> f1026h;

    /* renamed from: i  reason: collision with root package name */
    private final a<i0> f1027i;

    public v(a<Context> aVar, a<e> aVar2, a<j0> aVar3, a<y> aVar4, a<Executor> aVar5, a<f.b.a.a.i.b0.b> aVar6, a<f.b.a.a.i.c0.a> aVar7, a<f.b.a.a.i.c0.a> aVar8, a<i0> aVar9) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f1022d = aVar4;
        this.f1023e = aVar5;
        this.f1024f = aVar6;
        this.f1025g = aVar7;
        this.f1026h = aVar8;
        this.f1027i = aVar9;
    }

    public static v b(a<Context> aVar, a<e> aVar2, a<j0> aVar3, a<y> aVar4, a<Executor> aVar5, a<f.b.a.a.i.b0.b> aVar6, a<f.b.a.a.i.c0.a> aVar7, a<f.b.a.a.i.c0.a> aVar8, a<i0> aVar9) {
        return new v(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static u d(Context context, e eVar, j0 j0Var, y yVar, Executor executor, f.b.a.a.i.b0.b bVar, f.b.a.a.i.c0.a aVar, f.b.a.a.i.c0.a aVar2, i0 i0Var) {
        return new u(context, eVar, j0Var, yVar, executor, bVar, aVar, aVar2, i0Var);
    }

    /* renamed from: c */
    public u a() {
        return d(this.a.a(), this.b.a(), this.c.a(), this.f1022d.a(), this.f1023e.a(), this.f1024f.a(), this.f1025g.a(), this.f1026h.a(), this.f1027i.a());
    }
}

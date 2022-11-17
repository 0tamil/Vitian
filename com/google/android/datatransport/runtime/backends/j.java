package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import f.b.a.a.i.w.b.b;
import i.a.a;
/* loaded from: classes.dex */
public final class j implements b<i> {
    private final a<Context> a;
    private final a<f.b.a.a.i.c0.a> b;
    private final a<f.b.a.a.i.c0.a> c;

    public j(a<Context> aVar, a<f.b.a.a.i.c0.a> aVar2, a<f.b.a.a.i.c0.a> aVar3) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
    }

    public static j b(a<Context> aVar, a<f.b.a.a.i.c0.a> aVar2, a<f.b.a.a.i.c0.a> aVar3) {
        return new j(aVar, aVar2, aVar3);
    }

    public static i d(Context context, f.b.a.a.i.c0.a aVar, f.b.a.a.i.c0.a aVar2) {
        return new i(context, aVar, aVar2);
    }

    /* renamed from: c */
    public i a() {
        return d(this.a.a(), this.b.a(), this.c.a());
    }
}

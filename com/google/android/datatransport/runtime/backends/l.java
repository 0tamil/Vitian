package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import f.b.a.a.i.w.b.b;
import i.a.a;
/* loaded from: classes.dex */
public final class l implements b<k> {
    private final a<Context> a;
    private final a<i> b;

    public l(a<Context> aVar, a<i> aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    public static l b(a<Context> aVar, a<i> aVar2) {
        return new l(aVar, aVar2);
    }

    public static k d(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    /* renamed from: c */
    public k a() {
        return d(this.a.a(), this.b.a());
    }
}

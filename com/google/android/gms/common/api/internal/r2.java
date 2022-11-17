package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.c;
import e.c.a;
import f.b.a.b.g.j;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class r2 {
    private final a<b<?>, com.google.android.gms.common.a> a;
    private final a<b<?>, String> b;
    private final j<Map<b<?>, String>> c;

    /* renamed from: d  reason: collision with root package name */
    private int f1161d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1162e;

    public final Set<b<?>> a() {
        return this.a.keySet();
    }

    public final void b(b<?> bVar, com.google.android.gms.common.a aVar, String str) {
        this.a.put(bVar, aVar);
        this.b.put(bVar, str);
        this.f1161d--;
        if (!aVar.f()) {
            this.f1162e = true;
        }
        if (this.f1161d != 0) {
            return;
        }
        if (this.f1162e) {
            this.c.b(new c(this.a));
            return;
        }
        this.c.c(this.b);
    }
}

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.internal.o;
/* loaded from: classes.dex */
public final class b<O extends a.d> {
    private final int a;
    private final a<O> b;
    private final O c;

    /* renamed from: d  reason: collision with root package name */
    private final String f1081d;

    private b(a<O> aVar, O o, String str) {
        this.b = aVar;
        this.c = o;
        this.f1081d = str;
        this.a = o.b(aVar, o, str);
    }

    public static <O extends a.d> b<O> a(a<O> aVar, O o, String str) {
        return new b<>(aVar, o, str);
    }

    public final String b() {
        return this.b.d();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return o.a(this.b, bVar.b) && o.a(this.c, bVar.c) && o.a(this.f1081d, bVar.f1081d);
    }

    public final int hashCode() {
        return this.a;
    }
}

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.c;
import com.google.android.gms.common.internal.o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class i1 {
    private final b<?> a;
    private final c b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ i1(b bVar, c cVar, h1 h1Var) {
        this.a = bVar;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof i1)) {
            i1 i1Var = (i1) obj;
            if (o.a(this.a, i1Var.a) && o.a(this.b, i1Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return o.b(this.a, this.b);
    }

    public final String toString() {
        o.a c = o.c(this);
        c.a("key", this.a);
        c.a("feature", this.b);
        return c.toString();
    }
}

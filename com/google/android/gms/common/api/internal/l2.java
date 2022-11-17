package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.internal.p;
/* loaded from: classes.dex */
public final class l2<A extends d<? extends j, a.b>> extends o2 {
    protected final A b;

    public l2(int i2, A a) {
        super(i2);
        p.j(a, "Null methods are not runnable.");
        this.b = a;
    }

    @Override // com.google.android.gms.common.api.internal.o2
    public final void a(Status status) {
        try {
            this.b.w(status);
        } catch (IllegalStateException e2) {
            Log.w("ApiCallRunner", "Exception reporting failure", e2);
        }
    }

    @Override // com.google.android.gms.common.api.internal.o2
    public final void b(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        try {
            this.b.w(new Status(10, sb.toString()));
        } catch (IllegalStateException e2) {
            Log.w("ApiCallRunner", "Exception reporting failure", e2);
        }
    }

    @Override // com.google.android.gms.common.api.internal.o2
    public final void c(g1<?> g1Var) {
        try {
            this.b.u(g1Var.v());
        } catch (RuntimeException e2) {
            b(e2);
        }
    }

    @Override // com.google.android.gms.common.api.internal.o2
    public final void d(w wVar, boolean z) {
        wVar.c(this.b, z);
    }
}

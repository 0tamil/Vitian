package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.j;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
/* loaded from: classes.dex */
public final class l1<O extends a.d> extends z {
    @NotOnlyInitialized
    private final e<O> c;

    @Override // com.google.android.gms.common.api.f
    public final <A extends a.b, R extends j, T extends d<R, A>> T g(T t) {
        this.c.d(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.f
    public final <A extends a.b, T extends d<? extends j, A>> T h(T t) {
        this.c.e(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.f
    public final Context j() {
        return this.c.g();
    }

    @Override // com.google.android.gms.common.api.f
    public final Looper k() {
        return this.c.i();
    }

    @Override // com.google.android.gms.common.api.f
    public final void o(i2 i2Var) {
    }
}

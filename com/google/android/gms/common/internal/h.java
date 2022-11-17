package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.m;
import com.google.android.gms.common.d;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public abstract class h<T extends IInterface> extends c<T> implements a.f, k0 {
    private final Set<Scope> C;
    private final Account D;

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public h(Context context, Looper looper, int i2, e eVar, f.b bVar, f.c cVar) {
        this(context, looper, i2, eVar, (com.google.android.gms.common.api.internal.f) bVar, (m) cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h(Context context, Looper looper, int i2, e eVar, com.google.android.gms.common.api.internal.f fVar, m mVar) {
        this(context, looper, r3, r4, i2, eVar, fVar, mVar);
        i b = i.b(context);
        d n = d.n();
        p.i(fVar);
        p.i(mVar);
    }

    protected h(Context context, Looper looper, i iVar, d dVar, int i2, e eVar, com.google.android.gms.common.api.internal.f fVar, m mVar) {
        super(context, looper, iVar, dVar, i2, fVar == null ? null : new i0(fVar), mVar == null ? null : new j0(mVar), eVar.h());
        this.D = eVar.a();
        Set<Scope> c = eVar.c();
        n0(c);
        this.C = c;
    }

    private final Set<Scope> n0(Set<Scope> set) {
        m0(set);
        for (Scope scope : set) {
            if (!set.contains(scope)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return set;
    }

    @Override // com.google.android.gms.common.internal.c
    protected final Executor A() {
        return null;
    }

    @Override // com.google.android.gms.common.internal.c
    protected final Set<Scope> G() {
        return this.C;
    }

    @Override // com.google.android.gms.common.api.a.f
    public Set<Scope> j() {
        return q() ? this.C : Collections.emptySet();
    }

    protected Set<Scope> m0(Set<Scope> set) {
        return set;
    }

    @Override // com.google.android.gms.common.internal.c
    public final Account y() {
        return this.D;
    }
}

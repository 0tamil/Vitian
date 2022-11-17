package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.j;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class k1 implements c.AbstractC0029c, b2 {
    private final a.f a;
    private final b<?> b;
    private j c = null;

    /* renamed from: d  reason: collision with root package name */
    private Set<Scope> f1136d = null;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1137e = false;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ g f1138f;

    public k1(g gVar, a.f fVar, b<?> bVar) {
        this.f1138f = gVar;
        this.a = fVar;
        this.b = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        j jVar;
        if (this.f1137e && (jVar = this.c) != null) {
            this.a.k(jVar, this.f1136d);
        }
    }

    @Override // com.google.android.gms.common.internal.c.AbstractC0029c
    public final void a(com.google.android.gms.common.a aVar) {
        Handler handler;
        handler = this.f1138f.p;
        handler.post(new j1(this, aVar));
    }

    @Override // com.google.android.gms.common.api.internal.b2
    public final void b(j jVar, Set<Scope> set) {
        if (jVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            c(new com.google.android.gms.common.a(4));
            return;
        }
        this.c = jVar;
        this.f1136d = set;
        h();
    }

    @Override // com.google.android.gms.common.api.internal.b2
    public final void c(com.google.android.gms.common.a aVar) {
        Map map;
        map = this.f1138f.l;
        g1 g1Var = (g1) map.get(this.b);
        if (g1Var != null) {
            g1Var.I(aVar);
        }
    }
}

package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.a;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.e;
import com.google.android.gms.common.internal.d0;
import com.google.android.gms.common.internal.j;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.q0;
import f.b.a.b.e.b.l;
import f.b.a.b.e.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
/* loaded from: classes.dex */
public final class p0 implements v0 {
    private final y0 a;
    private final Lock b;
    private final Context c;

    /* renamed from: d  reason: collision with root package name */
    private final e f1148d;

    /* renamed from: e  reason: collision with root package name */
    private a f1149e;

    /* renamed from: f  reason: collision with root package name */
    private int f1150f;

    /* renamed from: h  reason: collision with root package name */
    private int f1152h;

    /* renamed from: k  reason: collision with root package name */
    private g f1155k;
    private boolean l;
    private boolean m;
    private boolean n;
    private j o;
    private boolean p;
    private boolean q;
    private final com.google.android.gms.common.internal.e r;
    private final Map<com.google.android.gms.common.api.a<?>, Boolean> s;
    private final a.AbstractC0026a<? extends g, f.b.a.b.e.a> t;

    /* renamed from: g  reason: collision with root package name */
    private int f1151g = 0;

    /* renamed from: i  reason: collision with root package name */
    private final Bundle f1153i = new Bundle();

    /* renamed from: j  reason: collision with root package name */
    private final Set<a.c> f1154j = new HashSet();
    private final ArrayList<Future<?>> u = new ArrayList<>();

    public p0(y0 y0Var, com.google.android.gms.common.internal.e eVar, Map<com.google.android.gms.common.api.a<?>, Boolean> map, e eVar2, a.AbstractC0026a<? extends g, f.b.a.b.e.a> aVar, Lock lock, Context context) {
        this.a = y0Var;
        this.r = eVar;
        this.s = map;
        this.f1148d = eVar2;
        this.t = aVar;
        this.b = lock;
        this.c = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void B(p0 p0Var, l lVar) {
        if (p0Var.o(0)) {
            com.google.android.gms.common.a b = lVar.b();
            if (b.f()) {
                q0 c = lVar.c();
                p.i(c);
                q0 q0Var = c;
                com.google.android.gms.common.a b2 = q0Var.b();
                if (!b2.f()) {
                    String valueOf = String.valueOf(b2);
                    String.valueOf(valueOf).length();
                    Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(valueOf)), new Exception());
                    p0Var.l(b2);
                    return;
                }
                p0Var.n = true;
                j c2 = q0Var.c();
                p.i(c2);
                p0Var.o = c2;
                p0Var.p = q0Var.d();
                p0Var.q = q0Var.e();
                p0Var.n();
            } else if (p0Var.q(b)) {
                p0Var.i();
                p0Var.n();
            } else {
                p0Var.l(b);
            }
        }
    }

    private final void J() {
        ArrayList<Future<?>> arrayList = this.u;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.get(i2).cancel(true);
        }
        this.u.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        this.m = false;
        this.a.m.p = Collections.emptySet();
        for (a.c<?> cVar : this.f1154j) {
            if (!this.a.f1196g.containsKey(cVar)) {
                this.a.f1196g.put(cVar, new com.google.android.gms.common.a(17, null));
            }
        }
    }

    private final void j(boolean z) {
        g gVar = this.f1155k;
        if (gVar != null) {
            if (gVar.a() && z) {
                gVar.h();
            }
            gVar.n();
            p.i(this.r);
            this.o = null;
        }
    }

    private final void k() {
        this.a.l();
        z0.a().execute(new d0(this));
        g gVar = this.f1155k;
        if (gVar != null) {
            if (this.p) {
                j jVar = this.o;
                p.i(jVar);
                gVar.f(jVar, this.q);
            }
            j(false);
        }
        for (a.c<?> cVar : this.a.f1196g.keySet()) {
            a.f fVar = this.a.f1195f.get(cVar);
            p.i(fVar);
            fVar.n();
        }
        this.a.n.a(this.f1153i.isEmpty() ? null : this.f1153i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(com.google.android.gms.common.a aVar) {
        J();
        j(!aVar.e());
        this.a.n(aVar);
        this.a.n.c(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(com.google.android.gms.common.a aVar, com.google.android.gms.common.api.a<?> aVar2, boolean z) {
        int b = aVar2.c().b();
        if ((!z || aVar.e() || this.f1148d.b(aVar.b()) != null) && (this.f1149e == null || b < this.f1150f)) {
            this.f1149e = aVar;
            this.f1150f = b;
        }
        this.a.f1196g.put(aVar2.b(), aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        if (this.f1152h == 0) {
            if (!this.m || this.n) {
                ArrayList arrayList = new ArrayList();
                this.f1151g = 1;
                this.f1152h = this.a.f1195f.size();
                for (a.c<?> cVar : this.a.f1195f.keySet()) {
                    if (!this.a.f1196g.containsKey(cVar)) {
                        arrayList.add(this.a.f1195f.get(cVar));
                    } else if (p()) {
                        k();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.u.add(z0.a().submit(new i0(this, arrayList)));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean o(int i2) {
        if (this.f1151g == i2) {
            return true;
        }
        Log.w("GACConnecting", this.a.m.r());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        int i3 = this.f1152h;
        StringBuilder sb = new StringBuilder(33);
        sb.append("mRemainingConnections=");
        sb.append(i3);
        Log.w("GACConnecting", sb.toString());
        String r = r(this.f1151g);
        String r2 = r(i2);
        StringBuilder sb2 = new StringBuilder(r.length() + 70 + r2.length());
        sb2.append("GoogleApiClient connecting is in step ");
        sb2.append(r);
        sb2.append(" but received callback for step ");
        sb2.append(r2);
        Log.e("GACConnecting", sb2.toString(), new Exception());
        l(new com.google.android.gms.common.a(8, null));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean p() {
        com.google.android.gms.common.a aVar;
        int i2 = this.f1152h - 1;
        this.f1152h = i2;
        if (i2 > 0) {
            return false;
        }
        if (i2 < 0) {
            Log.w("GACConnecting", this.a.m.r());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            aVar = new com.google.android.gms.common.a(8, null);
        } else {
            aVar = this.f1149e;
            if (aVar == null) {
                return true;
            }
            this.a.l = this.f1150f;
        }
        l(aVar);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean q(com.google.android.gms.common.a aVar) {
        return this.l && !aVar.e();
    }

    private static final String r(int i2) {
        return i2 != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ Set y(p0 p0Var) {
        com.google.android.gms.common.internal.e eVar = p0Var.r;
        if (eVar == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(eVar.e());
        Map<com.google.android.gms.common.api.a<?>, d0> i2 = p0Var.r.i();
        for (com.google.android.gms.common.api.a<?> aVar : i2.keySet()) {
            if (!p0Var.a.f1196g.containsKey(aVar.b())) {
                hashSet.addAll(i2.get(aVar).a);
            }
        }
        return hashSet;
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public final void a() {
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public final void b(Bundle bundle) {
        if (o(1)) {
            if (bundle != null) {
                this.f1153i.putAll(bundle);
            }
            if (p()) {
                k();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public final <A extends a.b, R extends com.google.android.gms.common.api.j, T extends d<R, A>> T c(T t) {
        this.a.m.f1178h.add(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public final boolean d() {
        J();
        j(true);
        this.a.n(null);
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public final void e(com.google.android.gms.common.a aVar, com.google.android.gms.common.api.a<?> aVar2, boolean z) {
        if (o(1)) {
            m(aVar, aVar2, z);
            if (p()) {
                k();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public final void f(int i2) {
        l(new com.google.android.gms.common.a(8, null));
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public final void g() {
        this.a.f1196g.clear();
        this.m = false;
        this.f1149e = null;
        this.f1151g = 0;
        this.l = true;
        this.n = false;
        this.p = false;
        HashMap hashMap = new HashMap();
        boolean z = false;
        for (com.google.android.gms.common.api.a<?> aVar : this.s.keySet()) {
            a.f fVar = this.a.f1195f.get(aVar.b());
            p.i(fVar);
            a.f fVar2 = fVar;
            z |= aVar.c().b() == 1;
            boolean booleanValue = this.s.get(aVar).booleanValue();
            if (fVar2.q()) {
                this.m = true;
                if (booleanValue) {
                    this.f1154j.add(aVar.b());
                } else {
                    this.l = false;
                }
            }
            hashMap.put(fVar2, new e0(this, aVar, booleanValue));
        }
        if (z) {
            this.m = false;
        }
        if (this.m) {
            p.i(this.r);
            p.i(this.t);
            this.r.j(Integer.valueOf(System.identityHashCode(this.a.m)));
            m0 m0Var = new m0(this, null);
            a.AbstractC0026a<? extends g, f.b.a.b.e.a> aVar2 = this.t;
            Context context = this.c;
            Looper k2 = this.a.m.k();
            com.google.android.gms.common.internal.e eVar = this.r;
            this.f1155k = aVar2.c(context, k2, eVar, eVar.f(), m0Var, m0Var);
        }
        this.f1152h = this.a.f1195f.size();
        this.u.add(z0.a().submit(new h0(this, hashMap)));
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public final <A extends a.b, T extends d<? extends com.google.android.gms.common.api.j, A>> T h(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}

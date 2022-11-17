package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.e;
import com.google.android.gms.common.internal.p;
import f.b.a.b.e.g;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
/* loaded from: classes.dex */
public final class t implements q1 {
    private final Context a;
    private final u0 b;
    private final y0 c;

    /* renamed from: d */
    private final y0 f1165d;

    /* renamed from: e */
    private final Map<a.c<?>, y0> f1166e;

    /* renamed from: g */
    private final a.f f1168g;

    /* renamed from: h */
    private Bundle f1169h;
    private final Lock l;

    /* renamed from: f */
    private final Set<p> f1167f = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: i */
    private com.google.android.gms.common.a f1170i = null;

    /* renamed from: j */
    private com.google.android.gms.common.a f1171j = null;

    /* renamed from: k */
    private boolean f1172k = false;
    private int m = 0;

    private t(Context context, u0 u0Var, Lock lock, Looper looper, e eVar, Map<a.c<?>, a.f> map, Map<a.c<?>, a.f> map2, com.google.android.gms.common.internal.e eVar2, a.AbstractC0026a<? extends g, f.b.a.b.e.a> aVar, a.f fVar, ArrayList<z2> arrayList, ArrayList<z2> arrayList2, Map<a<?>, Boolean> map3, Map<a<?>, Boolean> map4) {
        this.a = context;
        this.b = u0Var;
        this.l = lock;
        this.f1168g = fVar;
        this.c = new y0(context, u0Var, lock, looper, eVar, map2, null, map4, null, arrayList2, new c3(this, null));
        this.f1165d = new y0(context, u0Var, lock, looper, eVar, map, eVar2, map3, aVar, arrayList, new e3(this, null));
        e.c.a aVar2 = new e.c.a();
        for (a.c<?> cVar : map2.keySet()) {
            aVar2.put(cVar, this.c);
        }
        for (a.c<?> cVar2 : map.keySet()) {
            aVar2.put(cVar2, this.f1165d);
        }
        this.f1166e = Collections.unmodifiableMap(aVar2);
    }

    private final void b(com.google.android.gms.common.a aVar) {
        int i2 = this.m;
        if (i2 != 1) {
            if (i2 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.m = 0;
            }
            this.b.c(aVar);
        }
        d();
        this.m = 0;
    }

    private final void d() {
        for (p pVar : this.f1167f) {
            pVar.a();
        }
        this.f1167f.clear();
    }

    private final boolean j() {
        com.google.android.gms.common.a aVar = this.f1171j;
        return aVar != null && aVar.b() == 4;
    }

    private final boolean k(d<? extends j, ? extends a.b> dVar) {
        y0 y0Var = this.f1166e.get(dVar.s());
        p.j(y0Var, "GoogleApiClient is not configured to use the API required for this call.");
        return y0Var.equals(this.f1165d);
    }

    private static boolean l(com.google.android.gms.common.a aVar) {
        return aVar != null && aVar.f();
    }

    public static t n(Context context, u0 u0Var, Lock lock, Looper looper, e eVar, Map<a.c<?>, a.f> map, com.google.android.gms.common.internal.e eVar2, Map<a<?>, Boolean> map2, a.AbstractC0026a<? extends g, f.b.a.b.e.a> aVar, ArrayList<z2> arrayList) {
        e.c.a aVar2 = new e.c.a();
        e.c.a aVar3 = new e.c.a();
        a.f fVar = null;
        for (Map.Entry<a.c<?>, a.f> entry : map.entrySet()) {
            a.f value = entry.getValue();
            if (true == value.g()) {
                fVar = value;
            }
            boolean q = value.q();
            a.c<?> key = entry.getKey();
            if (q) {
                aVar2.put(key, value);
            } else {
                aVar3.put(key, value);
            }
        }
        p.l(!aVar2.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        e.c.a aVar4 = new e.c.a();
        e.c.a aVar5 = new e.c.a();
        for (a<?> aVar6 : map2.keySet()) {
            a.c<?> b = aVar6.b();
            if (aVar2.containsKey(b)) {
                aVar4.put(aVar6, map2.get(aVar6));
            } else if (aVar3.containsKey(b)) {
                aVar5.put(aVar6, map2.get(aVar6));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            z2 z2Var = arrayList.get(i2);
            if (aVar4.containsKey(z2Var.a)) {
                arrayList2.add(z2Var);
            } else if (aVar5.containsKey(z2Var.a)) {
                arrayList3.add(z2Var);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        return new t(context, u0Var, lock, looper, eVar, aVar2, aVar3, eVar2, aVar, fVar, arrayList2, arrayList3, aVar4, aVar5);
    }

    public static /* bridge */ /* synthetic */ void u(t tVar, int i2, boolean z) {
        tVar.b.b(i2, z);
        tVar.f1171j = null;
        tVar.f1170i = null;
    }

    public static /* bridge */ /* synthetic */ void v(t tVar, Bundle bundle) {
        Bundle bundle2 = tVar.f1169h;
        if (bundle2 == null) {
            tVar.f1169h = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    public static /* bridge */ /* synthetic */ void w(t tVar) {
        com.google.android.gms.common.a aVar;
        if (l(tVar.f1170i)) {
            if (l(tVar.f1171j) || tVar.j()) {
                int i2 = tVar.m;
                if (i2 != 1) {
                    if (i2 != 2) {
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                        tVar.m = 0;
                        return;
                    }
                    u0 u0Var = tVar.b;
                    p.i(u0Var);
                    u0Var.a(tVar.f1169h);
                }
                tVar.d();
                tVar.m = 0;
                return;
            }
            com.google.android.gms.common.a aVar2 = tVar.f1171j;
            if (aVar2 == null) {
                return;
            }
            if (tVar.m == 1) {
                tVar.d();
                return;
            }
            tVar.b(aVar2);
            tVar.c.a();
        } else if (tVar.f1170i == null || !l(tVar.f1171j)) {
            com.google.android.gms.common.a aVar3 = tVar.f1170i;
            if (aVar3 != null && (aVar = tVar.f1171j) != null) {
                if (tVar.f1165d.l < tVar.c.l) {
                    aVar3 = aVar;
                }
                tVar.b(aVar3);
            }
        } else {
            tVar.f1165d.a();
            com.google.android.gms.common.a aVar4 = tVar.f1170i;
            p.i(aVar4);
            tVar.b(aVar4);
        }
    }

    private final PendingIntent y() {
        if (this.f1168g == null) {
            return null;
        }
        return f.b.a.b.d.a.e.a(this.a, System.identityHashCode(this.b), this.f1168g.p(), f.b.a.b.d.a.e.a | 134217728);
    }

    @Override // com.google.android.gms.common.api.internal.q1
    public final void a() {
        this.f1171j = null;
        this.f1170i = null;
        this.m = 0;
        this.c.a();
        this.f1165d.a();
        d();
    }

    @Override // com.google.android.gms.common.api.internal.q1
    public final <A extends a.b, R extends j, T extends d<R, A>> T c(T t) {
        if (!k(t)) {
            this.c.c(t);
            return t;
        } else if (j()) {
            t.w(new Status(4, (String) null, y()));
            return t;
        } else {
            this.f1165d.c(t);
            return t;
        }
    }

    @Override // com.google.android.gms.common.api.internal.q1
    public final void e() {
        this.c.e();
        this.f1165d.e();
    }

    @Override // com.google.android.gms.common.api.internal.q1
    public final void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.f1165d.f(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.c.f(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (r3.m == 1) goto L11;
     */
    @Override // com.google.android.gms.common.api.internal.q1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g() {
        this.l.lock();
        try {
            boolean z = false;
            if (this.c.g()) {
                if (!this.f1165d.g() && !j()) {
                }
                z = true;
            }
            return z;
        } finally {
            this.l.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.q1
    public final void h() {
        this.m = 2;
        this.f1172k = false;
        this.f1171j = null;
        this.f1170i = null;
        this.c.h();
        this.f1165d.h();
    }

    @Override // com.google.android.gms.common.api.internal.q1
    public final <A extends a.b, T extends d<? extends j, A>> T i(T t) {
        if (!k(t)) {
            return (T) this.c.i(t);
        }
        if (!j()) {
            return (T) this.f1165d.i(t);
        }
        t.w(new Status(4, (String) null, y()));
        return t;
    }
}

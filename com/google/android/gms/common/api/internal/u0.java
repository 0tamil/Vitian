package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.d;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.k0;
import com.google.android.gms.common.internal.l0;
import com.google.android.gms.common.internal.p;
import f.b.a.b.e.g;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;
/* loaded from: classes.dex */
public final class u0 extends f implements o1 {
    private final Lock b;
    private final l0 c;

    /* renamed from: e  reason: collision with root package name */
    private final int f1175e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f1176f;

    /* renamed from: g  reason: collision with root package name */
    private final Looper f1177g;

    /* renamed from: i  reason: collision with root package name */
    private volatile boolean f1179i;

    /* renamed from: j  reason: collision with root package name */
    private long f1180j;

    /* renamed from: k  reason: collision with root package name */
    private long f1181k;
    private final s0 l;
    private final d m;
    n1 n;
    final Map<a.c<?>, a.f> o;
    Set<Scope> p;
    final e q;
    final Map<a<?>, Boolean> r;
    final a.AbstractC0026a<? extends g, f.b.a.b.e.a> s;
    private final k t;
    private final ArrayList<z2> u;
    private Integer v;
    Set<i2> w;
    final k2 x;
    private final k0 y;

    /* renamed from: d  reason: collision with root package name */
    private q1 f1174d = null;

    /* renamed from: h  reason: collision with root package name */
    final Queue<d<?, ?>> f1178h = new LinkedList();

    public u0(Context context, Lock lock, Looper looper, e eVar, d dVar, a.AbstractC0026a<? extends g, f.b.a.b.e.a> aVar, Map<a<?>, Boolean> map, List<f.b> list, List<f.c> list2, Map<a.c<?>, a.f> map2, int i2, int i3, ArrayList<z2> arrayList) {
        this.f1180j = true != com.google.android.gms.common.util.d.a() ? 120000L : 10000L;
        this.f1181k = 5000L;
        this.p = new HashSet();
        this.t = new k();
        this.v = null;
        this.w = null;
        r0 r0Var = new r0(this);
        this.y = r0Var;
        this.f1176f = context;
        this.b = lock;
        this.c = new l0(looper, r0Var);
        this.f1177g = looper;
        this.l = new s0(this, looper);
        this.m = dVar;
        this.f1175e = i2;
        if (i2 >= 0) {
            this.v = Integer.valueOf(i3);
        }
        this.r = map;
        this.o = map2;
        this.u = arrayList;
        this.x = new k2();
        for (f.b bVar : list) {
            this.c.f(bVar);
        }
        for (f.c cVar : list2) {
            this.c.g(cVar);
        }
        this.q = eVar;
        this.s = aVar;
    }

    public static int q(Iterable<a.f> iterable, boolean z) {
        boolean z2 = false;
        boolean z3 = false;
        for (a.f fVar : iterable) {
            z2 |= fVar.q();
            z3 |= fVar.g();
        }
        if (z2) {
            return (!z3 || !z) ? 1 : 2;
        }
        return 3;
    }

    static String s(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void t(u0 u0Var) {
        u0Var.b.lock();
        try {
            if (u0Var.f1179i) {
                u0Var.x();
            }
        } finally {
            u0Var.b.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void u(u0 u0Var) {
        u0Var.b.lock();
        try {
            if (u0Var.v()) {
                u0Var.x();
            }
        } finally {
            u0Var.b.unlock();
        }
    }

    private final void w(int i2) {
        q1 y0Var;
        Integer num = this.v;
        if (num == null) {
            this.v = Integer.valueOf(i2);
        } else if (num.intValue() != i2) {
            String s = s(i2);
            String s2 = s(this.v.intValue());
            StringBuilder sb = new StringBuilder(s.length() + 51 + s2.length());
            sb.append("Cannot use sign-in mode: ");
            sb.append(s);
            sb.append(". Mode was already set to ");
            sb.append(s2);
            throw new IllegalStateException(sb.toString());
        }
        if (this.f1174d == null) {
            boolean z = false;
            boolean z2 = false;
            for (a.f fVar : this.o.values()) {
                z |= fVar.q();
                z2 |= fVar.g();
            }
            int intValue = this.v.intValue();
            if (intValue != 1) {
                if (intValue == 2 && z) {
                    y0Var = t.n(this.f1176f, this, this.b, this.f1177g, this.m, this.o, this.q, this.r, this.s, this.u);
                    this.f1174d = y0Var;
                }
            } else if (!z) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            } else if (z2) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            y0Var = new y0(this.f1176f, this, this.b, this.f1177g, this.m, this.o, this.q, this.r, this.s, this.u, this);
            this.f1174d = y0Var;
        }
    }

    private final void x() {
        this.c.b();
        q1 q1Var = this.f1174d;
        p.i(q1Var);
        q1Var.h();
    }

    @Override // com.google.android.gms.common.api.internal.o1
    public final void a(Bundle bundle) {
        while (!this.f1178h.isEmpty()) {
            h(this.f1178h.remove());
        }
        this.c.d(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.o1
    public final void b(int i2, boolean z) {
        if (i2 == 1) {
            if (!z && !this.f1179i) {
                this.f1179i = true;
                if (this.n == null && !com.google.android.gms.common.util.d.a()) {
                    try {
                        this.n = this.m.s(this.f1176f.getApplicationContext(), new t0(this));
                    } catch (SecurityException unused) {
                    }
                }
                s0 s0Var = this.l;
                s0Var.sendMessageDelayed(s0Var.obtainMessage(1), this.f1180j);
                s0 s0Var2 = this.l;
                s0Var2.sendMessageDelayed(s0Var2.obtainMessage(2), this.f1181k);
            }
            i2 = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.x.a.toArray(new BasePendingResult[0])) {
            basePendingResult.f(k2.c);
        }
        this.c.e(i2);
        this.c.a();
        if (i2 == 2) {
            x();
        }
    }

    @Override // com.google.android.gms.common.api.internal.o1
    public final void c(com.google.android.gms.common.a aVar) {
        if (!this.m.i(this.f1176f, aVar.b())) {
            v();
        }
        if (!this.f1179i) {
            this.c.c(aVar);
            this.c.a();
        }
    }

    @Override // com.google.android.gms.common.api.f
    public final void d() {
        this.b.lock();
        try {
            int i2 = 2;
            boolean z = false;
            if (this.f1175e >= 0) {
                p.l(this.v != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.v;
                if (num == null) {
                    this.v = Integer.valueOf(q(this.o.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            Integer num2 = this.v;
            p.i(num2);
            int intValue = num2.intValue();
            this.b.lock();
            if (intValue == 3 || intValue == 1) {
                i2 = intValue;
            } else if (intValue != 2) {
                i2 = intValue;
                StringBuilder sb = new StringBuilder(33);
                sb.append("Illegal sign-in mode: ");
                sb.append(i2);
                p.b(z, sb.toString());
                w(i2);
                x();
                this.b.unlock();
            }
            z = true;
            StringBuilder sb2 = new StringBuilder(33);
            sb2.append("Illegal sign-in mode: ");
            sb2.append(i2);
            p.b(z, sb2.toString());
            w(i2);
            x();
            this.b.unlock();
        } finally {
            this.b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.f
    public final void e() {
        this.b.lock();
        try {
            this.x.b();
            q1 q1Var = this.f1174d;
            if (q1Var != null) {
                q1Var.a();
            }
            this.t.c();
            for (d<?, ?> dVar : this.f1178h) {
                dVar.p(null);
                dVar.d();
            }
            this.f1178h.clear();
            if (this.f1174d != null) {
                v();
                this.c.a();
            }
        } finally {
            this.b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.f
    public final void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.f1176f);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.f1179i);
        printWriter.append(" mWorkQueue.size()=").print(this.f1178h.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.x.a.size());
        q1 q1Var = this.f1174d;
        if (q1Var != null) {
            q1Var.f(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.f
    public final <A extends a.b, R extends j, T extends d<R, A>> T g(T t) {
        a<?> r = t.r();
        boolean containsKey = this.o.containsKey(t.s());
        String d2 = r != null ? r.d() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(d2).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(d2);
        sb.append(" required for this call.");
        p.b(containsKey, sb.toString());
        this.b.lock();
        try {
            q1 q1Var = this.f1174d;
            if (q1Var == null) {
                this.f1178h.add(t);
            } else {
                t = (T) q1Var.c(t);
            }
            return t;
        } finally {
            this.b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.f
    public final <A extends a.b, T extends d<? extends j, A>> T h(T t) {
        a<?> r = t.r();
        boolean containsKey = this.o.containsKey(t.s());
        String d2 = r != null ? r.d() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(d2).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(d2);
        sb.append(" required for this call.");
        p.b(containsKey, sb.toString());
        this.b.lock();
        try {
            q1 q1Var = this.f1174d;
            if (q1Var != null) {
                if (this.f1179i) {
                    this.f1178h.add(t);
                    while (!this.f1178h.isEmpty()) {
                        d<?, ?> remove = this.f1178h.remove();
                        this.x.a(remove);
                        remove.w(Status.f1047k);
                    }
                } else {
                    t = (T) q1Var.i(t);
                }
                return t;
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        } finally {
            this.b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.f
    public final <C extends a.f> C i(a.c<C> cVar) {
        C c = (C) this.o.get(cVar);
        p.j(c, "Appropriate Api was not requested.");
        return c;
    }

    @Override // com.google.android.gms.common.api.f
    public final Context j() {
        return this.f1176f;
    }

    @Override // com.google.android.gms.common.api.f
    public final Looper k() {
        return this.f1177g;
    }

    @Override // com.google.android.gms.common.api.f
    public final boolean l() {
        q1 q1Var = this.f1174d;
        return q1Var != null && q1Var.g();
    }

    @Override // com.google.android.gms.common.api.f
    public final void m(f.c cVar) {
        this.c.g(cVar);
    }

    @Override // com.google.android.gms.common.api.f
    public final void n(f.c cVar) {
        this.c.h(cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (r3 == false) goto L19;
     */
    @Override // com.google.android.gms.common.api.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(i2 i2Var) {
        Exception exc;
        String str;
        this.b.lock();
        try {
            Set<i2> set = this.w;
            if (set == null) {
                exc = new Exception();
                str = "Attempted to remove pending transform when no transforms are registered.";
            } else if (!set.remove(i2Var)) {
                exc = new Exception();
                str = "Failed to remove pending transform - this may lead to memory leaks!";
            } else {
                this.b.lock();
                Set<i2> set2 = this.w;
                if (set2 == null) {
                    this.b.unlock();
                } else {
                    boolean z = !set2.isEmpty();
                    this.b.unlock();
                }
                q1 q1Var = this.f1174d;
                if (q1Var != null) {
                    q1Var.e();
                }
            }
            Log.wtf("GoogleApiClientImpl", str, exc);
        } finally {
            this.b.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String r() {
        StringWriter stringWriter = new StringWriter();
        f("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean v() {
        if (!this.f1179i) {
            return false;
        }
        this.f1179i = false;
        this.l.removeMessages(2);
        this.l.removeMessages(1);
        n1 n1Var = this.n;
        if (n1Var != null) {
            n1Var.b();
            this.n = null;
        }
        return true;
    }
}

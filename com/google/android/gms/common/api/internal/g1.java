package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.c;
import com.google.android.gms.common.internal.m0;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.util.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
/* loaded from: classes.dex */
public final class g1<O extends a.d> implements f.b, f.c, a3 {
    @NotOnlyInitialized
    private final a.f b;
    private final b<O> c;

    /* renamed from: g */
    private final int f1114g;

    /* renamed from: h */
    private final c2 f1115h;

    /* renamed from: i */
    private boolean f1116i;
    final /* synthetic */ g m;
    private final Queue<o2> a = new LinkedList();

    /* renamed from: e */
    private final Set<r2> f1112e = new HashSet();

    /* renamed from: f */
    private final Map<j.a<?>, x1> f1113f = new HashMap();

    /* renamed from: j */
    private final List<i1> f1117j = new ArrayList();

    /* renamed from: k */
    private com.google.android.gms.common.a f1118k = null;
    private int l = 0;

    /* renamed from: d */
    private final w f1111d = new w();

    public g1(g gVar, e<O> eVar) {
        Handler handler;
        Context context;
        Handler handler2;
        this.m = gVar;
        handler = gVar.p;
        a.f k2 = eVar.k(handler.getLooper(), this);
        this.b = k2;
        this.c = eVar.f();
        this.f1114g = eVar.j();
        if (k2.q()) {
            context = gVar.f1106g;
            handler2 = gVar.p;
            this.f1115h = eVar.l(context, handler2);
            return;
        }
        this.f1115h = null;
    }

    public static /* bridge */ /* synthetic */ void B(g1 g1Var, i1 i1Var) {
        if (!g1Var.f1117j.contains(i1Var) || g1Var.f1116i) {
            return;
        }
        if (!g1Var.b.a()) {
            g1Var.E();
        } else {
            g1Var.i();
        }
    }

    public static /* bridge */ /* synthetic */ void C(g1 g1Var, i1 i1Var) {
        Handler handler;
        Handler handler2;
        c cVar;
        c[] g2;
        if (g1Var.f1117j.remove(i1Var)) {
            handler = g1Var.m.p;
            handler.removeMessages(15, i1Var);
            handler2 = g1Var.m.p;
            handler2.removeMessages(16, i1Var);
            cVar = i1Var.b;
            ArrayList arrayList = new ArrayList(g1Var.a.size());
            for (o2 o2Var : g1Var.a) {
                if ((o2Var instanceof p1) && (g2 = ((p1) o2Var).g(g1Var)) != null && b.b(g2, cVar)) {
                    arrayList.add(o2Var);
                }
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                o2 o2Var2 = (o2) arrayList.get(i2);
                g1Var.a.remove(o2Var2);
                o2Var2.b(new o(cVar));
            }
        }
    }

    private final c e(c[] cVarArr) {
        if (!(cVarArr == null || cVarArr.length == 0)) {
            c[] d2 = this.b.d();
            if (d2 == null) {
                d2 = new c[0];
            }
            e.c.a aVar = new e.c.a(d2.length);
            for (c cVar : d2) {
                aVar.put(cVar.b(), Long.valueOf(cVar.c()));
            }
            for (c cVar2 : cVarArr) {
                Long l = (Long) aVar.get(cVar2.b());
                if (l == null || l.longValue() < cVar2.c()) {
                    return cVar2;
                }
            }
        }
        return null;
    }

    private final void f(com.google.android.gms.common.a aVar) {
        for (r2 r2Var : this.f1112e) {
            r2Var.b(this.c, aVar, com.google.android.gms.common.internal.o.a(aVar, com.google.android.gms.common.a.f1038i) ? this.b.e() : null);
        }
        this.f1112e.clear();
    }

    public final void g(Status status) {
        Handler handler;
        handler = this.m.p;
        p.c(handler);
        h(status, null, false);
    }

    private final void h(Status status, Exception exc, boolean z) {
        Handler handler;
        handler = this.m.p;
        p.c(handler);
        boolean z2 = false;
        boolean z3 = status == null;
        if (exc == null) {
            z2 = true;
        }
        if (z3 != z2) {
            Iterator<o2> it = this.a.iterator();
            while (it.hasNext()) {
                o2 next = it.next();
                if (!z || next.a == 2) {
                    if (status != null) {
                        next.a(status);
                    } else {
                        next.b(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    private final void i() {
        ArrayList arrayList = new ArrayList(this.a);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            o2 o2Var = (o2) arrayList.get(i2);
            if (this.b.a()) {
                if (o(o2Var)) {
                    this.a.remove(o2Var);
                }
            } else {
                return;
            }
        }
    }

    public final void j() {
        D();
        f(com.google.android.gms.common.a.f1038i);
        n();
        Iterator<x1> it = this.f1113f.values().iterator();
        while (it.hasNext()) {
            x1 next = it.next();
            if (e(next.a.b()) == null) {
                try {
                    next.a.c(this.b, new f.b.a.b.g.j<>());
                } catch (DeadObjectException unused) {
                    b(3);
                    this.b.o("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                }
            }
            it.remove();
        }
        i();
        l();
    }

    public final void k(int i2) {
        Handler handler;
        Handler handler2;
        long j2;
        Handler handler3;
        Handler handler4;
        long j3;
        m0 m0Var;
        D();
        this.f1116i = true;
        this.f1111d.e(i2, this.b.i());
        g gVar = this.m;
        handler = gVar.p;
        handler2 = gVar.p;
        Message obtain = Message.obtain(handler2, 9, this.c);
        j2 = this.m.a;
        handler.sendMessageDelayed(obtain, j2);
        g gVar2 = this.m;
        handler3 = gVar2.p;
        handler4 = gVar2.p;
        Message obtain2 = Message.obtain(handler4, 11, this.c);
        j3 = this.m.b;
        handler3.sendMessageDelayed(obtain2, j3);
        m0Var = this.m.f1108i;
        m0Var.c();
        for (x1 x1Var : this.f1113f.values()) {
            x1Var.c.run();
        }
    }

    private final void l() {
        Handler handler;
        Handler handler2;
        Handler handler3;
        long j2;
        handler = this.m.p;
        handler.removeMessages(12, this.c);
        g gVar = this.m;
        handler2 = gVar.p;
        handler3 = gVar.p;
        Message obtainMessage = handler3.obtainMessage(12, this.c);
        j2 = this.m.c;
        handler2.sendMessageDelayed(obtainMessage, j2);
    }

    private final void m(o2 o2Var) {
        o2Var.d(this.f1111d, Q());
        try {
            o2Var.c(this);
        } catch (DeadObjectException unused) {
            b(1);
            this.b.o("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void n() {
        Handler handler;
        Handler handler2;
        if (this.f1116i) {
            handler = this.m.p;
            handler.removeMessages(11, this.c);
            handler2 = this.m.p;
            handler2.removeMessages(9, this.c);
            this.f1116i = false;
        }
    }

    private final boolean o(o2 o2Var) {
        boolean z;
        Handler handler;
        Handler handler2;
        long j2;
        Handler handler3;
        Handler handler4;
        long j3;
        Handler handler5;
        Handler handler6;
        Handler handler7;
        long j4;
        if (!(o2Var instanceof p1)) {
            m(o2Var);
            return true;
        }
        p1 p1Var = (p1) o2Var;
        c e2 = e(p1Var.g(this));
        if (e2 == null) {
            m(o2Var);
            return true;
        }
        String name = this.b.getClass().getName();
        String b = e2.b();
        long c = e2.c();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 77 + String.valueOf(b).length());
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(b);
        sb.append(", ");
        sb.append(c);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        z = this.m.q;
        if (!z || !p1Var.f(this)) {
            p1Var.b(new o(e2));
            return true;
        }
        i1 i1Var = new i1(this.c, e2, null);
        int indexOf = this.f1117j.indexOf(i1Var);
        if (indexOf >= 0) {
            i1 i1Var2 = this.f1117j.get(indexOf);
            handler5 = this.m.p;
            handler5.removeMessages(15, i1Var2);
            g gVar = this.m;
            handler6 = gVar.p;
            handler7 = gVar.p;
            Message obtain = Message.obtain(handler7, 15, i1Var2);
            j4 = this.m.a;
            handler6.sendMessageDelayed(obtain, j4);
            return false;
        }
        this.f1117j.add(i1Var);
        g gVar2 = this.m;
        handler = gVar2.p;
        handler2 = gVar2.p;
        Message obtain2 = Message.obtain(handler2, 15, i1Var);
        j2 = this.m.a;
        handler.sendMessageDelayed(obtain2, j2);
        g gVar3 = this.m;
        handler3 = gVar3.p;
        handler4 = gVar3.p;
        Message obtain3 = Message.obtain(handler4, 16, i1Var);
        j3 = this.m.b;
        handler3.sendMessageDelayed(obtain3, j3);
        com.google.android.gms.common.a aVar = new com.google.android.gms.common.a(2, null);
        if (p(aVar)) {
            return false;
        }
        this.m.g(aVar, this.f1114g);
        return false;
    }

    private final boolean p(com.google.android.gms.common.a aVar) {
        Object obj;
        x xVar;
        Set set;
        x xVar2;
        obj = g.t;
        synchronized (obj) {
            g gVar = this.m;
            xVar = gVar.m;
            if (xVar != null) {
                set = gVar.n;
                if (set.contains(this.c)) {
                    xVar2 = this.m.m;
                    xVar2.s(aVar, this.f1114g);
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean q(boolean z) {
        Handler handler;
        handler = this.m.p;
        p.c(handler);
        if (!this.b.a() || this.f1113f.size() != 0) {
            return false;
        }
        if (this.f1111d.g()) {
            if (z) {
                l();
            }
            return false;
        }
        this.b.o("Timing out service connection.");
        return true;
    }

    public final void D() {
        Handler handler;
        handler = this.m.p;
        p.c(handler);
        this.f1118k = null;
    }

    public final void E() {
        Handler handler;
        com.google.android.gms.common.a aVar;
        m0 m0Var;
        Context context;
        handler = this.m.p;
        p.c(handler);
        if (!this.b.a() && !this.b.c()) {
            try {
                g gVar = this.m;
                m0Var = gVar.f1108i;
                context = gVar.f1106g;
                int b = m0Var.b(context, this.b);
                if (b != 0) {
                    com.google.android.gms.common.a aVar2 = new com.google.android.gms.common.a(b, null);
                    String name = this.b.getClass().getName();
                    String obj = aVar2.toString();
                    StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 35 + obj.length());
                    sb.append("The service for ");
                    sb.append(name);
                    sb.append(" is not available: ");
                    sb.append(obj);
                    Log.w("GoogleApiManager", sb.toString());
                    H(aVar2, null);
                    return;
                }
                g gVar2 = this.m;
                a.f fVar = this.b;
                k1 k1Var = new k1(gVar2, fVar, this.c);
                if (fVar.q()) {
                    c2 c2Var = this.f1115h;
                    p.i(c2Var);
                    c2Var.U(k1Var);
                }
                try {
                    this.b.m(k1Var);
                } catch (SecurityException e2) {
                    e = e2;
                    aVar = new com.google.android.gms.common.a(10);
                    H(aVar, e);
                }
            } catch (IllegalStateException e3) {
                e = e3;
                aVar = new com.google.android.gms.common.a(10);
            }
        }
    }

    public final void F(o2 o2Var) {
        Handler handler;
        handler = this.m.p;
        p.c(handler);
        if (!this.b.a()) {
            this.a.add(o2Var);
            com.google.android.gms.common.a aVar = this.f1118k;
            if (aVar == null || !aVar.e()) {
                E();
            } else {
                H(this.f1118k, null);
            }
        } else if (o(o2Var)) {
            l();
        } else {
            this.a.add(o2Var);
        }
    }

    public final void G() {
        this.l++;
    }

    public final void H(com.google.android.gms.common.a aVar, Exception exc) {
        Handler handler;
        m0 m0Var;
        boolean z;
        Status h2;
        Status h3;
        Status h4;
        Handler handler2;
        Handler handler3;
        long j2;
        Handler handler4;
        Status status;
        Handler handler5;
        Handler handler6;
        handler = this.m.p;
        p.c(handler);
        c2 c2Var = this.f1115h;
        if (c2Var != null) {
            c2Var.V();
        }
        D();
        m0Var = this.m.f1108i;
        m0Var.c();
        f(aVar);
        if ((this.b instanceof com.google.android.gms.common.internal.y.e) && aVar.b() != 24) {
            this.m.f1103d = true;
            g gVar = this.m;
            handler5 = gVar.p;
            handler6 = gVar.p;
            handler5.sendMessageDelayed(handler6.obtainMessage(19), 300000L);
        }
        if (aVar.b() == 4) {
            status = g.s;
            g(status);
        } else if (this.a.isEmpty()) {
            this.f1118k = aVar;
        } else if (exc != null) {
            handler4 = this.m.p;
            p.c(handler4);
            h(null, exc, false);
        } else {
            z = this.m.q;
            if (z) {
                h3 = g.h(this.c, aVar);
                h(h3, null, true);
                if (!this.a.isEmpty() && !p(aVar) && !this.m.g(aVar, this.f1114g)) {
                    if (aVar.b() == 18) {
                        this.f1116i = true;
                    }
                    if (this.f1116i) {
                        g gVar2 = this.m;
                        handler2 = gVar2.p;
                        handler3 = gVar2.p;
                        Message obtain = Message.obtain(handler3, 9, this.c);
                        j2 = this.m.a;
                        handler2.sendMessageDelayed(obtain, j2);
                        return;
                    }
                    h4 = g.h(this.c, aVar);
                    g(h4);
                    return;
                }
                return;
            }
            h2 = g.h(this.c, aVar);
            g(h2);
        }
    }

    public final void I(com.google.android.gms.common.a aVar) {
        Handler handler;
        handler = this.m.p;
        p.c(handler);
        a.f fVar = this.b;
        String name = fVar.getClass().getName();
        String valueOf = String.valueOf(aVar);
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 25 + String.valueOf(valueOf).length());
        sb.append("onSignInFailed for ");
        sb.append(name);
        sb.append(" with ");
        sb.append(valueOf);
        fVar.o(sb.toString());
        H(aVar, null);
    }

    @Override // com.google.android.gms.common.api.internal.a3
    public final void J(com.google.android.gms.common.a aVar, a<?> aVar2, boolean z) {
        throw null;
    }

    public final void K(r2 r2Var) {
        Handler handler;
        handler = this.m.p;
        p.c(handler);
        this.f1112e.add(r2Var);
    }

    public final void L() {
        Handler handler;
        handler = this.m.p;
        p.c(handler);
        if (this.f1116i) {
            E();
        }
    }

    public final void M() {
        Handler handler;
        handler = this.m.p;
        p.c(handler);
        g(g.r);
        this.f1111d.f();
        for (j.a aVar : (j.a[]) this.f1113f.keySet().toArray(new j.a[0])) {
            F(new n2(aVar, new f.b.a.b.g.j()));
        }
        f(new com.google.android.gms.common.a(4));
        if (this.b.a()) {
            this.b.b(new f1(this));
        }
    }

    public final void N() {
        Handler handler;
        com.google.android.gms.common.d dVar;
        Context context;
        handler = this.m.p;
        p.c(handler);
        if (this.f1116i) {
            n();
            g gVar = this.m;
            dVar = gVar.f1107h;
            context = gVar.f1106g;
            g(dVar.g(context) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.b.o("Timing out connection while resuming.");
        }
    }

    public final boolean P() {
        return this.b.a();
    }

    public final boolean Q() {
        return this.b.q();
    }

    @Override // com.google.android.gms.common.api.internal.m
    public final void a(com.google.android.gms.common.a aVar) {
        H(aVar, null);
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void b(int i2) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.m.p;
        if (myLooper == handler.getLooper()) {
            k(i2);
            return;
        }
        handler2 = this.m.p;
        handler2.post(new d1(this, i2));
    }

    public final boolean c() {
        return q(true);
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void d(Bundle bundle) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.m.p;
        if (myLooper == handler.getLooper()) {
            j();
            return;
        }
        handler2 = this.m.p;
        handler2.post(new c1(this));
    }

    public final int r() {
        return this.f1114g;
    }

    public final int s() {
        return this.l;
    }

    public final com.google.android.gms.common.a t() {
        Handler handler;
        handler = this.m.p;
        p.c(handler);
        return this.f1118k;
    }

    public final a.f v() {
        return this.b;
    }

    public final Map<j.a<?>, x1> x() {
        return this.f1113f;
    }
}

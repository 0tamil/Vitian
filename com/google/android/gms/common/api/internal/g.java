package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.d;
import com.google.android.gms.common.internal.m0;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.internal.v;
import e.c.b;
import f.b.a.b.d.a.j;
import f.b.a.b.g.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
/* loaded from: classes.dex */
public class g implements Handler.Callback {
    public static final Status r = new Status(4, "Sign-out occurred while this API call was in progress.");
    private static final Status s = new Status(4, "The user must be signed in to make this API call.");
    private static final Object t = new Object();
    private static g u;

    /* renamed from: e  reason: collision with root package name */
    private t f1104e;

    /* renamed from: f  reason: collision with root package name */
    private v f1105f;

    /* renamed from: g  reason: collision with root package name */
    private final Context f1106g;

    /* renamed from: h  reason: collision with root package name */
    private final d f1107h;

    /* renamed from: i  reason: collision with root package name */
    private final m0 f1108i;
    @NotOnlyInitialized
    private final Handler p;
    private volatile boolean q;
    private long a = 5000;
    private long b = 120000;
    private long c = 10000;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1103d = false;

    /* renamed from: j  reason: collision with root package name */
    private final AtomicInteger f1109j = new AtomicInteger(1);

    /* renamed from: k  reason: collision with root package name */
    private final AtomicInteger f1110k = new AtomicInteger(0);
    private final Map<b<?>, g1<?>> l = new ConcurrentHashMap(5, 0.75f, 1);
    private x m = null;
    private final Set<b<?>> n = new b();
    private final Set<b<?>> o = new b();

    private g(Context context, Looper looper, d dVar) {
        this.q = true;
        this.f1106g = context;
        j jVar = new j(looper, this);
        this.p = jVar;
        this.f1107h = dVar;
        this.f1108i = new m0(dVar);
        if (com.google.android.gms.common.util.g.a(context)) {
            this.q = false;
        }
        jVar.sendMessage(jVar.obtainMessage(6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Status h(b<?> bVar, a aVar) {
        String b = bVar.b();
        String valueOf = String.valueOf(aVar);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 63 + String.valueOf(valueOf).length());
        sb.append("API: ");
        sb.append(b);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(aVar, sb.toString());
    }

    private final g1<?> i(e<?> eVar) {
        b<?> f2 = eVar.f();
        g1<?> g1Var = this.l.get(f2);
        if (g1Var == null) {
            g1Var = new g1<>(this, eVar);
            this.l.put(f2, g1Var);
        }
        if (g1Var.Q()) {
            this.o.add(f2);
        }
        g1Var.E();
        return g1Var;
    }

    private final v j() {
        if (this.f1105f == null) {
            this.f1105f = u.a(this.f1106g);
        }
        return this.f1105f;
    }

    private final void k() {
        t tVar = this.f1104e;
        if (tVar != null) {
            if (tVar.b() > 0 || f()) {
                j().a(tVar);
            }
            this.f1104e = null;
        }
    }

    private final <T> void l(f.b.a.b.g.j<T> jVar, int i2, e eVar) {
        s1 b;
        if (i2 != 0 && (b = s1.b(this, i2, eVar.f())) != null) {
            i<T> a = jVar.a();
            final Handler handler = this.p;
            handler.getClass();
            a.c(new Executor() { // from class: com.google.android.gms.common.api.internal.a1
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, b);
        }
    }

    public static g x(Context context) {
        g gVar;
        synchronized (t) {
            if (u == null) {
                u = new g(context.getApplicationContext(), com.google.android.gms.common.internal.i.c().getLooper(), d.n());
            }
            gVar = u;
        }
        return gVar;
    }

    public final <O extends a.d> void D(e<O> eVar, int i2, d<? extends com.google.android.gms.common.api.j, a.b> dVar) {
        l2 l2Var = new l2(i2, dVar);
        Handler handler = this.p;
        handler.sendMessage(handler.obtainMessage(4, new w1(l2Var, this.f1110k.get(), eVar)));
    }

    public final <O extends a.d, ResultT> void E(e<O> eVar, int i2, r<a.b, ResultT> rVar, f.b.a.b.g.j<ResultT> jVar, q qVar) {
        l(jVar, rVar.d(), eVar);
        m2 m2Var = new m2(i2, rVar, jVar, qVar);
        Handler handler = this.p;
        handler.sendMessage(handler.obtainMessage(4, new w1(m2Var, this.f1110k.get(), eVar)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void F(n nVar, int i2, long j2, int i3) {
        Handler handler = this.p;
        handler.sendMessage(handler.obtainMessage(18, new t1(nVar, i2, j2, i3)));
    }

    public final void G(com.google.android.gms.common.a aVar, int i2) {
        if (!g(aVar, i2)) {
            Handler handler = this.p;
            handler.sendMessage(handler.obtainMessage(5, i2, 0, aVar));
        }
    }

    public final void a() {
        Handler handler = this.p;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void b(e<?> eVar) {
        Handler handler = this.p;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    public final void c(x xVar) {
        synchronized (t) {
            if (this.m != xVar) {
                this.m = xVar;
                this.n.clear();
            }
            this.n.addAll(xVar.t());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(x xVar) {
        synchronized (t) {
            if (this.m == xVar) {
                this.m = null;
                this.n.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f() {
        if (this.f1103d) {
            return false;
        }
        r a = q.b().a();
        if (a != null && !a.d()) {
            return false;
        }
        int a2 = this.f1108i.a(this.f1106g, 203400000);
        return a2 == -1 || a2 == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g(com.google.android.gms.common.a aVar, int i2) {
        return this.f1107h.x(this.f1106g, aVar, i2);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        f.b.a.b.g.j<Boolean> jVar;
        Boolean bool;
        b bVar;
        b bVar2;
        b bVar3;
        b bVar4;
        int i2 = message.what;
        long j2 = 300000;
        g1<?> g1Var = null;
        switch (i2) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j2 = 10000;
                }
                this.c = j2;
                this.p.removeMessages(12);
                for (b<?> bVar5 : this.l.keySet()) {
                    Handler handler = this.p;
                    handler.sendMessageDelayed(handler.obtainMessage(12, bVar5), this.c);
                }
                break;
            case 2:
                r2 r2Var = (r2) message.obj;
                Iterator<b<?>> it = r2Var.a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        b<?> next = it.next();
                        g1<?> g1Var2 = this.l.get(next);
                        if (g1Var2 == null) {
                            r2Var.b(next, new com.google.android.gms.common.a(13), null);
                            break;
                        } else if (g1Var2.P()) {
                            r2Var.b(next, com.google.android.gms.common.a.f1038i, g1Var2.v().e());
                        } else {
                            com.google.android.gms.common.a t2 = g1Var2.t();
                            if (t2 != null) {
                                r2Var.b(next, t2, null);
                            } else {
                                g1Var2.K(r2Var);
                                g1Var2.E();
                            }
                        }
                    }
                }
            case 3:
                for (g1<?> g1Var3 : this.l.values()) {
                    g1Var3.D();
                    g1Var3.E();
                }
                break;
            case 4:
            case 8:
            case 13:
                w1 w1Var = (w1) message.obj;
                g1<?> g1Var4 = this.l.get(w1Var.c.f());
                if (g1Var4 == null) {
                    g1Var4 = i(w1Var.c);
                }
                if (!g1Var4.Q() || this.f1110k.get() == w1Var.b) {
                    g1Var4.F(w1Var.a);
                    break;
                } else {
                    w1Var.a.a(r);
                    g1Var4.M();
                    break;
                }
            case 5:
                int i3 = message.arg1;
                com.google.android.gms.common.a aVar = (com.google.android.gms.common.a) message.obj;
                Iterator<g1<?>> it2 = this.l.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        g1<?> next2 = it2.next();
                        if (next2.r() == i3) {
                            g1Var = next2;
                        }
                    }
                }
                if (g1Var != null) {
                    if (aVar.b() == 13) {
                        String f2 = this.f1107h.f(aVar.b());
                        String c = aVar.c();
                        StringBuilder sb = new StringBuilder(String.valueOf(f2).length() + 69 + String.valueOf(c).length());
                        sb.append("Error resolution was canceled by the user, original error message: ");
                        sb.append(f2);
                        sb.append(": ");
                        sb.append(c);
                        g1.y(g1Var, new Status(17, sb.toString()));
                        break;
                    } else {
                        g1.y(g1Var, h(g1.w(g1Var), aVar));
                        break;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(i3);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                    break;
                }
            case 6:
                if (this.f1106g.getApplicationContext() instanceof Application) {
                    c.c((Application) this.f1106g.getApplicationContext());
                    c.b().a(new b1(this));
                    if (!c.b().e(true)) {
                        this.c = 300000L;
                        break;
                    }
                }
                break;
            case 7:
                i((e) message.obj);
                break;
            case 9:
                if (this.l.containsKey(message.obj)) {
                    this.l.get(message.obj).L();
                    break;
                }
                break;
            case 10:
                for (b<?> bVar6 : this.o) {
                    g1<?> remove = this.l.remove(bVar6);
                    if (remove != null) {
                        remove.M();
                    }
                }
                this.o.clear();
                break;
            case 11:
                if (this.l.containsKey(message.obj)) {
                    this.l.get(message.obj).N();
                    break;
                }
                break;
            case 12:
                if (this.l.containsKey(message.obj)) {
                    this.l.get(message.obj).c();
                    break;
                }
                break;
            case 14:
                y yVar = (y) message.obj;
                b<?> a = yVar.a();
                if (!this.l.containsKey(a)) {
                    jVar = yVar.b();
                    bool = Boolean.FALSE;
                } else {
                    boolean O = g1.O(this.l.get(a), false);
                    jVar = yVar.b();
                    bool = Boolean.valueOf(O);
                }
                jVar.c(bool);
                break;
            case 15:
                i1 i1Var = (i1) message.obj;
                Map<b<?>, g1<?>> map = this.l;
                bVar = i1Var.a;
                if (map.containsKey(bVar)) {
                    Map<b<?>, g1<?>> map2 = this.l;
                    bVar2 = i1Var.a;
                    g1.B(map2.get(bVar2), i1Var);
                    break;
                }
                break;
            case 16:
                i1 i1Var2 = (i1) message.obj;
                Map<b<?>, g1<?>> map3 = this.l;
                bVar3 = i1Var2.a;
                if (map3.containsKey(bVar3)) {
                    Map<b<?>, g1<?>> map4 = this.l;
                    bVar4 = i1Var2.a;
                    g1.C(map4.get(bVar4), i1Var2);
                    break;
                }
                break;
            case 17:
                k();
                break;
            case 18:
                t1 t1Var = (t1) message.obj;
                if (t1Var.c == 0) {
                    j().a(new t(t1Var.b, Arrays.asList(t1Var.a)));
                    break;
                } else {
                    t tVar = this.f1104e;
                    if (tVar != null) {
                        List<n> c2 = tVar.c();
                        if (tVar.b() != t1Var.b || (c2 != null && c2.size() >= t1Var.f1173d)) {
                            this.p.removeMessages(17);
                            k();
                        } else {
                            this.f1104e.d(t1Var.a);
                        }
                    }
                    if (this.f1104e == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(t1Var.a);
                        this.f1104e = new t(t1Var.b, arrayList);
                        Handler handler2 = this.p;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), t1Var.c);
                        break;
                    }
                }
                break;
            case 19:
                this.f1103d = false;
                break;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i2);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
        return true;
    }

    public final int m() {
        return this.f1109j.getAndIncrement();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final g1 w(b<?> bVar) {
        return this.l.get(bVar);
    }
}

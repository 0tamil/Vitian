package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.h;
import com.google.android.gms.common.api.internal.i2;
import com.google.android.gms.common.api.internal.m;
import com.google.android.gms.common.api.internal.q2;
import com.google.android.gms.common.api.internal.u0;
import com.google.android.gms.common.api.internal.z2;
import com.google.android.gms.common.d;
import com.google.android.gms.common.internal.d0;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.p;
import f.b.a.b.e.g;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
@Deprecated
/* loaded from: classes.dex */
public abstract class f {
    private static final Set<f> a = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    /* loaded from: classes.dex */
    public static final class a {
        private Account a;

        /* renamed from: d  reason: collision with root package name */
        private int f1061d;

        /* renamed from: e  reason: collision with root package name */
        private View f1062e;

        /* renamed from: f  reason: collision with root package name */
        private String f1063f;

        /* renamed from: g  reason: collision with root package name */
        private String f1064g;

        /* renamed from: i  reason: collision with root package name */
        private final Context f1066i;

        /* renamed from: k  reason: collision with root package name */
        private h f1068k;
        private c m;
        private Looper n;
        private final Set<Scope> b = new HashSet();
        private final Set<Scope> c = new HashSet();

        /* renamed from: h  reason: collision with root package name */
        private final Map<com.google.android.gms.common.api.a<?>, d0> f1065h = new e.c.a();

        /* renamed from: j  reason: collision with root package name */
        private final Map<com.google.android.gms.common.api.a<?>, a.d> f1067j = new e.c.a();
        private int l = -1;
        private d o = d.n();
        private a.AbstractC0026a<? extends g, f.b.a.b.e.a> p = f.b.a.b.e.f.c;
        private final ArrayList<b> q = new ArrayList<>();
        private final ArrayList<c> r = new ArrayList<>();

        public a(Context context) {
            this.f1066i = context;
            this.n = context.getMainLooper();
            this.f1063f = context.getPackageName();
            this.f1064g = context.getClass().getName();
        }

        public a a(com.google.android.gms.common.api.a<? extends Object> aVar) {
            p.j(aVar, "Api must not be null");
            this.f1067j.put(aVar, null);
            a.e<?, ? extends Object> c = aVar.c();
            p.j(c, "Base client builder must not be null");
            List<Scope> a = c.a(null);
            this.c.addAll(a);
            this.b.addAll(a);
            return this;
        }

        public a b(b bVar) {
            p.j(bVar, "Listener must not be null");
            this.q.add(bVar);
            return this;
        }

        public a c(c cVar) {
            p.j(cVar, "Listener must not be null");
            this.r.add(cVar);
            return this;
        }

        /* JADX WARN: Type inference failed for: r4v16, types: [com.google.android.gms.common.api.a$f, java.lang.Object] */
        public f d() {
            p.b(!this.f1067j.isEmpty(), "must call addApi() to add at least one API");
            e e2 = e();
            Map<com.google.android.gms.common.api.a<?>, d0> i2 = e2.i();
            e.c.a aVar = new e.c.a();
            e.c.a aVar2 = new e.c.a();
            ArrayList arrayList = new ArrayList();
            com.google.android.gms.common.api.a<?> aVar3 = null;
            boolean z = false;
            for (com.google.android.gms.common.api.a<?> aVar4 : this.f1067j.keySet()) {
                a.d dVar = this.f1067j.get(aVar4);
                boolean z2 = i2.get(aVar4) != null;
                aVar.put(aVar4, Boolean.valueOf(z2));
                z2 z2Var = new z2(aVar4, z2);
                arrayList.add(z2Var);
                a.AbstractC0026a<?, ?> a = aVar4.a();
                p.i(a);
                a.AbstractC0026a<?, ?> aVar5 = a;
                ?? c = aVar5.c(this.f1066i, this.n, e2, dVar, z2Var, z2Var);
                aVar2.put(aVar4.b(), c);
                if (aVar5.b() == 1) {
                    z = dVar != null;
                }
                if (c.g()) {
                    if (aVar3 == null) {
                        aVar3 = aVar4;
                    } else {
                        String d2 = aVar4.d();
                        String d3 = aVar3.d();
                        StringBuilder sb = new StringBuilder(String.valueOf(d2).length() + 21 + String.valueOf(d3).length());
                        sb.append(d2);
                        sb.append(" cannot be used with ");
                        sb.append(d3);
                        throw new IllegalStateException(sb.toString());
                    }
                }
            }
            if (aVar3 != null) {
                if (!z) {
                    p.m(this.a == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", aVar3.d());
                    p.m(this.b.equals(this.c), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", aVar3.d());
                } else {
                    String d4 = aVar3.d();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(d4).length() + 82);
                    sb2.append("With using ");
                    sb2.append(d4);
                    sb2.append(", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                    throw new IllegalStateException(sb2.toString());
                }
            }
            u0 u0Var = new u0(this.f1066i, new ReentrantLock(), this.n, e2, this.o, this.p, aVar, this.q, this.r, aVar2, this.l, u0.q(aVar2.values(), true), arrayList);
            synchronized (f.a) {
                f.a.add(u0Var);
            }
            if (this.l >= 0) {
                q2.t(this.f1068k).u(this.l, u0Var, this.m);
            }
            return u0Var;
        }

        public final e e() {
            f.b.a.b.e.a aVar = f.b.a.b.e.a.f2377j;
            Map<com.google.android.gms.common.api.a<?>, a.d> map = this.f1067j;
            com.google.android.gms.common.api.a<f.b.a.b.e.a> aVar2 = f.b.a.b.e.f.f2395e;
            if (map.containsKey(aVar2)) {
                aVar = (f.b.a.b.e.a) this.f1067j.get(aVar2);
            }
            return new e(this.a, this.b, this.f1065h, this.f1061d, this.f1062e, this.f1063f, this.f1064g, aVar, false);
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface b extends com.google.android.gms.common.api.internal.f {
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface c extends m {
    }

    public abstract void d();

    public abstract void e();

    public abstract void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public <A extends a.b, R extends j, T extends com.google.android.gms.common.api.internal.d<R, A>> T g(T t) {
        throw new UnsupportedOperationException();
    }

    public <A extends a.b, T extends com.google.android.gms.common.api.internal.d<? extends j, A>> T h(T t) {
        throw new UnsupportedOperationException();
    }

    public <C extends a.f> C i(a.c<C> cVar) {
        throw new UnsupportedOperationException();
    }

    public Context j() {
        throw new UnsupportedOperationException();
    }

    public Looper k() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean l();

    public abstract void m(c cVar);

    public abstract void n(c cVar);

    public void o(i2 i2Var) {
        throw new UnsupportedOperationException();
    }
}

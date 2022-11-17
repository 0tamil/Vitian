package com.google.firebase.components;

import android.util.Log;
import com.google.firebase.components.s;
import com.google.firebase.o.c;
import com.google.firebase.o.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public class s extends m implements com.google.firebase.m.a {

    /* renamed from: g  reason: collision with root package name */
    private static final com.google.firebase.q.b<Set<Object>> f1365g = i.a;
    private final Map<n<?>, com.google.firebase.q.b<?>> a;
    private final Map<Class<?>, com.google.firebase.q.b<?>> b;
    private final Map<Class<?>, a0<?>> c;

    /* renamed from: d  reason: collision with root package name */
    private final List<com.google.firebase.q.b<r>> f1366d;

    /* renamed from: e  reason: collision with root package name */
    private final x f1367e;

    /* renamed from: f  reason: collision with root package name */
    private final AtomicReference<Boolean> f1368f;

    /* loaded from: classes.dex */
    public static final class b {
        private final Executor a;
        private final List<com.google.firebase.q.b<r>> b = new ArrayList();
        private final List<n<?>> c = new ArrayList();

        b(Executor executor) {
            this.a = executor;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static /* synthetic */ r e(r rVar) {
            return rVar;
        }

        public b a(n<?> nVar) {
            this.c.add(nVar);
            return this;
        }

        public b b(final r rVar) {
            this.b.add(new com.google.firebase.q.b() { // from class: com.google.firebase.components.e
                @Override // com.google.firebase.q.b
                public final Object a() {
                    r rVar2 = r.this;
                    s.b.e(rVar2);
                    return rVar2;
                }
            });
            return this;
        }

        public b c(Collection<com.google.firebase.q.b<r>> collection) {
            this.b.addAll(collection);
            return this;
        }

        public s d() {
            return new s(this.a, this.b, this.c);
        }
    }

    private s(Executor executor, Iterable<com.google.firebase.q.b<r>> iterable, Collection<n<?>> collection) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.f1368f = new AtomicReference<>();
        x xVar = new x(executor);
        this.f1367e = xVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(n.n(xVar, x.class, d.class, c.class));
        arrayList.add(n.n(this, com.google.firebase.m.a.class, new Class[0]));
        for (n<?> nVar : collection) {
            if (nVar != null) {
                arrayList.add(nVar);
            }
        }
        this.f1366d = j(iterable);
        g(arrayList);
    }

    public static b f(Executor executor) {
        return new b(executor);
    }

    private void g(List<n<?>> list) {
        ArrayList<Runnable> arrayList = new ArrayList();
        synchronized (this) {
            Iterator<com.google.firebase.q.b<r>> it = this.f1366d.iterator();
            while (it.hasNext()) {
                try {
                    r a2 = it.next().a();
                    if (a2 != null) {
                        list.addAll(a2.getComponents());
                        it.remove();
                    }
                } catch (y e2) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e2);
                }
            }
            if (this.a.isEmpty()) {
                t.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.a.keySet());
                arrayList2.addAll(list);
                t.a(arrayList2);
            }
            for (final n<?> nVar : list) {
                this.a.put(nVar, new z(new com.google.firebase.q.b() { // from class: com.google.firebase.components.d
                    @Override // com.google.firebase.q.b
                    public final Object a() {
                        return s.this.l(nVar);
                    }
                }));
            }
            arrayList.addAll(q(list));
            arrayList.addAll(r());
            p();
        }
        for (Runnable runnable : arrayList) {
            runnable.run();
        }
        o();
    }

    private void h(Map<n<?>, com.google.firebase.q.b<?>> map, boolean z) {
        for (Map.Entry<n<?>, com.google.firebase.q.b<?>> entry : map.entrySet()) {
            n<?> key = entry.getKey();
            com.google.firebase.q.b<?> value = entry.getValue();
            if (key.i() || (key.j() && z)) {
                value.a();
            }
        }
        this.f1367e.d();
    }

    private static <T> List<T> j(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            arrayList.add(t);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ Object l(n nVar) {
        return nVar.d().a(new e0(nVar, this));
    }

    private void o() {
        Boolean bool = this.f1368f.get();
        if (bool != null) {
            h(this.a, bool.booleanValue());
        }
    }

    private void p() {
        Map map;
        Class<?> c;
        Object c2;
        for (n<?> nVar : this.a.keySet()) {
            for (u uVar : nVar.c()) {
                if (uVar.g() && !this.c.containsKey(uVar.c())) {
                    map = this.c;
                    c = uVar.c();
                    c2 = a0.c(Collections.emptySet());
                } else if (this.b.containsKey(uVar.c())) {
                    continue;
                } else if (uVar.f()) {
                    throw new b0(String.format("Unsatisfied dependency for component %s: %s", nVar, uVar.c()));
                } else if (!uVar.g()) {
                    map = this.b;
                    c = uVar.c();
                    c2 = c0.c();
                }
                map.put(c, c2);
            }
        }
    }

    private List<Runnable> q(List<n<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (n<?> nVar : list) {
            if (nVar.k()) {
                final com.google.firebase.q.b<?> bVar = this.a.get(nVar);
                for (Class<? super Object> cls : nVar.e()) {
                    if (!this.b.containsKey(cls)) {
                        this.b.put(cls, bVar);
                    } else {
                        final c0 c0Var = (c0) this.b.get(cls);
                        arrayList.add(new Runnable() { // from class: com.google.firebase.components.g
                            @Override // java.lang.Runnable
                            public final void run() {
                                c0.this.h(bVar);
                            }
                        });
                    }
                }
            }
        }
        return arrayList;
    }

    private List<Runnable> r() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry<n<?>, com.google.firebase.q.b<?>> entry : this.a.entrySet()) {
            n<?> key = entry.getKey();
            if (!key.k()) {
                com.google.firebase.q.b<?> value = entry.getValue();
                for (Class<? super Object> cls : key.e()) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!this.c.containsKey(entry2.getKey())) {
                this.c.put((Class) entry2.getKey(), a0.c((Collection) entry2.getValue()));
            } else {
                final a0<?> a0Var = this.c.get(entry2.getKey());
                for (final com.google.firebase.q.b bVar : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: com.google.firebase.components.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            a0.this.b(bVar);
                        }
                    });
                }
            }
        }
        return arrayList;
    }

    @Override // com.google.firebase.components.o
    public synchronized <T> com.google.firebase.q.b<T> b(Class<T> cls) {
        d0.c(cls, "Null interface requested.");
        return (com.google.firebase.q.b<T>) this.b.get(cls);
    }

    @Override // com.google.firebase.components.o
    public synchronized <T> com.google.firebase.q.b<Set<T>> d(Class<T> cls) {
        a0<?> a0Var = this.c.get(cls);
        if (a0Var != null) {
            return a0Var;
        }
        return (com.google.firebase.q.b<Set<T>>) f1365g;
    }

    @Override // com.google.firebase.components.o
    public <T> com.google.firebase.q.a<T> e(Class<T> cls) {
        com.google.firebase.q.b<T> b2 = b(cls);
        return b2 == null ? c0.c() : b2 instanceof c0 ? (c0) b2 : c0.g(b2);
    }

    public void i(boolean z) {
        HashMap hashMap;
        if (this.f1368f.compareAndSet(null, Boolean.valueOf(z))) {
            synchronized (this) {
                hashMap = new HashMap(this.a);
            }
            h(hashMap, z);
        }
    }
}

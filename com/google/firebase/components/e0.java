package com.google.firebase.components;

import com.google.firebase.o.c;
import com.google.firebase.q.b;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
final class e0 extends m {
    private final Set<Class<?>> a;
    private final Set<Class<?>> b;
    private final Set<Class<?>> c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<Class<?>> f1349d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<Class<?>> f1350e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<Class<?>> f1351f;

    /* renamed from: g  reason: collision with root package name */
    private final o f1352g;

    /* loaded from: classes.dex */
    private static class a implements c {
        private final Set<Class<?>> a;
        private final c b;

        public a(Set<Class<?>> set, c cVar) {
            this.a = set;
            this.b = cVar;
        }

        @Override // com.google.firebase.o.c
        public void b(com.google.firebase.o.a<?> aVar) {
            if (this.a.contains(aVar.a())) {
                this.b.b(aVar);
                return;
            }
            throw new w(String.format("Attempting to publish an undeclared event %s.", aVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e0(n<?> nVar, o oVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (u uVar : nVar.c()) {
            if (uVar.e()) {
                boolean g2 = uVar.g();
                Class<?> c = uVar.c();
                if (g2) {
                    hashSet4.add(c);
                } else {
                    hashSet.add(c);
                }
            } else if (uVar.d()) {
                hashSet3.add(uVar.c());
            } else {
                boolean g3 = uVar.g();
                Class<?> c2 = uVar.c();
                if (g3) {
                    hashSet5.add(c2);
                } else {
                    hashSet2.add(c2);
                }
            }
        }
        if (!nVar.f().isEmpty()) {
            hashSet.add(c.class);
        }
        this.a = Collections.unmodifiableSet(hashSet);
        this.b = Collections.unmodifiableSet(hashSet2);
        this.c = Collections.unmodifiableSet(hashSet3);
        this.f1349d = Collections.unmodifiableSet(hashSet4);
        this.f1350e = Collections.unmodifiableSet(hashSet5);
        this.f1351f = nVar.f();
        this.f1352g = oVar;
    }

    @Override // com.google.firebase.components.m, com.google.firebase.components.o
    public <T> T a(Class<T> cls) {
        if (this.a.contains(cls)) {
            T t = (T) this.f1352g.a(cls);
            return !cls.equals(c.class) ? t : (T) new a(this.f1351f, (c) t);
        }
        throw new w(String.format("Attempting to request an undeclared dependency %s.", cls));
    }

    @Override // com.google.firebase.components.o
    public <T> b<T> b(Class<T> cls) {
        if (this.b.contains(cls)) {
            return this.f1352g.b(cls);
        }
        throw new w(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }

    @Override // com.google.firebase.components.m, com.google.firebase.components.o
    public <T> Set<T> c(Class<T> cls) {
        if (this.f1349d.contains(cls)) {
            return this.f1352g.c(cls);
        }
        throw new w(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
    }

    @Override // com.google.firebase.components.o
    public <T> b<Set<T>> d(Class<T> cls) {
        if (this.f1350e.contains(cls)) {
            return this.f1352g.d(cls);
        }
        throw new w(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }

    @Override // com.google.firebase.components.o
    public <T> com.google.firebase.q.a<T> e(Class<T> cls) {
        if (this.c.contains(cls)) {
            return this.f1352g.e(cls);
        }
        throw new w(String.format("Attempting to request an undeclared dependency Deferred<%s>.", cls));
    }
}

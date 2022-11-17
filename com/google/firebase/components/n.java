package com.google.firebase.components;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public final class n<T> {
    private final Set<Class<? super T>> a;
    private final Set<u> b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1359d;

    /* renamed from: e  reason: collision with root package name */
    private final q<T> f1360e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<Class<?>> f1361f;

    /* loaded from: classes.dex */
    public static class b<T> {
        private final Set<Class<? super T>> a;
        private final Set<u> b;
        private int c;

        /* renamed from: d  reason: collision with root package name */
        private int f1362d;

        /* renamed from: e  reason: collision with root package name */
        private q<T> f1363e;

        /* renamed from: f  reason: collision with root package name */
        private Set<Class<?>> f1364f;

        @SafeVarargs
        private b(Class<T> cls, Class<? super T>... clsArr) {
            HashSet hashSet = new HashSet();
            this.a = hashSet;
            this.b = new HashSet();
            this.c = 0;
            this.f1362d = 0;
            this.f1364f = new HashSet();
            d0.c(cls, "Null interface");
            hashSet.add(cls);
            for (Class<? super T> cls2 : clsArr) {
                d0.c(cls2, "Null interface");
            }
            Collections.addAll(this.a, clsArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b<T> g() {
            this.f1362d = 1;
            return this;
        }

        private b<T> h(int i2) {
            d0.d(this.c == 0, "Instantiation type has already been set.");
            this.c = i2;
            return this;
        }

        private void i(Class<?> cls) {
            d0.a(!this.a.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b<T> b(u uVar) {
            d0.c(uVar, "Null dependency");
            i(uVar.c());
            this.b.add(uVar);
            return this;
        }

        public b<T> c() {
            h(1);
            return this;
        }

        public n<T> d() {
            d0.d(this.f1363e != null, "Missing required property: factory.");
            return new n<>(new HashSet(this.a), new HashSet(this.b), this.c, this.f1362d, this.f1363e, this.f1364f);
        }

        public b<T> e() {
            h(2);
            return this;
        }

        public b<T> f(q<T> qVar) {
            d0.c(qVar, "Null factory");
            this.f1363e = qVar;
            return this;
        }
    }

    private n(Set<Class<? super T>> set, Set<u> set2, int i2, int i3, q<T> qVar, Set<Class<?>> set3) {
        this.a = Collections.unmodifiableSet(set);
        this.b = Collections.unmodifiableSet(set2);
        this.c = i2;
        this.f1359d = i3;
        this.f1360e = qVar;
        this.f1361f = Collections.unmodifiableSet(set3);
    }

    public static <T> b<T> a(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> b(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    public static <T> n<T> g(final T t, Class<T> cls) {
        b h2 = h(cls);
        h2.f(new q() { // from class: com.google.firebase.components.a
            @Override // com.google.firebase.components.q
            public final Object a(o oVar) {
                Object obj = t;
                n.l(obj, oVar);
                return obj;
            }
        });
        return h2.d();
    }

    public static <T> b<T> h(Class<T> cls) {
        b<T> a2 = a(cls);
        a2.g();
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object l(Object obj, o oVar) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object m(Object obj, o oVar) {
        return obj;
    }

    @SafeVarargs
    public static <T> n<T> n(final T t, Class<T> cls, Class<? super T>... clsArr) {
        b b2 = b(cls, clsArr);
        b2.f(new q() { // from class: com.google.firebase.components.b
            @Override // com.google.firebase.components.q
            public final Object a(o oVar) {
                Object obj = t;
                n.m(obj, oVar);
                return obj;
            }
        });
        return b2.d();
    }

    public Set<u> c() {
        return this.b;
    }

    public q<T> d() {
        return this.f1360e;
    }

    public Set<Class<? super T>> e() {
        return this.a;
    }

    public Set<Class<?>> f() {
        return this.f1361f;
    }

    public boolean i() {
        return this.c == 1;
    }

    public boolean j() {
        return this.c == 2;
    }

    public boolean k() {
        return this.f1359d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.a.toArray()) + ">{" + this.c + ", type=" + this.f1359d + ", deps=" + Arrays.toString(this.b.toArray()) + "}";
    }
}

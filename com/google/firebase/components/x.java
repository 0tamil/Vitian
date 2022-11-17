package com.google.firebase.components;

import com.google.firebase.o.a;
import com.google.firebase.o.b;
import com.google.firebase.o.c;
import com.google.firebase.o.d;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
class x implements d, c {
    private final Map<Class<?>, ConcurrentHashMap<b<Object>, Executor>> a = new HashMap();
    private Queue<a<?>> b = new ArrayDeque();
    private final Executor c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(Executor executor) {
        this.c = executor;
    }

    private synchronized Set<Map.Entry<b<Object>, Executor>> e(a<?> aVar) {
        ConcurrentHashMap<b<Object>, Executor> concurrentHashMap;
        concurrentHashMap = this.a.get(aVar.a());
        return concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
    }

    @Override // com.google.firebase.o.d
    public <T> void a(Class<T> cls, b<? super T> bVar) {
        g(cls, this.c, bVar);
    }

    @Override // com.google.firebase.o.c
    public void b(final a<?> aVar) {
        d0.b(aVar);
        synchronized (this) {
            Queue<a<?>> queue = this.b;
            if (queue != null) {
                queue.add(aVar);
                return;
            }
            for (final Map.Entry<b<Object>, Executor> entry : e(aVar)) {
                entry.getValue().execute(new Runnable() { // from class: com.google.firebase.components.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((b) entry.getKey()).a(aVar);
                    }
                });
            }
        }
    }

    @Override // com.google.firebase.o.d
    public synchronized <T> void c(Class<T> cls, b<? super T> bVar) {
        d0.b(cls);
        d0.b(bVar);
        if (this.a.containsKey(cls)) {
            ConcurrentHashMap<b<Object>, Executor> concurrentHashMap = this.a.get(cls);
            concurrentHashMap.remove(bVar);
            if (concurrentHashMap.isEmpty()) {
                this.a.remove(cls);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        Queue<a<?>> queue;
        synchronized (this) {
            queue = this.b;
            if (queue != null) {
                this.b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (a<?> aVar : queue) {
                b(aVar);
            }
        }
    }

    public synchronized <T> void g(Class<T> cls, Executor executor, b<? super T> bVar) {
        d0.b(cls);
        d0.b(bVar);
        d0.b(executor);
        if (!this.a.containsKey(cls)) {
            this.a.put(cls, new ConcurrentHashMap<>());
        }
        this.a.get(cls).put(bVar, executor);
    }
}

package com.google.firebase.components;

import com.google.firebase.q.b;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a0<T> implements b<Set<T>> {
    private volatile Set<T> b = null;
    private volatile Set<b<T>> a = Collections.newSetFromMap(new ConcurrentHashMap());

    a0(Collection<b<T>> collection) {
        this.a.addAll(collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a0<?> c(Collection<b<?>> collection) {
        return new a0<>((Set) collection);
    }

    private synchronized void e() {
        for (b<T> bVar : this.a) {
            this.b.add(bVar.a());
        }
        this.a = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void b(b<T> bVar) {
        Set set;
        if (this.b == null) {
            set = this.a;
        } else {
            set = this.b;
            bVar = (b<T>) bVar.a();
        }
        set.add(bVar);
    }

    /* renamed from: d */
    public Set<T> a() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = Collections.newSetFromMap(new ConcurrentHashMap());
                    e();
                }
            }
        }
        return Collections.unmodifiableSet(this.b);
    }
}

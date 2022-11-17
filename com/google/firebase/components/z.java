package com.google.firebase.components;

import com.google.firebase.q.b;
/* loaded from: classes.dex */
public class z<T> implements b<T> {
    private static final Object c = new Object();
    private volatile Object a = c;
    private volatile b<T> b;

    public z(b<T> bVar) {
        this.b = bVar;
    }

    @Override // com.google.firebase.q.b
    public T a() {
        T t = (T) this.a;
        Object obj = c;
        if (t == obj) {
            synchronized (this) {
                t = this.a;
                if (t == obj) {
                    t = this.b.a();
                    this.a = t;
                    this.b = null;
                }
            }
        }
        return t;
    }
}

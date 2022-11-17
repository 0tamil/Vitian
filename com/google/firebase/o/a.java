package com.google.firebase.o;

import com.google.firebase.components.d0;
/* loaded from: classes.dex */
public class a<T> {
    private final Class<T> a;
    private final T b;

    public a(Class<T> cls, T t) {
        d0.b(cls);
        this.a = cls;
        d0.b(t);
        this.b = t;
    }

    public Class<T> a() {
        return this.a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.a, this.b);
    }
}

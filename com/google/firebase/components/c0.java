package com.google.firebase.components;

import com.google.firebase.q.a;
import com.google.firebase.q.b;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c0<T> implements b<T>, a<T> {
    private static final a.AbstractC0057a<Object> c = k.a;

    /* renamed from: d  reason: collision with root package name */
    private static final b<Object> f1348d = j.a;
    private a.AbstractC0057a<T> a;
    private volatile b<T> b;

    private c0(a.AbstractC0057a<T> aVar, b<T> bVar) {
        this.a = aVar;
        this.b = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> c0<T> c() {
        return new c0<>(c, f1348d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void d(b bVar) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object e() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void f(a.AbstractC0057a aVar, a.AbstractC0057a aVar2, b bVar) {
        aVar.a(bVar);
        aVar2.a(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> c0<T> g(b<T> bVar) {
        return new c0<>(null, bVar);
    }

    @Override // com.google.firebase.q.b
    public T a() {
        return this.b.a();
    }

    @Override // com.google.firebase.q.a
    public void b(final a.AbstractC0057a<T> aVar) {
        b<T> bVar;
        b<T> bVar2 = this.b;
        b<Object> bVar3 = f1348d;
        if (bVar2 != bVar3) {
            aVar.a(bVar2);
            return;
        }
        b<T> bVar4 = null;
        synchronized (this) {
            bVar = this.b;
            if (bVar != bVar3) {
                bVar4 = bVar;
            } else {
                final a.AbstractC0057a<T> aVar2 = this.a;
                this.a = new a.AbstractC0057a() { // from class: com.google.firebase.components.l
                    @Override // com.google.firebase.q.a.AbstractC0057a
                    public final void a(b bVar5) {
                        c0.f(a.AbstractC0057a.this, aVar, bVar5);
                    }
                };
            }
        }
        if (bVar4 != null) {
            aVar.a(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(b<T> bVar) {
        a.AbstractC0057a<T> aVar;
        if (this.b == f1348d) {
            synchronized (this) {
                aVar = this.a;
                this.a = null;
                this.b = bVar;
            }
            aVar.a(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }
}

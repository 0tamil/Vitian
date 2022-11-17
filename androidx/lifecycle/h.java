package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.d;
import e.b.a.b.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public class h extends d {
    private e.b.a.b.a<f, a> a;
    private d.c b;
    private final WeakReference<g> c;

    /* renamed from: d  reason: collision with root package name */
    private int f875d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f876e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f877f;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<d.c> f878g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f879h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        d.c a;
        e b;

        a(f fVar, d.c cVar) {
            this.b = j.f(fVar);
            this.a = cVar;
        }

        void a(g gVar, d.b bVar) {
            d.c c = bVar.c();
            this.a = h.k(this.a, c);
            this.b.d(gVar, bVar);
            this.a = c;
        }
    }

    public h(g gVar) {
        this(gVar, true);
    }

    private h(g gVar, boolean z) {
        this.a = new e.b.a.b.a<>();
        this.f875d = 0;
        this.f876e = false;
        this.f877f = false;
        this.f878g = new ArrayList<>();
        this.c = new WeakReference<>(gVar);
        this.b = d.c.INITIALIZED;
        this.f879h = z;
    }

    private void d(g gVar) {
        Iterator<Map.Entry<f, a>> h2 = this.a.h();
        while (h2.hasNext() && !this.f877f) {
            Map.Entry<f, a> next = h2.next();
            a value = next.getValue();
            while (value.a.compareTo(this.b) > 0 && !this.f877f && this.a.contains(next.getKey())) {
                d.b a2 = d.b.a(value.a);
                if (a2 != null) {
                    n(a2.c());
                    value.a(gVar, a2);
                    m();
                } else {
                    throw new IllegalStateException("no event down from " + value.a);
                }
            }
        }
    }

    private d.c e(f fVar) {
        Map.Entry<f, a> p = this.a.p(fVar);
        d.c cVar = null;
        d.c cVar2 = p != null ? p.getValue().a : null;
        if (!this.f878g.isEmpty()) {
            ArrayList<d.c> arrayList = this.f878g;
            cVar = arrayList.get(arrayList.size() - 1);
        }
        return k(k(this.b, cVar2), cVar);
    }

    @SuppressLint({"RestrictedApi"})
    private void f(String str) {
        if (this.f879h && !e.b.a.a.a.b().a()) {
            throw new IllegalStateException("Method " + str + " must be called on the main thread");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void g(g gVar) {
        b<f, a>.d k2 = this.a.k();
        while (k2.hasNext() && !this.f877f) {
            Map.Entry next = k2.next();
            a aVar = (a) next.getValue();
            while (aVar.a.compareTo(this.b) < 0 && !this.f877f && this.a.contains(next.getKey())) {
                n(aVar.a);
                d.b d2 = d.b.d(aVar.a);
                if (d2 != null) {
                    aVar.a(gVar, d2);
                    m();
                } else {
                    throw new IllegalStateException("no event up from " + aVar.a);
                }
            }
        }
    }

    private boolean i() {
        if (this.a.size() == 0) {
            return true;
        }
        d.c cVar = this.a.i().getValue().a;
        d.c cVar2 = this.a.l().getValue().a;
        return cVar == cVar2 && this.b == cVar2;
    }

    static d.c k(d.c cVar, d.c cVar2) {
        return (cVar2 == null || cVar2.compareTo(cVar) >= 0) ? cVar : cVar2;
    }

    private void l(d.c cVar) {
        if (this.b != cVar) {
            this.b = cVar;
            if (this.f876e || this.f875d != 0) {
                this.f877f = true;
                return;
            }
            this.f876e = true;
            p();
            this.f876e = false;
        }
    }

    private void m() {
        ArrayList<d.c> arrayList = this.f878g;
        arrayList.remove(arrayList.size() - 1);
    }

    private void n(d.c cVar) {
        this.f878g.add(cVar);
    }

    private void p() {
        g gVar = this.c.get();
        if (gVar != null) {
            while (true) {
                boolean i2 = i();
                this.f877f = false;
                if (!i2) {
                    if (this.b.compareTo(this.a.i().getValue().a) < 0) {
                        d(gVar);
                    }
                    Map.Entry<f, a> l = this.a.l();
                    if (!this.f877f && l != null && this.b.compareTo(l.getValue().a) > 0) {
                        g(gVar);
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
    }

    @Override // androidx.lifecycle.d
    public void a(f fVar) {
        g gVar;
        f("addObserver");
        d.c cVar = this.b;
        d.c cVar2 = d.c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = d.c.INITIALIZED;
        }
        a aVar = new a(fVar, cVar2);
        if (this.a.n(fVar, aVar) == null && (gVar = this.c.get()) != null) {
            boolean z = this.f875d != 0 || this.f876e;
            d.c e2 = e(fVar);
            this.f875d++;
            while (aVar.a.compareTo(e2) < 0 && this.a.contains(fVar)) {
                n(aVar.a);
                d.b d2 = d.b.d(aVar.a);
                if (d2 != null) {
                    aVar.a(gVar, d2);
                    m();
                    e2 = e(fVar);
                } else {
                    throw new IllegalStateException("no event up from " + aVar.a);
                }
            }
            if (!z) {
                p();
            }
            this.f875d--;
        }
    }

    @Override // androidx.lifecycle.d
    public d.c b() {
        return this.b;
    }

    @Override // androidx.lifecycle.d
    public void c(f fVar) {
        f("removeObserver");
        this.a.o(fVar);
    }

    public void h(d.b bVar) {
        f("handleLifecycleEvent");
        l(bVar.c());
    }

    @Deprecated
    public void j(d.c cVar) {
        f("markState");
        o(cVar);
    }

    public void o(d.c cVar) {
        f("setCurrentState");
        l(cVar);
    }
}

package j.u;

import j.u.g;
import j.x.c.p;
import j.x.d.i;
import j.x.d.j;
import java.io.Serializable;
/* loaded from: classes.dex */
public final class c implements g, Serializable {

    /* renamed from: e  reason: collision with root package name */
    private final g f3456e;

    /* renamed from: f  reason: collision with root package name */
    private final g.b f3457f;

    /* loaded from: classes.dex */
    static final class a extends j implements p<String, g.b, String> {

        /* renamed from: e  reason: collision with root package name */
        public static final a f3458e = new a();

        a() {
            super(2);
        }

        /* renamed from: a */
        public final String invoke(String str, g.b bVar) {
            i.d(str, "acc");
            i.d(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public c(g gVar, g.b bVar) {
        i.d(gVar, "left");
        i.d(bVar, "element");
        this.f3456e = gVar;
        this.f3457f = bVar;
    }

    private final boolean a(g.b bVar) {
        return i.a(get(bVar.getKey()), bVar);
    }

    private final boolean e(c cVar) {
        while (a(cVar.f3457f)) {
            g gVar = cVar.f3456e;
            if (!(gVar instanceof c)) {
                return a((g.b) gVar);
            }
            cVar = (c) gVar;
        }
        return false;
    }

    private final int g() {
        int i2 = 2;
        c cVar = this;
        while (true) {
            g gVar = cVar.f3456e;
            cVar = gVar instanceof c ? (c) gVar : null;
            if (cVar == null) {
                return i2;
            }
            i2++;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.g() != g() || !cVar.e(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // j.u.g
    public <R> R fold(R r, p<? super R, ? super g.b, ? extends R> pVar) {
        i.d(pVar, "operation");
        return pVar.invoke((Object) this.f3456e.fold(r, pVar), this.f3457f);
    }

    @Override // j.u.g
    public <E extends g.b> E get(g.c<E> cVar) {
        i.d(cVar, "key");
        c cVar2 = this;
        while (true) {
            E e2 = (E) cVar2.f3457f.get(cVar);
            if (e2 != null) {
                return e2;
            }
            g gVar = cVar2.f3456e;
            if (!(gVar instanceof c)) {
                return (E) gVar.get(cVar);
            }
            cVar2 = (c) gVar;
        }
    }

    public int hashCode() {
        return this.f3456e.hashCode() + this.f3457f.hashCode();
    }

    @Override // j.u.g
    public g minusKey(g.c<?> cVar) {
        i.d(cVar, "key");
        if (this.f3457f.get(cVar) != null) {
            return this.f3456e;
        }
        g minusKey = this.f3456e.minusKey(cVar);
        return minusKey == this.f3456e ? this : minusKey == h.f3461e ? this.f3457f : new c(minusKey, this.f3457f);
    }

    @Override // j.u.g
    public g plus(g gVar) {
        return g.a.a(this, gVar);
    }

    public String toString() {
        return '[' + ((String) fold("", a.f3458e)) + ']';
    }
}

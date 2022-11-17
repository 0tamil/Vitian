package kotlinx.coroutines.j2;

import j.r;
import j.x.c.l;
import j.x.d.i;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.m;
import kotlinx.coroutines.internal.o;
import kotlinx.coroutines.internal.z;
import kotlinx.coroutines.j2.i;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.p0;
/* loaded from: classes.dex */
public abstract class c<E> implements t<E> {
    protected final l<E, r> b;
    private final m c = new m();
    private volatile /* synthetic */ Object onCloseHandler = null;

    /* loaded from: classes.dex */
    public static final class a<E> extends s {

        /* renamed from: h  reason: collision with root package name */
        public final E f3827h;

        public a(E e2) {
            this.f3827h = e2;
        }

        @Override // kotlinx.coroutines.j2.s
        public z A(o.c cVar) {
            z zVar = kotlinx.coroutines.o.a;
            if (cVar == null) {
                return zVar;
            }
            cVar.d();
            throw null;
        }

        @Override // kotlinx.coroutines.internal.o
        public String toString() {
            return "SendBuffered@" + p0.b(this) + '(' + this.f3827h + ')';
        }

        @Override // kotlinx.coroutines.j2.s
        public void y() {
        }

        @Override // kotlinx.coroutines.j2.s
        public Object z() {
            return this.f3827h;
        }
    }

    static {
        AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "onCloseHandler");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(l<? super E, r> lVar) {
        this.b = lVar;
    }

    private final int b() {
        m mVar = this.c;
        int i2 = 0;
        for (o oVar = (o) mVar.o(); !i.a(oVar, mVar); oVar = oVar.p()) {
            if (oVar instanceof o) {
                i2++;
            }
        }
        return i2;
    }

    private final String f() {
        o p = this.c.p();
        if (p == this.c) {
            return "EmptyQueue";
        }
        String oVar = p instanceof j ? p.toString() : p instanceof o ? "ReceiveQueued" : p instanceof s ? "SendQueued" : i.i("UNEXPECTED:", p);
        o q = this.c.q();
        if (q == p) {
            return oVar;
        }
        String str = oVar + ",queueSize=" + b();
        if (!(q instanceof j)) {
            return str;
        }
        return str + ",closedForSend=" + q;
    }

    private final void g(j<?> jVar) {
        Object b = kotlinx.coroutines.internal.l.b(null, 1, null);
        while (true) {
            o q = jVar.q();
            o oVar = q instanceof o ? (o) q : null;
            if (oVar == null) {
                break;
            } else if (!oVar.u()) {
                oVar.r();
            } else {
                b = kotlinx.coroutines.internal.l.c(b, oVar);
            }
        }
        if (b != null) {
            if (!(b instanceof ArrayList)) {
                ((o) b).z(jVar);
            } else {
                Objects.requireNonNull(b, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
                ArrayList arrayList = (ArrayList) b;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i2 = size - 1;
                        ((o) arrayList.get(size)).z(jVar);
                        if (i2 < 0) {
                            break;
                        }
                        size = i2;
                    }
                }
            }
        }
        j(jVar);
    }

    private final Throwable h(j<?> jVar) {
        g(jVar);
        return jVar.F();
    }

    @Override // kotlinx.coroutines.j2.t
    public final Object a(E e2) {
        j<?> jVar;
        i.b bVar;
        Object i2 = i(e2);
        if (i2 == b.b) {
            i.b bVar2 = i.a;
            r rVar = r.a;
            bVar2.c(rVar);
            return rVar;
        }
        if (i2 == b.c) {
            jVar = d();
            if (jVar == null) {
                return i.a.b();
            }
            bVar = i.a;
        } else if (i2 instanceof j) {
            bVar = i.a;
            jVar = (j) i2;
        } else {
            throw new IllegalStateException(j.x.d.i.i("trySend returned ", i2).toString());
        }
        return bVar.a(h(jVar));
    }

    protected String c() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final j<?> d() {
        o q = this.c.q();
        j<?> jVar = q instanceof j ? (j) q : null;
        if (jVar == null) {
            return null;
        }
        g(jVar);
        return jVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final m e() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object i(E e2) {
        q<E> l;
        z d2;
        do {
            l = l();
            if (l == null) {
                return b.c;
            }
            d2 = l.d(e2, null);
        } while (d2 == null);
        if (o0.a()) {
            if (!(d2 == kotlinx.coroutines.o.a)) {
                throw new AssertionError();
            }
        }
        l.g(e2);
        return l.c();
    }

    protected void j(o oVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final q<?> k(E e2) {
        o q;
        o oVar = this.c;
        a aVar = new a(e2);
        do {
            q = oVar.q();
            if (q instanceof q) {
                return (q) q;
            }
        } while (!q.j(aVar, oVar));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public q<E> l() {
        o oVar;
        o v;
        m mVar = this.c;
        while (true) {
            oVar = (o) mVar.o();
            oVar = null;
            if (oVar != mVar && (oVar instanceof q)) {
                if (((((q) oVar) instanceof j) && !oVar.t()) || (v = oVar.v()) == null) {
                    break;
                }
                v.s();
            }
        }
        return (q) oVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final s m() {
        o oVar;
        o v;
        m mVar = this.c;
        while (true) {
            oVar = (o) mVar.o();
            oVar = null;
            if (oVar != mVar && (oVar instanceof s)) {
                if (((((s) oVar) instanceof j) && !oVar.t()) || (v = oVar.v()) == null) {
                    break;
                }
                v.s();
            }
        }
        return (s) oVar;
    }

    public String toString() {
        return p0.a(this) + '@' + p0.b(this) + '{' + f() + '}' + c();
    }
}

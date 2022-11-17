package kotlinx.coroutines.internal;

import j.x.d.i;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public class o {

    /* renamed from: e  reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f3805e = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_next");

    /* renamed from: f  reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f3806f = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_prev");

    /* renamed from: g  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f3807g = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_removedRef");
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    /* loaded from: classes.dex */
    public static abstract class a extends kotlinx.coroutines.internal.b {
    }

    /* loaded from: classes.dex */
    public static abstract class b extends d<o> {
        public final o b;
        public o c;

        public b(o oVar) {
            this.b = oVar;
        }

        /* renamed from: h */
        public void d(o oVar, Object obj) {
            boolean z = obj == null;
            o oVar2 = z ? this.b : this.c;
            if (oVar2 != null && o.f3805e.compareAndSet(oVar, this, oVar2) && z) {
                o oVar3 = this.b;
                o oVar4 = this.c;
                i.b(oVar4);
                oVar3.n(oVar4);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends v {
        public final a a;

        public final void d() {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0048, code lost:
        if (kotlinx.coroutines.internal.o.f3805e.compareAndSet(r3, r2, ((kotlinx.coroutines.internal.w) r4).a) != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final o l(v vVar) {
        while (true) {
            o oVar = (o) this._prev;
            o oVar2 = oVar;
            while (true) {
                o oVar3 = null;
                while (true) {
                    Object obj = oVar2._next;
                    if (obj == this) {
                        if (oVar == oVar2 || f3806f.compareAndSet(this, oVar, oVar2)) {
                            return oVar2;
                        }
                    } else if (t()) {
                        return null;
                    } else {
                        if (obj == vVar) {
                            return oVar2;
                        }
                        if (obj instanceof v) {
                            if (vVar != null && vVar.b((v) obj)) {
                                return null;
                            }
                            ((v) obj).c(oVar2);
                        } else if (!(obj instanceof w)) {
                            oVar2 = (o) obj;
                            oVar3 = oVar2;
                        } else if (oVar3 != null) {
                            break;
                        } else {
                            oVar2 = (o) oVar2._prev;
                        }
                    }
                }
                oVar2 = oVar3;
            }
        }
    }

    private final o m(o oVar) {
        while (oVar.t()) {
            oVar = (o) oVar._prev;
        }
        return oVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(o oVar) {
        o oVar2;
        do {
            oVar2 = (o) oVar._prev;
            if (o() != oVar) {
                return;
            }
        } while (!f3806f.compareAndSet(oVar, oVar2, this));
        if (t()) {
            oVar.l(null);
        }
    }

    private final w w() {
        w wVar = (w) this._removedRef;
        if (wVar != null) {
            return wVar;
        }
        w wVar2 = new w(this);
        f3807g.lazySet(this, wVar2);
        return wVar2;
    }

    public final boolean j(o oVar, o oVar2) {
        f3806f.lazySet(oVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3805e;
        atomicReferenceFieldUpdater.lazySet(oVar, oVar2);
        if (!atomicReferenceFieldUpdater.compareAndSet(this, oVar2, oVar)) {
            return false;
        }
        oVar.n(oVar2);
        return true;
    }

    public final boolean k(o oVar) {
        f3806f.lazySet(oVar, this);
        f3805e.lazySet(oVar, this);
        while (o() == this) {
            if (f3805e.compareAndSet(this, this, oVar)) {
                oVar.n(this);
                return true;
            }
        }
        return false;
    }

    public final Object o() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof v)) {
                return obj;
            }
            ((v) obj).c(this);
        }
    }

    public final o p() {
        return n.b(o());
    }

    public final o q() {
        o l = l(null);
        return l == null ? m((o) this._prev) : l;
    }

    public final void r() {
        ((w) o()).a.s();
    }

    public final void s() {
        o oVar = this;
        while (true) {
            Object o = oVar.o();
            if (!(o instanceof w)) {
                oVar.l(null);
                return;
            }
            oVar = ((w) o).a;
        }
    }

    public boolean t() {
        return o() instanceof w;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) getClass().getSimpleName());
        sb.append('@');
        sb.append((Object) Integer.toHexString(System.identityHashCode(this)));
        return sb.toString();
    }

    public boolean u() {
        return v() == null;
    }

    public final o v() {
        Object o;
        o oVar;
        do {
            o = o();
            if (o instanceof w) {
                return ((w) o).a;
            }
            if (o == this) {
                return (o) o;
            }
            oVar = (o) o;
        } while (!f3805e.compareAndSet(this, o, oVar.w()));
        oVar.l(null);
        return null;
    }

    public final int x(o oVar, o oVar2, b bVar) {
        f3806f.lazySet(oVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3805e;
        atomicReferenceFieldUpdater.lazySet(oVar, oVar2);
        bVar.c = oVar2;
        if (!atomicReferenceFieldUpdater.compareAndSet(this, oVar2, bVar)) {
            return 0;
        }
        return bVar.c(this) == null ? 1 : 2;
    }
}

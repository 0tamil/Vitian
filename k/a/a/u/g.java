package k.a.a.u;

import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;
import k.a.a.e;
import k.a.a.q;
import k.a.a.r;
import k.a.a.u.b;
import k.a.a.w.d;
import k.a.a.x.i;
import k.a.a.x.l;
import k.a.a.y.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g<D extends b> extends f<D> implements Serializable {

    /* renamed from: e  reason: collision with root package name */
    private final d<D> f3563e;

    /* renamed from: f  reason: collision with root package name */
    private final r f3564f;

    /* renamed from: g  reason: collision with root package name */
    private final q f3565g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[k.a.a.x.a.values().length];
            a = iArr;
            try {
                iArr[k.a.a.x.a.INSTANT_SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[k.a.a.x.a.OFFSET_SECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private g(d<D> dVar, r rVar, q qVar) {
        d.i(dVar, "dateTime");
        this.f3563e = dVar;
        d.i(rVar, "offset");
        this.f3564f = rVar;
        d.i(qVar, "zone");
        this.f3565g = qVar;
    }

    private g<D> I(e eVar, q qVar) {
        return K(C().w(), eVar, qVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
        if (r2.contains(r8) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <R extends b> f<R> J(d<R> dVar, q qVar, r rVar) {
        d.i(dVar, "localDateTime");
        d.i(qVar, "zone");
        if (qVar instanceof r) {
            return new g(dVar, (r) qVar, qVar);
        }
        f d2 = qVar.d();
        k.a.a.g K = k.a.a.g.K(dVar);
        List<r> c = d2.c(K);
        if (c.size() != 1) {
            if (c.size() == 0) {
                k.a.a.y.d b = d2.b(K);
                dVar = dVar.N(b.e().e());
                rVar = b.j();
            } else if (rVar != null) {
            }
            d.i(rVar, "offset");
            return new g(dVar, rVar, qVar);
        }
        rVar = c.get(0);
        d.i(rVar, "offset");
        return new g(dVar, rVar, qVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <R extends b> g<R> K(h hVar, e eVar, q qVar) {
        r a2 = qVar.d().a(eVar);
        d.i(a2, "offset");
        return new g<>((d) hVar.q(k.a.a.g.W(eVar.w(), eVar.x(), a2)), a2, qVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f<?> L(ObjectInput objectInput) {
        return (f<D>) ((c) objectInput.readObject()).u((r) objectInput.readObject()).H((q) objectInput.readObject());
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new u((byte) 13, this);
    }

    @Override // k.a.a.u.f
    public c<D> D() {
        return this.f3563e;
    }

    @Override // k.a.a.u.f
    /* renamed from: G */
    public f<D> q(i iVar, long j2) {
        if (!(iVar instanceof k.a.a.x.a)) {
            return C().w().g(iVar.d(this, j2));
        }
        k.a.a.x.a aVar = (k.a.a.x.a) iVar;
        int i2 = a.a[aVar.ordinal()];
        if (i2 == 1) {
            return r(j2 - A(), k.a.a.x.b.SECONDS);
        }
        if (i2 != 2) {
            return J(this.f3563e.q(iVar, j2), this.f3565g, this.f3564f);
        }
        return I(this.f3563e.C(r.B(aVar.l(j2))), this.f3565g);
    }

    @Override // k.a.a.u.f
    public f<D> H(q qVar) {
        return J(this.f3563e, qVar, this.f3564f);
    }

    @Override // k.a.a.u.f
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && compareTo((f) obj) == 0;
    }

    @Override // k.a.a.u.f
    public int hashCode() {
        return (D().hashCode() ^ v().hashCode()) ^ Integer.rotateLeft(w().hashCode(), 3);
    }

    @Override // k.a.a.x.e
    public boolean j(i iVar) {
        return (iVar instanceof k.a.a.x.a) || (iVar != null && iVar.c(this));
    }

    @Override // k.a.a.u.f
    public String toString() {
        String str = D().toString() + v().toString();
        if (v() == w()) {
            return str;
        }
        return str + '[' + w().toString() + ']';
    }

    @Override // k.a.a.u.f
    public r v() {
        return this.f3564f;
    }

    @Override // k.a.a.u.f
    public q w() {
        return this.f3565g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.f3563e);
        objectOutput.writeObject(this.f3564f);
        objectOutput.writeObject(this.f3565g);
    }

    @Override // k.a.a.u.f
    /* renamed from: z */
    public f<D> r(long j2, l lVar) {
        return lVar instanceof k.a.a.x.b ? h(this.f3563e.r(j2, lVar)) : C().w().g(lVar.c(this, j2));
    }
}

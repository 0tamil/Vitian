package k.a.a.u;

import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import k.a.a.h;
import k.a.a.q;
import k.a.a.u.b;
import k.a.a.x.f;
import k.a.a.x.i;
import k.a.a.x.l;
import k.a.a.x.n;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d<D extends b> extends c<D> implements k.a.a.x.d, f, Serializable {

    /* renamed from: e  reason: collision with root package name */
    private final D f3561e;

    /* renamed from: f  reason: collision with root package name */
    private final h f3562f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[k.a.a.x.b.values().length];
            a = iArr;
            try {
                iArr[k.a.a.x.b.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[k.a.a.x.b.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[k.a.a.x.b.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[k.a.a.x.b.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[k.a.a.x.b.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[k.a.a.x.b.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[k.a.a.x.b.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private d(D d2, h hVar) {
        k.a.a.w.d.i(d2, "date");
        k.a.a.w.d.i(hVar, "time");
        this.f3561e = d2;
        this.f3562f = hVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <R extends b> d<R> H(R r, h hVar) {
        return new d<>(r, hVar);
    }

    private d<D> J(long j2) {
        return Q(this.f3561e.r(j2, k.a.a.x.b.DAYS), this.f3562f);
    }

    private d<D> K(long j2) {
        return O(this.f3561e, j2, 0L, 0L, 0L);
    }

    private d<D> L(long j2) {
        return O(this.f3561e, 0L, j2, 0L, 0L);
    }

    private d<D> M(long j2) {
        return O(this.f3561e, 0L, 0L, 0L, j2);
    }

    private d<D> O(D d2, long j2, long j3, long j4, long j5) {
        h G;
        b bVar = d2;
        if ((j2 | j3 | j4 | j5) == 0) {
            G = this.f3562f;
        } else {
            long P = this.f3562f.P();
            long j6 = (j5 % 86400000000000L) + ((j4 % 86400) * 1000000000) + ((j3 % 1440) * 60000000000L) + ((j2 % 24) * 3600000000000L) + P;
            long e2 = (j5 / 86400000000000L) + (j4 / 86400) + (j3 / 1440) + (j2 / 24) + k.a.a.w.d.e(j6, 86400000000000L);
            long h2 = k.a.a.w.d.h(j6, 86400000000000L);
            G = h2 == P ? this.f3562f : h.G(h2);
            bVar = bVar.r(e2, k.a.a.x.b.DAYS);
        }
        return Q(bVar, G);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c<?> P(ObjectInput objectInput) {
        return ((b) objectInput.readObject()).u((h) objectInput.readObject());
    }

    private d<D> Q(k.a.a.x.d dVar, h hVar) {
        D d2 = this.f3561e;
        return (d2 == dVar && this.f3562f == hVar) ? this : new d<>(d2.w().d(dVar), hVar);
    }

    private Object writeReplace() {
        return new u((byte) 12, this);
    }

    @Override // k.a.a.u.c
    public D D() {
        return this.f3561e;
    }

    @Override // k.a.a.u.c
    public h E() {
        return this.f3562f;
    }

    /* renamed from: I */
    public d<D> r(long j2, l lVar) {
        if (!(lVar instanceof k.a.a.x.b)) {
            return this.f3561e.w().e(lVar.c(this, j2));
        }
        switch (a.a[((k.a.a.x.b) lVar).ordinal()]) {
            case 1:
                return M(j2);
            case 2:
                return J(j2 / 86400000000L).M((j2 % 86400000000L) * 1000);
            case 3:
                return J(j2 / 86400000).M((j2 % 86400000) * 1000000);
            case 4:
                return N(j2);
            case 5:
                return L(j2);
            case 6:
                return K(j2);
            case 7:
                return J(j2 / 256).K((j2 % 256) * 12);
            default:
                return Q(this.f3561e.r(j2, lVar), this.f3562f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d<D> N(long j2) {
        return O(this.f3561e, 0L, 0L, j2, 0L);
    }

    /* renamed from: R */
    public d<D> h(f fVar) {
        return fVar instanceof b ? Q((b) fVar, this.f3562f) : fVar instanceof h ? Q(this.f3561e, (h) fVar) : fVar instanceof d ? this.f3561e.w().e((d) fVar) : this.f3561e.w().e((d) fVar.s(this));
    }

    /* renamed from: S */
    public d<D> q(i iVar, long j2) {
        return iVar instanceof k.a.a.x.a ? iVar.j() ? Q(this.f3561e, this.f3562f.q(iVar, j2)) : Q(this.f3561e.q(iVar, j2), this.f3562f) : this.f3561e.w().e(iVar.d(this, j2));
    }

    @Override // k.a.a.w.c, k.a.a.x.e
    public n c(i iVar) {
        return iVar instanceof k.a.a.x.a ? iVar.j() ? this.f3562f.c(iVar) : this.f3561e.c(iVar) : iVar.k(this);
    }

    @Override // k.a.a.w.c, k.a.a.x.e
    public int e(i iVar) {
        return iVar instanceof k.a.a.x.a ? iVar.j() ? this.f3562f.e(iVar) : this.f3561e.e(iVar) : c(iVar).a(l(iVar), iVar);
    }

    @Override // k.a.a.x.e
    public boolean j(i iVar) {
        return iVar instanceof k.a.a.x.a ? iVar.a() || iVar.j() : iVar != null && iVar.c(this);
    }

    @Override // k.a.a.x.e
    public long l(i iVar) {
        return iVar instanceof k.a.a.x.a ? iVar.j() ? this.f3562f.l(iVar) : this.f3561e.l(iVar) : iVar.g(this);
    }

    @Override // k.a.a.u.c
    public f<D> u(q qVar) {
        return g.J(this, qVar, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.f3561e);
        objectOutput.writeObject(this.f3562f);
    }
}

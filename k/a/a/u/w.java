package k.a.a.u;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Serializable;
import k.a.a.f;
import k.a.a.w.d;
import k.a.a.x.h;
import k.a.a.x.i;
import k.a.a.x.l;
import k.a.a.x.m;
import k.a.a.x.n;
/* loaded from: classes.dex */
public final class w extends k.a.a.u.a<w> implements Serializable {

    /* renamed from: e  reason: collision with root package name */
    private final f f3613e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[k.a.a.x.a.values().length];
            a = iArr;
            try {
                iArr[k.a.a.x.a.DAY_OF_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[k.a.a.x.a.DAY_OF_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[k.a.a.x.a.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[k.a.a.x.a.YEAR_OF_ERA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[k.a.a.x.a.PROLEPTIC_MONTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[k.a.a.x.a.YEAR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[k.a.a.x.a.ERA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(f fVar) {
        d.i(fVar, "date");
        this.f3613e = fVar;
    }

    private long L() {
        return ((M() * 12) + this.f3613e.P()) - 1;
    }

    private int M() {
        return this.f3613e.R() + 543;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b T(DataInput dataInput) {
        return v.f3609g.x(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }

    private w U(f fVar) {
        return fVar.equals(this.f3613e) ? this : new w(fVar);
    }

    private Object writeReplace() {
        return new u((byte) 7, this);
    }

    @Override // k.a.a.u.b
    public long C() {
        return this.f3613e.C();
    }

    /* renamed from: J */
    public v w() {
        return v.f3609g;
    }

    /* renamed from: K */
    public x x() {
        return (x) super.x();
    }

    /* renamed from: N */
    public w z(long j2, l lVar) {
        return (w) super.k(j2, lVar);
    }

    /* renamed from: O */
    public w r(long j2, l lVar) {
        return (w) super.r(j2, lVar);
    }

    /* renamed from: P */
    public w B(h hVar) {
        return (w) super.B(hVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public w G(long j2) {
        return U(this.f3613e.e0(j2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public w H(long j2) {
        return U(this.f3613e.f0(j2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S */
    public w I(long j2) {
        return U(this.f3613e.h0(j2));
    }

    /* renamed from: V */
    public w h(k.a.a.x.f fVar) {
        return (w) super.h(fVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (r2 != 7) goto L19;
     */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w q(i iVar, long j2) {
        if (!(iVar instanceof k.a.a.x.a)) {
            return (w) iVar.d(this, j2);
        }
        k.a.a.x.a aVar = (k.a.a.x.a) iVar;
        if (l(aVar) == j2) {
            return this;
        }
        int[] iArr = a.a;
        int i2 = iArr[aVar.ordinal()];
        if (i2 != 4) {
            if (i2 == 5) {
                w().A(aVar).b(j2, aVar);
                return H(j2 - L());
            } else if (i2 != 6) {
            }
        }
        int a2 = w().A(aVar).a(j2, aVar);
        int i3 = iArr[aVar.ordinal()];
        if (i3 == 4) {
            f fVar = this.f3613e;
            if (M() < 1) {
                a2 = 1 - a2;
            }
            return U(fVar.p0(a2 - 543));
        } else if (i3 == 6) {
            return U(this.f3613e.p0(a2 - 543));
        } else {
            if (i3 == 7) {
                return U(this.f3613e.p0((1 - M()) - 543));
            }
            return U(this.f3613e.q(iVar, j2));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void X(DataOutput dataOutput) {
        dataOutput.writeInt(e(k.a.a.x.a.YEAR));
        dataOutput.writeByte(e(k.a.a.x.a.MONTH_OF_YEAR));
        dataOutput.writeByte(e(k.a.a.x.a.DAY_OF_MONTH));
    }

    @Override // k.a.a.w.c, k.a.a.x.e
    public n c(i iVar) {
        if (!(iVar instanceof k.a.a.x.a)) {
            return iVar.k(this);
        }
        if (j(iVar)) {
            k.a.a.x.a aVar = (k.a.a.x.a) iVar;
            int i2 = a.a[aVar.ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                return this.f3613e.c(iVar);
            }
            if (i2 != 4) {
                return w().A(aVar);
            }
            n h2 = k.a.a.x.a.YEAR.h();
            return n.i(1L, M() <= 0 ? (-(h2.d() + 543)) + 1 : 543 + h2.c());
        }
        throw new m("Unsupported field: " + iVar);
    }

    @Override // k.a.a.u.b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w) {
            return this.f3613e.equals(((w) obj).f3613e);
        }
        return false;
    }

    @Override // k.a.a.u.b
    public int hashCode() {
        return w().l().hashCode() ^ this.f3613e.hashCode();
    }

    @Override // k.a.a.x.e
    public long l(i iVar) {
        if (!(iVar instanceof k.a.a.x.a)) {
            return iVar.g(this);
        }
        int i2 = a.a[((k.a.a.x.a) iVar).ordinal()];
        int i3 = 1;
        if (i2 == 4) {
            int M = M();
            if (M < 1) {
                M = 1 - M;
            }
            return M;
        } else if (i2 == 5) {
            return L();
        } else {
            if (i2 == 6) {
                return M();
            }
            if (i2 != 7) {
                return this.f3613e.l(iVar);
            }
            if (M() < 1) {
                i3 = 0;
            }
            return i3;
        }
    }

    @Override // k.a.a.u.a, k.a.a.u.b
    public final c<w> u(k.a.a.h hVar) {
        return super.u(hVar);
    }
}

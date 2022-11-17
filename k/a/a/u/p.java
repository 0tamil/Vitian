package k.a.a.u;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Calendar;
import k.a.a.b;
import k.a.a.f;
import k.a.a.x.h;
import k.a.a.x.i;
import k.a.a.x.l;
import k.a.a.x.m;
import k.a.a.x.n;
/* loaded from: classes.dex */
public final class p extends k.a.a.u.a<p> implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    static final f f3591h = f.Y(1873, 1, 1);

    /* renamed from: e  reason: collision with root package name */
    private final f f3592e;

    /* renamed from: f  reason: collision with root package name */
    private transient q f3593f;

    /* renamed from: g  reason: collision with root package name */
    private transient int f3594g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[k.a.a.x.a.values().length];
            a = iArr;
            try {
                iArr[k.a.a.x.a.DAY_OF_YEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[k.a.a.x.a.YEAR_OF_ERA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[k.a.a.x.a.ALIGNED_DAY_OF_WEEK_IN_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[k.a.a.x.a.ALIGNED_DAY_OF_WEEK_IN_YEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[k.a.a.x.a.ALIGNED_WEEK_OF_MONTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[k.a.a.x.a.ALIGNED_WEEK_OF_YEAR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[k.a.a.x.a.ERA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(f fVar) {
        if (!fVar.y(f3591h)) {
            q u = q.u(fVar);
            this.f3593f = u;
            this.f3594g = fVar.R() - (u.y().R() - 1);
            this.f3592e = fVar;
            return;
        }
        throw new b("Minimum supported date is January 1st Meiji 6");
    }

    private n J(int i2) {
        Calendar calendar = Calendar.getInstance(o.f3586g);
        calendar.set(0, this.f3593f.getValue() + 2);
        calendar.set(this.f3594g, this.f3592e.P() - 1, this.f3592e.L());
        return n.i(calendar.getActualMinimum(i2), calendar.getActualMaximum(i2));
    }

    private long L() {
        return this.f3594g == 1 ? (this.f3592e.N() - this.f3593f.y().N()) + 1 : this.f3592e.N();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b T(DataInput dataInput) {
        return o.f3587h.x(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }

    private p U(f fVar) {
        return fVar.equals(this.f3592e) ? this : new p(fVar);
    }

    private p X(int i2) {
        return Y(x(), i2);
    }

    private p Y(q qVar, int i2) {
        return U(this.f3592e.p0(o.f3587h.A(qVar, i2)));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        q u = q.u(this.f3592e);
        this.f3593f = u;
        this.f3594g = this.f3592e.R() - (u.y().R() - 1);
    }

    private Object writeReplace() {
        return new u((byte) 1, this);
    }

    @Override // k.a.a.u.b
    public long C() {
        return this.f3592e.C();
    }

    /* renamed from: K */
    public o w() {
        return o.f3587h;
    }

    /* renamed from: M */
    public q x() {
        return this.f3593f;
    }

    /* renamed from: N */
    public p z(long j2, l lVar) {
        return (p) super.k(j2, lVar);
    }

    /* renamed from: O */
    public p r(long j2, l lVar) {
        return (p) super.r(j2, lVar);
    }

    /* renamed from: P */
    public p B(h hVar) {
        return (p) super.B(hVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public p G(long j2) {
        return U(this.f3592e.e0(j2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public p H(long j2) {
        return U(this.f3592e.f0(j2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S */
    public p I(long j2) {
        return U(this.f3592e.h0(j2));
    }

    /* renamed from: V */
    public p h(k.a.a.x.f fVar) {
        return (p) super.h(fVar);
    }

    /* renamed from: W */
    public p q(i iVar, long j2) {
        if (!(iVar instanceof k.a.a.x.a)) {
            return (p) iVar.d(this, j2);
        }
        k.a.a.x.a aVar = (k.a.a.x.a) iVar;
        if (l(aVar) == j2) {
            return this;
        }
        int[] iArr = a.a;
        int i2 = iArr[aVar.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 7) {
            int a2 = w().B(aVar).a(j2, aVar);
            int i3 = iArr[aVar.ordinal()];
            if (i3 == 1) {
                return U(this.f3592e.e0(a2 - L()));
            }
            if (i3 == 2) {
                return X(a2);
            }
            if (i3 == 7) {
                return Y(q.v(a2), this.f3594g);
            }
        }
        return U(this.f3592e.q(iVar, j2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Z(DataOutput dataOutput) {
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
            return i2 != 1 ? i2 != 2 ? w().B(aVar) : J(1) : J(6);
        }
        throw new m("Unsupported field: " + iVar);
    }

    @Override // k.a.a.u.b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            return this.f3592e.equals(((p) obj).f3592e);
        }
        return false;
    }

    @Override // k.a.a.u.b
    public int hashCode() {
        return w().l().hashCode() ^ this.f3592e.hashCode();
    }

    @Override // k.a.a.u.b, k.a.a.x.e
    public boolean j(i iVar) {
        if (iVar == k.a.a.x.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || iVar == k.a.a.x.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || iVar == k.a.a.x.a.ALIGNED_WEEK_OF_MONTH || iVar == k.a.a.x.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        return super.j(iVar);
    }

    @Override // k.a.a.x.e
    public long l(i iVar) {
        if (!(iVar instanceof k.a.a.x.a)) {
            return iVar.g(this);
        }
        switch (a.a[((k.a.a.x.a) iVar).ordinal()]) {
            case 1:
                return L();
            case 2:
                return this.f3594g;
            case 3:
            case 4:
            case 5:
            case 6:
                throw new m("Unsupported field: " + iVar);
            case 7:
                return this.f3593f.getValue();
            default:
                return this.f3592e.l(iVar);
        }
    }

    @Override // k.a.a.u.a, k.a.a.u.b
    public final c<p> u(k.a.a.h hVar) {
        return super.u(hVar);
    }
}

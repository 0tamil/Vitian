package k.a.a;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import k.a.a.u.h;
import k.a.a.u.m;
import k.a.a.w.c;
import k.a.a.w.d;
import k.a.a.x.e;
import k.a.a.x.f;
import k.a.a.x.i;
import k.a.a.x.k;
import k.a.a.x.n;
/* loaded from: classes.dex */
public final class j extends c implements e, f, Comparable<j>, Serializable {

    /* renamed from: e  reason: collision with root package name */
    private final int f3533e;

    /* renamed from: f  reason: collision with root package name */
    private final int f3534f;

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
                a[k.a.a.x.a.MONTH_OF_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        k.a.a.v.c cVar = new k.a.a.v.c();
        cVar.f("--");
        cVar.k(k.a.a.x.a.MONTH_OF_YEAR, 2);
        cVar.e('-');
        cVar.k(k.a.a.x.a.DAY_OF_MONTH, 2);
        cVar.s();
    }

    private j(int i2, int i3) {
        this.f3533e = i2;
        this.f3534f = i3;
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static j v(int i2, int i3) {
        return w(i.u(i2), i3);
    }

    public static j w(i iVar, int i2) {
        d.i(iVar, "month");
        k.a.a.x.a.DAY_OF_MONTH.p(i2);
        if (i2 <= iVar.p()) {
            return new j(iVar.getValue(), i2);
        }
        throw new b("Illegal value for DayOfMonth field, value " + i2 + " is not valid for month " + iVar.name());
    }

    private Object writeReplace() {
        return new n((byte) 64, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j x(DataInput dataInput) {
        return v(dataInput.readByte(), dataInput.readByte());
    }

    @Override // k.a.a.w.c, k.a.a.x.e
    public n c(i iVar) {
        return iVar == k.a.a.x.a.MONTH_OF_YEAR ? iVar.h() : iVar == k.a.a.x.a.DAY_OF_MONTH ? n.j(1L, u().t(), u().p()) : super.c(iVar);
    }

    @Override // k.a.a.w.c, k.a.a.x.e
    public int e(i iVar) {
        return c(iVar).a(l(iVar), iVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f3533e == jVar.f3533e && this.f3534f == jVar.f3534f;
    }

    @Override // k.a.a.w.c, k.a.a.x.e
    public <R> R g(k<R> kVar) {
        return kVar == k.a.a.x.j.a() ? (R) m.f3582g : (R) super.g(kVar);
    }

    public int hashCode() {
        return (this.f3533e << 6) + this.f3534f;
    }

    @Override // k.a.a.x.e
    public boolean j(i iVar) {
        return iVar instanceof k.a.a.x.a ? iVar == k.a.a.x.a.MONTH_OF_YEAR || iVar == k.a.a.x.a.DAY_OF_MONTH : iVar != null && iVar.c(this);
    }

    @Override // k.a.a.x.e
    public long l(i iVar) {
        int i2;
        if (!(iVar instanceof k.a.a.x.a)) {
            return iVar.g(this);
        }
        int i3 = a.a[((k.a.a.x.a) iVar).ordinal()];
        if (i3 == 1) {
            i2 = this.f3534f;
        } else if (i3 == 2) {
            i2 = this.f3533e;
        } else {
            throw new k.a.a.x.m("Unsupported field: " + iVar);
        }
        return i2;
    }

    @Override // k.a.a.x.f
    public k.a.a.x.d s(k.a.a.x.d dVar) {
        if (h.j(dVar).equals(m.f3582g)) {
            k.a.a.x.d q = dVar.q(k.a.a.x.a.MONTH_OF_YEAR, this.f3533e);
            k.a.a.x.a aVar = k.a.a.x.a.DAY_OF_MONTH;
            return q.q(aVar, Math.min(q.c(aVar).c(), this.f3534f));
        }
        throw new b("Adjustment only supported on ISO date-time");
    }

    /* renamed from: t */
    public int compareTo(j jVar) {
        int i2 = this.f3533e - jVar.f3533e;
        return i2 == 0 ? this.f3534f - jVar.f3534f : i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        sb.append(this.f3533e < 10 ? "0" : "");
        sb.append(this.f3533e);
        sb.append(this.f3534f < 10 ? "-0" : "-");
        sb.append(this.f3534f);
        return sb.toString();
    }

    public i u() {
        return i.u(this.f3533e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(DataOutput dataOutput) {
        dataOutput.writeByte(this.f3533e);
        dataOutput.writeByte(this.f3534f);
    }
}

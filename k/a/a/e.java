package k.a.a;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import k.a.a.w.c;
import k.a.a.x.b;
import k.a.a.x.d;
import k.a.a.x.f;
import k.a.a.x.i;
import k.a.a.x.j;
import k.a.a.x.k;
import k.a.a.x.l;
import k.a.a.x.m;
import k.a.a.x.n;
/* loaded from: classes.dex */
public final class e extends c implements d, f, Comparable<e>, Serializable {

    /* renamed from: g  reason: collision with root package name */
    public static final e f3506g = new e(0, 0);

    /* renamed from: e  reason: collision with root package name */
    private final long f3507e;

    /* renamed from: f  reason: collision with root package name */
    private final int f3508f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[b.values().length];
            b = iArr;
            try {
                iArr[b.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[b.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[b.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[b.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[b.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[b.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[b.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[b.DAYS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[k.a.a.x.a.values().length];
            a = iArr2;
            try {
                iArr2[k.a.a.x.a.NANO_OF_SECOND.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[k.a.a.x.a.MICRO_OF_SECOND.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[k.a.a.x.a.MILLI_OF_SECOND.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[k.a.a.x.a.INSTANT_SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        B(-31557014167219200L, 0L);
        B(31556889864403199L, 999999999L);
    }

    private e(long j2, int i2) {
        this.f3507e = j2;
        this.f3508f = i2;
    }

    public static e A(long j2) {
        return u(j2, 0);
    }

    public static e B(long j2, long j3) {
        return u(k.a.a.w.d.k(j2, k.a.a.w.d.e(j3, 1000000000L)), k.a.a.w.d.g(j3, 1000000000));
    }

    private e C(long j2, long j3) {
        if ((j2 | j3) == 0) {
            return this;
        }
        return B(k.a.a.w.d.k(k.a.a.w.d.k(this.f3507e, j2), j3 / 1000000000), this.f3508f + (j3 % 1000000000));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e H(DataInput dataInput) {
        return B(dataInput.readLong(), dataInput.readInt());
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private static e u(long j2, int i2) {
        if ((i2 | j2) == 0) {
            return f3506g;
        }
        if (j2 >= -31557014167219200L && j2 <= 31556889864403199L) {
            return new e(j2, i2);
        }
        throw new b("Instant exceeds minimum or maximum instant");
    }

    public static e v(k.a.a.x.e eVar) {
        try {
            return B(eVar.l(k.a.a.x.a.INSTANT_SECONDS), eVar.e(k.a.a.x.a.NANO_OF_SECOND));
        } catch (b e2) {
            throw new b("Unable to obtain Instant from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName(), e2);
        }
    }

    private Object writeReplace() {
        return new n((byte) 2, this);
    }

    public static e z(long j2) {
        return u(k.a.a.w.d.e(j2, 1000L), k.a.a.w.d.g(j2, 1000) * 1000000);
    }

    /* renamed from: D */
    public e r(long j2, l lVar) {
        if (!(lVar instanceof b)) {
            return (e) lVar.c(this, j2);
        }
        switch (a.b[((b) lVar).ordinal()]) {
            case 1:
                return F(j2);
            case 2:
                return C(j2 / 1000000, (j2 % 1000000) * 1000);
            case 3:
                return E(j2);
            case 4:
                return G(j2);
            case 5:
                return G(k.a.a.w.d.l(j2, 60));
            case 6:
                return G(k.a.a.w.d.l(j2, 3600));
            case 7:
                return G(k.a.a.w.d.l(j2, 43200));
            case 8:
                return G(k.a.a.w.d.l(j2, 86400));
            default:
                throw new m("Unsupported unit: " + lVar);
        }
    }

    public e E(long j2) {
        return C(j2 / 1000, (j2 % 1000) * 1000000);
    }

    public e F(long j2) {
        return C(0L, j2);
    }

    public e G(long j2) {
        return C(j2, 0L);
    }

    public long I() {
        long j2 = this.f3507e;
        return j2 >= 0 ? k.a.a.w.d.k(k.a.a.w.d.m(j2, 1000L), this.f3508f / 1000000) : k.a.a.w.d.o(k.a.a.w.d.m(j2 + 1, 1000L), 1000 - (this.f3508f / 1000000));
    }

    /* renamed from: J */
    public e h(f fVar) {
        return (e) fVar.s(this);
    }

    /* renamed from: K */
    public e q(i iVar, long j2) {
        if (!(iVar instanceof k.a.a.x.a)) {
            return (e) iVar.d(this, j2);
        }
        k.a.a.x.a aVar = (k.a.a.x.a) iVar;
        aVar.p(j2);
        int i2 = a.a[aVar.ordinal()];
        if (i2 == 1) {
            return j2 != ((long) this.f3508f) ? u(this.f3507e, (int) j2) : this;
        }
        if (i2 == 2) {
            int i3 = ((int) j2) * 1000;
            return i3 != this.f3508f ? u(this.f3507e, i3) : this;
        } else if (i2 == 3) {
            int i4 = ((int) j2) * 1000000;
            return i4 != this.f3508f ? u(this.f3507e, i4) : this;
        } else if (i2 == 4) {
            return j2 != this.f3507e ? u(j2, this.f3508f) : this;
        } else {
            throw new m("Unsupported field: " + iVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void L(DataOutput dataOutput) {
        dataOutput.writeLong(this.f3507e);
        dataOutput.writeInt(this.f3508f);
    }

    @Override // k.a.a.w.c, k.a.a.x.e
    public n c(i iVar) {
        return super.c(iVar);
    }

    @Override // k.a.a.w.c, k.a.a.x.e
    public int e(i iVar) {
        if (!(iVar instanceof k.a.a.x.a)) {
            return c(iVar).a(iVar.g(this), iVar);
        }
        int i2 = a.a[((k.a.a.x.a) iVar).ordinal()];
        if (i2 == 1) {
            return this.f3508f;
        }
        if (i2 == 2) {
            return this.f3508f / 1000;
        }
        if (i2 == 3) {
            return this.f3508f / 1000000;
        }
        throw new m("Unsupported field: " + iVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f3507e == eVar.f3507e && this.f3508f == eVar.f3508f;
    }

    @Override // k.a.a.w.c, k.a.a.x.e
    public <R> R g(k<R> kVar) {
        if (kVar == j.e()) {
            return (R) b.NANOS;
        }
        if (kVar == j.b() || kVar == j.c() || kVar == j.a() || kVar == j.g() || kVar == j.f() || kVar == j.d()) {
            return null;
        }
        return kVar.a(this);
    }

    public int hashCode() {
        long j2 = this.f3507e;
        return ((int) (j2 ^ (j2 >>> 32))) + (this.f3508f * 51);
    }

    @Override // k.a.a.x.e
    public boolean j(i iVar) {
        return iVar instanceof k.a.a.x.a ? iVar == k.a.a.x.a.INSTANT_SECONDS || iVar == k.a.a.x.a.NANO_OF_SECOND || iVar == k.a.a.x.a.MICRO_OF_SECOND || iVar == k.a.a.x.a.MILLI_OF_SECOND : iVar != null && iVar.c(this);
    }

    @Override // k.a.a.x.e
    public long l(i iVar) {
        int i2;
        if (!(iVar instanceof k.a.a.x.a)) {
            return iVar.g(this);
        }
        int i3 = a.a[((k.a.a.x.a) iVar).ordinal()];
        if (i3 == 1) {
            i2 = this.f3508f;
        } else if (i3 == 2) {
            i2 = this.f3508f / 1000;
        } else if (i3 == 3) {
            i2 = this.f3508f / 1000000;
        } else if (i3 == 4) {
            return this.f3507e;
        } else {
            throw new m("Unsupported field: " + iVar);
        }
        return i2;
    }

    @Override // k.a.a.x.f
    public d s(d dVar) {
        return dVar.q(k.a.a.x.a.INSTANT_SECONDS, this.f3507e).q(k.a.a.x.a.NANO_OF_SECOND, this.f3508f);
    }

    /* renamed from: t */
    public int compareTo(e eVar) {
        int b = k.a.a.w.d.b(this.f3507e, eVar.f3507e);
        return b != 0 ? b : this.f3508f - eVar.f3508f;
    }

    public String toString() {
        return k.a.a.v.b.l.b(this);
    }

    public long w() {
        return this.f3507e;
    }

    public int x() {
        return this.f3508f;
    }

    /* renamed from: y */
    public e k(long j2, l lVar) {
        return j2 == Long.MIN_VALUE ? r(Long.MAX_VALUE, lVar).r(1L, lVar) : r(-j2, lVar);
    }
}

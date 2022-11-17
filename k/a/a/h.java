package k.a.a;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import k.a.a.w.c;
import k.a.a.x.b;
import k.a.a.x.d;
import k.a.a.x.e;
import k.a.a.x.f;
import k.a.a.x.i;
import k.a.a.x.j;
import k.a.a.x.k;
import k.a.a.x.l;
import k.a.a.x.m;
import k.a.a.x.n;
/* loaded from: classes.dex */
public final class h extends c implements d, f, Comparable<h>, Serializable {

    /* renamed from: i  reason: collision with root package name */
    public static final h f3519i;

    /* renamed from: j  reason: collision with root package name */
    public static final h f3520j;

    /* renamed from: k  reason: collision with root package name */
    private static final h[] f3521k = new h[24];

    /* renamed from: e  reason: collision with root package name */
    private final byte f3522e;

    /* renamed from: f  reason: collision with root package name */
    private final byte f3523f;

    /* renamed from: g  reason: collision with root package name */
    private final byte f3524g;

    /* renamed from: h  reason: collision with root package name */
    private final int f3525h;

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
            int[] iArr2 = new int[k.a.a.x.a.values().length];
            a = iArr2;
            try {
                iArr2[k.a.a.x.a.NANO_OF_SECOND.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[k.a.a.x.a.NANO_OF_DAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[k.a.a.x.a.MICRO_OF_SECOND.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[k.a.a.x.a.MICRO_OF_DAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[k.a.a.x.a.MILLI_OF_SECOND.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[k.a.a.x.a.MILLI_OF_DAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[k.a.a.x.a.SECOND_OF_MINUTE.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[k.a.a.x.a.SECOND_OF_DAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[k.a.a.x.a.MINUTE_OF_HOUR.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[k.a.a.x.a.MINUTE_OF_DAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[k.a.a.x.a.HOUR_OF_AMPM.ordinal()] = 11;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[k.a.a.x.a.CLOCK_HOUR_OF_AMPM.ordinal()] = 12;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[k.a.a.x.a.HOUR_OF_DAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[k.a.a.x.a.CLOCK_HOUR_OF_DAY.ordinal()] = 14;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[k.a.a.x.a.AMPM_OF_DAY.ordinal()] = 15;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    static {
        int i2 = 0;
        while (true) {
            h[] hVarArr = f3521k;
            if (i2 < hVarArr.length) {
                hVarArr[i2] = new h(i2, 0, 0, 0);
                i2++;
            } else {
                h hVar = hVarArr[0];
                h hVar2 = hVarArr[12];
                f3519i = hVarArr[0];
                f3520j = new h(23, 59, 59, 999999999);
                return;
            }
        }
    }

    private h(int i2, int i3, int i4, int i5) {
        this.f3522e = (byte) i2;
        this.f3523f = (byte) i3;
        this.f3524g = (byte) i4;
        this.f3525h = i5;
    }

    public static h D(int i2, int i3) {
        k.a.a.x.a.HOUR_OF_DAY.p(i2);
        if (i3 == 0) {
            return f3521k[i2];
        }
        k.a.a.x.a.MINUTE_OF_HOUR.p(i3);
        return new h(i2, i3, 0, 0);
    }

    public static h E(int i2, int i3, int i4) {
        k.a.a.x.a.HOUR_OF_DAY.p(i2);
        if ((i3 | i4) == 0) {
            return f3521k[i2];
        }
        k.a.a.x.a.MINUTE_OF_HOUR.p(i3);
        k.a.a.x.a.SECOND_OF_MINUTE.p(i4);
        return new h(i2, i3, i4, 0);
    }

    public static h F(int i2, int i3, int i4, int i5) {
        k.a.a.x.a.HOUR_OF_DAY.p(i2);
        k.a.a.x.a.MINUTE_OF_HOUR.p(i3);
        k.a.a.x.a.SECOND_OF_MINUTE.p(i4);
        k.a.a.x.a.NANO_OF_SECOND.p(i5);
        return v(i2, i3, i4, i5);
    }

    public static h G(long j2) {
        k.a.a.x.a.NANO_OF_DAY.p(j2);
        int i2 = (int) (j2 / 3600000000000L);
        long j3 = j2 - (i2 * 3600000000000L);
        int i3 = (int) (j3 / 60000000000L);
        long j4 = j3 - (i3 * 60000000000L);
        int i4 = (int) (j4 / 1000000000);
        return v(i2, i3, i4, (int) (j4 - (i4 * 1000000000)));
    }

    public static h H(long j2) {
        k.a.a.x.a.SECOND_OF_DAY.p(j2);
        int i2 = (int) (j2 / 3600);
        long j3 = j2 - (i2 * 3600);
        int i3 = (int) (j3 / 60);
        return v(i2, i3, (int) (j3 - (i3 * 60)), 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h I(long j2, int i2) {
        k.a.a.x.a.SECOND_OF_DAY.p(j2);
        k.a.a.x.a.NANO_OF_SECOND.p(i2);
        int i3 = (int) (j2 / 3600);
        long j3 = j2 - (i3 * 3600);
        int i4 = (int) (j3 / 60);
        return v(i3, i4, (int) (j3 - (i4 * 60)), i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h O(DataInput dataInput) {
        int i2;
        int i3;
        int i4;
        int i5;
        int readByte = dataInput.readByte();
        int i6 = 0;
        if (readByte < 0) {
            readByte = ~readByte;
            i5 = 0;
        } else {
            int readByte2 = dataInput.readByte();
            if (readByte2 < 0) {
                int i7 = ~readByte2;
                i3 = 0;
                i2 = 0;
                i4 = i7;
            } else {
                int readByte3 = dataInput.readByte();
                if (readByte3 < 0) {
                    i6 = readByte2;
                    i5 = ~readByte3;
                } else {
                    i3 = dataInput.readInt();
                    i2 = readByte3;
                    i4 = readByte2;
                }
            }
            return F(readByte, i4, i2 == 1 ? 1 : 0, i3);
        }
        i3 = 0;
        i4 = i6;
        i2 = i5;
        return F(readByte, i4, i2 == 1 ? 1 : 0, i3);
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private static h v(int i2, int i3, int i4, int i5) {
        return ((i3 | i4) | i5) == 0 ? f3521k[i2] : new h(i2, i3, i4, i5);
    }

    public static h w(e eVar) {
        h hVar = (h) eVar.g(j.c());
        if (hVar != null) {
            return hVar;
        }
        throw new b("Unable to obtain LocalTime from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
    }

    private Object writeReplace() {
        return new n((byte) 5, this);
    }

    private int x(i iVar) {
        switch (a.a[((k.a.a.x.a) iVar).ordinal()]) {
            case 1:
                return this.f3525h;
            case 2:
                throw new b("Field too large for an int: " + iVar);
            case 3:
                return this.f3525h / 1000;
            case 4:
                throw new b("Field too large for an int: " + iVar);
            case 5:
                return this.f3525h / 1000000;
            case 6:
                return (int) (P() / 1000000);
            case 7:
                return this.f3524g;
            case 8:
                return Q();
            case 9:
                return this.f3523f;
            case 10:
                return (this.f3522e * 60) + this.f3523f;
            case 11:
                return this.f3522e % 12;
            case 12:
                int i2 = this.f3522e % 12;
                if (i2 % 12 == 0) {
                    return 12;
                }
                return i2;
            case 13:
                return this.f3522e;
            case 14:
                byte b = this.f3522e;
                if (b == 0) {
                    return 24;
                }
                return b;
            case 15:
                return this.f3522e / 12;
            default:
                throw new m("Unsupported field: " + iVar);
        }
    }

    public int A() {
        return this.f3525h;
    }

    public int B() {
        return this.f3524g;
    }

    /* renamed from: C */
    public h k(long j2, l lVar) {
        return j2 == Long.MIN_VALUE ? r(Long.MAX_VALUE, lVar).r(1L, lVar) : r(-j2, lVar);
    }

    /* renamed from: J */
    public h r(long j2, l lVar) {
        if (!(lVar instanceof b)) {
            return (h) lVar.c(this, j2);
        }
        switch (a.b[((b) lVar).ordinal()]) {
            case 1:
                return M(j2);
            case 2:
                return M((j2 % 86400000000L) * 1000);
            case 3:
                return M((j2 % 86400000) * 1000000);
            case 4:
                return N(j2);
            case 5:
                return L(j2);
            case 6:
                return K(j2);
            case 7:
                return K((j2 % 2) * 12);
            default:
                throw new m("Unsupported unit: " + lVar);
        }
    }

    public h K(long j2) {
        return j2 == 0 ? this : v(((((int) (j2 % 24)) + this.f3522e) + 24) % 24, this.f3523f, this.f3524g, this.f3525h);
    }

    public h L(long j2) {
        if (j2 == 0) {
            return this;
        }
        int i2 = (this.f3522e * 60) + this.f3523f;
        int i3 = ((((int) (j2 % 1440)) + i2) + 1440) % 1440;
        return i2 == i3 ? this : v(i3 / 60, i3 % 60, this.f3524g, this.f3525h);
    }

    public h M(long j2) {
        if (j2 == 0) {
            return this;
        }
        long P = P();
        long j3 = (((j2 % 86400000000000L) + P) + 86400000000000L) % 86400000000000L;
        return P == j3 ? this : v((int) (j3 / 3600000000000L), (int) ((j3 / 60000000000L) % 60), (int) ((j3 / 1000000000) % 60), (int) (j3 % 1000000000));
    }

    public h N(long j2) {
        if (j2 == 0) {
            return this;
        }
        int i2 = (this.f3522e * 3600) + (this.f3523f * 60) + this.f3524g;
        int i3 = ((((int) (j2 % 86400)) + i2) + 86400) % 86400;
        return i2 == i3 ? this : v(i3 / 3600, (i3 / 60) % 60, i3 % 60, this.f3525h);
    }

    public long P() {
        return (this.f3522e * 3600000000000L) + (this.f3523f * 60000000000L) + (this.f3524g * 1000000000) + this.f3525h;
    }

    public int Q() {
        return (this.f3522e * 3600) + (this.f3523f * 60) + this.f3524g;
    }

    /* renamed from: R */
    public h h(f fVar) {
        return fVar instanceof h ? (h) fVar : (h) fVar.s(this);
    }

    /* renamed from: S */
    public h q(i iVar, long j2) {
        if (!(iVar instanceof k.a.a.x.a)) {
            return (h) iVar.d(this, j2);
        }
        k.a.a.x.a aVar = (k.a.a.x.a) iVar;
        aVar.p(j2);
        switch (a.a[aVar.ordinal()]) {
            case 1:
                return V((int) j2);
            case 2:
                return G(j2);
            case 3:
                return V(((int) j2) * 1000);
            case 4:
                return G(j2 * 1000);
            case 5:
                return V(((int) j2) * 1000000);
            case 6:
                return G(j2 * 1000000);
            case 7:
                return W((int) j2);
            case 8:
                return N(j2 - Q());
            case 9:
                return U((int) j2);
            case 10:
                return L(j2 - ((this.f3522e * 60) + this.f3523f));
            case 11:
                return K(j2 - (this.f3522e % 12));
            case 12:
                if (j2 == 12) {
                    j2 = 0;
                }
                return K(j2 - (this.f3522e % 12));
            case 13:
                return T((int) j2);
            case 14:
                if (j2 == 24) {
                    j2 = 0;
                }
                return T((int) j2);
            case 15:
                return K((j2 - (this.f3522e / 12)) * 12);
            default:
                throw new m("Unsupported field: " + iVar);
        }
    }

    public h T(int i2) {
        if (this.f3522e == i2) {
            return this;
        }
        k.a.a.x.a.HOUR_OF_DAY.p(i2);
        return v(i2, this.f3523f, this.f3524g, this.f3525h);
    }

    public h U(int i2) {
        if (this.f3523f == i2) {
            return this;
        }
        k.a.a.x.a.MINUTE_OF_HOUR.p(i2);
        return v(this.f3522e, i2, this.f3524g, this.f3525h);
    }

    public h V(int i2) {
        if (this.f3525h == i2) {
            return this;
        }
        k.a.a.x.a.NANO_OF_SECOND.p(i2);
        return v(this.f3522e, this.f3523f, this.f3524g, i2);
    }

    public h W(int i2) {
        if (this.f3524g == i2) {
            return this;
        }
        k.a.a.x.a.SECOND_OF_MINUTE.p(i2);
        return v(this.f3522e, this.f3523f, i2, this.f3525h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void X(DataOutput dataOutput) {
        byte b;
        if (this.f3525h == 0) {
            if (this.f3524g != 0) {
                dataOutput.writeByte(this.f3522e);
                dataOutput.writeByte(this.f3523f);
                b = this.f3524g;
            } else if (this.f3523f == 0) {
                b = this.f3522e;
            } else {
                dataOutput.writeByte(this.f3522e);
                b = this.f3523f;
            }
            dataOutput.writeByte(~b);
            return;
        }
        dataOutput.writeByte(this.f3522e);
        dataOutput.writeByte(this.f3523f);
        dataOutput.writeByte(this.f3524g);
        dataOutput.writeInt(this.f3525h);
    }

    @Override // k.a.a.w.c, k.a.a.x.e
    public n c(i iVar) {
        return super.c(iVar);
    }

    @Override // k.a.a.w.c, k.a.a.x.e
    public int e(i iVar) {
        return iVar instanceof k.a.a.x.a ? x(iVar) : super.e(iVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f3522e == hVar.f3522e && this.f3523f == hVar.f3523f && this.f3524g == hVar.f3524g && this.f3525h == hVar.f3525h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.a.a.w.c, k.a.a.x.e
    public <R> R g(k<R> kVar) {
        if (kVar == j.e()) {
            return (R) b.NANOS;
        }
        if (kVar == j.c()) {
            return this;
        }
        if (kVar == j.a() || kVar == j.g() || kVar == j.f() || kVar == j.d() || kVar == j.b()) {
            return null;
        }
        return kVar.a(this);
    }

    public int hashCode() {
        long P = P();
        return (int) (P ^ (P >>> 32));
    }

    @Override // k.a.a.x.e
    public boolean j(i iVar) {
        return iVar instanceof k.a.a.x.a ? iVar.j() : iVar != null && iVar.c(this);
    }

    @Override // k.a.a.x.e
    public long l(i iVar) {
        return iVar instanceof k.a.a.x.a ? iVar == k.a.a.x.a.NANO_OF_DAY ? P() : iVar == k.a.a.x.a.MICRO_OF_DAY ? P() / 1000 : x(iVar) : iVar.g(this);
    }

    @Override // k.a.a.x.f
    public d s(d dVar) {
        return dVar.q(k.a.a.x.a.NANO_OF_DAY, P());
    }

    public l t(r rVar) {
        return l.w(this, rVar);
    }

    public String toString() {
        int i2;
        StringBuilder sb = new StringBuilder(18);
        byte b = this.f3522e;
        byte b2 = this.f3523f;
        byte b3 = this.f3524g;
        int i3 = this.f3525h;
        sb.append(b < 10 ? "0" : "");
        sb.append((int) b);
        String str = ":0";
        sb.append(b2 < 10 ? str : ":");
        sb.append((int) b2);
        if (b3 > 0 || i3 > 0) {
            if (b3 >= 10) {
                str = ":";
            }
            sb.append(str);
            sb.append((int) b3);
            if (i3 > 0) {
                sb.append('.');
                int i4 = 1000000;
                if (i3 % 1000000 == 0) {
                    i2 = (i3 / 1000000) + 1000;
                } else {
                    if (i3 % 1000 == 0) {
                        i3 /= 1000;
                    } else {
                        i4 = 1000000000;
                    }
                    i2 = i3 + i4;
                }
                sb.append(Integer.toString(i2).substring(1));
            }
        }
        return sb.toString();
    }

    /* renamed from: u */
    public int compareTo(h hVar) {
        int a2 = k.a.a.w.d.a(this.f3522e, hVar.f3522e);
        if (a2 != 0) {
            return a2;
        }
        int a3 = k.a.a.w.d.a(this.f3523f, hVar.f3523f);
        if (a3 != 0) {
            return a3;
        }
        int a4 = k.a.a.w.d.a(this.f3524g, hVar.f3524g);
        return a4 == 0 ? k.a.a.w.d.a(this.f3525h, hVar.f3525h) : a4;
    }

    public int y() {
        return this.f3522e;
    }

    public int z() {
        return this.f3523f;
    }
}

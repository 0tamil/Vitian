package k.a.a;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import k.a.a.w.d;
import k.a.a.x.a;
import k.a.a.x.e;
import k.a.a.x.f;
import k.a.a.x.i;
import k.a.a.x.j;
import k.a.a.x.k;
import k.a.a.x.m;
import k.a.a.x.n;
/* loaded from: classes.dex */
public final class r extends q implements e, f, Comparable<r>, Serializable {

    /* renamed from: g  reason: collision with root package name */
    private static final ConcurrentMap<Integer, r> f3548g = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: h  reason: collision with root package name */
    private static final ConcurrentMap<String, r> f3549h = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: i  reason: collision with root package name */
    public static final r f3550i = B(0);

    /* renamed from: j  reason: collision with root package name */
    public static final r f3551j = B(-64800);

    /* renamed from: k  reason: collision with root package name */
    public static final r f3552k = B(64800);

    /* renamed from: e  reason: collision with root package name */
    private final int f3553e;

    /* renamed from: f  reason: collision with root package name */
    private final transient String f3554f;

    private r(int i2) {
        this.f3553e = i2;
        this.f3554f = w(i2);
    }

    public static r A(int i2, int i3, int i4) {
        F(i2, i3, i4);
        return B(E(i2, i3, i4));
    }

    public static r B(int i2) {
        if (Math.abs(i2) > 64800) {
            throw new b("Zone offset not in valid range: -18:00 to +18:00");
        } else if (i2 % 900 != 0) {
            return new r(i2);
        } else {
            Integer valueOf = Integer.valueOf(i2);
            ConcurrentMap<Integer, r> concurrentMap = f3548g;
            r rVar = concurrentMap.get(valueOf);
            if (rVar != null) {
                return rVar;
            }
            concurrentMap.putIfAbsent(valueOf, new r(i2));
            r rVar2 = concurrentMap.get(valueOf);
            f3549h.putIfAbsent(rVar2.a(), rVar2);
            return rVar2;
        }
    }

    private static int C(CharSequence charSequence, int i2, boolean z) {
        if (!z || charSequence.charAt(i2 - 1) == ':') {
            char charAt = charSequence.charAt(i2);
            char charAt2 = charSequence.charAt(i2 + 1);
            if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9') {
                return ((charAt - '0') * 10) + (charAt2 - '0');
            }
            throw new b("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) charSequence));
        }
        throw new b("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) charSequence));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r D(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? B(dataInput.readInt()) : B(readByte * 900);
    }

    private static int E(int i2, int i3, int i4) {
        return (i2 * 3600) + (i3 * 60) + i4;
    }

    private static void F(int i2, int i3, int i4) {
        if (i2 < -18 || i2 > 18) {
            throw new b("Zone offset hours not in valid range: value " + i2 + " is not in the range -18 to 18");
        }
        if (i2 > 0) {
            if (i3 < 0 || i4 < 0) {
                throw new b("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i2 < 0) {
            if (i3 > 0 || i4 > 0) {
                throw new b("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i3 > 0 && i4 < 0) || (i3 < 0 && i4 > 0)) {
            throw new b("Zone offset minutes and seconds must have the same sign");
        }
        if (Math.abs(i3) > 59) {
            throw new b("Zone offset minutes not in valid range: abs(value) " + Math.abs(i3) + " is not in the range 0 to 59");
        } else if (Math.abs(i4) > 59) {
            throw new b("Zone offset seconds not in valid range: abs(value) " + Math.abs(i4) + " is not in the range 0 to 59");
        } else if (Math.abs(i2) != 18) {
        } else {
            if (Math.abs(i3) > 0 || Math.abs(i4) > 0) {
                throw new b("Zone offset not in valid range: -18:00 to +18:00");
            }
        }
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private static String w(int i2) {
        if (i2 == 0) {
            return "Z";
        }
        int abs = Math.abs(i2);
        StringBuilder sb = new StringBuilder();
        int i3 = abs / 3600;
        int i4 = (abs / 60) % 60;
        sb.append(i2 < 0 ? "-" : "+");
        sb.append(i3 < 10 ? "0" : "");
        sb.append(i3);
        String str = ":0";
        sb.append(i4 < 10 ? str : ":");
        sb.append(i4);
        int i5 = abs % 60;
        if (i5 != 0) {
            if (i5 >= 10) {
                str = ":";
            }
            sb.append(str);
            sb.append(i5);
        }
        return sb.toString();
    }

    private Object writeReplace() {
        return new n((byte) 8, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0099 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static r z(String str) {
        int i2;
        int i3;
        int i4;
        char charAt;
        d.i(str, "offsetId");
        r rVar = f3549h.get(str);
        if (rVar != null) {
            return rVar;
        }
        int length = str.length();
        if (length == 2) {
            str = str.charAt(0) + "0" + str.charAt(1);
        } else if (length != 3) {
            if (length == 5) {
                i4 = C(str, 1, false);
                i3 = C(str, 3, false);
            } else if (length != 6) {
                if (length == 7) {
                    i4 = C(str, 1, false);
                    i3 = C(str, 3, false);
                    i2 = C(str, 5, false);
                } else if (length == 9) {
                    i4 = C(str, 1, false);
                    i3 = C(str, 4, true);
                    i2 = C(str, 7, true);
                } else {
                    throw new b("Invalid ID for ZoneOffset, invalid format: " + str);
                }
                charAt = str.charAt(0);
                if (charAt != '+' || charAt == '-') {
                    return charAt == '-' ? A(-i4, -i3, -i2) : A(i4, i3, i2);
                }
                throw new b("Invalid ID for ZoneOffset, plus/minus not found when expected: " + str);
            } else {
                i4 = C(str, 1, false);
                i3 = C(str, 4, true);
            }
            i2 = 0;
            charAt = str.charAt(0);
            if (charAt != '+') {
            }
            if (charAt == '-') {
            }
        }
        i4 = C(str, 1, false);
        i3 = 0;
        i2 = 0;
        charAt = str.charAt(0);
        if (charAt != '+') {
        }
        if (charAt == '-') {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void G(DataOutput dataOutput) {
        int i2 = this.f3553e;
        int i3 = i2 % 900 == 0 ? i2 / 900 : 127;
        dataOutput.writeByte(i3);
        if (i3 == 127) {
            dataOutput.writeInt(i2);
        }
    }

    @Override // k.a.a.q
    public String a() {
        return this.f3554f;
    }

    @Override // k.a.a.x.e
    public n c(i iVar) {
        if (iVar == a.OFFSET_SECONDS) {
            return iVar.h();
        }
        if (!(iVar instanceof a)) {
            return iVar.k(this);
        }
        throw new m("Unsupported field: " + iVar);
    }

    @Override // k.a.a.q
    public k.a.a.y.f d() {
        return k.a.a.y.f.f(this);
    }

    @Override // k.a.a.x.e
    public int e(i iVar) {
        if (iVar == a.OFFSET_SECONDS) {
            return this.f3553e;
        }
        if (!(iVar instanceof a)) {
            return c(iVar).a(l(iVar), iVar);
        }
        throw new m("Unsupported field: " + iVar);
    }

    @Override // k.a.a.q
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && this.f3553e == ((r) obj).f3553e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.a.a.x.e
    public <R> R g(k<R> kVar) {
        if (kVar == j.d() || kVar == j.f()) {
            return this;
        }
        if (kVar == j.b() || kVar == j.c() || kVar == j.e() || kVar == j.a() || kVar == j.g()) {
            return null;
        }
        return kVar.a(this);
    }

    @Override // k.a.a.q
    public int hashCode() {
        return this.f3553e;
    }

    @Override // k.a.a.x.e
    public boolean j(i iVar) {
        return iVar instanceof a ? iVar == a.OFFSET_SECONDS : iVar != null && iVar.c(this);
    }

    @Override // k.a.a.x.e
    public long l(i iVar) {
        if (iVar == a.OFFSET_SECONDS) {
            return this.f3553e;
        }
        if (!(iVar instanceof a)) {
            return iVar.g(this);
        }
        throw new b("Unsupported field: " + iVar);
    }

    @Override // k.a.a.x.f
    public k.a.a.x.d s(k.a.a.x.d dVar) {
        return dVar.q(a.OFFSET_SECONDS, this.f3553e);
    }

    @Override // k.a.a.q
    public String toString() {
        return this.f3554f;
    }

    @Override // k.a.a.q
    void v(DataOutput dataOutput) {
        dataOutput.writeByte(8);
        G(dataOutput);
    }

    /* renamed from: x */
    public int compareTo(r rVar) {
        return rVar.f3553e - this.f3553e;
    }

    public int y() {
        return this.f3553e;
    }
}

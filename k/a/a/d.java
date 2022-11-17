package k.a.a;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.regex.Pattern;
import k.a.a.x.b;
import k.a.a.x.h;
/* loaded from: classes.dex */
public final class d implements h, Comparable<d>, Serializable {

    /* renamed from: g  reason: collision with root package name */
    public static final d f3503g = new d(0, 0);

    /* renamed from: e  reason: collision with root package name */
    private final long f3504e;

    /* renamed from: f  reason: collision with root package name */
    private final int f3505f;

    static {
        BigInteger.valueOf(1000000000L);
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);
    }

    private d(long j2, int i2) {
        this.f3504e = j2;
        this.f3505f = i2;
    }

    private static d d(long j2, int i2) {
        return (((long) i2) | j2) == 0 ? f3503g : new d(j2, i2);
    }

    public static d g(long j2) {
        long j3 = j2 / 1000000000;
        int i2 = (int) (j2 % 1000000000);
        if (i2 < 0) {
            i2 += 1000000000;
            j3--;
        }
        return d(j3, i2);
    }

    public static d h(long j2) {
        return d(j2, 0);
    }

    public static d j(long j2, long j3) {
        return d(k.a.a.w.d.k(j2, k.a.a.w.d.e(j3, 1000000000L)), k.a.a.w.d.g(j3, 1000000000));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d k(DataInput dataInput) {
        return j(dataInput.readLong(), dataInput.readInt());
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 1, this);
    }

    @Override // k.a.a.x.h
    public k.a.a.x.d a(k.a.a.x.d dVar) {
        long j2 = this.f3504e;
        if (j2 != 0) {
            dVar = dVar.r(j2, b.SECONDS);
        }
        int i2 = this.f3505f;
        return i2 != 0 ? dVar.r(i2, b.NANOS) : dVar;
    }

    /* renamed from: c */
    public int compareTo(d dVar) {
        int b = k.a.a.w.d.b(this.f3504e, dVar.f3504e);
        return b != 0 ? b : this.f3505f - dVar.f3505f;
    }

    public long e() {
        return this.f3504e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f3504e == dVar.f3504e && this.f3505f == dVar.f3505f;
    }

    public int hashCode() {
        long j2 = this.f3504e;
        return ((int) (j2 ^ (j2 >>> 32))) + (this.f3505f * 51);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(DataOutput dataOutput) {
        dataOutput.writeLong(this.f3504e);
        dataOutput.writeInt(this.f3505f);
    }

    public String toString() {
        if (this == f3503g) {
            return "PT0S";
        }
        long j2 = this.f3504e;
        long j3 = j2 / 3600;
        int i2 = (int) ((j2 % 3600) / 60);
        int i3 = (int) (j2 % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j3 != 0) {
            sb.append(j3);
            sb.append('H');
        }
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        if (i3 == 0 && this.f3505f == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (i3 >= 0 || this.f3505f <= 0) {
            sb.append(i3);
        } else if (i3 == -1) {
            sb.append("-0");
        } else {
            sb.append(i3 + 1);
        }
        if (this.f3505f > 0) {
            int length = sb.length();
            sb.append(i3 < 0 ? 2000000000 - this.f3505f : this.f3505f + 1000000000);
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }
}

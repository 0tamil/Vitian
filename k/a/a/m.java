package k.a.a;

import java.io.Serializable;
import java.util.regex.Pattern;
import k.a.a.u.e;
import k.a.a.x.b;
import k.a.a.x.d;
/* loaded from: classes.dex */
public final class m extends e implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    public static final m f3539h = new m(0, 0, 0);

    /* renamed from: e  reason: collision with root package name */
    private final int f3540e;

    /* renamed from: f  reason: collision with root package name */
    private final int f3541f;

    /* renamed from: g  reason: collision with root package name */
    private final int f3542g;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
    }

    private m(int i2, int i3, int i4) {
        this.f3540e = i2;
        this.f3541f = i3;
        this.f3542g = i4;
    }

    private static m b(int i2, int i3, int i4) {
        return ((i2 | i3) | i4) == 0 ? f3539h : new m(i2, i3, i4);
    }

    public static m d(int i2) {
        return b(0, 0, i2);
    }

    private Object readResolve() {
        return ((this.f3540e | this.f3541f) | this.f3542g) == 0 ? f3539h : this;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // k.a.a.x.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d a(d dVar) {
        b bVar;
        long j2;
        k.a.a.w.d.i(dVar, "temporal");
        int i2 = this.f3540e;
        if (i2 == 0) {
            int i3 = this.f3541f;
            if (i3 != 0) {
                j2 = i3;
            }
            int i4 = this.f3542g;
            if (i4 != 0) {
            }
        } else if (this.f3541f != 0) {
            j2 = e();
        } else {
            j2 = i2;
            bVar = b.YEARS;
            dVar = dVar.r(j2, bVar);
            int i42 = this.f3542g;
            return i42 != 0 ? dVar.r(i42, b.DAYS) : dVar;
        }
        bVar = b.MONTHS;
        dVar = dVar.r(j2, bVar);
        int i422 = this.f3542g;
        if (i422 != 0) {
        }
    }

    public boolean c() {
        return this == f3539h;
    }

    public long e() {
        return (this.f3540e * 12) + this.f3541f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f3540e == mVar.f3540e && this.f3541f == mVar.f3541f && this.f3542g == mVar.f3542g;
    }

    public int hashCode() {
        return this.f3540e + Integer.rotateLeft(this.f3541f, 8) + Integer.rotateLeft(this.f3542g, 16);
    }

    public String toString() {
        if (this == f3539h) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('P');
        int i2 = this.f3540e;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('Y');
        }
        int i3 = this.f3541f;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('M');
        }
        int i4 = this.f3542g;
        if (i4 != 0) {
            sb.append(i4);
            sb.append('D');
        }
        return sb.toString();
    }
}

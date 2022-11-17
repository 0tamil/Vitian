package k.a.a.x;

import java.io.Serializable;
import k.a.a.b;
/* loaded from: classes.dex */
public final class n implements Serializable {

    /* renamed from: e  reason: collision with root package name */
    private final long f3737e;

    /* renamed from: f  reason: collision with root package name */
    private final long f3738f;

    /* renamed from: g  reason: collision with root package name */
    private final long f3739g;

    /* renamed from: h  reason: collision with root package name */
    private final long f3740h;

    private n(long j2, long j3, long j4, long j5) {
        this.f3737e = j2;
        this.f3738f = j3;
        this.f3739g = j4;
        this.f3740h = j5;
    }

    public static n i(long j2, long j3) {
        if (j2 <= j3) {
            return new n(j2, j2, j3, j3);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    public static n j(long j2, long j3, long j4) {
        return k(j2, j2, j3, j4);
    }

    public static n k(long j2, long j3, long j4, long j5) {
        if (j2 > j3) {
            throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
        } else if (j4 > j5) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        } else if (j3 <= j5) {
            return new n(j2, j3, j4, j5);
        } else {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
    }

    public int a(long j2, i iVar) {
        if (g(j2)) {
            return (int) j2;
        }
        throw new b("Invalid int value for " + iVar + ": " + j2);
    }

    public long b(long j2, i iVar) {
        if (h(j2)) {
            return j2;
        }
        if (iVar != null) {
            throw new b("Invalid value for " + iVar + " (valid values " + this + "): " + j2);
        }
        throw new b("Invalid value (valid values " + this + "): " + j2);
    }

    public long c() {
        return this.f3740h;
    }

    public long d() {
        return this.f3737e;
    }

    public boolean e() {
        return this.f3737e == this.f3738f && this.f3739g == this.f3740h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f3737e == nVar.f3737e && this.f3738f == nVar.f3738f && this.f3739g == nVar.f3739g && this.f3740h == nVar.f3740h;
    }

    public boolean f() {
        return d() >= -2147483648L && c() <= 2147483647L;
    }

    public boolean g(long j2) {
        return f() && h(j2);
    }

    public boolean h(long j2) {
        return j2 >= d() && j2 <= c();
    }

    public int hashCode() {
        long j2 = this.f3737e;
        long j3 = this.f3738f;
        long j4 = this.f3739g;
        long j5 = this.f3740h;
        long j6 = ((((((j2 + j3) << ((int) (j3 + 16))) >> ((int) (j4 + 48))) << ((int) (j4 + 32))) >> ((int) (32 + j5))) << ((int) (j5 + 48))) >> 16;
        return (int) (j6 ^ (j6 >>> 32));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3737e);
        if (this.f3737e != this.f3738f) {
            sb.append('/');
            sb.append(this.f3738f);
        }
        sb.append(" - ");
        sb.append(this.f3739g);
        if (this.f3739g != this.f3740h) {
            sb.append('/');
            sb.append(this.f3740h);
        }
        return sb.toString();
    }
}

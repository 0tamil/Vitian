package f.b.c;

import f.b.c.z.a;
import f.b.c.z.g;
import java.math.BigInteger;
/* loaded from: classes.dex */
public final class p extends k {
    private final Object a;

    public p(Boolean bool) {
        a.b(bool);
        this.a = bool;
    }

    public p(Number number) {
        a.b(number);
        this.a = number;
    }

    public p(String str) {
        a.b(str);
        this.a = str;
    }

    private static boolean v(p pVar) {
        Object obj = pVar.a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.a == null) {
            return pVar.a == null;
        }
        if (v(this) && v(pVar)) {
            return t().longValue() == pVar.t().longValue();
        }
        Object obj2 = this.a;
        if (!(obj2 instanceof Number) || !(pVar.a instanceof Number)) {
            return obj2.equals(pVar.a);
        }
        double doubleValue = t().doubleValue();
        double doubleValue2 = pVar.t().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.a == null) {
            return 31;
        }
        if (v(this)) {
            doubleToLongBits = t().longValue();
        } else {
            Object obj = this.a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(t().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    @Override // f.b.c.k
    public String k() {
        return w() ? t().toString() : u() ? ((Boolean) this.a).toString() : (String) this.a;
    }

    public boolean p() {
        return u() ? ((Boolean) this.a).booleanValue() : Boolean.parseBoolean(k());
    }

    public double q() {
        return w() ? t().doubleValue() : Double.parseDouble(k());
    }

    public int r() {
        return w() ? t().intValue() : Integer.parseInt(k());
    }

    public long s() {
        return w() ? t().longValue() : Long.parseLong(k());
    }

    public Number t() {
        Object obj = this.a;
        return obj instanceof String ? new g((String) this.a) : (Number) obj;
    }

    public boolean u() {
        return this.a instanceof Boolean;
    }

    public boolean w() {
        return this.a instanceof Number;
    }

    public boolean x() {
        return this.a instanceof String;
    }
}

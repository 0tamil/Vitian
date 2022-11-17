package f.b.c.z;

import java.math.BigDecimal;
/* loaded from: classes.dex */
public final class g extends Number {

    /* renamed from: e  reason: collision with root package name */
    private final String f2724e;

    public g(String str) {
        this.f2724e = str;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f2724e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        String str = this.f2724e;
        String str2 = ((g) obj).f2724e;
        return str == str2 || str.equals(str2);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f2724e);
    }

    public int hashCode() {
        return this.f2724e.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f2724e);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f2724e);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.f2724e).intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f2724e);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f2724e).longValue();
        }
    }

    public String toString() {
        return this.f2724e;
    }
}

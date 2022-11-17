package k.a.a;

import e.a.j;
import k.a.a.u.h;
import k.a.a.x.b;
import k.a.a.x.d;
import k.a.a.x.e;
import k.a.a.x.f;
import k.a.a.x.k;
import k.a.a.x.m;
import k.a.a.x.n;
/* loaded from: classes.dex */
public enum i implements e, f {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;
    
    private static final i[] q = values();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[i.values().length];
            a = iArr;
            try {
                iArr[i.FEBRUARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[i.APRIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[i.JUNE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[i.SEPTEMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[i.NOVEMBER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[i.JANUARY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[i.MARCH.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[i.MAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[i.JULY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[i.AUGUST.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[i.OCTOBER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[i.DECEMBER.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public static i u(int i2) {
        if (i2 >= 1 && i2 <= 12) {
            return q[i2 - 1];
        }
        throw new b("Invalid value for MonthOfYear: " + i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int a(boolean z) {
        switch (a.a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z ? 1 : 0) + 91;
            case 3:
                return z + 152;
            case 4:
                return z + 244;
            case 5:
                return z + 305;
            case 6:
                return 1;
            case 7:
                return z + 60;
            case 8:
                return z + j.D0;
            case 9:
                return z + 182;
            case 10:
                return z + 213;
            case 11:
                return z + 274;
            default:
                return z + 335;
        }
    }

    @Override // k.a.a.x.e
    public n c(k.a.a.x.i iVar) {
        if (iVar == k.a.a.x.a.MONTH_OF_YEAR) {
            return iVar.h();
        }
        if (!(iVar instanceof k.a.a.x.a)) {
            return iVar.k(this);
        }
        throw new m("Unsupported field: " + iVar);
    }

    public int d(boolean z) {
        int i2 = a.a[ordinal()];
        return i2 != 1 ? (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) ? 30 : 31 : z ? 29 : 28;
    }

    @Override // k.a.a.x.e
    public int e(k.a.a.x.i iVar) {
        return iVar == k.a.a.x.a.MONTH_OF_YEAR ? getValue() : c(iVar).a(l(iVar), iVar);
    }

    @Override // k.a.a.x.e
    public <R> R g(k<R> kVar) {
        if (kVar == k.a.a.x.j.a()) {
            return (R) k.a.a.u.m.f3582g;
        }
        if (kVar == k.a.a.x.j.e()) {
            return (R) b.MONTHS;
        }
        if (kVar == k.a.a.x.j.b() || kVar == k.a.a.x.j.c() || kVar == k.a.a.x.j.f() || kVar == k.a.a.x.j.g() || kVar == k.a.a.x.j.d()) {
            return null;
        }
        return kVar.a(this);
    }

    public int getValue() {
        return ordinal() + 1;
    }

    @Override // k.a.a.x.e
    public boolean j(k.a.a.x.i iVar) {
        return iVar instanceof k.a.a.x.a ? iVar == k.a.a.x.a.MONTH_OF_YEAR : iVar != null && iVar.c(this);
    }

    @Override // k.a.a.x.e
    public long l(k.a.a.x.i iVar) {
        if (iVar == k.a.a.x.a.MONTH_OF_YEAR) {
            return getValue();
        }
        if (!(iVar instanceof k.a.a.x.a)) {
            return iVar.g(this);
        }
        throw new m("Unsupported field: " + iVar);
    }

    public int p() {
        int i2 = a.a[ordinal()];
        if (i2 != 1) {
            return (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) ? 30 : 31;
        }
        return 29;
    }

    @Override // k.a.a.x.f
    public d s(d dVar) {
        if (h.j(dVar).equals(k.a.a.u.m.f3582g)) {
            return dVar.q(k.a.a.x.a.MONTH_OF_YEAR, getValue());
        }
        throw new b("Adjustment only supported on ISO date-time");
    }

    public int t() {
        int i2 = a.a[ordinal()];
        if (i2 != 1) {
            return (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) ? 30 : 31;
        }
        return 28;
    }

    public i v(long j2) {
        return q[(ordinal() + (((int) (j2 % 12)) + 12)) % 12];
    }
}

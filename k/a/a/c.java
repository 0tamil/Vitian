package k.a.a;

import k.a.a.x.a;
import k.a.a.x.b;
import k.a.a.x.d;
import k.a.a.x.e;
import k.a.a.x.f;
import k.a.a.x.i;
import k.a.a.x.j;
import k.a.a.x.k;
import k.a.a.x.m;
import k.a.a.x.n;
/* loaded from: classes.dex */
public enum c implements e, f {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    
    private static final c[] l = values();

    public static c a(int i2) {
        if (i2 >= 1 && i2 <= 7) {
            return l[i2 - 1];
        }
        throw new b("Invalid value for DayOfWeek: " + i2);
    }

    @Override // k.a.a.x.e
    public n c(i iVar) {
        if (iVar == a.DAY_OF_WEEK) {
            return iVar.h();
        }
        if (!(iVar instanceof a)) {
            return iVar.k(this);
        }
        throw new m("Unsupported field: " + iVar);
    }

    @Override // k.a.a.x.e
    public int e(i iVar) {
        return iVar == a.DAY_OF_WEEK ? getValue() : c(iVar).a(l(iVar), iVar);
    }

    @Override // k.a.a.x.e
    public <R> R g(k<R> kVar) {
        if (kVar == j.e()) {
            return (R) b.DAYS;
        }
        if (kVar == j.b() || kVar == j.c() || kVar == j.a() || kVar == j.f() || kVar == j.g() || kVar == j.d()) {
            return null;
        }
        return kVar.a(this);
    }

    public int getValue() {
        return ordinal() + 1;
    }

    @Override // k.a.a.x.e
    public boolean j(i iVar) {
        return iVar instanceof a ? iVar == a.DAY_OF_WEEK : iVar != null && iVar.c(this);
    }

    @Override // k.a.a.x.e
    public long l(i iVar) {
        if (iVar == a.DAY_OF_WEEK) {
            return getValue();
        }
        if (!(iVar instanceof a)) {
            return iVar.g(this);
        }
        throw new m("Unsupported field: " + iVar);
    }

    @Override // k.a.a.x.f
    public d s(d dVar) {
        return dVar.q(a.DAY_OF_WEEK, getValue());
    }
}

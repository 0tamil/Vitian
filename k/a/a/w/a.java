package k.a.a.w;

import k.a.a.u.i;
import k.a.a.x.b;
import k.a.a.x.d;
import k.a.a.x.j;
import k.a.a.x.k;
import k.a.a.x.m;
/* loaded from: classes.dex */
public abstract class a extends c implements i {
    @Override // k.a.a.w.c, k.a.a.x.e
    public int e(k.a.a.x.i iVar) {
        return iVar == k.a.a.x.a.ERA ? getValue() : c(iVar).a(l(iVar), iVar);
    }

    @Override // k.a.a.w.c, k.a.a.x.e
    public <R> R g(k<R> kVar) {
        if (kVar == j.e()) {
            return (R) b.ERAS;
        }
        if (kVar == j.a() || kVar == j.f() || kVar == j.g() || kVar == j.d() || kVar == j.b() || kVar == j.c()) {
            return null;
        }
        return kVar.a(this);
    }

    @Override // k.a.a.x.e
    public boolean j(k.a.a.x.i iVar) {
        return iVar instanceof k.a.a.x.a ? iVar == k.a.a.x.a.ERA : iVar != null && iVar.c(this);
    }

    @Override // k.a.a.x.e
    public long l(k.a.a.x.i iVar) {
        if (iVar == k.a.a.x.a.ERA) {
            return getValue();
        }
        if (!(iVar instanceof k.a.a.x.a)) {
            return iVar.g(this);
        }
        throw new m("Unsupported field: " + iVar);
    }

    @Override // k.a.a.x.f
    public d s(d dVar) {
        return dVar.q(k.a.a.x.a.ERA, getValue());
    }
}

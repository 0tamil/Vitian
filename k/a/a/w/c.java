package k.a.a.w;

import k.a.a.x.a;
import k.a.a.x.e;
import k.a.a.x.i;
import k.a.a.x.j;
import k.a.a.x.k;
import k.a.a.x.m;
import k.a.a.x.n;
/* loaded from: classes.dex */
public abstract class c implements e {
    @Override // k.a.a.x.e
    public n c(i iVar) {
        if (!(iVar instanceof a)) {
            return iVar.k(this);
        }
        if (j(iVar)) {
            return iVar.h();
        }
        throw new m("Unsupported field: " + iVar);
    }

    @Override // k.a.a.x.e
    public int e(i iVar) {
        return c(iVar).a(l(iVar), iVar);
    }

    @Override // k.a.a.x.e
    public <R> R g(k<R> kVar) {
        if (kVar == j.g() || kVar == j.a() || kVar == j.e()) {
            return null;
        }
        return kVar.a(this);
    }
}

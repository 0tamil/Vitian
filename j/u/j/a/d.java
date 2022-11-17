package j.u.j.a;

import j.u.e;
import j.u.g;
import j.x.d.i;
/* loaded from: classes.dex */
public abstract class d extends a {
    private final g _context;
    private transient j.u.d<Object> intercepted;

    public d(j.u.d<Object> dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }

    public d(j.u.d<Object> dVar, g gVar) {
        super(dVar);
        this._context = gVar;
    }

    @Override // j.u.d
    public g getContext() {
        g gVar = this._context;
        i.b(gVar);
        return gVar;
    }

    public final j.u.d<Object> intercepted() {
        j.u.d<Object> dVar = this.intercepted;
        if (dVar == null) {
            e eVar = (e) getContext().get(e.b);
            if (eVar == null || (dVar = eVar.i(this)) == null) {
                dVar = this;
            }
            this.intercepted = dVar;
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j.u.j.a.a
    public void releaseIntercepted() {
        j.u.d<?> dVar = this.intercepted;
        if (!(dVar == null || dVar == this)) {
            g.b bVar = getContext().get(e.b);
            i.b(bVar);
            ((e) bVar).c(dVar);
        }
        this.intercepted = c.f3472e;
    }
}

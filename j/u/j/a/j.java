package j.u.j.a;

import j.u.d;
import j.u.g;
import j.u.h;
/* loaded from: classes.dex */
public abstract class j extends a {
    public j(d<Object> dVar) {
        super(dVar);
        if (dVar != null) {
            if (!(dVar.getContext() == h.f3461e)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // j.u.d
    public g getContext() {
        return h.f3461e;
    }
}

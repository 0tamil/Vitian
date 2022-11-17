package kotlinx.coroutines.j2;

import j.r;
import j.x.c.l;
import j.x.d.i;
import kotlinx.coroutines.internal.z;
/* loaded from: classes.dex */
public class n<E> extends a<E> {
    public n(l<? super E, r> lVar) {
        super(lVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.j2.c
    public Object i(E e2) {
        q<?> k2;
        do {
            Object i2 = super.i(e2);
            z zVar = b.b;
            if (i2 == zVar) {
                return zVar;
            }
            if (i2 == b.c) {
                k2 = k(e2);
                if (k2 == null) {
                    return zVar;
                }
            } else if (i2 instanceof j) {
                return i2;
            } else {
                throw new IllegalStateException(i.i("Invalid offerInternal result ", i2).toString());
            }
        } while (!(k2 instanceof j));
        return k2;
    }

    @Override // kotlinx.coroutines.j2.a
    protected final boolean r() {
        return true;
    }

    @Override // kotlinx.coroutines.j2.a
    protected final boolean s() {
        return true;
    }
}

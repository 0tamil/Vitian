package kotlinx.coroutines.j2;

import j.r;
import j.x.c.l;
/* loaded from: classes.dex */
public final class h {
    public static final <E> f<E> a(int i2, e eVar, l<? super E, r> lVar) {
        int i3 = 1;
        if (i2 == -2) {
            if (eVar == e.SUSPEND) {
                i3 = f.a.a();
            }
            return new d(i3, eVar, lVar);
        } else if (i2 != -1) {
            return i2 != 0 ? i2 != Integer.MAX_VALUE ? (i2 == 1 && eVar == e.DROP_OLDEST) ? new m(lVar) : new d(i2, eVar, lVar) : new n(lVar) : eVar == e.SUSPEND ? new r(lVar) : new d(1, eVar, lVar);
        } else {
            if (eVar != e.SUSPEND) {
                i3 = 0;
            }
            if (i3 != 0) {
                return new m(lVar);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
    }

    public static /* synthetic */ f b(int i2, e eVar, l lVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        if ((i3 & 2) != 0) {
            eVar = e.SUSPEND;
        }
        if ((i3 & 4) != 0) {
            lVar = null;
        }
        return a(i2, eVar, lVar);
    }
}

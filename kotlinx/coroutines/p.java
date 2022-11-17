package kotlinx.coroutines;

import j.u.d;
import kotlinx.coroutines.internal.g;
/* loaded from: classes.dex */
public final class p {
    public static final <T> n<T> a(d<? super T> dVar) {
        if (!(dVar instanceof g)) {
            return new n<>(dVar, 1);
        }
        n<T> l = ((g) dVar).l();
        l = null;
        if (l == null || !l.G()) {
        }
        return l == null ? new n<>(dVar, 2) : l;
    }
}

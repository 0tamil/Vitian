package kotlinx.coroutines;

import j.r;
import j.u.d;
import j.x.c.l;
/* loaded from: classes.dex */
public interface m<T> extends d<T> {

    /* loaded from: classes.dex */
    public static final class a {
        public static /* synthetic */ Object a(m mVar, Object obj, Object obj2, int i2, Object obj3) {
            if (obj3 == null) {
                if ((i2 & 2) != 0) {
                    obj2 = null;
                }
                return mVar.e(obj, obj2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryResume");
        }
    }

    Object a(T t, Object obj, l<? super Throwable, r> lVar);

    Object e(T t, Object obj);

    void j(l<? super Throwable, r> lVar);

    void k(T t, l<? super Throwable, r> lVar);

    Object m(Throwable th);

    void p(Object obj);
}

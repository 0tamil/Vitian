package j;

import j.l;
import j.x.d.i;
/* loaded from: classes.dex */
public final class m {
    public static final Object a(Throwable th) {
        i.d(th, "exception");
        return new l.b(th);
    }

    public static final void b(Object obj) {
        if (obj instanceof l.b) {
            throw ((l.b) obj).f3446e;
        }
    }
}

package kotlinx.coroutines;

import j.l;
import j.m;
import j.u.d;
import kotlinx.coroutines.internal.g;
/* loaded from: classes.dex */
public final class p0 {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(d<?> dVar) {
        String str;
        if (dVar instanceof g) {
            return dVar.toString();
        }
        try {
            l.a aVar = l.f3445e;
            String str2 = dVar + '@' + b(dVar);
            l.a(str2);
            str = str2;
        } catch (Throwable th) {
            l.a aVar2 = l.f3445e;
            Object a = m.a(th);
            l.a(a);
            str = a;
        }
        Throwable b = l.b(str);
        String str3 = str;
        if (b != null) {
            str3 = ((Object) dVar.getClass().getName()) + '@' + b(dVar);
        }
        return (String) str3;
    }
}

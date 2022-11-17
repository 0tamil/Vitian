package kotlinx.coroutines.internal;

import j.l;
import j.m;
/* loaded from: classes.dex */
public final class k {
    private static final boolean a;

    static {
        Object obj;
        try {
            l.a aVar = l.f3445e;
            obj = Class.forName("android.os.Build");
            l.a(obj);
        } catch (Throwable th) {
            l.a aVar2 = l.f3445e;
            obj = m.a(th);
            l.a(obj);
        }
        a = l.d(obj);
    }

    public static final boolean a() {
        return a;
    }
}

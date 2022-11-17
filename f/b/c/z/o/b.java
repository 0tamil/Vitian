package f.b.c.z.o;

import f.b.c.z.e;
import java.lang.reflect.AccessibleObject;
/* loaded from: classes.dex */
public abstract class b {
    private static final b a;

    static {
        a = e.c() < 9 ? new a() : new c();
    }

    public static b a() {
        return a;
    }

    public abstract void b(AccessibleObject accessibleObject);
}

package j.x.d;

import j.a0.c;
import j.a0.d;
import j.a0.e;
/* loaded from: classes.dex */
public class l {
    private static final m a;
    private static final c[] b;

    static {
        m mVar = null;
        try {
            mVar = (m) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (mVar == null) {
            mVar = new m();
        }
        a = mVar;
        b = new c[0];
    }

    public static e a(g gVar) {
        a.a(gVar);
        return gVar;
    }

    public static c b(Class cls) {
        return a.b(cls);
    }

    public static d c(Class cls) {
        return a.c(cls, "");
    }

    public static String d(f fVar) {
        return a.d(fVar);
    }

    public static String e(j jVar) {
        return a.e(jVar);
    }
}

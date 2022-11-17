package f.b.b.a.w;

import f.b.b.a.y.j0;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class c {
    @Deprecated
    public static final j0 a = j0.O();

    static {
        new b().c();
        try {
            a();
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    @Deprecated
    public static void a() {
        b();
    }

    public static void b() {
        b.m(true);
        a.n(true);
        d.e();
    }
}

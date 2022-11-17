package f.d.a;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import k.a.a.y.h;
/* loaded from: classes.dex */
public final class a {
    private static final AtomicBoolean a = new AtomicBoolean();

    public static void a(Context context) {
        b(context, "org/threeten/bp/TZDB.dat");
    }

    public static void b(Context context, String str) {
        if (!a.getAndSet(true)) {
            h.c(new b(context, str));
        }
    }
}

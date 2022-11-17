package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicLong;
import kotlinx.coroutines.internal.a0;
/* loaded from: classes.dex */
public final class o0 {
    private static final boolean a = false;
    private static final boolean b;
    private static final boolean c;

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicLong f3913d;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r0.equals("auto") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
        if (r0.equals("on") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
        if (r0.equals("") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
        r0 = true;
     */
    static {
        boolean z;
        String d2 = a0.d("kotlinx.coroutines.debug");
        boolean z2 = false;
        if (d2 != null) {
            int hashCode = d2.hashCode();
            if (hashCode != 0) {
                if (hashCode != 3551) {
                    if (hashCode != 109935) {
                        if (hashCode == 3005871) {
                        }
                    } else if (d2.equals("off")) {
                        z = false;
                    }
                }
                throw new IllegalStateException(("System property 'kotlinx.coroutines.debug' has unrecognized value '" + ((Object) d2) + '\'').toString());
            }
            b = z;
            if (z && a0.e("kotlinx.coroutines.stacktrace.recovery", true)) {
                z2 = true;
            }
            c = z2;
            f3913d = new AtomicLong(0L);
        }
        z = a();
        b = z;
        if (z) {
            z2 = true;
        }
        c = z2;
        f3913d = new AtomicLong(0L);
    }

    public static final boolean a() {
        return a;
    }

    public static final AtomicLong b() {
        return f3913d;
    }

    public static final boolean c() {
        return b;
    }

    public static final boolean d() {
        return c;
    }
}

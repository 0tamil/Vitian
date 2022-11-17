package h.a.e;

import java.util.Objects;
/* loaded from: classes.dex */
public final class b {
    public static <T> T a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    public static void b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}

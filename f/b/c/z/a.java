package f.b.c.z;

import java.util.Objects;
/* loaded from: classes.dex */
public final class a {
    public static void a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static <T> T b(T t) {
        Objects.requireNonNull(t);
        return t;
    }
}

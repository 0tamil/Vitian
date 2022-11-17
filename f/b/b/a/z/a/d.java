package f.b.b.a.z.a;
/* loaded from: classes.dex */
final class d {
    private static final Class<?> a = a("libcore.io.Memory");
    private static final boolean b;

    static {
        b = a("org.robolectric.Robolectric") != null;
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Class<?> b() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c() {
        return a != null && !b;
    }
}

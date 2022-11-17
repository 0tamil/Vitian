package f.b.b.a.z.a;
/* loaded from: classes.dex */
final class z0 {
    private static final x0 a = c();
    private static final x0 b = new y0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static x0 a() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static x0 b() {
        return b;
    }

    private static x0 c() {
        try {
            return (x0) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}

package f.b.b.a.z.a;
/* loaded from: classes.dex */
final class t {
    private static final r<?> a = new s();
    private static final r<?> b = c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r<?> a() {
        r<?> rVar = b;
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r<?> b() {
        return a;
    }

    private static r<?> c() {
        try {
            return (r) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}

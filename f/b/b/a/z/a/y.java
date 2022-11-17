package f.b.b.a.z.a;
/* loaded from: classes.dex */
class y implements r0 {
    private static final y a = new y();

    private y() {
    }

    public static y c() {
        return a;
    }

    @Override // f.b.b.a.z.a.r0
    public boolean a(Class<?> cls) {
        return z.class.isAssignableFrom(cls);
    }

    @Override // f.b.b.a.z.a.r0
    public q0 b(Class<?> cls) {
        if (z.class.isAssignableFrom(cls)) {
            try {
                return (q0) z.y(cls.asSubclass(z.class)).r();
            } catch (Exception e2) {
                throw new RuntimeException("Unable to get message info for " + cls.getName(), e2);
            }
        } else {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
    }
}

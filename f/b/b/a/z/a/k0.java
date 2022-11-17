package f.b.b.a.z.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class k0 implements i1 {
    private static final r0 b = new a();
    private final r0 a;

    /* loaded from: classes.dex */
    class a implements r0 {
        a() {
        }

        @Override // f.b.b.a.z.a.r0
        public boolean a(Class<?> cls) {
            return false;
        }

        @Override // f.b.b.a.z.a.r0
        public q0 b(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements r0 {
        private r0[] a;

        b(r0... r0VarArr) {
            this.a = r0VarArr;
        }

        @Override // f.b.b.a.z.a.r0
        public boolean a(Class<?> cls) {
            for (r0 r0Var : this.a) {
                if (r0Var.a(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // f.b.b.a.z.a.r0
        public q0 b(Class<?> cls) {
            r0[] r0VarArr;
            for (r0 r0Var : this.a) {
                if (r0Var.a(cls)) {
                    return r0Var.b(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }
    }

    public k0() {
        this(b());
    }

    private k0(r0 r0Var) {
        b0.b(r0Var, "messageInfoFactory");
        this.a = r0Var;
    }

    private static r0 b() {
        return new b(y.c(), c());
    }

    private static r0 c() {
        try {
            return (r0) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return b;
        }
    }

    private static boolean d(q0 q0Var) {
        return q0Var.a() == c1.PROTO2;
    }

    private static <T> h1<T> e(Class<T> cls, q0 q0Var) {
        return z.class.isAssignableFrom(cls) ? d(q0Var) ? v0.R(cls, q0Var, z0.b(), i0.b(), j1.M(), t.b(), p0.b()) : v0.R(cls, q0Var, z0.b(), i0.b(), j1.M(), null, p0.b()) : d(q0Var) ? v0.R(cls, q0Var, z0.a(), i0.a(), j1.H(), t.a(), p0.a()) : v0.R(cls, q0Var, z0.a(), i0.a(), j1.I(), null, p0.a());
    }

    @Override // f.b.b.a.z.a.i1
    public <T> h1<T> a(Class<T> cls) {
        o1<?, ?> H;
        r<?> a2;
        j1.J(cls);
        q0 b2 = this.a.b(cls);
        if (!b2.c()) {
            return e(cls, b2);
        }
        if (z.class.isAssignableFrom(cls)) {
            H = j1.M();
            a2 = t.b();
        } else {
            H = j1.H();
            a2 = t.a();
        }
        return w0.m(H, a2, b2.b());
    }
}

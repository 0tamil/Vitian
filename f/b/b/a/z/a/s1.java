package f.b.b.a.z.a;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
/* loaded from: classes.dex */
final class s1 {
    private static final Logger a = Logger.getLogger(s1.class.getName());
    private static final Unsafe b = B();
    private static final Class<?> c = f.b.b.a.z.a.d.b();

    /* renamed from: d  reason: collision with root package name */
    private static final boolean f2589d = m(Long.TYPE);

    /* renamed from: e  reason: collision with root package name */
    private static final boolean f2590e = m(Integer.TYPE);

    /* renamed from: f  reason: collision with root package name */
    private static final e f2591f = z();

    /* renamed from: g  reason: collision with root package name */
    private static final boolean f2592g = Q();

    /* renamed from: h  reason: collision with root package name */
    private static final boolean f2593h = P();

    /* renamed from: i  reason: collision with root package name */
    static final long f2594i = j(byte[].class);

    /* renamed from: j  reason: collision with root package name */
    static final boolean f2595j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements PrivilegedExceptionAction<Unsafe> {
        a() {
        }

        /* renamed from: a */
        public Unsafe run() {
            Field[] declaredFields;
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // f.b.b.a.z.a.s1.e
        public boolean c(Object obj, long j2) {
            return s1.f2595j ? s1.q(obj, j2) : s1.r(obj, j2);
        }

        @Override // f.b.b.a.z.a.s1.e
        public byte d(Object obj, long j2) {
            return s1.f2595j ? s1.t(obj, j2) : s1.u(obj, j2);
        }

        @Override // f.b.b.a.z.a.s1.e
        public double e(Object obj, long j2) {
            return Double.longBitsToDouble(h(obj, j2));
        }

        @Override // f.b.b.a.z.a.s1.e
        public float f(Object obj, long j2) {
            return Float.intBitsToFloat(g(obj, j2));
        }

        @Override // f.b.b.a.z.a.s1.e
        public void k(Object obj, long j2, boolean z) {
            if (s1.f2595j) {
                s1.F(obj, j2, z);
            } else {
                s1.G(obj, j2, z);
            }
        }

        @Override // f.b.b.a.z.a.s1.e
        public void l(Object obj, long j2, byte b) {
            if (s1.f2595j) {
                s1.I(obj, j2, b);
            } else {
                s1.J(obj, j2, b);
            }
        }

        @Override // f.b.b.a.z.a.s1.e
        public void m(Object obj, long j2, double d2) {
            p(obj, j2, Double.doubleToLongBits(d2));
        }

        @Override // f.b.b.a.z.a.s1.e
        public void n(Object obj, long j2, float f2) {
            o(obj, j2, Float.floatToIntBits(f2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // f.b.b.a.z.a.s1.e
        public boolean c(Object obj, long j2) {
            return s1.f2595j ? s1.q(obj, j2) : s1.r(obj, j2);
        }

        @Override // f.b.b.a.z.a.s1.e
        public byte d(Object obj, long j2) {
            return s1.f2595j ? s1.t(obj, j2) : s1.u(obj, j2);
        }

        @Override // f.b.b.a.z.a.s1.e
        public double e(Object obj, long j2) {
            return Double.longBitsToDouble(h(obj, j2));
        }

        @Override // f.b.b.a.z.a.s1.e
        public float f(Object obj, long j2) {
            return Float.intBitsToFloat(g(obj, j2));
        }

        @Override // f.b.b.a.z.a.s1.e
        public void k(Object obj, long j2, boolean z) {
            if (s1.f2595j) {
                s1.F(obj, j2, z);
            } else {
                s1.G(obj, j2, z);
            }
        }

        @Override // f.b.b.a.z.a.s1.e
        public void l(Object obj, long j2, byte b) {
            if (s1.f2595j) {
                s1.I(obj, j2, b);
            } else {
                s1.J(obj, j2, b);
            }
        }

        @Override // f.b.b.a.z.a.s1.e
        public void m(Object obj, long j2, double d2) {
            p(obj, j2, Double.doubleToLongBits(d2));
        }

        @Override // f.b.b.a.z.a.s1.e
        public void n(Object obj, long j2, float f2) {
            o(obj, j2, Float.floatToIntBits(f2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // f.b.b.a.z.a.s1.e
        public boolean c(Object obj, long j2) {
            return this.a.getBoolean(obj, j2);
        }

        @Override // f.b.b.a.z.a.s1.e
        public byte d(Object obj, long j2) {
            return this.a.getByte(obj, j2);
        }

        @Override // f.b.b.a.z.a.s1.e
        public double e(Object obj, long j2) {
            return this.a.getDouble(obj, j2);
        }

        @Override // f.b.b.a.z.a.s1.e
        public float f(Object obj, long j2) {
            return this.a.getFloat(obj, j2);
        }

        @Override // f.b.b.a.z.a.s1.e
        public void k(Object obj, long j2, boolean z) {
            this.a.putBoolean(obj, j2, z);
        }

        @Override // f.b.b.a.z.a.s1.e
        public void l(Object obj, long j2, byte b) {
            this.a.putByte(obj, j2, b);
        }

        @Override // f.b.b.a.z.a.s1.e
        public void m(Object obj, long j2, double d2) {
            this.a.putDouble(obj, j2, d2);
        }

        @Override // f.b.b.a.z.a.s1.e
        public void n(Object obj, long j2, float f2) {
            this.a.putFloat(obj, j2, f2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class e {
        Unsafe a;

        e(Unsafe unsafe) {
            this.a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j2);

        public abstract byte d(Object obj, long j2);

        public abstract double e(Object obj, long j2);

        public abstract float f(Object obj, long j2);

        public final int g(Object obj, long j2) {
            return this.a.getInt(obj, j2);
        }

        public final long h(Object obj, long j2) {
            return this.a.getLong(obj, j2);
        }

        public final Object i(Object obj, long j2) {
            return this.a.getObject(obj, j2);
        }

        public final long j(Field field) {
            return this.a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j2, boolean z);

        public abstract void l(Object obj, long j2, byte b);

        public abstract void m(Object obj, long j2, double d2);

        public abstract void n(Object obj, long j2, float f2);

        public final void o(Object obj, long j2, int i2) {
            this.a.putInt(obj, j2, i2);
        }

        public final void p(Object obj, long j2, long j3) {
            this.a.putLong(obj, j2, j3);
        }

        public final void q(Object obj, long j2, Object obj2) {
            this.a.putObject(obj, j2, obj2);
        }
    }

    static {
        j(boolean[].class);
        k(boolean[].class);
        j(int[].class);
        k(int[].class);
        j(long[].class);
        k(long[].class);
        j(float[].class);
        k(float[].class);
        j(double[].class);
        k(double[].class);
        j(Object[].class);
        k(Object[].class);
        o(l());
        f2595j = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private s1() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object A(Object obj, long j2) {
        return f2591f.i(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Unsafe B() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean C() {
        return f2593h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean D() {
        return f2592g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void E(Object obj, long j2, boolean z) {
        f2591f.k(obj, j2, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void F(Object obj, long j2, boolean z) {
        I(obj, j2, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void G(Object obj, long j2, boolean z) {
        J(obj, j2, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void H(byte[] bArr, long j2, byte b2) {
        f2591f.l(bArr, f2594i + j2, b2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void I(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int x = x(obj, j3);
        int i2 = ((~((int) j2)) & 3) << 3;
        M(obj, j3, ((255 & b2) << i2) | (x & (~(255 << i2))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void J(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        M(obj, j3, ((255 & b2) << i2) | (x(obj, j3) & (~(255 << i2))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void K(Object obj, long j2, double d2) {
        f2591f.m(obj, j2, d2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void L(Object obj, long j2, float f2) {
        f2591f.n(obj, j2, f2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void M(Object obj, long j2, int i2) {
        f2591f.o(obj, j2, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void N(Object obj, long j2, long j3) {
        f2591f.p(obj, j2, j3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void O(Object obj, long j2, Object obj2) {
        f2591f.q(obj, j2, obj2);
    }

    private static boolean P() {
        Unsafe unsafe = b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            if (f.b.b.a.z.a.d.c()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger = a;
            Level level = Level.WARNING;
            logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    private static boolean Q() {
        Unsafe unsafe = b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (l() == null) {
                return false;
            }
            if (f.b.b.a.z.a.d.c()) {
                return true;
            }
            cls.getMethod("getByte", cls2);
            cls.getMethod("putByte", cls2, Byte.TYPE);
            cls.getMethod("getInt", cls2);
            cls.getMethod("putInt", cls2, Integer.TYPE);
            cls.getMethod("getLong", cls2);
            cls.getMethod("putLong", cls2, cls2);
            cls.getMethod("copyMemory", cls2, cls2, cls2);
            cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
            return true;
        } catch (Throwable th) {
            Logger logger = a;
            Level level = Level.WARNING;
            logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T i(Class<T> cls) {
        try {
            return (T) b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private static int j(Class<?> cls) {
        if (f2593h) {
            return f2591f.a(cls);
        }
        return -1;
    }

    private static int k(Class<?> cls) {
        if (f2593h) {
            return f2591f.b(cls);
        }
        return -1;
    }

    private static Field l() {
        Field n;
        if (f.b.b.a.z.a.d.c() && (n = n(Buffer.class, "effectiveDirectAddress")) != null) {
            return n;
        }
        Field n2 = n(Buffer.class, "address");
        if (n2 == null || n2.getType() != Long.TYPE) {
            return null;
        }
        return n2;
    }

    private static boolean m(Class<?> cls) {
        if (!f.b.b.a.z.a.d.c()) {
            return false;
        }
        try {
            Class<?> cls2 = c;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static Field n(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long o(Field field) {
        e eVar;
        if (field == null || (eVar = f2591f) == null) {
            return -1L;
        }
        return eVar.j(field);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean p(Object obj, long j2) {
        return f2591f.c(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean q(Object obj, long j2) {
        return t(obj, j2) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean r(Object obj, long j2) {
        return u(obj, j2) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte s(byte[] bArr, long j2) {
        return f2591f.d(bArr, f2594i + j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte t(Object obj, long j2) {
        return (byte) ((x(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte u(Object obj, long j2) {
        return (byte) ((x(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double v(Object obj, long j2) {
        return f2591f.e(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float w(Object obj, long j2) {
        return f2591f.f(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int x(Object obj, long j2) {
        return f2591f.g(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long y(Object obj, long j2) {
        return f2591f.h(obj, j2);
    }

    private static e z() {
        Unsafe unsafe = b;
        if (unsafe == null) {
            return null;
        }
        if (!f.b.b.a.z.a.d.c()) {
            return new d(unsafe);
        }
        if (f2589d) {
            return new c(unsafe);
        }
        if (f2590e) {
            return new b(unsafe);
        }
        return null;
    }
}

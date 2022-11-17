package f.b.c.z;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
/* loaded from: classes.dex */
public abstract class m {

    /* loaded from: classes.dex */
    class a extends m {
        final /* synthetic */ Method a;
        final /* synthetic */ Object b;

        a(Method method, Object obj) {
            this.a = method;
            this.b = obj;
        }

        @Override // f.b.c.z.m
        public <T> T c(Class<T> cls) {
            m.a(cls);
            return (T) this.a.invoke(this.b, cls);
        }
    }

    /* loaded from: classes.dex */
    class b extends m {
        final /* synthetic */ Method a;
        final /* synthetic */ int b;

        b(Method method, int i2) {
            this.a = method;
            this.b = i2;
        }

        @Override // f.b.c.z.m
        public <T> T c(Class<T> cls) {
            m.a(cls);
            return (T) this.a.invoke(null, cls, Integer.valueOf(this.b));
        }
    }

    /* loaded from: classes.dex */
    class c extends m {
        final /* synthetic */ Method a;

        c(Method method) {
            this.a = method;
        }

        @Override // f.b.c.z.m
        public <T> T c(Class<T> cls) {
            m.a(cls);
            return (T) this.a.invoke(null, cls, Object.class);
        }
    }

    /* loaded from: classes.dex */
    class d extends m {
        d() {
        }

        @Override // f.b.c.z.m
        public <T> T c(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls);
        }
    }

    static void a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
        } else if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
        }
    }

    public static m b() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new b(declaredMethod2, intValue);
                } catch (Exception unused2) {
                    return new d();
                }
            } catch (Exception unused3) {
                Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod3.setAccessible(true);
                return new c(declaredMethod3);
            }
        }
    }

    public abstract <T> T c(Class<T> cls);
}

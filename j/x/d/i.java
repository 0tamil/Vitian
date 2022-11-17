package j.x.d;

import j.q;
import java.util.Arrays;
/* loaded from: classes.dex */
public class i {
    private i() {
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void b(Object obj) {
        if (obj == null) {
            j();
            throw null;
        }
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(str + " must not be null");
            g(nullPointerException);
            throw nullPointerException;
        }
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            k(str);
            throw null;
        }
    }

    public static int e(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    private static String f(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    private static <T extends Throwable> T g(T t) {
        h(t, i.class.getName());
        return t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends Throwable> T h(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
        return t;
    }

    public static String i(String str, Object obj) {
        return str + obj;
    }

    public static void j() {
        NullPointerException nullPointerException = new NullPointerException();
        g(nullPointerException);
        throw nullPointerException;
    }

    private static void k(String str) {
        NullPointerException nullPointerException = new NullPointerException(f(str));
        g(nullPointerException);
        throw nullPointerException;
    }

    public static void l(String str) {
        q qVar = new q(str);
        g(qVar);
        throw qVar;
    }

    public static void m(String str) {
        l("lateinit property " + str + " has not been initialized");
        throw null;
    }
}

package j.v;

import j.x.d.i;
import j.y.b;
import j.y.c;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class a {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j.v.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0141a {
        public static final Method a;

        /* JADX WARN: Removed duplicated region for block: B:11:0x0037 A[LOOP:0: B:3:0x000e->B:11:0x0037, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x003b A[EDGE_INSN: B:19:0x003b->B:13:0x003b ?: BREAK  , SYNTHETIC] */
        static {
            Method method;
            boolean z;
            Method[] methods = Throwable.class.getMethods();
            i.c(methods, "throwableMethods");
            int length = methods.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    method = null;
                    break;
                }
                method = methods[i2];
                if (i.a(method.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    i.c(parameterTypes, "it.parameterTypes");
                    if (i.a(j.s.a.i(parameterTypes), Throwable.class)) {
                        z = true;
                        if (!z) {
                            break;
                        }
                        i2++;
                    }
                }
                z = false;
                if (!z) {
                }
            }
            a = method;
            int length2 = methods.length;
            for (int i3 = 0; i3 < length2 && !i.a(methods[i3].getName(), "getSuppressed"); i3++) {
            }
        }
    }

    public void a(Throwable th, Throwable th2) {
        i.d(th, "cause");
        i.d(th2, "exception");
        Method method = C0141a.a;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public c b() {
        return new b();
    }
}

package kotlinx.coroutines.internal;

import j.k;
import j.l;
import j.m;
import j.o;
import j.u.j.a.e;
import j.x.d.i;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
/* loaded from: classes.dex */
public final class y {
    private static final String a;
    private static final String b;

    static {
        Object obj;
        Object obj2;
        try {
            l.a aVar = l.f3445e;
            obj = Class.forName("j.u.j.a.a").getCanonicalName();
            l.a(obj);
        } catch (Throwable th) {
            l.a aVar2 = l.f3445e;
            obj = m.a(th);
            l.a(obj);
        }
        if (l.b(obj) != null) {
            obj = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        a = (String) obj;
        try {
            l.a aVar3 = l.f3445e;
            obj2 = Class.forName("kotlinx.coroutines.internal.y").getCanonicalName();
            l.a(obj2);
        } catch (Throwable th2) {
            l.a aVar4 = l.f3445e;
            obj2 = m.a(th2);
            l.a(obj2);
        }
        if (l.b(obj2) != null) {
            obj2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        b = (String) obj2;
    }

    public static final /* synthetic */ Throwable a(Throwable th, e eVar) {
        return j(th, eVar);
    }

    public static final StackTraceElement b(String str) {
        return new StackTraceElement(i.i("\b\b\b(", str), "\b", "\b", -1);
    }

    private static final <E extends Throwable> k<E, StackTraceElement[]> c(E e2) {
        boolean z;
        Throwable cause = e2.getCause();
        if (cause == null || !i.a(cause.getClass(), e2.getClass())) {
            return o.a(e2, new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = e2.getStackTrace();
        int length = stackTrace.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z = false;
                break;
            } else if (h(stackTrace[i2])) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        return z ? o.a(cause, stackTrace) : o.a(e2, new StackTraceElement[0]);
    }

    private static final <E extends Throwable> E d(E e2, E e3, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(b("Coroutine boundary"));
        StackTraceElement[] stackTrace = e2.getStackTrace();
        int g2 = g(stackTrace, a);
        int i2 = 0;
        if (g2 == -1) {
            Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            e3.setStackTrace((StackTraceElement[]) array);
            return e3;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + g2];
        if (g2 > 0) {
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                stackTraceElementArr[i3] = stackTrace[i3];
                if (i4 >= g2) {
                    break;
                }
                i3 = i4;
            }
        }
        Iterator<StackTraceElement> it = arrayDeque.iterator();
        while (it.hasNext()) {
            i2++;
            stackTraceElementArr[i2 + g2] = it.next();
        }
        e3.setStackTrace(stackTraceElementArr);
        return e3;
    }

    private static final ArrayDeque<StackTraceElement> e(e eVar) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = eVar.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            if (!(eVar instanceof e)) {
                eVar = null;
            }
            eVar = eVar == null ? null : eVar.getCallerFrame();
            if (eVar == null) {
                return arrayDeque;
            }
            StackTraceElement stackTraceElement2 = eVar.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
    }

    private static final boolean f(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && i.a(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && i.a(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && i.a(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    private static final int g(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i.a(str, stackTraceElementArr[i2].getClassName())) {
                return i2;
            }
        }
        return -1;
    }

    public static final boolean h(StackTraceElement stackTraceElement) {
        boolean o;
        o = j.c0.m.o(stackTraceElement.getClassName(), "\b\b\b", false, 2, null);
        return o;
    }

    private static final void i(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            } else if (h(stackTraceElementArr[i2])) {
                break;
            } else {
                i2++;
            }
        }
        int i3 = i2 + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i3 <= length2) {
            while (true) {
                length2--;
                if (f(stackTraceElementArr[length2], arrayDeque.getLast())) {
                    arrayDeque.removeLast();
                }
                arrayDeque.addFirst(stackTraceElementArr[length2]);
                if (length2 == i3) {
                    return;
                }
            }
        }
    }

    public static final <E extends Throwable> E j(E e2, e eVar) {
        k c = c(e2);
        Throwable th = (Throwable) c.a();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) c.b();
        E e3 = (E) m(th);
        if (e3 == null) {
            return e2;
        }
        ArrayDeque<StackTraceElement> e4 = e(eVar);
        if (e4.isEmpty()) {
            return e2;
        }
        if (th != e2) {
            i(stackTraceElementArr, e4);
        }
        d(th, e3, e4);
        return e3;
    }

    public static final <E extends Throwable> E k(E e2) {
        E e3;
        if (!o0.d() || (e3 = (E) m(e2)) == null) {
            return e2;
        }
        l(e3);
        return e3;
    }

    private static final <E extends Throwable> E l(E e2) {
        StackTraceElement[] stackTrace = e2.getStackTrace();
        int length = stackTrace.length;
        int g2 = g(stackTrace, b);
        int i2 = g2 + 1;
        int g3 = g(stackTrace, a);
        int i3 = 0;
        int i4 = (length - g2) - (g3 == -1 ? 0 : length - g3);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i4];
        while (i3 < i4) {
            stackTraceElementArr[i3] = i3 == 0 ? b("Coroutine boundary") : stackTrace[(i2 + i3) - 1];
            i3++;
        }
        e2.setStackTrace(stackTraceElementArr);
        return e2;
    }

    private static final <E extends Throwable> E m(E e2) {
        E e3 = (E) i.e(e2);
        if (e3 == null) {
            return null;
        }
        if ((e2 instanceof d0) || i.a(e3.getMessage(), e2.getMessage())) {
            return e3;
        }
        return null;
    }

    public static final <E extends Throwable> E n(E e2) {
        E e3 = (E) e2.getCause();
        if (e3 != null && i.a(e3.getClass(), e2.getClass())) {
            StackTraceElement[] stackTrace = e2.getStackTrace();
            int length = stackTrace.length;
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (h(stackTrace[i2])) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                return e3;
            }
        }
        return e2;
    }
}

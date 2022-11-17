package j.x.d;

import j.x.c.a;
import j.x.c.b;
import j.x.c.c;
import j.x.c.d;
import j.x.c.e;
import j.x.c.f;
import j.x.c.g;
import j.x.c.h;
import j.x.c.i;
import j.x.c.j;
import j.x.c.k;
import j.x.c.l;
import j.x.c.m;
import j.x.c.o;
import j.x.c.p;
import j.x.c.q;
import j.x.c.r;
import j.x.c.s;
import j.x.c.t;
import j.x.c.u;
import j.x.c.v;
import j.x.c.w;
/* loaded from: classes.dex */
public class n {
    public static Object a(Object obj, int i2) {
        if (obj == null || c(obj, i2)) {
            return obj;
        }
        f(obj, "kotlin.jvm.functions.Function" + i2);
        throw null;
    }

    public static int b(Object obj) {
        if (obj instanceof f) {
            return ((f) obj).getArity();
        }
        if (obj instanceof a) {
            return 0;
        }
        if (obj instanceof l) {
            return 1;
        }
        if (obj instanceof p) {
            return 2;
        }
        if (obj instanceof q) {
            return 3;
        }
        if (obj instanceof r) {
            return 4;
        }
        if (obj instanceof s) {
            return 5;
        }
        if (obj instanceof t) {
            return 6;
        }
        if (obj instanceof u) {
            return 7;
        }
        if (obj instanceof v) {
            return 8;
        }
        if (obj instanceof w) {
            return 9;
        }
        if (obj instanceof b) {
            return 10;
        }
        if (obj instanceof c) {
            return 11;
        }
        if (obj instanceof d) {
            return 12;
        }
        if (obj instanceof e) {
            return 13;
        }
        if (obj instanceof f) {
            return 14;
        }
        if (obj instanceof g) {
            return 15;
        }
        if (obj instanceof h) {
            return 16;
        }
        if (obj instanceof i) {
            return 17;
        }
        if (obj instanceof j) {
            return 18;
        }
        if (obj instanceof k) {
            return 19;
        }
        if (obj instanceof m) {
            return 20;
        }
        if (obj instanceof j.x.c.n) {
            return 21;
        }
        return obj instanceof o ? 22 : -1;
    }

    public static boolean c(Object obj, int i2) {
        return (obj instanceof j.c) && b(obj) == i2;
    }

    private static <T extends Throwable> T d(T t) {
        i.h(t, n.class.getName());
        return t;
    }

    public static ClassCastException e(ClassCastException classCastException) {
        d(classCastException);
        throw classCastException;
    }

    public static void f(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        g(name + " cannot be cast to " + str);
        throw null;
    }

    public static void g(String str) {
        e(new ClassCastException(str));
        throw null;
    }
}

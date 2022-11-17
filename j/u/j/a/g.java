package j.u.j.a;

import j.x.d.i;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
public final class g {
    private static final void a(int i2, int i3) {
        if (i3 > i2) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i2 + ", got " + i3 + ". Please update the Kotlin standard library.").toString());
        }
    }

    private static final f b(a aVar) {
        return (f) aVar.getClass().getAnnotation(f.class);
    }

    private static final int c(a aVar) {
        try {
            Field declaredField = aVar.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(aVar);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static final StackTraceElement d(a aVar) {
        String str;
        i.d(aVar, "<this>");
        f b = b(aVar);
        if (b == null) {
            return null;
        }
        a(1, b.v());
        int c = c(aVar);
        int i2 = c < 0 ? -1 : b.l()[c];
        String b2 = i.a.b(aVar);
        if (b2 == null) {
            str = b.c();
        } else {
            str = b2 + '/' + b.c();
        }
        return new StackTraceElement(str, b.m(), b.f(), i2);
    }
}

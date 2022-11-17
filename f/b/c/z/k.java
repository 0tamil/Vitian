package f.b.c.z;

import java.lang.reflect.Type;
/* loaded from: classes.dex */
public final class k {
    public static boolean a(Type type) {
        return (type instanceof Class) && ((Class) type).isPrimitive();
    }
}

package j.v;

import j.c0.n;
import j.x.d.i;
/* loaded from: classes.dex */
public final class b {
    public static final a a;

    static {
        a aVar;
        Object newInstance;
        Object newInstance2;
        int a2 = a();
        if (a2 >= 65544 || a2 < 65536) {
            try {
                newInstance = Class.forName("j.v.e.a").newInstance();
                i.c(newInstance, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                } catch (ClassCastException e2) {
                    ClassLoader classLoader = newInstance.getClass().getClassLoader();
                    ClassLoader classLoader2 = a.class.getClassLoader();
                    if (!i.a(classLoader, classLoader2)) {
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e2);
                    }
                    throw e2;
                }
            } catch (ClassNotFoundException unused) {
                Object newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                i.c(newInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    if (newInstance3 != null) {
                        aVar = (a) newInstance3;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                } catch (ClassCastException e3) {
                    ClassLoader classLoader3 = newInstance3.getClass().getClassLoader();
                    ClassLoader classLoader4 = a.class.getClassLoader();
                    if (!i.a(classLoader3, classLoader4)) {
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e3);
                    }
                    throw e3;
                }
            }
            if (newInstance != null) {
                aVar = (a) newInstance;
                a = aVar;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
        }
        if (a2 >= 65543 || a2 < 65536) {
            try {
                newInstance2 = Class.forName("j.v.d.a").newInstance();
                i.c(newInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    try {
                    } catch (ClassCastException e4) {
                        ClassLoader classLoader5 = newInstance2.getClass().getClassLoader();
                        ClassLoader classLoader6 = a.class.getClassLoader();
                        if (!i.a(classLoader5, classLoader6)) {
                            throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e4);
                        }
                        throw e4;
                    }
                } catch (ClassNotFoundException unused2) {
                }
            } catch (ClassNotFoundException unused3) {
                Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                i.c(newInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    if (newInstance4 != null) {
                        aVar = (a) newInstance4;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                } catch (ClassCastException e5) {
                    ClassLoader classLoader7 = newInstance4.getClass().getClassLoader();
                    ClassLoader classLoader8 = a.class.getClassLoader();
                    if (!i.a(classLoader7, classLoader8)) {
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e5);
                    }
                    throw e5;
                }
            }
            if (newInstance2 != null) {
                aVar = (a) newInstance2;
                a = aVar;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
        }
        aVar = new a();
        a = aVar;
    }

    private static final int a() {
        int z;
        int z2;
        String property = System.getProperty("java.specification.version");
        if (property == null) {
            return 65542;
        }
        z = n.z(property, '.', 0, false, 6, null);
        if (z < 0) {
            try {
                return Integer.parseInt(property) * 65536;
            } catch (NumberFormatException unused) {
                return 65542;
            }
        } else {
            int i2 = z + 1;
            z2 = n.z(property, '.', i2, false, 4, null);
            if (z2 < 0) {
                z2 = property.length();
            }
            String substring = property.substring(0, z);
            i.c(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring2 = property.substring(i2, z2);
            i.c(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            try {
                return (Integer.parseInt(substring) * 65536) + Integer.parseInt(substring2);
            } catch (NumberFormatException unused2) {
                return 65542;
            }
        }
    }
}

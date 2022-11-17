package kotlinx.coroutines.internal;

import j.b;
import j.c0.m;
import j.c0.n;
import j.s.q;
import j.x.d.i;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
/* loaded from: classes.dex */
public final class j {
    public static final j a = new j();

    private j() {
    }

    private final <S> S a(String str, ClassLoader classLoader, Class<S> cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    private final <S> List<S> b(Class<S> cls, ClassLoader classLoader) {
        List<S> q;
        try {
            return d(cls, classLoader);
        } catch (Throwable unused) {
            q = q.q(ServiceLoader.load(cls, classLoader));
            return q;
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    private final List<String> e(URL url) {
        boolean o;
        String T;
        String Y;
        String T2;
        String url2 = url.toString();
        th = 0;
        o = m.o(url2, "jar", false, 2, th);
        if (o) {
            T = n.T(url2, "jar:file:", th, 2, th);
            Y = n.Y(T, '!', th, 2, th);
            T2 = n.T(url2, "!/", th, 2, th);
            JarFile jarFile = new JarFile(Y, false);
            try {
                List<String> f2 = a.f(new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(T2)), "UTF-8")));
                jarFile.close();
                return f2;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        jarFile.close();
                        throw th2;
                    } catch (Throwable th3) {
                        b.a(th, th3);
                        throw th;
                    }
                }
            }
        } else {
            try {
                return a.f(new BufferedReader(new InputStreamReader(url.openStream())));
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
    }

    private final List<String> f(BufferedReader bufferedReader) {
        List<String> q;
        String Z;
        CharSequence a0;
        boolean z;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                q = q.q(linkedHashSet);
                return q;
            }
            Z = n.Z(readLine, "#", null, 2, null);
            Objects.requireNonNull(Z, "null cannot be cast to non-null type kotlin.CharSequence");
            a0 = n.a0(Z);
            String obj = a0.toString();
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                if (i2 >= obj.length()) {
                    z = true;
                    break;
                }
                char charAt = obj.charAt(i2);
                if (!(charAt == '.' || Character.isJavaIdentifierPart(charAt))) {
                    z = false;
                    break;
                }
                i2++;
            }
            if (z) {
                if (obj.length() > 0) {
                    z2 = true;
                }
                if (z2) {
                    linkedHashSet.add(obj);
                }
            } else {
                throw new IllegalArgumentException(i.i("Illegal service provider class name: ", obj).toString());
            }
        }
    }

    public final List<MainDispatcherFactory> c() {
        MainDispatcherFactory mainDispatcherFactory;
        if (!k.a()) {
            return b(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            MainDispatcherFactory mainDispatcherFactory2 = null;
            try {
                mainDispatcherFactory = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                mainDispatcherFactory = null;
            }
            if (mainDispatcherFactory != null) {
                arrayList.add(mainDispatcherFactory);
            }
            try {
                mainDispatcherFactory2 = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (mainDispatcherFactory2 == null) {
                return arrayList;
            }
            arrayList.add(mainDispatcherFactory2);
            return arrayList;
        } catch (Throwable unused3) {
            return b(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
    }

    public final <S> List<S> d(Class<S> cls, ClassLoader classLoader) {
        Set<String> t;
        int g2;
        ArrayList<URL> list = Collections.list(classLoader.getResources(i.i("META-INF/services/", cls.getName())));
        i.c(list, "java.util.Collections.list(this)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            j.s.n.h(arrayList, a.e(url));
        }
        t = q.t(arrayList);
        if (!t.isEmpty()) {
            g2 = j.s.j.g(t, 10);
            ArrayList arrayList2 = new ArrayList(g2);
            for (String str : t) {
                arrayList2.add(a.a(str, classLoader, cls));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
    }
}

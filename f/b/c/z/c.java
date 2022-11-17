package f.b.c.z;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
/* loaded from: classes.dex */
public final class c {
    private final Map<Type, f.b.c.g<?>> a;
    private final f.b.c.z.o.b b = f.b.c.z.o.b.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements f.b.c.z.i<T> {
        a(c cVar) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.concurrent.ConcurrentHashMap] */
        @Override // f.b.c.z.i
        public T a() {
            return new ConcurrentHashMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements f.b.c.z.i<T> {
        b(c cVar) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.TreeMap, T] */
        @Override // f.b.c.z.i
        public T a() {
            return new TreeMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f.b.c.z.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0107c implements f.b.c.z.i<T> {
        C0107c(c cVar) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.LinkedHashMap, T] */
        @Override // f.b.c.z.i
        public T a() {
            return new LinkedHashMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements f.b.c.z.i<T> {
        d(c cVar) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [f.b.c.z.h, T] */
        @Override // f.b.c.z.i
        public T a() {
            return new f.b.c.z.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements f.b.c.z.i<T> {
        private final f.b.c.z.m a = f.b.c.z.m.b();
        final /* synthetic */ Class b;
        final /* synthetic */ Type c;

        e(c cVar, Class cls, Type type) {
            this.b = cls;
            this.c = type;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
        @Override // f.b.c.z.i
        public T a() {
            try {
                return this.a.c(this.b);
            } catch (Exception e2) {
                throw new RuntimeException("Unable to invoke no-args constructor for " + this.c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e2);
            }
        }
    }

    /* loaded from: classes.dex */
    class f implements f.b.c.z.i<T> {
        final /* synthetic */ f.b.c.g a;
        final /* synthetic */ Type b;

        f(c cVar, f.b.c.g gVar, Type type) {
            this.a = gVar;
            this.b = type;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        @Override // f.b.c.z.i
        public T a() {
            return this.a.a(this.b);
        }
    }

    /* loaded from: classes.dex */
    class g implements f.b.c.z.i<T> {
        final /* synthetic */ f.b.c.g a;
        final /* synthetic */ Type b;

        g(c cVar, f.b.c.g gVar, Type type) {
            this.a = gVar;
            this.b = type;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        @Override // f.b.c.z.i
        public T a() {
            return this.a.a(this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h implements f.b.c.z.i<T> {
        final /* synthetic */ Constructor a;

        h(c cVar, Constructor constructor) {
            this.a = constructor;
        }

        /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.Object] */
        @Override // f.b.c.z.i
        public T a() {
            try {
                return this.a.newInstance(null);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Failed to invoke " + this.a + " with no args", e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Failed to invoke " + this.a + " with no args", e4.getTargetException());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class i implements f.b.c.z.i<T> {
        i(c cVar) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.TreeSet] */
        @Override // f.b.c.z.i
        public T a() {
            return new TreeSet();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class j implements f.b.c.z.i<T> {
        final /* synthetic */ Type a;

        j(c cVar, Type type) {
            this.a = type;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [T, java.util.EnumSet] */
        @Override // f.b.c.z.i
        public T a() {
            Type type = this.a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new f.b.c.l("Invalid EnumSet type: " + this.a.toString());
            }
            throw new f.b.c.l("Invalid EnumSet type: " + this.a.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class k implements f.b.c.z.i<T> {
        k(c cVar) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.LinkedHashSet] */
        @Override // f.b.c.z.i
        public T a() {
            return new LinkedHashSet();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class l implements f.b.c.z.i<T> {
        l(c cVar) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.ArrayDeque] */
        @Override // f.b.c.z.i
        public T a() {
            return new ArrayDeque();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class m implements f.b.c.z.i<T> {
        m(c cVar) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.ArrayList] */
        @Override // f.b.c.z.i
        public T a() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class n implements f.b.c.z.i<T> {
        n(c cVar) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.ConcurrentSkipListMap, T] */
        @Override // f.b.c.z.i
        public T a() {
            return new ConcurrentSkipListMap();
        }
    }

    public c(Map<Type, f.b.c.g<?>> map) {
        this.a = map;
    }

    private <T> f.b.c.z.i<T> b(Class<? super T> cls) {
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.b.b(declaredConstructor);
            }
            return new h(this, declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private <T> f.b.c.z.i<T> c(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new i(this) : EnumSet.class.isAssignableFrom(cls) ? new j(this, type) : Set.class.isAssignableFrom(cls) ? new k(this) : Queue.class.isAssignableFrom(cls) ? new l(this) : new m(this);
        }
        if (Map.class.isAssignableFrom(cls)) {
            return ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new n(this) : ConcurrentMap.class.isAssignableFrom(cls) ? new a(this) : SortedMap.class.isAssignableFrom(cls) ? new b(this) : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(f.b.c.a0.a.b(((ParameterizedType) type).getActualTypeArguments()[0]).c())) ? new d(this) : new C0107c(this);
        }
        return null;
    }

    private <T> f.b.c.z.i<T> d(Type type, Class<? super T> cls) {
        return new e(this, cls, type);
    }

    public <T> f.b.c.z.i<T> a(f.b.c.a0.a<T> aVar) {
        Type e2 = aVar.e();
        Class<? super T> c = aVar.c();
        f.b.c.g<?> gVar = this.a.get(e2);
        if (gVar != null) {
            return new f(this, gVar, e2);
        }
        f.b.c.g<?> gVar2 = this.a.get(c);
        if (gVar2 != null) {
            return new g(this, gVar2, e2);
        }
        f.b.c.z.i<T> b2 = b(c);
        if (b2 != null) {
            return b2;
        }
        f.b.c.z.i<T> c2 = c(e2, c);
        return c2 != null ? c2 : d(e2, c);
    }

    public String toString() {
        return this.a.toString();
    }
}

package f.b.b.a;

import f.b.b.a.p;
import f.b.b.a.y.a0;
import f.b.b.a.y.c0;
import f.b.b.a.y.y;
import f.b.b.a.y.z;
import f.b.b.a.z.a.i;
import f.b.b.a.z.a.s0;
import java.security.GeneralSecurityException;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class r {
    private static final Logger a = Logger.getLogger(r.class.getName());
    private static final ConcurrentMap<String, d> b = new ConcurrentHashMap();
    private static final ConcurrentMap<String, c> c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    private static final ConcurrentMap<String, Boolean> f2459d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    private static final ConcurrentMap<Class<?>, q<?, ?>> f2460e = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements d {
        final /* synthetic */ h a;

        a(h hVar) {
            this.a = hVar;
        }

        @Override // f.b.b.a.r.d
        public <Q> e<Q> a(Class<Q> cls) {
            try {
                return new f(this.a, cls);
            } catch (IllegalArgumentException e2) {
                throw new GeneralSecurityException("Primitive type not supported", e2);
            }
        }

        @Override // f.b.b.a.r.d
        public Set<Class<?>> b() {
            return this.a.h();
        }

        @Override // f.b.b.a.r.d
        public e<?> c() {
            h hVar = this.a;
            return new f(hVar, hVar.a());
        }

        @Override // f.b.b.a.r.d
        public Class<?> d() {
            return this.a.getClass();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements c {
        b(h hVar) {
        }
    }

    /* loaded from: classes.dex */
    private interface c {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface d {
        <P> e<P> a(Class<P> cls);

        Set<Class<?>> b();

        e<?> c();

        Class<?> d();
    }

    static {
        new ConcurrentHashMap();
    }

    private r() {
    }

    private static <T> T a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    private static <KeyProtoT extends s0> d b(h<KeyProtoT> hVar) {
        return new a(hVar);
    }

    private static <KeyProtoT extends s0> c c(h<KeyProtoT> hVar) {
        return new b(hVar);
    }

    private static synchronized void d(String str, Class<?> cls, boolean z) {
        synchronized (r.class) {
            ConcurrentMap<String, d> concurrentMap = b;
            if (concurrentMap.containsKey(str)) {
                d dVar = concurrentMap.get(str);
                if (dVar.d().equals(cls)) {
                    if (z && !f2459d.get(str).booleanValue()) {
                        throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                    }
                    return;
                }
                Logger logger = a;
                logger.warning("Attempted overwrite of a registered key manager for key type " + str);
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, dVar.d().getName(), cls.getName()));
            }
        }
    }

    public static Class<?> e(Class<?> cls) {
        q<?, ?> qVar = f2460e.get(cls);
        if (qVar == null) {
            return null;
        }
        return qVar.a();
    }

    private static synchronized d f(String str) {
        d dVar;
        synchronized (r.class) {
            ConcurrentMap<String, d> concurrentMap = b;
            if (concurrentMap.containsKey(str)) {
                dVar = concurrentMap.get(str);
            } else {
                throw new GeneralSecurityException("No key manager found for key type " + str);
            }
        }
        return dVar;
    }

    private static <P> e<P> g(String str, Class<P> cls) {
        d f2 = f(str);
        if (cls == null) {
            return (e<P>) f2.c();
        }
        if (f2.b().contains(cls)) {
            return f2.a(cls);
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + f2.d() + ", supported primitives: " + s(f2.b()));
    }

    public static <P> P h(String str, i iVar, Class<P> cls) {
        a(cls);
        return (P) j(str, iVar, cls);
    }

    public static <P> P i(String str, byte[] bArr, Class<P> cls) {
        return (P) h(str, i.k(bArr), cls);
    }

    private static <P> P j(String str, i iVar, Class<P> cls) {
        return (P) g(str, cls).c(iVar);
    }

    public static <P> p<P> k(i iVar, e<P> eVar, Class<P> cls) {
        a(cls);
        return m(iVar, eVar, cls);
    }

    public static <P> p<P> l(i iVar, Class<P> cls) {
        return k(iVar, null, cls);
    }

    private static <P> p<P> m(i iVar, e<P> eVar, Class<P> cls) {
        s.d(iVar.f());
        p<P> f2 = p.f(cls);
        for (c0.c cVar : iVar.f().U()) {
            if (cVar.V() == z.ENABLED) {
                p.b<P> a2 = f2.a((eVar == null || !eVar.a(cVar.S().T())) ? (P) j(cVar.S().T(), cVar.S().U(), cls) : eVar.c(cVar.S().U()), cVar);
                if (cVar.T() == iVar.f().V()) {
                    f2.g(a2);
                }
            }
        }
        return f2;
    }

    public static e<?> n(String str) {
        return f(str).c();
    }

    public static synchronized s0 o(a0 a0Var) {
        s0 d2;
        synchronized (r.class) {
            e<?> n = n(a0Var.T());
            if (f2459d.get(a0Var.T()).booleanValue()) {
                d2 = n.d(a0Var.U());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + a0Var.T());
            }
        }
        return d2;
    }

    public static synchronized y p(a0 a0Var) {
        y b2;
        synchronized (r.class) {
            e<?> n = n(a0Var.T());
            if (f2459d.get(a0Var.T()).booleanValue()) {
                b2 = n.b(a0Var.U());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + a0Var.T());
            }
        }
        return b2;
    }

    public static synchronized <KeyProtoT extends s0> void q(h<KeyProtoT> hVar, boolean z) {
        synchronized (r.class) {
            if (hVar != null) {
                String c2 = hVar.c();
                d(c2, hVar.getClass(), z);
                ConcurrentMap<String, d> concurrentMap = b;
                if (!concurrentMap.containsKey(c2)) {
                    concurrentMap.put(c2, b(hVar));
                    c.put(c2, c(hVar));
                }
                f2459d.put(c2, Boolean.valueOf(z));
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }

    public static synchronized <B, P> void r(q<B, P> qVar) {
        synchronized (r.class) {
            if (qVar != null) {
                Class<P> b2 = qVar.b();
                ConcurrentMap<Class<?>, q<?, ?>> concurrentMap = f2460e;
                if (concurrentMap.containsKey(b2)) {
                    q<?, ?> qVar2 = concurrentMap.get(b2);
                    if (!qVar.getClass().equals(qVar2.getClass())) {
                        Logger logger = a;
                        logger.warning("Attempted overwrite of a registered SetWrapper for type " + b2);
                        throw new GeneralSecurityException(String.format("SetWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", b2.getName(), qVar2.getClass().getName(), qVar.getClass().getName()));
                    }
                }
                concurrentMap.put(b2, qVar);
            } else {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
        }
    }

    private static String s(Set<Class<?>> set) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class<?> cls : set) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls.getCanonicalName());
            z = false;
        }
        return sb.toString();
    }

    public static <B, P> P t(p<B> pVar, Class<P> cls) {
        q<?, ?> qVar = f2460e.get(cls);
        if (qVar == null) {
            throw new GeneralSecurityException("No wrapper found for " + pVar.d().getName());
        } else if (qVar.a().equals(pVar.d())) {
            return (P) qVar.c(pVar);
        } else {
            throw new GeneralSecurityException("Wrong input primitive class, expected " + qVar.a() + ", got " + pVar.d());
        }
    }
}

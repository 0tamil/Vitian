package f.b.c;

import f.b.c.z.l;
import f.b.c.z.n.h;
import f.b.c.z.n.i;
import f.b.c.z.n.j;
import f.b.c.z.n.k;
import f.b.c.z.n.n;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
/* loaded from: classes.dex */
public final class e {
    private static final f.b.c.a0.a<?> m = f.b.c.a0.a.a(Object.class);
    private final ThreadLocal<Map<f.b.c.a0.a<?>, f<?>>> a = new ThreadLocal<>();
    private final Map<f.b.c.a0.a<?>, w<?>> b = new ConcurrentHashMap();
    private final f.b.c.z.c c;

    /* renamed from: d  reason: collision with root package name */
    private final f.b.c.z.n.e f2683d;

    /* renamed from: e  reason: collision with root package name */
    final List<x> f2684e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f2685f;

    /* renamed from: g  reason: collision with root package name */
    final boolean f2686g;

    /* renamed from: h  reason: collision with root package name */
    final boolean f2687h;

    /* renamed from: i  reason: collision with root package name */
    final boolean f2688i;

    /* renamed from: j  reason: collision with root package name */
    final boolean f2689j;

    /* renamed from: k  reason: collision with root package name */
    final List<x> f2690k;
    final List<x> l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends w<Number> {
        a(e eVar) {
        }

        /* renamed from: f */
        public Double c(f.b.c.b0.a aVar) {
            if (aVar.G() != f.b.c.b0.b.NULL) {
                return Double.valueOf(aVar.x());
            }
            aVar.C();
            return null;
        }

        /* renamed from: g */
        public void e(f.b.c.b0.c cVar, Number number) {
            if (number == null) {
                cVar.t();
                return;
            }
            e.d(number.doubleValue());
            cVar.H(number);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends w<Number> {
        b(e eVar) {
        }

        /* renamed from: f */
        public Float c(f.b.c.b0.a aVar) {
            if (aVar.G() != f.b.c.b0.b.NULL) {
                return Float.valueOf((float) aVar.x());
            }
            aVar.C();
            return null;
        }

        /* renamed from: g */
        public void e(f.b.c.b0.c cVar, Number number) {
            if (number == null) {
                cVar.t();
                return;
            }
            e.d(number.floatValue());
            cVar.H(number);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends w<Number> {
        c() {
        }

        /* renamed from: f */
        public Number c(f.b.c.b0.a aVar) {
            if (aVar.G() != f.b.c.b0.b.NULL) {
                return Long.valueOf(aVar.z());
            }
            aVar.C();
            return null;
        }

        /* renamed from: g */
        public void e(f.b.c.b0.c cVar, Number number) {
            if (number == null) {
                cVar.t();
            } else {
                cVar.I(number.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends w<AtomicLong> {
        final /* synthetic */ w a;

        d(w wVar) {
            this.a = wVar;
        }

        /* renamed from: f */
        public AtomicLong c(f.b.c.b0.a aVar) {
            return new AtomicLong(((Number) this.a.c(aVar)).longValue());
        }

        /* renamed from: g */
        public void e(f.b.c.b0.c cVar, AtomicLong atomicLong) {
            this.a.e(cVar, Long.valueOf(atomicLong.get()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f.b.c.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0105e extends w<AtomicLongArray> {
        final /* synthetic */ w a;

        C0105e(w wVar) {
            this.a = wVar;
        }

        /* renamed from: f */
        public AtomicLongArray c(f.b.c.b0.a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.b();
            while (aVar.q()) {
                arrayList.add(Long.valueOf(((Number) this.a.c(aVar)).longValue()));
            }
            aVar.i();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i2 = 0; i2 < size; i2++) {
                atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
            }
            return atomicLongArray;
        }

        /* renamed from: g */
        public void e(f.b.c.b0.c cVar, AtomicLongArray atomicLongArray) {
            cVar.d();
            int length = atomicLongArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                this.a.e(cVar, Long.valueOf(atomicLongArray.get(i2)));
            }
            cVar.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class f<T> extends w<T> {
        private w<T> a;

        f() {
        }

        @Override // f.b.c.w
        public T c(f.b.c.b0.a aVar) {
            w<T> wVar = this.a;
            if (wVar != null) {
                return wVar.c(aVar);
            }
            throw new IllegalStateException();
        }

        @Override // f.b.c.w
        public void e(f.b.c.b0.c cVar, T t) {
            w<T> wVar = this.a;
            if (wVar != null) {
                wVar.e(cVar, t);
                return;
            }
            throw new IllegalStateException();
        }

        public void f(w<T> wVar) {
            if (this.a == null) {
                this.a = wVar;
                return;
            }
            throw new AssertionError();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(f.b.c.z.d dVar, f.b.c.d dVar2, Map<Type, g<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, t tVar, String str, int i2, int i3, List<x> list, List<x> list2, List<x> list3, v vVar, v vVar2) {
        f.b.c.z.c cVar = new f.b.c.z.c(map);
        this.c = cVar;
        this.f2685f = z;
        this.f2686g = z3;
        this.f2687h = z4;
        this.f2688i = z5;
        this.f2689j = z6;
        this.f2690k = list;
        this.l = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(n.V);
        arrayList.add(j.f(vVar));
        arrayList.add(dVar);
        arrayList.addAll(list3);
        arrayList.add(n.B);
        arrayList.add(n.m);
        arrayList.add(n.f2773g);
        arrayList.add(n.f2775i);
        arrayList.add(n.f2777k);
        w<Number> m2 = m(tVar);
        arrayList.add(n.b(Long.TYPE, Long.class, m2));
        arrayList.add(n.b(Double.TYPE, Double.class, e(z7)));
        arrayList.add(n.b(Float.TYPE, Float.class, f(z7)));
        arrayList.add(i.f(vVar2));
        arrayList.add(n.o);
        arrayList.add(n.q);
        arrayList.add(n.a(AtomicLong.class, b(m2)));
        arrayList.add(n.a(AtomicLongArray.class, c(m2)));
        arrayList.add(n.s);
        arrayList.add(n.x);
        arrayList.add(n.D);
        arrayList.add(n.F);
        arrayList.add(n.a(BigDecimal.class, n.z));
        arrayList.add(n.a(BigInteger.class, n.A));
        arrayList.add(n.H);
        arrayList.add(n.J);
        arrayList.add(n.N);
        arrayList.add(n.P);
        arrayList.add(n.T);
        arrayList.add(n.L);
        arrayList.add(n.f2770d);
        arrayList.add(f.b.c.z.n.c.b);
        arrayList.add(n.R);
        if (f.b.c.z.p.d.a) {
            arrayList.add(f.b.c.z.p.d.f2790e);
            arrayList.add(f.b.c.z.p.d.f2789d);
            arrayList.add(f.b.c.z.p.d.f2791f);
        }
        arrayList.add(f.b.c.z.n.a.c);
        arrayList.add(n.b);
        arrayList.add(new f.b.c.z.n.b(cVar));
        arrayList.add(new h(cVar, z2));
        f.b.c.z.n.e eVar = new f.b.c.z.n.e(cVar);
        this.f2683d = eVar;
        arrayList.add(eVar);
        arrayList.add(n.W);
        arrayList.add(new k(cVar, dVar2, dVar, eVar));
        this.f2684e = Collections.unmodifiableList(arrayList);
    }

    private static void a(Object obj, f.b.c.b0.a aVar) {
        if (obj != null) {
            try {
                if (aVar.G() != f.b.c.b0.b.END_DOCUMENT) {
                    throw new l("JSON document was not fully consumed.");
                }
            } catch (f.b.c.b0.d e2) {
                throw new s(e2);
            } catch (IOException e3) {
                throw new l(e3);
            }
        }
    }

    private static w<AtomicLong> b(w<Number> wVar) {
        return new d(wVar).b();
    }

    private static w<AtomicLongArray> c(w<Number> wVar) {
        return new C0105e(wVar).b();
    }

    static void d(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private w<Number> e(boolean z) {
        return z ? n.v : new a(this);
    }

    private w<Number> f(boolean z) {
        return z ? n.u : new b(this);
    }

    private static w<Number> m(t tVar) {
        return tVar == t.f2700e ? n.t : new c();
    }

    public <T> T g(f.b.c.b0.a aVar, Type type) {
        boolean r = aVar.r();
        boolean z = true;
        aVar.L(true);
        try {
            try {
                try {
                    aVar.G();
                    z = false;
                    T c2 = j(f.b.c.a0.a.b(type)).c(aVar);
                    aVar.L(r);
                    return c2;
                } catch (AssertionError e2) {
                    AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e2.getMessage());
                    assertionError.initCause(e2);
                    throw assertionError;
                } catch (IllegalStateException e3) {
                    throw new s(e3);
                }
            } catch (EOFException e4) {
                if (z) {
                    aVar.L(r);
                    return null;
                }
                throw new s(e4);
            } catch (IOException e5) {
                throw new s(e5);
            }
        } catch (Throwable th) {
            aVar.L(r);
            throw th;
        }
    }

    public <T> T h(Reader reader, Type type) {
        f.b.c.b0.a n = n(reader);
        T t = (T) g(n, type);
        a(t, n);
        return t;
    }

    public <T> T i(String str, Type type) {
        if (str == null) {
            return null;
        }
        return (T) h(new StringReader(str), type);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> w<T> j(f.b.c.a0.a<T> aVar) {
        w<T> wVar = (w<T>) this.b.get(aVar == null ? m : aVar);
        if (wVar != null) {
            return wVar;
        }
        Map<f.b.c.a0.a<?>, f<?>> map = this.a.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap<>();
            this.a.set(map);
            z = true;
        }
        f<?> fVar = map.get(aVar);
        if (fVar != null) {
            return fVar;
        }
        try {
            f<?> fVar2 = new f<>();
            map.put(aVar, fVar2);
            for (x xVar : this.f2684e) {
                w wVar2 = (w<T>) xVar.create(this, aVar);
                if (wVar2 != null) {
                    fVar2.f(wVar2);
                    this.b.put(aVar, wVar2);
                    return wVar2;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.9) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z) {
                this.a.remove();
            }
        }
    }

    public <T> w<T> k(Class<T> cls) {
        return j(f.b.c.a0.a.a(cls));
    }

    public <T> w<T> l(x xVar, f.b.c.a0.a<T> aVar) {
        if (!this.f2684e.contains(xVar)) {
            xVar = this.f2683d;
        }
        boolean z = false;
        for (x xVar2 : this.f2684e) {
            if (z) {
                w<T> create = xVar2.create(this, aVar);
                if (create != null) {
                    return create;
                }
            } else if (xVar2 == xVar) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public f.b.c.b0.a n(Reader reader) {
        f.b.c.b0.a aVar = new f.b.c.b0.a(reader);
        aVar.L(this.f2689j);
        return aVar;
    }

    public f.b.c.b0.c o(Writer writer) {
        if (this.f2686g) {
            writer.write(")]}'\n");
        }
        f.b.c.b0.c cVar = new f.b.c.b0.c(writer);
        if (this.f2688i) {
            cVar.B("  ");
        }
        cVar.D(this.f2685f);
        return cVar;
    }

    public String p(k kVar) {
        StringWriter stringWriter = new StringWriter();
        t(kVar, stringWriter);
        return stringWriter.toString();
    }

    public String q(Object obj) {
        return obj == null ? p(m.a) : r(obj, obj.getClass());
    }

    public String r(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        v(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public void s(k kVar, f.b.c.b0.c cVar) {
        boolean q = cVar.q();
        cVar.C(true);
        boolean o = cVar.o();
        cVar.A(this.f2687h);
        boolean n = cVar.n();
        cVar.D(this.f2685f);
        try {
            try {
                l.b(kVar, cVar);
            } catch (IOException e2) {
                throw new l(e2);
            } catch (AssertionError e3) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e3.getMessage());
                assertionError.initCause(e3);
                throw assertionError;
            }
        } finally {
            cVar.C(q);
            cVar.A(o);
            cVar.D(n);
        }
    }

    public void t(k kVar, Appendable appendable) {
        try {
            s(kVar, o(l.c(appendable)));
        } catch (IOException e2) {
            throw new l(e2);
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.f2685f + ",factories:" + this.f2684e + ",instanceCreators:" + this.c + "}";
    }

    public void u(Object obj, Type type, f.b.c.b0.c cVar) {
        w j2 = j(f.b.c.a0.a.b(type));
        boolean q = cVar.q();
        cVar.C(true);
        boolean o = cVar.o();
        cVar.A(this.f2687h);
        boolean n = cVar.n();
        cVar.D(this.f2685f);
        try {
            try {
                j2.e(cVar, obj);
            } catch (IOException e2) {
                throw new l(e2);
            } catch (AssertionError e3) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e3.getMessage());
                assertionError.initCause(e3);
                throw assertionError;
            }
        } finally {
            cVar.C(q);
            cVar.A(o);
            cVar.D(n);
        }
    }

    public void v(Object obj, Type type, Appendable appendable) {
        try {
            u(obj, type, o(l.c(appendable)));
        } catch (IOException e2) {
            throw new l(e2);
        }
    }
}

package k.a.a.u;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;
import k.a.a.b;
import k.a.a.q;
import k.a.a.w.d;
import k.a.a.x.a;
import k.a.a.x.e;
import k.a.a.x.i;
import k.a.a.x.j;
/* loaded from: classes.dex */
public abstract class h implements Comparable<h> {

    /* renamed from: e  reason: collision with root package name */
    private static final ConcurrentHashMap<String, h> f3566e = new ConcurrentHashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private static final ConcurrentHashMap<String, h> f3567f = new ConcurrentHashMap<>();

    static {
        try {
            Locale.class.getMethod("getUnicodeLocaleType", String.class);
        } catch (Throwable unused) {
        }
    }

    public static h j(e eVar) {
        d.i(eVar, "temporal");
        h hVar = (h) eVar.g(j.a());
        return hVar != null ? hVar : m.f3582g;
    }

    private static void p() {
        ConcurrentHashMap<String, h> concurrentHashMap = f3566e;
        if (concurrentHashMap.isEmpty()) {
            t(m.f3582g);
            t(v.f3609g);
            t(r.f3602g);
            t(o.f3587h);
            j jVar = j.f3568g;
            t(jVar);
            concurrentHashMap.putIfAbsent("Hijrah", jVar);
            f3567f.putIfAbsent("islamic", jVar);
            Iterator it = ServiceLoader.load(h.class, h.class.getClassLoader()).iterator();
            while (it.hasNext()) {
                h hVar = (h) it.next();
                f3566e.putIfAbsent(hVar.l(), hVar);
                String k2 = hVar.k();
                if (k2 != null) {
                    f3567f.putIfAbsent(k2, hVar);
                }
            }
        }
    }

    public static h r(String str) {
        p();
        h hVar = f3566e.get(str);
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = f3567f.get(str);
        if (hVar2 != null) {
            return hVar2;
        }
        throw new b("Unknown chronology: " + str);
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h s(DataInput dataInput) {
        return r(dataInput.readUTF());
    }

    private static void t(h hVar) {
        f3566e.putIfAbsent(hVar.l(), hVar);
        String k2 = hVar.k();
        if (k2 != null) {
            f3567f.putIfAbsent(k2, hVar);
        }
    }

    private Object writeReplace() {
        return new u((byte) 11, this);
    }

    /* renamed from: a */
    public int compareTo(h hVar) {
        return l().compareTo(hVar.l());
    }

    public abstract b c(e eVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public <D extends b> D d(k.a.a.x.d dVar) {
        D d2 = (D) dVar;
        if (equals(d2.w())) {
            return d2;
        }
        throw new ClassCastException("Chrono mismatch, expected: " + l() + ", actual: " + d2.w().l());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <D extends b> d<D> e(k.a.a.x.d dVar) {
        d<D> dVar2 = (d) dVar;
        if (equals(dVar2.D().w())) {
            return dVar2;
        }
        throw new ClassCastException("Chrono mismatch, required: " + l() + ", supplied: " + dVar2.D().w().l());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && compareTo((h) obj) == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <D extends b> g<D> g(k.a.a.x.d dVar) {
        g<D> gVar = (g) dVar;
        if (equals(gVar.C().w())) {
            return gVar;
        }
        throw new ClassCastException("Chrono mismatch, required: " + l() + ", supplied: " + gVar.C().w().l());
    }

    public abstract i h(int i2);

    public int hashCode() {
        return getClass().hashCode() ^ l().hashCode();
    }

    public abstract String k();

    public abstract String l();

    public c<?> q(e eVar) {
        try {
            return c(eVar).u(k.a.a.h.w(eVar));
        } catch (b e2) {
            throw new b("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + eVar.getClass(), e2);
        }
    }

    public String toString() {
        return l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(Map<i, Long> map, a aVar, long j2) {
        Long l = map.get(aVar);
        if (l == null || l.longValue() == j2) {
            map.put(aVar, Long.valueOf(j2));
            return;
        }
        throw new b("Invalid state, field: " + aVar + " " + l + " conflicts with " + aVar + " " + j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(DataOutput dataOutput) {
        dataOutput.writeUTF(l());
    }

    public f<?> w(k.a.a.e eVar, q qVar) {
        return g.K(this, eVar, qVar);
    }
}

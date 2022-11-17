package kotlinx.coroutines;

import j.u.d;
import j.u.e;
import j.u.g;
import kotlinx.coroutines.internal.a0;
import kotlinx.coroutines.m2.b;
/* loaded from: classes.dex */
public final class e0 {
    private static final boolean a;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
        if (r0.equals("on") != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
        if (r0.equals("") != false) goto L19;
     */
    static {
        boolean z;
        String d2 = a0.d("kotlinx.coroutines.scheduler");
        if (d2 != null) {
            int hashCode = d2.hashCode();
            if (hashCode != 0) {
                if (hashCode != 3551) {
                    if (hashCode == 109935 && d2.equals("off")) {
                        z = false;
                    }
                }
                throw new IllegalStateException(("System property 'kotlinx.coroutines.scheduler' has unrecognized value '" + ((Object) d2) + '\'').toString());
            }
            a = z;
        }
        z = true;
        a = z;
    }

    public static final f0 a() {
        return a ? b.f3886k : v.f3930f;
    }

    public static final String b(g gVar) {
        i0 i0Var;
        String w;
        if (!o0.c() || (i0Var = (i0) gVar.get(i0.f3785f)) == null) {
            return null;
        }
        j0 j0Var = (j0) gVar.get(j0.f3819f);
        String str = "coroutine";
        if (!(j0Var == null || (w = j0Var.w()) == null)) {
            str = w;
        }
        return str + '#' + i0Var.w();
    }

    public static final g c(k0 k0Var, g gVar) {
        g plus = k0Var.g().plus(gVar);
        g plus2 = o0.c() ? plus.plus(new i0(o0.b().incrementAndGet())) : plus;
        return (plus == v0.a() || plus.get(e.b) != null) ? plus2 : plus2.plus(v0.a());
    }

    public static final g2<?> d(j.u.j.a.e eVar) {
        while (!(eVar instanceof r0) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof g2) {
                return (g2) eVar;
            }
        }
        return null;
    }

    public static final g2<?> e(d<?> dVar, g gVar, Object obj) {
        if (!(dVar instanceof j.u.j.a.e)) {
            return null;
        }
        if (!(gVar.get(h2.f3784e) != null)) {
            return null;
        }
        g2<?> d2 = d((j.u.j.a.e) dVar);
        if (d2 != null) {
            d2.y0(gVar, obj);
        }
        return d2;
    }
}

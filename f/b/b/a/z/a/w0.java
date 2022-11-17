package f.b.b.a.z.a;

import f.b.b.a.z.a.e;
import f.b.b.a.z.a.e0;
import f.b.b.a.z.a.u1;
import f.b.b.a.z.a.v;
import f.b.b.a.z.a.z;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
final class w0<T> implements h1<T> {
    private final s0 a;
    private final o1<?, ?> b;
    private final boolean c;

    /* renamed from: d  reason: collision with root package name */
    private final r<?> f2636d;

    private w0(o1<?, ?> o1Var, r<?> rVar, s0 s0Var) {
        this.b = o1Var;
        this.c = rVar.e(s0Var);
        this.f2636d = rVar;
        this.a = s0Var;
    }

    private <UT, UB> int k(o1<UT, UB> o1Var, T t) {
        return o1Var.i(o1Var.g(t));
    }

    private <UT, UB, ET extends v.b<ET>> void l(o1<UT, UB> o1Var, r<ET> rVar, T t, g1 g1Var, q qVar) {
        UB f2 = o1Var.f(t);
        v<ET> d2 = rVar.d(t);
        do {
            try {
                if (g1Var.P() == Integer.MAX_VALUE) {
                    return;
                }
            } finally {
                o1Var.o(t, f2);
            }
        } while (n(g1Var, qVar, rVar, d2, o1Var, f2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> w0<T> m(o1<?, ?> o1Var, r<?> rVar, s0 s0Var) {
        return new w0<>(o1Var, rVar, s0Var);
    }

    private <UT, UB, ET extends v.b<ET>> boolean n(g1 g1Var, q qVar, r<ET> rVar, v<ET> vVar, o1<UT, UB> o1Var, UB ub) {
        int k2 = g1Var.k();
        if (k2 == u1.a) {
            int i2 = 0;
            Object obj = null;
            i iVar = null;
            while (g1Var.P() != Integer.MAX_VALUE) {
                int k3 = g1Var.k();
                if (k3 == u1.c) {
                    i2 = g1Var.i();
                    obj = rVar.b(qVar, this.a, i2);
                } else if (k3 == u1.f2596d) {
                    if (obj != null) {
                        rVar.h(g1Var, obj, qVar, vVar);
                    } else {
                        iVar = g1Var.d();
                    }
                } else if (!g1Var.q()) {
                    break;
                }
            }
            if (g1Var.k() == u1.b) {
                if (iVar != null) {
                    if (obj != null) {
                        rVar.i(iVar, obj, qVar, vVar);
                    } else {
                        o1Var.d(ub, i2, iVar);
                    }
                }
                return true;
            }
            throw c0.a();
        } else if (u1.b(k2) != 2) {
            return g1Var.q();
        } else {
            Object b = rVar.b(qVar, this.a, u1.a(k2));
            if (b == null) {
                return o1Var.m(ub, g1Var);
            }
            rVar.h(g1Var, b, qVar, vVar);
            return true;
        }
    }

    private <UT, UB> void o(o1<UT, UB> o1Var, T t, v1 v1Var) {
        o1Var.s(o1Var.g(t), v1Var);
    }

    @Override // f.b.b.a.z.a.h1
    public void a(T t, T t2) {
        j1.G(this.b, t, t2);
        if (this.c) {
            j1.E(this.f2636d, t, t2);
        }
    }

    @Override // f.b.b.a.z.a.h1
    public final boolean b(T t) {
        return this.f2636d.c(t).p();
    }

    @Override // f.b.b.a.z.a.h1
    public boolean c(T t, T t2) {
        if (!this.b.g(t).equals(this.b.g(t2))) {
            return false;
        }
        if (this.c) {
            return this.f2636d.c(t).equals(this.f2636d.c(t2));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cb A[EDGE_INSN: B:57:0x00cb->B:32:0x00cb ?: BREAK  , SYNTHETIC] */
    @Override // f.b.b.a.z.a.h1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(T t, byte[] bArr, int i2, int i3, e.b bVar) {
        z zVar = (z) t;
        p1 p1Var = zVar.unknownFields;
        if (p1Var == p1.e()) {
            p1Var = p1.l();
            zVar.unknownFields = p1Var;
        }
        v<z.d> N = ((z.c) t).N();
        z.e eVar = null;
        while (i2 < i3) {
            int I = e.I(bArr, i2, bVar);
            int i4 = bVar.a;
            if (i4 == u1.a) {
                int i5 = 0;
                i iVar = null;
                while (I < i3) {
                    I = e.I(bArr, I, bVar);
                    int i6 = bVar.a;
                    int a = u1.a(i6);
                    int b = u1.b(i6);
                    if (a != 2) {
                        if (a == 3) {
                            if (eVar != null) {
                                I = e.p(d1.a().d(eVar.b().getClass()), bArr, I, i3, bVar);
                                N.x(eVar.b, bVar.c);
                            } else if (b == 2) {
                                I = e.b(bArr, I, bVar);
                                iVar = (i) bVar.c;
                            }
                        }
                        if (i6 != u1.b) {
                            break;
                        }
                        I = e.N(i6, bArr, I, i3, bVar);
                    } else if (b == 0) {
                        I = e.I(bArr, I, bVar);
                        i5 = bVar.a;
                        eVar = (z.e) this.f2636d.b(bVar.f2509d, this.a, i5);
                    } else if (i6 != u1.b) {
                    }
                }
                if (iVar != null) {
                    p1Var.n(u1.c(i5, 2), iVar);
                }
                i2 = I;
            } else if (u1.b(i4) == 2) {
                z.e eVar2 = (z.e) this.f2636d.b(bVar.f2509d, this.a, u1.a(i4));
                if (eVar2 != null) {
                    i2 = e.p(d1.a().d(eVar2.b().getClass()), bArr, I, i3, bVar);
                    N.x(eVar2.b, bVar.c);
                } else {
                    i2 = e.G(i4, bArr, I, i3, p1Var, bVar);
                }
                eVar = eVar2;
            } else {
                i2 = e.N(i4, bArr, I, i3, bVar);
            }
        }
        if (i2 != i3) {
            throw c0.g();
        }
    }

    @Override // f.b.b.a.z.a.h1
    public void e(T t, v1 v1Var) {
        Iterator<Map.Entry<?, Object>> s = this.f2636d.c(t).s();
        while (s.hasNext()) {
            Map.Entry<?, Object> next = s.next();
            v.b bVar = (v.b) next.getKey();
            if (bVar.n() != u1.c.MESSAGE || bVar.f() || bVar.o()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            v1Var.m(bVar.b(), next instanceof e0.b ? ((e0.b) next).a().e() : next.getValue());
        }
        o(this.b, t, v1Var);
    }

    @Override // f.b.b.a.z.a.h1
    public int f(T t) {
        int k2 = k(this.b, t) + 0;
        return this.c ? k2 + this.f2636d.c(t).j() : k2;
    }

    @Override // f.b.b.a.z.a.h1
    public T g() {
        return (T) this.a.f().p();
    }

    @Override // f.b.b.a.z.a.h1
    public void h(T t, g1 g1Var, q qVar) {
        l(this.b, this.f2636d, t, g1Var, qVar);
    }

    @Override // f.b.b.a.z.a.h1
    public void i(T t) {
        this.b.j(t);
        this.f2636d.f(t);
    }

    @Override // f.b.b.a.z.a.h1
    public int j(T t) {
        int hashCode = this.b.g(t).hashCode();
        return this.c ? (hashCode * 53) + this.f2636d.c(t).hashCode() : hashCode;
    }
}

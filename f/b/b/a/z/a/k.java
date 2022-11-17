package f.b.b.a.z.a;

import f.b.b.a.z.a.c0;
import f.b.b.a.z.a.l0;
import f.b.b.a.z.a.u1;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class k implements g1 {
    private final j a;
    private int b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private int f2547d = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[u1.b.values().length];
            a = iArr;
            try {
                iArr[u1.b.n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[u1.b.r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[u1.b.f2597g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[u1.b.t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[u1.b.m.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[u1.b.l.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[u1.b.f2598h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[u1.b.f2601k.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[u1.b.f2599i.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[u1.b.q.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[u1.b.u.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[u1.b.v.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[u1.b.w.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[u1.b.x.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[u1.b.o.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[u1.b.s.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[u1.b.f2600j.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private k(j jVar) {
        b0.b(jVar, "input");
        j jVar2 = jVar;
        this.a = jVar2;
        jVar2.c = this;
    }

    public static k S(j jVar) {
        k kVar = jVar.c;
        return kVar != null ? kVar : new k(jVar);
    }

    private Object T(u1.b bVar, Class<?> cls, q qVar) {
        switch (a.a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(N());
            case 2:
                return d();
            case 3:
                return Double.valueOf(o());
            case 4:
                return Integer.valueOf(f());
            case 5:
                return Integer.valueOf(J());
            case 6:
                return Long.valueOf(n());
            case 7:
                return Float.valueOf(t());
            case 8:
                return Integer.valueOf(j());
            case 9:
                return Long.valueOf(H());
            case 10:
                return L(cls, qVar);
            case 11:
                return Integer.valueOf(v());
            case 12:
                return Long.valueOf(R());
            case 13:
                return Integer.valueOf(r());
            case 14:
                return Long.valueOf(u());
            case 15:
                return I();
            case 16:
                return Integer.valueOf(i());
            case 17:
                return Long.valueOf(l());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private <T> T U(h1<T> h1Var, q qVar) {
        int i2 = this.c;
        this.c = u1.c(u1.a(this.b), 4);
        try {
            T g2 = h1Var.g();
            h1Var.h(g2, this, qVar);
            h1Var.i(g2);
            if (this.b == this.c) {
                return g2;
            }
            throw c0.g();
        } finally {
            this.c = i2;
        }
    }

    private <T> T V(h1<T> h1Var, q qVar) {
        j jVar;
        int A = this.a.A();
        j jVar2 = this.a;
        if (jVar2.a < jVar2.b) {
            int j2 = jVar2.j(A);
            T g2 = h1Var.g();
            this.a.a++;
            h1Var.h(g2, this, qVar);
            h1Var.i(g2);
            this.a.a(0);
            jVar.a--;
            this.a.i(j2);
            return g2;
        }
        throw c0.h();
    }

    private void X(int i2) {
        if (this.a.d() != i2) {
            throw c0.j();
        }
    }

    private void Y(int i2) {
        if (u1.b(this.b) != i2) {
            throw c0.d();
        }
    }

    private void Z(int i2) {
        if ((i2 & 3) != 0) {
            throw c0.g();
        }
    }

    private void a0(int i2) {
        if ((i2 & 7) != 0) {
            throw c0.g();
        }
    }

    @Override // f.b.b.a.z.a.g1
    public <T> T A(Class<T> cls, q qVar) {
        Y(3);
        return (T) U(d1.a().d(cls), qVar);
    }

    @Override // f.b.b.a.z.a.g1
    public void B(List<Long> list) {
        int i2;
        int z;
        int z2;
        if (list instanceof j0) {
            j0 j0Var = (j0) list;
            int b = u1.b(this.b);
            if (b == 0) {
                do {
                    j0Var.l(this.a.s());
                    if (!this.a.e()) {
                        z2 = this.a.z();
                    } else {
                        return;
                    }
                } while (z2 == this.b);
                this.f2547d = z2;
                return;
            } else if (b == 2) {
                i2 = this.a.d() + this.a.A();
                do {
                    j0Var.l(this.a.s());
                } while (this.a.d() < i2);
            } else {
                throw c0.d();
            }
        } else {
            int b2 = u1.b(this.b);
            if (b2 == 0) {
                do {
                    list.add(Long.valueOf(this.a.s()));
                    if (!this.a.e()) {
                        z = this.a.z();
                    } else {
                        return;
                    }
                } while (z == this.b);
                this.f2547d = z;
                return;
            } else if (b2 == 2) {
                i2 = this.a.d() + this.a.A();
                do {
                    list.add(Long.valueOf(this.a.s()));
                } while (this.a.d() < i2);
            } else {
                throw c0.d();
            }
        }
        X(i2);
    }

    @Override // f.b.b.a.z.a.g1
    public void C(List<Boolean> list) {
        int i2;
        int z;
        int z2;
        if (list instanceof g) {
            g gVar = (g) list;
            int b = u1.b(this.b);
            if (b == 0) {
                do {
                    gVar.l(this.a.k());
                    if (!this.a.e()) {
                        z2 = this.a.z();
                    } else {
                        return;
                    }
                } while (z2 == this.b);
                this.f2547d = z2;
                return;
            } else if (b == 2) {
                i2 = this.a.d() + this.a.A();
                do {
                    gVar.l(this.a.k());
                } while (this.a.d() < i2);
            } else {
                throw c0.d();
            }
        } else {
            int b2 = u1.b(this.b);
            if (b2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.a.k()));
                    if (!this.a.e()) {
                        z = this.a.z();
                    } else {
                        return;
                    }
                } while (z == this.b);
                this.f2547d = z;
                return;
            } else if (b2 == 2) {
                i2 = this.a.d() + this.a.A();
                do {
                    list.add(Boolean.valueOf(this.a.k()));
                } while (this.a.d() < i2);
            } else {
                throw c0.d();
            }
        }
        X(i2);
    }

    @Override // f.b.b.a.z.a.g1
    public void D(List<Long> list) {
        int z;
        int z2;
        if (list instanceof j0) {
            j0 j0Var = (j0) list;
            int b = u1.b(this.b);
            if (b == 1) {
                do {
                    j0Var.l(this.a.u());
                    if (!this.a.e()) {
                        z2 = this.a.z();
                    } else {
                        return;
                    }
                } while (z2 == this.b);
                this.f2547d = z2;
            } else if (b == 2) {
                int A = this.a.A();
                a0(A);
                int d2 = this.a.d() + A;
                do {
                    j0Var.l(this.a.u());
                } while (this.a.d() < d2);
            } else {
                throw c0.d();
            }
        } else {
            int b2 = u1.b(this.b);
            if (b2 == 1) {
                do {
                    list.add(Long.valueOf(this.a.u()));
                    if (!this.a.e()) {
                        z = this.a.z();
                    } else {
                        return;
                    }
                } while (z == this.b);
                this.f2547d = z;
            } else if (b2 == 2) {
                int A2 = this.a.A();
                a0(A2);
                int d3 = this.a.d() + A2;
                do {
                    list.add(Long.valueOf(this.a.u()));
                } while (this.a.d() < d3);
            } else {
                throw c0.d();
            }
        }
    }

    @Override // f.b.b.a.z.a.g1
    public String E() {
        Y(2);
        return this.a.x();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f.b.b.a.z.a.g1
    public <T> void F(List<T> list, h1<T> h1Var, q qVar) {
        int z;
        if (u1.b(this.b) == 3) {
            int i2 = this.b;
            do {
                list.add(U(h1Var, qVar));
                if (!this.a.e() && this.f2547d == 0) {
                    z = this.a.z();
                } else {
                    return;
                }
            } while (z == i2);
            this.f2547d = z;
            return;
        }
        throw c0.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f.b.b.a.z.a.g1
    public <T> void G(List<T> list, h1<T> h1Var, q qVar) {
        int z;
        if (u1.b(this.b) == 2) {
            int i2 = this.b;
            do {
                list.add(V(h1Var, qVar));
                if (!this.a.e() && this.f2547d == 0) {
                    z = this.a.z();
                } else {
                    return;
                }
            } while (z == i2);
            this.f2547d = z;
            return;
        }
        throw c0.d();
    }

    @Override // f.b.b.a.z.a.g1
    public long H() {
        Y(0);
        return this.a.s();
    }

    @Override // f.b.b.a.z.a.g1
    public String I() {
        Y(2);
        return this.a.y();
    }

    @Override // f.b.b.a.z.a.g1
    public int J() {
        Y(5);
        return this.a.o();
    }

    @Override // f.b.b.a.z.a.g1
    public void K(List<Long> list) {
        int z;
        int z2;
        if (list instanceof j0) {
            j0 j0Var = (j0) list;
            int b = u1.b(this.b);
            if (b == 1) {
                do {
                    j0Var.l(this.a.p());
                    if (!this.a.e()) {
                        z2 = this.a.z();
                    } else {
                        return;
                    }
                } while (z2 == this.b);
                this.f2547d = z2;
            } else if (b == 2) {
                int A = this.a.A();
                a0(A);
                int d2 = this.a.d() + A;
                do {
                    j0Var.l(this.a.p());
                } while (this.a.d() < d2);
            } else {
                throw c0.d();
            }
        } else {
            int b2 = u1.b(this.b);
            if (b2 == 1) {
                do {
                    list.add(Long.valueOf(this.a.p()));
                    if (!this.a.e()) {
                        z = this.a.z();
                    } else {
                        return;
                    }
                } while (z == this.b);
                this.f2547d = z;
            } else if (b2 == 2) {
                int A2 = this.a.A();
                a0(A2);
                int d3 = this.a.d() + A2;
                do {
                    list.add(Long.valueOf(this.a.p()));
                } while (this.a.d() < d3);
            } else {
                throw c0.d();
            }
        }
    }

    @Override // f.b.b.a.z.a.g1
    public <T> T L(Class<T> cls, q qVar) {
        Y(2);
        return (T) V(d1.a().d(cls), qVar);
    }

    @Override // f.b.b.a.z.a.g1
    public void M(List<Integer> list) {
        int i2;
        int z;
        int z2;
        if (list instanceof a0) {
            a0 a0Var = (a0) list;
            int b = u1.b(this.b);
            if (b == 0) {
                do {
                    a0Var.k(this.a.r());
                    if (!this.a.e()) {
                        z2 = this.a.z();
                    } else {
                        return;
                    }
                } while (z2 == this.b);
                this.f2547d = z2;
                return;
            } else if (b == 2) {
                i2 = this.a.d() + this.a.A();
                do {
                    a0Var.k(this.a.r());
                } while (this.a.d() < i2);
            } else {
                throw c0.d();
            }
        } else {
            int b2 = u1.b(this.b);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.r()));
                    if (!this.a.e()) {
                        z = this.a.z();
                    } else {
                        return;
                    }
                } while (z == this.b);
                this.f2547d = z;
                return;
            } else if (b2 == 2) {
                i2 = this.a.d() + this.a.A();
                do {
                    list.add(Integer.valueOf(this.a.r()));
                } while (this.a.d() < i2);
            } else {
                throw c0.d();
            }
        }
        X(i2);
    }

    @Override // f.b.b.a.z.a.g1
    public boolean N() {
        Y(0);
        return this.a.k();
    }

    @Override // f.b.b.a.z.a.g1
    public void O(List<Integer> list) {
        int i2;
        int z;
        int z2;
        if (list instanceof a0) {
            a0 a0Var = (a0) list;
            int b = u1.b(this.b);
            if (b == 0) {
                do {
                    a0Var.k(this.a.n());
                    if (!this.a.e()) {
                        z2 = this.a.z();
                    } else {
                        return;
                    }
                } while (z2 == this.b);
                this.f2547d = z2;
                return;
            } else if (b == 2) {
                i2 = this.a.d() + this.a.A();
                do {
                    a0Var.k(this.a.n());
                } while (this.a.d() < i2);
            } else {
                throw c0.d();
            }
        } else {
            int b2 = u1.b(this.b);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.n()));
                    if (!this.a.e()) {
                        z = this.a.z();
                    } else {
                        return;
                    }
                } while (z == this.b);
                this.f2547d = z;
                return;
            } else if (b2 == 2) {
                i2 = this.a.d() + this.a.A();
                do {
                    list.add(Integer.valueOf(this.a.n()));
                } while (this.a.d() < i2);
            } else {
                throw c0.d();
            }
        }
        X(i2);
    }

    @Override // f.b.b.a.z.a.g1
    public int P() {
        int i2 = this.f2547d;
        if (i2 != 0) {
            this.b = i2;
            this.f2547d = 0;
        } else {
            this.b = this.a.z();
        }
        int i3 = this.b;
        if (i3 == 0 || i3 == this.c) {
            return Integer.MAX_VALUE;
        }
        return u1.a(i3);
    }

    @Override // f.b.b.a.z.a.g1
    public void Q(List<String> list) {
        W(list, false);
    }

    @Override // f.b.b.a.z.a.g1
    public long R() {
        Y(1);
        return this.a.u();
    }

    public void W(List<String> list, boolean z) {
        int z2;
        int z3;
        if (u1.b(this.b) != 2) {
            throw c0.d();
        } else if (!(list instanceof h0) || z) {
            do {
                list.add(z ? I() : E());
                if (!this.a.e()) {
                    z2 = this.a.z();
                } else {
                    return;
                }
            } while (z2 == this.b);
            this.f2547d = z2;
        } else {
            h0 h0Var = (h0) list;
            do {
                h0Var.g(d());
                if (!this.a.e()) {
                    z3 = this.a.z();
                } else {
                    return;
                }
            } while (z3 == this.b);
            this.f2547d = z3;
        }
    }

    @Override // f.b.b.a.z.a.g1
    public <T> T a(h1<T> h1Var, q qVar) {
        Y(3);
        return (T) U(h1Var, qVar);
    }

    @Override // f.b.b.a.z.a.g1
    public void b(List<Long> list) {
        int i2;
        int z;
        int z2;
        if (list instanceof j0) {
            j0 j0Var = (j0) list;
            int b = u1.b(this.b);
            if (b == 0) {
                do {
                    j0Var.l(this.a.B());
                    if (!this.a.e()) {
                        z2 = this.a.z();
                    } else {
                        return;
                    }
                } while (z2 == this.b);
                this.f2547d = z2;
                return;
            } else if (b == 2) {
                i2 = this.a.d() + this.a.A();
                do {
                    j0Var.l(this.a.B());
                } while (this.a.d() < i2);
            } else {
                throw c0.d();
            }
        } else {
            int b2 = u1.b(this.b);
            if (b2 == 0) {
                do {
                    list.add(Long.valueOf(this.a.B()));
                    if (!this.a.e()) {
                        z = this.a.z();
                    } else {
                        return;
                    }
                } while (z == this.b);
                this.f2547d = z;
                return;
            } else if (b2 == 2) {
                i2 = this.a.d() + this.a.A();
                do {
                    list.add(Long.valueOf(this.a.B()));
                } while (this.a.d() < i2);
            } else {
                throw c0.d();
            }
        }
        X(i2);
    }

    @Override // f.b.b.a.z.a.g1
    public void c(List<String> list) {
        W(list, true);
    }

    @Override // f.b.b.a.z.a.g1
    public i d() {
        Y(2);
        return this.a.l();
    }

    @Override // f.b.b.a.z.a.g1
    public void e(List<Integer> list) {
        int i2;
        int z;
        int z2;
        if (list instanceof a0) {
            a0 a0Var = (a0) list;
            int b = u1.b(this.b);
            if (b == 0) {
                do {
                    a0Var.k(this.a.v());
                    if (!this.a.e()) {
                        z2 = this.a.z();
                    } else {
                        return;
                    }
                } while (z2 == this.b);
                this.f2547d = z2;
                return;
            } else if (b == 2) {
                i2 = this.a.d() + this.a.A();
                do {
                    a0Var.k(this.a.v());
                } while (this.a.d() < i2);
            } else {
                throw c0.d();
            }
        } else {
            int b2 = u1.b(this.b);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.v()));
                    if (!this.a.e()) {
                        z = this.a.z();
                    } else {
                        return;
                    }
                } while (z == this.b);
                this.f2547d = z;
                return;
            } else if (b2 == 2) {
                i2 = this.a.d() + this.a.A();
                do {
                    list.add(Integer.valueOf(this.a.v()));
                } while (this.a.d() < i2);
            } else {
                throw c0.d();
            }
        }
        X(i2);
    }

    @Override // f.b.b.a.z.a.g1
    public int f() {
        Y(0);
        return this.a.n();
    }

    @Override // f.b.b.a.z.a.g1
    public <T> T g(h1<T> h1Var, q qVar) {
        Y(2);
        return (T) V(h1Var, qVar);
    }

    @Override // f.b.b.a.z.a.g1
    public void h(List<Float> list) {
        int z;
        int z2;
        if (list instanceof x) {
            x xVar = (x) list;
            int b = u1.b(this.b);
            if (b == 2) {
                int A = this.a.A();
                Z(A);
                int d2 = this.a.d() + A;
                do {
                    xVar.k(this.a.q());
                } while (this.a.d() < d2);
            } else if (b == 5) {
                do {
                    xVar.k(this.a.q());
                    if (!this.a.e()) {
                        z2 = this.a.z();
                    } else {
                        return;
                    }
                } while (z2 == this.b);
                this.f2547d = z2;
            } else {
                throw c0.d();
            }
        } else {
            int b2 = u1.b(this.b);
            if (b2 == 2) {
                int A2 = this.a.A();
                Z(A2);
                int d3 = this.a.d() + A2;
                do {
                    list.add(Float.valueOf(this.a.q()));
                } while (this.a.d() < d3);
            } else if (b2 == 5) {
                do {
                    list.add(Float.valueOf(this.a.q()));
                    if (!this.a.e()) {
                        z = this.a.z();
                    } else {
                        return;
                    }
                } while (z == this.b);
                this.f2547d = z;
            } else {
                throw c0.d();
            }
        }
    }

    @Override // f.b.b.a.z.a.g1
    public int i() {
        Y(0);
        return this.a.A();
    }

    @Override // f.b.b.a.z.a.g1
    public int j() {
        Y(0);
        return this.a.r();
    }

    @Override // f.b.b.a.z.a.g1
    public int k() {
        return this.b;
    }

    @Override // f.b.b.a.z.a.g1
    public long l() {
        Y(0);
        return this.a.B();
    }

    @Override // f.b.b.a.z.a.g1
    public void m(List<Integer> list) {
        int z;
        int z2;
        if (list instanceof a0) {
            a0 a0Var = (a0) list;
            int b = u1.b(this.b);
            if (b == 2) {
                int A = this.a.A();
                Z(A);
                int d2 = this.a.d() + A;
                do {
                    a0Var.k(this.a.o());
                } while (this.a.d() < d2);
            } else if (b == 5) {
                do {
                    a0Var.k(this.a.o());
                    if (!this.a.e()) {
                        z2 = this.a.z();
                    } else {
                        return;
                    }
                } while (z2 == this.b);
                this.f2547d = z2;
            } else {
                throw c0.d();
            }
        } else {
            int b2 = u1.b(this.b);
            if (b2 == 2) {
                int A2 = this.a.A();
                Z(A2);
                int d3 = this.a.d() + A2;
                do {
                    list.add(Integer.valueOf(this.a.o()));
                } while (this.a.d() < d3);
            } else if (b2 == 5) {
                do {
                    list.add(Integer.valueOf(this.a.o()));
                    if (!this.a.e()) {
                        z = this.a.z();
                    } else {
                        return;
                    }
                } while (z == this.b);
                this.f2547d = z;
            } else {
                throw c0.d();
            }
        }
    }

    @Override // f.b.b.a.z.a.g1
    public long n() {
        Y(1);
        return this.a.p();
    }

    @Override // f.b.b.a.z.a.g1
    public double o() {
        Y(1);
        return this.a.m();
    }

    @Override // f.b.b.a.z.a.g1
    public void p(List<Integer> list) {
        int z;
        int z2;
        if (list instanceof a0) {
            a0 a0Var = (a0) list;
            int b = u1.b(this.b);
            if (b == 2) {
                int A = this.a.A();
                Z(A);
                int d2 = this.a.d() + A;
                do {
                    a0Var.k(this.a.t());
                } while (this.a.d() < d2);
            } else if (b == 5) {
                do {
                    a0Var.k(this.a.t());
                    if (!this.a.e()) {
                        z2 = this.a.z();
                    } else {
                        return;
                    }
                } while (z2 == this.b);
                this.f2547d = z2;
            } else {
                throw c0.d();
            }
        } else {
            int b2 = u1.b(this.b);
            if (b2 == 2) {
                int A2 = this.a.A();
                Z(A2);
                int d3 = this.a.d() + A2;
                do {
                    list.add(Integer.valueOf(this.a.t()));
                } while (this.a.d() < d3);
            } else if (b2 == 5) {
                do {
                    list.add(Integer.valueOf(this.a.t()));
                    if (!this.a.e()) {
                        z = this.a.z();
                    } else {
                        return;
                    }
                } while (z == this.b);
                this.f2547d = z;
            } else {
                throw c0.d();
            }
        }
    }

    @Override // f.b.b.a.z.a.g1
    public boolean q() {
        int i2;
        if (this.a.e() || (i2 = this.b) == this.c) {
            return false;
        }
        return this.a.C(i2);
    }

    @Override // f.b.b.a.z.a.g1
    public int r() {
        Y(0);
        return this.a.v();
    }

    @Override // f.b.b.a.z.a.g1
    public void s(List<Long> list) {
        int i2;
        int z;
        int z2;
        if (list instanceof j0) {
            j0 j0Var = (j0) list;
            int b = u1.b(this.b);
            if (b == 0) {
                do {
                    j0Var.l(this.a.w());
                    if (!this.a.e()) {
                        z2 = this.a.z();
                    } else {
                        return;
                    }
                } while (z2 == this.b);
                this.f2547d = z2;
                return;
            } else if (b == 2) {
                i2 = this.a.d() + this.a.A();
                do {
                    j0Var.l(this.a.w());
                } while (this.a.d() < i2);
            } else {
                throw c0.d();
            }
        } else {
            int b2 = u1.b(this.b);
            if (b2 == 0) {
                do {
                    list.add(Long.valueOf(this.a.w()));
                    if (!this.a.e()) {
                        z = this.a.z();
                    } else {
                        return;
                    }
                } while (z == this.b);
                this.f2547d = z;
                return;
            } else if (b2 == 2) {
                i2 = this.a.d() + this.a.A();
                do {
                    list.add(Long.valueOf(this.a.w()));
                } while (this.a.d() < i2);
            } else {
                throw c0.d();
            }
        }
        X(i2);
    }

    @Override // f.b.b.a.z.a.g1
    public float t() {
        Y(5);
        return this.a.q();
    }

    @Override // f.b.b.a.z.a.g1
    public long u() {
        Y(0);
        return this.a.w();
    }

    @Override // f.b.b.a.z.a.g1
    public int v() {
        Y(5);
        return this.a.t();
    }

    @Override // f.b.b.a.z.a.g1
    public void w(List<i> list) {
        int z;
        if (u1.b(this.b) == 2) {
            do {
                list.add(d());
                if (!this.a.e()) {
                    z = this.a.z();
                } else {
                    return;
                }
            } while (z == this.b);
            this.f2547d = z;
            return;
        }
        throw c0.d();
    }

    @Override // f.b.b.a.z.a.g1
    public void x(List<Integer> list) {
        int i2;
        int z;
        int z2;
        if (list instanceof a0) {
            a0 a0Var = (a0) list;
            int b = u1.b(this.b);
            if (b == 0) {
                do {
                    a0Var.k(this.a.A());
                    if (!this.a.e()) {
                        z2 = this.a.z();
                    } else {
                        return;
                    }
                } while (z2 == this.b);
                this.f2547d = z2;
                return;
            } else if (b == 2) {
                i2 = this.a.d() + this.a.A();
                do {
                    a0Var.k(this.a.A());
                } while (this.a.d() < i2);
            } else {
                throw c0.d();
            }
        } else {
            int b2 = u1.b(this.b);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.A()));
                    if (!this.a.e()) {
                        z = this.a.z();
                    } else {
                        return;
                    }
                } while (z == this.b);
                this.f2547d = z;
                return;
            } else if (b2 == 2) {
                i2 = this.a.d() + this.a.A();
                do {
                    list.add(Integer.valueOf(this.a.A()));
                } while (this.a.d() < i2);
            } else {
                throw c0.d();
            }
        }
        X(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // f.b.b.a.z.a.g1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <K, V> void y(Map<K, V> map, l0.a<K, V> aVar, q qVar) {
        Y(2);
        int j2 = this.a.j(this.a.A());
        Object obj = aVar.b;
        Object obj2 = aVar.f2571d;
        while (true) {
            try {
                int P = P();
                if (P == Integer.MAX_VALUE || this.a.e()) {
                    break;
                } else if (P == 1) {
                    obj = T(aVar.a, null, null);
                } else if (P != 2) {
                    try {
                        if (!q()) {
                            throw new c0("Unable to parse map entry.");
                            break;
                        }
                    } catch (c0.a unused) {
                        if (!q()) {
                            throw new c0("Unable to parse map entry.");
                        }
                    }
                } else {
                    obj2 = T(aVar.c, aVar.f2571d.getClass(), qVar);
                }
            } finally {
                this.a.i(j2);
            }
        }
    }

    @Override // f.b.b.a.z.a.g1
    public void z(List<Double> list) {
        int z;
        int z2;
        if (list instanceof n) {
            n nVar = (n) list;
            int b = u1.b(this.b);
            if (b == 1) {
                do {
                    nVar.k(this.a.m());
                    if (!this.a.e()) {
                        z2 = this.a.z();
                    } else {
                        return;
                    }
                } while (z2 == this.b);
                this.f2547d = z2;
            } else if (b == 2) {
                int A = this.a.A();
                a0(A);
                int d2 = this.a.d() + A;
                do {
                    nVar.k(this.a.m());
                } while (this.a.d() < d2);
            } else {
                throw c0.d();
            }
        } else {
            int b2 = u1.b(this.b);
            if (b2 == 1) {
                do {
                    list.add(Double.valueOf(this.a.m()));
                    if (!this.a.e()) {
                        z = this.a.z();
                    } else {
                        return;
                    }
                } while (z == this.b);
                this.f2547d = z;
            } else if (b2 == 2) {
                int A2 = this.a.A();
                a0(A2);
                int d3 = this.a.d() + A2;
                do {
                    list.add(Double.valueOf(this.a.m()));
                } while (this.a.d() < d3);
            } else {
                throw c0.d();
            }
        }
    }
}

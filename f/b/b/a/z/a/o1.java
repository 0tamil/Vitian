package f.b.b.a.z.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class o1<T, B> {
    abstract void a(B b, int i2, int i3);

    abstract void b(B b, int i2, long j2);

    abstract void c(B b, int i2, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void d(B b, int i2, i iVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void e(B b, int i2, long j2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B f(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T g(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int h(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int i(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void j(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T k(T t, T t2);

    final void l(B b, g1 g1Var) {
        while (g1Var.P() != Integer.MAX_VALUE && m(b, g1Var)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean m(B b, g1 g1Var) {
        int k2 = g1Var.k();
        int a = u1.a(k2);
        int b2 = u1.b(k2);
        if (b2 == 0) {
            e(b, a, g1Var.H());
            return true;
        } else if (b2 == 1) {
            b(b, a, g1Var.n());
            return true;
        } else if (b2 == 2) {
            d(b, a, g1Var.d());
            return true;
        } else if (b2 == 3) {
            B n = n();
            int c = u1.c(a, 4);
            l(n, g1Var);
            if (c == g1Var.k()) {
                c(b, a, r(n));
                return true;
            }
            throw c0.a();
        } else if (b2 == 4) {
            return false;
        } else {
            if (b2 == 5) {
                a(b, a, g1Var.J());
                return true;
            }
            throw c0.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B n();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void o(Object obj, B b);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void p(Object obj, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean q(g1 g1Var);

    abstract T r(B b);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void s(T t, v1 v1Var);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void t(T t, v1 v1Var);
}

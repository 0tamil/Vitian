package k.a.a.u;

import java.io.Serializable;
import k.a.a.f;
import k.a.a.q;
import k.a.a.x.e;
import k.a.a.x.n;
/* loaded from: classes.dex */
public final class r extends h implements Serializable {

    /* renamed from: g  reason: collision with root package name */
    public static final r f3602g = new r();

    /* loaded from: classes.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[k.a.a.x.a.values().length];
            a = iArr;
            try {
                iArr[k.a.a.x.a.PROLEPTIC_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[k.a.a.x.a.YEAR_OF_ERA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[k.a.a.x.a.YEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private r() {
    }

    private Object readResolve() {
        return f3602g;
    }

    public n A(k.a.a.x.a aVar) {
        int i2 = a.a[aVar.ordinal()];
        if (i2 == 1) {
            n h2 = k.a.a.x.a.PROLEPTIC_MONTH.h();
            return n.i(h2.d() - 22932, h2.c() - 22932);
        } else if (i2 == 2) {
            n h3 = k.a.a.x.a.YEAR.h();
            return n.j(1L, h3.c() - 1911, (-h3.d()) + 1 + 1911);
        } else if (i2 != 3) {
            return aVar.h();
        } else {
            n h4 = k.a.a.x.a.YEAR.h();
            return n.i(h4.d() - 1911, h4.c() - 1911);
        }
    }

    @Override // k.a.a.u.h
    public String k() {
        return "roc";
    }

    @Override // k.a.a.u.h
    public String l() {
        return "Minguo";
    }

    @Override // k.a.a.u.h
    public c<s> q(e eVar) {
        return super.q(eVar);
    }

    @Override // k.a.a.u.h
    public f<s> w(k.a.a.e eVar, q qVar) {
        return super.w(eVar, qVar);
    }

    public s x(int i2, int i3, int i4) {
        return new s(f.Y(i2 + 1911, i3, i4));
    }

    /* renamed from: y */
    public s c(e eVar) {
        return eVar instanceof s ? (s) eVar : new s(f.I(eVar));
    }

    /* renamed from: z */
    public t h(int i2) {
        return t.a(i2);
    }
}

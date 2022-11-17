package f.b.c.z.n;

import f.b.c.b0.c;
import f.b.c.e;
import f.b.c.s;
import f.b.c.u;
import f.b.c.v;
import f.b.c.w;
import f.b.c.x;
/* loaded from: classes.dex */
public final class i extends w<Number> {
    private static final x b = g(u.f2704f);
    private final v a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements x {
        a() {
        }

        @Override // f.b.c.x
        public <T> w<T> create(e eVar, f.b.c.a0.a<T> aVar) {
            if (aVar.c() == Number.class) {
                return i.this;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[f.b.c.b0.b.values().length];
            a = iArr;
            try {
                iArr[f.b.c.b0.b.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[f.b.c.b0.b.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[f.b.c.b0.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private i(v vVar) {
        this.a = vVar;
    }

    public static x f(v vVar) {
        return vVar == u.f2704f ? b : g(vVar);
    }

    private static x g(v vVar) {
        return new a();
    }

    /* renamed from: h */
    public Number c(f.b.c.b0.a aVar) {
        f.b.c.b0.b G = aVar.G();
        int i2 = b.a[G.ordinal()];
        if (i2 == 1) {
            aVar.C();
            return null;
        } else if (i2 == 2 || i2 == 3) {
            return this.a.a(aVar);
        } else {
            throw new s("Expecting number, got: " + G);
        }
    }

    /* renamed from: i */
    public void e(c cVar, Number number) {
        cVar.H(number);
    }
}

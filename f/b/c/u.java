package f.b.c;

import f.b.c.z.g;
import java.math.BigDecimal;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public abstract class u extends Enum<u> implements v {

    /* renamed from: e  reason: collision with root package name */
    public static final u f2703e;

    /* renamed from: f  reason: collision with root package name */
    public static final u f2704f;

    /* renamed from: g  reason: collision with root package name */
    public static final u f2705g;

    /* renamed from: h  reason: collision with root package name */
    public static final u f2706h;

    /* renamed from: i  reason: collision with root package name */
    private static final /* synthetic */ u[] f2707i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: classes.dex */
    final class a extends u {
        a(String str, int i2) {
            super(str, i2, null);
        }

        /* renamed from: c */
        public Double a(f.b.c.b0.a aVar) {
            return Double.valueOf(aVar.x());
        }
    }

    static {
        a aVar = new a("DOUBLE", 0);
        f2703e = aVar;
        u bVar = new u("LAZILY_PARSED_NUMBER", 1) { // from class: f.b.c.u.b
            @Override // f.b.c.v
            public Number a(f.b.c.b0.a aVar2) {
                return new g(aVar2.E());
            }
        };
        f2704f = bVar;
        u cVar = new u("LONG_OR_DOUBLE", 2) { // from class: f.b.c.u.c
            @Override // f.b.c.v
            public Number a(f.b.c.b0.a aVar2) {
                String E = aVar2.E();
                try {
                    try {
                        return Long.valueOf(Long.parseLong(E));
                    } catch (NumberFormatException e2) {
                        throw new o("Cannot parse " + E + "; at path " + aVar2.o(), e2);
                    }
                } catch (NumberFormatException unused) {
                    Double valueOf = Double.valueOf(E);
                    if ((!valueOf.isInfinite() && !valueOf.isNaN()) || aVar2.r()) {
                        return valueOf;
                    }
                    throw new f.b.c.b0.d("JSON forbids NaN and infinities: " + valueOf + "; at path " + aVar2.o());
                }
            }
        };
        f2705g = cVar;
        u dVar = new u("BIG_DECIMAL", 3) { // from class: f.b.c.u.d
            /* renamed from: c */
            public BigDecimal a(f.b.c.b0.a aVar2) {
                String E = aVar2.E();
                try {
                    return new BigDecimal(E);
                } catch (NumberFormatException e2) {
                    throw new o("Cannot parse " + E + "; at path " + aVar2.o(), e2);
                }
            }
        };
        f2706h = dVar;
        f2707i = new u[]{aVar, bVar, cVar, dVar};
    }

    private u(String str, int i2) {
    }

    /* synthetic */ u(String str, int i2, a aVar) {
        this(str, i2);
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f2707i.clone();
    }
}

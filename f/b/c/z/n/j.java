package f.b.c.z.n;

import f.b.c.b0.c;
import f.b.c.e;
import f.b.c.u;
import f.b.c.v;
import f.b.c.w;
import f.b.c.x;
import f.b.c.z.h;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class j extends w<Object> {
    private static final x c = g(u.f2703e);
    private final e a;
    private final v b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements x {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ v f2754e;

        a(v vVar) {
            this.f2754e = vVar;
        }

        @Override // f.b.c.x
        public <T> w<T> create(e eVar, f.b.c.a0.a<T> aVar) {
            if (aVar.c() == Object.class) {
                return new j(eVar, this.f2754e, null);
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[f.b.c.b0.b.values().length];
            a = iArr;
            try {
                iArr[f.b.c.b0.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[f.b.c.b0.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[f.b.c.b0.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[f.b.c.b0.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[f.b.c.b0.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[f.b.c.b0.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private j(e eVar, v vVar) {
        this.a = eVar;
        this.b = vVar;
    }

    /* synthetic */ j(e eVar, v vVar, a aVar) {
        this(eVar, vVar);
    }

    public static x f(v vVar) {
        return vVar == u.f2703e ? c : g(vVar);
    }

    private static x g(v vVar) {
        return new a(vVar);
    }

    @Override // f.b.c.w
    public Object c(f.b.c.b0.a aVar) {
        switch (b.a[aVar.G().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.b();
                while (aVar.q()) {
                    arrayList.add(c(aVar));
                }
                aVar.i();
                return arrayList;
            case 2:
                h hVar = new h();
                aVar.c();
                while (aVar.q()) {
                    hVar.put(aVar.A(), c(aVar));
                }
                aVar.l();
                return hVar;
            case 3:
                return aVar.E();
            case 4:
                return this.b.a(aVar);
            case 5:
                return Boolean.valueOf(aVar.w());
            case 6:
                aVar.C();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // f.b.c.w
    public void e(c cVar, Object obj) {
        if (obj == null) {
            cVar.t();
            return;
        }
        w k2 = this.a.k(obj.getClass());
        if (k2 instanceof j) {
            cVar.f();
            cVar.l();
            return;
        }
        k2.e(cVar, obj);
    }
}

package k.a.a.u;

import java.io.Serializable;
import java.util.HashMap;
import k.a.a.f;
import k.a.a.q;
import k.a.a.x.e;
import k.a.a.x.n;
/* loaded from: classes.dex */
public final class v extends h implements Serializable {

    /* renamed from: g  reason: collision with root package name */
    public static final v f3609g = new v();

    /* renamed from: h  reason: collision with root package name */
    private static final HashMap<String, String[]> f3610h;

    /* renamed from: i  reason: collision with root package name */
    private static final HashMap<String, String[]> f3611i;

    /* renamed from: j  reason: collision with root package name */
    private static final HashMap<String, String[]> f3612j;

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

    static {
        HashMap<String, String[]> hashMap = new HashMap<>();
        f3610h = hashMap;
        HashMap<String, String[]> hashMap2 = new HashMap<>();
        f3611i = hashMap2;
        HashMap<String, String[]> hashMap3 = new HashMap<>();
        f3612j = hashMap3;
        hashMap.put("en", new String[]{"BB", "BE"});
        hashMap.put("th", new String[]{"BB", "BE"});
        hashMap2.put("en", new String[]{"B.B.", "B.E."});
        hashMap2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        hashMap3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        hashMap3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    private v() {
    }

    private Object readResolve() {
        return f3609g;
    }

    public n A(k.a.a.x.a aVar) {
        int i2 = a.a[aVar.ordinal()];
        if (i2 == 1) {
            n h2 = k.a.a.x.a.PROLEPTIC_MONTH.h();
            return n.i(h2.d() + 6516, h2.c() + 6516);
        } else if (i2 == 2) {
            n h3 = k.a.a.x.a.YEAR.h();
            return n.j(1L, 1 + (-(h3.d() + 543)), h3.c() + 543);
        } else if (i2 != 3) {
            return aVar.h();
        } else {
            n h4 = k.a.a.x.a.YEAR.h();
            return n.i(h4.d() + 543, h4.c() + 543);
        }
    }

    @Override // k.a.a.u.h
    public String k() {
        return "buddhist";
    }

    @Override // k.a.a.u.h
    public String l() {
        return "ThaiBuddhist";
    }

    @Override // k.a.a.u.h
    public c<w> q(e eVar) {
        return super.q(eVar);
    }

    @Override // k.a.a.u.h
    public f<w> w(k.a.a.e eVar, q qVar) {
        return super.w(eVar, qVar);
    }

    public w x(int i2, int i3, int i4) {
        return new w(f.Y(i2 - 543, i3, i4));
    }

    /* renamed from: y */
    public w c(e eVar) {
        return eVar instanceof w ? (w) eVar : new w(f.I(eVar));
    }

    /* renamed from: z */
    public x h(int i2) {
        return x.a(i2);
    }
}

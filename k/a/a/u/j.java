package k.a.a.u;

import java.io.Serializable;
import java.util.HashMap;
import k.a.a.b;
import k.a.a.q;
import k.a.a.x.a;
import k.a.a.x.e;
import k.a.a.x.n;
/* loaded from: classes.dex */
public final class j extends h implements Serializable {

    /* renamed from: g  reason: collision with root package name */
    public static final j f3568g = new j();

    /* renamed from: h  reason: collision with root package name */
    private static final HashMap<String, String[]> f3569h;

    /* renamed from: i  reason: collision with root package name */
    private static final HashMap<String, String[]> f3570i;

    /* renamed from: j  reason: collision with root package name */
    private static final HashMap<String, String[]> f3571j;

    static {
        HashMap<String, String[]> hashMap = new HashMap<>();
        f3569h = hashMap;
        HashMap<String, String[]> hashMap2 = new HashMap<>();
        f3570i = hashMap2;
        HashMap<String, String[]> hashMap3 = new HashMap<>();
        f3571j = hashMap3;
        hashMap.put("en", new String[]{"BH", "HE"});
        hashMap2.put("en", new String[]{"B.H.", "H.E."});
        hashMap3.put("en", new String[]{"Before Hijrah", "Hijrah Era"});
    }

    private j() {
    }

    private Object readResolve() {
        return f3568g;
    }

    public n A(a aVar) {
        return aVar.h();
    }

    @Override // k.a.a.u.h
    public String k() {
        return "islamic-umalqura";
    }

    @Override // k.a.a.u.h
    public String l() {
        return "Hijrah-umalqura";
    }

    @Override // k.a.a.u.h
    public c<k> q(e eVar) {
        return super.q(eVar);
    }

    @Override // k.a.a.u.h
    public f<k> w(k.a.a.e eVar, q qVar) {
        return super.w(eVar, qVar);
    }

    public k x(int i2, int i3, int i4) {
        return k.l0(i2, i3, i4);
    }

    /* renamed from: y */
    public k c(e eVar) {
        return eVar instanceof k ? (k) eVar : k.n0(eVar.l(a.EPOCH_DAY));
    }

    /* renamed from: z */
    public l h(int i2) {
        if (i2 == 0) {
            return l.BEFORE_AH;
        }
        if (i2 == 1) {
            return l.AH;
        }
        throw new b("invalid Hijrah era");
    }
}

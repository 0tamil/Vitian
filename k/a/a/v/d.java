package k.a.a.v;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import k.a.a.m;
import k.a.a.q;
import k.a.a.u.h;
import k.a.a.w.c;
import k.a.a.x.i;
import k.a.a.x.j;
import k.a.a.x.k;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d {
    private Locale a;
    private h b;
    private h c;

    /* renamed from: d  reason: collision with root package name */
    private q f3673d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f3674e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f3675f;

    /* renamed from: g  reason: collision with root package name */
    private final ArrayList<b> f3676g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class b extends c {

        /* renamed from: e  reason: collision with root package name */
        h f3677e;

        /* renamed from: f  reason: collision with root package name */
        q f3678f;

        /* renamed from: g  reason: collision with root package name */
        final Map<i, Long> f3679g;

        /* renamed from: h  reason: collision with root package name */
        boolean f3680h;

        /* renamed from: i  reason: collision with root package name */
        m f3681i;

        private b() {
            this.f3677e = null;
            this.f3678f = null;
            this.f3679g = new HashMap();
            this.f3681i = m.f3539h;
        }

        @Override // k.a.a.w.c, k.a.a.x.e
        public int e(i iVar) {
            if (this.f3679g.containsKey(iVar)) {
                return k.a.a.w.d.p(this.f3679g.get(iVar).longValue());
            }
            throw new k.a.a.x.m("Unsupported field: " + iVar);
        }

        @Override // k.a.a.w.c, k.a.a.x.e
        public <R> R g(k<R> kVar) {
            return kVar == j.a() ? (R) this.f3677e : (kVar == j.g() || kVar == j.f()) ? (R) this.f3678f : (R) super.g(kVar);
        }

        @Override // k.a.a.x.e
        public boolean j(i iVar) {
            return this.f3679g.containsKey(iVar);
        }

        @Override // k.a.a.x.e
        public long l(i iVar) {
            if (this.f3679g.containsKey(iVar)) {
                return this.f3679g.get(iVar).longValue();
            }
            throw new k.a.a.x.m("Unsupported field: " + iVar);
        }

        protected b t() {
            b bVar = new b();
            bVar.f3677e = this.f3677e;
            bVar.f3678f = this.f3678f;
            bVar.f3679g.putAll(this.f3679g);
            bVar.f3680h = this.f3680h;
            return bVar;
        }

        public String toString() {
            return this.f3679g.toString() + "," + this.f3677e + "," + this.f3678f;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public k.a.a.v.a u() {
            k.a.a.v.a aVar = new k.a.a.v.a();
            aVar.f3617e.putAll(this.f3679g);
            aVar.f3618f = d.this.g();
            q qVar = this.f3678f;
            if (qVar == null) {
                qVar = d.this.f3673d;
            }
            aVar.f3619g = qVar;
            aVar.f3622j = this.f3680h;
            aVar.f3623k = this.f3681i;
            return aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(k.a.a.v.b bVar) {
        this.f3674e = true;
        this.f3675f = true;
        ArrayList<b> arrayList = new ArrayList<>();
        this.f3676g = arrayList;
        this.a = bVar.f();
        this.b = bVar.e();
        this.c = bVar.d();
        this.f3673d = bVar.g();
        arrayList.add(new b());
    }

    d(d dVar) {
        this.f3674e = true;
        this.f3675f = true;
        ArrayList<b> arrayList = new ArrayList<>();
        this.f3676g = arrayList;
        this.a = dVar.a;
        this.b = dVar.b;
        this.c = dVar.c;
        this.f3673d = dVar.f3673d;
        this.f3674e = dVar.f3674e;
        this.f3675f = dVar.f3675f;
        arrayList.add(new b());
    }

    static boolean c(char c, char c2) {
        return c == c2 || Character.toUpperCase(c) == Character.toUpperCase(c2) || Character.toLowerCase(c) == Character.toLowerCase(c2);
    }

    private b e() {
        ArrayList<b> arrayList = this.f3676g;
        return arrayList.get(arrayList.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(char c, char c2) {
        return k() ? c == c2 : c(c, c2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d d() {
        return new d(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(boolean z) {
        ArrayList<b> arrayList;
        int i2;
        if (z) {
            arrayList = this.f3676g;
            i2 = arrayList.size() - 2;
        } else {
            arrayList = this.f3676g;
            i2 = arrayList.size() - 1;
        }
        arrayList.remove(i2);
    }

    h g() {
        h hVar = e().f3677e;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = this.c;
        return hVar2 == null ? k.a.a.u.m.f3582g : hVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Locale h() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Long i(i iVar) {
        return e().f3679g.get(iVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h j() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean k() {
        return this.f3674e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean l() {
        return this.f3675f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(boolean z) {
        this.f3674e = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(q qVar) {
        k.a.a.w.d.i(qVar, "zone");
        e().f3678f = qVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int o(i iVar, long j2, int i2, int i3) {
        k.a.a.w.d.i(iVar, "field");
        Long put = e().f3679g.put(iVar, Long.valueOf(j2));
        return (put == null || put.longValue() == j2) ? i3 : ~i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() {
        e().f3680h = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(boolean z) {
        this.f3675f = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r() {
        this.f3676g.add(e().t());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean s(CharSequence charSequence, int i2, CharSequence charSequence2, int i3, int i4) {
        if (i2 + i4 > charSequence.length() || i3 + i4 > charSequence2.length()) {
            return false;
        }
        if (k()) {
            for (int i5 = 0; i5 < i4; i5++) {
                if (charSequence.charAt(i2 + i5) != charSequence2.charAt(i3 + i5)) {
                    return false;
                }
            }
            return true;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            char charAt = charSequence.charAt(i2 + i6);
            char charAt2 = charSequence2.charAt(i3 + i6);
            if (!(charAt == charAt2 || Character.toUpperCase(charAt) == Character.toUpperCase(charAt2) || Character.toLowerCase(charAt) == Character.toLowerCase(charAt2))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b t() {
        return e();
    }

    public String toString() {
        return e().toString();
    }
}

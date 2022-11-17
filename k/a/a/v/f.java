package k.a.a.v;

import java.util.Locale;
import k.a.a.q;
import k.a.a.r;
import k.a.a.u.b;
import k.a.a.u.h;
import k.a.a.u.m;
import k.a.a.w.c;
import k.a.a.w.d;
import k.a.a.x.e;
import k.a.a.x.i;
import k.a.a.x.j;
import k.a.a.x.k;
import k.a.a.x.n;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f {
    private e a;
    private Locale b;
    private h c;

    /* renamed from: d  reason: collision with root package name */
    private int f3683d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends c {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b f3684e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e f3685f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h f3686g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ q f3687h;

        a(b bVar, e eVar, h hVar, q qVar) {
            this.f3684e = bVar;
            this.f3685f = eVar;
            this.f3686g = hVar;
            this.f3687h = qVar;
        }

        @Override // k.a.a.w.c, k.a.a.x.e
        public n c(i iVar) {
            return (this.f3684e == null || !iVar.a()) ? this.f3685f.c(iVar) : this.f3684e.c(iVar);
        }

        @Override // k.a.a.w.c, k.a.a.x.e
        public <R> R g(k<R> kVar) {
            return kVar == j.a() ? (R) this.f3686g : kVar == j.g() ? (R) this.f3687h : kVar == j.e() ? (R) this.f3685f.g(kVar) : kVar.a(this);
        }

        @Override // k.a.a.x.e
        public boolean j(i iVar) {
            return (this.f3684e == null || !iVar.a()) ? this.f3685f.j(iVar) : this.f3684e.j(iVar);
        }

        @Override // k.a.a.x.e
        public long l(i iVar) {
            return ((this.f3684e == null || !iVar.a()) ? this.f3685f : this.f3684e).l(iVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(e eVar, b bVar) {
        this.a = a(eVar, bVar);
        this.b = bVar.f();
        this.c = bVar.e();
    }

    private static e a(e eVar, b bVar) {
        k.a.a.x.a[] values;
        h d2 = bVar.d();
        q g2 = bVar.g();
        if (d2 == null && g2 == null) {
            return eVar;
        }
        h hVar = (h) eVar.g(j.a());
        q qVar = (q) eVar.g(j.g());
        b bVar2 = null;
        if (d.c(hVar, d2)) {
            d2 = null;
        }
        if (d.c(qVar, g2)) {
            g2 = null;
        }
        if (d2 == null && g2 == null) {
            return eVar;
        }
        h hVar2 = d2 != null ? d2 : hVar;
        if (g2 != null) {
            qVar = g2;
        }
        if (g2 != null) {
            if (eVar.j(k.a.a.x.a.INSTANT_SECONDS)) {
                if (hVar2 == null) {
                    hVar2 = m.f3582g;
                }
                return hVar2.w(k.a.a.e.v(eVar), g2);
            }
            q p = g2.p();
            r rVar = (r) eVar.g(j.d());
            if ((p instanceof r) && rVar != null && !p.equals(rVar)) {
                throw new k.a.a.b("Invalid override zone for temporal: " + g2 + " " + eVar);
            }
        }
        if (d2 != null) {
            if (eVar.j(k.a.a.x.a.EPOCH_DAY)) {
                bVar2 = hVar2.c(eVar);
            } else if (!(d2 == m.f3582g && hVar == null)) {
                for (k.a.a.x.a aVar : k.a.a.x.a.values()) {
                    if (aVar.a() && eVar.j(aVar)) {
                        throw new k.a.a.b("Invalid override chronology for temporal: " + d2 + " " + eVar);
                    }
                }
            }
        }
        return new a(bVar2, eVar, hVar2, qVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        this.f3683d--;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Locale c() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h d() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e e() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Long f(i iVar) {
        try {
            return Long.valueOf(this.a.l(iVar));
        } catch (k.a.a.b e2) {
            if (this.f3683d > 0) {
                return null;
            }
            throw e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <R> R g(k<R> kVar) {
        R r = (R) this.a.g(kVar);
        if (r != null || this.f3683d != 0) {
            return r;
        }
        throw new k.a.a.b("Unable to extract value: " + this.a.getClass());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        this.f3683d++;
    }

    public String toString() {
        return this.a.toString();
    }
}

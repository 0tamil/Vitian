package f.b.c.z.p;

import f.b.c.e;
import f.b.c.w;
import f.b.c.x;
import java.sql.Timestamp;
import java.util.Date;
/* loaded from: classes.dex */
class c extends w<Timestamp> {
    static final x b = new a();
    private final w<Date> a;

    /* loaded from: classes.dex */
    class a implements x {
        a() {
        }

        @Override // f.b.c.x
        public <T> w<T> create(e eVar, f.b.c.a0.a<T> aVar) {
            if (aVar.c() == Timestamp.class) {
                return new c(eVar.k(Date.class), null);
            }
            return null;
        }
    }

    private c(w<Date> wVar) {
        this.a = wVar;
    }

    /* synthetic */ c(w wVar, a aVar) {
        this(wVar);
    }

    /* renamed from: f */
    public Timestamp c(f.b.c.b0.a aVar) {
        Date c = this.a.c(aVar);
        if (c != null) {
            return new Timestamp(c.getTime());
        }
        return null;
    }

    /* renamed from: g */
    public void e(f.b.c.b0.c cVar, Timestamp timestamp) {
        this.a.e(cVar, timestamp);
    }
}

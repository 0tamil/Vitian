package f.b.c.z.p;

import f.b.c.b0.b;
import f.b.c.b0.c;
import f.b.c.e;
import f.b.c.s;
import f.b.c.w;
import f.b.c.x;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/* loaded from: classes.dex */
final class a extends w<Date> {
    static final x b = new C0111a();
    private final DateFormat a;

    /* renamed from: f.b.c.z.p.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0111a implements x {
        C0111a() {
        }

        @Override // f.b.c.x
        public <T> w<T> create(e eVar, f.b.c.a0.a<T> aVar) {
            if (aVar.c() == Date.class) {
                return new a(null);
            }
            return null;
        }
    }

    private a() {
        this.a = new SimpleDateFormat("MMM d, yyyy");
    }

    /* synthetic */ a(C0111a aVar) {
        this();
    }

    /* renamed from: f */
    public synchronized Date c(f.b.c.b0.a aVar) {
        if (aVar.G() == b.NULL) {
            aVar.C();
            return null;
        }
        try {
            return new Date(this.a.parse(aVar.E()).getTime());
        } catch (ParseException e2) {
            throw new s(e2);
        }
    }

    /* renamed from: g */
    public synchronized void e(c cVar, Date date) {
        cVar.I(date == null ? null : this.a.format((java.util.Date) date));
    }
}

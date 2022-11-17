package f.b.c.z.p;

import f.b.c.b0.c;
import f.b.c.e;
import f.b.c.s;
import f.b.c.w;
import f.b.c.x;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/* loaded from: classes.dex */
final class b extends w<Time> {
    static final x b = new a();
    private final DateFormat a;

    /* loaded from: classes.dex */
    class a implements x {
        a() {
        }

        @Override // f.b.c.x
        public <T> w<T> create(e eVar, f.b.c.a0.a<T> aVar) {
            if (aVar.c() == Time.class) {
                return new b(null);
            }
            return null;
        }
    }

    private b() {
        this.a = new SimpleDateFormat("hh:mm:ss a");
    }

    /* synthetic */ b(a aVar) {
        this();
    }

    /* renamed from: f */
    public synchronized Time c(f.b.c.b0.a aVar) {
        if (aVar.G() == f.b.c.b0.b.NULL) {
            aVar.C();
            return null;
        }
        try {
            return new Time(this.a.parse(aVar.E()).getTime());
        } catch (ParseException e2) {
            throw new s(e2);
        }
    }

    /* renamed from: g */
    public synchronized void e(c cVar, Time time) {
        cVar.I(time == null ? null : this.a.format((Date) time));
    }
}

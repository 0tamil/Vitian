package f.b.c.z.n;

import f.b.c.b0.b;
import f.b.c.e;
import f.b.c.s;
import f.b.c.w;
import f.b.c.x;
import f.b.c.z.j;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
/* loaded from: classes.dex */
public final class c extends w<Date> {
    public static final x b = new a();
    private final List<DateFormat> a;

    /* loaded from: classes.dex */
    class a implements x {
        a() {
        }

        @Override // f.b.c.x
        public <T> w<T> create(e eVar, f.b.c.a0.a<T> aVar) {
            if (aVar.c() == Date.class) {
                return new c();
            }
            return null;
        }
    }

    public c() {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (f.b.c.z.e.e()) {
            arrayList.add(j.c(2, 2));
        }
    }

    private synchronized Date f(String str) {
        for (DateFormat dateFormat : this.a) {
            try {
                return dateFormat.parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return f.b.c.z.n.o.a.c(str, new ParsePosition(0));
        } catch (ParseException e2) {
            throw new s(str, e2);
        }
    }

    /* renamed from: g */
    public Date c(f.b.c.b0.a aVar) {
        if (aVar.G() != b.NULL) {
            return f(aVar.E());
        }
        aVar.C();
        return null;
    }

    /* renamed from: h */
    public synchronized void e(f.b.c.b0.c cVar, Date date) {
        if (date == null) {
            cVar.t();
        } else {
            cVar.I(this.a.get(0).format(date));
        }
    }
}

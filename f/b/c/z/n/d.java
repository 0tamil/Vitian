package f.b.c.z.n;

import f.b.c.b0.c;
import f.b.c.s;
import f.b.c.w;
import f.b.c.x;
import f.b.c.z.e;
import f.b.c.z.j;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
/* loaded from: classes.dex */
public final class d<T extends Date> extends w<T> {
    private final b<T> a;
    private final List<DateFormat> b;

    /* loaded from: classes.dex */
    public static abstract class b<T extends Date> {
        public static final b<Date> b = new a(Date.class);
        private final Class<T> a;

        /* loaded from: classes.dex */
        class a extends b<Date> {
            a(Class cls) {
                super(cls);
            }

            @Override // f.b.c.z.n.d.b
            protected Date d(Date date) {
                return date;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b(Class<T> cls) {
            this.a = cls;
        }

        private final x c(d<T> dVar) {
            return n.a(this.a, dVar);
        }

        public final x a(int i2, int i3) {
            return c(new d<>(this, i2, i3));
        }

        public final x b(String str) {
            return c(new d<>(this, str));
        }

        protected abstract T d(Date date);
    }

    private d(b<T> bVar, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        f.b.c.z.a.b(bVar);
        this.a = bVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i2, i3, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i2, i3));
        }
        if (e.e()) {
            arrayList.add(j.c(i2, i3));
        }
    }

    private d(b<T> bVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        f.b.c.z.a.b(bVar);
        this.a = bVar;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(new SimpleDateFormat(str));
        }
    }

    private Date f(String str) {
        synchronized (this.b) {
            for (DateFormat dateFormat : this.b) {
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
    }

    /* renamed from: g */
    public T c(f.b.c.b0.a aVar) {
        if (aVar.G() == f.b.c.b0.b.NULL) {
            aVar.C();
            return null;
        }
        return this.a.d(f(aVar.E()));
    }

    /* renamed from: h */
    public void e(c cVar, Date date) {
        if (date == null) {
            cVar.t();
            return;
        }
        synchronized (this.b) {
            cVar.I(this.b.get(0).format(date));
        }
    }

    public String toString() {
        StringBuilder sb;
        String simpleName;
        DateFormat dateFormat = this.b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            sb = new StringBuilder();
            sb.append("DefaultDateTypeAdapter(");
            simpleName = ((SimpleDateFormat) dateFormat).toPattern();
        } else {
            sb = new StringBuilder();
            sb.append("DefaultDateTypeAdapter(");
            simpleName = dateFormat.getClass().getSimpleName();
        }
        sb.append(simpleName);
        sb.append(')');
        return sb.toString();
    }
}

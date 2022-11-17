package f.b.c.z.p;

import f.b.c.x;
import f.b.c.z.n.d;
import java.sql.Timestamp;
import java.util.Date;
/* loaded from: classes.dex */
public final class d {
    public static final boolean a;
    public static final d.b<? extends Date> b;
    public static final d.b<? extends Date> c;

    /* renamed from: d  reason: collision with root package name */
    public static final x f2789d;

    /* renamed from: e  reason: collision with root package name */
    public static final x f2790e;

    /* renamed from: f  reason: collision with root package name */
    public static final x f2791f;

    /* loaded from: classes.dex */
    class a extends d.b<java.sql.Date> {
        a(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: e */
        public java.sql.Date d(Date date) {
            return new java.sql.Date(date.getTime());
        }
    }

    /* loaded from: classes.dex */
    class b extends d.b<Timestamp> {
        b(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: e */
        public Timestamp d(Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z;
        x xVar;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
        if (z) {
            b = new a(java.sql.Date.class);
            c = new b(Timestamp.class);
            f2789d = f.b.c.z.p.a.b;
            f2790e = f.b.c.z.p.b.b;
            xVar = c.b;
        } else {
            xVar = null;
            b = null;
            c = null;
            f2789d = null;
            f2790e = null;
        }
        f2791f = xVar;
    }
}

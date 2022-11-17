package f.b.c.z.n;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
/* loaded from: classes.dex */
public final class n {
    public static final f.b.c.x B;
    public static final f.b.c.w<StringBuilder> C;
    public static final f.b.c.x D;
    public static final f.b.c.w<StringBuffer> E;
    public static final f.b.c.x F;
    public static final f.b.c.w<URL> G;
    public static final f.b.c.x H;
    public static final f.b.c.w<URI> I;
    public static final f.b.c.x J;
    public static final f.b.c.w<InetAddress> K;
    public static final f.b.c.x L;
    public static final f.b.c.w<UUID> M;
    public static final f.b.c.x N;
    public static final f.b.c.w<Currency> O;
    public static final f.b.c.x P;
    public static final f.b.c.w<Calendar> Q;
    public static final f.b.c.x R;
    public static final f.b.c.w<Locale> S;
    public static final f.b.c.x T;
    public static final f.b.c.w<f.b.c.k> U;
    public static final f.b.c.x V;
    public static final f.b.c.w<Class> a;
    public static final f.b.c.x b;
    public static final f.b.c.w<BitSet> c;

    /* renamed from: d  reason: collision with root package name */
    public static final f.b.c.x f2770d;

    /* renamed from: e  reason: collision with root package name */
    public static final f.b.c.w<Boolean> f2771e;

    /* renamed from: g  reason: collision with root package name */
    public static final f.b.c.x f2773g;

    /* renamed from: h  reason: collision with root package name */
    public static final f.b.c.w<Number> f2774h;

    /* renamed from: i  reason: collision with root package name */
    public static final f.b.c.x f2775i;

    /* renamed from: j  reason: collision with root package name */
    public static final f.b.c.w<Number> f2776j;

    /* renamed from: k  reason: collision with root package name */
    public static final f.b.c.x f2777k;
    public static final f.b.c.w<Number> l;
    public static final f.b.c.x m;
    public static final f.b.c.w<AtomicInteger> n;
    public static final f.b.c.x o;
    public static final f.b.c.w<AtomicBoolean> p;
    public static final f.b.c.x q;
    public static final f.b.c.w<AtomicIntegerArray> r;
    public static final f.b.c.x s;
    public static final f.b.c.w<Character> w;
    public static final f.b.c.x x;
    public static final f.b.c.w<String> y;

    /* renamed from: f  reason: collision with root package name */
    public static final f.b.c.w<Boolean> f2772f = new b0();
    public static final f.b.c.w<Number> t = new b();
    public static final f.b.c.w<Number> u = new c();
    public static final f.b.c.w<Number> v = new d();
    public static final f.b.c.w<BigDecimal> z = new g();
    public static final f.b.c.w<BigInteger> A = new h();
    public static final f.b.c.x W = new t();

    /* loaded from: classes.dex */
    class a extends f.b.c.w<AtomicIntegerArray> {
        a() {
        }

        /* renamed from: f */
        public AtomicIntegerArray c(f.b.c.b0.a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.b();
            while (aVar.q()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.y()));
                } catch (NumberFormatException e2) {
                    throw new f.b.c.s(e2);
                }
            }
            aVar.i();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i2 = 0; i2 < size; i2++) {
                atomicIntegerArray.set(i2, ((Integer) arrayList.get(i2)).intValue());
            }
            return atomicIntegerArray;
        }

        /* renamed from: g */
        public void e(f.b.c.b0.c cVar, AtomicIntegerArray atomicIntegerArray) {
            cVar.d();
            int length = atomicIntegerArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                cVar.F(atomicIntegerArray.get(i2));
            }
            cVar.i();
        }
    }

    /* loaded from: classes.dex */
    class a0 extends f.b.c.w<Boolean> {
        a0() {
        }

        /* renamed from: f */
        public Boolean c(f.b.c.b0.a aVar) {
            f.b.c.b0.b G = aVar.G();
            if (G != f.b.c.b0.b.NULL) {
                return G == f.b.c.b0.b.STRING ? Boolean.valueOf(Boolean.parseBoolean(aVar.E())) : Boolean.valueOf(aVar.w());
            }
            aVar.C();
            return null;
        }

        /* renamed from: g */
        public void e(f.b.c.b0.c cVar, Boolean bool) {
            cVar.G(bool);
        }
    }

    /* loaded from: classes.dex */
    class b extends f.b.c.w<Number> {
        b() {
        }

        /* renamed from: f */
        public Number c(f.b.c.b0.a aVar) {
            if (aVar.G() == f.b.c.b0.b.NULL) {
                aVar.C();
                return null;
            }
            try {
                return Long.valueOf(aVar.z());
            } catch (NumberFormatException e2) {
                throw new f.b.c.s(e2);
            }
        }

        /* renamed from: g */
        public void e(f.b.c.b0.c cVar, Number number) {
            cVar.H(number);
        }
    }

    /* loaded from: classes.dex */
    class b0 extends f.b.c.w<Boolean> {
        b0() {
        }

        /* renamed from: f */
        public Boolean c(f.b.c.b0.a aVar) {
            if (aVar.G() != f.b.c.b0.b.NULL) {
                return Boolean.valueOf(aVar.E());
            }
            aVar.C();
            return null;
        }

        /* renamed from: g */
        public void e(f.b.c.b0.c cVar, Boolean bool) {
            cVar.I(bool == null ? "null" : bool.toString());
        }
    }

    /* loaded from: classes.dex */
    class c extends f.b.c.w<Number> {
        c() {
        }

        /* renamed from: f */
        public Number c(f.b.c.b0.a aVar) {
            if (aVar.G() != f.b.c.b0.b.NULL) {
                return Float.valueOf((float) aVar.x());
            }
            aVar.C();
            return null;
        }

        /* renamed from: g */
        public void e(f.b.c.b0.c cVar, Number number) {
            cVar.H(number);
        }
    }

    /* loaded from: classes.dex */
    class c0 extends f.b.c.w<Number> {
        c0() {
        }

        /* renamed from: f */
        public Number c(f.b.c.b0.a aVar) {
            if (aVar.G() == f.b.c.b0.b.NULL) {
                aVar.C();
                return null;
            }
            try {
                return Byte.valueOf((byte) aVar.y());
            } catch (NumberFormatException e2) {
                throw new f.b.c.s(e2);
            }
        }

        /* renamed from: g */
        public void e(f.b.c.b0.c cVar, Number number) {
            cVar.H(number);
        }
    }

    /* loaded from: classes.dex */
    class d extends f.b.c.w<Number> {
        d() {
        }

        /* renamed from: f */
        public Number c(f.b.c.b0.a aVar) {
            if (aVar.G() != f.b.c.b0.b.NULL) {
                return Double.valueOf(aVar.x());
            }
            aVar.C();
            return null;
        }

        /* renamed from: g */
        public void e(f.b.c.b0.c cVar, Number number) {
            cVar.H(number);
        }
    }

    /* loaded from: classes.dex */
    class d0 extends f.b.c.w<Number> {
        d0() {
        }

        /* renamed from: f */
        public Number c(f.b.c.b0.a aVar) {
            if (aVar.G() == f.b.c.b0.b.NULL) {
                aVar.C();
                return null;
            }
            try {
                return Short.valueOf((short) aVar.y());
            } catch (NumberFormatException e2) {
                throw new f.b.c.s(e2);
            }
        }

        /* renamed from: g */
        public void e(f.b.c.b0.c cVar, Number number) {
            cVar.H(number);
        }
    }

    /* loaded from: classes.dex */
    class e extends f.b.c.w<Character> {
        e() {
        }

        /* renamed from: f */
        public Character c(f.b.c.b0.a aVar) {
            if (aVar.G() == f.b.c.b0.b.NULL) {
                aVar.C();
                return null;
            }
            String E = aVar.E();
            if (E.length() == 1) {
                return Character.valueOf(E.charAt(0));
            }
            throw new f.b.c.s("Expecting character, got: " + E);
        }

        /* renamed from: g */
        public void e(f.b.c.b0.c cVar, Character ch) {
            cVar.I(ch == null ? null : String.valueOf(ch));
        }
    }

    /* loaded from: classes.dex */
    class e0 extends f.b.c.w<Number> {
        e0() {
        }

        /* renamed from: f */
        public Number c(f.b.c.b0.a aVar) {
            if (aVar.G() == f.b.c.b0.b.NULL) {
                aVar.C();
                return null;
            }
            try {
                return Integer.valueOf(aVar.y());
            } catch (NumberFormatException e2) {
                throw new f.b.c.s(e2);
            }
        }

        /* renamed from: g */
        public void e(f.b.c.b0.c cVar, Number number) {
            cVar.H(number);
        }
    }

    /* loaded from: classes.dex */
    class f extends f.b.c.w<String> {
        f() {
        }

        /* renamed from: f */
        public String c(f.b.c.b0.a aVar) {
            f.b.c.b0.b G = aVar.G();
            if (G != f.b.c.b0.b.NULL) {
                return G == f.b.c.b0.b.BOOLEAN ? Boolean.toString(aVar.w()) : aVar.E();
            }
            aVar.C();
            return null;
        }

        /* renamed from: g */
        public void e(f.b.c.b0.c cVar, String str) {
            cVar.I(str);
        }
    }

    /* loaded from: classes.dex */
    class f0 extends f.b.c.w<AtomicInteger> {
        f0() {
        }

        /* renamed from: f */
        public AtomicInteger c(f.b.c.b0.a aVar) {
            try {
                return new AtomicInteger(aVar.y());
            } catch (NumberFormatException e2) {
                throw new f.b.c.s(e2);
            }
        }

        /* renamed from: g */
        public void e(f.b.c.b0.c cVar, AtomicInteger atomicInteger) {
            cVar.F(atomicInteger.get());
        }
    }

    /* loaded from: classes.dex */
    class g extends f.b.c.w<BigDecimal> {
        g() {
        }

        /* renamed from: f */
        public BigDecimal c(f.b.c.b0.a aVar) {
            if (aVar.G() == f.b.c.b0.b.NULL) {
                aVar.C();
                return null;
            }
            try {
                return new BigDecimal(aVar.E());
            } catch (NumberFormatException e2) {
                throw new f.b.c.s(e2);
            }
        }

        /* renamed from: g */
        public void e(f.b.c.b0.c cVar, BigDecimal bigDecimal) {
            cVar.H(bigDecimal);
        }
    }

    /* loaded from: classes.dex */
    class g0 extends f.b.c.w<AtomicBoolean> {
        g0() {
        }

        /* renamed from: f */
        public AtomicBoolean c(f.b.c.b0.a aVar) {
            return new AtomicBoolean(aVar.w());
        }

        /* renamed from: g */
        public void e(f.b.c.b0.c cVar, AtomicBoolean atomicBoolean) {
            cVar.J(atomicBoolean.get());
        }
    }

    /* loaded from: classes.dex */
    class h extends f.b.c.w<BigInteger> {
        h() {
        }

        /* renamed from: f */
        public BigInteger c(f.b.c.b0.a aVar) {
            if (aVar.G() == f.b.c.b0.b.NULL) {
                aVar.C();
                return null;
            }
            try {
                return new BigInteger(aVar.E());
            } catch (NumberFormatException e2) {
                throw new f.b.c.s(e2);
            }
        }

        /* renamed from: g */
        public void e(f.b.c.b0.c cVar, BigInteger bigInteger) {
            cVar.H(bigInteger);
        }
    }

    /* loaded from: classes.dex */
    private static final class h0<T extends Enum<T>> extends f.b.c.w<T> {
        private final Map<String, T> a = new HashMap();
        private final Map<T, String> b = new HashMap();

        /* loaded from: classes.dex */
        class a implements PrivilegedAction<Void> {
            final /* synthetic */ Field a;

            a(h0 h0Var, Field field) {
                this.a = field;
            }

            /* renamed from: a */
            public Void run() {
                this.a.setAccessible(true);
                return null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public h0(Class<T> cls) {
            Field[] declaredFields;
            try {
                for (Field field : cls.getDeclaredFields()) {
                    if (field.isEnumConstant()) {
                        AccessController.doPrivileged(new a(this, field));
                        Enum r4 = (Enum) field.get(null);
                        String name = r4.name();
                        f.b.c.y.c cVar = (f.b.c.y.c) field.getAnnotation(f.b.c.y.c.class);
                        if (cVar != null) {
                            name = cVar.value();
                            for (String str : cVar.alternate()) {
                                this.a.put(str, r4);
                            }
                        }
                        this.a.put(name, r4);
                        this.b.put(r4, name);
                    }
                }
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        /* renamed from: f */
        public T c(f.b.c.b0.a aVar) {
            if (aVar.G() != f.b.c.b0.b.NULL) {
                return this.a.get(aVar.E());
            }
            aVar.C();
            return null;
        }

        /* renamed from: g */
        public void e(f.b.c.b0.c cVar, T t) {
            cVar.I(t == null ? null : this.b.get(t));
        }
    }

    /* loaded from: classes.dex */
    class i extends f.b.c.w<StringBuilder> {
        i() {
        }

        /* renamed from: f */
        public StringBuilder c(f.b.c.b0.a aVar) {
            if (aVar.G() != f.b.c.b0.b.NULL) {
                return new StringBuilder(aVar.E());
            }
            aVar.C();
            return null;
        }

        /* renamed from: g */
        public void e(f.b.c.b0.c cVar, StringBuilder sb) {
            cVar.I(sb == null ? null : sb.toString());
        }
    }

    /* loaded from: classes.dex */
    class j extends f.b.c.w<StringBuffer> {
        j() {
        }

        /* renamed from: f */
        public StringBuffer c(f.b.c.b0.a aVar) {
            if (aVar.G() != f.b.c.b0.b.NULL) {
                return new StringBuffer(aVar.E());
            }
            aVar.C();
            return null;
        }

        /* renamed from: g */
        public void e(f.b.c.b0.c cVar, StringBuffer stringBuffer) {
            cVar.I(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    /* loaded from: classes.dex */
    class k extends f.b.c.w<Class> {
        k() {
        }

        @Override // f.b.c.w
        public /* bridge */ /* synthetic */ Class c(f.b.c.b0.a aVar) {
            f(aVar);
            throw null;
        }

        @Override // f.b.c.w
        public /* bridge */ /* synthetic */ void e(f.b.c.b0.c cVar, Class cls) {
            g(cVar, cls);
            throw null;
        }

        public Class f(f.b.c.b0.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        public void g(f.b.c.b0.c cVar, Class cls) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    /* loaded from: classes.dex */
    class l extends f.b.c.w<URL> {
        l() {
        }

        /* renamed from: f */
        public URL c(f.b.c.b0.a aVar) {
            if (aVar.G() == f.b.c.b0.b.NULL) {
                aVar.C();
                return null;
            }
            String E = aVar.E();
            if ("null".equals(E)) {
                return null;
            }
            return new URL(E);
        }

        /* renamed from: g */
        public void e(f.b.c.b0.c cVar, URL url) {
            cVar.I(url == null ? null : url.toExternalForm());
        }
    }

    /* loaded from: classes.dex */
    class m extends f.b.c.w<URI> {
        m() {
        }

        /* renamed from: f */
        public URI c(f.b.c.b0.a aVar) {
            if (aVar.G() == f.b.c.b0.b.NULL) {
                aVar.C();
                return null;
            }
            try {
                String E = aVar.E();
                if ("null".equals(E)) {
                    return null;
                }
                return new URI(E);
            } catch (URISyntaxException e2) {
                throw new f.b.c.l(e2);
            }
        }

        /* renamed from: g */
        public void e(f.b.c.b0.c cVar, URI uri) {
            cVar.I(uri == null ? null : uri.toASCIIString());
        }
    }

    /* renamed from: f.b.c.z.n.n$n  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0110n extends f.b.c.w<InetAddress> {
        C0110n() {
        }

        /* renamed from: f */
        public InetAddress c(f.b.c.b0.a aVar) {
            if (aVar.G() != f.b.c.b0.b.NULL) {
                return InetAddress.getByName(aVar.E());
            }
            aVar.C();
            return null;
        }

        /* renamed from: g */
        public void e(f.b.c.b0.c cVar, InetAddress inetAddress) {
            cVar.I(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    /* loaded from: classes.dex */
    class o extends f.b.c.w<UUID> {
        o() {
        }

        /* renamed from: f */
        public UUID c(f.b.c.b0.a aVar) {
            if (aVar.G() != f.b.c.b0.b.NULL) {
                return UUID.fromString(aVar.E());
            }
            aVar.C();
            return null;
        }

        /* renamed from: g */
        public void e(f.b.c.b0.c cVar, UUID uuid) {
            cVar.I(uuid == null ? null : uuid.toString());
        }
    }

    /* loaded from: classes.dex */
    class p extends f.b.c.w<Currency> {
        p() {
        }

        /* renamed from: f */
        public Currency c(f.b.c.b0.a aVar) {
            return Currency.getInstance(aVar.E());
        }

        /* renamed from: g */
        public void e(f.b.c.b0.c cVar, Currency currency) {
            cVar.I(currency.getCurrencyCode());
        }
    }

    /* loaded from: classes.dex */
    class q extends f.b.c.w<Calendar> {
        q() {
        }

        /* renamed from: f */
        public Calendar c(f.b.c.b0.a aVar) {
            if (aVar.G() == f.b.c.b0.b.NULL) {
                aVar.C();
                return null;
            }
            aVar.c();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (aVar.G() != f.b.c.b0.b.END_OBJECT) {
                String A = aVar.A();
                int y = aVar.y();
                if ("year".equals(A)) {
                    i2 = y;
                } else if ("month".equals(A)) {
                    i3 = y;
                } else if ("dayOfMonth".equals(A)) {
                    i4 = y;
                } else if ("hourOfDay".equals(A)) {
                    i5 = y;
                } else if ("minute".equals(A)) {
                    i6 = y;
                } else if ("second".equals(A)) {
                    i7 = y;
                }
            }
            aVar.l();
            return new GregorianCalendar(i2, i3, i4, i5, i6, i7);
        }

        /* renamed from: g */
        public void e(f.b.c.b0.c cVar, Calendar calendar) {
            if (calendar == null) {
                cVar.t();
                return;
            }
            cVar.f();
            cVar.r("year");
            cVar.F(calendar.get(1));
            cVar.r("month");
            cVar.F(calendar.get(2));
            cVar.r("dayOfMonth");
            cVar.F(calendar.get(5));
            cVar.r("hourOfDay");
            cVar.F(calendar.get(11));
            cVar.r("minute");
            cVar.F(calendar.get(12));
            cVar.r("second");
            cVar.F(calendar.get(13));
            cVar.l();
        }
    }

    /* loaded from: classes.dex */
    class r extends f.b.c.w<Locale> {
        r() {
        }

        /* renamed from: f */
        public Locale c(f.b.c.b0.a aVar) {
            String str = null;
            if (aVar.G() == f.b.c.b0.b.NULL) {
                aVar.C();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.E(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            }
            return (nextToken2 == null && str == null) ? new Locale(nextToken) : str == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, str);
        }

        /* renamed from: g */
        public void e(f.b.c.b0.c cVar, Locale locale) {
            cVar.I(locale == null ? null : locale.toString());
        }
    }

    /* loaded from: classes.dex */
    class s extends f.b.c.w<f.b.c.k> {
        s() {
        }

        /* renamed from: f */
        public f.b.c.k c(f.b.c.b0.a aVar) {
            if (aVar instanceof f.b.c.z.n.f) {
                return ((f.b.c.z.n.f) aVar).T();
            }
            switch (z.a[aVar.G().ordinal()]) {
                case 1:
                    return new f.b.c.p(new f.b.c.z.g(aVar.E()));
                case 2:
                    return new f.b.c.p(Boolean.valueOf(aVar.w()));
                case 3:
                    return new f.b.c.p(aVar.E());
                case 4:
                    aVar.C();
                    return f.b.c.m.a;
                case 5:
                    f.b.c.h hVar = new f.b.c.h();
                    aVar.b();
                    while (aVar.q()) {
                        hVar.p(c(aVar));
                    }
                    aVar.i();
                    return hVar;
                case 6:
                    f.b.c.n nVar = new f.b.c.n();
                    aVar.c();
                    while (aVar.q()) {
                        nVar.p(aVar.A(), c(aVar));
                    }
                    aVar.l();
                    return nVar;
                default:
                    throw new IllegalArgumentException();
            }
        }

        /* renamed from: g */
        public void e(f.b.c.b0.c cVar, f.b.c.k kVar) {
            if (kVar == null || kVar.m()) {
                cVar.t();
            } else if (kVar.o()) {
                f.b.c.p j2 = kVar.j();
                if (j2.w()) {
                    cVar.H(j2.t());
                } else if (j2.u()) {
                    cVar.J(j2.p());
                } else {
                    cVar.I(j2.k());
                }
            } else if (kVar.l()) {
                cVar.d();
                Iterator<f.b.c.k> it = kVar.h().iterator();
                while (it.hasNext()) {
                    e(cVar, it.next());
                }
                cVar.i();
            } else if (kVar.n()) {
                cVar.f();
                for (Map.Entry<String, f.b.c.k> entry : kVar.i().q()) {
                    cVar.r(entry.getKey());
                    e(cVar, entry.getValue());
                }
                cVar.l();
            } else {
                throw new IllegalArgumentException("Couldn't write " + kVar.getClass());
            }
        }
    }

    /* loaded from: classes.dex */
    class t implements f.b.c.x {
        t() {
        }

        @Override // f.b.c.x
        public <T> f.b.c.w<T> create(f.b.c.e eVar, f.b.c.a0.a<T> aVar) {
            Class c = aVar.c();
            if (!Enum.class.isAssignableFrom(c) || c == Enum.class) {
                return null;
            }
            if (!c.isEnum()) {
                c = (Class<? super Object>) c.getSuperclass();
            }
            return new h0(c);
        }
    }

    /* loaded from: classes.dex */
    class u extends f.b.c.w<BitSet> {
        u() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
            if (java.lang.Integer.parseInt(r1) != 0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
            r5 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
            if (r8.y() != 0) goto L22;
         */
        /* renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public BitSet c(f.b.c.b0.a aVar) {
            BitSet bitSet = new BitSet();
            aVar.b();
            f.b.c.b0.b G = aVar.G();
            int i2 = 0;
            while (G != f.b.c.b0.b.END_ARRAY) {
                int i3 = z.a[G.ordinal()];
                boolean z = true;
                if (i3 != 1) {
                    if (i3 == 2) {
                        z = aVar.w();
                    } else if (i3 == 3) {
                        String E = aVar.E();
                        try {
                        } catch (NumberFormatException unused) {
                            throw new f.b.c.s("Error: Expecting: bitset number value (1, 0), Found: " + E);
                        }
                    } else {
                        throw new f.b.c.s("Invalid bitset value type: " + G);
                    }
                    if (z) {
                        bitSet.set(i2);
                    }
                    i2++;
                    G = aVar.G();
                }
            }
            aVar.i();
            return bitSet;
        }

        /* renamed from: g */
        public void e(f.b.c.b0.c cVar, BitSet bitSet) {
            cVar.d();
            int length = bitSet.length();
            for (int i2 = 0; i2 < length; i2++) {
                cVar.F(bitSet.get(i2) ? 1L : 0L);
            }
            cVar.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class v implements f.b.c.x {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Class f2778e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f.b.c.w f2779f;

        v(Class cls, f.b.c.w wVar) {
            this.f2778e = cls;
            this.f2779f = wVar;
        }

        @Override // f.b.c.x
        public <T> f.b.c.w<T> create(f.b.c.e eVar, f.b.c.a0.a<T> aVar) {
            if (aVar.c() == this.f2778e) {
                return this.f2779f;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f2778e.getName() + ",adapter=" + this.f2779f + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class w implements f.b.c.x {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Class f2780e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Class f2781f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ f.b.c.w f2782g;

        w(Class cls, Class cls2, f.b.c.w wVar) {
            this.f2780e = cls;
            this.f2781f = cls2;
            this.f2782g = wVar;
        }

        @Override // f.b.c.x
        public <T> f.b.c.w<T> create(f.b.c.e eVar, f.b.c.a0.a<T> aVar) {
            Class<? super T> c = aVar.c();
            if (c == this.f2780e || c == this.f2781f) {
                return this.f2782g;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f2781f.getName() + "+" + this.f2780e.getName() + ",adapter=" + this.f2782g + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class x implements f.b.c.x {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Class f2783e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Class f2784f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ f.b.c.w f2785g;

        x(Class cls, Class cls2, f.b.c.w wVar) {
            this.f2783e = cls;
            this.f2784f = cls2;
            this.f2785g = wVar;
        }

        @Override // f.b.c.x
        public <T> f.b.c.w<T> create(f.b.c.e eVar, f.b.c.a0.a<T> aVar) {
            Class<? super T> c = aVar.c();
            if (c == this.f2783e || c == this.f2784f) {
                return this.f2785g;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f2783e.getName() + "+" + this.f2784f.getName() + ",adapter=" + this.f2785g + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class y implements f.b.c.x {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Class f2786e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f.b.c.w f2787f;

        /* loaded from: classes.dex */
        class a extends f.b.c.w<T1> {
            final /* synthetic */ Class a;

            a(Class cls) {
                this.a = cls;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, T1] */
            @Override // f.b.c.w
            public T1 c(f.b.c.b0.a aVar) {
                ?? c = y.this.f2787f.c(aVar);
                if (c == 0 || this.a.isInstance(c)) {
                    return c;
                }
                throw new f.b.c.s("Expected a " + this.a.getName() + " but was " + c.getClass().getName());
            }

            @Override // f.b.c.w
            public void e(f.b.c.b0.c cVar, T1 t1) {
                y.this.f2787f.e(cVar, t1);
            }
        }

        y(Class cls, f.b.c.w wVar) {
            this.f2786e = cls;
            this.f2787f = wVar;
        }

        @Override // f.b.c.x
        public <T2> f.b.c.w<T2> create(f.b.c.e eVar, f.b.c.a0.a<T2> aVar) {
            Class<? super T2> c = aVar.c();
            if (!this.f2786e.isAssignableFrom(c)) {
                return null;
            }
            return new a(c);
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.f2786e.getName() + ",adapter=" + this.f2787f + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class z {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[f.b.c.b0.b.values().length];
            a = iArr;
            try {
                iArr[f.b.c.b0.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[f.b.c.b0.b.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[f.b.c.b0.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[f.b.c.b0.b.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[f.b.c.b0.b.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[f.b.c.b0.b.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[f.b.c.b0.b.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[f.b.c.b0.b.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[f.b.c.b0.b.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[f.b.c.b0.b.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    static {
        f.b.c.w<Class> b2 = new k().b();
        a = b2;
        b = a(Class.class, b2);
        f.b.c.w<BitSet> b3 = new u().b();
        c = b3;
        f2770d = a(BitSet.class, b3);
        a0 a0Var = new a0();
        f2771e = a0Var;
        f2773g = b(Boolean.TYPE, Boolean.class, a0Var);
        c0 c0Var = new c0();
        f2774h = c0Var;
        f2775i = b(Byte.TYPE, Byte.class, c0Var);
        d0 d0Var = new d0();
        f2776j = d0Var;
        f2777k = b(Short.TYPE, Short.class, d0Var);
        e0 e0Var = new e0();
        l = e0Var;
        m = b(Integer.TYPE, Integer.class, e0Var);
        f.b.c.w<AtomicInteger> b4 = new f0().b();
        n = b4;
        o = a(AtomicInteger.class, b4);
        f.b.c.w<AtomicBoolean> b5 = new g0().b();
        p = b5;
        q = a(AtomicBoolean.class, b5);
        f.b.c.w<AtomicIntegerArray> b6 = new a().b();
        r = b6;
        s = a(AtomicIntegerArray.class, b6);
        e eVar = new e();
        w = eVar;
        x = b(Character.TYPE, Character.class, eVar);
        f fVar = new f();
        y = fVar;
        B = a(String.class, fVar);
        i iVar = new i();
        C = iVar;
        D = a(StringBuilder.class, iVar);
        j jVar = new j();
        E = jVar;
        F = a(StringBuffer.class, jVar);
        l lVar = new l();
        G = lVar;
        H = a(URL.class, lVar);
        m mVar = new m();
        I = mVar;
        J = a(URI.class, mVar);
        C0110n nVar = new C0110n();
        K = nVar;
        L = d(InetAddress.class, nVar);
        o oVar = new o();
        M = oVar;
        N = a(UUID.class, oVar);
        f.b.c.w<Currency> b7 = new p().b();
        O = b7;
        P = a(Currency.class, b7);
        q qVar = new q();
        Q = qVar;
        R = c(Calendar.class, GregorianCalendar.class, qVar);
        r rVar = new r();
        S = rVar;
        T = a(Locale.class, rVar);
        s sVar = new s();
        U = sVar;
        V = d(f.b.c.k.class, sVar);
    }

    public static <TT> f.b.c.x a(Class<TT> cls, f.b.c.w<TT> wVar) {
        return new v(cls, wVar);
    }

    public static <TT> f.b.c.x b(Class<TT> cls, Class<TT> cls2, f.b.c.w<? super TT> wVar) {
        return new w(cls, cls2, wVar);
    }

    public static <TT> f.b.c.x c(Class<TT> cls, Class<? extends TT> cls2, f.b.c.w<? super TT> wVar) {
        return new x(cls, cls2, wVar);
    }

    public static <T1> f.b.c.x d(Class<T1> cls, f.b.c.w<T1> wVar) {
        return new y(cls, wVar);
    }
}

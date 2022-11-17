package f.b.b.a.z.a;
/* loaded from: classes.dex */
public final class u1 {
    static final int a = c(1, 3);
    static final int b = c(1, 4);
    static final int c = c(2, 0);

    /* renamed from: d  reason: collision with root package name */
    static final int f2596d = c(3, 2);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: classes.dex */
    public static class b extends Enum<b> {

        /* renamed from: g  reason: collision with root package name */
        public static final b f2597g;

        /* renamed from: h  reason: collision with root package name */
        public static final b f2598h;

        /* renamed from: i  reason: collision with root package name */
        public static final b f2599i;

        /* renamed from: j  reason: collision with root package name */
        public static final b f2600j;

        /* renamed from: k  reason: collision with root package name */
        public static final b f2601k;
        public static final b l;
        public static final b m;
        public static final b n;
        public static final b o;
        public static final b p;
        public static final b q;
        public static final b r;
        public static final b s;
        public static final b t;
        public static final b u;
        public static final b v;
        public static final b w;
        public static final b x;
        private static final /* synthetic */ b[] y;

        /* renamed from: e  reason: collision with root package name */
        private final c f2602e;

        /* renamed from: f  reason: collision with root package name */
        private final int f2603f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
        /* loaded from: classes.dex */
        final class a extends b {
            a(String str, int i2, c cVar, int i3) {
                super(str, i2, cVar, i3);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
        /* renamed from: f.b.b.a.z.a.u1$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        final class C0102b extends b {
            C0102b(String str, int i2, c cVar, int i3) {
                super(str, i2, cVar, i3);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
        /* loaded from: classes.dex */
        final class c extends b {
            c(String str, int i2, c cVar, int i3) {
                super(str, i2, cVar, i3);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
        /* loaded from: classes.dex */
        final class d extends b {
            d(String str, int i2, c cVar, int i3) {
                super(str, i2, cVar, i3);
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            f2597g = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f2598h = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f2599i = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f2600j = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f2601k = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            l = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            m = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            n = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            o = aVar;
            c cVar3 = c.MESSAGE;
            C0102b bVar9 = new C0102b("GROUP", 9, cVar3, 3);
            p = bVar9;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            q = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            r = dVar;
            b bVar10 = new b("UINT32", 12, cVar2, 0);
            s = bVar10;
            b bVar11 = new b("ENUM", 13, c.ENUM, 0);
            t = bVar11;
            b bVar12 = new b("SFIXED32", 14, cVar2, 5);
            u = bVar12;
            b bVar13 = new b("SFIXED64", 15, cVar, 1);
            v = bVar13;
            b bVar14 = new b("SINT32", 16, cVar2, 0);
            w = bVar14;
            b bVar15 = new b("SINT64", 17, cVar, 0);
            x = bVar15;
            y = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, bVar9, cVar4, dVar, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15};
        }

        private b(String str, int i2, c cVar, int i3) {
            this.f2602e = cVar;
            this.f2603f = i3;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) y.clone();
        }

        public c a() {
            return this.f2602e;
        }

        public int c() {
            return this.f2603f;
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(i.f2526f),
        ENUM(null),
        MESSAGE(null);
        

        /* renamed from: e  reason: collision with root package name */
        private final Object f2610e;

        c(Object obj) {
            this.f2610e = obj;
        }
    }

    public static int a(int i2) {
        return i2 >>> 3;
    }

    public static int b(int i2) {
        return i2 & 7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(int i2, int i3) {
        return (i2 << 3) | i3;
    }
}

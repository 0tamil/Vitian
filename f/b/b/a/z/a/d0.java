package f.b.b.a.z.a;
/* JADX WARN: Init of enum h can be incorrect */
/* JADX WARN: Init of enum o can be incorrect */
/* loaded from: classes.dex */
public enum d0 {
    VOID(Void.class, Void.class, null),
    INT(r1, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(i.class, i.class, i.f2526f),
    ENUM(r1, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);
    

    /* renamed from: e  reason: collision with root package name */
    private final Class<?> f2507e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f2508f;

    static {
        Class cls = Integer.TYPE;
    }

    d0(Class cls, Class cls2, Object obj) {
        this.f2507e = cls2;
        this.f2508f = obj;
    }

    public Class<?> a() {
        return this.f2507e;
    }
}

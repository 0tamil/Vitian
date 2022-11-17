package f.b.c;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public abstract class t extends Enum<t> {

    /* renamed from: e  reason: collision with root package name */
    public static final t f2700e;

    /* renamed from: f  reason: collision with root package name */
    public static final t f2701f;

    /* renamed from: g  reason: collision with root package name */
    private static final /* synthetic */ t[] f2702g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: classes.dex */
    final class a extends t {
        a(String str, int i2) {
            super(str, i2, null);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        f2700e = aVar;
        t bVar = new t("STRING", 1) { // from class: f.b.c.t.b
        };
        f2701f = bVar;
        f2702g = new t[]{aVar, bVar};
    }

    private t(String str, int i2) {
    }

    /* synthetic */ t(String str, int i2, a aVar) {
        this(str, i2);
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f2702g.clone();
    }
}

package e.b.a.a;
/* loaded from: classes.dex */
public class a extends c {
    private static volatile a c;
    private c a;
    private c b;

    private a() {
        b bVar = new b();
        this.b = bVar;
        this.a = bVar;
    }

    public static a b() {
        if (c != null) {
            return c;
        }
        synchronized (a.class) {
            if (c == null) {
                c = new a();
            }
        }
        return c;
    }

    @Override // e.b.a.a.c
    public boolean a() {
        return this.a.a();
    }
}

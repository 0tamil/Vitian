package f.b.b.a.z.a;
/* loaded from: classes.dex */
public class n1 extends RuntimeException {
    public n1(s0 s0Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public c0 a() {
        return new c0(getMessage());
    }
}

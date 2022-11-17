package f.b.a.b.g;
/* loaded from: classes.dex */
public final class b extends IllegalStateException {
    private b(String str, Throwable th) {
        super(str, th);
    }

    public static IllegalStateException a(i<?> iVar) {
        String str;
        if (!iVar.m()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception i2 = iVar.i();
        if (i2 != null) {
            str = "failure";
        } else if (iVar.n()) {
            String valueOf = String.valueOf(iVar.j());
            String.valueOf(valueOf).length();
            str = "result ".concat(String.valueOf(valueOf));
        } else {
            str = iVar.l() ? "cancellation" : "unknown issue";
        }
        return new b(str.length() != 0 ? "Complete with: ".concat(str) : new String("Complete with: "), i2);
    }
}

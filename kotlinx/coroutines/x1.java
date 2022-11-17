package kotlinx.coroutines;
/* loaded from: classes.dex */
public abstract class x1 extends f0 {
    @Override // kotlinx.coroutines.f0
    public String toString() {
        String z = z();
        if (z != null) {
            return z;
        }
        return p0.a(this) + '@' + p0.b(this);
    }

    public abstract x1 y();

    /* JADX INFO: Access modifiers changed from: protected */
    public final String z() {
        x1 x1Var;
        x1 c = v0.c();
        if (this == c) {
            return "Dispatchers.Main";
        }
        try {
            x1Var = c.y();
        } catch (UnsupportedOperationException unused) {
            x1Var = null;
        }
        if (this == x1Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}

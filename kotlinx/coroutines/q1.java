package kotlinx.coroutines;
/* loaded from: classes.dex */
public class q1 extends u1 implements w {

    /* renamed from: f  reason: collision with root package name */
    private final boolean f3916f = s0();

    public q1(n1 n1Var) {
        super(true);
        R(n1Var);
    }

    private final boolean s0() {
        s N = N();
        t tVar = N instanceof t ? (t) N : null;
        if (tVar == null) {
            return false;
        }
        do {
            u1 z = tVar.z();
            if (z.K()) {
                return true;
            }
            s N2 = z.N();
            if (N2 instanceof t) {
                tVar = (t) N2;
                continue;
            } else {
                tVar = null;
                continue;
            }
        } while (tVar != null);
        return false;
    }

    @Override // kotlinx.coroutines.u1
    public boolean K() {
        return this.f3916f;
    }

    @Override // kotlinx.coroutines.u1
    public boolean L() {
        return true;
    }
}

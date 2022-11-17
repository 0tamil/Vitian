package kotlinx.coroutines;

import kotlinx.coroutines.internal.a;
/* loaded from: classes.dex */
public abstract class y0 extends f0 {

    /* renamed from: f  reason: collision with root package name */
    private long f3941f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f3942g;

    /* renamed from: h  reason: collision with root package name */
    private a<s0<?>> f3943h;

    public static /* synthetic */ void D(y0 y0Var, boolean z, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                z = false;
            }
            y0Var.C(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    private final long z(boolean z) {
        return z ? 4294967296L : 1L;
    }

    public final void A(s0<?> s0Var) {
        a<s0<?>> aVar = this.f3943h;
        if (aVar == null) {
            aVar = new a<>();
            this.f3943h = aVar;
        }
        aVar.a(s0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long B() {
        a<s0<?>> aVar = this.f3943h;
        return (aVar != null && !aVar.c()) ? 0L : Long.MAX_VALUE;
    }

    public final void C(boolean z) {
        this.f3941f += z(z);
        if (!z) {
            this.f3942g = true;
        }
    }

    public final boolean E() {
        return this.f3941f >= z(true);
    }

    public final boolean F() {
        a<s0<?>> aVar = this.f3943h;
        if (aVar == null) {
            return true;
        }
        return aVar.c();
    }

    public final boolean G() {
        s0<?> d2;
        a<s0<?>> aVar = this.f3943h;
        if (aVar == null || (d2 = aVar.d()) == null) {
            return false;
        }
        d2.run();
        return true;
    }

    protected void H() {
    }

    public final void y(boolean z) {
        long z2 = this.f3941f - z(z);
        this.f3941f = z2;
        if (z2 <= 0) {
            if (o0.a()) {
                if (!(this.f3941f == 0)) {
                    throw new AssertionError();
                }
            }
            if (this.f3942g) {
                H();
            }
        }
    }
}

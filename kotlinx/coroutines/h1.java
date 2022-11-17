package kotlinx.coroutines;
/* loaded from: classes.dex */
public final class h1 implements i1 {

    /* renamed from: e  reason: collision with root package name */
    private final y1 f3783e;

    public h1(y1 y1Var) {
        this.f3783e = y1Var;
    }

    @Override // kotlinx.coroutines.i1
    public boolean b() {
        return false;
    }

    @Override // kotlinx.coroutines.i1
    public y1 f() {
        return this.f3783e;
    }

    public String toString() {
        return o0.c() ? f().y("New") : super.toString();
    }
}

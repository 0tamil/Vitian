package kotlinx.coroutines;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class x0 implements i1 {

    /* renamed from: e  reason: collision with root package name */
    private final boolean f3940e;

    public x0(boolean z) {
        this.f3940e = z;
    }

    @Override // kotlinx.coroutines.i1
    public boolean b() {
        return this.f3940e;
    }

    @Override // kotlinx.coroutines.i1
    public y1 f() {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(b() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}

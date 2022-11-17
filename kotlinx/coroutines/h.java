package kotlinx.coroutines;
/* loaded from: classes.dex */
public final class h extends z0 {

    /* renamed from: k  reason: collision with root package name */
    private final Thread f3782k;

    public h(Thread thread) {
        this.f3782k = thread;
    }

    @Override // kotlinx.coroutines.a1
    protected Thread I() {
        return this.f3782k;
    }
}

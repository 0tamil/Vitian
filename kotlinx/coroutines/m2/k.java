package kotlinx.coroutines.m2;

import kotlinx.coroutines.p0;
/* loaded from: classes.dex */
public final class k extends i {

    /* renamed from: g  reason: collision with root package name */
    public final Runnable f3902g;

    public k(Runnable runnable, long j2, j jVar) {
        super(j2, jVar);
        this.f3902g = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f3902g.run();
        } finally {
            this.f3901f.t();
        }
    }

    public String toString() {
        return "Task[" + p0.a(this.f3902g) + '@' + p0.b(this.f3902g) + ", " + this.f3900e + ", " + this.f3901f + ']';
    }
}

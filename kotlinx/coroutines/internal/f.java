package kotlinx.coroutines.internal;

import j.u.g;
import kotlinx.coroutines.k0;
/* loaded from: classes.dex */
public final class f implements k0 {

    /* renamed from: e  reason: collision with root package name */
    private final g f3793e;

    public f(g gVar) {
        this.f3793e = gVar;
    }

    @Override // kotlinx.coroutines.k0
    public g g() {
        return this.f3793e;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + g() + ')';
    }
}

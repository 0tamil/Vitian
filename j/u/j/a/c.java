package j.u.j.a;

import j.u.d;
import j.u.g;
/* loaded from: classes.dex */
public final class c implements d<Object> {

    /* renamed from: e  reason: collision with root package name */
    public static final c f3472e = new c();

    private c() {
    }

    @Override // j.u.d
    public g getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // j.u.d
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}

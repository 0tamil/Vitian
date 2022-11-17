package kotlinx.coroutines;

import j.u.g;
/* loaded from: classes.dex */
public interface CoroutineExceptionHandler extends g.b {
    public static final a c = a.f3767e;

    /* loaded from: classes.dex */
    public static final class a implements g.c<CoroutineExceptionHandler> {

        /* renamed from: e  reason: collision with root package name */
        static final /* synthetic */ a f3767e = new a();

        private a() {
        }
    }

    void handleException(g gVar, Throwable th);
}

package androidx.window.layout;

import android.app.Activity;
import e.d.o.a;
import j.m;
import j.r;
import j.u.d;
import j.u.j.a.f;
import j.u.j.a.k;
import j.x.c.p;
import j.x.d.i;
import kotlinx.coroutines.j2.e;
import kotlinx.coroutines.j2.g;
import kotlinx.coroutines.j2.h;
import kotlinx.coroutines.k2.c;
@f(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", f = "WindowInfoTrackerImpl.kt", l = {54, 55}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class WindowInfoTrackerImpl$windowLayoutInfo$1 extends k implements p<c<? super WindowLayoutInfo>, d<? super r>, Object> {
    final /* synthetic */ Activity $activity;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ WindowInfoTrackerImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInfoTrackerImpl$windowLayoutInfo$1(WindowInfoTrackerImpl windowInfoTrackerImpl, Activity activity, d<? super WindowInfoTrackerImpl$windowLayoutInfo$1> dVar) {
        super(2, dVar);
        this.this$0 = windowInfoTrackerImpl;
        this.$activity = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invokeSuspend$lambda-0  reason: not valid java name */
    public static final void m7invokeSuspend$lambda0(kotlinx.coroutines.j2.f fVar, WindowLayoutInfo windowLayoutInfo) {
        i.c(windowLayoutInfo, "info");
        fVar.a(windowLayoutInfo);
    }

    @Override // j.u.j.a.a
    public final d<r> create(Object obj, d<?> dVar) {
        WindowInfoTrackerImpl$windowLayoutInfo$1 windowInfoTrackerImpl$windowLayoutInfo$1 = new WindowInfoTrackerImpl$windowLayoutInfo$1(this.this$0, this.$activity, dVar);
        windowInfoTrackerImpl$windowLayoutInfo$1.L$0 = obj;
        return windowInfoTrackerImpl$windowLayoutInfo$1;
    }

    public final Object invoke(c<? super WindowLayoutInfo> cVar, d<? super r> dVar) {
        return ((WindowInfoTrackerImpl$windowLayoutInfo$1) create(cVar, dVar)).invokeSuspend(r.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b A[Catch: all -> 0x009e, TRY_LEAVE, TryCatch #1 {all -> 0x009e, blocks: (B:17:0x0061, B:21:0x0073, B:23:0x007b), top: B:35:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0090 -> B:35:0x0061). Please submit an issue!!! */
    @Override // j.u.j.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object c;
        Throwable th;
        WindowInfoTrackerImpl$windowLayoutInfo$1 windowInfoTrackerImpl$windowLayoutInfo$1;
        WindowBackend windowBackend;
        c cVar;
        a<WindowLayoutInfo> aVar;
        g gVar;
        Object a;
        WindowBackend windowBackend2;
        WindowBackend windowBackend3;
        c = j.u.i.d.c();
        int i2 = this.label;
        try {
        } catch (Throwable th2) {
            th = th2;
            windowInfoTrackerImpl$windowLayoutInfo$1 = this;
        }
        try {
            if (i2 == 0) {
                m.b(obj);
                cVar = (c) this.L$0;
                final kotlinx.coroutines.j2.f b = h.b(10, e.DROP_OLDEST, null, 4, null);
                aVar = new a() { // from class: androidx.window.layout.c
                    @Override // e.d.o.a
                    public final void accept(Object obj2) {
                        WindowInfoTrackerImpl$windowLayoutInfo$1.m7invokeSuspend$lambda0(kotlinx.coroutines.j2.f.this, (WindowLayoutInfo) obj2);
                    }
                };
                windowBackend3 = this.this$0.windowBackend;
                windowBackend3.registerLayoutChangeCallback(this.$activity, a.f900e, aVar);
                gVar = b.iterator();
            } else if (i2 == 1) {
                gVar = (g) this.L$2;
                aVar = (a) this.L$1;
                c cVar2 = (c) this.L$0;
                m.b(obj);
                windowInfoTrackerImpl$windowLayoutInfo$1 = this;
                if (!((Boolean) obj).booleanValue()) {
                    windowInfoTrackerImpl$windowLayoutInfo$1.L$0 = cVar2;
                    windowInfoTrackerImpl$windowLayoutInfo$1.L$1 = aVar;
                    windowInfoTrackerImpl$windowLayoutInfo$1.L$2 = gVar;
                    windowInfoTrackerImpl$windowLayoutInfo$1.label = 2;
                    if (cVar2.emit((WindowLayoutInfo) gVar.next(), windowInfoTrackerImpl$windowLayoutInfo$1) == c) {
                        return c;
                    }
                    cVar = cVar2;
                    windowInfoTrackerImpl$windowLayoutInfo$1.L$0 = cVar;
                    windowInfoTrackerImpl$windowLayoutInfo$1.L$1 = aVar;
                    windowInfoTrackerImpl$windowLayoutInfo$1.L$2 = gVar;
                    windowInfoTrackerImpl$windowLayoutInfo$1.label = 1;
                    a = gVar.a(windowInfoTrackerImpl$windowLayoutInfo$1);
                    if (a != c) {
                        return c;
                    }
                    cVar2 = cVar;
                    obj = a;
                    if (!((Boolean) obj).booleanValue()) {
                        windowBackend2 = windowInfoTrackerImpl$windowLayoutInfo$1.this$0.windowBackend;
                        windowBackend2.unregisterLayoutChangeCallback(aVar);
                        return r.a;
                    }
                }
            } else if (i2 == 2) {
                gVar = (g) this.L$2;
                aVar = (a) this.L$1;
                cVar = (c) this.L$0;
                m.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            windowInfoTrackerImpl$windowLayoutInfo$1.L$0 = cVar;
            windowInfoTrackerImpl$windowLayoutInfo$1.L$1 = aVar;
            windowInfoTrackerImpl$windowLayoutInfo$1.L$2 = gVar;
            windowInfoTrackerImpl$windowLayoutInfo$1.label = 1;
            a = gVar.a(windowInfoTrackerImpl$windowLayoutInfo$1);
            if (a != c) {
            }
        } catch (Throwable th3) {
            th = th3;
            windowBackend = windowInfoTrackerImpl$windowLayoutInfo$1.this$0.windowBackend;
            windowBackend.unregisterLayoutChangeCallback(aVar);
            throw th;
        }
        windowInfoTrackerImpl$windowLayoutInfo$1 = this;
    }
}

package f.b.a.a.i.a0;

import com.google.android.datatransport.runtime.backends.e;
import com.google.android.datatransport.runtime.backends.m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.y;
import f.b.a.a.h;
import f.b.a.a.i.a0.j.j0;
import f.b.a.a.i.b0.b;
import f.b.a.a.i.j;
import f.b.a.a.i.p;
import f.b.a.a.i.t;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public class c implements e {

    /* renamed from: f  reason: collision with root package name */
    private static final Logger f2256f = Logger.getLogger(t.class.getName());
    private final y a;
    private final Executor b;
    private final e c;

    /* renamed from: d  reason: collision with root package name */
    private final j0 f2257d;

    /* renamed from: e  reason: collision with root package name */
    private final b f2258e;

    public c(Executor executor, e eVar, y yVar, j0 j0Var, b bVar) {
        this.b = executor;
        this.c = eVar;
        this.a = yVar;
        this.f2257d = j0Var;
        this.f2258e = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ Object c(p pVar, j jVar) {
        this.f2257d.u(pVar, jVar);
        this.a.a(pVar, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void e(final p pVar, h hVar, j jVar) {
        try {
            m a = this.c.a(pVar.b());
            if (a == null) {
                String format = String.format("Transport backend '%s' is not registered", pVar.b());
                f2256f.warning(format);
                hVar.a(new IllegalArgumentException(format));
                return;
            }
            final j a2 = a.a(jVar);
            this.f2258e.c(new b.a() { // from class: f.b.a.a.i.a0.b
                @Override // f.b.a.a.i.b0.b.a
                public final Object a() {
                    return c.this.c(pVar, a2);
                }
            });
            hVar.a(null);
        } catch (Exception e2) {
            Logger logger = f2256f;
            logger.warning("Error scheduling event " + e2.getMessage());
            hVar.a(e2);
        }
    }

    @Override // f.b.a.a.i.a0.e
    public void a(final p pVar, final j jVar, final h hVar) {
        this.b.execute(new Runnable() { // from class: f.b.a.a.i.a0.a
            @Override // java.lang.Runnable
            public final void run() {
                c.this.e(pVar, hVar, jVar);
            }
        });
    }
}

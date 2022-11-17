package f.b.a.b.g;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
final class c0 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ i f2407e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ d0 f2408f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c0(d0 d0Var, i iVar) {
        this.f2408f = d0Var;
        this.f2407e = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h hVar;
        try {
            hVar = this.f2408f.b;
            i a = hVar.a(this.f2407e.j());
            if (a == null) {
                this.f2408f.b(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = k.b;
            a.e(executor, this.f2408f);
            a.d(executor, this.f2408f);
            a.a(executor, this.f2408f);
        } catch (g e2) {
            if (e2.getCause() instanceof Exception) {
                this.f2408f.b((Exception) e2.getCause());
            } else {
                this.f2408f.b(e2);
            }
        } catch (CancellationException unused) {
            this.f2408f.a();
        } catch (Exception e3) {
            this.f2408f.b(e3);
        }
    }
}

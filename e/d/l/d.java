package e.d.l;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* loaded from: classes.dex */
public final class d {

    /* loaded from: classes.dex */
    private static class a implements Executor {

        /* renamed from: e  reason: collision with root package name */
        private final Handler f2077e;

        a(Handler handler) {
            e.d.o.d.d(handler);
            this.f2077e = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            Handler handler = this.f2077e;
            e.d.o.d.d(runnable);
            if (!handler.post(runnable)) {
                throw new RejectedExecutionException(this.f2077e + " is shutting down");
            }
        }
    }

    public static Executor a(Handler handler) {
        return new a(handler);
    }
}

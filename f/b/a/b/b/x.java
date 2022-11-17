package f.b.a.b.b;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.n.b;
import f.b.a.b.d.b.e;
import f.b.a.b.g.i;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class x {

    /* renamed from: e */
    private static x f2348e;
    private final Context a;
    private final ScheduledExecutorService b;
    private r c = new r(this, null);

    /* renamed from: d */
    private int f2349d = 1;

    x(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.b = scheduledExecutorService;
        this.a = context.getApplicationContext();
    }

    public static /* bridge */ /* synthetic */ Context a(x xVar) {
        return xVar.a;
    }

    public static synchronized x b(Context context) {
        x xVar;
        synchronized (x.class) {
            if (f2348e == null) {
                e.a();
                f2348e = new x(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new b("MessengerIpcClient"))));
            }
            xVar = f2348e;
        }
        return xVar;
    }

    public static /* bridge */ /* synthetic */ ScheduledExecutorService e(x xVar) {
        return xVar.b;
    }

    private final synchronized int f() {
        int i2;
        i2 = this.f2349d;
        this.f2349d = i2 + 1;
        return i2;
    }

    private final synchronized <T> i<T> g(u<T> uVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(uVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.c.g(uVar)) {
            r rVar = new r(this, null);
            this.c = rVar;
            rVar.g(uVar);
        }
        return uVar.b.a();
    }

    public final i<Void> c(int i2, Bundle bundle) {
        return g(new t(f(), 2, bundle));
    }

    public final i<Bundle> d(int i2, Bundle bundle) {
        return g(new w(f(), 1, bundle));
    }
}

package e.d.l;

import android.os.Build;
import android.os.CancellationSignal;
/* loaded from: classes.dex */
public final class b {
    private boolean a;
    private a b;
    private Object c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f2076d;

    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    private void d() {
        while (this.f2076d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void a() {
        synchronized (this) {
            if (!this.a) {
                this.a = true;
                this.f2076d = true;
                a aVar = this.b;
                Object obj = this.c;
                if (aVar != null) {
                    try {
                        aVar.a();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f2076d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (obj != null && Build.VERSION.SDK_INT >= 16) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f2076d = false;
                    notifyAll();
                }
            }
        }
    }

    public boolean b() {
        boolean z;
        synchronized (this) {
            z = this.a;
        }
        return z;
    }

    public void c(a aVar) {
        synchronized (this) {
            d();
            if (this.b != aVar) {
                this.b = aVar;
                if (this.a && aVar != null) {
                    aVar.a();
                }
            }
        }
    }
}

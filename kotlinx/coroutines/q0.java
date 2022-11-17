package kotlinx.coroutines;

import j.z.f;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
/* loaded from: classes.dex */
public final class q0 extends z0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: k  reason: collision with root package name */
    public static final q0 f3915k;
    private static final long l;

    static {
        Long l2;
        q0 q0Var = new q0();
        f3915k = q0Var;
        y0.D(q0Var, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        l = timeUnit.toNanos(l2.longValue());
    }

    private q0() {
    }

    private final synchronized void Z() {
        if (b0()) {
            debugStatus = 3;
            U();
            notifyAll();
        }
    }

    private final synchronized Thread a0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean b0() {
        int i2 = debugStatus;
        return i2 == 2 || i2 == 3;
    }

    private final synchronized boolean c0() {
        if (b0()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    @Override // kotlinx.coroutines.a1
    protected Thread I() {
        Thread thread = _thread;
        return thread == null ? a0() : thread;
    }

    @Override // java.lang.Runnable
    public void run() {
        e2.a.c(this);
        d a = e.a();
        if (a != null) {
            a.c();
        }
        try {
            if (c0()) {
                long j2 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long S = S();
                    if (S == Long.MAX_VALUE) {
                        d a2 = e.a();
                        long nanoTime = a2 == null ? System.nanoTime() : a2.a();
                        if (j2 == Long.MAX_VALUE) {
                            j2 = l + nanoTime;
                        }
                        long j3 = j2 - nanoTime;
                        if (j3 <= 0) {
                            _thread = null;
                            Z();
                            d a3 = e.a();
                            if (a3 != null) {
                                a3.g();
                            }
                            if (!R()) {
                                I();
                                return;
                            }
                            return;
                        }
                        S = f.d(S, j3);
                    } else {
                        j2 = Long.MAX_VALUE;
                    }
                    if (S > 0) {
                        if (b0()) {
                            _thread = null;
                            Z();
                            d a4 = e.a();
                            if (a4 != null) {
                                a4.g();
                            }
                            if (!R()) {
                                I();
                                return;
                            }
                            return;
                        }
                        d a5 = e.a();
                        if (a5 == null) {
                            LockSupport.parkNanos(this, S);
                        } else {
                            a5.b(this, S);
                        }
                    }
                }
            }
        } finally {
            _thread = null;
            Z();
            d a6 = e.a();
            if (a6 != null) {
                a6.g();
            }
            if (!R()) {
                I();
            }
        }
    }
}

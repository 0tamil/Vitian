package f.b.a.b.f;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.f;
import com.google.android.gms.common.util.l;
import com.google.android.gms.common.util.m;
import f.b.a.b.d.e.b;
import f.b.a.b.d.e.h;
import f.b.a.b.d.e.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class a {
    private static final long p = TimeUnit.DAYS.toMillis(366);
    private static volatile ScheduledExecutorService q = null;
    private static final Object r = new Object();
    private static volatile e s = new c();
    private final PowerManager.WakeLock b;

    /* renamed from: d  reason: collision with root package name */
    private Future<?> f2396d;

    /* renamed from: e  reason: collision with root package name */
    private long f2397e;

    /* renamed from: h  reason: collision with root package name */
    private int f2400h;

    /* renamed from: k  reason: collision with root package name */
    private WorkSource f2403k;
    private final String l;
    private final ScheduledExecutorService o;
    private final Object a = new Object();
    private int c = 0;

    /* renamed from: f  reason: collision with root package name */
    private final Set<f> f2398f = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    private boolean f2399g = true;

    /* renamed from: j  reason: collision with root package name */
    private e f2402j = f.b();
    private final Map<String, d> m = new HashMap();
    private AtomicInteger n = new AtomicInteger(0);

    /* renamed from: i  reason: collision with root package name */
    b f2401i = null;

    public a(Context context, int i2, String str) {
        String packageName = context.getPackageName();
        p.j(context, "WakeLock: context must not be null");
        p.f(str, "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf(str);
            this.l = valueOf.length() != 0 ? "*gcore*:".concat(valueOf) : new String("*gcore*:");
        } else {
            this.l = str;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new i(sb.toString());
        }
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(i2, str);
        this.b = newWakeLock;
        if (m.c(context)) {
            WorkSource b = m.b(context, l.a(packageName) ? context.getPackageName() : packageName);
            this.f2403k = b;
            if (b != null) {
                i(newWakeLock, b);
            }
        }
        ScheduledExecutorService scheduledExecutorService = q;
        if (scheduledExecutorService == null) {
            synchronized (r) {
                scheduledExecutorService = q;
                if (scheduledExecutorService == null) {
                    h.a();
                    scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                    q = scheduledExecutorService;
                }
            }
        }
        this.o = scheduledExecutorService;
    }

    public static /* synthetic */ void e(a aVar) {
        synchronized (aVar.a) {
            if (aVar.b()) {
                Log.e("WakeLock", String.valueOf(aVar.l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                aVar.g();
                if (aVar.b()) {
                    aVar.c = 1;
                    aVar.h(0);
                }
            }
        }
    }

    private final String f(String str) {
        if (!this.f2399g || !TextUtils.isEmpty(null)) {
        }
        return null;
    }

    private final void g() {
        if (!this.f2398f.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f2398f);
            this.f2398f.clear();
            if (arrayList.size() > 0) {
                f fVar = (f) arrayList.get(0);
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
        if (r5.f2401i != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
        r5.f2401i = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0084, code lost:
        if (r5.f2401i != null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void h(int i2) {
        synchronized (this.a) {
            if (b()) {
                if (this.f2399g) {
                    int i3 = this.c - 1;
                    this.c = i3;
                    if (i3 > 0) {
                        return;
                    }
                } else {
                    this.c = 0;
                }
                g();
                for (d dVar : this.m.values()) {
                    dVar.a = 0;
                }
                this.m.clear();
                Future<?> future = this.f2396d;
                if (future != null) {
                    future.cancel(false);
                    this.f2396d = null;
                    this.f2397e = 0L;
                }
                this.f2400h = 0;
                if (this.b.isHeld()) {
                    try {
                        this.b.release();
                    } catch (RuntimeException e2) {
                        if (e2.getClass().equals(RuntimeException.class)) {
                            Log.e("WakeLock", String.valueOf(this.l).concat(" failed to release!"), e2);
                        } else {
                            throw e2;
                        }
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.l).concat(" should be held!"));
                }
            }
        }
    }

    private static void i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e2) {
            Log.wtf("WakeLock", e2.toString());
        }
    }

    public void a(long j2) {
        this.n.incrementAndGet();
        long j3 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, p), 1L);
        if (j2 > 0) {
            max = Math.min(j2, max);
        }
        synchronized (this.a) {
            if (!b()) {
                this.f2401i = b.b(false, null);
                this.b.acquire();
                this.f2402j.a();
            }
            this.c++;
            this.f2400h++;
            f(null);
            d dVar = this.m.get(null);
            if (dVar == null) {
                dVar = new d(null);
                this.m.put(null, dVar);
            }
            dVar.a++;
            long a = this.f2402j.a();
            if (Long.MAX_VALUE - a > max) {
                j3 = a + max;
            }
            if (j3 > this.f2397e) {
                this.f2397e = j3;
                Future<?> future = this.f2396d;
                if (future != null) {
                    future.cancel(false);
                }
                this.f2396d = this.o.schedule(new Runnable() { // from class: f.b.a.b.f.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.e(a.this);
                    }
                }, max, TimeUnit.MILLISECONDS);
            }
        }
    }

    public boolean b() {
        boolean z;
        synchronized (this.a) {
            z = this.c > 0;
        }
        return z;
    }

    public void c() {
        if (this.n.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.l).concat(" release without a matched acquire!"));
        }
        synchronized (this.a) {
            f(null);
            if (this.m.containsKey(null)) {
                d dVar = this.m.get(null);
                if (dVar != null) {
                    int i2 = dVar.a - 1;
                    dVar.a = i2;
                    if (i2 == 0) {
                        this.m.remove(null);
                    }
                }
            } else {
                Log.w("WakeLock", String.valueOf(this.l).concat(" counter does not exist"));
            }
            h(0);
        }
    }

    public void d(boolean z) {
        synchronized (this.a) {
            this.f2399g = z;
        }
    }
}

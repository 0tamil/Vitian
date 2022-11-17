package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public abstract class c<T extends IInterface> {
    private static final com.google.android.gms.common.c[] B = new com.google.android.gms.common.c[0];
    private int a;
    private long b;
    private long c;

    /* renamed from: d  reason: collision with root package name */
    private int f1210d;

    /* renamed from: e  reason: collision with root package name */
    private long f1211e;

    /* renamed from: g  reason: collision with root package name */
    p1 f1213g;

    /* renamed from: h  reason: collision with root package name */
    private final Context f1214h;

    /* renamed from: i  reason: collision with root package name */
    private final i f1215i;

    /* renamed from: j  reason: collision with root package name */
    final Handler f1216j;
    private m m;
    protected AbstractC0029c n;
    private T o;
    private b1 q;
    private final a s;
    private final b t;
    private final int u;
    private final String v;
    private volatile String w;

    /* renamed from: f  reason: collision with root package name */
    private volatile String f1212f = null;

    /* renamed from: k  reason: collision with root package name */
    private final Object f1217k = new Object();
    private final Object l = new Object();
    private final ArrayList<z0<?>> p = new ArrayList<>();
    private int r = 1;
    private com.google.android.gms.common.a x = null;
    private boolean y = false;
    private volatile e1 z = null;
    protected AtomicInteger A = new AtomicInteger(0);

    /* loaded from: classes.dex */
    public interface a {
        void b(int i2);

        void d(Bundle bundle);
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(com.google.android.gms.common.a aVar);
    }

    /* renamed from: com.google.android.gms.common.internal.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface AbstractC0029c {
        void a(com.google.android.gms.common.a aVar);
    }

    /* loaded from: classes.dex */
    protected class d implements AbstractC0029c {
        public d() {
        }

        @Override // com.google.android.gms.common.internal.c.AbstractC0029c
        public final void a(com.google.android.gms.common.a aVar) {
            if (aVar.f()) {
                c cVar = c.this;
                cVar.k(null, cVar.G());
            } else if (c.this.t != null) {
                c.this.t.a(aVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c(Context context, Looper looper, i iVar, com.google.android.gms.common.e eVar, int i2, a aVar, b bVar, String str) {
        p.j(context, "Context must not be null");
        this.f1214h = context;
        p.j(looper, "Looper must not be null");
        p.j(iVar, "Supervisor must not be null");
        this.f1215i = iVar;
        p.j(eVar, "API availability must not be null");
        this.f1216j = new y0(this, looper);
        this.u = i2;
        this.s = aVar;
        this.t = bVar;
        this.v = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void f0(c cVar, e1 e1Var) {
        cVar.z = e1Var;
        if (cVar.V()) {
            f fVar = e1Var.f1233h;
            q.b().c(fVar == null ? null : fVar.g());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void g0(c cVar, int i2) {
        int i3;
        int i4;
        synchronized (cVar.f1217k) {
            i3 = cVar.r;
        }
        if (i3 == 3) {
            cVar.y = true;
            i4 = 5;
        } else {
            i4 = 4;
        }
        Handler handler = cVar.f1216j;
        handler.sendMessage(handler.obtainMessage(i4, cVar.A.get(), 16));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean j0(c cVar, int i2, int i3, IInterface iInterface) {
        synchronized (cVar.f1217k) {
            if (cVar.r != i2) {
                return false;
            }
            cVar.l0(i3, iInterface);
            return true;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException
        	at java.util.BitSet.or(BitSet.java:940)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:711)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:790)
        	at jadx.core.dex.visitors.regions.IfMakerHelper.restructureIf(IfMakerHelper.java:88)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:706)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    static /* bridge */ /* synthetic */ boolean k0(com.google.android.gms.common.internal.c r2) {
        /*
            boolean r0 = r2.y
            r1 = 0
            if (r0 == 0) goto L6
            goto L24
        L6:
            java.lang.String r0 = r2.I()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L11
            goto L24
        L11:
            java.lang.String r0 = r2.F()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1c
            goto L24
        L1c:
            java.lang.String r2 = r2.I()     // Catch: java.lang.ClassNotFoundException -> L24
            java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L24
            r1 = 1
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.c.k0(com.google.android.gms.common.internal.c):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l0(int i2, T t) {
        p1 p1Var;
        boolean z = false;
        if ((i2 == 4) == (t != null)) {
            z = true;
        }
        p.a(z);
        synchronized (this.f1217k) {
            this.r = i2;
            this.o = t;
            if (i2 == 1) {
                b1 b1Var = this.q;
                if (b1Var != null) {
                    i iVar = this.f1215i;
                    String c = this.f1213g.c();
                    p.i(c);
                    iVar.e(c, this.f1213g.b(), this.f1213g.a(), b1Var, a0(), this.f1213g.d());
                    this.q = null;
                }
            } else if (i2 == 2 || i2 == 3) {
                b1 b1Var2 = this.q;
                if (!(b1Var2 == null || (p1Var = this.f1213g) == null)) {
                    String c2 = p1Var.c();
                    String b2 = p1Var.b();
                    StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 70 + String.valueOf(b2).length());
                    sb.append("Calling connect() while still connected, missing disconnect() for ");
                    sb.append(c2);
                    sb.append(" on ");
                    sb.append(b2);
                    Log.e("GmsClient", sb.toString());
                    i iVar2 = this.f1215i;
                    String c3 = this.f1213g.c();
                    p.i(c3);
                    iVar2.e(c3, this.f1213g.b(), this.f1213g.a(), b1Var2, a0(), this.f1213g.d());
                    this.A.incrementAndGet();
                }
                b1 b1Var3 = new b1(this, this.A.get());
                this.q = b1Var3;
                p1 p1Var2 = (this.r != 3 || F() == null) ? new p1(K(), J(), false, i.a(), M()) : new p1(C().getPackageName(), F(), true, i.a(), false);
                this.f1213g = p1Var2;
                if (!p1Var2.d() || u() >= 17895000) {
                    i iVar3 = this.f1215i;
                    String c4 = this.f1213g.c();
                    p.i(c4);
                    if (!iVar3.f(new i1(c4, this.f1213g.b(), this.f1213g.a(), this.f1213g.d()), b1Var3, a0(), A())) {
                        String c5 = this.f1213g.c();
                        String b3 = this.f1213g.b();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(c5).length() + 34 + String.valueOf(b3).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(c5);
                        sb2.append(" on ");
                        sb2.append(b3);
                        Log.w("GmsClient", sb2.toString());
                        h0(16, null, this.A.get());
                    }
                } else {
                    String valueOf = String.valueOf(this.f1213g.c());
                    throw new IllegalStateException(valueOf.length() != 0 ? "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(valueOf) : new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "));
                }
            } else if (i2 == 4) {
                p.i(t);
                O(t);
            }
        }
    }

    protected Executor A() {
        return null;
    }

    public Bundle B() {
        return null;
    }

    public final Context C() {
        return this.f1214h;
    }

    public int D() {
        return this.u;
    }

    protected Bundle E() {
        return new Bundle();
    }

    protected String F() {
        return null;
    }

    protected Set<Scope> G() {
        return Collections.emptySet();
    }

    public final T H() {
        T t;
        synchronized (this.f1217k) {
            if (this.r != 5) {
                v();
                t = this.o;
                p.j(t, "Client is connected but service is null");
            } else {
                throw new DeadObjectException();
            }
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract String I();

    protected abstract String J();

    protected String K() {
        return "com.google.android.gms";
    }

    public f L() {
        e1 e1Var = this.z;
        if (e1Var == null) {
            return null;
        }
        return e1Var.f1233h;
    }

    protected boolean M() {
        return u() >= 211700000;
    }

    public boolean N() {
        return this.z != null;
    }

    protected void O(T t) {
        this.c = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void P(com.google.android.gms.common.a aVar) {
        this.f1210d = aVar.b();
        this.f1211e = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void Q(int i2) {
        this.a = i2;
        this.b = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void R(int i2, IBinder iBinder, Bundle bundle, int i3) {
        Handler handler = this.f1216j;
        handler.sendMessage(handler.obtainMessage(1, i3, -1, new c1(this, i2, iBinder, bundle)));
    }

    public boolean S() {
        return false;
    }

    public void T(String str) {
        this.w = str;
    }

    public void U(int i2) {
        Handler handler = this.f1216j;
        handler.sendMessage(handler.obtainMessage(6, this.A.get(), i2));
    }

    public boolean V() {
        return false;
    }

    public boolean a() {
        boolean z;
        synchronized (this.f1217k) {
            z = this.r == 4;
        }
        return z;
    }

    protected final String a0() {
        String str = this.v;
        return str == null ? this.f1214h.getClass().getName() : str;
    }

    public void b(e eVar) {
        eVar.a();
    }

    public boolean c() {
        boolean z;
        synchronized (this.f1217k) {
            int i2 = this.r;
            z = true;
            if (!(i2 == 2 || i2 == 3)) {
                z = false;
            }
        }
        return z;
    }

    public final com.google.android.gms.common.c[] d() {
        e1 e1Var = this.z;
        if (e1Var == null) {
            return null;
        }
        return e1Var.f1231f;
    }

    public String e() {
        p1 p1Var;
        if (a() && (p1Var = this.f1213g) != null) {
            return p1Var.b();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public boolean g() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h0(int i2, Bundle bundle, int i3) {
        Handler handler = this.f1216j;
        handler.sendMessage(handler.obtainMessage(7, i3, -1, new d1(this, i2, null)));
    }

    public String i() {
        return this.f1212f;
    }

    public void k(j jVar, Set<Scope> set) {
        Throwable e2;
        Bundle E = E();
        g gVar = new g(this.u, this.w);
        gVar.f1246h = this.f1214h.getPackageName();
        gVar.f1249k = E;
        if (set != null) {
            gVar.f1248j = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (q()) {
            Account y = y();
            if (y == null) {
                y = new Account("<<default account>>", "com.google");
            }
            gVar.l = y;
            if (jVar != null) {
                gVar.f1247i = jVar.asBinder();
            }
        } else if (S()) {
            gVar.l = y();
        }
        gVar.m = B;
        gVar.n = z();
        if (V()) {
            gVar.q = true;
        }
        try {
            synchronized (this.l) {
                m mVar = this.m;
                if (mVar != null) {
                    mVar.D(new a1(this, this.A.get()), gVar);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            U(3);
        } catch (RemoteException e4) {
            e2 = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            R(8, null, null, this.A.get());
        } catch (SecurityException e5) {
            throw e5;
        } catch (RuntimeException e6) {
            e2 = e6;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            R(8, null, null, this.A.get());
        }
    }

    public void l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i2;
        T t;
        m mVar;
        synchronized (this.f1217k) {
            i2 = this.r;
            t = this.o;
        }
        synchronized (this.l) {
            mVar = this.m;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        printWriter.print(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "UNKNOWN" : "DISCONNECTING" : "CONNECTED" : "LOCAL_CONNECTING" : "REMOTE_CONNECTING" : "DISCONNECTED");
        printWriter.append(" mService=");
        if (t == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) I()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(t.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (mVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(mVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.c > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j2 = this.c;
            String format = simpleDateFormat.format(new Date(j2));
            StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 21);
            sb.append(j2);
            sb.append(" ");
            sb.append(format);
            append.println(sb.toString());
        }
        if (this.b > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i3 = this.a;
            printWriter.append((CharSequence) (i3 != 1 ? i3 != 2 ? i3 != 3 ? String.valueOf(i3) : "CAUSE_DEAD_OBJECT_EXCEPTION" : "CAUSE_NETWORK_LOST" : "CAUSE_SERVICE_DISCONNECTED"));
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j3 = this.b;
            String format2 = simpleDateFormat.format(new Date(j3));
            StringBuilder sb2 = new StringBuilder(String.valueOf(format2).length() + 21);
            sb2.append(j3);
            sb2.append(" ");
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.f1211e > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) com.google.android.gms.common.api.d.a(this.f1210d));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j4 = this.f1211e;
            String format3 = simpleDateFormat.format(new Date(j4));
            StringBuilder sb3 = new StringBuilder(String.valueOf(format3).length() + 21);
            sb3.append(j4);
            sb3.append(" ");
            sb3.append(format3);
            append3.println(sb3.toString());
        }
    }

    public void m(AbstractC0029c cVar) {
        p.j(cVar, "Connection progress callbacks cannot be null.");
        this.n = cVar;
        l0(2, null);
    }

    public void n() {
        this.A.incrementAndGet();
        synchronized (this.p) {
            int size = this.p.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.p.get(i2).d();
            }
            this.p.clear();
        }
        synchronized (this.l) {
            this.m = null;
        }
        l0(1, null);
    }

    public void o(String str) {
        this.f1212f = str;
        n();
    }

    public Intent p() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public boolean q() {
        return false;
    }

    public boolean s() {
        return true;
    }

    public int u() {
        return com.google.android.gms.common.e.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void v() {
        if (!a()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract T w(IBinder iBinder);

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean x() {
        return false;
    }

    public Account y() {
        return null;
    }

    public com.google.android.gms.common.c[] z() {
        return B;
    }
}

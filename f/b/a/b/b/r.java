package f.b.a.b.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.k.a;
import f.b.a.b.d.b.f;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class r implements ServiceConnection {
    s c;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ x f2346f;
    int a = 0;
    final Messenger b = new Messenger(new f(Looper.getMainLooper(), new Handler.Callback() { // from class: f.b.a.b.b.k
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            r rVar = r.this;
            int i2 = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                StringBuilder sb = new StringBuilder(41);
                sb.append("Received response to request: ");
                sb.append(i2);
                Log.d("MessengerIpcClient", sb.toString());
            }
            synchronized (rVar) {
                u<?> uVar = rVar.f2345e.get(i2);
                if (uVar == null) {
                    StringBuilder sb2 = new StringBuilder(50);
                    sb2.append("Received response for unknown request: ");
                    sb2.append(i2);
                    Log.w("MessengerIpcClient", sb2.toString());
                    return true;
                }
                rVar.f2345e.remove(i2);
                rVar.f();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    uVar.c(new v(4, "Not supported by GmsCore", null));
                    return true;
                }
                uVar.a(data);
                return true;
            }
        }
    }));

    /* renamed from: d  reason: collision with root package name */
    final Queue<u<?>> f2344d = new ArrayDeque();

    /* renamed from: e  reason: collision with root package name */
    final SparseArray<u<?>> f2345e = new SparseArray<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ r(x xVar, q qVar) {
        this.f2346f = xVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(int i2, String str) {
        b(i2, str, null);
    }

    final synchronized void b(int i2, String str, Throwable th) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", valueOf.length() != 0 ? "Disconnected: ".concat(valueOf) : new String("Disconnected: "));
        }
        int i3 = this.a;
        if (i3 == 0) {
            throw new IllegalStateException();
        } else if (i3 == 1 || i3 == 2) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.a = 4;
            a.b().c(x.a(this.f2346f), this);
            v vVar = new v(i2, str, th);
            for (u<?> uVar : this.f2344d) {
                uVar.c(vVar);
            }
            this.f2344d.clear();
            for (int i4 = 0; i4 < this.f2345e.size(); i4++) {
                this.f2345e.valueAt(i4).c(vVar);
            }
            this.f2345e.clear();
        } else if (i3 == 3) {
            this.a = 4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        x.e(this.f2346f).execute(new Runnable() { // from class: f.b.a.b.b.m
            @Override // java.lang.Runnable
            public final void run() {
                final u<?> poll;
                final r rVar = r.this;
                while (true) {
                    synchronized (rVar) {
                        if (rVar.a == 2) {
                            if (rVar.f2344d.isEmpty()) {
                                rVar.f();
                                return;
                            }
                            poll = rVar.f2344d.poll();
                            rVar.f2345e.put(poll.a, poll);
                            x.e(rVar.f2346f).schedule(new Runnable() { // from class: f.b.a.b.b.p
                                @Override // java.lang.Runnable
                                public final void run() {
                                    r.this.e(poll.a);
                                }
                            }, 30L, TimeUnit.SECONDS);
                        } else {
                            return;
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        String valueOf = String.valueOf(poll);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
                        sb.append("Sending ");
                        sb.append(valueOf);
                        Log.d("MessengerIpcClient", sb.toString());
                    }
                    Context a = x.a(rVar.f2346f);
                    Messenger messenger = rVar.b;
                    Message obtain = Message.obtain();
                    obtain.what = poll.c;
                    obtain.arg1 = poll.a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", poll.b());
                    bundle.putString("pkg", a.getPackageName());
                    bundle.putBundle("data", poll.f2347d);
                    obtain.setData(bundle);
                    try {
                        rVar.c.a(obtain);
                    } catch (RemoteException e2) {
                        rVar.a(2, e2.getMessage());
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d() {
        if (this.a == 1) {
            a(1, "Timed out while binding");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void e(int i2) {
        u<?> uVar = this.f2345e.get(i2);
        if (uVar != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i2);
            Log.w("MessengerIpcClient", sb.toString());
            this.f2345e.remove(i2);
            uVar.c(new v(3, "Timed out waiting for response", null));
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void f() {
        if (this.a == 2 && this.f2344d.isEmpty() && this.f2345e.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.a = 3;
            a.b().c(x.a(this.f2346f), this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean g(u<?> uVar) {
        int i2 = this.a;
        if (i2 == 0) {
            this.f2344d.add(uVar);
            p.k(this.a == 0);
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.a = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            try {
                if (!a.b().a(x.a(this.f2346f), intent, this, 1)) {
                    a(0, "Unable to bind to service");
                } else {
                    x.e(this.f2346f).schedule(new Runnable() { // from class: f.b.a.b.b.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            r.this.d();
                        }
                    }, 30L, TimeUnit.SECONDS);
                }
            } catch (SecurityException e2) {
                b(0, "Unable to bind to service", e2);
            }
            return true;
        } else if (i2 == 1) {
            this.f2344d.add(uVar);
            return true;
        } else if (i2 != 2) {
            return false;
        } else {
            this.f2344d.add(uVar);
            c();
            return true;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        x.e(this.f2346f).execute(new Runnable() { // from class: f.b.a.b.b.o
            @Override // java.lang.Runnable
            public final void run() {
                r rVar = r.this;
                IBinder iBinder2 = iBinder;
                synchronized (rVar) {
                    try {
                        if (iBinder2 == null) {
                            rVar.a(0, "Null service connection");
                            return;
                        }
                        try {
                            rVar.c = new s(iBinder2);
                            rVar.a = 2;
                            rVar.c();
                        } catch (RemoteException e2) {
                            rVar.a(0, e2.getMessage());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        x.e(this.f2346f).execute(new Runnable() { // from class: f.b.a.b.b.l
            @Override // java.lang.Runnable
            public final void run() {
                r.this.a(2, "Service disconnected");
            }
        });
    }
}

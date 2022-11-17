package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.k.a;
import f.b.a.b.d.c.e;
import java.util.HashMap;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m1 extends i {

    /* renamed from: g  reason: collision with root package name */
    private final Context f1268g;

    /* renamed from: h  reason: collision with root package name */
    private volatile Handler f1269h;

    /* renamed from: i  reason: collision with root package name */
    private final l1 f1270i;

    /* renamed from: f  reason: collision with root package name */
    private final HashMap<i1, j1> f1267f = new HashMap<>();

    /* renamed from: j  reason: collision with root package name */
    private final a f1271j = a.b();

    /* renamed from: k  reason: collision with root package name */
    private final long f1272k = 5000;
    private final long l = 300000;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m1(Context context, Looper looper) {
        l1 l1Var = new l1(this, null);
        this.f1270i = l1Var;
        this.f1268g = context.getApplicationContext();
        this.f1269h = new e(looper, l1Var);
    }

    @Override // com.google.android.gms.common.internal.i
    protected final void d(i1 i1Var, ServiceConnection serviceConnection, String str) {
        p.j(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f1267f) {
            j1 j1Var = this.f1267f.get(i1Var);
            if (j1Var == null) {
                String obj = i1Var.toString();
                StringBuilder sb = new StringBuilder(obj.length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString());
            } else if (j1Var.h(serviceConnection)) {
                j1Var.f(serviceConnection, str);
                if (j1Var.i()) {
                    this.f1269h.sendMessageDelayed(this.f1269h.obtainMessage(0, i1Var), this.f1272k);
                }
            } else {
                String obj2 = i1Var.toString();
                StringBuilder sb2 = new StringBuilder(obj2.length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(obj2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.i
    public final boolean f(i1 i1Var, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean j2;
        p.j(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f1267f) {
            j1 j1Var = this.f1267f.get(i1Var);
            if (j1Var == null) {
                j1Var = new j1(this, i1Var);
                j1Var.d(serviceConnection, serviceConnection, str);
                j1Var.e(str, executor);
                this.f1267f.put(i1Var, j1Var);
            } else {
                this.f1269h.removeMessages(0, i1Var);
                if (!j1Var.h(serviceConnection)) {
                    j1Var.d(serviceConnection, serviceConnection, str);
                    int a = j1Var.a();
                    if (a == 1) {
                        serviceConnection.onServiceConnected(j1Var.b(), j1Var.c());
                    } else if (a == 2) {
                        j1Var.e(str, executor);
                    }
                } else {
                    String obj = i1Var.toString();
                    StringBuilder sb = new StringBuilder(obj.length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(obj);
                    throw new IllegalStateException(sb.toString());
                }
            }
            j2 = j1Var.j();
        }
        return j2;
    }
}

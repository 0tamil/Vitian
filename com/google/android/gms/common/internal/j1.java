package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.google.android.gms.common.k.a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j1 implements ServiceConnection, n1 {
    private final Map<ServiceConnection, ServiceConnection> a = new HashMap();
    private int b = 2;
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private IBinder f1257d;

    /* renamed from: e  reason: collision with root package name */
    private final i1 f1258e;

    /* renamed from: f  reason: collision with root package name */
    private ComponentName f1259f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ m1 f1260g;

    public j1(m1 m1Var, i1 i1Var) {
        this.f1260g = m1Var;
        this.f1258e = i1Var;
    }

    public final int a() {
        return this.b;
    }

    public final ComponentName b() {
        return this.f1259f;
    }

    public final IBinder c() {
        return this.f1257d;
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.a.put(serviceConnection, serviceConnection2);
    }

    public final void e(String str, Executor executor) {
        a aVar;
        Context context;
        Context context2;
        a aVar2;
        Context context3;
        Handler handler;
        Handler handler2;
        long j2;
        this.b = 3;
        m1 m1Var = this.f1260g;
        aVar = m1Var.f1271j;
        context = m1Var.f1268g;
        i1 i1Var = this.f1258e;
        context2 = m1Var.f1268g;
        boolean d2 = aVar.d(context, str, i1Var.c(context2), this, this.f1258e.a(), executor);
        this.c = d2;
        if (d2) {
            handler = this.f1260g.f1269h;
            Message obtainMessage = handler.obtainMessage(1, this.f1258e);
            handler2 = this.f1260g.f1269h;
            j2 = this.f1260g.l;
            handler2.sendMessageDelayed(obtainMessage, j2);
            return;
        }
        this.b = 2;
        try {
            m1 m1Var2 = this.f1260g;
            aVar2 = m1Var2.f1271j;
            context3 = m1Var2.f1268g;
            aVar2.c(context3, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.a.remove(serviceConnection);
    }

    public final void g(String str) {
        Handler handler;
        a aVar;
        Context context;
        handler = this.f1260g.f1269h;
        handler.removeMessages(1, this.f1258e);
        m1 m1Var = this.f1260g;
        aVar = m1Var.f1271j;
        context = m1Var.f1268g;
        aVar.c(context, this);
        this.c = false;
        this.b = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.a.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.a.isEmpty();
    }

    public final boolean j() {
        return this.c;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f1260g.f1267f;
        synchronized (hashMap) {
            handler = this.f1260g.f1269h;
            handler.removeMessages(1, this.f1258e);
            this.f1257d = iBinder;
            this.f1259f = componentName;
            for (ServiceConnection serviceConnection : this.a.values()) {
                serviceConnection.onServiceConnected(componentName, iBinder);
            }
            this.b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f1260g.f1267f;
        synchronized (hashMap) {
            handler = this.f1260g.f1269h;
            handler.removeMessages(1, this.f1258e);
            this.f1257d = null;
            this.f1259f = componentName;
            for (ServiceConnection serviceConnection : this.a.values()) {
                serviceConnection.onServiceDisconnected(componentName);
            }
            this.b = 2;
        }
    }
}

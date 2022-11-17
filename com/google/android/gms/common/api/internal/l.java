package com.google.android.gms.common.api.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.j;
import com.google.android.gms.common.internal.p;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;
/* loaded from: classes.dex */
public final class l implements a.f, ServiceConnection {
    private final String a;
    private final String b;
    private final ComponentName c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f1139d;

    /* renamed from: e  reason: collision with root package name */
    private final f f1140e;

    /* renamed from: f  reason: collision with root package name */
    private final Handler f1141f;

    /* renamed from: g  reason: collision with root package name */
    private final m f1142g;

    /* renamed from: h  reason: collision with root package name */
    private IBinder f1143h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1144i;

    /* renamed from: j  reason: collision with root package name */
    private String f1145j;

    private final void x() {
        if (Thread.currentThread() != this.f1141f.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    private final void y(String str) {
        String.valueOf(String.valueOf(this.f1143h)).length();
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean a() {
        x();
        return this.f1143h != null;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void b(c.e eVar) {
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean c() {
        x();
        return this.f1144i;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final com.google.android.gms.common.c[] d() {
        return new com.google.android.gms.common.c[0];
    }

    @Override // com.google.android.gms.common.api.a.f
    public final String e() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        p.i(this.c);
        return this.c.getPackageName();
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean g() {
        return false;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final String i() {
        return this.f1145j;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final Set<Scope> j() {
        return Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void k(j jVar, Set<Scope> set) {
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void m(c.AbstractC0029c cVar) {
        x();
        y("Connect started.");
        if (a()) {
            try {
                o("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.c;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.a).setAction(this.b);
            }
            boolean bindService = this.f1139d.bindService(intent, this, i.a());
            this.f1144i = bindService;
            if (!bindService) {
                this.f1143h = null;
                this.f1142g.a(new com.google.android.gms.common.a(16));
            }
            y("Finished connect.");
        } catch (SecurityException e2) {
            this.f1144i = false;
            this.f1143h = null;
            throw e2;
        }
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void n() {
        x();
        y("Disconnect called.");
        try {
            this.f1139d.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f1144i = false;
        this.f1143h = null;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void o(String str) {
        x();
        this.f1145j = str;
        n();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.f1141f.post(new Runnable() { // from class: com.google.android.gms.common.api.internal.v1
            @Override // java.lang.Runnable
            public final void run() {
                l.this.v(iBinder);
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f1141f.post(new Runnable() { // from class: com.google.android.gms.common.api.internal.u1
            @Override // java.lang.Runnable
            public final void run() {
                l.this.r();
            }
        });
    }

    @Override // com.google.android.gms.common.api.a.f
    public final Intent p() {
        return new Intent();
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean q() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void r() {
        this.f1144i = false;
        this.f1143h = null;
        y("Disconnected.");
        this.f1140e.b(1);
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean s() {
        return false;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final int u() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void v(IBinder iBinder) {
        this.f1144i = false;
        this.f1143h = iBinder;
        y("Connected.");
        this.f1140e.d(new Bundle());
    }

    public final void w(String str) {
    }
}

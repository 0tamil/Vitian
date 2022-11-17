package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public abstract class i {
    private static int a = 4225;
    private static final Object b = new Object();
    private static m1 c = null;

    /* renamed from: d  reason: collision with root package name */
    static HandlerThread f1252d = null;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f1253e = false;

    public static int a() {
        return a;
    }

    public static i b(Context context) {
        synchronized (b) {
            if (c == null) {
                c = new m1(context.getApplicationContext(), f1253e ? c().getLooper() : context.getMainLooper());
            }
        }
        return c;
    }

    public static HandlerThread c() {
        synchronized (b) {
            HandlerThread handlerThread = f1252d;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f1252d = handlerThread2;
            handlerThread2.start();
            return f1252d;
        }
    }

    protected abstract void d(i1 i1Var, ServiceConnection serviceConnection, String str);

    public final void e(String str, String str2, int i2, ServiceConnection serviceConnection, String str3, boolean z) {
        d(new i1(str, str2, i2, z), serviceConnection, str3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean f(i1 i1Var, ServiceConnection serviceConnection, String str, Executor executor);
}

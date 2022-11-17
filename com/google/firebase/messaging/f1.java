package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: d  reason: collision with root package name */
    private static WeakReference<f1> f1750d;
    private final SharedPreferences a;
    private b1 b;
    private final Executor c;

    private f1(SharedPreferences sharedPreferences, Executor executor) {
        this.c = executor;
        this.a = sharedPreferences;
    }

    public static synchronized f1 b(Context context, Executor executor) {
        f1 f1Var;
        synchronized (f1.class) {
            f1Var = null;
            WeakReference<f1> weakReference = f1750d;
            if (weakReference != null) {
                f1Var = weakReference.get();
            }
            if (f1Var == null) {
                f1Var = new f1(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                f1Var.d();
                f1750d = new WeakReference<>(f1Var);
            }
        }
        return f1Var;
    }

    private synchronized void d() {
        this.b = b1.c(this.a, "topic_operation_queue", ",", this.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean a(e1 e1Var) {
        return this.b.a(e1Var.e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized e1 c() {
        return e1.a(this.b.f());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean e(e1 e1Var) {
        return this.b.g(e1Var.e());
    }
}

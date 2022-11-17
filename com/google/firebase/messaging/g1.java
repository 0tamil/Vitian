package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import e.c.a;
import f.b.a.b.g.i;
import f.b.a.b.g.j;
import f.b.a.b.g.l;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class g1 {

    /* renamed from: i  reason: collision with root package name */
    private static final long f1753i = TimeUnit.HOURS.toSeconds(8);
    private final Context a;
    private final r0 b;
    private final o0 c;

    /* renamed from: d  reason: collision with root package name */
    private final FirebaseMessaging f1754d;

    /* renamed from: f  reason: collision with root package name */
    private final ScheduledExecutorService f1756f;

    /* renamed from: h  reason: collision with root package name */
    private final f1 f1758h;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, ArrayDeque<j<Void>>> f1755e = new a();

    /* renamed from: g  reason: collision with root package name */
    private boolean f1757g = false;

    private g1(FirebaseMessaging firebaseMessaging, r0 r0Var, f1 f1Var, o0 o0Var, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f1754d = firebaseMessaging;
        this.b = r0Var;
        this.f1758h = f1Var;
        this.c = o0Var;
        this.a = context;
        this.f1756f = scheduledExecutorService;
    }

    private void a(e1 e1Var, j<Void> jVar) {
        ArrayDeque<j<Void>> arrayDeque;
        synchronized (this.f1755e) {
            String e2 = e1Var.e();
            if (this.f1755e.containsKey(e2)) {
                arrayDeque = this.f1755e.get(e2);
            } else {
                ArrayDeque<j<Void>> arrayDeque2 = new ArrayDeque<>();
                this.f1755e.put(e2, arrayDeque2);
                arrayDeque = arrayDeque2;
            }
            arrayDeque.add(jVar);
        }
    }

    private static <T> void b(i<T> iVar) {
        Throwable e2;
        try {
            l.b(iVar, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e3) {
            e2 = e3;
            throw new IOException("SERVICE_NOT_AVAILABLE", e2);
        } catch (ExecutionException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e4);
            }
        } catch (TimeoutException e5) {
            e2 = e5;
            throw new IOException("SERVICE_NOT_AVAILABLE", e2);
        }
    }

    private void c(String str) {
        b(this.c.l(this.f1754d.c(), str));
    }

    private void d(String str) {
        b(this.c.m(this.f1754d.c(), str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i<g1> e(final FirebaseMessaging firebaseMessaging, final r0 r0Var, final o0 o0Var, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return l.c(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.b0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return g1.i(context, scheduledExecutorService, firebaseMessaging, r0Var, o0Var);
            }
        });
    }

    static boolean g() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ g1 i(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, r0 r0Var, o0 o0Var) {
        return new g1(firebaseMessaging, r0Var, f1.b(context, scheduledExecutorService), o0Var, context, scheduledExecutorService);
    }

    private void j(e1 e1Var) {
        synchronized (this.f1755e) {
            String e2 = e1Var.e();
            if (this.f1755e.containsKey(e2)) {
                ArrayDeque<j<Void>> arrayDeque = this.f1755e.get(e2);
                j<Void> poll = arrayDeque.poll();
                if (poll != null) {
                    poll.c(null);
                }
                if (arrayDeque.isEmpty()) {
                    this.f1755e.remove(e2);
                }
            }
        }
    }

    private void o() {
        if (!h()) {
            s(0L);
        }
    }

    boolean f() {
        return this.f1758h.c() != null;
    }

    synchronized boolean h() {
        return this.f1757g;
    }

    boolean k(e1 e1Var) {
        String str;
        String str2;
        try {
            String b = e1Var.b();
            char c = 65535;
            int hashCode = b.hashCode();
            if (hashCode != 83) {
                if (hashCode == 85 && b.equals("U")) {
                    c = 1;
                }
            } else if (b.equals("S")) {
                c = 0;
            }
            if (c == 0) {
                c(e1Var.c());
                if (g()) {
                    str2 = "Subscribe to topic: " + e1Var.c() + " succeeded.";
                    Log.d("FirebaseMessaging", str2);
                }
                return true;
            } else if (c != 1) {
                if (g()) {
                    str2 = "Unknown topic operation" + e1Var + ".";
                    Log.d("FirebaseMessaging", str2);
                }
                return true;
            } else {
                d(e1Var.c());
                if (g()) {
                    str2 = "Unsubscribe from topic: " + e1Var.c() + " succeeded.";
                    Log.d("FirebaseMessaging", str2);
                }
                return true;
            }
        } catch (IOException e2) {
            if (!"SERVICE_NOT_AVAILABLE".equals(e2.getMessage())) {
            }
            str = "Topic operation failed: " + e2.getMessage() + ". Will retry Topic operation.";
            Log.e("FirebaseMessaging", str);
            return false;
        }
        if (!"SERVICE_NOT_AVAILABLE".equals(e2.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e2.getMessage())) {
            str = "Topic operation failed: " + e2.getMessage() + ". Will retry Topic operation.";
        } else if (e2.getMessage() == null) {
            str = "Topic operation failed without exception message. Will retry Topic operation.";
        } else {
            throw e2;
        }
        Log.e("FirebaseMessaging", str);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(Runnable runnable, long j2) {
        this.f1756f.schedule(runnable, j2, TimeUnit.SECONDS);
    }

    i<Void> m(e1 e1Var) {
        this.f1758h.a(e1Var);
        j<Void> jVar = new j<>();
        a(e1Var, jVar);
        return jVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void n(boolean z) {
        this.f1757g = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() {
        if (f()) {
            o();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i<Void> q(String str) {
        i<Void> m = m(e1.f(str));
        p();
        return m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
        if (g() == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean r() {
        while (true) {
            synchronized (this) {
                e1 c = this.f1758h.c();
                if (c == null) {
                    break;
                } else if (!k(c)) {
                    return false;
                } else {
                    this.f1758h.e(c);
                    j(c);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(long j2) {
        l(new h1(this, this.a, this.b, Math.min(Math.max(30L, 2 * j2), f1753i)), j2);
        n(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i<Void> t(String str) {
        i<Void> m = m(e1.g(str));
        p();
        return m;
    }
}

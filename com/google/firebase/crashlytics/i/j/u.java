package com.google.firebase.crashlytics.i.j;

import com.google.firebase.crashlytics.i.c;
import com.google.firebase.crashlytics.i.f;
import com.google.firebase.crashlytics.i.p.i;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
class u implements Thread.UncaughtExceptionHandler {
    private final a a;
    private final i b;
    private final Thread.UncaughtExceptionHandler c;

    /* renamed from: d  reason: collision with root package name */
    private final c f1424d;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f1425e = new AtomicBoolean(false);

    /* loaded from: classes.dex */
    interface a {
        void a(i iVar, Thread thread, Throwable th);
    }

    public u(a aVar, i iVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, c cVar) {
        this.a = aVar;
        this.b = iVar;
        this.c = uncaughtExceptionHandler;
        this.f1424d = cVar;
    }

    private boolean b(Thread thread, Throwable th) {
        if (thread == null) {
            f.f().d("Crashlytics will not record uncaught exception; null thread");
            return false;
        } else if (th == null) {
            f.f().d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        } else if (!this.f1424d.c()) {
            return true;
        } else {
            f.f().b("Crashlytics will not record uncaught exception; native crash exists for session.");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        return this.f1425e.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Thread$UncaughtExceptionHandler] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Thread$UncaughtExceptionHandler] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.firebase.crashlytics.i.f] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.firebase.crashlytics.i.f] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.concurrent.atomic.AtomicBoolean] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Thread] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        ?? r0 = "Completed exception processing. Invoking default exception handler.";
        this.f1425e.set(true);
        try {
            try {
                if (b(thread, th)) {
                    this.a.a(this.b, thread, th);
                } else {
                    f.f().b("Uncaught exception will not be recorded by Crashlytics.");
                }
            } catch (Exception e2) {
                f.f().e("An error occurred in the uncaught exception handler", e2);
            }
        } finally {
            f.f().b(r0);
            this.c.uncaughtException(thread, th);
            this.f1425e.set(false);
        }
    }
}

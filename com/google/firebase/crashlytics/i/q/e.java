package com.google.firebase.crashlytics.i.q;
/* loaded from: classes.dex */
public class e {
    public final String a;
    public final String b;
    public final StackTraceElement[] c;

    /* renamed from: d  reason: collision with root package name */
    public final e f1649d;

    public e(Throwable th, d dVar) {
        this.a = th.getLocalizedMessage();
        this.b = th.getClass().getName();
        this.c = dVar.a(th.getStackTrace());
        Throwable cause = th.getCause();
        this.f1649d = cause != null ? new e(cause, dVar) : null;
    }
}

package com.google.firebase.crashlytics.i;

import android.util.Log;
/* loaded from: classes.dex */
public class f {
    static final f c = new f("FirebaseCrashlytics");
    private final String a;
    private int b = 4;

    public f(String str) {
        this.a = str;
    }

    private boolean a(int i2) {
        return this.b <= i2 || Log.isLoggable(this.a, i2);
    }

    public static f f() {
        return c;
    }

    public void b(String str) {
        c(str, null);
    }

    public void c(String str, Throwable th) {
        if (a(3)) {
            Log.d(this.a, str, th);
        }
    }

    public void d(String str) {
        e(str, null);
    }

    public void e(String str, Throwable th) {
        if (a(6)) {
            Log.e(this.a, str, th);
        }
    }

    public void g(String str) {
        h(str, null);
    }

    public void h(String str, Throwable th) {
        if (a(4)) {
            Log.i(this.a, str, th);
        }
    }

    public void i(String str) {
        j(str, null);
    }

    public void j(String str, Throwable th) {
        if (a(2)) {
            Log.v(this.a, str, th);
        }
    }

    public void k(String str) {
        l(str, null);
    }

    public void l(String str, Throwable th) {
        if (a(5)) {
            Log.w(this.a, str, th);
        }
    }
}

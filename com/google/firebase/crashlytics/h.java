package com.google.firebase.crashlytics;

import android.annotation.SuppressLint;
import com.google.firebase.crashlytics.i.f;
/* loaded from: classes.dex */
public final class h {
    @SuppressLint({"VisibleForTests"})
    public static void a(Throwable th) {
        if (th == null) {
            f.f().k("A null value was passed to recordFatalException. Ignoring.");
        } else {
            g.d().a.p(th);
        }
    }
}

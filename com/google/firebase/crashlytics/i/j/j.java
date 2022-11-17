package com.google.firebase.crashlytics.i.j;

import android.os.Process;
/* loaded from: classes.dex */
public abstract class j implements Runnable {
    protected abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        a();
    }
}

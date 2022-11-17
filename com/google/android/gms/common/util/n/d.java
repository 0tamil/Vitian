package com.google.android.gms.common.util.n;

import android.os.Process;
/* loaded from: classes.dex */
final class d implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    private final Runnable f1304e;

    public d(Runnable runnable, int i2) {
        this.f1304e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f1304e.run();
    }
}

package com.google.android.gms.common.util.n;

import android.os.Handler;
import android.os.Looper;
import f.b.a.b.d.c.e;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class a implements Executor {

    /* renamed from: e  reason: collision with root package name */
    private final Handler f1303e;

    public a(Looper looper) {
        this.f1303e = new e(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f1303e.post(runnable);
    }
}

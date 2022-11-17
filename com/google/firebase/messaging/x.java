package com.google.firebase.messaging;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final /* synthetic */ class x implements Executor {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ x f1843e = new x();

    private /* synthetic */ x() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}

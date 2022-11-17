package com.google.firebase.p;

import java.util.concurrent.ThreadFactory;
/* loaded from: classes.dex */
public final /* synthetic */ class d implements ThreadFactory {
    public static final /* synthetic */ d a = new d();

    private /* synthetic */ d() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return g.j(runnable);
    }
}

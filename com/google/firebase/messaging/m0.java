package com.google.firebase.messaging;

import com.google.android.gms.common.util.n.b;
import com.google.firebase.messaging.m1.c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
/* loaded from: classes.dex */
class m0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static ScheduledExecutorService a() {
        return new ScheduledThreadPoolExecutor(1, new b("Firebase-Messaging-Init"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ExecutorService b() {
        return com.google.firebase.messaging.m1.b.a().a(new b("Firebase-Messaging-Intent-Handle"), c.HIGH_SPEED);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ExecutorService c() {
        return Executors.newSingleThreadExecutor(new b("Firebase-Messaging-Network-Io"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ExecutorService d() {
        return Executors.newSingleThreadExecutor(new b("Firebase-Messaging-Task"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ScheduledExecutorService e() {
        return new ScheduledThreadPoolExecutor(1, new b("Firebase-Messaging-Topics-Io"));
    }
}

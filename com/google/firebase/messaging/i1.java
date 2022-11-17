package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import f.b.a.b.f.a;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
final class i1 {
    private static final long a = TimeUnit.MINUTES.toMillis(1);
    private static final Object b = new Object();
    private static a c;

    private static void a(Context context) {
        if (c == null) {
            a aVar = new a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            c = aVar;
            aVar.d(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Intent intent) {
        synchronized (b) {
            if (c != null && c(intent)) {
                d(intent, false);
                c.c();
            }
        }
    }

    static boolean c(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    private static void d(Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ComponentName e(Context context, Intent intent) {
        synchronized (b) {
            a(context);
            boolean c2 = c(intent);
            d(intent, true);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            if (!c2) {
                c.a(a);
            }
            return startService;
        }
    }
}

package com.google.android.gms.common.l;

import android.content.Context;
import com.google.android.gms.common.util.j;
/* loaded from: classes.dex */
public class a {
    private static Context a;
    private static Boolean b;

    public static synchronized boolean a(Context context) {
        Boolean bool;
        Boolean bool2;
        synchronized (a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = a;
            if (!(context2 == null || (bool2 = b) == null || context2 != applicationContext)) {
                return bool2.booleanValue();
            }
            b = null;
            if (j.g()) {
                bool = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    bool = Boolean.FALSE;
                }
                a = applicationContext;
                return b.booleanValue();
            }
            b = bool;
            a = applicationContext;
            return b.booleanValue();
        }
    }
}

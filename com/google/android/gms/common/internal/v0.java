package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.l.c;
/* loaded from: classes.dex */
public final class v0 {
    private static final Object a = new Object();
    private static boolean b;
    private static int c;

    public static int a(Context context) {
        b(context);
        return c;
    }

    private static void b(Context context) {
        Bundle bundle;
        synchronized (a) {
            if (!b) {
                b = true;
                try {
                    bundle = c.a(context).b(context.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e2);
                }
                if (bundle != null) {
                    bundle.getString("com.google.app.id");
                    c = bundle.getInt("com.google.android.gms.version");
                }
            }
        }
    }
}

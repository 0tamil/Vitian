package io.flutter.plugins.firebase.messaging;

import android.content.Context;
import android.util.Log;
/* loaded from: classes.dex */
public class o {
    private static Context a;

    public static Context a() {
        return a;
    }

    public static void b(Context context) {
        Log.d("FLTFireContextHolder", "received application context.");
        a = context;
    }
}

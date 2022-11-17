package com.google.firebase.crashlytics.i.j;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.firebase.crashlytics.i.f;
/* loaded from: classes.dex */
class k {
    private final Float a;
    private final boolean b;

    private k(Float f2, boolean z) {
        this.b = z;
        this.a = f2;
    }

    public static k a(Context context) {
        Float f2 = null;
        boolean z = false;
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                z = e(registerReceiver);
                f2 = d(registerReceiver);
            }
        } catch (IllegalStateException e2) {
            f.f().e("An error occurred getting battery state.", e2);
        }
        return new k(f2, z);
    }

    private static Float d(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(intExtra / intExtra2);
    }

    private static boolean e(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    public Float b() {
        return this.a;
    }

    public int c() {
        Float f2;
        if (!this.b || (f2 = this.a) == null) {
            return 1;
        }
        return ((double) f2.floatValue()) < 0.99d ? 2 : 3;
    }
}

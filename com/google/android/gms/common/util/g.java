package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
/* loaded from: classes.dex */
public final class g {
    private static Boolean a;
    private static Boolean b;
    private static Boolean c;

    /* renamed from: d  reason: collision with root package name */
    private static Boolean f1302d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f1302d == null) {
            boolean z = false;
            if (j.g() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            f1302d = Boolean.valueOf(z);
        }
        return f1302d.booleanValue();
    }

    @TargetApi(20)
    public static boolean b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (a == null) {
            boolean z = false;
            if (j.d() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z = true;
            }
            a = Boolean.valueOf(z);
        }
        return a.booleanValue();
    }

    @TargetApi(26)
    public static boolean c(Context context) {
        if (b(context)) {
            if (!j.f()) {
                return true;
            }
            if (d(context) && !j.g()) {
                return true;
            }
        }
        return false;
    }

    @TargetApi(21)
    public static boolean d(Context context) {
        if (b == null) {
            boolean z = false;
            if (j.e() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z = true;
            }
            b = Boolean.valueOf(z);
        }
        return b.booleanValue();
    }

    public static boolean e(Context context) {
        if (c == null) {
            boolean z = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z = false;
            }
            c = Boolean.valueOf(z);
        }
        return c.booleanValue();
    }
}

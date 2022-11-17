package com.scottyab.rootbeer.c;

import android.util.Log;
/* loaded from: classes.dex */
public final class a {
    public static int a = 5;

    public static void a(Object obj) {
        if (c()) {
            Log.e("RootBeer", b() + String.valueOf(obj));
            Log.e("QLog", b() + String.valueOf(obj));
        }
    }

    private static String b() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String methodName = stackTrace[2].getMethodName();
        String className = stackTrace[2].getClassName();
        int lineNumber = stackTrace[2].getLineNumber();
        String substring = className.substring(className.lastIndexOf(46) + 1);
        return substring + ": " + methodName + "() [" + lineNumber + "] - ";
    }

    public static boolean c() {
        return a > 0;
    }

    public static boolean d() {
        return a > 4;
    }

    public static void e(Object obj) {
        if (d()) {
            Log.v("RootBeer", b() + String.valueOf(obj));
        }
    }
}

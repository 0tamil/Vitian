package com.scottyab.rootbeer;

import com.scottyab.rootbeer.c.a;
/* loaded from: classes.dex */
public class RootBeerNative {
    static boolean a = false;

    static {
        try {
            System.loadLibrary("tool-checker");
            a = true;
        } catch (UnsatisfiedLinkError e2) {
            a.a(e2);
        }
    }

    public boolean a() {
        return a;
    }

    public native int checkForRoot(Object[] objArr);

    public native int setLogDebugMessages(boolean z);
}

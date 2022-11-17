package com.google.android.gms.common.util;

import android.os.SystemClock;
/* loaded from: classes.dex */
public class f implements e {
    private static final f a = new f();

    private f() {
    }

    public static e b() {
        return a;
    }

    @Override // com.google.android.gms.common.util.e
    public final long a() {
        return SystemClock.elapsedRealtime();
    }
}

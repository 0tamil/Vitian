package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.n.c;
import f.b.a.b.d.a.i;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public final class z0 {
    private static final ExecutorService a = i.a().b(2, new c("GAC_Executor"), 2);

    public static ExecutorService a() {
        return a;
    }
}

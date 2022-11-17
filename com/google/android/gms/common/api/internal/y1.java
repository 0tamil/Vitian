package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.n.c;
import f.b.a.b.d.a.i;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public final class y1 {
    private static final ExecutorService a = i.a().a(new c("GAC_Transform"), 1);

    public static ExecutorService a() {
        return a;
    }
}

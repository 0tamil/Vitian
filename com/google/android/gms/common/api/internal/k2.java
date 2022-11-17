package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.j;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class k2 {
    public static final Status c = new Status(8, "The connection to Google Play services was lost");
    final Set<BasePendingResult<?>> a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    private final j2 b = new j2(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(BasePendingResult<? extends j> basePendingResult) {
        this.a.add(basePendingResult);
        basePendingResult.p(this.b);
    }

    public final void b() {
        BasePendingResult[] basePendingResultArr;
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.a.toArray(new BasePendingResult[0])) {
            basePendingResult.p(null);
            if (basePendingResult.o()) {
                this.a.remove(basePendingResult);
            }
        }
    }
}

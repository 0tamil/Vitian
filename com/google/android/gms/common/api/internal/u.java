package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class u implements g.a {
    final /* synthetic */ BasePendingResult a;
    final /* synthetic */ w b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(w wVar, BasePendingResult basePendingResult) {
        this.b = wVar;
        this.a = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.g.a
    public final void a(Status status) {
        Map map;
        map = this.b.a;
        map.remove(this.a);
    }
}

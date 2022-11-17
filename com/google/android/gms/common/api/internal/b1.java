package com.google.android.gms.common.api.internal;

import android.os.Handler;
import com.google.android.gms.common.api.internal.c;
/* loaded from: classes.dex */
final class b1 implements c.a {
    final /* synthetic */ g a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b1(g gVar) {
        this.a = gVar;
    }

    @Override // com.google.android.gms.common.api.internal.c.a
    public final void a(boolean z) {
        Handler handler;
        Handler handler2;
        g gVar = this.a;
        handler = gVar.p;
        handler2 = gVar.p;
        handler.sendMessage(handler2.obtainMessage(1, Boolean.valueOf(z)));
    }
}

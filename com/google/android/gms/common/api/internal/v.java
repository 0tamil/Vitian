package com.google.android.gms.common.api.internal;

import f.b.a.b.g.d;
import f.b.a.b.g.i;
import f.b.a.b.g.j;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class v implements d {
    final /* synthetic */ j a;
    final /* synthetic */ w b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(w wVar, j jVar) {
        this.b = wVar;
        this.a = jVar;
    }

    @Override // f.b.a.b.g.d
    public final void a(i iVar) {
        Map map;
        map = this.b.b;
        map.remove(this.a);
    }
}

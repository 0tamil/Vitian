package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.c;
import f.b.a.b.g.j;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d2 extends r {

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ r.a f1096d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(r.a aVar, c[] cVarArr, boolean z, int i2) {
        super(cVarArr, z, i2);
        this.f1096d = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.r
    public final void b(a.b bVar, j jVar) {
        o oVar;
        oVar = this.f1096d.a;
        oVar.a(bVar, jVar);
    }
}

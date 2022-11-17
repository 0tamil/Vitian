package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.a;
import com.google.android.gms.common.api.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class p2 implements f.c {
    public final int a;
    public final f b;
    public final f.c c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ q2 f1156d;

    public p2(q2 q2Var, int i2, f fVar, f.c cVar) {
        this.f1156d = q2Var;
        this.a = i2;
        this.b = fVar;
        this.c = cVar;
    }

    @Override // com.google.android.gms.common.api.internal.m
    public final void a(a aVar) {
        String valueOf = String.valueOf(aVar);
        String.valueOf(valueOf).length();
        Log.d("AutoManageHelper", "beginFailureResolution for ".concat(String.valueOf(valueOf)));
        this.f1156d.s(aVar, this.a);
    }
}

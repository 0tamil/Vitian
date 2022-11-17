package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.j;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class i0 extends o0 {

    /* renamed from: f  reason: collision with root package name */
    private final ArrayList<a.f> f1128f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ p0 f1129g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(p0 p0Var, ArrayList<a.f> arrayList) {
        super(p0Var, null);
        this.f1129g = p0Var;
        this.f1128f = arrayList;
    }

    @Override // com.google.android.gms.common.api.internal.o0
    public final void a() {
        y0 y0Var;
        j jVar;
        y0 y0Var2;
        p0 p0Var = this.f1129g;
        y0Var = p0Var.a;
        y0Var.m.p = p0.y(p0Var);
        ArrayList<a.f> arrayList = this.f1128f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            p0 p0Var2 = this.f1129g;
            jVar = p0Var2.o;
            y0Var2 = p0Var2.a;
            arrayList.get(i2).k(jVar, y0Var2.m.p);
        }
    }
}

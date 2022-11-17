package com.google.android.gms.common.api.internal;

import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.e;
import com.google.android.gms.common.internal.m0;
import f.b.a.b.e.g;
import java.util.ArrayList;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h0 extends o0 {

    /* renamed from: f  reason: collision with root package name */
    private final Map<a.f, e0> f1123f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ p0 f1124g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(p0 p0Var, Map<a.f, e0> map) {
        super(p0Var, null);
        this.f1124g = p0Var;
        this.f1123f = map;
    }

    @Override // com.google.android.gms.common.api.internal.o0
    public final void a() {
        e eVar;
        boolean z;
        Context context;
        y0 y0Var;
        g gVar;
        g gVar2;
        y0 y0Var2;
        Context context2;
        Context context3;
        boolean z2;
        eVar = this.f1124g.f1148d;
        m0 m0Var = new m0(eVar);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (a.f fVar : this.f1123f.keySet()) {
            if (fVar.s()) {
                z2 = this.f1123f.get(fVar).c;
                if (!z2) {
                    arrayList.add(fVar);
                }
            }
            arrayList2.add(fVar);
        }
        int i2 = -1;
        int i3 = 0;
        if (arrayList.isEmpty()) {
            int size = arrayList2.size();
            while (i3 < size) {
                context3 = this.f1124g.c;
                i2 = m0Var.b(context3, (a.f) arrayList2.get(i3));
                i3++;
                if (i2 == 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList.size();
            while (i3 < size2) {
                context2 = this.f1124g.c;
                i2 = m0Var.b(context2, (a.f) arrayList.get(i3));
                i3++;
                if (i2 != 0) {
                    break;
                }
            }
        }
        if (i2 != 0) {
            com.google.android.gms.common.a aVar = new com.google.android.gms.common.a(i2, null);
            p0 p0Var = this.f1124g;
            y0Var2 = p0Var.a;
            y0Var2.o(new f0(this, p0Var, aVar));
            return;
        }
        p0 p0Var2 = this.f1124g;
        z = p0Var2.m;
        if (z) {
            gVar = p0Var2.f1155k;
            if (gVar != null) {
                gVar2 = p0Var2.f1155k;
                gVar2.r();
            }
        }
        for (a.f fVar2 : this.f1123f.keySet()) {
            e0 e0Var = this.f1123f.get(fVar2);
            if (fVar2.s()) {
                context = this.f1124g.c;
                if (m0Var.b(context, fVar2) != 0) {
                    p0 p0Var3 = this.f1124g;
                    y0Var = p0Var3.a;
                    y0Var.o(new g0(this, p0Var3, e0Var));
                }
            }
            fVar2.m(e0Var);
        }
    }
}

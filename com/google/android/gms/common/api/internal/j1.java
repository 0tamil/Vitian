package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.a;
import com.google.android.gms.common.api.a;
import java.util.Map;
/* loaded from: classes.dex */
final class j1 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ a f1134e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ k1 f1135f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j1(k1 k1Var, a aVar) {
        this.f1135f = k1Var;
        this.f1134e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        b bVar;
        a.f fVar;
        a.f fVar2;
        a.f fVar3;
        a.f fVar4;
        k1 k1Var = this.f1135f;
        map = k1Var.f1138f.l;
        bVar = k1Var.b;
        g1 g1Var = (g1) map.get(bVar);
        if (g1Var != null) {
            if (this.f1134e.f()) {
                this.f1135f.f1137e = true;
                fVar = this.f1135f.a;
                if (fVar.q()) {
                    this.f1135f.h();
                    return;
                }
                try {
                    k1 k1Var2 = this.f1135f;
                    fVar3 = k1Var2.a;
                    fVar4 = k1Var2.a;
                    fVar3.k(null, fVar4.j());
                } catch (SecurityException e2) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e2);
                    fVar2 = this.f1135f.a;
                    fVar2.o("Failed to get service from broker.");
                    g1Var.H(new com.google.android.gms.common.a(10), null);
                }
            } else {
                g1Var.H(this.f1134e, null);
            }
        }
    }
}

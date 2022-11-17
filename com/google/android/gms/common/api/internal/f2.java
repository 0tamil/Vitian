package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.p;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
final class f2 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ j f1098e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ i2 f1099f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f2(i2 i2Var, j jVar) {
        this.f1099f = i2Var;
        this.f1098e = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g2 g2Var;
        g2 g2Var2;
        WeakReference weakReference;
        f fVar;
        WeakReference weakReference2;
        m mVar;
        g2 g2Var3;
        g2 g2Var4;
        WeakReference weakReference3;
        Boolean bool = Boolean.FALSE;
        try {
            try {
                ThreadLocal<Boolean> threadLocal = BasePendingResult.p;
                threadLocal.set(Boolean.TRUE);
                mVar = this.f1099f.a;
                p.i(mVar);
                g b = mVar.b(this.f1098e);
                i2 i2Var = this.f1099f;
                g2Var3 = i2Var.f1133g;
                g2Var4 = i2Var.f1133g;
                g2Var3.sendMessage(g2Var4.obtainMessage(0, b));
                threadLocal.set(bool);
                i2 i2Var2 = this.f1099f;
                i2.j(this.f1098e);
                weakReference3 = this.f1099f.f1132f;
                fVar = (f) weakReference3.get();
                if (fVar == null) {
                    return;
                }
            } catch (RuntimeException e2) {
                i2 i2Var3 = this.f1099f;
                g2Var = i2Var3.f1133g;
                g2Var2 = i2Var3.f1133g;
                g2Var.sendMessage(g2Var2.obtainMessage(1, e2));
                BasePendingResult.p.set(bool);
                i2 i2Var4 = this.f1099f;
                i2.j(this.f1098e);
                weakReference = this.f1099f.f1132f;
                fVar = (f) weakReference.get();
                if (fVar == null) {
                    return;
                }
            }
            fVar.o(this.f1099f);
        } catch (Throwable th) {
            BasePendingResult.p.set(bool);
            i2 i2Var5 = this.f1099f;
            i2.j(this.f1098e);
            weakReference2 = this.f1099f.f1132f;
            f fVar2 = (f) weakReference2.get();
            if (fVar2 != null) {
                fVar2.o(this.f1099f);
            }
            throw th;
        }
    }
}

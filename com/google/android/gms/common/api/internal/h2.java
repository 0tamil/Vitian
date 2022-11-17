package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import f.b.a.b.g.j;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class h2<T> extends p1 {
    protected final j<T> b;

    public h2(int i2, j<T> jVar) {
        super(i2);
        this.b = jVar;
    }

    @Override // com.google.android.gms.common.api.internal.o2
    public final void a(Status status) {
        this.b.d(new b(status));
    }

    @Override // com.google.android.gms.common.api.internal.o2
    public final void b(Exception exc) {
        this.b.d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.o2
    public final void c(g1<?> g1Var) {
        try {
            h(g1Var);
        } catch (DeadObjectException e2) {
            a(o2.e(e2));
            throw e2;
        } catch (RemoteException e3) {
            a(o2.e(e3));
        } catch (RuntimeException e4) {
            this.b.d(e4);
        }
    }

    protected abstract void h(g1<?> g1Var);
}

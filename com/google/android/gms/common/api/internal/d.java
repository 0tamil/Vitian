package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.internal.p;
/* loaded from: classes.dex */
public abstract class d<R extends j, A extends a.b> extends BasePendingResult<R> implements e<R> {
    private final a.c<A> r;
    private final a<?> s;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a<?> aVar, f fVar) {
        super(fVar);
        p.j(fVar, "GoogleApiClient must not be null");
        p.j(aVar, "Api must not be null");
        this.r = (a.c<A>) aVar.b();
        this.s = aVar;
    }

    private void v(RemoteException remoteException) {
        w(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.e
    public /* bridge */ /* synthetic */ void a(Object obj) {
        super.i((j) obj);
    }

    protected abstract void q(A a);

    public final a<?> r() {
        return this.s;
    }

    public final a.c<A> s() {
        return this.r;
    }

    protected void t(R r) {
    }

    public final void u(A a) {
        try {
            q(a);
        } catch (DeadObjectException e2) {
            v(e2);
            throw e2;
        } catch (RemoteException e3) {
            v(e3);
        }
    }

    public final void w(Status status) {
        p.b(!status.f(), "Failed result must not be success");
        R e2 = e(status);
        i(e2);
        t(e2);
    }
}

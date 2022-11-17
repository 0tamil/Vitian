package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.p;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class i2<R extends j> extends n<R> implements k<R> {
    private m<? super R, ? extends j> a;
    private i2<? extends j> b;
    private volatile l<? super R> c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f1130d;

    /* renamed from: e  reason: collision with root package name */
    private Status f1131e;

    /* renamed from: f  reason: collision with root package name */
    private final WeakReference<f> f1132f;

    /* renamed from: g  reason: collision with root package name */
    private final g2 f1133g;

    private final void g(Status status) {
        synchronized (this.f1130d) {
            this.f1131e = status;
            h(status);
        }
    }

    private final void h(Status status) {
        synchronized (this.f1130d) {
            m<? super R, ? extends j> mVar = this.a;
            if (mVar != null) {
                mVar.a(status);
                p.j(status, "onFailure must not return null");
                i2<? extends j> i2Var = this.b;
                p.i(i2Var);
                i2Var.g(status);
            } else if (i()) {
                l<? super R> lVar = this.c;
                p.i(lVar);
                lVar.b(status);
            }
        }
    }

    private final boolean i() {
        return (this.c == null || this.f1132f.get() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(j jVar) {
        if (jVar instanceof h) {
            try {
                ((h) jVar).a();
            } catch (RuntimeException e2) {
                String valueOf = String.valueOf(jVar);
                String.valueOf(valueOf).length();
                Log.w("TransformedResultImpl", "Unable to release ".concat(String.valueOf(valueOf)), e2);
            }
        }
    }

    @Override // com.google.android.gms.common.api.k
    public final void a(R r) {
        synchronized (this.f1130d) {
            if (!r.a().f()) {
                g(r.a());
                j(r);
            } else if (this.a != null) {
                y1.a().submit(new f2(this, r));
            } else if (i()) {
                l<? super R> lVar = this.c;
                p.i(lVar);
                lVar.c(r);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        this.c = null;
    }
}

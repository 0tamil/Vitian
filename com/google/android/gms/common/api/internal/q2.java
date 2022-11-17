package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.d;
import com.google.android.gms.common.internal.p;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* loaded from: classes.dex */
public final class q2 extends v2 {

    /* renamed from: j  reason: collision with root package name */
    private final SparseArray<p2> f1157j = new SparseArray<>();

    private q2(i iVar) {
        super(iVar, d.n());
        this.f1077e.b("AutoManageHelper", this);
    }

    public static q2 t(h hVar) {
        i d2 = LifecycleCallback.d(hVar);
        q2 q2Var = (q2) d2.c("AutoManageHelper", q2.class);
        return q2Var != null ? q2Var : new q2(d2);
    }

    private final p2 w(int i2) {
        if (this.f1157j.size() <= i2) {
            return null;
        }
        SparseArray<p2> sparseArray = this.f1157j;
        return sparseArray.get(sparseArray.keyAt(i2));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i2 = 0; i2 < this.f1157j.size(); i2++) {
            p2 w = w(i2);
            if (w != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(w.a);
                printWriter.println(":");
                w.b.f(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.v2, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void j() {
        super.j();
        boolean z = this.f1187f;
        String valueOf = String.valueOf(this.f1157j);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("onStart ");
        sb.append(z);
        sb.append(" ");
        sb.append(valueOf);
        Log.d("AutoManageHelper", sb.toString());
        if (this.f1188g.get() == null) {
            for (int i2 = 0; i2 < this.f1157j.size(); i2++) {
                p2 w = w(i2);
                if (w != null) {
                    w.b.d();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.v2, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void k() {
        super.k();
        for (int i2 = 0; i2 < this.f1157j.size(); i2++) {
            p2 w = w(i2);
            if (w != null) {
                w.b.e();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.v2
    protected final void m(a aVar, int i2) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i2 < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        p2 p2Var = this.f1157j.get(i2);
        if (p2Var != null) {
            v(i2);
            f.c cVar = p2Var.c;
            if (cVar != null) {
                cVar.a(aVar);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.v2
    protected final void n() {
        for (int i2 = 0; i2 < this.f1157j.size(); i2++) {
            p2 w = w(i2);
            if (w != null) {
                w.b.d();
            }
        }
    }

    public final void u(int i2, f fVar, f.c cVar) {
        p.j(fVar, "GoogleApiClient instance cannot be null");
        boolean z = this.f1157j.indexOfKey(i2) < 0;
        StringBuilder sb = new StringBuilder(54);
        sb.append("Already managing a GoogleApiClient with id ");
        sb.append(i2);
        p.l(z, sb.toString());
        s2 s2Var = this.f1188g.get();
        boolean z2 = this.f1187f;
        String valueOf = String.valueOf(s2Var);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 49);
        sb2.append("starting AutoManage for client ");
        sb2.append(i2);
        sb2.append(" ");
        sb2.append(z2);
        sb2.append(" ");
        sb2.append(valueOf);
        Log.d("AutoManageHelper", sb2.toString());
        p2 p2Var = new p2(this, i2, fVar, cVar);
        fVar.m(p2Var);
        this.f1157j.put(i2, p2Var);
        if (this.f1187f && s2Var == null) {
            Log.d("AutoManageHelper", "connecting ".concat(fVar.toString()));
            fVar.d();
        }
    }

    public final void v(int i2) {
        p2 p2Var = this.f1157j.get(i2);
        this.f1157j.remove(i2);
        if (p2Var != null) {
            p2Var.b.n(p2Var);
            p2Var.b.e();
        }
    }
}

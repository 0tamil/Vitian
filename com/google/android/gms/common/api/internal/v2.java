package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.a;
import com.google.android.gms.common.d;
import f.b.a.b.d.a.j;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public abstract class v2 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: f  reason: collision with root package name */
    protected volatile boolean f1187f;

    /* renamed from: g  reason: collision with root package name */
    protected final AtomicReference<s2> f1188g = new AtomicReference<>(null);

    /* renamed from: h  reason: collision with root package name */
    private final Handler f1189h = new j(Looper.getMainLooper());

    /* renamed from: i  reason: collision with root package name */
    protected final d f1190i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v2(i iVar, d dVar) {
        super(iVar);
        this.f1190i = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(a aVar, int i2) {
        this.f1188g.set(null);
        m(aVar, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        this.f1188g.set(null);
        n();
    }

    private static final int p(s2 s2Var) {
        if (s2Var == null) {
            return -1;
        }
        return s2Var.a();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void e(int i2, int i3, Intent intent) {
        s2 s2Var = this.f1188g.get();
        if (i2 != 1) {
            if (i2 == 2) {
                int g2 = this.f1190i.g(b());
                if (g2 == 0) {
                    o();
                    return;
                } else if (s2Var != null) {
                    if (s2Var.b().b() == 18 && g2 == 18) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else if (i3 == -1) {
            o();
            return;
        } else if (i3 == 0) {
            if (s2Var != null) {
                int i4 = 13;
                if (intent != null) {
                    i4 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                l(new a(i4, null, s2Var.b().toString()), p(s2Var));
                return;
            }
            return;
        }
        if (s2Var != null) {
            l(s2Var.b(), s2Var.a());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void f(Bundle bundle) {
        super.f(bundle);
        if (bundle != null) {
            this.f1188g.set(bundle.getBoolean("resolving_error", false) ? new s2(new a(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void i(Bundle bundle) {
        super.i(bundle);
        s2 s2Var = this.f1188g.get();
        if (s2Var != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", s2Var.a());
            bundle.putInt("failed_status", s2Var.b().b());
            bundle.putParcelable("failed_resolution", s2Var.b().d());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void j() {
        super.j();
        this.f1187f = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void k() {
        super.k();
        this.f1187f = false;
    }

    protected abstract void m(a aVar, int i2);

    protected abstract void n();

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        l(new a(13, null), p(this.f1188g.get()));
    }

    public final void s(a aVar, int i2) {
        s2 s2Var = new s2(aVar, i2);
        if (this.f1188g.compareAndSet(null, s2Var)) {
            this.f1189h.post(new u2(this, s2Var));
        }
    }
}

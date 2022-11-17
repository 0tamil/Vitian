package f.b.a.b.d.d;

import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.c;
/* loaded from: classes.dex */
final class j0 extends l0 {
    final /* synthetic */ LocationRequest t;
    final /* synthetic */ c u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(n0 n0Var, f fVar, LocationRequest locationRequest, c cVar) {
        super(fVar);
        this.t = locationRequest;
        this.u = cVar;
    }

    @Override // com.google.android.gms.common.api.internal.d
    protected final /* bridge */ /* synthetic */ void q(s sVar) {
        sVar.q0(this.t, k.a(this.u, b0.a(), c.class.getSimpleName()), new m0(this));
    }
}

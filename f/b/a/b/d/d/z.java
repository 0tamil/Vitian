package f.b.a.b.d.d;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.j;
import com.google.android.gms.location.e;
import com.google.android.gms.location.f;
import com.google.android.gms.location.v;
/* loaded from: classes.dex */
final class z extends v<f> {
    final /* synthetic */ e t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0 a0Var, com.google.android.gms.common.api.f fVar, e eVar, String str) {
        super(fVar);
        this.t = eVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ j e(Status status) {
        return new f(status, null);
    }

    @Override // com.google.android.gms.common.api.internal.d
    protected final /* bridge */ /* synthetic */ void q(s sVar) {
        sVar.s0(this.t, this, null);
    }
}

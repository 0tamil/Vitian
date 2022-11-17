package f.b.a.b.d.d;

import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.b;
/* loaded from: classes.dex */
final class m extends com.google.android.gms.location.m {
    private final j<b> a;

    @Override // com.google.android.gms.location.n
    public final void m(LocationAvailability locationAvailability) {
        this.a.c(new l(this, locationAvailability));
    }

    @Override // com.google.android.gms.location.n
    public final void v(LocationResult locationResult) {
        this.a.c(new k(this, locationResult));
    }
}

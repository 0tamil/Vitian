package f.b.a.b.d.d;

import android.location.Location;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.location.c;
/* loaded from: classes.dex */
final class p extends com.google.android.gms.location.p {
    private final j<c> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(j<c> jVar) {
        this.a = jVar;
    }

    public final synchronized void c() {
        this.a.a();
    }

    @Override // com.google.android.gms.location.q
    public final synchronized void q(Location location) {
        this.a.c(new o(this, location));
    }
}

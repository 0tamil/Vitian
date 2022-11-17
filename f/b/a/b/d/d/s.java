package f.b.a.b.d.d;

import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.util.b;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.c;
import com.google.android.gms.location.f0;
/* loaded from: classes.dex */
public final class s extends e0 {
    private final q G;

    public s(Context context, Looper looper, f.b bVar, f.c cVar, String str, e eVar) {
        super(context, looper, bVar, cVar, str, eVar);
        this.G = new q(context, this.F);
    }

    @Override // com.google.android.gms.common.internal.c
    public final boolean V() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.c, com.google.android.gms.common.api.a.f
    public final void n() {
        synchronized (this.G) {
            if (a()) {
                try {
                    this.G.g();
                    this.G.h();
                } catch (Exception e2) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e2);
                }
            }
            super.n();
        }
    }

    public final LocationAvailability p0() {
        return this.G.c();
    }

    public final void q0(LocationRequest locationRequest, j<c> jVar, f fVar) {
        synchronized (this.G) {
            this.G.d(locationRequest, jVar, fVar);
        }
    }

    public final void r0(j.a<c> aVar, f fVar) {
        this.G.e(aVar, fVar);
    }

    public final void s0(com.google.android.gms.location.e eVar, com.google.android.gms.common.api.internal.e<com.google.android.gms.location.f> eVar2, String str) {
        v();
        boolean z = true;
        p.b(eVar != null, "locationSettingsRequest can't be null nor empty.");
        if (eVar2 == null) {
            z = false;
        }
        p.b(z, "listener can't be null.");
        ((h) H()).i(eVar, new r(eVar2), null);
    }

    public final Location t0(String str) {
        return b.b(d(), f0.c) ? this.G.a(str) : this.G.b();
    }
}

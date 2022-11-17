package f.b.a.b.d.d;

import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.location.f;
/* loaded from: classes.dex */
final class r extends i {
    private e<f> a;

    public r(e<f> eVar) {
        p.b(eVar != null, "listener can't be null.");
        this.a = eVar;
    }

    @Override // f.b.a.b.d.d.j
    public final void I(f fVar) {
        this.a.a(fVar);
        this.a = null;
    }
}

package f.b.a.b.b;

import android.os.Bundle;
/* loaded from: classes.dex */
final class w extends u<Bundle> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public w(int i2, int i3, Bundle bundle) {
        super(i2, 1, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // f.b.a.b.b.u
    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        d(bundle2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // f.b.a.b.b.u
    public final boolean b() {
        return false;
    }
}

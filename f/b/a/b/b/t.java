package f.b.a.b.b;

import android.os.Bundle;
/* loaded from: classes.dex */
final class t extends u<Void> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public t(int i2, int i3, Bundle bundle) {
        super(i2, 2, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // f.b.a.b.b.u
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new v(4, "Invalid response to one way request", null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // f.b.a.b.b.u
    public final boolean b() {
        return true;
    }
}

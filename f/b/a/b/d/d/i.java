package f.b.a.b.d.d;

import android.os.Parcel;
import com.google.android.gms.location.f;
/* loaded from: classes.dex */
public abstract class i extends t implements j {
    public i() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    @Override // f.b.a.b.d.d.t
    protected final boolean a(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 1) {
            return false;
        }
        I((f) c0.b(parcel, f.CREATOR));
        return true;
    }
}

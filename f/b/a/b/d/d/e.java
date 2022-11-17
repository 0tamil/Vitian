package f.b.a.b.d.d;

import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class e extends t implements f {
    public e() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // f.b.a.b.d.d.t
    protected final boolean a(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            z((b) c0.b(parcel, b.CREATOR));
        } else if (i2 != 2) {
            return false;
        } else {
            c();
        }
        return true;
    }
}

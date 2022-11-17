package f.b.a.b.d.d;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.e;
/* loaded from: classes.dex */
public final class g extends a implements h {
    /* JADX INFO: Access modifiers changed from: package-private */
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // f.b.a.b.d.d.h
    public final LocationAvailability A(String str) {
        Parcel a = a();
        a.writeString(str);
        Parcel b = b(34, a);
        LocationAvailability locationAvailability = (LocationAvailability) c0.b(b, LocationAvailability.CREATOR);
        b.recycle();
        return locationAvailability;
    }

    @Override // f.b.a.b.d.d.h
    public final Location C() {
        Parcel b = b(7, a());
        Location location = (Location) c0.b(b, Location.CREATOR);
        b.recycle();
        return location;
    }

    @Override // f.b.a.b.d.d.h
    public final void K(h0 h0Var) {
        Parcel a = a();
        c0.c(a, h0Var);
        d(75, a);
    }

    @Override // f.b.a.b.d.d.h
    public final void N(boolean z) {
        Parcel a = a();
        c0.a(a, z);
        d(12, a);
    }

    @Override // f.b.a.b.d.d.h
    public final void i(e eVar, j jVar, String str) {
        Parcel a = a();
        c0.c(a, eVar);
        c0.d(a, jVar);
        a.writeString(null);
        d(63, a);
    }

    @Override // f.b.a.b.d.d.h
    public final Location t(String str) {
        Parcel a = a();
        a.writeString(str);
        Parcel b = b(80, a);
        Location location = (Location) c0.b(b, Location.CREATOR);
        b.recycle();
        return location;
    }

    @Override // f.b.a.b.d.d.h
    public final void u(w wVar) {
        Parcel a = a();
        c0.c(a, wVar);
        d(59, a);
    }
}

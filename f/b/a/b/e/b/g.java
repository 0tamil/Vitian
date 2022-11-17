package f.b.a.b.e.b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.j;
import f.b.a.b.d.a.a;
import f.b.a.b.d.a.c;
/* loaded from: classes.dex */
public final class g extends a implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void J(int i2) {
        Parcel a = a();
        a.writeInt(i2);
        b(7, a);
    }

    public final void R(j jVar, int i2, boolean z) {
        Parcel a = a();
        c.d(a, jVar);
        a.writeInt(i2);
        c.b(a, z);
        b(9, a);
    }

    public final void S(j jVar, f fVar) {
        Parcel a = a();
        c.c(a, jVar);
        c.d(a, fVar);
        b(12, a);
    }
}

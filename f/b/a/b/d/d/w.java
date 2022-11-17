package f.b.a.b.d.d;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.x.a;
import com.google.android.gms.common.internal.x.c;
import com.google.android.gms.location.m;
import com.google.android.gms.location.n;
import com.google.android.gms.location.p;
import com.google.android.gms.location.q;
/* loaded from: classes.dex */
public final class w extends a {
    public static final Parcelable.Creator<w> CREATOR = new x();

    /* renamed from: e  reason: collision with root package name */
    final int f2370e;

    /* renamed from: f  reason: collision with root package name */
    final u f2371f;

    /* renamed from: g  reason: collision with root package name */
    final q f2372g;

    /* renamed from: h  reason: collision with root package name */
    final PendingIntent f2373h;

    /* renamed from: i  reason: collision with root package name */
    final n f2374i;

    /* renamed from: j  reason: collision with root package name */
    final f f2375j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(int i2, u uVar, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        this.f2370e = i2;
        this.f2371f = uVar;
        f fVar = null;
        this.f2372g = iBinder == null ? null : p.b(iBinder);
        this.f2373h = pendingIntent;
        this.f2374i = iBinder2 == null ? null : m.b(iBinder2);
        if (iBinder3 != null) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            fVar = queryLocalInterface instanceof f ? (f) queryLocalInterface : new d(iBinder3);
        }
        this.f2375j = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.android.gms.location.q, android.os.IBinder] */
    public static w b(q qVar, f fVar) {
        if (fVar == null) {
            fVar = null;
        }
        return new w(2, null, qVar, null, null, fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.android.gms.location.n, android.os.IBinder] */
    public static w c(n nVar, f fVar) {
        if (fVar == null) {
            fVar = null;
        }
        return new w(2, null, null, null, nVar, fVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.g(parcel, 1, this.f2370e);
        c.j(parcel, 2, this.f2371f, i2, false);
        q qVar = this.f2372g;
        IBinder iBinder = null;
        c.f(parcel, 3, qVar == null ? null : qVar.asBinder(), false);
        c.j(parcel, 4, this.f2373h, i2, false);
        n nVar = this.f2374i;
        c.f(parcel, 5, nVar == null ? null : nVar.asBinder(), false);
        f fVar = this.f2375j;
        if (fVar != null) {
            iBinder = fVar.asBinder();
        }
        c.f(parcel, 6, iBinder, false);
        c.b(parcel, a);
    }
}

package f.b.a.b.b;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import f.b.a.b.b.c;
/* loaded from: classes.dex */
public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new g();

    /* renamed from: e  reason: collision with root package name */
    Messenger f2330e;

    /* renamed from: f  reason: collision with root package name */
    c f2331f;

    public i(IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f2330e = new Messenger(iBinder);
        } else {
            this.f2331f = new c.a(iBinder);
        }
    }

    public final IBinder a() {
        Messenger messenger = this.f2330e;
        return messenger != null ? messenger.getBinder() : this.f2331f.asBinder();
    }

    public final void b(Message message) {
        Messenger messenger = this.f2330e;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f2331f.x(message);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return a().equals(((i) obj).a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return a().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        Messenger messenger = this.f2330e;
        parcel.writeStrongBinder(messenger != null ? messenger.getBinder() : this.f2331f.asBinder());
    }
}

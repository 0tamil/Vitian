package f.b.a.b.b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
/* loaded from: classes.dex */
interface c extends IInterface {

    /* loaded from: classes.dex */
    public static class a implements c {
        private final IBinder a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(IBinder iBinder) {
            this.a = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.a;
        }

        @Override // f.b.a.b.b.c
        public void x(Message message) {
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
            obtain.writeInt(1);
            message.writeToParcel(obtain, 0);
            try {
                this.a.transact(1, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        }
    }

    void x(Message message);
}

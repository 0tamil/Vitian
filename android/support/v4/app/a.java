package android.support.v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: android.support.v4.app.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0000a extends Binder implements a {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: android.support.v4.app.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0001a implements a {
            public static a b;
            private IBinder a;

            C0001a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.support.v4.app.a
            public void B(String str, int i2, String str2, Notification notification) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i2);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.a.transact(1, obtain, null, 1) && AbstractBinderC0000a.b() != null) {
                        AbstractBinderC0000a.b().B(str, i2, str2, notification);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // android.support.v4.app.a
            public void e(String str) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    if (!this.a.transact(3, obtain, null, 1) && AbstractBinderC0000a.b() != null) {
                        AbstractBinderC0000a.b().e(str);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.app.a
            public void p(String str, int i2, String str2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i2);
                    obtain.writeString(str2);
                    if (!this.a.transact(2, obtain, null, 1) && AbstractBinderC0000a.b() != null) {
                        AbstractBinderC0000a.b().p(str, i2, str2);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0001a(iBinder) : (a) queryLocalInterface;
        }

        public static a b() {
            return C0001a.b;
        }
    }

    void B(String str, int i2, String str2, Notification notification);

    void e(String str);

    void p(String str, int i2, String str2);
}

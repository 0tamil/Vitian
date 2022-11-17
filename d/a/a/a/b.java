package d.a.a.a;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import d.a.a.a.a;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    final Handler f1907e = null;

    /* renamed from: f  reason: collision with root package name */
    d.a.a.a.a f1908f;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<b> {
        a() {
        }

        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        /* renamed from: b */
        public b[] newArray(int i2) {
            return new b[i2];
        }
    }

    /* renamed from: d.a.a.a.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class BinderC0061b extends a.AbstractBinderC0059a {
        BinderC0061b() {
        }

        @Override // d.a.a.a.a
        public void O(int i2, Bundle bundle) {
            b bVar = b.this;
            Handler handler = bVar.f1907e;
            if (handler != null) {
                handler.post(new c(i2, bundle));
            } else {
                bVar.a(i2, bundle);
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final int f1909e;

        /* renamed from: f  reason: collision with root package name */
        final Bundle f1910f;

        c(int i2, Bundle bundle) {
            this.f1909e = i2;
            this.f1910f = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f1909e, this.f1910f);
        }
    }

    b(Parcel parcel) {
        this.f1908f = a.AbstractBinderC0059a.a(parcel.readStrongBinder());
    }

    protected void a(int i2, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        synchronized (this) {
            if (this.f1908f == null) {
                this.f1908f = new BinderC0061b();
            }
            parcel.writeStrongBinder(this.f1908f.asBinder());
        }
    }
}

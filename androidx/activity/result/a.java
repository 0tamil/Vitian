package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0006a();

    /* renamed from: e  reason: collision with root package name */
    private final int f69e;

    /* renamed from: f  reason: collision with root package name */
    private final Intent f70f;

    /* renamed from: androidx.activity.result.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0006a implements Parcelable.Creator<a> {
        C0006a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        /* renamed from: b */
        public a[] newArray(int i2) {
            return new a[i2];
        }
    }

    public a(int i2, Intent intent) {
        this.f69e = i2;
        this.f70f = intent;
    }

    a(Parcel parcel) {
        this.f69e = parcel.readInt();
        this.f70f = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    public static String c(int i2) {
        return i2 != -1 ? i2 != 0 ? String.valueOf(i2) : "RESULT_CANCELED" : "RESULT_OK";
    }

    public Intent a() {
        return this.f70f;
    }

    public int b() {
        return this.f69e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + c(this.f69e) + ", data=" + this.f70f + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f69e);
        parcel.writeInt(this.f70f == null ? 0 : 1);
        Intent intent = this.f70f;
        if (intent != null) {
            intent.writeToParcel(parcel, i2);
        }
    }
}

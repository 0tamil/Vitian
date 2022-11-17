package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    public int f35e;

    /* renamed from: f  reason: collision with root package name */
    public int f36f;

    /* renamed from: g  reason: collision with root package name */
    public int f37g;

    /* renamed from: h  reason: collision with root package name */
    public int f38h;

    /* renamed from: i  reason: collision with root package name */
    public int f39i;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        a() {
        }

        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        /* renamed from: b */
        public ParcelableVolumeInfo[] newArray(int i2) {
            return new ParcelableVolumeInfo[i2];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f35e = parcel.readInt();
        this.f37g = parcel.readInt();
        this.f38h = parcel.readInt();
        this.f39i = parcel.readInt();
        this.f36f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f35e);
        parcel.writeInt(this.f37g);
        parcel.writeInt(this.f38h);
        parcel.writeInt(this.f39i);
        parcel.writeInt(this.f36f);
    }
}

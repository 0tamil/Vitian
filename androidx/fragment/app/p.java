package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.n;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    ArrayList<t> f779e;

    /* renamed from: f  reason: collision with root package name */
    ArrayList<String> f780f;

    /* renamed from: g  reason: collision with root package name */
    b[] f781g;

    /* renamed from: h  reason: collision with root package name */
    int f782h;

    /* renamed from: i  reason: collision with root package name */
    String f783i;

    /* renamed from: j  reason: collision with root package name */
    ArrayList<String> f784j;

    /* renamed from: k  reason: collision with root package name */
    ArrayList<Bundle> f785k;
    ArrayList<n.m> l;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<p> {
        a() {
        }

        /* renamed from: a */
        public p createFromParcel(Parcel parcel) {
            return new p(parcel);
        }

        /* renamed from: b */
        public p[] newArray(int i2) {
            return new p[i2];
        }
    }

    public p() {
        this.f783i = null;
        this.f784j = new ArrayList<>();
        this.f785k = new ArrayList<>();
    }

    public p(Parcel parcel) {
        this.f783i = null;
        this.f784j = new ArrayList<>();
        this.f785k = new ArrayList<>();
        this.f779e = parcel.createTypedArrayList(t.CREATOR);
        this.f780f = parcel.createStringArrayList();
        this.f781g = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f782h = parcel.readInt();
        this.f783i = parcel.readString();
        this.f784j = parcel.createStringArrayList();
        this.f785k = parcel.createTypedArrayList(Bundle.CREATOR);
        this.l = parcel.createTypedArrayList(n.m.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeTypedList(this.f779e);
        parcel.writeStringList(this.f780f);
        parcel.writeTypedArray(this.f781g, i2);
        parcel.writeInt(this.f782h);
        parcel.writeString(this.f783i);
        parcel.writeStringList(this.f784j);
        parcel.writeTypedList(this.f785k);
        parcel.writeTypedList(this.l);
    }
}

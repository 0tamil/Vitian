package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class t implements Parcelable {
    public static final Parcelable.Creator<t> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    final String f792e;

    /* renamed from: f  reason: collision with root package name */
    final String f793f;

    /* renamed from: g  reason: collision with root package name */
    final boolean f794g;

    /* renamed from: h  reason: collision with root package name */
    final int f795h;

    /* renamed from: i  reason: collision with root package name */
    final int f796i;

    /* renamed from: j  reason: collision with root package name */
    final String f797j;

    /* renamed from: k  reason: collision with root package name */
    final boolean f798k;
    final boolean l;
    final boolean m;
    final Bundle n;
    final boolean o;
    final int p;
    Bundle q;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<t> {
        a() {
        }

        /* renamed from: a */
        public t createFromParcel(Parcel parcel) {
            return new t(parcel);
        }

        /* renamed from: b */
        public t[] newArray(int i2) {
            return new t[i2];
        }
    }

    t(Parcel parcel) {
        this.f792e = parcel.readString();
        this.f793f = parcel.readString();
        boolean z = true;
        this.f794g = parcel.readInt() != 0;
        this.f795h = parcel.readInt();
        this.f796i = parcel.readInt();
        this.f797j = parcel.readString();
        this.f798k = parcel.readInt() != 0;
        this.l = parcel.readInt() != 0;
        this.m = parcel.readInt() != 0;
        this.n = parcel.readBundle();
        this.o = parcel.readInt() == 0 ? false : z;
        this.q = parcel.readBundle();
        this.p = parcel.readInt();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(Fragment fragment) {
        this.f792e = fragment.getClass().getName();
        this.f793f = fragment.f678j;
        this.f794g = fragment.r;
        this.f795h = fragment.A;
        this.f796i = fragment.B;
        this.f797j = fragment.C;
        this.f798k = fragment.F;
        this.l = fragment.q;
        this.m = fragment.E;
        this.n = fragment.f679k;
        this.o = fragment.D;
        this.p = fragment.U.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f792e);
        sb.append(" (");
        sb.append(this.f793f);
        sb.append(")}:");
        if (this.f794g) {
            sb.append(" fromLayout");
        }
        if (this.f796i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f796i));
        }
        String str = this.f797j;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f797j);
        }
        if (this.f798k) {
            sb.append(" retainInstance");
        }
        if (this.l) {
            sb.append(" removing");
        }
        if (this.m) {
            sb.append(" detached");
        }
        if (this.o) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f792e);
        parcel.writeString(this.f793f);
        parcel.writeInt(this.f794g ? 1 : 0);
        parcel.writeInt(this.f795h);
        parcel.writeInt(this.f796i);
        parcel.writeString(this.f797j);
        parcel.writeInt(this.f798k ? 1 : 0);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeInt(this.m ? 1 : 0);
        parcel.writeBundle(this.n);
        parcel.writeInt(this.o ? 1 : 0);
        parcel.writeBundle(this.q);
        parcel.writeInt(this.p);
    }
}

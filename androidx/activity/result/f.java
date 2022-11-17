package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    private final IntentSender f77e;

    /* renamed from: f  reason: collision with root package name */
    private final Intent f78f;

    /* renamed from: g  reason: collision with root package name */
    private final int f79g;

    /* renamed from: h  reason: collision with root package name */
    private final int f80h;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<f> {
        a() {
        }

        /* renamed from: a */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        /* renamed from: b */
        public f[] newArray(int i2) {
            return new f[i2];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private IntentSender a;
        private Intent b;
        private int c;

        /* renamed from: d  reason: collision with root package name */
        private int f81d;

        public b(IntentSender intentSender) {
            this.a = intentSender;
        }

        public f a() {
            return new f(this.a, this.b, this.c, this.f81d);
        }

        public b b(Intent intent) {
            this.b = intent;
            return this;
        }

        public b c(int i2, int i3) {
            this.f81d = i2;
            this.c = i3;
            return this;
        }
    }

    f(IntentSender intentSender, Intent intent, int i2, int i3) {
        this.f77e = intentSender;
        this.f78f = intent;
        this.f79g = i2;
        this.f80h = i3;
    }

    f(Parcel parcel) {
        this.f77e = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f78f = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f79g = parcel.readInt();
        this.f80h = parcel.readInt();
    }

    public Intent a() {
        return this.f78f;
    }

    public int b() {
        return this.f79g;
    }

    public int c() {
        return this.f80h;
    }

    public IntentSender d() {
        return this.f77e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f77e, i2);
        parcel.writeParcelable(this.f78f, i2);
        parcel.writeInt(this.f79g);
        parcel.writeInt(this.f80h);
    }
}

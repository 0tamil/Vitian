package e.f.a;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public abstract class a implements Parcelable {

    /* renamed from: e  reason: collision with root package name */
    private final Parcelable f2156e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f2155f = new C0080a();
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: e.f.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0080a extends a {
        C0080a() {
            super((C0080a) null);
        }
    }

    /* loaded from: classes.dex */
    static class b implements Parcelable.ClassLoaderCreator<a> {
        b() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        /* renamed from: b */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f2155f;
            }
            throw new IllegalStateException("superState must be null");
        }

        /* renamed from: c */
        public a[] newArray(int i2) {
            return new a[i2];
        }
    }

    private a() {
        this.f2156e = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f2156e = readParcelable == null ? f2155f : readParcelable;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f2156e = parcelable == f2155f ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    /* synthetic */ a(C0080a aVar) {
        this();
    }

    public final Parcelable a() {
        return this.f2156e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f2156e, i2);
    }
}

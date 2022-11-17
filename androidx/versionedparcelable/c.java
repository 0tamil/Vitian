package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import e.c.a;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
class c extends b {

    /* renamed from: d  reason: collision with root package name */
    private final SparseIntArray f890d;

    /* renamed from: e  reason: collision with root package name */
    private final Parcel f891e;

    /* renamed from: f  reason: collision with root package name */
    private final int f892f;

    /* renamed from: g  reason: collision with root package name */
    private final int f893g;

    /* renamed from: h  reason: collision with root package name */
    private final String f894h;

    /* renamed from: i  reason: collision with root package name */
    private int f895i;

    /* renamed from: j  reason: collision with root package name */
    private int f896j;

    /* renamed from: k  reason: collision with root package name */
    private int f897k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new a(), new a(), new a());
    }

    private c(Parcel parcel, int i2, int i3, String str, a<String, Method> aVar, a<String, Method> aVar2, a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f890d = new SparseIntArray();
        this.f895i = -1;
        this.f896j = 0;
        this.f897k = -1;
        this.f891e = parcel;
        this.f892f = i2;
        this.f893g = i3;
        this.f896j = i2;
        this.f894h = str;
    }

    @Override // androidx.versionedparcelable.b
    public void A(byte[] bArr) {
        if (bArr != null) {
            this.f891e.writeInt(bArr.length);
            this.f891e.writeByteArray(bArr);
            return;
        }
        this.f891e.writeInt(-1);
    }

    @Override // androidx.versionedparcelable.b
    protected void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f891e, 0);
    }

    @Override // androidx.versionedparcelable.b
    public void E(int i2) {
        this.f891e.writeInt(i2);
    }

    @Override // androidx.versionedparcelable.b
    public void G(Parcelable parcelable) {
        this.f891e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.b
    public void I(String str) {
        this.f891e.writeString(str);
    }

    @Override // androidx.versionedparcelable.b
    public void a() {
        int i2 = this.f895i;
        if (i2 >= 0) {
            int i3 = this.f890d.get(i2);
            int dataPosition = this.f891e.dataPosition();
            this.f891e.setDataPosition(i3);
            this.f891e.writeInt(dataPosition - i3);
            this.f891e.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.b
    protected b b() {
        Parcel parcel = this.f891e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.f896j;
        if (i2 == this.f892f) {
            i2 = this.f893g;
        }
        int i3 = i2;
        return new c(parcel, dataPosition, i3, this.f894h + "  ", this.a, this.b, this.c);
    }

    @Override // androidx.versionedparcelable.b
    public boolean g() {
        return this.f891e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.b
    public byte[] i() {
        int readInt = this.f891e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f891e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.b
    protected CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f891e);
    }

    @Override // androidx.versionedparcelable.b
    public boolean m(int i2) {
        while (this.f896j < this.f893g) {
            int i3 = this.f897k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            this.f891e.setDataPosition(this.f896j);
            int readInt = this.f891e.readInt();
            this.f897k = this.f891e.readInt();
            this.f896j += readInt;
        }
        return this.f897k == i2;
    }

    @Override // androidx.versionedparcelable.b
    public int o() {
        return this.f891e.readInt();
    }

    @Override // androidx.versionedparcelable.b
    public <T extends Parcelable> T q() {
        return (T) this.f891e.readParcelable(c.class.getClassLoader());
    }

    @Override // androidx.versionedparcelable.b
    public String s() {
        return this.f891e.readString();
    }

    @Override // androidx.versionedparcelable.b
    public void w(int i2) {
        a();
        this.f895i = i2;
        this.f890d.put(i2, this.f891e.dataPosition());
        E(0);
        E(i2);
    }

    @Override // androidx.versionedparcelable.b
    public void y(boolean z) {
        this.f891e.writeInt(z ? 1 : 0);
    }
}

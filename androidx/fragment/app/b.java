package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.w;
import androidx.lifecycle.d;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    final int[] f694e;

    /* renamed from: f  reason: collision with root package name */
    final ArrayList<String> f695f;

    /* renamed from: g  reason: collision with root package name */
    final int[] f696g;

    /* renamed from: h  reason: collision with root package name */
    final int[] f697h;

    /* renamed from: i  reason: collision with root package name */
    final int f698i;

    /* renamed from: j  reason: collision with root package name */
    final String f699j;

    /* renamed from: k  reason: collision with root package name */
    final int f700k;
    final int l;
    final CharSequence m;
    final int n;
    final CharSequence o;
    final ArrayList<String> p;
    final ArrayList<String> q;
    final boolean r;

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

    public b(Parcel parcel) {
        this.f694e = parcel.createIntArray();
        this.f695f = parcel.createStringArrayList();
        this.f696g = parcel.createIntArray();
        this.f697h = parcel.createIntArray();
        this.f698i = parcel.readInt();
        this.f699j = parcel.readString();
        this.f700k = parcel.readInt();
        this.l = parcel.readInt();
        this.m = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.n = parcel.readInt();
        this.o = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.p = parcel.createStringArrayList();
        this.q = parcel.createStringArrayList();
        this.r = parcel.readInt() != 0;
    }

    public b(androidx.fragment.app.a aVar) {
        int size = aVar.a.size();
        this.f694e = new int[size * 5];
        if (aVar.f805g) {
            this.f695f = new ArrayList<>(size);
            this.f696g = new int[size];
            this.f697h = new int[size];
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                w.a aVar2 = aVar.a.get(i3);
                int i4 = i2 + 1;
                this.f694e[i2] = aVar2.a;
                ArrayList<String> arrayList = this.f695f;
                Fragment fragment = aVar2.b;
                arrayList.add(fragment != null ? fragment.f678j : null);
                int[] iArr = this.f694e;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.c;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.f810d;
                int i7 = i6 + 1;
                iArr[i6] = aVar2.f811e;
                i2 = i7 + 1;
                iArr[i7] = aVar2.f812f;
                this.f696g[i3] = aVar2.f813g.ordinal();
                this.f697h[i3] = aVar2.f814h.ordinal();
            }
            this.f698i = aVar.f804f;
            this.f699j = aVar.f806h;
            this.f700k = aVar.s;
            this.l = aVar.f807i;
            this.m = aVar.f808j;
            this.n = aVar.f809k;
            this.o = aVar.l;
            this.p = aVar.m;
            this.q = aVar.n;
            this.r = aVar.o;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public androidx.fragment.app.a a(n nVar) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(nVar);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = this.f694e;
            if (i2 < iArr.length) {
                w.a aVar2 = new w.a();
                int i4 = i2 + 1;
                aVar2.a = iArr[i2];
                if (n.E0(2)) {
                    Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i3 + " base fragment #" + this.f694e[i4]);
                }
                String str = this.f695f.get(i3);
                aVar2.b = str != null ? nVar.f0(str) : null;
                aVar2.f813g = d.c.values()[this.f696g[i3]];
                aVar2.f814h = d.c.values()[this.f697h[i3]];
                int[] iArr2 = this.f694e;
                int i5 = i4 + 1;
                int i6 = iArr2[i4];
                aVar2.c = i6;
                int i7 = i5 + 1;
                int i8 = iArr2[i5];
                aVar2.f810d = i8;
                int i9 = i7 + 1;
                int i10 = iArr2[i7];
                aVar2.f811e = i10;
                i2 = i9 + 1;
                int i11 = iArr2[i9];
                aVar2.f812f = i11;
                aVar.b = i6;
                aVar.c = i8;
                aVar.f802d = i10;
                aVar.f803e = i11;
                aVar.e(aVar2);
                i3++;
            } else {
                aVar.f804f = this.f698i;
                aVar.f806h = this.f699j;
                aVar.s = this.f700k;
                aVar.f805g = true;
                aVar.f807i = this.l;
                aVar.f808j = this.m;
                aVar.f809k = this.n;
                aVar.l = this.o;
                aVar.m = this.p;
                aVar.n = this.q;
                aVar.o = this.r;
                aVar.m(1);
                return aVar;
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.f694e);
        parcel.writeStringList(this.f695f);
        parcel.writeIntArray(this.f696g);
        parcel.writeIntArray(this.f697h);
        parcel.writeInt(this.f698i);
        parcel.writeString(this.f699j);
        parcel.writeInt(this.f700k);
        parcel.writeInt(this.l);
        TextUtils.writeToParcel(this.m, parcel, 0);
        parcel.writeInt(this.n);
        TextUtils.writeToParcel(this.o, parcel, 0);
        parcel.writeStringList(this.p);
        parcel.writeStringList(this.q);
        parcel.writeInt(this.r ? 1 : 0);
    }
}

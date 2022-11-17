package f.b.a.b.e.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.o0;
import com.google.android.gms.common.internal.x.a;
import com.google.android.gms.common.internal.x.c;
/* loaded from: classes.dex */
public final class j extends a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: e  reason: collision with root package name */
    final int f2389e;

    /* renamed from: f  reason: collision with root package name */
    final o0 f2390f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(int i2, o0 o0Var) {
        this.f2389e = i2;
        this.f2390f = o0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.g(parcel, 1, this.f2389e);
        c.j(parcel, 2, this.f2390f, i2, false);
        c.b(parcel, a);
    }
}

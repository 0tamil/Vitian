package f.b.a.b.e.b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.internal.x.a;
import com.google.android.gms.common.internal.x.c;
/* loaded from: classes.dex */
public final class b extends a implements j {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: e  reason: collision with root package name */
    final int f2384e;

    /* renamed from: f  reason: collision with root package name */
    private int f2385f;

    /* renamed from: g  reason: collision with root package name */
    private Intent f2386g;

    public b() {
        this(2, 0, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(int i2, int i3, Intent intent) {
        this.f2384e = i2;
        this.f2385f = i3;
        this.f2386g = intent;
    }

    @Override // com.google.android.gms.common.api.j
    public final Status a() {
        return this.f2385f == 0 ? Status.f1046j : Status.m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.g(parcel, 1, this.f2384e);
        c.g(parcel, 2, this.f2385f);
        c.j(parcel, 3, this.f2386g, i2, false);
        c.b(parcel, a);
    }
}

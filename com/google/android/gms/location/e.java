package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.x.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class e extends com.google.android.gms.common.internal.x.a {
    @RecentlyNonNull
    public static final Parcelable.Creator<e> CREATOR = new y();

    /* renamed from: e  reason: collision with root package name */
    private final List<LocationRequest> f1330e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f1331f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f1332g;

    /* renamed from: h  reason: collision with root package name */
    private w f1333h;

    /* loaded from: classes.dex */
    public static final class a {
        private final ArrayList<LocationRequest> a = new ArrayList<>();
        private boolean b = false;
        private boolean c = false;

        @RecentlyNonNull
        public a a(@RecentlyNonNull LocationRequest locationRequest) {
            if (locationRequest != null) {
                this.a.add(locationRequest);
            }
            return this;
        }

        @RecentlyNonNull
        public e b() {
            return new e(this.a, this.b, this.c, null);
        }

        @RecentlyNonNull
        public a c(boolean z) {
            this.b = z;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(List<LocationRequest> list, boolean z, boolean z2, w wVar) {
        this.f1330e = list;
        this.f1331f = z;
        this.f1332g = z2;
        this.f1333h = wVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i2) {
        int a2 = c.a(parcel);
        c.n(parcel, 1, Collections.unmodifiableList(this.f1330e), false);
        c.c(parcel, 2, this.f1331f);
        c.c(parcel, 3, this.f1332g);
        c.j(parcel, 5, this.f1333h, i2, false);
        c.b(parcel, a2);
    }
}

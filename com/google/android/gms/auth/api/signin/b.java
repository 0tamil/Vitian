package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class b implements Parcelable.Creator<GoogleSignInAccount> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GoogleSignInAccount createFromParcel(Parcel parcel) {
        int r = com.google.android.gms.common.internal.x.b.r(parcel);
        String str = null;
        long j2 = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        int i2 = 0;
        while (parcel.dataPosition() < r) {
            int l = com.google.android.gms.common.internal.x.b.l(parcel);
            switch (com.google.android.gms.common.internal.x.b.i(l)) {
                case 1:
                    i2 = com.google.android.gms.common.internal.x.b.n(parcel, l);
                    break;
                case 2:
                    str = com.google.android.gms.common.internal.x.b.d(parcel, l);
                    break;
                case 3:
                    str2 = com.google.android.gms.common.internal.x.b.d(parcel, l);
                    break;
                case 4:
                    str3 = com.google.android.gms.common.internal.x.b.d(parcel, l);
                    break;
                case 5:
                    str4 = com.google.android.gms.common.internal.x.b.d(parcel, l);
                    break;
                case 6:
                    uri = (Uri) com.google.android.gms.common.internal.x.b.c(parcel, l, Uri.CREATOR);
                    break;
                case 7:
                    str5 = com.google.android.gms.common.internal.x.b.d(parcel, l);
                    break;
                case 8:
                    j2 = com.google.android.gms.common.internal.x.b.o(parcel, l);
                    break;
                case 9:
                    str6 = com.google.android.gms.common.internal.x.b.d(parcel, l);
                    break;
                case 10:
                    arrayList = com.google.android.gms.common.internal.x.b.g(parcel, l, Scope.CREATOR);
                    break;
                case 11:
                    str7 = com.google.android.gms.common.internal.x.b.d(parcel, l);
                    break;
                case 12:
                    str8 = com.google.android.gms.common.internal.x.b.d(parcel, l);
                    break;
                default:
                    com.google.android.gms.common.internal.x.b.q(parcel, l);
                    break;
            }
        }
        com.google.android.gms.common.internal.x.b.h(parcel, r);
        return new GoogleSignInAccount(i2, str, str2, str3, str4, uri, str5, j2, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount[] newArray(int i2) {
        return new GoogleSignInAccount[i2];
    }
}

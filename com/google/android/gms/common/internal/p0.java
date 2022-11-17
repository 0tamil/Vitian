package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.x.b;
/* loaded from: classes.dex */
public final class p0 implements Parcelable.Creator<o0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ o0 createFromParcel(Parcel parcel) {
        int r = b.r(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < r) {
            int l = b.l(parcel);
            int i4 = b.i(l);
            if (i4 == 1) {
                i2 = b.n(parcel, l);
            } else if (i4 == 2) {
                account = (Account) b.c(parcel, l, Account.CREATOR);
            } else if (i4 == 3) {
                i3 = b.n(parcel, l);
            } else if (i4 != 4) {
                b.q(parcel, l);
            } else {
                googleSignInAccount = (GoogleSignInAccount) b.c(parcel, l, GoogleSignInAccount.CREATOR);
            }
        }
        b.h(parcel, r);
        return new o0(i2, account, i3, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ o0[] newArray(int i2) {
        return new o0[i2];
    }
}

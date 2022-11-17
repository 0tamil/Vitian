package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.x.a;
import com.google.android.gms.common.internal.x.c;
/* loaded from: classes.dex */
public final class o0 extends a {
    public static final Parcelable.Creator<o0> CREATOR = new p0();

    /* renamed from: e  reason: collision with root package name */
    final int f1280e;

    /* renamed from: f  reason: collision with root package name */
    private final Account f1281f;

    /* renamed from: g  reason: collision with root package name */
    private final int f1282g;

    /* renamed from: h  reason: collision with root package name */
    private final GoogleSignInAccount f1283h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o0(int i2, Account account, int i3, GoogleSignInAccount googleSignInAccount) {
        this.f1280e = i2;
        this.f1281f = account;
        this.f1282g = i3;
        this.f1283h = googleSignInAccount;
    }

    public o0(Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i2, googleSignInAccount);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.g(parcel, 1, this.f1280e);
        c.j(parcel, 2, this.f1281f, i2, false);
        c.g(parcel, 3, this.f1282g);
        c.j(parcel, 4, this.f1283h, i2, false);
        c.b(parcel, a);
    }
}

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import f.b.a.b.d.c.a;
import f.b.a.b.d.c.c;
/* loaded from: classes.dex */
public final class q1 extends a implements j {
    /* JADX INFO: Access modifiers changed from: package-private */
    public q1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // com.google.android.gms.common.internal.j
    public final Account r() {
        Parcel a = a(2, b());
        Account account = (Account) c.a(a, Account.CREATOR);
        a.recycle();
        return account;
    }
}

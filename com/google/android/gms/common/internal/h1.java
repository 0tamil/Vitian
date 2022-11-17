package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.x.b;
import com.google.android.gms.common.internal.x.c;
/* loaded from: classes.dex */
public final class h1 implements Parcelable.Creator<g> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(g gVar, Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.g(parcel, 1, gVar.f1243e);
        c.g(parcel, 2, gVar.f1244f);
        c.g(parcel, 3, gVar.f1245g);
        c.k(parcel, 4, gVar.f1246h, false);
        c.f(parcel, 5, gVar.f1247i, false);
        c.m(parcel, 6, gVar.f1248j, i2, false);
        c.d(parcel, 7, gVar.f1249k, false);
        c.j(parcel, 8, gVar.l, i2, false);
        c.m(parcel, 10, gVar.m, i2, false);
        c.m(parcel, 11, gVar.n, i2, false);
        c.c(parcel, 12, gVar.o);
        c.g(parcel, 13, gVar.p);
        c.c(parcel, 14, gVar.q);
        c.k(parcel, 15, gVar.b(), false);
        c.b(parcel, a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ g createFromParcel(Parcel parcel) {
        int r = b.r(parcel);
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        com.google.android.gms.common.c[] cVarArr = null;
        com.google.android.gms.common.c[] cVarArr2 = null;
        String str2 = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        int i5 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < r) {
            int l = b.l(parcel);
            switch (b.i(l)) {
                case 1:
                    i2 = b.n(parcel, l);
                    break;
                case 2:
                    i3 = b.n(parcel, l);
                    break;
                case 3:
                    i4 = b.n(parcel, l);
                    break;
                case 4:
                    str = b.d(parcel, l);
                    break;
                case 5:
                    iBinder = b.m(parcel, l);
                    break;
                case 6:
                    scopeArr = (Scope[]) b.f(parcel, l, Scope.CREATOR);
                    break;
                case 7:
                    bundle = b.a(parcel, l);
                    break;
                case 8:
                    account = (Account) b.c(parcel, l, Account.CREATOR);
                    break;
                case 9:
                default:
                    b.q(parcel, l);
                    break;
                case 10:
                    cVarArr = (com.google.android.gms.common.c[]) b.f(parcel, l, com.google.android.gms.common.c.CREATOR);
                    break;
                case 11:
                    cVarArr2 = (com.google.android.gms.common.c[]) b.f(parcel, l, com.google.android.gms.common.c.CREATOR);
                    break;
                case 12:
                    z = b.j(parcel, l);
                    break;
                case 13:
                    i5 = b.n(parcel, l);
                    break;
                case 14:
                    z2 = b.j(parcel, l);
                    break;
                case 15:
                    str2 = b.d(parcel, l);
                    break;
            }
        }
        b.h(parcel, r);
        return new g(i2, i3, i4, str, iBinder, scopeArr, bundle, account, cVarArr, cVarArr2, z, i5, z2, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ g[] newArray(int i2) {
        return new g[i2];
    }
}

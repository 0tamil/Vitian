package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.c;
import com.google.android.gms.common.e;
import com.google.android.gms.common.internal.j;
import com.google.android.gms.common.internal.x.a;
/* loaded from: classes.dex */
public class g extends a {
    public static final Parcelable.Creator<g> CREATOR = new h1();

    /* renamed from: e  reason: collision with root package name */
    final int f1243e;

    /* renamed from: f  reason: collision with root package name */
    final int f1244f;

    /* renamed from: g  reason: collision with root package name */
    int f1245g;

    /* renamed from: h  reason: collision with root package name */
    String f1246h;

    /* renamed from: i  reason: collision with root package name */
    IBinder f1247i;

    /* renamed from: j  reason: collision with root package name */
    Scope[] f1248j;

    /* renamed from: k  reason: collision with root package name */
    Bundle f1249k;
    Account l;
    c[] m;
    c[] n;
    boolean o;
    int p;
    boolean q;
    private String r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(int i2, int i3, int i4, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, c[] cVarArr, c[] cVarArr2, boolean z, int i5, boolean z2, String str2) {
        this.f1243e = i2;
        this.f1244f = i3;
        this.f1245g = i4;
        if ("com.google.android.gms".equals(str)) {
            this.f1246h = "com.google.android.gms";
        } else {
            this.f1246h = str;
        }
        if (i2 < 2) {
            this.l = iBinder != null ? a.d(j.a.b(iBinder)) : null;
        } else {
            this.f1247i = iBinder;
            this.l = account;
        }
        this.f1248j = scopeArr;
        this.f1249k = bundle;
        this.m = cVarArr;
        this.n = cVarArr2;
        this.o = z;
        this.p = i5;
        this.q = z2;
        this.r = str2;
    }

    public g(int i2, String str) {
        this.f1243e = 6;
        this.f1245g = e.a;
        this.f1244f = i2;
        this.o = true;
        this.r = str;
    }

    public final String b() {
        return this.r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        h1.a(this, parcel, i2);
    }
}

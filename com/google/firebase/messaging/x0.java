package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.x.b;
import com.google.android.gms.common.internal.x.c;
/* loaded from: classes.dex */
public class x0 implements Parcelable.Creator<w0> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(w0 w0Var, Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.d(parcel, 2, w0Var.f1832e, false);
        c.b(parcel, a);
    }

    /* renamed from: a */
    public w0 createFromParcel(Parcel parcel) {
        int r = b.r(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < r) {
            int l = b.l(parcel);
            if (b.i(l) != 2) {
                b.q(parcel, l);
            } else {
                bundle = b.a(parcel, l);
            }
        }
        b.h(parcel, r);
        return new w0(bundle);
    }

    /* renamed from: b */
    public w0[] newArray(int i2) {
        return new w0[i2];
    }
}

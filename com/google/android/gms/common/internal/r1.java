package com.google.android.gms.common.internal;

import android.os.Parcel;
import f.b.a.b.c.a;
import f.b.a.b.d.c.b;
import f.b.a.b.d.c.c;
/* loaded from: classes.dex */
public abstract class r1 extends b implements s1 {
    public r1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    @Override // f.b.a.b.d.c.b
    protected final boolean a(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            a w = w();
            parcel2.writeNoException();
            c.b(parcel2, w);
        } else if (i2 != 2) {
            return false;
        } else {
            int c = c();
            parcel2.writeNoException();
            parcel2.writeInt(c);
        }
        return true;
    }
}

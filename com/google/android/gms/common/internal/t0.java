package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import f.b.a.b.d.c.b;
import f.b.a.b.d.c.c;
/* loaded from: classes.dex */
public abstract class t0 extends b implements l {
    public t0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // f.b.a.b.d.c.b
    protected final boolean a(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            P(parcel.readInt(), parcel.readStrongBinder(), (Bundle) c.a(parcel, Bundle.CREATOR));
        } else if (i2 == 2) {
            j(parcel.readInt(), (Bundle) c.a(parcel, Bundle.CREATOR));
        } else if (i2 != 3) {
            return false;
        } else {
            l(parcel.readInt(), parcel.readStrongBinder(), (e1) c.a(parcel, e1.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}

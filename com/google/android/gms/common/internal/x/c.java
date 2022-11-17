package com.google.android.gms.common.internal.x;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
/* loaded from: classes.dex */
public class c {
    public static int a(Parcel parcel) {
        return o(parcel, 20293);
    }

    public static void b(Parcel parcel, int i2) {
        p(parcel, i2);
    }

    public static void c(Parcel parcel, int i2, boolean z) {
        q(parcel, i2, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void d(Parcel parcel, int i2, Bundle bundle, boolean z) {
        if (bundle != null) {
            int o = o(parcel, i2);
            parcel.writeBundle(bundle);
            p(parcel, o);
        } else if (z) {
            q(parcel, i2, 0);
        }
    }

    public static void e(Parcel parcel, int i2, float f2) {
        q(parcel, i2, 4);
        parcel.writeFloat(f2);
    }

    public static void f(Parcel parcel, int i2, IBinder iBinder, boolean z) {
        if (iBinder != null) {
            int o = o(parcel, i2);
            parcel.writeStrongBinder(iBinder);
            p(parcel, o);
        } else if (z) {
            q(parcel, i2, 0);
        }
    }

    public static void g(Parcel parcel, int i2, int i3) {
        q(parcel, i2, 4);
        parcel.writeInt(i3);
    }

    public static void h(Parcel parcel, int i2, int[] iArr, boolean z) {
        if (iArr != null) {
            int o = o(parcel, i2);
            parcel.writeIntArray(iArr);
            p(parcel, o);
        } else if (z) {
            q(parcel, i2, 0);
        }
    }

    public static void i(Parcel parcel, int i2, long j2) {
        q(parcel, i2, 8);
        parcel.writeLong(j2);
    }

    public static void j(Parcel parcel, int i2, Parcelable parcelable, int i3, boolean z) {
        if (parcelable != null) {
            int o = o(parcel, i2);
            parcelable.writeToParcel(parcel, i3);
            p(parcel, o);
        } else if (z) {
            q(parcel, i2, 0);
        }
    }

    public static void k(Parcel parcel, int i2, String str, boolean z) {
        if (str != null) {
            int o = o(parcel, i2);
            parcel.writeString(str);
            p(parcel, o);
        } else if (z) {
            q(parcel, i2, 0);
        }
    }

    public static void l(Parcel parcel, int i2, List<String> list, boolean z) {
        if (list != null) {
            int o = o(parcel, i2);
            parcel.writeStringList(list);
            p(parcel, o);
        } else if (z) {
            q(parcel, i2, 0);
        }
    }

    public static <T extends Parcelable> void m(Parcel parcel, int i2, T[] tArr, int i3, boolean z) {
        if (tArr != null) {
            int o = o(parcel, i2);
            parcel.writeInt(tArr.length);
            for (T t : tArr) {
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    r(parcel, t, i3);
                }
            }
            p(parcel, o);
        } else if (z) {
            q(parcel, i2, 0);
        }
    }

    public static <T extends Parcelable> void n(Parcel parcel, int i2, List<T> list, boolean z) {
        if (list != null) {
            int o = o(parcel, i2);
            int size = list.size();
            parcel.writeInt(size);
            for (int i3 = 0; i3 < size; i3++) {
                T t = list.get(i3);
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    r(parcel, t, 0);
                }
            }
            p(parcel, o);
        } else if (z) {
            q(parcel, i2, 0);
        }
    }

    private static int o(Parcel parcel, int i2) {
        parcel.writeInt(i2 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void p(Parcel parcel, int i2) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i2 - 4);
        parcel.writeInt(dataPosition - i2);
        parcel.setDataPosition(dataPosition);
    }

    private static void q(Parcel parcel, int i2, int i3) {
        parcel.writeInt(i2 | (i3 << 16));
    }

    private static <T extends Parcelable> void r(Parcel parcel, T t, int i2) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i2);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}

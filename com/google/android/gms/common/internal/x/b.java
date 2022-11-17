package com.google.android.gms.common.internal.x;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class b {

    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(String str, Parcel parcel) {
            super(r2.toString());
            int dataPosition = parcel.dataPosition();
            int dataSize = parcel.dataSize();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 41);
            sb.append(str);
            sb.append(" Parcel: pos=");
            sb.append(dataPosition);
            sb.append(" size=");
            sb.append(dataSize);
        }
    }

    public static Bundle a(Parcel parcel, int i2) {
        int p = p(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (p == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + p);
        return readBundle;
    }

    public static int[] b(Parcel parcel, int i2) {
        int p = p(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (p == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + p);
        return createIntArray;
    }

    public static <T extends Parcelable> T c(Parcel parcel, int i2, Parcelable.Creator<T> creator) {
        int p = p(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (p == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + p);
        return createFromParcel;
    }

    public static String d(Parcel parcel, int i2) {
        int p = p(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (p == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + p);
        return readString;
    }

    public static ArrayList<String> e(Parcel parcel, int i2) {
        int p = p(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (p == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + p);
        return createStringArrayList;
    }

    public static <T> T[] f(Parcel parcel, int i2, Parcelable.Creator<T> creator) {
        int p = p(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (p == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + p);
        return tArr;
    }

    public static <T> ArrayList<T> g(Parcel parcel, int i2, Parcelable.Creator<T> creator) {
        int p = p(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (p == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + p);
        return createTypedArrayList;
    }

    public static void h(Parcel parcel, int i2) {
        if (parcel.dataPosition() != i2) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Overread allowed size end=");
            sb.append(i2);
            throw new a(sb.toString(), parcel);
        }
    }

    public static int i(int i2) {
        return (char) i2;
    }

    public static boolean j(Parcel parcel, int i2) {
        s(parcel, i2, 4);
        return parcel.readInt() != 0;
    }

    public static float k(Parcel parcel, int i2) {
        s(parcel, i2, 4);
        return parcel.readFloat();
    }

    public static int l(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder m(Parcel parcel, int i2) {
        int p = p(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (p == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + p);
        return readStrongBinder;
    }

    public static int n(Parcel parcel, int i2) {
        s(parcel, i2, 4);
        return parcel.readInt();
    }

    public static long o(Parcel parcel, int i2) {
        s(parcel, i2, 8);
        return parcel.readLong();
    }

    public static int p(Parcel parcel, int i2) {
        return (i2 & (-65536)) != -65536 ? (char) (i2 >> 16) : parcel.readInt();
    }

    public static void q(Parcel parcel, int i2) {
        parcel.setDataPosition(parcel.dataPosition() + p(parcel, i2));
    }

    public static int r(Parcel parcel) {
        int l = l(parcel);
        int p = p(parcel, l);
        int dataPosition = parcel.dataPosition();
        if (i(l) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(l));
            throw new a(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i2 = p + dataPosition;
        if (i2 >= dataPosition && i2 <= parcel.dataSize()) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i2);
        throw new a(sb.toString(), parcel);
    }

    private static void s(Parcel parcel, int i2, int i3) {
        int p = p(parcel, i2);
        if (p != i3) {
            String hexString = Integer.toHexString(p);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i3);
            sb.append(" got ");
            sb.append(p);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new a(sb.toString(), parcel);
        }
    }
}

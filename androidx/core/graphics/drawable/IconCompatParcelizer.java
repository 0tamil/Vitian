package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.b;
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(b bVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = bVar.p(iconCompat.a, 1);
        iconCompat.c = bVar.j(iconCompat.c, 2);
        iconCompat.f629d = bVar.r(iconCompat.f629d, 3);
        iconCompat.f630e = bVar.p(iconCompat.f630e, 4);
        iconCompat.f631f = bVar.p(iconCompat.f631f, 5);
        iconCompat.f632g = (ColorStateList) bVar.r(iconCompat.f632g, 6);
        iconCompat.f634i = bVar.t(iconCompat.f634i, 7);
        iconCompat.f635j = bVar.t(iconCompat.f635j, 8);
        iconCompat.z();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, b bVar) {
        bVar.x(true, true);
        iconCompat.A(bVar.f());
        int i2 = iconCompat.a;
        if (-1 != i2) {
            bVar.F(i2, 1);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            bVar.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f629d;
        if (parcelable != null) {
            bVar.H(parcelable, 3);
        }
        int i3 = iconCompat.f630e;
        if (i3 != 0) {
            bVar.F(i3, 4);
        }
        int i4 = iconCompat.f631f;
        if (i4 != 0) {
            bVar.F(i4, 5);
        }
        ColorStateList colorStateList = iconCompat.f632g;
        if (colorStateList != null) {
            bVar.H(colorStateList, 6);
        }
        String str = iconCompat.f634i;
        if (str != null) {
            bVar.J(str, 7);
        }
        String str2 = iconCompat.f635j;
        if (str2 != null) {
            bVar.J(str2, 8);
        }
    }
}

package e.d.p;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import e.d.o.d;
/* loaded from: classes.dex */
public final class c {
    final ClipData a;
    final int b;
    final int c;

    /* renamed from: d  reason: collision with root package name */
    final Uri f2109d;

    /* renamed from: e  reason: collision with root package name */
    final Bundle f2110e;

    /* loaded from: classes.dex */
    public static final class a {
        ClipData a;
        int b;
        int c;

        /* renamed from: d  reason: collision with root package name */
        Uri f2111d;

        /* renamed from: e  reason: collision with root package name */
        Bundle f2112e;

        public a(ClipData clipData, int i2) {
            this.a = clipData;
            this.b = i2;
        }

        public c a() {
            return new c(this);
        }

        public a b(Bundle bundle) {
            this.f2112e = bundle;
            return this;
        }

        public a c(int i2) {
            this.c = i2;
            return this;
        }

        public a d(Uri uri) {
            this.f2111d = uri;
            return this;
        }
    }

    c(a aVar) {
        ClipData clipData = aVar.a;
        d.d(clipData);
        this.a = clipData;
        int i2 = aVar.b;
        d.a(i2, 0, 3, "source");
        this.b = i2;
        int i3 = aVar.c;
        d.c(i3, 1);
        this.c = i3;
        this.f2109d = aVar.f2111d;
        this.f2110e = aVar.f2112e;
    }

    static String a(int i2) {
        return (i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2);
    }

    static String e(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? String.valueOf(i2) : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    public ClipData b() {
        return this.a;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.b;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("ContentInfoCompat{clip=");
        sb.append(this.a.getDescription());
        sb.append(", source=");
        sb.append(e(this.b));
        sb.append(", flags=");
        sb.append(a(this.c));
        String str2 = "";
        if (this.f2109d == null) {
            str = str2;
        } else {
            str = ", hasLinkUri(" + this.f2109d.toString().length() + ")";
        }
        sb.append(str);
        if (this.f2110e != null) {
            str2 = ", hasExtras";
        }
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}

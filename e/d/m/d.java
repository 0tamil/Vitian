package e.d.m;

import android.util.Base64;
import java.util.List;
/* loaded from: classes.dex */
public final class d {
    private final String a;
    private final String b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final List<List<byte[]>> f2082d;

    /* renamed from: e  reason: collision with root package name */
    private final int f2083e = 0;

    /* renamed from: f  reason: collision with root package name */
    private final String f2084f;

    public d(String str, String str2, String str3, List<List<byte[]>> list) {
        e.d.o.d.d(str);
        this.a = str;
        e.d.o.d.d(str2);
        this.b = str2;
        e.d.o.d.d(str3);
        this.c = str3;
        e.d.o.d.d(list);
        this.f2082d = list;
        this.f2084f = a(str, str2, str3);
    }

    private String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List<List<byte[]>> b() {
        return this.f2082d;
    }

    public int c() {
        return this.f2083e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        return this.f2084f;
    }

    public String e() {
        return this.a;
    }

    public String f() {
        return this.b;
    }

    public String g() {
        return this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.a + ", mProviderPackage: " + this.b + ", mQuery: " + this.c + ", mCertificates:");
        for (int i2 = 0; i2 < this.f2082d.size(); i2++) {
            sb.append(" [");
            List<byte[]> list = this.f2082d.get(i2);
            for (int i3 = 0; i3 < list.size(); i3++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i3), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f2083e);
        return sb.toString();
    }
}

package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.x.a;
import com.google.android.gms.common.internal.x.c;
import com.google.android.gms.common.util.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new b();

    /* renamed from: e  reason: collision with root package name */
    final int f1030e;

    /* renamed from: f  reason: collision with root package name */
    private String f1031f;

    /* renamed from: g  reason: collision with root package name */
    private String f1032g;

    /* renamed from: h  reason: collision with root package name */
    private String f1033h;

    /* renamed from: i  reason: collision with root package name */
    private String f1034i;

    /* renamed from: j  reason: collision with root package name */
    private Uri f1035j;

    /* renamed from: k  reason: collision with root package name */
    private String f1036k;
    private long l;
    private String m;
    List<Scope> n;
    private String o;
    private String p;
    private Set<Scope> q = new HashSet();

    static {
        f.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleSignInAccount(int i2, String str, String str2, String str3, String str4, Uri uri, String str5, long j2, String str6, List<Scope> list, String str7, String str8) {
        this.f1030e = i2;
        this.f1031f = str;
        this.f1032g = str2;
        this.f1033h = str3;
        this.f1034i = str4;
        this.f1035j = uri;
        this.f1036k = str5;
        this.l = j2;
        this.m = str6;
        this.n = list;
        this.o = str7;
        this.p = str8;
    }

    public static GoogleSignInAccount l(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, String str7, Set<Scope> set) {
        long longValue = l.longValue();
        p.e(str7);
        p.i(set);
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, longValue, str7, new ArrayList(set), str5, str6);
    }

    public static GoogleSignInAccount m(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            hashSet.add(new Scope(jSONArray.getString(i2)));
        }
        GoogleSignInAccount l = l(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        if (jSONObject.has("serverAuthCode")) {
            str2 = jSONObject.optString("serverAuthCode");
        }
        l.f1036k = str2;
        return l;
    }

    public Account b() {
        String str = this.f1033h;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public String c() {
        return this.f1034i;
    }

    public String d() {
        return this.f1033h;
    }

    public String e() {
        return this.p;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.m.equals(this.m) && googleSignInAccount.j().equals(j());
    }

    public String f() {
        return this.o;
    }

    public String g() {
        return this.f1031f;
    }

    public String h() {
        return this.f1032g;
    }

    public int hashCode() {
        return ((this.m.hashCode() + 527) * 31) + j().hashCode();
    }

    public Uri i() {
        return this.f1035j;
    }

    public Set<Scope> j() {
        HashSet hashSet = new HashSet(this.n);
        hashSet.addAll(this.q);
        return hashSet;
    }

    public String k() {
        return this.f1036k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.g(parcel, 1, this.f1030e);
        c.k(parcel, 2, g(), false);
        c.k(parcel, 3, h(), false);
        c.k(parcel, 4, d(), false);
        c.k(parcel, 5, c(), false);
        c.j(parcel, 6, i(), i2, false);
        c.k(parcel, 7, k(), false);
        c.i(parcel, 8, this.l);
        c.k(parcel, 9, this.m, false);
        c.n(parcel, 10, this.n, false);
        c.k(parcel, 11, f(), false);
        c.k(parcel, 12, e(), false);
        c.b(parcel, a);
    }
}

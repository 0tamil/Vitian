package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.util.l;
/* loaded from: classes.dex */
public final class k {
    private final String a;
    private final String b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final String f1706d;

    /* renamed from: e  reason: collision with root package name */
    private final String f1707e;

    /* renamed from: f  reason: collision with root package name */
    private final String f1708f;

    /* renamed from: g  reason: collision with root package name */
    private final String f1709g;

    /* loaded from: classes.dex */
    public static final class b {
        private String a;
        private String b;
        private String c;

        /* renamed from: d  reason: collision with root package name */
        private String f1710d;

        /* renamed from: e  reason: collision with root package name */
        private String f1711e;

        /* renamed from: f  reason: collision with root package name */
        private String f1712f;

        /* renamed from: g  reason: collision with root package name */
        private String f1713g;

        public k a() {
            return new k(this.b, this.a, this.c, this.f1710d, this.f1711e, this.f1712f, this.f1713g);
        }

        public b b(String str) {
            p.f(str, "ApiKey must be set.");
            this.a = str;
            return this;
        }

        public b c(String str) {
            p.f(str, "ApplicationId must be set.");
            this.b = str;
            return this;
        }

        public b d(String str) {
            this.c = str;
            return this;
        }

        public b e(String str) {
            this.f1710d = str;
            return this;
        }

        public b f(String str) {
            this.f1711e = str;
            return this;
        }

        public b g(String str) {
            this.f1713g = str;
            return this;
        }

        public b h(String str) {
            this.f1712f = str;
            return this;
        }
    }

    private k(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        p.l(!l.a(str), "ApplicationId must be set.");
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.f1706d = str4;
        this.f1707e = str5;
        this.f1708f = str6;
        this.f1709g = str7;
    }

    public static k a(Context context) {
        s sVar = new s(context);
        String a2 = sVar.a("google_app_id");
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        return new k(a2, sVar.a("google_api_key"), sVar.a("firebase_database_url"), sVar.a("ga_trackingId"), sVar.a("gcm_defaultSenderId"), sVar.a("google_storage_bucket"), sVar.a("project_id"));
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public String e() {
        return this.f1706d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return o.a(this.b, kVar.b) && o.a(this.a, kVar.a) && o.a(this.c, kVar.c) && o.a(this.f1706d, kVar.f1706d) && o.a(this.f1707e, kVar.f1707e) && o.a(this.f1708f, kVar.f1708f) && o.a(this.f1709g, kVar.f1709g);
    }

    public String f() {
        return this.f1707e;
    }

    public String g() {
        return this.f1709g;
    }

    public String h() {
        return this.f1708f;
    }

    public int hashCode() {
        return o.b(this.b, this.a, this.c, this.f1706d, this.f1707e, this.f1708f, this.f1709g);
    }

    public String toString() {
        o.a c = o.c(this);
        c.a("applicationId", this.b);
        c.a("apiKey", this.a);
        c.a("databaseUrl", this.c);
        c.a("gcmSenderId", this.f1707e);
        c.a("storageBucket", this.f1708f);
        c.a("projectId", this.f1709g);
        return c.toString();
    }
}

package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.i0;
import java.util.Map;
/* loaded from: classes.dex */
public final class w0 extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<w0> CREATOR = new x0();

    /* renamed from: e  reason: collision with root package name */
    Bundle f1832e;

    /* renamed from: f  reason: collision with root package name */
    private Map<String, String> f1833f;

    /* renamed from: g  reason: collision with root package name */
    private c f1834g;

    /* loaded from: classes.dex */
    public static class b {
        private final Bundle a;
        private final Map<String, String> b = new e.c.a();

        public b(String str) {
            Bundle bundle = new Bundle();
            this.a = bundle;
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("google.to", str);
                return;
            }
            throw new IllegalArgumentException("Invalid to: " + str);
        }

        public w0 a() {
            Bundle bundle = new Bundle();
            for (Map.Entry<String, String> entry : this.b.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            bundle.putAll(this.a);
            this.a.remove("from");
            return new w0(bundle);
        }

        public b b(String str) {
            this.a.putString("collapse_key", str);
            return this;
        }

        public b c(Map<String, String> map) {
            this.b.clear();
            this.b.putAll(map);
            return this;
        }

        public b d(String str) {
            this.a.putString("google.message_id", str);
            return this;
        }

        public b e(String str) {
            this.a.putString("message_type", str);
            return this;
        }

        public b f(int i2) {
            this.a.putString("google.ttl", String.valueOf(i2));
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        private final String a;
        private final String b;
        private final String[] c;

        /* renamed from: d  reason: collision with root package name */
        private final String f1835d;

        /* renamed from: e  reason: collision with root package name */
        private final String f1836e;

        /* renamed from: f  reason: collision with root package name */
        private final String[] f1837f;

        /* renamed from: g  reason: collision with root package name */
        private final String f1838g;

        /* renamed from: h  reason: collision with root package name */
        private final String f1839h;

        /* renamed from: i  reason: collision with root package name */
        private final String f1840i;

        /* renamed from: j  reason: collision with root package name */
        private final String f1841j;

        /* renamed from: k  reason: collision with root package name */
        private final String f1842k;
        private final String l;
        private final String m;
        private final Uri n;
        private final String o;
        private final Integer p;
        private final Integer q;
        private final Integer r;

        private c(s0 s0Var) {
            this.a = s0Var.p("gcm.n.title");
            this.b = s0Var.h("gcm.n.title");
            this.c = j(s0Var, "gcm.n.title");
            this.f1835d = s0Var.p("gcm.n.body");
            this.f1836e = s0Var.h("gcm.n.body");
            this.f1837f = j(s0Var, "gcm.n.body");
            this.f1838g = s0Var.p("gcm.n.icon");
            this.f1840i = s0Var.o();
            this.f1841j = s0Var.p("gcm.n.tag");
            this.f1842k = s0Var.p("gcm.n.color");
            this.l = s0Var.p("gcm.n.click_action");
            this.m = s0Var.p("gcm.n.android_channel_id");
            this.n = s0Var.f();
            this.f1839h = s0Var.p("gcm.n.image");
            this.o = s0Var.p("gcm.n.ticker");
            this.p = s0Var.b("gcm.n.notification_priority");
            this.q = s0Var.b("gcm.n.visibility");
            this.r = s0Var.b("gcm.n.notification_count");
            s0Var.a("gcm.n.sticky");
            s0Var.a("gcm.n.local_only");
            s0Var.a("gcm.n.default_sound");
            s0Var.a("gcm.n.default_vibrate_timings");
            s0Var.a("gcm.n.default_light_settings");
            s0Var.j("gcm.n.event_time");
            s0Var.e();
            s0Var.q();
        }

        private static String[] j(s0 s0Var, String str) {
            Object[] g2 = s0Var.g(str);
            if (g2 == null) {
                return null;
            }
            String[] strArr = new String[g2.length];
            for (int i2 = 0; i2 < g2.length; i2++) {
                strArr[i2] = String.valueOf(g2[i2]);
            }
            return strArr;
        }

        public String a() {
            return this.f1835d;
        }

        public String[] b() {
            return this.f1837f;
        }

        public String c() {
            return this.f1836e;
        }

        public String d() {
            return this.m;
        }

        public String e() {
            return this.l;
        }

        public String f() {
            return this.f1842k;
        }

        public String g() {
            return this.f1838g;
        }

        public Uri h() {
            String str = this.f1839h;
            if (str != null) {
                return Uri.parse(str);
            }
            return null;
        }

        public Uri i() {
            return this.n;
        }

        public Integer k() {
            return this.r;
        }

        public Integer l() {
            return this.p;
        }

        public String m() {
            return this.f1840i;
        }

        public String n() {
            return this.f1841j;
        }

        public String o() {
            return this.o;
        }

        public String p() {
            return this.a;
        }

        public String[] q() {
            return this.c;
        }

        public String r() {
            return this.b;
        }

        public Integer s() {
            return this.q;
        }
    }

    public w0(Bundle bundle) {
        this.f1832e = bundle;
    }

    private int f(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    public String b() {
        return this.f1832e.getString("collapse_key");
    }

    public Map<String, String> c() {
        if (this.f1833f == null) {
            this.f1833f = i0.a.a(this.f1832e);
        }
        return this.f1833f;
    }

    public String d() {
        return this.f1832e.getString("from");
    }

    public String e() {
        String string = this.f1832e.getString("google.message_id");
        return string == null ? this.f1832e.getString("message_id") : string;
    }

    public String g() {
        return this.f1832e.getString("message_type");
    }

    public c h() {
        if (this.f1834g == null && s0.t(this.f1832e)) {
            this.f1834g = new c(new s0(this.f1832e));
        }
        return this.f1834g;
    }

    public int i() {
        String string = this.f1832e.getString("google.original_priority");
        if (string == null) {
            string = this.f1832e.getString("google.priority");
        }
        return f(string);
    }

    public long j() {
        Object obj = this.f1832e.get("google.sent_time");
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (!(obj instanceof String)) {
            return 0L;
        }
        try {
            return Long.parseLong((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid sent time: " + obj);
            return 0L;
        }
    }

    public String k() {
        return this.f1832e.getString("google.to");
    }

    public int l() {
        Object obj = this.f1832e.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(Intent intent) {
        intent.putExtras(this.f1832e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        x0.c(this, parcel, i2);
    }
}

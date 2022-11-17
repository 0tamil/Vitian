package com.google.firebase.crashlytics.i.j;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.firebase.crashlytics.i.f;
import com.google.firebase.installations.h;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public class a0 implements b0 {

    /* renamed from: g  reason: collision with root package name */
    private static final Pattern f1374g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h  reason: collision with root package name */
    private static final String f1375h = Pattern.quote("/");
    private final c0 a;
    private final Context b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final h f1376d;

    /* renamed from: e  reason: collision with root package name */
    private final w f1377e;

    /* renamed from: f  reason: collision with root package name */
    private String f1378f;

    public a0(Context context, String str, h hVar, w wVar) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        } else if (str != null) {
            this.b = context;
            this.c = str;
            this.f1376d = hVar;
            this.f1377e = wVar;
            this.a = new c0();
        } else {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
    }

    private synchronized String b(String str, SharedPreferences sharedPreferences) {
        String e2;
        e2 = e(UUID.randomUUID().toString());
        f f2 = f.f();
        f2.i("Created new Crashlytics installation ID: " + e2 + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", e2).putString("firebase.installation.id", str).apply();
        return e2;
    }

    static String c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    private String d() {
        try {
            return (String) i0.a(this.f1376d.a());
        } catch (Exception e2) {
            f.f().l("Failed to retrieve Firebase Installations ID.", e2);
            return null;
        }
    }

    private static String e(String str) {
        if (str == null) {
            return null;
        }
        return f1374g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    static boolean k(String str) {
        return str != null && str.startsWith("SYN_");
    }

    private String l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    private String m(String str) {
        return str.replaceAll(f1375h, "");
    }

    @Override // com.google.firebase.crashlytics.i.j.b0
    public synchronized String a() {
        String l;
        String str = this.f1378f;
        if (str != null) {
            return str;
        }
        f.f().i("Determining Crashlytics installation ID...");
        SharedPreferences r = n.r(this.b);
        String string = r.getString("firebase.installation.id", null);
        f f2 = f.f();
        f2.i("Cached Firebase Installation ID: " + string);
        if (this.f1377e.d()) {
            String d2 = d();
            f f3 = f.f();
            f3.i("Fetched Firebase Installation ID: " + d2);
            if (d2 == null) {
                d2 = string == null ? c() : string;
            }
            l = d2.equals(string) ? l(r) : b(d2, r);
        } else {
            l = k(string) ? l(r) : b(c(), r);
        }
        this.f1378f = l;
        if (this.f1378f == null) {
            f.f().k("Unable to determine Crashlytics Install Id, creating a new one.");
            this.f1378f = b(c(), r);
        }
        f f4 = f.f();
        f4.i("Crashlytics installation ID: " + this.f1378f);
        return this.f1378f;
    }

    public String f() {
        return this.c;
    }

    public String g() {
        return this.a.a(this.b);
    }

    public String h() {
        return String.format(Locale.US, "%s/%s", m(Build.MANUFACTURER), m(Build.MODEL));
    }

    public String i() {
        return m(Build.VERSION.INCREMENTAL);
    }

    public String j() {
        return m(Build.VERSION.RELEASE);
    }
}

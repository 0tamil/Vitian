package com.google.firebase.r;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import com.google.firebase.g;
import com.google.firebase.o.c;
/* loaded from: classes.dex */
public class a {
    private final Context a;
    private final SharedPreferences b;
    private final c c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1878d = c();

    public a(Context context, String str, c cVar) {
        Context a = a(context);
        this.a = a;
        this.b = a.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.c = cVar;
    }

    private static Context a(Context context) {
        return Build.VERSION.SDK_INT < 24 ? context : androidx.core.content.a.b(context);
    }

    private boolean c() {
        return this.b.contains("firebase_data_collection_default_enabled") ? this.b.getBoolean("firebase_data_collection_default_enabled", true) : d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    private synchronized void f(boolean z) {
        if (this.f1878d != z) {
            this.f1878d = z;
            this.c.b(new com.google.firebase.o.a<>(g.class, new g(z)));
        }
    }

    public synchronized boolean b() {
        return this.f1878d;
    }

    public synchronized void e(Boolean bool) {
        boolean equals;
        if (bool == null) {
            this.b.edit().remove("firebase_data_collection_default_enabled").apply();
            equals = d();
        } else {
            equals = Boolean.TRUE.equals(bool);
            this.b.edit().putBoolean("firebase_data_collection_default_enabled", equals).apply();
        }
        f(equals);
    }
}

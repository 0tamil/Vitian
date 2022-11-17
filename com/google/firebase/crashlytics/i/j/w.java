package com.google.firebase.crashlytics.i.j;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.crashlytics.i.f;
import com.google.firebase.h;
import f.b.a.b.g.i;
import f.b.a.b.g.j;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class w {
    private final SharedPreferences a;
    private final h b;
    private final Object c;

    /* renamed from: e  reason: collision with root package name */
    boolean f1427e;

    /* renamed from: g  reason: collision with root package name */
    private Boolean f1429g;

    /* renamed from: d  reason: collision with root package name */
    j<Void> f1426d = new j<>();

    /* renamed from: f  reason: collision with root package name */
    private boolean f1428f = false;

    /* renamed from: h  reason: collision with root package name */
    private final j<Void> f1430h = new j<>();

    public w(h hVar) {
        Object obj = new Object();
        this.c = obj;
        this.f1427e = false;
        Context j2 = hVar.j();
        this.b = hVar;
        this.a = n.r(j2);
        Boolean b = b();
        this.f1429g = b == null ? a(j2) : b;
        synchronized (obj) {
            if (d()) {
                this.f1426d.e(null);
                this.f1427e = true;
            }
        }
    }

    private Boolean a(Context context) {
        Boolean f2 = f(context);
        if (f2 == null) {
            this.f1428f = false;
            return null;
        }
        this.f1428f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(f2));
    }

    private Boolean b() {
        if (!this.a.contains("firebase_crashlytics_collection_enabled")) {
            return null;
        }
        this.f1428f = false;
        return Boolean.valueOf(this.a.getBoolean("firebase_crashlytics_collection_enabled", true));
    }

    private void e(boolean z) {
        f.f().b(String.format("Crashlytics automatic data collection %s by %s.", z ? "ENABLED" : "DISABLED", this.f1429g == null ? "global Firebase setting" : this.f1428f ? "firebase_crashlytics_collection_enabled manifest flag" : "API"));
    }

    private static Boolean f(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e2) {
            f.f().e("Could not read data collection permission from manifest", e2);
            return null;
        }
    }

    @SuppressLint({"ApplySharedPref"})
    private static void h(SharedPreferences sharedPreferences, Boolean bool) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (bool != null) {
            edit.putBoolean("firebase_crashlytics_collection_enabled", bool.booleanValue());
        } else {
            edit.remove("firebase_crashlytics_collection_enabled");
        }
        edit.apply();
    }

    public void c(boolean z) {
        if (z) {
            this.f1430h.e(null);
            return;
        }
        throw new IllegalStateException("An invalid data collection token was used.");
    }

    public synchronized boolean d() {
        boolean booleanValue;
        Boolean bool = this.f1429g;
        booleanValue = bool != null ? bool.booleanValue() : this.b.u();
        e(booleanValue);
        return booleanValue;
    }

    public synchronized void g(Boolean bool) {
        if (bool != null) {
            try {
                this.f1428f = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f1429g = bool != null ? bool : a(this.b.j());
        h(this.a, bool);
        synchronized (this.c) {
            if (d()) {
                if (!this.f1427e) {
                    this.f1426d.e(null);
                    this.f1427e = true;
                }
            } else if (this.f1427e) {
                this.f1426d = new j<>();
                this.f1427e = false;
            }
        }
    }

    public i<Void> i() {
        i<Void> a;
        synchronized (this.c) {
            a = this.f1426d.a();
        }
        return a;
    }

    public i<Void> j(Executor executor) {
        return i0.g(executor, this.f1430h.a(), i());
    }
}

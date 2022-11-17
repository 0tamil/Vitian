package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: f  reason: collision with root package name */
    private static final Uri f1254f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    private final String a;
    private final String b;
    private final ComponentName c = null;

    /* renamed from: d  reason: collision with root package name */
    private final int f1255d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f1256e;

    public i1(String str, String str2, int i2, boolean z) {
        p.e(str);
        this.a = str;
        p.e(str2);
        this.b = str2;
        this.f1255d = i2;
        this.f1256e = z;
    }

    public final int a() {
        return this.f1255d;
    }

    public final ComponentName b() {
        return this.c;
    }

    public final Intent c(Context context) {
        Bundle bundle;
        if (this.a == null) {
            return new Intent().setComponent(this.c);
        }
        Intent intent = null;
        if (this.f1256e) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", this.a);
            try {
                bundle = context.getContentResolver().call(f1254f, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e2) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e2.toString()));
                bundle = null;
            }
            if (bundle != null) {
                intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
            }
            if (intent == null) {
                String valueOf = String.valueOf(this.a);
                Log.w("ConnectionStatusConfig", valueOf.length() != 0 ? "Dynamic lookup for intent failed for action: ".concat(valueOf) : new String("Dynamic lookup for intent failed for action: "));
            }
        }
        return intent != null ? intent : new Intent(this.a).setPackage(this.b);
    }

    public final String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return o.a(this.a, i1Var.a) && o.a(this.b, i1Var.b) && o.a(this.c, i1Var.c) && this.f1255d == i1Var.f1255d && this.f1256e == i1Var.f1256e;
    }

    public final int hashCode() {
        return o.b(this.a, this.b, this.c, Integer.valueOf(this.f1255d), Boolean.valueOf(this.f1256e));
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        p.i(this.c);
        return this.c.flattenToString();
    }
}

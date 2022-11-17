package com.google.android.gms.common.l;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
/* loaded from: classes.dex */
public class b {
    protected final Context a;

    public b(Context context) {
        this.a = context;
    }

    public int a(String str, String str2) {
        return this.a.getPackageManager().checkPermission(str, str2);
    }

    public ApplicationInfo b(String str, int i2) {
        return this.a.getPackageManager().getApplicationInfo(str, i2);
    }

    public CharSequence c(String str) {
        return this.a.getPackageManager().getApplicationLabel(this.a.getPackageManager().getApplicationInfo(str, 0));
    }

    public PackageInfo d(String str, int i2) {
        return this.a.getPackageManager().getPackageInfo(str, i2);
    }
}

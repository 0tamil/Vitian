package com.google.firebase.crashlytics.i.j;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.firebase.crashlytics.i.e;
/* loaded from: classes.dex */
public class h {
    public final String a;
    public final String b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final String f1381d;

    /* renamed from: e  reason: collision with root package name */
    public final String f1382e;

    /* renamed from: f  reason: collision with root package name */
    public final String f1383f;

    /* renamed from: g  reason: collision with root package name */
    public final e f1384g;

    public h(String str, String str2, String str3, String str4, String str5, String str6, e eVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.f1381d = str4;
        this.f1382e = str5;
        this.f1383f = str6;
        this.f1384g = eVar;
    }

    public static h a(Context context, a0 a0Var, String str, String str2, e eVar) {
        String packageName = context.getPackageName();
        String g2 = a0Var.g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String num = Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new h(str, str2, g2, packageName, num, str3, eVar);
    }
}

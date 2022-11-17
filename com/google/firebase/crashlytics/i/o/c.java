package com.google.firebase.crashlytics.i.o;

import android.content.Context;
import com.google.firebase.crashlytics.i.j.f0;
import com.google.firebase.crashlytics.i.l.a0;
import com.google.firebase.crashlytics.i.l.d0.g;
import com.google.firebase.crashlytics.i.p.i;
import f.b.a.a.b;
import f.b.a.a.e;
import f.b.a.a.i.t;
/* loaded from: classes.dex */
public class c {
    private static final g b = new g();
    private static final String c = d("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: d  reason: collision with root package name */
    private static final String f1618d = d("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: e  reason: collision with root package name */
    private static final e<a0, byte[]> f1619e = a.a;
    private final d a;

    c(d dVar, e<a0, byte[]> eVar) {
        this.a = dVar;
    }

    public static c a(Context context, i iVar, f0 f0Var) {
        t.f(context);
        f.b.a.a.g g2 = t.c().g(new com.google.android.datatransport.cct.c(c, f1618d));
        b b2 = b.b("json");
        e<a0, byte[]> eVar = f1619e;
        return new c(new d(g2.a("FIREBASE_CRASHLYTICS_REPORT", a0.class, b2, eVar), iVar.b(), f0Var), eVar);
    }

    private static String d(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i2 = 0; i2 < str.length(); i2++) {
            sb.append(str.charAt(i2));
            if (str2.length() > i2) {
                sb.append(str2.charAt(i2));
            }
        }
        return sb.toString();
    }

    public f.b.a.b.g.i<com.google.firebase.crashlytics.i.j.t> b(com.google.firebase.crashlytics.i.j.t tVar, boolean z) {
        return this.a.g(tVar, z).a();
    }
}

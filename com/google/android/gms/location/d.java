package com.google.android.gms.location;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.p;
import f.b.a.b.d.d.a0;
import f.b.a.b.d.d.n0;
import f.b.a.b.d.d.s;
/* loaded from: classes.dex */
public class d {
    @RecentlyNonNull
    public static final a<a.d.c> a;
    @RecentlyNonNull
    @Deprecated
    public static final a b = new n0();
    @RecentlyNonNull
    @Deprecated
    public static final h c = new a0();

    /* renamed from: d  reason: collision with root package name */
    private static final a.g<s> f1323d;

    /* renamed from: e  reason: collision with root package name */
    private static final a.AbstractC0026a<s, a.d.c> f1324e;

    static {
        a.g<s> gVar = new a.g<>();
        f1323d = gVar;
        u uVar = new u();
        f1324e = uVar;
        a = new a<>("LocationServices.API", uVar, gVar);
    }

    public static s a(f fVar) {
        boolean z = true;
        p.b(fVar != null, "GoogleApiClient parameter is required.");
        s sVar = (s) fVar.i(f1323d);
        if (sVar == null) {
            z = false;
        }
        p.l(z, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return sVar;
    }
}

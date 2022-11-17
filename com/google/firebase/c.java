package com.google.firebase;

import android.content.Context;
import com.google.firebase.s.h;
/* loaded from: classes.dex */
public final /* synthetic */ class c implements h.a {
    public static final /* synthetic */ c a = new c();

    private /* synthetic */ c() {
    }

    @Override // com.google.firebase.s.h.a
    public final String a(Object obj) {
        return r1.getPackageManager().getInstallerPackageName(((Context) obj).getPackageName());
    }
}

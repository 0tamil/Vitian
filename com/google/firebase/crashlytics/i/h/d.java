package com.google.firebase.crashlytics.i.h;

import com.google.firebase.crashlytics.i.f;
import com.google.firebase.crashlytics.i.i.a;
import com.google.firebase.crashlytics.i.i.b;
/* loaded from: classes.dex */
public class d implements b, b {
    private a a;

    @Override // com.google.firebase.crashlytics.i.i.b
    public void a(a aVar) {
        this.a = aVar;
        f.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
    }
}

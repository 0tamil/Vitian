package com.google.firebase.crashlytics.i.h;

import android.os.Bundle;
import com.google.firebase.l.a.a;
/* loaded from: classes.dex */
public class e implements a {
    private final a a;

    public e(a aVar) {
        this.a = aVar;
    }

    @Override // com.google.firebase.crashlytics.i.h.a
    public void a(String str, Bundle bundle) {
        this.a.c("clx", str, bundle);
    }
}

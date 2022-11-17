package com.google.firebase.crashlytics.i.j;

import com.google.auto.value.AutoValue;
import com.google.firebase.crashlytics.i.l.a0;
import java.io.File;
@AutoValue
/* loaded from: classes.dex */
public abstract class t {
    public static t a(a0 a0Var, String str, File file) {
        return new i(a0Var, str, file);
    }

    public abstract a0 b();

    public abstract File c();

    public abstract String d();
}

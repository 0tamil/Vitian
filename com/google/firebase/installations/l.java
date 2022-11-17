package com.google.firebase.installations;

import com.google.auto.value.AutoValue;
import com.google.firebase.installations.e;
@AutoValue
/* loaded from: classes.dex */
public abstract class l {

    @AutoValue.Builder
    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract l a();

        public abstract a b(String str);

        public abstract a c(long j2);

        public abstract a d(long j2);
    }

    public static a a() {
        return new e.b();
    }

    public abstract String b();

    public abstract long c();

    public abstract long d();
}

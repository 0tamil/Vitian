package com.google.firebase.installations.r;

import com.google.auto.value.AutoValue;
import com.google.firebase.installations.r.b;
@AutoValue
/* loaded from: classes.dex */
public abstract class f {

    @AutoValue.Builder
    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract f a();

        public abstract a b(b bVar);

        public abstract a c(String str);

        public abstract a d(long j2);
    }

    /* loaded from: classes.dex */
    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    public static a a() {
        b.C0053b bVar = new b.C0053b();
        bVar.d(0L);
        return bVar;
    }

    public abstract b b();

    public abstract String c();

    public abstract long d();
}

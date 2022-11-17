package com.google.android.datatransport.cct.f;

import com.google.android.datatransport.cct.f.e;
import com.google.auto.value.AutoValue;
@AutoValue
/* loaded from: classes.dex */
public abstract class k {

    @AutoValue.Builder
    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract k a();

        public abstract a b(com.google.android.datatransport.cct.f.a aVar);

        public abstract a c(b bVar);
    }

    /* loaded from: classes.dex */
    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);

        b(int i2) {
        }
    }

    public static a a() {
        return new e.b();
    }

    public abstract com.google.android.datatransport.cct.f.a b();

    public abstract b c();
}

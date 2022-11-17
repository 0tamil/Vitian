package com.google.android.datatransport.cct.f;

import com.google.android.datatransport.cct.f.f;
import com.google.auto.value.AutoValue;
@AutoValue
/* loaded from: classes.dex */
public abstract class l {

    @AutoValue.Builder
    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract l a();

        public abstract a b(Integer num);

        public abstract a c(long j2);

        public abstract a d(long j2);

        public abstract a e(o oVar);

        abstract a f(byte[] bArr);

        abstract a g(String str);

        public abstract a h(long j2);
    }

    private static a a() {
        return new f.b();
    }

    public static a i(String str) {
        a a2 = a();
        a2.g(str);
        return a2;
    }

    public static a j(byte[] bArr) {
        a a2 = a();
        a2.f(bArr);
        return a2;
    }

    public abstract Integer b();

    public abstract long c();

    public abstract long d();

    public abstract o e();

    public abstract byte[] f();

    public abstract String g();

    public abstract long h();
}

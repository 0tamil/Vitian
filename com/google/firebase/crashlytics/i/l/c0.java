package com.google.firebase.crashlytics.i.l;

import com.google.auto.value.AutoValue;
import com.google.firebase.crashlytics.i.e;
@AutoValue
/* loaded from: classes.dex */
public abstract class c0 {

    @AutoValue
    /* loaded from: classes.dex */
    public static abstract class a {
        public static a b(String str, String str2, String str3, String str4, int i2, e eVar) {
            return new x(str, str2, str3, str4, i2, eVar);
        }

        public abstract String a();

        public abstract int c();

        public abstract e d();

        public abstract String e();

        public abstract String f();

        public abstract String g();
    }

    @AutoValue
    /* loaded from: classes.dex */
    public static abstract class b {
        public static b c(int i2, String str, int i3, long j2, long j3, boolean z, int i4, String str2, String str3) {
            return new y(i2, str, i3, j2, j3, z, i4, str2, str3);
        }

        public abstract int a();

        public abstract int b();

        public abstract long d();

        public abstract boolean e();

        public abstract String f();

        public abstract String g();

        public abstract String h();

        public abstract int i();

        public abstract long j();
    }

    @AutoValue
    /* loaded from: classes.dex */
    public static abstract class c {
        public static c a(String str, String str2, boolean z) {
            return new z(str, str2, z);
        }

        public abstract boolean b();

        public abstract String c();

        public abstract String d();
    }

    public static c0 b(a aVar, c cVar, b bVar) {
        return new w(aVar, cVar, bVar);
    }

    public abstract a a();

    public abstract b c();

    public abstract c d();
}

package com.google.firebase.installations.s;
/* loaded from: classes.dex */
public class b implements a {
    private static b a;

    private b() {
    }

    public static b b() {
        if (a == null) {
            a = new b();
        }
        return a;
    }

    @Override // com.google.firebase.installations.s.a
    public long a() {
        return System.currentTimeMillis();
    }
}

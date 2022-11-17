package com.google.firebase.crashlytics.i.j;
/* loaded from: classes.dex */
public enum x {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    

    /* renamed from: e  reason: collision with root package name */
    private final int f1436e;

    x(int i2) {
        this.f1436e = i2;
    }

    public static x a(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int c() {
        return this.f1436e;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f1436e);
    }
}

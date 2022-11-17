package com.google.firebase.components;
/* loaded from: classes.dex */
public final class u {
    private final Class<?> a;
    private final int b;
    private final int c;

    private u(Class<?> cls, int i2, int i3) {
        d0.c(cls, "Null dependency anInterface.");
        this.a = cls;
        this.b = i2;
        this.c = i3;
    }

    public static u a(Class<?> cls) {
        return new u(cls, 0, 2);
    }

    private static String b(int i2) {
        if (i2 == 0) {
            return "direct";
        }
        if (i2 == 1) {
            return "provider";
        }
        if (i2 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i2);
    }

    @Deprecated
    public static u h(Class<?> cls) {
        return new u(cls, 0, 0);
    }

    public static u i(Class<?> cls) {
        return new u(cls, 0, 1);
    }

    public static u j(Class<?> cls) {
        return new u(cls, 1, 0);
    }

    public static u k(Class<?> cls) {
        return new u(cls, 1, 1);
    }

    public static u l(Class<?> cls) {
        return new u(cls, 2, 0);
    }

    public Class<?> c() {
        return this.a;
    }

    public boolean d() {
        return this.c == 2;
    }

    public boolean e() {
        return this.c == 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.a == uVar.a && this.b == uVar.b && this.c == uVar.c;
    }

    public boolean f() {
        return this.b == 1;
    }

    public boolean g() {
        return this.b == 2;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i2 = this.b;
        sb.append(i2 == 1 ? "required" : i2 == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(b(this.c));
        sb.append("}");
        return sb.toString();
    }
}

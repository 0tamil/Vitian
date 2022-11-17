package f.b.b.a.y;

import f.b.b.a.z.a.b0;
/* loaded from: classes.dex */
public enum u implements b0.c {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: e  reason: collision with root package name */
    private final int f2479e;

    u(int i2) {
        this.f2479e = i2;
    }

    public static u a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_HASH;
        }
        if (i2 == 1) {
            return SHA1;
        }
        if (i2 == 2) {
            return SHA384;
        }
        if (i2 == 3) {
            return SHA256;
        }
        if (i2 != 4) {
            return null;
        }
        return SHA512;
    }

    @Override // f.b.b.a.z.a.b0.c
    public final int b() {
        if (this != UNRECOGNIZED) {
            return this.f2479e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

package f.b.b.a.y;

import f.b.b.a.z.a.b0;
/* loaded from: classes.dex */
public enum i0 implements b0.c {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: e  reason: collision with root package name */
    private final int f2472e;

    i0(int i2) {
        this.f2472e = i2;
    }

    public static i0 a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i2 == 1) {
            return TINK;
        }
        if (i2 == 2) {
            return LEGACY;
        }
        if (i2 == 3) {
            return RAW;
        }
        if (i2 != 4) {
            return null;
        }
        return CRUNCHY;
    }

    @Override // f.b.b.a.z.a.b0.c
    public final int b() {
        if (this != UNRECOGNIZED) {
            return this.f2472e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

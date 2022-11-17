package f.b.b.a.y;

import f.b.b.a.z.a.b0;
/* loaded from: classes.dex */
public enum z implements b0.c {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: e  reason: collision with root package name */
    private final int f2493e;

    z(int i2) {
        this.f2493e = i2;
    }

    public static z a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_STATUS;
        }
        if (i2 == 1) {
            return ENABLED;
        }
        if (i2 == 2) {
            return DISABLED;
        }
        if (i2 != 3) {
            return null;
        }
        return DESTROYED;
    }

    @Override // f.b.b.a.z.a.b0.c
    public final int b() {
        if (this != UNRECOGNIZED) {
            return this.f2493e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

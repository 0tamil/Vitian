package j.c0;

import j.z.c;
/* loaded from: classes.dex */
class a {
    public static final int a(int i2) {
        boolean z = false;
        if (2 <= i2 && i2 < 37) {
            z = true;
        }
        if (z) {
            return i2;
        }
        throw new IllegalArgumentException("radix " + i2 + " was not in valid range " + new c(2, 36));
    }

    public static final int b(char c, int i2) {
        return Character.digit((int) c, i2);
    }

    public static final boolean c(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }
}

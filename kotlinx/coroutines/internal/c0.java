package kotlinx.coroutines.internal;

import j.c0.l;
/* loaded from: classes.dex */
public final /* synthetic */ class c0 {
    public static final int a(String str, int i2, int i3, int i4) {
        return (int) a0.c(str, i2, i3, i4);
    }

    public static final long b(String str, long j2, long j3, long j4) {
        Long h2;
        String d2 = a0.d(str);
        if (d2 == null) {
            return j2;
        }
        h2 = l.h(d2);
        if (h2 != null) {
            long longValue = h2.longValue();
            boolean z = false;
            if (j3 <= longValue && longValue <= j4) {
                z = true;
            }
            if (z) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j3 + ".." + j4 + ", but is '" + longValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + d2 + '\'').toString());
    }

    public static final boolean c(String str, boolean z) {
        String d2 = a0.d(str);
        return d2 == null ? z : Boolean.parseBoolean(d2);
    }

    public static /* synthetic */ int d(String str, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            i3 = 1;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return a0.b(str, i2, i3, i4);
    }

    public static /* synthetic */ long e(String str, long j2, long j3, long j4, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j3 = 1;
        }
        long j5 = j3;
        if ((i2 & 8) != 0) {
            j4 = Long.MAX_VALUE;
        }
        return a0.c(str, j2, j5, j4);
    }
}

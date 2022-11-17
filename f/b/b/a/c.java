package f.b.b.a;

import f.b.b.a.y.c0;
import f.b.b.a.y.i0;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class c {
    public static final byte[] a = new byte[0];

    /* loaded from: classes.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[i0.values().length];
            a = iArr;
            try {
                iArr[i0.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[i0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[i0.TINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[i0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static byte[] a(c0.c cVar) {
        ByteBuffer put;
        int i2 = a.a[cVar.U().ordinal()];
        if (i2 == 1 || i2 == 2) {
            put = ByteBuffer.allocate(5).put((byte) 0);
        } else if (i2 == 3) {
            put = ByteBuffer.allocate(5).put((byte) 1);
        } else if (i2 == 4) {
            return a;
        } else {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return put.putInt(cVar.T()).array();
    }
}

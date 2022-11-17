package f.b.b.a;

import f.b.b.a.y.a0;
import f.b.b.a.y.i0;
import f.b.b.a.z.a.i;
/* loaded from: classes.dex */
public final class g {
    private final a0 a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[b.values().length];
            b = iArr;
            try {
                iArr[b.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[b.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[b.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[b.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[i0.values().length];
            a = iArr2;
            try {
                iArr2[i0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[i0.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[i0.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[i0.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        TINK,
        LEGACY,
        RAW,
        CRUNCHY
    }

    private g(a0 a0Var) {
        this.a = a0Var;
    }

    public static g a(String str, byte[] bArr, b bVar) {
        a0.b V = a0.V();
        V.z(str);
        V.A(i.k(bArr));
        V.y(c(bVar));
        return new g(V.a());
    }

    private static i0 c(b bVar) {
        int i2 = a.b[bVar.ordinal()];
        if (i2 == 1) {
            return i0.TINK;
        }
        if (i2 == 2) {
            return i0.LEGACY;
        }
        if (i2 == 3) {
            return i0.RAW;
        }
        if (i2 == 4) {
            return i0.CRUNCHY;
        }
        throw new IllegalArgumentException("Unknown output prefix type");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0 b() {
        return this.a;
    }
}

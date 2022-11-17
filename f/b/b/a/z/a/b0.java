package f.b.b.a.z.a;

import f.b.b.a.z.a.s0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class b0 {
    static final Charset a = Charset.forName("UTF-8");
    public static final byte[] b;

    /* loaded from: classes.dex */
    public interface a extends i<Boolean> {
    }

    /* loaded from: classes.dex */
    public interface b extends i<Double> {
    }

    /* loaded from: classes.dex */
    public interface c {
        int b();
    }

    /* loaded from: classes.dex */
    public interface d<T extends c> {
        T a(int i2);
    }

    /* loaded from: classes.dex */
    public interface e {
        boolean a(int i2);
    }

    /* loaded from: classes.dex */
    public interface f extends i<Float> {
    }

    /* loaded from: classes.dex */
    public interface g extends i<Integer> {
    }

    /* loaded from: classes.dex */
    public interface h extends i<Long> {
    }

    /* loaded from: classes.dex */
    public interface i<E> extends List<E>, RandomAccess {
        void b();

        i<E> d(int i2);

        boolean f();
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        j.f(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T b(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    public static int c(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    static int e(byte[] bArr, int i2, int i3) {
        int i4 = i(i3, bArr, i2, i3);
        if (i4 == 0) {
            return 1;
        }
        return i4;
    }

    public static int f(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return t1.m(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object h(Object obj, Object obj2) {
        s0.a h2 = ((s0) obj).h();
        h2.d((s0) obj2);
        return h2.p();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(int i2, byte[] bArr, int i3, int i4) {
        for (int i5 = i3; i5 < i3 + i4; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }

    public static String j(byte[] bArr) {
        return new String(bArr, a);
    }
}

package h.a.d.a;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class s implements i<Object> {
    public static final s a = new s();
    private static final boolean b;
    private static final Charset c;

    /* loaded from: classes.dex */
    static final class a extends ByteArrayOutputStream {
        /* JADX INFO: Access modifiers changed from: package-private */
        public byte[] b() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    static {
        b = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;
        c = Charset.forName("UTF8");
    }

    protected static final void c(ByteBuffer byteBuffer, int i2) {
        int position = byteBuffer.position() % i2;
        if (position != 0) {
            byteBuffer.position((byteBuffer.position() + i2) - position);
        }
    }

    protected static final byte[] d(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[e(byteBuffer)];
        byteBuffer.get(bArr);
        return bArr;
    }

    protected static final int e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            int i2 = byteBuffer.get() & 255;
            return i2 < 254 ? i2 : i2 == 254 ? byteBuffer.getChar() : byteBuffer.getInt();
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    protected static final void h(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        int size = byteArrayOutputStream.size() % i2;
        if (size != 0) {
            for (int i3 = 0; i3 < i2 - size; i3++) {
                byteArrayOutputStream.write(0);
            }
        }
    }

    protected static final void i(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) {
        o(byteArrayOutputStream, bArr.length);
        byteArrayOutputStream.write(bArr, 0, bArr.length);
    }

    protected static final void j(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        if (b) {
            byteArrayOutputStream.write(i2);
            i2 >>>= 8;
        } else {
            byteArrayOutputStream.write(i2 >>> 8);
        }
        byteArrayOutputStream.write(i2);
    }

    protected static final void k(ByteArrayOutputStream byteArrayOutputStream, double d2) {
        n(byteArrayOutputStream, Double.doubleToLongBits(d2));
    }

    protected static final void l(ByteArrayOutputStream byteArrayOutputStream, float f2) {
        m(byteArrayOutputStream, Float.floatToIntBits(f2));
    }

    protected static final void m(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        if (b) {
            byteArrayOutputStream.write(i2);
            byteArrayOutputStream.write(i2 >>> 8);
            byteArrayOutputStream.write(i2 >>> 16);
            i2 >>>= 24;
        } else {
            byteArrayOutputStream.write(i2 >>> 24);
            byteArrayOutputStream.write(i2 >>> 16);
            byteArrayOutputStream.write(i2 >>> 8);
        }
        byteArrayOutputStream.write(i2);
    }

    protected static final void n(ByteArrayOutputStream byteArrayOutputStream, long j2) {
        if (b) {
            byteArrayOutputStream.write((byte) j2);
            byteArrayOutputStream.write((byte) (j2 >>> 8));
            byteArrayOutputStream.write((byte) (j2 >>> 16));
            byteArrayOutputStream.write((byte) (j2 >>> 24));
            byteArrayOutputStream.write((byte) (j2 >>> 32));
            byteArrayOutputStream.write((byte) (j2 >>> 40));
            byteArrayOutputStream.write((byte) (j2 >>> 48));
            j2 >>>= 56;
        } else {
            byteArrayOutputStream.write((byte) (j2 >>> 56));
            byteArrayOutputStream.write((byte) (j2 >>> 48));
            byteArrayOutputStream.write((byte) (j2 >>> 40));
            byteArrayOutputStream.write((byte) (j2 >>> 32));
            byteArrayOutputStream.write((byte) (j2 >>> 24));
            byteArrayOutputStream.write((byte) (j2 >>> 16));
            byteArrayOutputStream.write((byte) (j2 >>> 8));
        }
        byteArrayOutputStream.write((byte) j2);
    }

    protected static final void o(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        if (i2 < 254) {
            byteArrayOutputStream.write(i2);
        } else if (i2 <= 65535) {
            byteArrayOutputStream.write(254);
            j(byteArrayOutputStream, i2);
        } else {
            byteArrayOutputStream.write(255);
            m(byteArrayOutputStream, i2);
        }
    }

    @Override // h.a.d.a.i
    public Object a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.order(ByteOrder.nativeOrder());
        Object f2 = f(byteBuffer);
        if (!byteBuffer.hasRemaining()) {
            return f2;
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    @Override // h.a.d.a.i
    public ByteBuffer b(Object obj) {
        if (obj == null) {
            return null;
        }
        a aVar = new a();
        p(aVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.b(), 0, aVar.size());
        return allocateDirect;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return g(byteBuffer.get(), byteBuffer);
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.Map, java.util.HashMap] */
    protected Object g(byte b2, ByteBuffer byteBuffer) {
        int i2;
        int[] iArr;
        int i3;
        long[] jArr;
        ?? r1;
        int i4 = 0;
        switch (b2) {
            case 0:
                return null;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.FALSE;
            case 3:
                return Integer.valueOf(byteBuffer.getInt());
            case 4:
                return Long.valueOf(byteBuffer.getLong());
            case 5:
                return new BigInteger(new String(d(byteBuffer), c), 16);
            case 6:
                c(byteBuffer, 8);
                return Double.valueOf(byteBuffer.getDouble());
            case 7:
                return new String(d(byteBuffer), c);
            case 8:
                return d(byteBuffer);
            case 9:
                i2 = e(byteBuffer);
                int[] iArr2 = new int[i2];
                c(byteBuffer, 4);
                byteBuffer.asIntBuffer().get(iArr2);
                iArr = iArr2;
                byteBuffer.position(byteBuffer.position() + (i2 * 4));
                return iArr;
            case 10:
                i3 = e(byteBuffer);
                long[] jArr2 = new long[i3];
                c(byteBuffer, 8);
                byteBuffer.asLongBuffer().get(jArr2);
                jArr = jArr2;
                byteBuffer.position(byteBuffer.position() + (i3 * 8));
                return jArr;
            case 11:
                i3 = e(byteBuffer);
                double[] dArr = new double[i3];
                c(byteBuffer, 8);
                byteBuffer.asDoubleBuffer().get(dArr);
                jArr = dArr;
                byteBuffer.position(byteBuffer.position() + (i3 * 8));
                return jArr;
            case 12:
                int e2 = e(byteBuffer);
                r1 = new ArrayList(e2);
                while (i4 < e2) {
                    r1.add(f(byteBuffer));
                    i4++;
                }
                return r1;
            case 13:
                int e3 = e(byteBuffer);
                r1 = new HashMap();
                while (i4 < e3) {
                    r1.put(f(byteBuffer), f(byteBuffer));
                    i4++;
                }
                return r1;
            case 14:
                i2 = e(byteBuffer);
                float[] fArr = new float[i2];
                c(byteBuffer, 4);
                byteBuffer.asFloatBuffer().get(fArr);
                iArr = fArr;
                byteBuffer.position(byteBuffer.position() + (i2 * 4));
                return iArr;
            default:
                throw new IllegalArgumentException("Message corrupted");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        int i2 = 0;
        if (obj == null || obj.equals(null)) {
            byteArrayOutputStream.write(0);
        } else if (obj instanceof Boolean) {
            byteArrayOutputStream.write(((Boolean) obj).booleanValue() ? 1 : 2);
        } else if (obj instanceof Number) {
            if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                byteArrayOutputStream.write(3);
                m(byteArrayOutputStream, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                byteArrayOutputStream.write(4);
                n(byteArrayOutputStream, ((Long) obj).longValue());
            } else if ((obj instanceof Float) || (obj instanceof Double)) {
                byteArrayOutputStream.write(6);
                h(byteArrayOutputStream, 8);
                k(byteArrayOutputStream, ((Number) obj).doubleValue());
            } else if (obj instanceof BigInteger) {
                byteArrayOutputStream.write(5);
                i(byteArrayOutputStream, ((BigInteger) obj).toString(16).getBytes(c));
            } else {
                throw new IllegalArgumentException("Unsupported Number type: " + obj.getClass());
            }
        } else if (obj instanceof CharSequence) {
            byteArrayOutputStream.write(7);
            i(byteArrayOutputStream, obj.toString().getBytes(c));
        } else if (obj instanceof byte[]) {
            byteArrayOutputStream.write(8);
            i(byteArrayOutputStream, (byte[]) obj);
        } else if (obj instanceof int[]) {
            byteArrayOutputStream.write(9);
            int[] iArr = (int[]) obj;
            o(byteArrayOutputStream, iArr.length);
            h(byteArrayOutputStream, 4);
            int length = iArr.length;
            while (i2 < length) {
                m(byteArrayOutputStream, iArr[i2]);
                i2++;
            }
        } else if (obj instanceof long[]) {
            byteArrayOutputStream.write(10);
            long[] jArr = (long[]) obj;
            o(byteArrayOutputStream, jArr.length);
            h(byteArrayOutputStream, 8);
            int length2 = jArr.length;
            while (i2 < length2) {
                n(byteArrayOutputStream, jArr[i2]);
                i2++;
            }
        } else if (obj instanceof double[]) {
            byteArrayOutputStream.write(11);
            double[] dArr = (double[]) obj;
            o(byteArrayOutputStream, dArr.length);
            h(byteArrayOutputStream, 8);
            int length3 = dArr.length;
            while (i2 < length3) {
                k(byteArrayOutputStream, dArr[i2]);
                i2++;
            }
        } else if (obj instanceof List) {
            byteArrayOutputStream.write(12);
            List<Object> list = (List) obj;
            o(byteArrayOutputStream, list.size());
            for (Object obj2 : list) {
                p(byteArrayOutputStream, obj2);
            }
        } else if (obj instanceof Map) {
            byteArrayOutputStream.write(13);
            Map map = (Map) obj;
            o(byteArrayOutputStream, map.size());
            for (Map.Entry entry : map.entrySet()) {
                p(byteArrayOutputStream, entry.getKey());
                p(byteArrayOutputStream, entry.getValue());
            }
        } else if (obj instanceof float[]) {
            byteArrayOutputStream.write(14);
            float[] fArr = (float[]) obj;
            o(byteArrayOutputStream, fArr.length);
            h(byteArrayOutputStream, 4);
            int length4 = fArr.length;
            while (i2 < length4) {
                l(byteArrayOutputStream, fArr[i2]);
                i2++;
            }
        } else {
            throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass() + "'");
        }
    }
}

package f.b.c.z.n;

import f.b.c.b0.b;
import f.b.c.h;
import f.b.c.k;
import f.b.c.m;
import f.b.c.n;
import f.b.c.p;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public final class f extends f.b.c.b0.a {
    private static final Reader x = new a();
    private static final Object y = new Object();
    private Object[] t = new Object[32];
    private int u = 0;
    private String[] v = new String[32];
    private int[] w = new int[32];

    /* loaded from: classes.dex */
    class a extends Reader {
        a() {
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i2, int i3) {
            throw new AssertionError();
        }
    }

    public f(k kVar) {
        super(x);
        X(kVar);
    }

    private void S(b bVar) {
        if (G() != bVar) {
            throw new IllegalStateException("Expected " + bVar + " but was " + G() + t());
        }
    }

    private Object U() {
        return this.t[this.u - 1];
    }

    private Object V() {
        Object[] objArr = this.t;
        int i2 = this.u - 1;
        this.u = i2;
        Object obj = objArr[i2];
        objArr[i2] = null;
        return obj;
    }

    private void X(Object obj) {
        int i2 = this.u;
        Object[] objArr = this.t;
        if (i2 == objArr.length) {
            int i3 = i2 * 2;
            this.t = Arrays.copyOf(objArr, i3);
            this.w = Arrays.copyOf(this.w, i3);
            this.v = (String[]) Arrays.copyOf(this.v, i3);
        }
        Object[] objArr2 = this.t;
        int i4 = this.u;
        this.u = i4 + 1;
        objArr2[i4] = obj;
    }

    private String t() {
        return " at path " + o();
    }

    @Override // f.b.c.b0.a
    public String A() {
        S(b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) U()).next();
        String str = (String) entry.getKey();
        this.v[this.u - 1] = str;
        X(entry.getValue());
        return str;
    }

    @Override // f.b.c.b0.a
    public void C() {
        S(b.NULL);
        V();
        int i2 = this.u;
        if (i2 > 0) {
            int[] iArr = this.w;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // f.b.c.b0.a
    public String E() {
        b G = G();
        b bVar = b.STRING;
        if (G == bVar || G == b.NUMBER) {
            String k2 = ((p) V()).k();
            int i2 = this.u;
            if (i2 > 0) {
                int[] iArr = this.w;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return k2;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + G + t());
    }

    @Override // f.b.c.b0.a
    public b G() {
        if (this.u == 0) {
            return b.END_DOCUMENT;
        }
        Object U = U();
        if (U instanceof Iterator) {
            boolean z = this.t[this.u - 2] instanceof n;
            Iterator it = (Iterator) U;
            if (!it.hasNext()) {
                return z ? b.END_OBJECT : b.END_ARRAY;
            }
            if (z) {
                return b.NAME;
            }
            X(it.next());
            return G();
        } else if (U instanceof n) {
            return b.BEGIN_OBJECT;
        } else {
            if (U instanceof h) {
                return b.BEGIN_ARRAY;
            }
            if (U instanceof p) {
                p pVar = (p) U;
                if (pVar.x()) {
                    return b.STRING;
                }
                if (pVar.u()) {
                    return b.BOOLEAN;
                }
                if (pVar.w()) {
                    return b.NUMBER;
                }
                throw new AssertionError();
            } else if (U instanceof m) {
                return b.NULL;
            } else {
                if (U == y) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    @Override // f.b.c.b0.a
    public void Q() {
        if (G() == b.NAME) {
            A();
            this.v[this.u - 2] = "null";
        } else {
            V();
            int i2 = this.u;
            if (i2 > 0) {
                this.v[i2 - 1] = "null";
            }
        }
        int i3 = this.u;
        if (i3 > 0) {
            int[] iArr = this.w;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k T() {
        b G = G();
        if (G == b.NAME || G == b.END_ARRAY || G == b.END_OBJECT || G == b.END_DOCUMENT) {
            throw new IllegalStateException("Unexpected " + G + " when reading a JsonElement.");
        }
        k kVar = (k) U();
        Q();
        return kVar;
    }

    public void W() {
        S(b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) U()).next();
        X(entry.getValue());
        X(new p((String) entry.getKey()));
    }

    @Override // f.b.c.b0.a
    public void b() {
        S(b.BEGIN_ARRAY);
        X(((h) U()).iterator());
        this.w[this.u - 1] = 0;
    }

    @Override // f.b.c.b0.a
    public void c() {
        S(b.BEGIN_OBJECT);
        X(((n) U()).q().iterator());
    }

    @Override // f.b.c.b0.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.t = new Object[]{y};
        this.u = 1;
    }

    @Override // f.b.c.b0.a
    public void i() {
        S(b.END_ARRAY);
        V();
        V();
        int i2 = this.u;
        if (i2 > 0) {
            int[] iArr = this.w;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // f.b.c.b0.a
    public void l() {
        S(b.END_OBJECT);
        V();
        V();
        int i2 = this.u;
        if (i2 > 0) {
            int[] iArr = this.w;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // f.b.c.b0.a
    public String o() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i2 = 0;
        while (true) {
            int i3 = this.u;
            if (i2 >= i3) {
                return sb.toString();
            }
            Object[] objArr = this.t;
            if (objArr[i2] instanceof h) {
                i2++;
                if (i2 < i3 && (objArr[i2] instanceof Iterator)) {
                    sb.append('[');
                    sb.append(this.w[i2]);
                    sb.append(']');
                }
            } else if ((objArr[i2] instanceof n) && (i2 = i2 + 1) < i3 && (objArr[i2] instanceof Iterator)) {
                sb.append('.');
                String[] strArr = this.v;
                if (strArr[i2] != null) {
                    sb.append(strArr[i2]);
                }
            }
            i2++;
        }
    }

    @Override // f.b.c.b0.a
    public boolean q() {
        b G = G();
        return (G == b.END_OBJECT || G == b.END_ARRAY) ? false : true;
    }

    @Override // f.b.c.b0.a
    public String toString() {
        return f.class.getSimpleName() + t();
    }

    @Override // f.b.c.b0.a
    public boolean w() {
        S(b.BOOLEAN);
        boolean p = ((p) V()).p();
        int i2 = this.u;
        if (i2 > 0) {
            int[] iArr = this.w;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return p;
    }

    @Override // f.b.c.b0.a
    public double x() {
        b G = G();
        b bVar = b.NUMBER;
        if (G == bVar || G == b.STRING) {
            double q = ((p) U()).q();
            if (r() || (!Double.isNaN(q) && !Double.isInfinite(q))) {
                V();
                int i2 = this.u;
                if (i2 > 0) {
                    int[] iArr = this.w;
                    int i3 = i2 - 1;
                    iArr[i3] = iArr[i3] + 1;
                }
                return q;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: " + q);
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + G + t());
    }

    @Override // f.b.c.b0.a
    public int y() {
        b G = G();
        b bVar = b.NUMBER;
        if (G == bVar || G == b.STRING) {
            int r = ((p) U()).r();
            V();
            int i2 = this.u;
            if (i2 > 0) {
                int[] iArr = this.w;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return r;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + G + t());
    }

    @Override // f.b.c.b0.a
    public long z() {
        b G = G();
        b bVar = b.NUMBER;
        if (G == bVar || G == b.STRING) {
            long s = ((p) U()).s();
            V();
            int i2 = this.u;
            if (i2 > 0) {
                int[] iArr = this.w;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return s;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + G + t());
    }
}

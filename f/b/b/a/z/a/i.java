package f.b.b.a.z.a;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class i implements Iterable<Byte>, Serializable {

    /* renamed from: f  reason: collision with root package name */
    public static final i f2526f = new C0101i(b0.b);

    /* renamed from: g  reason: collision with root package name */
    private static final e f2527g;

    /* renamed from: e  reason: collision with root package name */
    private int f2528e = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends b {

        /* renamed from: e  reason: collision with root package name */
        private int f2529e = 0;

        /* renamed from: f  reason: collision with root package name */
        private final int f2530f;

        a() {
            this.f2530f = i.this.size();
        }

        @Override // f.b.b.a.z.a.i.f
        public byte a() {
            int i2 = this.f2529e;
            if (i2 < this.f2530f) {
                this.f2529e = i2 + 1;
                return i.this.o(i2);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2529e < this.f2530f;
        }
    }

    /* loaded from: classes.dex */
    static abstract class b implements f {
        b() {
        }

        /* renamed from: b */
        public final Byte next() {
            return Byte.valueOf(a());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    private static final class c implements e {
        private c() {
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        @Override // f.b.b.a.z.a.i.e
        public byte[] a(byte[] bArr, int i2, int i3) {
            return Arrays.copyOfRange(bArr, i2, i3 + i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d extends C0101i {

        /* renamed from: i  reason: collision with root package name */
        private final int f2532i;

        /* renamed from: j  reason: collision with root package name */
        private final int f2533j;

        d(byte[] bArr, int i2, int i3) {
            super(bArr);
            i.j(i2, i2 + i3, bArr.length);
            this.f2532i = i2;
            this.f2533j = i3;
        }

        @Override // f.b.b.a.z.a.i.C0101i
        protected int F() {
            return this.f2532i;
        }

        @Override // f.b.b.a.z.a.i.C0101i, f.b.b.a.z.a.i
        public byte h(int i2) {
            i.i(i2, size());
            return this.f2534h[this.f2532i + i2];
        }

        @Override // f.b.b.a.z.a.i.C0101i, f.b.b.a.z.a.i
        protected void n(byte[] bArr, int i2, int i3, int i4) {
            System.arraycopy(this.f2534h, F() + i2, bArr, i3, i4);
        }

        @Override // f.b.b.a.z.a.i.C0101i, f.b.b.a.z.a.i
        byte o(int i2) {
            return this.f2534h[this.f2532i + i2];
        }

        @Override // f.b.b.a.z.a.i.C0101i, f.b.b.a.z.a.i
        public int size() {
            return this.f2533j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface e {
        byte[] a(byte[] bArr, int i2, int i3);
    }

    /* loaded from: classes.dex */
    public interface f extends Iterator<Byte> {
        byte a();
    }

    /* loaded from: classes.dex */
    static final class g {
        private final l a;
        private final byte[] b;

        private g(int i2) {
            byte[] bArr = new byte[i2];
            this.b = bArr;
            this.a = l.d0(bArr);
        }

        /* synthetic */ g(int i2, a aVar) {
            this(i2);
        }

        public i a() {
            this.a.c();
            return new C0101i(this.b);
        }

        public l b() {
            return this.a;
        }
    }

    /* loaded from: classes.dex */
    static abstract class h extends i {
        h() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f.b.b.a.z.a.i$i  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0101i extends h {

        /* renamed from: h  reason: collision with root package name */
        protected final byte[] f2534h;

        C0101i(byte[] bArr) {
            Objects.requireNonNull(bArr);
            this.f2534h = bArr;
        }

        @Override // f.b.b.a.z.a.i
        final void D(f.b.b.a.z.a.h hVar) {
            hVar.a(this.f2534h, F(), size());
        }

        final boolean E(i iVar, int i2, int i3) {
            if (i3 <= iVar.size()) {
                int i4 = i2 + i3;
                if (i4 > iVar.size()) {
                    throw new IllegalArgumentException("Ran off end of other: " + i2 + ", " + i3 + ", " + iVar.size());
                } else if (!(iVar instanceof C0101i)) {
                    return iVar.v(i2, i4).equals(v(0, i3));
                } else {
                    C0101i iVar2 = (C0101i) iVar;
                    byte[] bArr = this.f2534h;
                    byte[] bArr2 = iVar2.f2534h;
                    int F = F() + i3;
                    int F2 = F();
                    int F3 = iVar2.F() + i2;
                    while (F2 < F) {
                        if (bArr[F2] != bArr2[F3]) {
                            return false;
                        }
                        F2++;
                        F3++;
                    }
                    return true;
                }
            } else {
                throw new IllegalArgumentException("Length too large: " + i3 + size());
            }
        }

        protected int F() {
            return 0;
        }

        @Override // f.b.b.a.z.a.i
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof i) || size() != ((i) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof C0101i)) {
                return obj.equals(this);
            }
            C0101i iVar = (C0101i) obj;
            int u = u();
            int u2 = iVar.u();
            if (u == 0 || u2 == 0 || u == u2) {
                return E(iVar, 0, size());
            }
            return false;
        }

        @Override // f.b.b.a.z.a.i
        public byte h(int i2) {
            return this.f2534h[i2];
        }

        @Override // f.b.b.a.z.a.i
        protected void n(byte[] bArr, int i2, int i3, int i4) {
            System.arraycopy(this.f2534h, i2, bArr, i3, i4);
        }

        @Override // f.b.b.a.z.a.i
        byte o(int i2) {
            return this.f2534h[i2];
        }

        @Override // f.b.b.a.z.a.i
        public final boolean p() {
            int F = F();
            return t1.n(this.f2534h, F, size() + F);
        }

        @Override // f.b.b.a.z.a.i
        public final f.b.b.a.z.a.j s() {
            return f.b.b.a.z.a.j.h(this.f2534h, F(), size(), true);
        }

        @Override // f.b.b.a.z.a.i
        public int size() {
            return this.f2534h.length;
        }

        @Override // f.b.b.a.z.a.i
        protected final int t(int i2, int i3, int i4) {
            return b0.i(i2, this.f2534h, F() + i3, i4);
        }

        @Override // f.b.b.a.z.a.i
        public final i v(int i2, int i3) {
            int j2 = i.j(i2, i3, size());
            return j2 == 0 ? i.f2526f : new d(this.f2534h, F() + i2, j2);
        }

        @Override // f.b.b.a.z.a.i
        protected final String y(Charset charset) {
            return new String(this.f2534h, F(), size(), charset);
        }
    }

    /* loaded from: classes.dex */
    private static final class j implements e {
        private j() {
        }

        /* synthetic */ j(a aVar) {
            this();
        }

        @Override // f.b.b.a.z.a.i.e
        public byte[] a(byte[] bArr, int i2, int i3) {
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, i2, bArr2, 0, i3);
            return bArr2;
        }
    }

    static {
        f2527g = f.b.b.a.z.a.d.c() ? new j(null) : new c(null);
    }

    i() {
    }

    private String A() {
        if (size() <= 50) {
            return m1.a(this);
        }
        return m1.a(v(0, 47)) + "...";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i B(byte[] bArr) {
        return new C0101i(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i C(byte[] bArr, int i2, int i3) {
        return new d(bArr, i2, i3);
    }

    static void i(int i2, int i3) {
        if (((i3 - (i2 + 1)) | i2) >= 0) {
            return;
        }
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i2);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i2 + ", " + i3);
    }

    static int j(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i2 + " < 0");
        } else if (i3 < i2) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i2 + ", " + i3);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i3 + " >= " + i4);
        }
    }

    public static i k(byte[] bArr) {
        return l(bArr, 0, bArr.length);
    }

    public static i l(byte[] bArr, int i2, int i3) {
        j(i2, i2 + i3, bArr.length);
        return new C0101i(f2527g.a(bArr, i2, i3));
    }

    public static i m(String str) {
        return new C0101i(str.getBytes(b0.a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g r(int i2) {
        return new g(i2, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void D(f.b.b.a.z.a.h hVar);

    public abstract boolean equals(Object obj);

    public abstract byte h(int i2);

    public final int hashCode() {
        int i2 = this.f2528e;
        if (i2 == 0) {
            int size = size();
            i2 = t(size, 0, size);
            if (i2 == 0) {
                i2 = 1;
            }
            this.f2528e = i2;
        }
        return i2;
    }

    protected abstract void n(byte[] bArr, int i2, int i3, int i4);

    abstract byte o(int i2);

    public abstract boolean p();

    /* renamed from: q */
    public f iterator() {
        return new a();
    }

    public abstract f.b.b.a.z.a.j s();

    public abstract int size();

    protected abstract int t(int i2, int i3, int i4);

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), A());
    }

    protected final int u() {
        return this.f2528e;
    }

    public abstract i v(int i2, int i3);

    public final byte[] w() {
        int size = size();
        if (size == 0) {
            return b0.b;
        }
        byte[] bArr = new byte[size];
        n(bArr, 0, 0, size);
        return bArr;
    }

    public final String x(Charset charset) {
        return size() == 0 ? "" : y(charset);
    }

    protected abstract String y(Charset charset);

    public final String z() {
        return x(b0.a);
    }
}

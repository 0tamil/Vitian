package com.google.firebase.crashlytics.i.k;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class g implements Closeable {

    /* renamed from: k  reason: collision with root package name */
    private static final Logger f1442k = Logger.getLogger(g.class.getName());

    /* renamed from: e  reason: collision with root package name */
    private final RandomAccessFile f1443e;

    /* renamed from: f  reason: collision with root package name */
    int f1444f;

    /* renamed from: g  reason: collision with root package name */
    private int f1445g;

    /* renamed from: h  reason: collision with root package name */
    private b f1446h;

    /* renamed from: i  reason: collision with root package name */
    private b f1447i;

    /* renamed from: j  reason: collision with root package name */
    private final byte[] f1448j = new byte[16];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements d {
        boolean a = true;
        final /* synthetic */ StringBuilder b;

        a(g gVar, StringBuilder sb) {
            this.b = sb;
        }

        @Override // com.google.firebase.crashlytics.i.k.g.d
        public void a(InputStream inputStream, int i2) {
            if (this.a) {
                this.a = false;
            } else {
                this.b.append(", ");
            }
            this.b.append(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {
        static final b c = new b(0, 0);
        final int a;
        final int b;

        b(int i2, int i3) {
            this.a = i2;
            this.b = i3;
        }

        public String toString() {
            return b.class.getSimpleName() + "[position = " + this.a + ", length = " + this.b + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class c extends InputStream {

        /* renamed from: e  reason: collision with root package name */
        private int f1449e;

        /* renamed from: f  reason: collision with root package name */
        private int f1450f;

        private c(b bVar) {
            this.f1449e = g.this.F(bVar.a + 4);
            this.f1450f = bVar.b;
        }

        /* synthetic */ c(g gVar, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f1450f == 0) {
                return -1;
            }
            g.this.f1443e.seek(this.f1449e);
            int read = g.this.f1443e.read();
            this.f1449e = g.this.F(this.f1449e + 1);
            this.f1450f--;
            return read;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) {
            g.s(bArr, "buffer");
            if ((i2 | i3) < 0 || i3 > bArr.length - i2) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i4 = this.f1450f;
            if (i4 <= 0) {
                return -1;
            }
            if (i3 > i4) {
                i3 = i4;
            }
            g.this.B(this.f1449e, bArr, i2, i3);
            this.f1449e = g.this.F(this.f1449e + i3);
            this.f1450f -= i3;
            return i3;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(InputStream inputStream, int i2);
    }

    public g(File file) {
        if (!file.exists()) {
            q(file);
        }
        this.f1443e = t(file);
        x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(int i2, byte[] bArr, int i3, int i4) {
        RandomAccessFile randomAccessFile;
        int F = F(i2);
        int i5 = F + i4;
        int i6 = this.f1444f;
        if (i5 <= i6) {
            this.f1443e.seek(F);
            randomAccessFile = this.f1443e;
        } else {
            int i7 = i6 - F;
            this.f1443e.seek(F);
            this.f1443e.readFully(bArr, i3, i7);
            this.f1443e.seek(16L);
            randomAccessFile = this.f1443e;
            i3 += i7;
            i4 -= i7;
        }
        randomAccessFile.readFully(bArr, i3, i4);
    }

    private void C(int i2, byte[] bArr, int i3, int i4) {
        RandomAccessFile randomAccessFile;
        int F = F(i2);
        int i5 = F + i4;
        int i6 = this.f1444f;
        if (i5 <= i6) {
            this.f1443e.seek(F);
            randomAccessFile = this.f1443e;
        } else {
            int i7 = i6 - F;
            this.f1443e.seek(F);
            this.f1443e.write(bArr, i3, i7);
            this.f1443e.seek(16L);
            randomAccessFile = this.f1443e;
            i3 += i7;
            i4 -= i7;
        }
        randomAccessFile.write(bArr, i3, i4);
    }

    private void D(int i2) {
        this.f1443e.setLength(i2);
        this.f1443e.getChannel().force(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int F(int i2) {
        int i3 = this.f1444f;
        return i2 < i3 ? i2 : (i2 + 16) - i3;
    }

    private void G(int i2, int i3, int i4, int i5) {
        I(this.f1448j, i2, i3, i4, i5);
        this.f1443e.seek(0L);
        this.f1443e.write(this.f1448j);
    }

    private static void H(byte[] bArr, int i2, int i3) {
        bArr[i2] = (byte) (i3 >> 24);
        bArr[i2 + 1] = (byte) (i3 >> 16);
        bArr[i2 + 2] = (byte) (i3 >> 8);
        bArr[i2 + 3] = (byte) i3;
    }

    private static void I(byte[] bArr, int... iArr) {
        int i2 = 0;
        for (int i3 : iArr) {
            H(bArr, i2, i3);
            i2 += 4;
        }
    }

    private void n(int i2) {
        int i3 = i2 + 4;
        int z = z();
        if (z < i3) {
            int i4 = this.f1444f;
            do {
                z += i4;
                i4 <<= 1;
            } while (z < i3);
            D(i4);
            b bVar = this.f1447i;
            int F = F(bVar.a + 4 + bVar.b);
            if (F < this.f1446h.a) {
                FileChannel channel = this.f1443e.getChannel();
                channel.position(this.f1444f);
                long j2 = F - 4;
                if (channel.transferTo(16L, j2, channel) != j2) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            int i5 = this.f1447i.a;
            int i6 = this.f1446h.a;
            if (i5 < i6) {
                int i7 = (this.f1444f + i5) - 16;
                G(i4, this.f1445g, i6, i7);
                this.f1447i = new b(i7, this.f1447i.b);
            } else {
                G(i4, this.f1445g, i6, i5);
            }
            this.f1444f = i4;
        }
    }

    /* JADX WARN: Finally extract failed */
    private static void q(File file) {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile t = t(file2);
        try {
            t.setLength(4096L);
            t.seek(0L);
            byte[] bArr = new byte[16];
            I(bArr, 4096, 0, 0, 0);
            t.write(bArr);
            t.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            t.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T s(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    private static RandomAccessFile t(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    private b w(int i2) {
        if (i2 == 0) {
            return b.c;
        }
        this.f1443e.seek(i2);
        return new b(i2, this.f1443e.readInt());
    }

    private void x() {
        this.f1443e.seek(0L);
        this.f1443e.readFully(this.f1448j);
        int y = y(this.f1448j, 0);
        this.f1444f = y;
        if (y <= this.f1443e.length()) {
            this.f1445g = y(this.f1448j, 4);
            int y2 = y(this.f1448j, 8);
            int y3 = y(this.f1448j, 12);
            this.f1446h = w(y2);
            this.f1447i = w(y3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f1444f + ", Actual length: " + this.f1443e.length());
    }

    private static int y(byte[] bArr, int i2) {
        return ((bArr[i2] & 255) << 24) + ((bArr[i2 + 1] & 255) << 16) + ((bArr[i2 + 2] & 255) << 8) + (bArr[i2 + 3] & 255);
    }

    private int z() {
        return this.f1444f - E();
    }

    public synchronized void A() {
        if (r()) {
            throw new NoSuchElementException();
        } else if (this.f1445g == 1) {
            l();
        } else {
            b bVar = this.f1446h;
            int F = F(bVar.a + 4 + bVar.b);
            B(F, this.f1448j, 0, 4);
            int y = y(this.f1448j, 0);
            G(this.f1444f, this.f1445g - 1, F, this.f1447i.a);
            this.f1445g--;
            this.f1446h = new b(F, y);
        }
    }

    public int E() {
        if (this.f1445g == 0) {
            return 16;
        }
        b bVar = this.f1447i;
        int i2 = bVar.a;
        int i3 = this.f1446h.a;
        return i2 >= i3 ? (i2 - i3) + 4 + bVar.b + 16 : (((i2 + 4) + bVar.b) + this.f1444f) - i3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f1443e.close();
    }

    public void h(byte[] bArr) {
        i(bArr, 0, bArr.length);
    }

    public synchronized void i(byte[] bArr, int i2, int i3) {
        int i4;
        s(bArr, "buffer");
        if ((i2 | i3) < 0 || i3 > bArr.length - i2) {
            throw new IndexOutOfBoundsException();
        }
        n(i3);
        boolean r = r();
        if (r) {
            i4 = 16;
        } else {
            b bVar = this.f1447i;
            i4 = F(bVar.a + 4 + bVar.b);
        }
        b bVar2 = new b(i4, i3);
        H(this.f1448j, 0, i3);
        C(bVar2.a, this.f1448j, 0, 4);
        C(bVar2.a + 4, bArr, i2, i3);
        G(this.f1444f, this.f1445g + 1, r ? bVar2.a : this.f1446h.a, bVar2.a);
        this.f1447i = bVar2;
        this.f1445g++;
        if (r) {
            this.f1446h = bVar2;
        }
    }

    public synchronized void l() {
        G(4096, 0, 0, 0);
        this.f1445g = 0;
        b bVar = b.c;
        this.f1446h = bVar;
        this.f1447i = bVar;
        if (this.f1444f > 4096) {
            D(4096);
        }
        this.f1444f = 4096;
    }

    public synchronized void o(d dVar) {
        int i2 = this.f1446h.a;
        for (int i3 = 0; i3 < this.f1445g; i3++) {
            b w = w(i2);
            dVar.a(new c(this, w, null), w.b);
            i2 = F(w.a + 4 + w.b);
        }
    }

    public synchronized boolean r() {
        return this.f1445g == 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(g.class.getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f1444f);
        sb.append(", size=");
        sb.append(this.f1445g);
        sb.append(", first=");
        sb.append(this.f1446h);
        sb.append(", last=");
        sb.append(this.f1447i);
        sb.append(", element lengths=[");
        try {
            o(new a(this, sb));
        } catch (IOException e2) {
            f1442k.log(Level.WARNING, "read error", (Throwable) e2);
        }
        sb.append("]]");
        return sb.toString();
    }
}

package f.b.c.z;

import f.b.c.b0.c;
import f.b.c.b0.d;
import f.b.c.k;
import f.b.c.m;
import f.b.c.s;
import f.b.c.z.n.n;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
/* loaded from: classes.dex */
public final class l {

    /* loaded from: classes.dex */
    private static final class a extends Writer {

        /* renamed from: e  reason: collision with root package name */
        private final Appendable f2745e;

        /* renamed from: f  reason: collision with root package name */
        private final C0108a f2746f = new C0108a();

        /* renamed from: f.b.c.z.l$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static class C0108a implements CharSequence {

            /* renamed from: e  reason: collision with root package name */
            char[] f2747e;

            C0108a() {
            }

            @Override // java.lang.CharSequence
            public char charAt(int i2) {
                return this.f2747e[i2];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f2747e.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i2, int i3) {
                return new String(this.f2747e, i2, i3 - i2);
            }
        }

        a(Appendable appendable) {
            this.f2745e = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(int i2) {
            this.f2745e.append((char) i2);
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i2, int i3) {
            C0108a aVar = this.f2746f;
            aVar.f2747e = cArr;
            this.f2745e.append(aVar, i2, i3 + i2);
        }
    }

    public static k a(f.b.c.b0.a aVar) {
        EOFException e2;
        boolean z;
        try {
            try {
                aVar.G();
                z = false;
            } catch (EOFException e3) {
                e2 = e3;
                z = true;
            }
            try {
                return n.U.c(aVar);
            } catch (EOFException e4) {
                e2 = e4;
                if (z) {
                    return m.a;
                }
                throw new s(e2);
            }
        } catch (d e5) {
            throw new s(e5);
        } catch (IOException e6) {
            throw new f.b.c.l(e6);
        } catch (NumberFormatException e7) {
            throw new s(e7);
        }
    }

    public static void b(k kVar, c cVar) {
        n.U.e(cVar, kVar);
    }

    public static Writer c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }
}

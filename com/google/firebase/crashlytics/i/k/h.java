package com.google.firebase.crashlytics.i.k;

import com.google.firebase.crashlytics.i.f;
import com.google.firebase.crashlytics.i.j.n;
import com.google.firebase.crashlytics.i.k.g;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
/* loaded from: classes.dex */
class h implements c {

    /* renamed from: d  reason: collision with root package name */
    private static final Charset f1452d = Charset.forName("UTF-8");
    private final File a;
    private final int b;
    private g c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements g.d {
        final /* synthetic */ byte[] a;
        final /* synthetic */ int[] b;

        a(h hVar, byte[] bArr, int[] iArr) {
            this.a = bArr;
            this.b = iArr;
        }

        @Override // com.google.firebase.crashlytics.i.k.g.d
        public void a(InputStream inputStream, int i2) {
            try {
                inputStream.read(this.a, this.b[0], i2);
                int[] iArr = this.b;
                iArr[0] = iArr[0] + i2;
            } finally {
                inputStream.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {
        public final byte[] a;
        public final int b;

        b(byte[] bArr, int i2) {
            this.a = bArr;
            this.b = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(File file, int i2) {
        this.a = file;
        this.b = i2;
    }

    private void f(long j2, String str) {
        int i2;
        if (this.c != null) {
            if (str == null) {
                str = "null";
            }
            try {
                if (str.length() > this.b / 4) {
                    str = "..." + str.substring(str.length() - i2);
                }
                this.c.h(String.format(Locale.US, "%d %s%n", Long.valueOf(j2), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f1452d));
                while (!this.c.r() && this.c.E() > this.b) {
                    this.c.A();
                }
            } catch (IOException e2) {
                f.f().e("There was a problem writing to the Crashlytics log.", e2);
            }
        }
    }

    private b g() {
        if (!this.a.exists()) {
            return null;
        }
        h();
        g gVar = this.c;
        if (gVar == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[gVar.E()];
        try {
            this.c.o(new a(this, bArr, iArr));
        } catch (IOException e2) {
            f.f().e("A problem occurred while reading the Crashlytics log file.", e2);
        }
        return new b(bArr, iArr[0]);
    }

    private void h() {
        if (this.c == null) {
            try {
                this.c = new g(this.a);
            } catch (IOException e2) {
                f f2 = f.f();
                f2.e("Could not open log file: " + this.a, e2);
            }
        }
    }

    @Override // com.google.firebase.crashlytics.i.k.c
    public void a() {
        n.e(this.c, "There was a problem closing the Crashlytics log file.");
        this.c = null;
    }

    @Override // com.google.firebase.crashlytics.i.k.c
    public void b() {
        a();
        this.a.delete();
    }

    @Override // com.google.firebase.crashlytics.i.k.c
    public String c() {
        byte[] e2 = e();
        if (e2 != null) {
            return new String(e2, f1452d);
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.i.k.c
    public void d(long j2, String str) {
        h();
        f(j2, str);
    }

    @Override // com.google.firebase.crashlytics.i.k.c
    public byte[] e() {
        b g2 = g();
        if (g2 == null) {
            return null;
        }
        int i2 = g2.b;
        byte[] bArr = new byte[i2];
        System.arraycopy(g2.a, 0, bArr, 0, i2);
        return bArr;
    }
}

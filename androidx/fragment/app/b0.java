package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;
/* loaded from: classes.dex */
final class b0 extends Writer {

    /* renamed from: e  reason: collision with root package name */
    private final String f701e;

    /* renamed from: f  reason: collision with root package name */
    private StringBuilder f702f = new StringBuilder(128);

    /* JADX INFO: Access modifiers changed from: package-private */
    public b0(String str) {
        this.f701e = str;
    }

    private void b() {
        if (this.f702f.length() > 0) {
            Log.d(this.f701e, this.f702f.toString());
            StringBuilder sb = this.f702f;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        b();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            char c = cArr[i2 + i4];
            if (c == '\n') {
                b();
            } else {
                this.f702f.append(c);
            }
        }
    }
}

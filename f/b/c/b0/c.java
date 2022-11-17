package f.b.c.b0;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public class c implements Closeable, Flushable {
    private static final String[] n = new String[128];
    private static final String[] o;

    /* renamed from: e  reason: collision with root package name */
    private final Writer f2669e;

    /* renamed from: h  reason: collision with root package name */
    private String f2672h;

    /* renamed from: j  reason: collision with root package name */
    private boolean f2674j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f2675k;
    private String l;

    /* renamed from: f  reason: collision with root package name */
    private int[] f2670f = new int[32];

    /* renamed from: g  reason: collision with root package name */
    private int f2671g = 0;

    /* renamed from: i  reason: collision with root package name */
    private String f2673i = ":";
    private boolean m = true;

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            n[i2] = String.format("\\u%04x", Integer.valueOf(i2));
        }
        String[] strArr = n;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        o = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        y(6);
        Objects.requireNonNull(writer, "out == null");
        this.f2669e = writer;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void E(String str) {
        String str2;
        String[] strArr = this.f2675k ? o : n;
        this.f2669e.write(34);
        int length = str.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
                if (i2 < i3) {
                    this.f2669e.write(str, i2, i3 - i2);
                }
                this.f2669e.write(str2);
                i2 = i3 + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i2 < i3) {
                }
                this.f2669e.write(str2);
                i2 = i3 + 1;
            }
        }
        if (i2 < length) {
            this.f2669e.write(str, i2, length - i2);
        }
        this.f2669e.write(34);
    }

    private void K() {
        if (this.l != null) {
            b();
            E(this.l);
            this.l = null;
        }
    }

    private void b() {
        int x = x();
        if (x == 5) {
            this.f2669e.write(44);
        } else if (x != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        s();
        z(4);
    }

    private void c() {
        int x = x();
        if (x == 1) {
            z(2);
        } else if (x == 2) {
            this.f2669e.append(',');
        } else if (x != 4) {
            if (x != 6) {
                if (x != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.f2674j) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            z(7);
            return;
        } else {
            this.f2669e.append((CharSequence) this.f2673i);
            z(5);
            return;
        }
        s();
    }

    private c h(int i2, int i3, char c) {
        int x = x();
        if (x != i3 && x != i2) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.l == null) {
            this.f2671g--;
            if (x == i3) {
                s();
            }
            this.f2669e.write(c);
            return this;
        } else {
            throw new IllegalStateException("Dangling name: " + this.l);
        }
    }

    private void s() {
        if (this.f2672h != null) {
            this.f2669e.write(10);
            int i2 = this.f2671g;
            for (int i3 = 1; i3 < i2; i3++) {
                this.f2669e.write(this.f2672h);
            }
        }
    }

    private c w(int i2, char c) {
        c();
        y(i2);
        this.f2669e.write(c);
        return this;
    }

    private int x() {
        int i2 = this.f2671g;
        if (i2 != 0) {
            return this.f2670f[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void y(int i2) {
        int i3 = this.f2671g;
        int[] iArr = this.f2670f;
        if (i3 == iArr.length) {
            this.f2670f = Arrays.copyOf(iArr, i3 * 2);
        }
        int[] iArr2 = this.f2670f;
        int i4 = this.f2671g;
        this.f2671g = i4 + 1;
        iArr2[i4] = i2;
    }

    private void z(int i2) {
        this.f2670f[this.f2671g - 1] = i2;
    }

    public final void A(boolean z) {
        this.f2675k = z;
    }

    public final void B(String str) {
        String str2;
        if (str.length() == 0) {
            this.f2672h = null;
            str2 = ":";
        } else {
            this.f2672h = str;
            str2 = ": ";
        }
        this.f2673i = str2;
    }

    public final void C(boolean z) {
        this.f2674j = z;
    }

    public final void D(boolean z) {
        this.m = z;
    }

    public c F(long j2) {
        K();
        c();
        this.f2669e.write(Long.toString(j2));
        return this;
    }

    public c G(Boolean bool) {
        if (bool == null) {
            return t();
        }
        K();
        c();
        this.f2669e.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c H(Number number) {
        if (number == null) {
            return t();
        }
        K();
        String obj = number.toString();
        if (this.f2674j || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            c();
            this.f2669e.append((CharSequence) obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public c I(String str) {
        if (str == null) {
            return t();
        }
        K();
        c();
        E(str);
        return this;
    }

    public c J(boolean z) {
        K();
        c();
        this.f2669e.write(z ? "true" : "false");
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f2669e.close();
        int i2 = this.f2671g;
        if (i2 > 1 || (i2 == 1 && this.f2670f[i2 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f2671g = 0;
    }

    public c d() {
        K();
        w(1, '[');
        return this;
    }

    public c f() {
        K();
        w(3, '{');
        return this;
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f2671g != 0) {
            this.f2669e.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public c i() {
        h(1, 2, ']');
        return this;
    }

    public c l() {
        h(3, 5, '}');
        return this;
    }

    public final boolean n() {
        return this.m;
    }

    public final boolean o() {
        return this.f2675k;
    }

    public boolean q() {
        return this.f2674j;
    }

    public c r(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.l != null) {
            throw new IllegalStateException();
        } else if (this.f2671g != 0) {
            this.l = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    public c t() {
        if (this.l != null) {
            if (this.m) {
                K();
            } else {
                this.l = null;
                return this;
            }
        }
        c();
        this.f2669e.write("null");
        return this;
    }
}

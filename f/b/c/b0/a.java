package f.b.c.b0;

import f.b.c.z.f;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public class a implements Closeable {

    /* renamed from: e  reason: collision with root package name */
    private final Reader f2655e;
    private long m;
    private int n;
    private String o;
    private int[] p;
    private int q;

    /* renamed from: f  reason: collision with root package name */
    private boolean f2656f = false;

    /* renamed from: g  reason: collision with root package name */
    private final char[] f2657g = new char[1024];

    /* renamed from: h  reason: collision with root package name */
    private int f2658h = 0;

    /* renamed from: i  reason: collision with root package name */
    private int f2659i = 0;

    /* renamed from: j  reason: collision with root package name */
    private int f2660j = 0;

    /* renamed from: k  reason: collision with root package name */
    private int f2661k = 0;
    int l = 0;
    private String[] r = new String[32];
    private int[] s = new int[32];

    /* renamed from: f.b.c.b0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0103a extends f {
        C0103a() {
        }

        @Override // f.b.c.z.f
        public void a(a aVar) {
            int i2;
            if (aVar instanceof f.b.c.z.n.f) {
                ((f.b.c.z.n.f) aVar).W();
                return;
            }
            int i3 = aVar.l;
            if (i3 == 0) {
                i3 = aVar.h();
            }
            if (i3 == 13) {
                i2 = 9;
            } else if (i3 == 12) {
                i2 = 8;
            } else if (i3 == 14) {
                i2 = 10;
            } else {
                throw new IllegalStateException("Expected a name but was " + aVar.G() + aVar.t());
            }
            aVar.l = i2;
        }
    }

    static {
        f.a = new C0103a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.p = iArr;
        this.q = 0;
        this.q = 0 + 1;
        iArr[0] = 6;
        Objects.requireNonNull(reader, "in == null");
        this.f2655e = reader;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
        if (r1 != '/') goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
        r7.f2658h = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
        if (r4 != r2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
        r7.f2658h = r4 - 1;
        r2 = n(2);
        r7.f2658h++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
        if (r2 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
        d();
        r2 = r7.f2658h;
        r3 = r0[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
        if (r3 == '*') goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
        if (r3 == '/') goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0078, code lost:
        r7.f2658h = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
        r7.f2658h = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
        if (N("*\/") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0091, code lost:
        R("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0097, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0098, code lost:
        r7.f2658h = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009c, code lost:
        if (r1 != '#') goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009e, code lost:
        d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a2, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int B(boolean z) {
        char[] cArr = this.f2657g;
        while (true) {
            int i2 = this.f2658h;
            while (true) {
                int i3 = this.f2659i;
                while (true) {
                    if (i2 == i3) {
                        this.f2658h = i2;
                        if (n(1)) {
                            i2 = this.f2658h;
                            i3 = this.f2659i;
                        } else if (!z) {
                            return -1;
                        } else {
                            throw new EOFException("End of input" + t());
                        }
                    }
                    int i4 = i2 + 1;
                    char c = cArr[i2];
                    if (c != '\n') {
                        if (!(c == ' ' || c == '\r' || c == '\t')) {
                            break;
                        }
                    } else {
                        this.f2660j++;
                        this.f2661k = i4;
                    }
                    i2 = i4;
                }
                i2 = this.f2658h + 2;
            }
            O();
        }
    }

    private String D(char c) {
        char[] cArr = this.f2657g;
        StringBuilder sb = null;
        while (true) {
            int i2 = this.f2658h;
            int i3 = this.f2659i;
            while (true) {
                if (i2 < i3) {
                    int i4 = i2 + 1;
                    char c2 = cArr[i2];
                    if (c2 == c) {
                        this.f2658h = i4;
                        int i5 = (i4 - i2) - 1;
                        if (sb == null) {
                            return new String(cArr, i2, i5);
                        }
                        sb.append(cArr, i2, i5);
                        return sb.toString();
                    } else if (c2 == '\\') {
                        this.f2658h = i4;
                        int i6 = (i4 - i2) - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max((i6 + 1) * 2, 16));
                        }
                        sb.append(cArr, i2, i6);
                        sb.append(K());
                    } else {
                        if (c2 == '\n') {
                            this.f2660j++;
                            this.f2661k = i4;
                        }
                        i2 = i4;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i2 - i2) * 2, 16));
                    }
                    sb.append(cArr, i2, i2 - i2);
                    this.f2658h = i2;
                    if (!n(1)) {
                        R("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
        d();
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String F() {
        String str;
        int i2 = 0;
        StringBuilder sb = null;
        do {
            int i3 = 0;
            while (true) {
                int i4 = this.f2658h;
                if (i4 + i3 < this.f2659i) {
                    char c = this.f2657g[i4 + i3];
                    if (!(c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ')) {
                        if (c != '#') {
                            if (c != ',') {
                                if (!(c == '/' || c == '=')) {
                                    if (!(c == '{' || c == '}' || c == ':')) {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i3++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i3 >= this.f2657g.length) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i3, 16));
                    }
                    sb.append(this.f2657g, this.f2658h, i3);
                    this.f2658h += i3;
                } else if (n(i3 + 1)) {
                }
            }
            i2 = i3;
            if (sb != null) {
                str = new String(this.f2657g, this.f2658h, i2);
            } else {
                sb.append(this.f2657g, this.f2658h, i2);
                str = sb.toString();
            }
            this.f2658h += i2;
            return str;
        } while (n(1));
        if (sb != null) {
        }
        this.f2658h += i2;
        return str;
    }

    private int H() {
        String str;
        String str2;
        int i2;
        char c = this.f2657g[this.f2658h];
        if (c == 't' || c == 'T') {
            i2 = 5;
            str2 = "true";
            str = "TRUE";
        } else if (c == 'f' || c == 'F') {
            i2 = 6;
            str2 = "false";
            str = "FALSE";
        } else if (c != 'n' && c != 'N') {
            return 0;
        } else {
            i2 = 7;
            str2 = "null";
            str = "NULL";
        }
        int length = str2.length();
        for (int i3 = 1; i3 < length; i3++) {
            if (this.f2658h + i3 >= this.f2659i && !n(i3 + 1)) {
                return 0;
            }
            char c2 = this.f2657g[this.f2658h + i3];
            if (!(c2 == str2.charAt(i3) || c2 == str.charAt(i3))) {
                return 0;
            }
        }
        if ((this.f2658h + length < this.f2659i || n(length + 1)) && s(this.f2657g[this.f2658h + length])) {
            return 0;
        }
        this.f2658h += length;
        this.l = i2;
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0095, code lost:
        if (s(r14) != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0097, code lost:
        if (r9 != 2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0099, code lost:
        if (r10 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x009f, code lost:
        if (r11 != Long.MIN_VALUE) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a1, code lost:
        if (r13 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a7, code lost:
        if (r11 != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a9, code lost:
        if (r13 != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ab, code lost:
        if (r13 == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ae, code lost:
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00af, code lost:
        r18.m = r11;
        r18.f2658h += r8;
        r1 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b8, code lost:
        r18.l = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ba, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00bb, code lost:
        if (r9 == 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00be, code lost:
        if (r9 == 4) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00c1, code lost:
        if (r9 != 7) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c4, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c6, code lost:
        r18.n = r8;
        r1 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00cb, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int I() {
        char[] cArr = this.f2657g;
        int i2 = this.f2658h;
        int i3 = this.f2659i;
        int i4 = 0;
        int i5 = 0;
        char c = 0;
        boolean z = true;
        long j2 = 0;
        boolean z2 = false;
        while (true) {
            if (i2 + i5 == i3) {
                if (i5 == cArr.length) {
                    return i4;
                }
                if (!n(i5 + 1)) {
                    break;
                }
                i2 = this.f2658h;
                i3 = this.f2659i;
            }
            char c2 = cArr[i2 + i5];
            if (c2 != '+') {
                if (c2 == 'E' || c2 == 'e') {
                    i4 = 0;
                    if (c != 2 && c != 4) {
                        return 0;
                    }
                    c = 5;
                } else if (c2 == '-') {
                    i4 = 0;
                    if (c == 0) {
                        c = 1;
                        z2 = true;
                    } else if (c != 5) {
                        return 0;
                    }
                } else if (c2 == '.') {
                    i4 = 0;
                    if (c != 2) {
                        return 0;
                    }
                    c = 3;
                } else if (c2 < '0' || c2 > '9') {
                    break;
                } else if (c == 1 || c == 0) {
                    j2 = -(c2 - '0');
                    i4 = 0;
                    c = 2;
                } else {
                    if (c == 2) {
                        if (j2 == 0) {
                            return 0;
                        }
                        long j3 = (10 * j2) - (c2 - '0');
                        int i6 = (j2 > (-922337203685477580L) ? 1 : (j2 == (-922337203685477580L) ? 0 : -1));
                        z &= i6 > 0 || (i6 == 0 && j3 < j2);
                        j2 = j3;
                    } else if (c == 3) {
                        i4 = 0;
                        c = 4;
                    } else if (c == 5 || c == 6) {
                        i4 = 0;
                        c = 7;
                    }
                    i4 = 0;
                }
                i5++;
            } else {
                i4 = 0;
                if (c != 5) {
                    return 0;
                }
            }
            c = 6;
            i5++;
        }
    }

    private void J(int i2) {
        int i3 = this.q;
        int[] iArr = this.p;
        if (i3 == iArr.length) {
            int i4 = i3 * 2;
            this.p = Arrays.copyOf(iArr, i4);
            this.s = Arrays.copyOf(this.s, i4);
            this.r = (String[]) Arrays.copyOf(this.r, i4);
        }
        int[] iArr2 = this.p;
        int i5 = this.q;
        this.q = i5 + 1;
        iArr2[i5] = i2;
    }

    private char K() {
        int i2;
        int i3;
        if (this.f2658h != this.f2659i || n(1)) {
            char[] cArr = this.f2657g;
            int i4 = this.f2658h;
            int i5 = i4 + 1;
            this.f2658h = i5;
            char c = cArr[i4];
            if (c == '\n') {
                this.f2660j++;
                this.f2661k = i5;
            } else if (!(c == '\"' || c == '\'' || c == '/' || c == '\\')) {
                if (c == 'b') {
                    return '\b';
                }
                if (c == 'f') {
                    return '\f';
                }
                if (c == 'n') {
                    return '\n';
                }
                if (c == 'r') {
                    return '\r';
                }
                if (c == 't') {
                    return '\t';
                }
                if (c != 'u') {
                    R("Invalid escape sequence");
                    throw null;
                } else if (i5 + 4 <= this.f2659i || n(4)) {
                    char c2 = 0;
                    int i6 = this.f2658h;
                    int i7 = i6 + 4;
                    while (i6 < i7) {
                        char c3 = this.f2657g[i6];
                        char c4 = (char) (c2 << 4);
                        if (c3 < '0' || c3 > '9') {
                            if (c3 >= 'a' && c3 <= 'f') {
                                i2 = c3 - 'a';
                            } else if (c3 < 'A' || c3 > 'F') {
                                throw new NumberFormatException("\\u" + new String(this.f2657g, this.f2658h, 4));
                            } else {
                                i2 = c3 - 'A';
                            }
                            i3 = i2 + 10;
                        } else {
                            i3 = c3 - '0';
                        }
                        c2 = (char) (c4 + i3);
                        i6++;
                    }
                    this.f2658h += 4;
                    return c2;
                } else {
                    R("Unterminated escape sequence");
                    throw null;
                }
            }
            return c;
        }
        R("Unterminated escape sequence");
        throw null;
    }

    private void M(char c) {
        char[] cArr = this.f2657g;
        while (true) {
            int i2 = this.f2658h;
            int i3 = this.f2659i;
            while (true) {
                if (i2 < i3) {
                    int i4 = i2 + 1;
                    char c2 = cArr[i2];
                    if (c2 == c) {
                        this.f2658h = i4;
                        return;
                    } else if (c2 == '\\') {
                        this.f2658h = i4;
                        K();
                        break;
                    } else {
                        if (c2 == '\n') {
                            this.f2660j++;
                            this.f2661k = i4;
                        }
                        i2 = i4;
                    }
                } else {
                    this.f2658h = i2;
                    if (!n(1)) {
                        R("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    private boolean N(String str) {
        int length = str.length();
        while (true) {
            if (this.f2658h + length > this.f2659i && !n(length)) {
                return false;
            }
            char[] cArr = this.f2657g;
            int i2 = this.f2658h;
            if (cArr[i2] == '\n') {
                this.f2660j++;
                this.f2661k = i2 + 1;
            } else {
                for (int i3 = 0; i3 < length; i3++) {
                    if (this.f2657g[this.f2658h + i3] != str.charAt(i3)) {
                        break;
                    }
                }
                return true;
            }
            this.f2658h++;
        }
    }

    private void O() {
        char c;
        do {
            if (this.f2658h < this.f2659i || n(1)) {
                char[] cArr = this.f2657g;
                int i2 = this.f2658h;
                int i3 = i2 + 1;
                this.f2658h = i3;
                c = cArr[i2];
                if (c == '\n') {
                    this.f2660j++;
                    this.f2661k = i3;
                    return;
                }
            } else {
                return;
            }
        } while (c != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
        d();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void P() {
        do {
            int i2 = 0;
            while (true) {
                int i3 = this.f2658h;
                if (i3 + i2 < this.f2659i) {
                    char c = this.f2657g[i3 + i2];
                    if (!(c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ')) {
                        if (c != '#') {
                            if (c != ',') {
                                if (!(c == '/' || c == '=')) {
                                    if (!(c == '{' || c == '}' || c == ':')) {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i2++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    this.f2658h = i3 + i2;
                }
            }
            this.f2658h += i2;
            return;
        } while (n(1));
    }

    private IOException R(String str) {
        throw new d(str + t());
    }

    private void d() {
        if (!this.f2656f) {
            R("Use JsonReader.setLenient(true) to accept malformed JSON");
            throw null;
        }
    }

    private void f() {
        B(true);
        int i2 = this.f2658h - 1;
        this.f2658h = i2;
        if (i2 + 5 <= this.f2659i || n(5)) {
            char[] cArr = this.f2657g;
            if (cArr[i2] == ')' && cArr[i2 + 1] == ']' && cArr[i2 + 2] == '}' && cArr[i2 + 3] == '\'' && cArr[i2 + 4] == '\n') {
                this.f2658h += 5;
            }
        }
    }

    private boolean n(int i2) {
        int i3;
        int i4;
        char[] cArr = this.f2657g;
        int i5 = this.f2661k;
        int i6 = this.f2658h;
        this.f2661k = i5 - i6;
        int i7 = this.f2659i;
        if (i7 != i6) {
            int i8 = i7 - i6;
            this.f2659i = i8;
            System.arraycopy(cArr, i6, cArr, 0, i8);
        } else {
            this.f2659i = 0;
        }
        this.f2658h = 0;
        do {
            Reader reader = this.f2655e;
            int i9 = this.f2659i;
            int read = reader.read(cArr, i9, cArr.length - i9);
            if (read == -1) {
                return false;
            }
            i3 = this.f2659i + read;
            this.f2659i = i3;
            if (this.f2660j == 0 && (i4 = this.f2661k) == 0 && i3 > 0 && cArr[0] == 65279) {
                this.f2658h++;
                this.f2661k = i4 + 1;
                i2++;
                continue;
            }
        } while (i3 < i2);
        return true;
    }

    private boolean s(char c) {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (!(c == '/' || c == '=')) {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        d();
        return false;
    }

    public String A() {
        String str;
        char c;
        int i2 = this.l;
        if (i2 == 0) {
            i2 = h();
        }
        if (i2 == 14) {
            str = F();
        } else {
            if (i2 == 12) {
                c = '\'';
            } else if (i2 == 13) {
                c = '\"';
            } else {
                throw new IllegalStateException("Expected a name but was " + G() + t());
            }
            str = D(c);
        }
        this.l = 0;
        this.r[this.q - 1] = str;
        return str;
    }

    public void C() {
        int i2 = this.l;
        if (i2 == 0) {
            i2 = h();
        }
        if (i2 == 7) {
            this.l = 0;
            int[] iArr = this.s;
            int i3 = this.q - 1;
            iArr[i3] = iArr[i3] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + G() + t());
    }

    public String E() {
        String str;
        char c;
        int i2 = this.l;
        if (i2 == 0) {
            i2 = h();
        }
        if (i2 == 10) {
            str = F();
        } else {
            if (i2 == 8) {
                c = '\'';
            } else if (i2 == 9) {
                c = '\"';
            } else if (i2 == 11) {
                str = this.o;
                this.o = null;
            } else if (i2 == 15) {
                str = Long.toString(this.m);
            } else if (i2 == 16) {
                str = new String(this.f2657g, this.f2658h, this.n);
                this.f2658h += this.n;
            } else {
                throw new IllegalStateException("Expected a string but was " + G() + t());
            }
            str = D(c);
        }
        this.l = 0;
        int[] iArr = this.s;
        int i3 = this.q - 1;
        iArr[i3] = iArr[i3] + 1;
        return str;
    }

    public b G() {
        int i2 = this.l;
        if (i2 == 0) {
            i2 = h();
        }
        switch (i2) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final void L(boolean z) {
        this.f2656f = z;
    }

    public void Q() {
        char c;
        int i2 = 0;
        do {
            int i3 = this.l;
            if (i3 == 0) {
                i3 = h();
            }
            if (i3 == 3) {
                J(1);
            } else if (i3 == 1) {
                J(3);
            } else {
                if (i3 == 4 || i3 == 2) {
                    this.q--;
                    i2--;
                } else if (i3 == 14 || i3 == 10) {
                    P();
                } else {
                    if (i3 == 8 || i3 == 12) {
                        c = '\'';
                    } else if (i3 == 9 || i3 == 13) {
                        c = '\"';
                    } else if (i3 == 16) {
                        this.f2658h += this.n;
                    }
                    M(c);
                }
                this.l = 0;
            }
            i2++;
            this.l = 0;
        } while (i2 != 0);
        int[] iArr = this.s;
        int i4 = this.q;
        int i5 = i4 - 1;
        iArr[i5] = iArr[i5] + 1;
        this.r[i4 - 1] = "null";
    }

    public void b() {
        int i2 = this.l;
        if (i2 == 0) {
            i2 = h();
        }
        if (i2 == 3) {
            J(1);
            this.s[this.q - 1] = 0;
            this.l = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + G() + t());
    }

    public void c() {
        int i2 = this.l;
        if (i2 == 0) {
            i2 = h();
        }
        if (i2 == 1) {
            J(3);
            this.l = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + G() + t());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.l = 0;
        this.p[0] = 8;
        this.q = 1;
        this.f2655e.close();
    }

    int h() {
        int i2;
        int B;
        int[] iArr = this.p;
        int i3 = this.q;
        int i4 = iArr[i3 - 1];
        if (i4 == 1) {
            iArr[i3 - 1] = 2;
        } else if (i4 == 2) {
            int B2 = B(true);
            if (B2 != 44) {
                if (B2 == 59) {
                    d();
                } else if (B2 == 93) {
                    this.l = 4;
                    return 4;
                } else {
                    R("Unterminated array");
                    throw null;
                }
            }
        } else {
            if (i4 == 3 || i4 == 5) {
                iArr[i3 - 1] = 4;
                if (i4 == 5 && (B = B(true)) != 44) {
                    if (B != 59) {
                        if (B != 125) {
                            R("Unterminated object");
                            throw null;
                        }
                        i2 = 2;
                    } else {
                        d();
                    }
                }
                int B3 = B(true);
                if (B3 == 34) {
                    i2 = 13;
                } else if (B3 == 39) {
                    d();
                    i2 = 12;
                } else if (B3 != 125) {
                    d();
                    this.f2658h--;
                    if (s((char) B3)) {
                        i2 = 14;
                    } else {
                        R("Expected name");
                        throw null;
                    }
                } else {
                    if (i4 == 5) {
                        R("Expected name");
                        throw null;
                    }
                    i2 = 2;
                }
            } else if (i4 == 4) {
                iArr[i3 - 1] = 5;
                int B4 = B(true);
                if (B4 != 58) {
                    if (B4 == 61) {
                        d();
                        if (this.f2658h < this.f2659i || n(1)) {
                            char[] cArr = this.f2657g;
                            int i5 = this.f2658h;
                            if (cArr[i5] == '>') {
                                this.f2658h = i5 + 1;
                            }
                        }
                    } else {
                        R("Expected ':'");
                        throw null;
                    }
                }
            } else if (i4 == 6) {
                if (this.f2656f) {
                    f();
                }
                this.p[this.q - 1] = 7;
            } else if (i4 == 7) {
                if (B(false) == -1) {
                    i2 = 17;
                } else {
                    d();
                    this.f2658h--;
                }
            } else if (i4 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
            this.l = i2;
            return i2;
        }
        int B5 = B(true);
        if (B5 == 34) {
            i2 = 9;
        } else if (B5 != 39) {
            if (!(B5 == 44 || B5 == 59)) {
                if (B5 == 91) {
                    this.l = 3;
                    return 3;
                } else if (B5 != 93) {
                    if (B5 != 123) {
                        this.f2658h--;
                        int H = H();
                        if (H != 0) {
                            return H;
                        }
                        int I = I();
                        if (I != 0) {
                            return I;
                        }
                        if (s(this.f2657g[this.f2658h])) {
                            d();
                            i2 = 10;
                        } else {
                            R("Expected value");
                            throw null;
                        }
                    } else {
                        this.l = 1;
                        return 1;
                    }
                } else if (i4 == 1) {
                    this.l = 4;
                    return 4;
                }
            }
            if (i4 == 1 || i4 == 2) {
                d();
                this.f2658h--;
                this.l = 7;
                return 7;
            }
            R("Unexpected value");
            throw null;
        } else {
            d();
            this.l = 8;
            return 8;
        }
        this.l = i2;
        return i2;
    }

    public void i() {
        int i2 = this.l;
        if (i2 == 0) {
            i2 = h();
        }
        if (i2 == 4) {
            int i3 = this.q - 1;
            this.q = i3;
            int[] iArr = this.s;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.l = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + G() + t());
    }

    public void l() {
        int i2 = this.l;
        if (i2 == 0) {
            i2 = h();
        }
        if (i2 == 2) {
            int i3 = this.q - 1;
            this.q = i3;
            this.r[i3] = null;
            int[] iArr = this.s;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.l = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + G() + t());
    }

    public String o() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i2 = this.q;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = this.p[i3];
            if (i4 == 1 || i4 == 2) {
                sb.append('[');
                sb.append(this.s[i3]);
                sb.append(']');
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                sb.append('.');
                String[] strArr = this.r;
                if (strArr[i3] != null) {
                    sb.append(strArr[i3]);
                }
            }
        }
        return sb.toString();
    }

    public boolean q() {
        int i2 = this.l;
        if (i2 == 0) {
            i2 = h();
        }
        return (i2 == 2 || i2 == 4) ? false : true;
    }

    public final boolean r() {
        return this.f2656f;
    }

    String t() {
        return " at line " + (this.f2660j + 1) + " column " + ((this.f2658h - this.f2661k) + 1) + " path " + o();
    }

    public String toString() {
        return getClass().getSimpleName() + t();
    }

    public boolean w() {
        int i2 = this.l;
        if (i2 == 0) {
            i2 = h();
        }
        if (i2 == 5) {
            this.l = 0;
            int[] iArr = this.s;
            int i3 = this.q - 1;
            iArr[i3] = iArr[i3] + 1;
            return true;
        } else if (i2 == 6) {
            this.l = 0;
            int[] iArr2 = this.s;
            int i4 = this.q - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + G() + t());
        }
    }

    public double x() {
        String str;
        int i2 = this.l;
        if (i2 == 0) {
            i2 = h();
        }
        if (i2 == 15) {
            this.l = 0;
            int[] iArr = this.s;
            int i3 = this.q - 1;
            iArr[i3] = iArr[i3] + 1;
            return this.m;
        }
        if (i2 == 16) {
            this.o = new String(this.f2657g, this.f2658h, this.n);
            this.f2658h += this.n;
        } else {
            if (i2 == 8 || i2 == 9) {
                str = D(i2 == 8 ? '\'' : '\"');
            } else if (i2 == 10) {
                str = F();
            } else if (i2 != 11) {
                throw new IllegalStateException("Expected a double but was " + G() + t());
            }
            this.o = str;
        }
        this.l = 11;
        double parseDouble = Double.parseDouble(this.o);
        if (this.f2656f || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.o = null;
            this.l = 0;
            int[] iArr2 = this.s;
            int i4 = this.q - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return parseDouble;
        }
        throw new d("JSON forbids NaN and infinities: " + parseDouble + t());
    }

    public int y() {
        String D;
        int i2 = this.l;
        if (i2 == 0) {
            i2 = h();
        }
        if (i2 == 15) {
            long j2 = this.m;
            int i3 = (int) j2;
            if (j2 == i3) {
                this.l = 0;
                int[] iArr = this.s;
                int i4 = this.q - 1;
                iArr[i4] = iArr[i4] + 1;
                return i3;
            }
            throw new NumberFormatException("Expected an int but was " + this.m + t());
        }
        if (i2 == 16) {
            this.o = new String(this.f2657g, this.f2658h, this.n);
            this.f2658h += this.n;
        } else if (i2 == 8 || i2 == 9 || i2 == 10) {
            if (i2 == 10) {
                D = F();
            } else {
                D = D(i2 == 8 ? '\'' : '\"');
            }
            this.o = D;
            try {
                int parseInt = Integer.parseInt(this.o);
                this.l = 0;
                int[] iArr2 = this.s;
                int i5 = this.q - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected an int but was " + G() + t());
        }
        this.l = 11;
        double parseDouble = Double.parseDouble(this.o);
        int i6 = (int) parseDouble;
        if (i6 == parseDouble) {
            this.o = null;
            this.l = 0;
            int[] iArr3 = this.s;
            int i7 = this.q - 1;
            iArr3[i7] = iArr3[i7] + 1;
            return i6;
        }
        throw new NumberFormatException("Expected an int but was " + this.o + t());
    }

    public long z() {
        String D;
        int i2 = this.l;
        if (i2 == 0) {
            i2 = h();
        }
        if (i2 == 15) {
            this.l = 0;
            int[] iArr = this.s;
            int i3 = this.q - 1;
            iArr[i3] = iArr[i3] + 1;
            return this.m;
        }
        if (i2 == 16) {
            this.o = new String(this.f2657g, this.f2658h, this.n);
            this.f2658h += this.n;
        } else if (i2 == 8 || i2 == 9 || i2 == 10) {
            if (i2 == 10) {
                D = F();
            } else {
                D = D(i2 == 8 ? '\'' : '\"');
            }
            this.o = D;
            try {
                long parseLong = Long.parseLong(this.o);
                this.l = 0;
                int[] iArr2 = this.s;
                int i4 = this.q - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected a long but was " + G() + t());
        }
        this.l = 11;
        double parseDouble = Double.parseDouble(this.o);
        long j2 = (long) parseDouble;
        if (j2 == parseDouble) {
            this.o = null;
            this.l = 0;
            int[] iArr3 = this.s;
            int i5 = this.q - 1;
            iArr3[i5] = iArr3[i5] + 1;
            return j2;
        }
        throw new NumberFormatException("Expected a long but was " + this.o + t());
    }
}

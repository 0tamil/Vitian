package e.d.n;

import android.text.SpannableStringBuilder;
import java.util.Locale;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    static final d f2096d;

    /* renamed from: e  reason: collision with root package name */
    private static final String f2097e = Character.toString(8206);

    /* renamed from: f  reason: collision with root package name */
    private static final String f2098f = Character.toString(8207);

    /* renamed from: g  reason: collision with root package name */
    static final a f2099g;

    /* renamed from: h  reason: collision with root package name */
    static final a f2100h;
    private final boolean a;
    private final int b;
    private final d c;

    /* renamed from: e.d.n.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0070a {
        private boolean a;
        private int b;
        private d c;

        public C0070a() {
            c(a.e(Locale.getDefault()));
        }

        private static a b(boolean z) {
            return z ? a.f2100h : a.f2099g;
        }

        private void c(boolean z) {
            this.a = z;
            this.c = a.f2096d;
            this.b = 2;
        }

        public a a() {
            return (this.b == 2 && this.c == a.f2096d) ? b(this.a) : new a(this.a, this.b, this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: f  reason: collision with root package name */
        private static final byte[] f2101f = new byte[1792];
        private final CharSequence a;
        private final boolean b;
        private final int c;

        /* renamed from: d  reason: collision with root package name */
        private int f2102d;

        /* renamed from: e  reason: collision with root package name */
        private char f2103e;

        static {
            for (int i2 = 0; i2 < 1792; i2++) {
                f2101f[i2] = Character.getDirectionality(i2);
            }
        }

        b(CharSequence charSequence, boolean z) {
            this.a = charSequence;
            this.b = z;
            this.c = charSequence.length();
        }

        private static byte c(char c) {
            return c < 1792 ? f2101f[c] : Character.getDirectionality(c);
        }

        private byte f() {
            char charAt;
            int i2 = this.f2102d;
            do {
                int i3 = this.f2102d;
                if (i3 <= 0) {
                    break;
                }
                CharSequence charSequence = this.a;
                int i4 = i3 - 1;
                this.f2102d = i4;
                charAt = charSequence.charAt(i4);
                this.f2103e = charAt;
                if (charAt == '&') {
                    return (byte) 12;
                }
            } while (charAt != ';');
            this.f2102d = i2;
            this.f2103e = ';';
            return (byte) 13;
        }

        private byte g() {
            char charAt;
            do {
                int i2 = this.f2102d;
                if (i2 >= this.c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.a;
                this.f2102d = i2 + 1;
                charAt = charSequence.charAt(i2);
                this.f2103e = charAt;
            } while (charAt != ';');
            return (byte) 12;
        }

        private byte h() {
            char charAt;
            int i2 = this.f2102d;
            while (true) {
                int i3 = this.f2102d;
                if (i3 <= 0) {
                    break;
                }
                CharSequence charSequence = this.a;
                int i4 = i3 - 1;
                this.f2102d = i4;
                char charAt2 = charSequence.charAt(i4);
                this.f2103e = charAt2;
                if (charAt2 == '<') {
                    return (byte) 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i5 = this.f2102d;
                        if (i5 > 0) {
                            CharSequence charSequence2 = this.a;
                            int i6 = i5 - 1;
                            this.f2102d = i6;
                            charAt = charSequence2.charAt(i6);
                            this.f2103e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
            this.f2102d = i2;
            this.f2103e = '>';
            return (byte) 13;
        }

        private byte i() {
            char charAt;
            int i2 = this.f2102d;
            while (true) {
                int i3 = this.f2102d;
                if (i3 < this.c) {
                    CharSequence charSequence = this.a;
                    this.f2102d = i3 + 1;
                    char charAt2 = charSequence.charAt(i3);
                    this.f2103e = charAt2;
                    if (charAt2 == '>') {
                        return (byte) 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i4 = this.f2102d;
                            if (i4 < this.c) {
                                CharSequence charSequence2 = this.a;
                                this.f2102d = i4 + 1;
                                charAt = charSequence2.charAt(i4);
                                this.f2103e = charAt;
                            }
                        } while (charAt != charAt2);
                    }
                } else {
                    this.f2102d = i2;
                    this.f2103e = '<';
                    return (byte) 13;
                }
            }
        }

        byte a() {
            char charAt = this.a.charAt(this.f2102d - 1);
            this.f2103e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.a, this.f2102d);
                this.f2102d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f2102d--;
            byte c = c(this.f2103e);
            if (!this.b) {
                return c;
            }
            char c2 = this.f2103e;
            return c2 == '>' ? h() : c2 == ';' ? f() : c;
        }

        byte b() {
            char charAt = this.a.charAt(this.f2102d);
            this.f2103e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.a, this.f2102d);
                this.f2102d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f2102d++;
            byte c = c(this.f2103e);
            if (!this.b) {
                return c;
            }
            char c2 = this.f2103e;
            return c2 == '<' ? i() : c2 == '&' ? g() : c;
        }

        int d() {
            this.f2102d = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (this.f2102d < this.c && i2 == 0) {
                byte b = b();
                if (b != 0) {
                    if (b == 1 || b == 2) {
                        if (i4 == 0) {
                            return 1;
                        }
                    } else if (b != 9) {
                        switch (b) {
                            case 14:
                            case 15:
                                i4++;
                                i3 = -1;
                                break;
                            case 16:
                            case 17:
                                i4++;
                                i3 = 1;
                                break;
                            case 18:
                                i4--;
                                i3 = 0;
                                break;
                        }
                    }
                } else if (i4 == 0) {
                    return -1;
                }
                i2 = i4;
            }
            if (i2 == 0) {
                return 0;
            }
            if (i3 != 0) {
                return i3;
            }
            while (this.f2102d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i2 == i4) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i2 == i4) {
                            return 1;
                        }
                        break;
                    case 18:
                        i4++;
                        continue;
                }
                i4--;
            }
            return 0;
        }

        int e() {
            this.f2102d = this.c;
            int i2 = 0;
            int i3 = 0;
            while (this.f2102d > 0) {
                byte a = a();
                if (a != 0) {
                    if (a == 1 || a == 2) {
                        if (i2 == 0) {
                            return 1;
                        }
                        if (i3 == 0) {
                            i3 = i2;
                        }
                    } else if (a != 9) {
                        switch (a) {
                            case 14:
                            case 15:
                                if (i3 == i2) {
                                    return -1;
                                }
                                i2--;
                                break;
                            case 16:
                            case 17:
                                if (i3 == i2) {
                                    return 1;
                                }
                                i2--;
                                break;
                            case 18:
                                i2++;
                                break;
                            default:
                                if (i3 != 0) {
                                    break;
                                } else {
                                    i3 = i2;
                                    break;
                                }
                        }
                    } else {
                        continue;
                    }
                } else if (i2 == 0) {
                    return -1;
                } else {
                    if (i3 == 0) {
                        i3 = i2;
                    }
                }
            }
            return 0;
        }
    }

    static {
        d dVar = e.c;
        f2096d = dVar;
        f2099g = new a(false, 2, dVar);
        f2100h = new a(true, 2, dVar);
    }

    a(boolean z, int i2, d dVar) {
        this.a = z;
        this.b = i2;
        this.c = dVar;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0070a().a();
    }

    static boolean e(Locale locale) {
        return f.b(locale) == 1;
    }

    private String f(CharSequence charSequence, d dVar) {
        boolean a = dVar.a(charSequence, 0, charSequence.length());
        return (this.a || (!a && b(charSequence) != 1)) ? this.a ? (!a || b(charSequence) == -1) ? f2098f : "" : "" : f2097e;
    }

    private String g(CharSequence charSequence, d dVar) {
        boolean a = dVar.a(charSequence, 0, charSequence.length());
        return (this.a || (!a && a(charSequence) != 1)) ? this.a ? (!a || a(charSequence) == -1) ? f2098f : "" : "" : f2097e;
    }

    public boolean d() {
        return (this.b & 2) != 0;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.c, true);
    }

    public CharSequence i(CharSequence charSequence, d dVar, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean a = dVar.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z) {
            spannableStringBuilder.append((CharSequence) g(charSequence, a ? e.b : e.a));
        }
        if (a != this.a) {
            spannableStringBuilder.append(a ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append((CharSequence) f(charSequence, a ? e.b : e.a));
        }
        return spannableStringBuilder;
    }
}

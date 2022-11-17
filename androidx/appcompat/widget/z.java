package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.content.d.f;
import androidx.core.widget.i;
import e.a.j;
import e.d.p.u;
import java.lang.ref.WeakReference;
import java.util.Locale;
/* loaded from: classes.dex */
class z {
    private final TextView a;
    private v0 b;
    private v0 c;

    /* renamed from: d  reason: collision with root package name */
    private v0 f525d;

    /* renamed from: e  reason: collision with root package name */
    private v0 f526e;

    /* renamed from: f  reason: collision with root package name */
    private v0 f527f;

    /* renamed from: g  reason: collision with root package name */
    private v0 f528g;

    /* renamed from: h  reason: collision with root package name */
    private v0 f529h;

    /* renamed from: i  reason: collision with root package name */
    private final b0 f530i;

    /* renamed from: j  reason: collision with root package name */
    private int f531j = 0;

    /* renamed from: k  reason: collision with root package name */
    private int f532k = -1;
    private Typeface l;
    private boolean m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends f.c {
        final /* synthetic */ int a;
        final /* synthetic */ int b;
        final /* synthetic */ WeakReference c;

        a(int i2, int i3, WeakReference weakReference) {
            this.a = i2;
            this.b = i3;
            this.c = weakReference;
        }

        @Override // androidx.core.content.d.f.c
        public void d(int i2) {
        }

        @Override // androidx.core.content.d.f.c
        public void e(Typeface typeface) {
            int i2;
            if (Build.VERSION.SDK_INT >= 28 && (i2 = this.a) != -1) {
                typeface = Typeface.create(typeface, i2, (this.b & 2) != 0);
            }
            z.this.n(this.c, typeface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TextView f534e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Typeface f535f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f536g;

        b(z zVar, TextView textView, Typeface typeface, int i2) {
            this.f534e = textView;
            this.f535f = typeface;
            this.f536g = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f534e.setTypeface(this.f535f, this.f536g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(TextView textView) {
        this.a = textView;
        this.f530i = new b0(textView);
    }

    private void B(int i2, float f2) {
        this.f530i.y(i2, f2);
    }

    private void C(Context context, x0 x0Var) {
        String n;
        Typeface typeface;
        Typeface typeface2;
        int i2 = Build.VERSION.SDK_INT;
        this.f531j = x0Var.j(j.u2, this.f531j);
        boolean z = false;
        if (i2 >= 28) {
            int j2 = x0Var.j(j.z2, -1);
            this.f532k = j2;
            if (j2 != -1) {
                this.f531j = (this.f531j & 2) | 0;
            }
        }
        int i3 = j.y2;
        if (x0Var.r(i3) || x0Var.r(j.A2)) {
            this.l = null;
            int i4 = j.A2;
            if (x0Var.r(i4)) {
                i3 = i4;
            }
            int i5 = this.f532k;
            int i6 = this.f531j;
            if (!context.isRestricted()) {
                try {
                    Typeface i7 = x0Var.i(i3, this.f531j, new a(i5, i6, new WeakReference(this.a)));
                    if (i7 != null) {
                        if (i2 >= 28 && this.f532k != -1) {
                            i7 = Typeface.create(Typeface.create(i7, 0), this.f532k, (this.f531j & 2) != 0);
                        }
                        this.l = i7;
                    }
                    this.m = this.l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.l == null && (n = x0Var.n(i3)) != null) {
                if (i2 < 28 || this.f532k == -1) {
                    typeface = Typeface.create(n, this.f531j);
                } else {
                    Typeface create = Typeface.create(n, 0);
                    int i8 = this.f532k;
                    if ((this.f531j & 2) != 0) {
                        z = true;
                    }
                    typeface = Typeface.create(create, i8, z);
                }
                this.l = typeface;
                return;
            }
            return;
        }
        int i9 = j.t2;
        if (x0Var.r(i9)) {
            this.m = false;
            int j3 = x0Var.j(i9, 1);
            if (j3 == 1) {
                typeface2 = Typeface.SANS_SERIF;
            } else if (j3 == 2) {
                typeface2 = Typeface.SERIF;
            } else if (j3 == 3) {
                typeface2 = Typeface.MONOSPACE;
            } else {
                return;
            }
            this.l = typeface2;
        }
    }

    private void a(Drawable drawable, v0 v0Var) {
        if (drawable != null && v0Var != null) {
            j.i(drawable, v0Var, this.a.getDrawableState());
        }
    }

    private static v0 d(Context context, j jVar, int i2) {
        ColorStateList f2 = jVar.f(context, i2);
        if (f2 == null) {
            return null;
        }
        v0 v0Var = new v0();
        v0Var.f489d = true;
        v0Var.a = f2;
        return v0Var;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            TextView textView = this.a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
            if (i2 >= 17) {
                Drawable[] compoundDrawablesRelative2 = this.a.getCompoundDrawablesRelative();
                if (!(compoundDrawablesRelative2[0] == null && compoundDrawablesRelative2[2] == null)) {
                    TextView textView2 = this.a;
                    Drawable drawable7 = compoundDrawablesRelative2[0];
                    if (drawable2 == null) {
                        drawable2 = compoundDrawablesRelative2[1];
                    }
                    Drawable drawable8 = compoundDrawablesRelative2[2];
                    if (drawable4 == null) {
                        drawable4 = compoundDrawablesRelative2[3];
                    }
                    textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                    return;
                }
            }
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            TextView textView3 = this.a;
            if (drawable == null) {
                drawable = compoundDrawables[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawables[1];
            }
            if (drawable3 == null) {
                drawable3 = compoundDrawables[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawables[3];
            }
            textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }

    private void z() {
        v0 v0Var = this.f529h;
        this.b = v0Var;
        this.c = v0Var;
        this.f525d = v0Var;
        this.f526e = v0Var;
        this.f527f = v0Var;
        this.f528g = v0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A(int i2, float f2) {
        if (!androidx.core.widget.b.a && !l()) {
            B(i2, f2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        if (!(this.b == null && this.c == null && this.f525d == null && this.f526e == null)) {
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.f525d);
            a(compoundDrawables[3], this.f526e);
        }
        if (Build.VERSION.SDK_INT < 17) {
            return;
        }
        if (this.f527f != null || this.f528g != null) {
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f527f);
            a(compoundDrawablesRelative[2], this.f528g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        this.f530i.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.f530i.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.f530i.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return this.f530i.l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] h() {
        return this.f530i.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i() {
        return this.f530i.n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList j() {
        v0 v0Var = this.f529h;
        if (v0Var != null) {
            return v0Var.a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode k() {
        v0 v0Var = this.f529h;
        if (v0Var != null) {
            return v0Var.b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean l() {
        return this.f530i.s();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c5 A[ADDED_TO_REGION] */
    @SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m(AttributeSet attributeSet, int i2) {
        boolean z;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        boolean z2;
        String str;
        ColorStateList colorStateList3;
        String str2;
        String str3;
        int i3;
        int i4;
        String str4;
        j jVar;
        Typeface typeface;
        x0 t;
        int i5;
        int i6;
        int i7;
        int e2;
        int e3;
        int e4;
        int[] m;
        Context context = this.a.getContext();
        j b2 = j.b();
        int[] iArr = j.V;
        x0 u = x0.u(context, attributeSet, iArr, i2, 0);
        TextView textView = this.a;
        u.I(textView, textView.getContext(), iArr, attributeSet, u.q(), i2, 0);
        int m2 = u.m(j.W, -1);
        int i8 = j.Z;
        if (u.r(i8)) {
            this.b = d(context, b2, u.m(i8, 0));
        }
        int i9 = j.X;
        if (u.r(i9)) {
            this.c = d(context, b2, u.m(i9, 0));
        }
        int i10 = j.a0;
        if (u.r(i10)) {
            this.f525d = d(context, b2, u.m(i10, 0));
        }
        int i11 = j.Y;
        if (u.r(i11)) {
            this.f526e = d(context, b2, u.m(i11, 0));
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 17) {
            int i13 = j.b0;
            if (u.r(i13)) {
                this.f527f = d(context, b2, u.m(i13, 0));
            }
            int i14 = j.c0;
            if (u.r(i14)) {
                this.f528g = d(context, b2, u.m(i14, 0));
            }
        }
        u.v();
        boolean z3 = this.a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (m2 != -1) {
            x0 s = x0.s(context, m2, j.r2);
            if (!z3) {
                int i15 = j.C2;
                if (s.r(i15)) {
                    z2 = s.a(i15, false);
                    z = true;
                    C(context, s);
                    if (i12 >= 23) {
                        int i16 = j.v2;
                        colorStateList3 = s.r(i16) ? s.c(i16) : null;
                        int i17 = j.w2;
                        colorStateList2 = s.r(i17) ? s.c(i17) : null;
                        int i18 = j.x2;
                        if (s.r(i18)) {
                            colorStateList = s.c(i18);
                            int i19 = j.D2;
                            str = s.r(i19) ? s.n(i19) : null;
                            if (i12 >= 26) {
                                int i20 = j.B2;
                                if (s.r(i20)) {
                                    str2 = s.n(i20);
                                    s.v();
                                }
                            }
                            str2 = null;
                            s.v();
                        }
                    } else {
                        colorStateList3 = null;
                        colorStateList2 = null;
                    }
                    colorStateList = null;
                    int i192 = j.D2;
                    if (s.r(i192)) {
                    }
                    if (i12 >= 26) {
                    }
                    str2 = null;
                    s.v();
                }
            }
            z2 = false;
            z = false;
            C(context, s);
            if (i12 >= 23) {
            }
            colorStateList = null;
            int i1922 = j.D2;
            if (s.r(i1922)) {
            }
            if (i12 >= 26) {
            }
            str2 = null;
            s.v();
        } else {
            str2 = null;
            colorStateList3 = null;
            str = null;
            z2 = false;
            colorStateList2 = null;
            colorStateList = null;
            z = false;
        }
        x0 u2 = x0.u(context, attributeSet, j.r2, i2, 0);
        if (!z3) {
            int i21 = j.C2;
            if (u2.r(i21)) {
                str3 = str2;
                z2 = u2.a(i21, false);
                i3 = 23;
                z = true;
                if (i12 < i3) {
                    int i22 = j.v2;
                    if (u2.r(i22)) {
                        colorStateList3 = u2.c(i22);
                    }
                    int i23 = j.w2;
                    if (u2.r(i23)) {
                        colorStateList2 = u2.c(i23);
                    }
                    int i24 = j.x2;
                    if (u2.r(i24)) {
                        colorStateList = u2.c(i24);
                    }
                }
                i4 = j.D2;
                if (u2.r(i4)) {
                    str = u2.n(i4);
                }
                if (i12 >= 26) {
                    int i25 = j.B2;
                    if (u2.r(i25)) {
                        str4 = u2.n(i25);
                        if (i12 >= 28) {
                            int i26 = j.s2;
                            if (u2.r(i26)) {
                                jVar = b2;
                                if (u2.e(i26, -1) == 0) {
                                    this.a.setTextSize(0, 0.0f);
                                }
                                C(context, u2);
                                u2.v();
                                if (colorStateList3 != null) {
                                    this.a.setTextColor(colorStateList3);
                                }
                                if (colorStateList2 != null) {
                                    this.a.setHintTextColor(colorStateList2);
                                }
                                if (colorStateList != null) {
                                    this.a.setLinkTextColor(colorStateList);
                                }
                                if (!z3 && z) {
                                    s(z2);
                                }
                                typeface = this.l;
                                if (typeface != null) {
                                    if (this.f532k == -1) {
                                        this.a.setTypeface(typeface, this.f531j);
                                    } else {
                                        this.a.setTypeface(typeface);
                                    }
                                }
                                if (str4 != null) {
                                    this.a.setFontVariationSettings(str4);
                                }
                                if (str != null) {
                                    if (i12 >= 24) {
                                        this.a.setTextLocales(LocaleList.forLanguageTags(str));
                                    } else if (i12 >= 21) {
                                        this.a.setTextLocale(Locale.forLanguageTag(str.substring(0, str.indexOf(44))));
                                    }
                                }
                                this.f530i.t(attributeSet, i2);
                                if (androidx.core.widget.b.a && this.f530i.n() != 0) {
                                    m = this.f530i.m();
                                    if (m.length > 0) {
                                        if (this.a.getAutoSizeStepGranularity() != -1.0f) {
                                            this.a.setAutoSizeTextTypeUniformWithConfiguration(this.f530i.k(), this.f530i.j(), this.f530i.l(), 0);
                                        } else {
                                            this.a.setAutoSizeTextTypeUniformWithPresetSizes(m, 0);
                                        }
                                    }
                                }
                                t = x0.t(context, attributeSet, j.d0);
                                int m3 = t.m(j.l0, -1);
                                j jVar2 = jVar;
                                Drawable c = m3 == -1 ? jVar2.c(context, m3) : null;
                                int m4 = t.m(j.q0, -1);
                                Drawable c2 = m4 == -1 ? jVar2.c(context, m4) : null;
                                int m5 = t.m(j.m0, -1);
                                Drawable c3 = m5 == -1 ? jVar2.c(context, m5) : null;
                                int m6 = t.m(j.j0, -1);
                                Drawable c4 = m6 == -1 ? jVar2.c(context, m6) : null;
                                int m7 = t.m(j.n0, -1);
                                Drawable c5 = m7 == -1 ? jVar2.c(context, m7) : null;
                                int m8 = t.m(j.k0, -1);
                                y(c, c2, c3, c4, c5, m8 == -1 ? jVar2.c(context, m8) : null);
                                i5 = j.o0;
                                if (t.r(i5)) {
                                    i.f(this.a, t.c(i5));
                                }
                                i6 = j.p0;
                                if (!t.r(i6)) {
                                    i7 = -1;
                                    i.g(this.a, f0.d(t.j(i6, -1), null));
                                } else {
                                    i7 = -1;
                                }
                                e2 = t.e(j.r0, i7);
                                e3 = t.e(j.s0, i7);
                                e4 = t.e(j.t0, i7);
                                t.v();
                                if (e2 != i7) {
                                    i.h(this.a, e2);
                                }
                                if (e3 != i7) {
                                    i.i(this.a, e3);
                                }
                                if (e4 == i7) {
                                    i.j(this.a, e4);
                                    return;
                                }
                                return;
                            }
                        }
                        jVar = b2;
                        C(context, u2);
                        u2.v();
                        if (colorStateList3 != null) {
                        }
                        if (colorStateList2 != null) {
                        }
                        if (colorStateList != null) {
                        }
                        if (!z3) {
                            s(z2);
                        }
                        typeface = this.l;
                        if (typeface != null) {
                        }
                        if (str4 != null) {
                        }
                        if (str != null) {
                        }
                        this.f530i.t(attributeSet, i2);
                        if (androidx.core.widget.b.a) {
                            m = this.f530i.m();
                            if (m.length > 0) {
                            }
                        }
                        t = x0.t(context, attributeSet, j.d0);
                        int m32 = t.m(j.l0, -1);
                        j jVar22 = jVar;
                        if (m32 == -1) {
                        }
                        int m42 = t.m(j.q0, -1);
                        if (m42 == -1) {
                        }
                        int m52 = t.m(j.m0, -1);
                        if (m52 == -1) {
                        }
                        int m62 = t.m(j.j0, -1);
                        if (m62 == -1) {
                        }
                        int m72 = t.m(j.n0, -1);
                        if (m72 == -1) {
                        }
                        int m82 = t.m(j.k0, -1);
                        y(c, c2, c3, c4, c5, m82 == -1 ? jVar22.c(context, m82) : null);
                        i5 = j.o0;
                        if (t.r(i5)) {
                        }
                        i6 = j.p0;
                        if (!t.r(i6)) {
                        }
                        e2 = t.e(j.r0, i7);
                        e3 = t.e(j.s0, i7);
                        e4 = t.e(j.t0, i7);
                        t.v();
                        if (e2 != i7) {
                        }
                        if (e3 != i7) {
                        }
                        if (e4 == i7) {
                        }
                    }
                }
                str4 = str3;
                if (i12 >= 28) {
                }
                jVar = b2;
                C(context, u2);
                u2.v();
                if (colorStateList3 != null) {
                }
                if (colorStateList2 != null) {
                }
                if (colorStateList != null) {
                }
                if (!z3) {
                }
                typeface = this.l;
                if (typeface != null) {
                }
                if (str4 != null) {
                }
                if (str != null) {
                }
                this.f530i.t(attributeSet, i2);
                if (androidx.core.widget.b.a) {
                }
                t = x0.t(context, attributeSet, j.d0);
                int m322 = t.m(j.l0, -1);
                j jVar222 = jVar;
                if (m322 == -1) {
                }
                int m422 = t.m(j.q0, -1);
                if (m422 == -1) {
                }
                int m522 = t.m(j.m0, -1);
                if (m522 == -1) {
                }
                int m622 = t.m(j.j0, -1);
                if (m622 == -1) {
                }
                int m722 = t.m(j.n0, -1);
                if (m722 == -1) {
                }
                int m822 = t.m(j.k0, -1);
                y(c, c2, c3, c4, c5, m822 == -1 ? jVar222.c(context, m822) : null);
                i5 = j.o0;
                if (t.r(i5)) {
                }
                i6 = j.p0;
                if (!t.r(i6)) {
                }
                e2 = t.e(j.r0, i7);
                e3 = t.e(j.s0, i7);
                e4 = t.e(j.t0, i7);
                t.v();
                if (e2 != i7) {
                }
                if (e3 != i7) {
                }
                if (e4 == i7) {
                }
            }
        }
        str3 = str2;
        i3 = 23;
        if (i12 < i3) {
        }
        i4 = j.D2;
        if (u2.r(i4)) {
        }
        if (i12 >= 26) {
        }
        str4 = str3;
        if (i12 >= 28) {
        }
        jVar = b2;
        C(context, u2);
        u2.v();
        if (colorStateList3 != null) {
        }
        if (colorStateList2 != null) {
        }
        if (colorStateList != null) {
        }
        if (!z3) {
        }
        typeface = this.l;
        if (typeface != null) {
        }
        if (str4 != null) {
        }
        if (str != null) {
        }
        this.f530i.t(attributeSet, i2);
        if (androidx.core.widget.b.a) {
        }
        t = x0.t(context, attributeSet, j.d0);
        int m3222 = t.m(j.l0, -1);
        j jVar2222 = jVar;
        if (m3222 == -1) {
        }
        int m4222 = t.m(j.q0, -1);
        if (m4222 == -1) {
        }
        int m5222 = t.m(j.m0, -1);
        if (m5222 == -1) {
        }
        int m6222 = t.m(j.j0, -1);
        if (m6222 == -1) {
        }
        int m7222 = t.m(j.n0, -1);
        if (m7222 == -1) {
        }
        int m8222 = t.m(j.k0, -1);
        y(c, c2, c3, c4, c5, m8222 == -1 ? jVar2222.c(context, m8222) : null);
        i5 = j.o0;
        if (t.r(i5)) {
        }
        i6 = j.p0;
        if (!t.r(i6)) {
        }
        e2 = t.e(j.r0, i7);
        e3 = t.e(j.s0, i7);
        e4 = t.e(j.t0, i7);
        t.v();
        if (e2 != i7) {
        }
        if (e3 != i7) {
        }
        if (e4 == i7) {
        }
    }

    void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.m) {
            this.l = typeface;
            TextView textView = weakReference.get();
            if (textView == null) {
                return;
            }
            if (u.x(textView)) {
                textView.post(new b(this, textView, typeface, this.f531j));
            } else {
                textView.setTypeface(typeface, this.f531j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(boolean z, int i2, int i3, int i4, int i5) {
        if (!androidx.core.widget.b.a) {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() {
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(Context context, int i2) {
        String n;
        ColorStateList c;
        ColorStateList c2;
        ColorStateList c3;
        x0 s = x0.s(context, i2, j.r2);
        int i3 = j.C2;
        if (s.r(i3)) {
            s(s.a(i3, false));
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 23) {
            int i5 = j.v2;
            if (s.r(i5) && (c3 = s.c(i5)) != null) {
                this.a.setTextColor(c3);
            }
            int i6 = j.x2;
            if (s.r(i6) && (c2 = s.c(i6)) != null) {
                this.a.setLinkTextColor(c2);
            }
            int i7 = j.w2;
            if (s.r(i7) && (c = s.c(i7)) != null) {
                this.a.setHintTextColor(c);
            }
        }
        int i8 = j.s2;
        if (s.r(i8) && s.e(i8, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        C(context, s);
        if (i4 >= 26) {
            int i9 = j.B2;
            if (s.r(i9) && (n = s.n(i9)) != null) {
                this.a.setFontVariationSettings(n);
            }
        }
        s.v();
        Typeface typeface = this.l;
        if (typeface != null) {
            this.a.setTypeface(typeface, this.f531j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            e.d.p.f0.a.f(editorInfo, textView.getText());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(boolean z) {
        this.a.setAllCaps(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(int i2, int i3, int i4, int i5) {
        this.f530i.u(i2, i3, i4, i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(int[] iArr, int i2) {
        this.f530i.v(iArr, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(int i2) {
        this.f530i.w(i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(ColorStateList colorStateList) {
        if (this.f529h == null) {
            this.f529h = new v0();
        }
        v0 v0Var = this.f529h;
        v0Var.a = colorStateList;
        v0Var.f489d = colorStateList != null;
        z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(PorterDuff.Mode mode) {
        if (this.f529h == null) {
            this.f529h = new v0();
        }
        v0 v0Var = this.f529h;
        v0Var.b = mode;
        v0Var.c = mode != null;
        z();
    }
}

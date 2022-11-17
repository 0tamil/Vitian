package io.flutter.view;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.graphics.Rect;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import io.flutter.embedding.engine.j.b;
import io.flutter.view.c;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public class c extends AccessibilityNodeProvider {
    private final View a;
    private final io.flutter.embedding.engine.j.b b;
    private final AccessibilityManager c;

    /* renamed from: d  reason: collision with root package name */
    private final AccessibilityViewEmbedder f3343d;

    /* renamed from: e  reason: collision with root package name */
    private final h.a.d.d.k f3344e;

    /* renamed from: f  reason: collision with root package name */
    private final ContentResolver f3345f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<Integer, l> f3346g;

    /* renamed from: h  reason: collision with root package name */
    private final Map<Integer, h> f3347h;

    /* renamed from: i  reason: collision with root package name */
    private l f3348i;

    /* renamed from: j  reason: collision with root package name */
    private Integer f3349j;

    /* renamed from: k  reason: collision with root package name */
    private Integer f3350k;
    private int l;
    private l m;
    private l n;
    private l o;
    private final List<Integer> p;
    private int q;
    private Integer r;
    private k s;
    private boolean t;
    private final b.AbstractC0129b u;
    private final AccessibilityManager.AccessibilityStateChangeListener v;
    @TargetApi(19)
    private final AccessibilityManager.TouchExplorationStateChangeListener w;
    private final ContentObserver x;
    private static final int y = ((g.SCROLL_RIGHT.f3362e | g.SCROLL_LEFT.f3362e) | g.SCROLL_UP.f3362e) | g.SCROLL_DOWN.f3362e;
    private static final int z = ((((((((((i.HAS_CHECKED_STATE.f3371e | i.IS_CHECKED.f3371e) | i.IS_SELECTED.f3371e) | i.IS_TEXT_FIELD.f3371e) | i.IS_FOCUSED.f3371e) | i.HAS_ENABLED_STATE.f3371e) | i.IS_ENABLED.f3371e) | i.IS_IN_MUTUALLY_EXCLUSIVE_GROUP.f3371e) | i.HAS_TOGGLED_STATE.f3371e) | i.IS_TOGGLED.f3371e) | i.IS_FOCUSABLE.f3371e) | i.IS_SLIDER.f3371e;
    private static int A = 267386881;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements b.AbstractC0129b {
        a() {
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.a
        public void a(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            for (ByteBuffer byteBuffer2 : byteBufferArr) {
                byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
            }
            c.this.V(byteBuffer, strArr, byteBufferArr);
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.a
        public void b(ByteBuffer byteBuffer, String[] strArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            c.this.U(byteBuffer, strArr);
        }

        @Override // io.flutter.embedding.engine.j.b.AbstractC0129b
        public void c(String str) {
            if (Build.VERSION.SDK_INT < 28) {
                AccessibilityEvent D = c.this.D(0, 32);
                D.getText().add(str);
                c.this.O(D);
            }
        }

        @Override // io.flutter.embedding.engine.j.b.AbstractC0129b
        public void d(int i2) {
            c.this.N(i2, 2);
        }

        @Override // io.flutter.embedding.engine.j.b.AbstractC0129b
        public void e(String str) {
            c.this.a.announceForAccessibility(str);
        }

        @Override // io.flutter.embedding.engine.j.b.AbstractC0129b
        public void f(int i2) {
            c.this.N(i2, 1);
        }
    }

    /* loaded from: classes.dex */
    class b implements AccessibilityManager.AccessibilityStateChangeListener {
        b() {
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean z) {
            if (!c.this.t) {
                io.flutter.embedding.engine.j.b bVar = c.this.b;
                if (z) {
                    bVar.g(c.this.u);
                    c.this.b.e();
                } else {
                    bVar.g(null);
                    c.this.b.d();
                }
                if (c.this.s != null) {
                    c.this.s.a(z, c.this.c.isTouchExplorationEnabled());
                }
            }
        }
    }

    /* renamed from: io.flutter.view.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0137c extends ContentObserver {
        C0137c(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            onChange(z, null);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z, Uri uri) {
            if (!c.this.t) {
                String string = Build.VERSION.SDK_INT < 17 ? null : Settings.Global.getString(c.this.f3345f, "transition_animation_scale");
                if (string != null && string.equals("0")) {
                    c.d(c.this, f.DISABLE_ANIMATIONS.f3355e);
                } else {
                    c.c(c.this, ~f.DISABLE_ANIMATIONS.f3355e);
                }
                c.this.P();
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements AccessibilityManager.TouchExplorationStateChangeListener {
        final /* synthetic */ AccessibilityManager a;

        d(AccessibilityManager accessibilityManager) {
            this.a = accessibilityManager;
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z) {
            if (!c.this.t) {
                c cVar = c.this;
                if (z) {
                    c.d(cVar, f.ACCESSIBLE_NAVIGATION.f3355e);
                } else {
                    cVar.G();
                    c.c(c.this, ~f.ACCESSIBLE_NAVIGATION.f3355e);
                }
                c.this.P();
                if (c.this.s != null) {
                    c.this.s.a(this.a.isEnabled(), z);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class e {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[o.values().length];
            a = iArr;
            try {
                iArr[o.SPELLOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[o.LOCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum f {
        ACCESSIBLE_NAVIGATION(1),
        INVERT_COLORS(2),
        DISABLE_ANIMATIONS(4);
        

        /* renamed from: e  reason: collision with root package name */
        final int f3355e;

        f(int i2) {
            this.f3355e = i2;
        }
    }

    /* loaded from: classes.dex */
    public enum g {
        TAP(1),
        LONG_PRESS(2),
        SCROLL_LEFT(4),
        SCROLL_RIGHT(8),
        SCROLL_UP(16),
        SCROLL_DOWN(32),
        INCREASE(64),
        DECREASE(128),
        SHOW_ON_SCREEN(256),
        MOVE_CURSOR_FORWARD_BY_CHARACTER(512),
        MOVE_CURSOR_BACKWARD_BY_CHARACTER(1024),
        SET_SELECTION(2048),
        COPY(4096),
        CUT(8192),
        PASTE(16384),
        DID_GAIN_ACCESSIBILITY_FOCUS(32768),
        DID_LOSE_ACCESSIBILITY_FOCUS(65536),
        CUSTOM_ACTION(131072),
        DISMISS(262144),
        MOVE_CURSOR_FORWARD_BY_WORD(524288),
        MOVE_CURSOR_BACKWARD_BY_WORD(1048576),
        SET_TEXT(2097152);
        

        /* renamed from: e  reason: collision with root package name */
        public final int f3362e;

        g(int i2) {
            this.f3362e = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class h {
        private int a = -1;
        private int b = -1;
        private int c = -1;

        /* renamed from: d  reason: collision with root package name */
        private String f3363d;

        /* renamed from: e  reason: collision with root package name */
        private String f3364e;

        h() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum i {
        HAS_CHECKED_STATE(1),
        IS_CHECKED(2),
        IS_SELECTED(4),
        IS_BUTTON(8),
        IS_TEXT_FIELD(16),
        IS_FOCUSED(32),
        HAS_ENABLED_STATE(64),
        IS_ENABLED(128),
        IS_IN_MUTUALLY_EXCLUSIVE_GROUP(256),
        IS_HEADER(512),
        IS_OBSCURED(1024),
        SCOPES_ROUTE(2048),
        NAMES_ROUTE(4096),
        IS_HIDDEN(8192),
        IS_IMAGE(16384),
        IS_LIVE_REGION(32768),
        HAS_TOGGLED_STATE(65536),
        IS_TOGGLED(131072),
        HAS_IMPLICIT_SCROLLING(262144),
        IS_READ_ONLY(1048576),
        IS_FOCUSABLE(2097152),
        IS_LINK(4194304),
        IS_SLIDER(8388608),
        IS_KEYBOARD_KEY(16777216);
        

        /* renamed from: e  reason: collision with root package name */
        final int f3371e;

        i(int i2) {
            this.f3371e = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class j extends n {

        /* renamed from: d  reason: collision with root package name */
        String f3372d;

        private j() {
            super(null);
        }

        /* synthetic */ j(a aVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public interface k {
        void a(boolean z, boolean z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class l {
        private int B;
        private int C;
        private int D;
        private int E;
        private float F;
        private String G;
        private String H;
        private float I;
        private float J;
        private float K;
        private float L;
        private float[] M;
        private l N;
        private List<h> Q;
        private h R;
        private h S;
        private float[] U;
        private float[] W;
        private Rect X;
        final c a;
        private int c;

        /* renamed from: d  reason: collision with root package name */
        private int f3373d;

        /* renamed from: e  reason: collision with root package name */
        private int f3374e;

        /* renamed from: f  reason: collision with root package name */
        private int f3375f;

        /* renamed from: g  reason: collision with root package name */
        private int f3376g;

        /* renamed from: h  reason: collision with root package name */
        private int f3377h;

        /* renamed from: i  reason: collision with root package name */
        private int f3378i;

        /* renamed from: j  reason: collision with root package name */
        private int f3379j;

        /* renamed from: k  reason: collision with root package name */
        private int f3380k;
        private float l;
        private float m;
        private float n;
        private String o;
        private List<n> p;
        private String q;
        private List<n> r;
        private String s;
        private List<n> t;
        private String u;
        private List<n> v;
        private String w;
        private List<n> x;
        private String y;
        private int b = -1;
        private int z = -1;
        private boolean A = false;
        private List<l> O = new ArrayList();
        private List<l> P = new ArrayList();
        private boolean T = true;
        private boolean V = true;

        l(c cVar) {
            this.a = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c0(List<l> list) {
            if (p0(i.SCOPES_ROUTE)) {
                list.add(this);
            }
            for (l lVar : this.O) {
                lVar.c0(list);
            }
        }

        @TargetApi(21)
        private SpannableString d0(String str, List<n> list) {
            if (str == null) {
                return null;
            }
            SpannableString spannableString = new SpannableString(str);
            if (list != null) {
                for (n nVar : list) {
                    int i2 = e.a[nVar.c.ordinal()];
                    if (i2 == 1) {
                        spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), nVar.a, nVar.b, 0);
                    } else if (i2 == 2) {
                        spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((j) nVar).f3372d)), nVar.a, nVar.b, 0);
                    }
                }
            }
            return spannableString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean e0() {
            String str;
            String str2 = this.o;
            if (str2 == null && this.H == null) {
                return false;
            }
            return str2 == null || (str = this.H) == null || !str2.equals(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean f0() {
            return !Float.isNaN(this.l) && !Float.isNaN(this.F) && this.F != this.l;
        }

        private void g0() {
            if (this.T) {
                this.T = false;
                if (this.U == null) {
                    this.U = new float[16];
                }
                if (!Matrix.invertM(this.U, 0, this.M, 0)) {
                    Arrays.fill(this.U, 0.0f);
                }
            }
        }

        private l h0(h.a.e.c<l> cVar) {
            for (l lVar = this.N; lVar != null; lVar = lVar.N) {
                if (cVar.test(lVar)) {
                    return lVar;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Rect i0() {
            return this.X;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String j0() {
            String str;
            if (!(!p0(i.NAMES_ROUTE) || (str = this.o) == null || str.isEmpty())) {
                return this.o;
            }
            for (l lVar : this.O) {
                String j0 = lVar.j0();
                if (!(j0 == null || j0.isEmpty())) {
                    return j0;
                }
            }
            return null;
        }

        static /* synthetic */ int k(l lVar, int i2) {
            int i3 = lVar.f3377h + i2;
            lVar.f3377h = i3;
            return i3;
        }

        private List<n> k0(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
            int i2 = byteBuffer.getInt();
            if (i2 == -1) {
                return null;
            }
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = byteBuffer.getInt();
                int i5 = byteBuffer.getInt();
                o oVar = o.values()[byteBuffer.getInt()];
                int i6 = e.a[oVar.ordinal()];
                if (i6 == 1) {
                    byteBuffer.getInt();
                    m mVar = new m(null);
                    mVar.a = i4;
                    mVar.b = i5;
                    mVar.c = oVar;
                    arrayList.add(mVar);
                } else if (i6 == 2) {
                    ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                    j jVar = new j(null);
                    jVar.a = i4;
                    jVar.b = i5;
                    jVar.c = oVar;
                    jVar.f3372d = Charset.forName("UTF-8").decode(byteBuffer2).toString();
                    arrayList.add(jVar);
                }
            }
            return arrayList;
        }

        static /* synthetic */ int l(l lVar, int i2) {
            int i3 = lVar.f3377h - i2;
            lVar.f3377h = i3;
            return i3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CharSequence l0() {
            CharSequence[] charSequenceArr;
            CharSequence charSequence = null;
            for (CharSequence charSequence2 : Build.VERSION.SDK_INT < 21 ? new CharSequence[]{this.q, this.o, this.w} : new CharSequence[]{d0(this.q, this.r), d0(this.o, this.p), d0(this.w, this.x)}) {
                if (charSequence2 != null && charSequence2.length() > 0) {
                    charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, ", ", charSequence2);
                }
            }
            return charSequence;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean m0(g gVar) {
            return (gVar.f3362e & this.C) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean n0(i iVar) {
            return (iVar.f3371e & this.B) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean o0(g gVar) {
            return (gVar.f3362e & this.f3373d) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean p0(i iVar) {
            return (iVar.f3371e & this.c) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public l q0(float[] fArr) {
            float f2 = fArr[3];
            float f3 = fArr[0] / f2;
            float f4 = fArr[1] / f2;
            if (f3 < this.I || f3 >= this.K || f4 < this.J || f4 >= this.L) {
                return null;
            }
            float[] fArr2 = new float[4];
            for (l lVar : this.P) {
                if (!lVar.p0(i.IS_HIDDEN)) {
                    lVar.g0();
                    Matrix.multiplyMV(fArr2, 0, lVar.U, 0, fArr, 0);
                    l q0 = lVar.q0(fArr2);
                    if (q0 != null) {
                        return q0;
                    }
                }
            }
            if (r0()) {
                return this;
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean r0() {
            String str;
            String str2;
            String str3;
            if (p0(i.SCOPES_ROUTE)) {
                return false;
            }
            return p0(i.IS_FOCUSABLE) || (this.f3373d & (~c.y)) != 0 || (this.c & c.z) != 0 || ((str = this.o) != null && !str.isEmpty()) || (((str2 = this.q) != null && !str2.isEmpty()) || ((str3 = this.w) != null && !str3.isEmpty()));
        }

        private float s0(float f2, float f3, float f4, float f5) {
            return Math.max(f2, Math.max(f3, Math.max(f4, f5)));
        }

        private float t0(float f2, float f3, float f4, float f5) {
            return Math.min(f2, Math.min(f3, Math.min(f4, f5)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean u0(l lVar, h.a.e.c<l> cVar) {
            return (lVar == null || lVar.h0(cVar) == null) ? false : true;
        }

        private void v0(float[] fArr, float[] fArr2, float[] fArr3) {
            Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
            float f2 = fArr[3];
            fArr[0] = fArr[0] / f2;
            fArr[1] = fArr[1] / f2;
            fArr[2] = fArr[2] / f2;
            fArr[3] = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void w0(float[] fArr, Set<l> set, boolean z) {
            set.add(this);
            if (this.V) {
                z = true;
            }
            if (z) {
                if (this.W == null) {
                    this.W = new float[16];
                }
                Matrix.multiplyMM(this.W, 0, fArr, 0, this.M, 0);
                float[] fArr2 = {this.I, this.J, 0.0f, 1.0f};
                float[] fArr3 = new float[4];
                float[] fArr4 = new float[4];
                float[] fArr5 = new float[4];
                float[] fArr6 = new float[4];
                v0(fArr3, this.W, fArr2);
                fArr2[0] = this.K;
                fArr2[1] = this.J;
                v0(fArr4, this.W, fArr2);
                fArr2[0] = this.K;
                fArr2[1] = this.L;
                v0(fArr5, this.W, fArr2);
                fArr2[0] = this.I;
                fArr2[1] = this.L;
                v0(fArr6, this.W, fArr2);
                if (this.X == null) {
                    this.X = new Rect();
                }
                this.X.set(Math.round(t0(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(t0(fArr3[1], fArr4[1], fArr5[1], fArr6[1])), Math.round(s0(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(s0(fArr3[1], fArr4[1], fArr5[1], fArr6[1])));
                this.V = false;
            }
            int i2 = -1;
            for (l lVar : this.O) {
                lVar.z = i2;
                i2 = lVar.b;
                lVar.w0(this.W, set, z);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void x0(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            this.A = true;
            this.G = this.q;
            this.H = this.o;
            this.B = this.c;
            this.C = this.f3373d;
            this.D = this.f3376g;
            this.E = this.f3377h;
            this.F = this.l;
            this.c = byteBuffer.getInt();
            this.f3373d = byteBuffer.getInt();
            this.f3374e = byteBuffer.getInt();
            this.f3375f = byteBuffer.getInt();
            this.f3376g = byteBuffer.getInt();
            this.f3377h = byteBuffer.getInt();
            this.f3378i = byteBuffer.getInt();
            this.f3379j = byteBuffer.getInt();
            this.f3380k = byteBuffer.getInt();
            this.l = byteBuffer.getFloat();
            this.m = byteBuffer.getFloat();
            this.n = byteBuffer.getFloat();
            int i2 = byteBuffer.getInt();
            this.o = i2 == -1 ? null : strArr[i2];
            this.p = k0(byteBuffer, byteBufferArr);
            int i3 = byteBuffer.getInt();
            this.q = i3 == -1 ? null : strArr[i3];
            this.r = k0(byteBuffer, byteBufferArr);
            int i4 = byteBuffer.getInt();
            this.s = i4 == -1 ? null : strArr[i4];
            this.t = k0(byteBuffer, byteBufferArr);
            int i5 = byteBuffer.getInt();
            this.u = i5 == -1 ? null : strArr[i5];
            this.v = k0(byteBuffer, byteBufferArr);
            int i6 = byteBuffer.getInt();
            this.w = i6 == -1 ? null : strArr[i6];
            this.x = k0(byteBuffer, byteBufferArr);
            int i7 = byteBuffer.getInt();
            this.y = i7 == -1 ? null : strArr[i7];
            p.a(byteBuffer.getInt());
            this.I = byteBuffer.getFloat();
            this.J = byteBuffer.getFloat();
            this.K = byteBuffer.getFloat();
            this.L = byteBuffer.getFloat();
            if (this.M == null) {
                this.M = new float[16];
            }
            for (int i8 = 0; i8 < 16; i8++) {
                this.M[i8] = byteBuffer.getFloat();
            }
            this.T = true;
            this.V = true;
            int i9 = byteBuffer.getInt();
            this.O.clear();
            this.P.clear();
            for (int i10 = 0; i10 < i9; i10++) {
                l w = this.a.w(byteBuffer.getInt());
                w.N = this;
                this.O.add(w);
            }
            for (int i11 = 0; i11 < i9; i11++) {
                l w2 = this.a.w(byteBuffer.getInt());
                w2.N = this;
                this.P.add(w2);
            }
            int i12 = byteBuffer.getInt();
            if (i12 == 0) {
                this.Q = null;
                return;
            }
            List<h> list = this.Q;
            if (list == null) {
                this.Q = new ArrayList(i12);
            } else {
                list.clear();
            }
            for (int i13 = 0; i13 < i12; i13++) {
                h v = this.a.v(byteBuffer.getInt());
                if (v.c == g.TAP.f3362e) {
                    this.R = v;
                } else if (v.c == g.LONG_PRESS.f3362e) {
                    this.S = v;
                } else {
                    this.Q.add(v);
                }
                this.Q.add(v);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class m extends n {
        private m() {
            super(null);
        }

        /* synthetic */ m(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class n {
        int a;
        int b;
        o c;

        private n() {
        }

        /* synthetic */ n(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum o {
        SPELLOUT,
        LOCALE
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum p {
        UNKNOWN,
        LTR,
        RTL;

        public static p a(int i2) {
            return i2 != 1 ? i2 != 2 ? UNKNOWN : LTR : RTL;
        }
    }

    public c(View view, io.flutter.embedding.engine.j.b bVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, h.a.d.d.k kVar) {
        this(view, bVar, accessibilityManager, contentResolver, new AccessibilityViewEmbedder(view, 65536), kVar);
    }

    public c(View view, io.flutter.embedding.engine.j.b bVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, AccessibilityViewEmbedder accessibilityViewEmbedder, h.a.d.d.k kVar) {
        this.f3346g = new HashMap();
        this.f3347h = new HashMap();
        this.l = 0;
        this.p = new ArrayList();
        this.q = 0;
        this.r = 0;
        this.t = false;
        this.u = new a();
        b bVar2 = new b();
        this.v = bVar2;
        C0137c cVar = new C0137c(new Handler());
        this.x = cVar;
        this.a = view;
        this.b = bVar;
        this.c = accessibilityManager;
        this.f3345f = contentResolver;
        this.f3343d = accessibilityViewEmbedder;
        this.f3344e = kVar;
        bVar2.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(bVar2);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19) {
            d dVar = new d(accessibilityManager);
            this.w = dVar;
            dVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
            accessibilityManager.addTouchExplorationStateChangeListener(dVar);
        } else {
            this.w = null;
        }
        if (i2 >= 17) {
            cVar.onChange(false);
            contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, cVar);
        }
        kVar.b(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean B(l lVar, l lVar2) {
        return lVar2 == lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AccessibilityEvent D(int i2, int i3) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i3);
        obtain.setPackageName(this.a.getContext().getPackageName());
        obtain.setSource(this.a, i2);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        l lVar = this.o;
        if (lVar != null) {
            N(lVar.b, 256);
            this.o = null;
        }
    }

    private void H(l lVar) {
        String j0 = lVar.j0();
        if (j0 == null) {
            j0 = " ";
        }
        if (Build.VERSION.SDK_INT >= 28) {
            R(j0);
            return;
        }
        AccessibilityEvent D = D(lVar.b, 32);
        D.getText().add(j0);
        O(D);
    }

    @TargetApi(18)
    private boolean I(l lVar, int i2, Bundle bundle, boolean z2) {
        int i3 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z3 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i4 = lVar.f3376g;
        int i5 = lVar.f3377h;
        K(lVar, i3, z2, z3);
        if (!(i4 == lVar.f3376g && i5 == lVar.f3377h)) {
            String str = lVar.q != null ? lVar.q : "";
            AccessibilityEvent D = D(lVar.b, 8192);
            D.getText().add(str);
            D.setFromIndex(lVar.f3376g);
            D.setToIndex(lVar.f3377h);
            D.setItemCount(str.length());
            O(D);
        }
        if (i3 == 1) {
            if (z2) {
                g gVar = g.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (lVar.o0(gVar)) {
                    this.b.c(i2, gVar, Boolean.valueOf(z3));
                    return true;
                }
            }
            if (z2) {
                return false;
            }
            g gVar2 = g.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
            if (!lVar.o0(gVar2)) {
                return false;
            }
            this.b.c(i2, gVar2, Boolean.valueOf(z3));
            return true;
        } else if (i3 != 2) {
            return i3 == 4 || i3 == 8 || i3 == 16;
        } else {
            if (z2) {
                g gVar3 = g.MOVE_CURSOR_FORWARD_BY_WORD;
                if (lVar.o0(gVar3)) {
                    this.b.c(i2, gVar3, Boolean.valueOf(z3));
                    return true;
                }
            }
            if (z2) {
                return false;
            }
            g gVar4 = g.MOVE_CURSOR_BACKWARD_BY_WORD;
            if (!lVar.o0(gVar4)) {
                return false;
            }
            this.b.c(i2, gVar4, Boolean.valueOf(z3));
            return true;
        }
    }

    @TargetApi(21)
    private boolean J(l lVar, int i2, Bundle bundle) {
        String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
        this.b.c(i2, g.SET_TEXT, string);
        lVar.q = string;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0022, code lost:
        if (r6 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0024, code lost:
        r5 = r4.q.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0031, code lost:
        r4.f3377h = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
        if (r5.find() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
        io.flutter.view.c.l.k(r4, r5.start(1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008d, code lost:
        if (r5.find() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008f, code lost:
        r5 = r5.start(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c1, code lost:
        if (r5.find() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e6, code lost:
        if (r5.find() != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void K(l lVar, int i2, boolean z2, boolean z3) {
        Matcher matcher;
        Matcher matcher2;
        int start;
        if (lVar.f3377h >= 0 && lVar.f3376g >= 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 4) {
                        if (i2 == 8 || i2 == 16) {
                        }
                    } else if (z2 && lVar.f3377h < lVar.q.length()) {
                        matcher2 = Pattern.compile("(?!^)(\\n)").matcher(lVar.q.substring(lVar.f3377h));
                    } else if (!z2 && lVar.f3377h > 0) {
                        matcher = Pattern.compile("(?s:.*)(\\n)").matcher(lVar.q.substring(0, lVar.f3377h));
                    }
                } else if (z2 && lVar.f3377h < lVar.q.length()) {
                    matcher2 = Pattern.compile("\\p{L}(\\b)").matcher(lVar.q.substring(lVar.f3377h));
                    matcher2.find();
                } else if (!z2 && lVar.f3377h > 0) {
                    matcher = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(lVar.q.substring(0, lVar.f3377h));
                }
                lVar.f3377h = start;
            } else if (z2 && lVar.f3377h < lVar.q.length()) {
                l.k(lVar, 1);
            } else if (!z2 && lVar.f3377h > 0) {
                l.l(lVar, 1);
            }
            if (!z3) {
                lVar.f3376g = lVar.f3377h;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(int i2, int i3) {
        if (this.c.isEnabled()) {
            O(D(i2, i3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O(AccessibilityEvent accessibilityEvent) {
        if (this.c.isEnabled()) {
            this.a.getParent().requestSendAccessibilityEvent(this.a, accessibilityEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        this.b.f(this.l);
    }

    private void Q(int i2) {
        AccessibilityEvent D = D(i2, 2048);
        if (Build.VERSION.SDK_INT >= 19) {
            D.setContentChangeTypes(1);
        }
        O(D);
    }

    @TargetApi(28)
    private void R(String str) {
        this.a.setAccessibilityPaneTitle(str);
    }

    private boolean T(final l lVar) {
        return lVar.f3379j > 0 && (l.u0(this.f3348i, new h.a.e.c() { // from class: io.flutter.view.b
            @Override // h.a.e.c
            public final boolean test(Object obj) {
                return c.B(c.l.this, (c.l) obj);
            }
        }) || !l.u0(this.f3348i, io.flutter.view.a.a));
    }

    @TargetApi(19)
    private void W(l lVar) {
        View c;
        Integer num;
        lVar.N = null;
        if (!(lVar.f3378i == -1 || (num = this.f3349j) == null || this.f3343d.platformViewOfNode(num.intValue()) != this.f3344e.c(lVar.f3378i))) {
            N(this.f3349j.intValue(), 65536);
            this.f3349j = null;
        }
        if (!(lVar.f3378i == -1 || (c = this.f3344e.c(lVar.f3378i)) == null)) {
            c.setImportantForAccessibility(4);
        }
        l lVar2 = this.f3348i;
        if (lVar2 == lVar) {
            N(lVar2.b, 65536);
            this.f3348i = null;
        }
        if (this.m == lVar) {
            this.m = null;
        }
        if (this.o == lVar) {
            this.o = null;
        }
    }

    static /* synthetic */ int c(c cVar, int i2) {
        int i3 = i2 & cVar.l;
        cVar.l = i3;
        return i3;
    }

    static /* synthetic */ int d(c cVar, int i2) {
        int i3 = i2 | cVar.l;
        cVar.l = i3;
        return i3;
    }

    private AccessibilityEvent s(int i2, String str, String str2) {
        AccessibilityEvent D = D(i2, 16);
        D.setBeforeText(str);
        D.getText().add(str2);
        int i3 = 0;
        while (i3 < str.length() && i3 < str2.length() && str.charAt(i3) == str2.charAt(i3)) {
            i3++;
        }
        if (i3 >= str.length() && i3 >= str2.length()) {
            return null;
        }
        D.setFromIndex(i3);
        int length = str.length() - 1;
        int length2 = str2.length() - 1;
        while (length >= i3 && length2 >= i3 && str.charAt(length) == str2.charAt(length2)) {
            length--;
            length2--;
        }
        D.setRemovedCount((length - i3) + 1);
        D.setAddedCount((length2 - i3) + 1);
        return D;
    }

    @TargetApi(28)
    private boolean t() {
        Activity c = h.a.e.e.c(this.a.getContext());
        if (c == null || c.getWindow() == null) {
            return false;
        }
        int i2 = c.getWindow().getAttributes().layoutInDisplayCutoutMode;
        return i2 == 2 || i2 == 0;
    }

    private Rect u(Rect rect) {
        Rect rect2 = new Rect(rect);
        int[] iArr = new int[2];
        this.a.getLocationOnScreen(iArr);
        rect2.offset(iArr[0], iArr[1]);
        return rect2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public h v(int i2) {
        h hVar = this.f3347h.get(Integer.valueOf(i2));
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        hVar2.b = i2;
        hVar2.a = A + i2;
        this.f3347h.put(Integer.valueOf(i2), hVar2);
        return hVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public l w(int i2) {
        l lVar = this.f3346g.get(Integer.valueOf(i2));
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this);
        lVar2.b = i2;
        this.f3346g.put(Integer.valueOf(i2), lVar2);
        return lVar2;
    }

    private l x() {
        return this.f3346g.get(0);
    }

    private void y(float f2, float f3) {
        l q0;
        if (!this.f3346g.isEmpty() && (q0 = x().q0(new float[]{f2, f3, 0.0f, 1.0f})) != this.o) {
            if (q0 != null) {
                N(q0.b, 128);
            }
            l lVar = this.o;
            if (lVar != null) {
                N(lVar.b, 256);
            }
            this.o = q0;
        }
    }

    public boolean A() {
        return this.c.isTouchExplorationEnabled();
    }

    public AccessibilityNodeInfo E(View view, int i2) {
        return AccessibilityNodeInfo.obtain(view, i2);
    }

    public boolean F(MotionEvent motionEvent) {
        if (!this.c.isTouchExplorationEnabled() || this.f3346g.isEmpty()) {
            return false;
        }
        l q0 = x().q0(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f});
        if (q0 != null && q0.f3378i != -1) {
            return this.f3343d.onAccessibilityHoverEvent(q0.b, motionEvent);
        }
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            y(motionEvent.getX(), motionEvent.getY());
        } else if (motionEvent.getAction() == 10) {
            G();
        } else {
            h.a.b.a("flutter", "unexpected accessibility hover event: " + motionEvent);
            return false;
        }
        return true;
    }

    public void L() {
        this.t = true;
        this.f3344e.a();
        S(null);
        this.c.removeAccessibilityStateChangeListener(this.v);
        if (Build.VERSION.SDK_INT >= 19) {
            this.c.removeTouchExplorationStateChangeListener(this.w);
        }
        this.f3345f.unregisterContentObserver(this.x);
        this.b.g(null);
    }

    public void M() {
        this.f3346g.clear();
        l lVar = this.f3348i;
        if (lVar != null) {
            N(lVar.b, 65536);
        }
        this.f3348i = null;
        this.o = null;
        Q(0);
    }

    public void S(k kVar) {
        this.s = kVar;
    }

    void U(ByteBuffer byteBuffer, String[] strArr) {
        while (byteBuffer.hasRemaining()) {
            h v = v(byteBuffer.getInt());
            v.c = byteBuffer.getInt();
            int i2 = byteBuffer.getInt();
            String str = null;
            v.f3363d = i2 == -1 ? null : strArr[i2];
            int i3 = byteBuffer.getInt();
            if (i3 != -1) {
                str = strArr[i3];
            }
            v.f3364e = str;
        }
    }

    void V(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        l lVar;
        l lVar2;
        float f2;
        float f3;
        WindowInsets rootWindowInsets;
        Integer valueOf;
        View c;
        ArrayList arrayList = new ArrayList();
        while (byteBuffer.hasRemaining()) {
            l w = w(byteBuffer.getInt());
            w.x0(byteBuffer, strArr, byteBufferArr);
            if (!w.p0(i.IS_HIDDEN)) {
                if (w.p0(i.IS_FOCUSED)) {
                    this.m = w;
                }
                if (w.A) {
                    arrayList.add(w);
                }
                if (!(w.f3378i == -1 || (c = this.f3344e.c(w.f3378i)) == null)) {
                    c.setImportantForAccessibility(0);
                }
            }
        }
        HashSet hashSet = new HashSet();
        l x = x();
        ArrayList<l> arrayList2 = new ArrayList();
        if (x != null) {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 23) {
                if ((i2 >= 28 ? t() : true) && (rootWindowInsets = this.a.getRootWindowInsets()) != null) {
                    if (!this.r.equals(Integer.valueOf(rootWindowInsets.getSystemWindowInsetLeft()))) {
                        x.V = true;
                        x.T = true;
                    }
                    this.r = Integer.valueOf(rootWindowInsets.getSystemWindowInsetLeft());
                    Matrix.translateM(fArr, 0, valueOf.intValue(), 0.0f, 0.0f);
                }
            }
            x.w0(fArr, hashSet, false);
            x.c0(arrayList2);
        }
        l lVar3 = null;
        for (l lVar4 : arrayList2) {
            if (!this.p.contains(Integer.valueOf(lVar4.b))) {
                lVar3 = lVar4;
            }
        }
        if (lVar3 == null && arrayList2.size() > 0) {
            lVar3 = (l) arrayList2.get(arrayList2.size() - 1);
        }
        if (!(lVar3 == null || (lVar3.b == this.q && arrayList2.size() == this.p.size()))) {
            this.q = lVar3.b;
            H(lVar3);
        }
        this.p.clear();
        for (l lVar5 : arrayList2) {
            this.p.add(Integer.valueOf(lVar5.b));
        }
        Iterator<Map.Entry<Integer, l>> it = this.f3346g.entrySet().iterator();
        while (it.hasNext()) {
            l value = it.next().getValue();
            if (!hashSet.contains(value)) {
                W(value);
                it.remove();
            }
        }
        Q(0);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            l lVar6 = (l) it2.next();
            if (lVar6.f0()) {
                AccessibilityEvent D = D(lVar6.b, 4096);
                float f4 = lVar6.l;
                float f5 = lVar6.m;
                if (Float.isInfinite(lVar6.m)) {
                    if (f4 > 70000.0f) {
                        f4 = 70000.0f;
                    }
                    f5 = 100000.0f;
                }
                if (Float.isInfinite(lVar6.n)) {
                    f2 = f5 + 100000.0f;
                    if (f4 < -70000.0f) {
                        f4 = -70000.0f;
                    }
                    f3 = f4 + 100000.0f;
                } else {
                    f2 = f5 - lVar6.n;
                    f3 = f4 - lVar6.n;
                }
                if (lVar6.m0(g.SCROLL_UP) || lVar6.m0(g.SCROLL_DOWN)) {
                    D.setScrollY((int) f3);
                    D.setMaxScrollY((int) f2);
                } else if (lVar6.m0(g.SCROLL_LEFT) || lVar6.m0(g.SCROLL_RIGHT)) {
                    D.setScrollX((int) f3);
                    D.setMaxScrollX((int) f2);
                }
                if (lVar6.f3379j > 0) {
                    D.setItemCount(lVar6.f3379j);
                    D.setFromIndex(lVar6.f3380k);
                    int i3 = 0;
                    for (l lVar7 : lVar6.P) {
                        if (!lVar7.p0(i.IS_HIDDEN)) {
                            i3++;
                        }
                    }
                    D.setToIndex((lVar6.f3380k + i3) - 1);
                }
                O(D);
            }
            if (lVar6.p0(i.IS_LIVE_REGION) && lVar6.e0()) {
                Q(lVar6.b);
            }
            l lVar8 = this.f3348i;
            if (lVar8 != null && lVar8.b == lVar6.b) {
                i iVar = i.IS_SELECTED;
                if (!lVar6.n0(iVar) && lVar6.p0(iVar)) {
                    AccessibilityEvent D2 = D(lVar6.b, 4);
                    D2.getText().add(lVar6.o);
                    O(D2);
                }
            }
            l lVar9 = this.m;
            if (lVar9 != null && lVar9.b == lVar6.b && ((lVar2 = this.n) == null || lVar2.b != this.m.b)) {
                this.n = this.m;
                O(D(lVar6.b, 8));
            } else if (this.m == null) {
                this.n = null;
            }
            l lVar10 = this.m;
            if (lVar10 != null && lVar10.b == lVar6.b) {
                i iVar2 = i.IS_TEXT_FIELD;
                if (lVar6.n0(iVar2) && lVar6.p0(iVar2) && ((lVar = this.f3348i) == null || lVar.b == this.m.b)) {
                    String str = "";
                    String str2 = lVar6.G != null ? lVar6.G : str;
                    if (lVar6.q != null) {
                        str = lVar6.q;
                    }
                    AccessibilityEvent s = s(lVar6.b, str2, str);
                    if (s != null) {
                        O(s);
                    }
                    if (lVar6.D != lVar6.f3376g || lVar6.E != lVar6.f3377h) {
                        AccessibilityEvent D3 = D(lVar6.b, 8192);
                        D3.getText().add(str);
                        D3.setFromIndex(lVar6.f3376g);
                        D3.setToIndex(lVar6.f3377h);
                        D3.setItemCount(str.length());
                        O(D3);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:221:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0427 A[LOOP:0: B:233:0x0421->B:235:0x0427, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x044c  */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    @SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
        boolean z2;
        String str;
        i iVar;
        int i3;
        l lVar;
        if (i2 >= 65536) {
            return this.f3343d.createAccessibilityNodeInfo(i2);
        }
        if (i2 == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.a);
            this.a.onInitializeAccessibilityNodeInfo(obtain);
            if (this.f3346g.containsKey(0)) {
                obtain.addChild(this.a, 0);
            }
            return obtain;
        }
        l lVar2 = this.f3346g.get(Integer.valueOf(i2));
        if (lVar2 == null) {
            return null;
        }
        AccessibilityNodeInfo E = E(this.a, i2);
        int i4 = Build.VERSION.SDK_INT;
        String str2 = "";
        if (i4 >= 18) {
            E.setViewIdResourceName(str2);
        }
        E.setPackageName(this.a.getContext().getPackageName());
        E.setClassName("android.view.View");
        E.setSource(this.a, i2);
        E.setFocusable(lVar2.r0());
        l lVar3 = this.m;
        if (lVar3 != null) {
            E.setFocused(lVar3.b == i2);
        }
        l lVar4 = this.f3348i;
        if (lVar4 != null) {
            E.setAccessibilityFocused(lVar4.b == i2);
        }
        i iVar2 = i.IS_TEXT_FIELD;
        if (lVar2.p0(iVar2)) {
            E.setPassword(lVar2.p0(i.IS_OBSCURED));
            if (!lVar2.p0(i.IS_READ_ONLY)) {
                E.setClassName("android.widget.EditText");
            }
            if (i4 >= 18) {
                E.setEditable(!lVar2.p0(iVar));
                if (!(lVar2.f3376g == -1 || lVar2.f3377h == -1)) {
                    E.setTextSelection(lVar2.f3376g, lVar2.f3377h);
                }
                if (i4 > 18 && (lVar = this.f3348i) != null && lVar.b == i2) {
                    E.setLiveRegion(1);
                }
            }
            if (lVar2.o0(g.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                E.addAction(256);
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (lVar2.o0(g.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                E.addAction(512);
                i3 |= 1;
            }
            if (lVar2.o0(g.MOVE_CURSOR_FORWARD_BY_WORD)) {
                E.addAction(256);
                i3 |= 2;
            }
            if (lVar2.o0(g.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                E.addAction(512);
                i3 |= 2;
            }
            E.setMovementGranularities(i3);
            if (i4 >= 21 && lVar2.f3374e >= 0) {
                int length = lVar2.q == null ? 0 : lVar2.q.length();
                int unused = lVar2.f3375f;
                int unused2 = lVar2.f3374e;
                E.setMaxTextLength((length - lVar2.f3375f) + lVar2.f3374e);
            }
        }
        if (i4 > 18) {
            if (lVar2.o0(g.SET_SELECTION)) {
                E.addAction(131072);
            }
            if (lVar2.o0(g.COPY)) {
                E.addAction(16384);
            }
            if (lVar2.o0(g.CUT)) {
                E.addAction(65536);
            }
            if (lVar2.o0(g.PASTE)) {
                E.addAction(32768);
            }
        }
        if (i4 >= 21 && lVar2.o0(g.SET_TEXT)) {
            E.addAction(2097152);
        }
        if (lVar2.p0(i.IS_BUTTON) || lVar2.p0(i.IS_LINK)) {
            E.setClassName("android.widget.Button");
        }
        if (lVar2.p0(i.IS_IMAGE)) {
            E.setClassName("android.widget.ImageView");
        }
        if (i4 > 18 && lVar2.o0(g.DISMISS)) {
            E.setDismissable(true);
            E.addAction(1048576);
        }
        if (lVar2.N != null) {
            E.setParent(this.a, lVar2.N.b);
        } else {
            E.setParent(this.a);
        }
        if (lVar2.z != -1 && i4 >= 22) {
            E.setTraversalAfter(this.a, lVar2.z);
        }
        Rect i0 = lVar2.i0();
        if (lVar2.N != null) {
            Rect i02 = lVar2.N.i0();
            Rect rect = new Rect(i0);
            rect.offset(-i02.left, -i02.top);
            E.setBoundsInParent(rect);
        } else {
            E.setBoundsInParent(i0);
        }
        E.setBoundsInScreen(u(i0));
        E.setVisibleToUser(true);
        E.setEnabled(!lVar2.p0(i.HAS_ENABLED_STATE) || lVar2.p0(i.IS_ENABLED));
        if (lVar2.o0(g.TAP)) {
            if (i4 < 21 || lVar2.R == null) {
                E.addAction(16);
            } else {
                E.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, lVar2.R.f3364e));
            }
            E.setClickable(true);
        }
        if (lVar2.o0(g.LONG_PRESS)) {
            if (i4 < 21 || lVar2.S == null) {
                E.addAction(32);
            } else {
                E.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, lVar2.S.f3364e));
            }
            E.setLongClickable(true);
        }
        g gVar = g.SCROLL_LEFT;
        if (lVar2.o0(gVar) || lVar2.o0(g.SCROLL_UP) || lVar2.o0(g.SCROLL_RIGHT) || lVar2.o0(g.SCROLL_DOWN)) {
            E.setScrollable(true);
            if (lVar2.p0(i.HAS_IMPLICIT_SCROLLING)) {
                if (lVar2.o0(gVar) || lVar2.o0(g.SCROLL_RIGHT)) {
                    if (i4 <= 19 || !T(lVar2)) {
                        z2 = false;
                        E.setClassName("android.widget.HorizontalScrollView");
                    } else {
                        z2 = false;
                        E.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(0, lVar2.f3379j, false));
                    }
                    if (!lVar2.o0(gVar) || lVar2.o0(g.SCROLL_UP)) {
                        E.addAction(4096);
                    }
                    if (!lVar2.o0(g.SCROLL_RIGHT) || lVar2.o0(g.SCROLL_DOWN)) {
                        E.addAction(8192);
                    }
                } else if (i4 <= 18 || !T(lVar2)) {
                    E.setClassName("android.widget.ScrollView");
                } else {
                    E.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(lVar2.f3379j, 0, false));
                }
            }
            z2 = false;
            if (!lVar2.o0(gVar)) {
            }
            E.addAction(4096);
            if (!lVar2.o0(g.SCROLL_RIGHT)) {
            }
            E.addAction(8192);
        } else {
            z2 = false;
        }
        g gVar2 = g.INCREASE;
        if (lVar2.o0(gVar2) || lVar2.o0(g.DECREASE)) {
            E.setClassName("android.widget.SeekBar");
            if (lVar2.o0(gVar2)) {
                E.addAction(4096);
            }
            if (lVar2.o0(g.DECREASE)) {
                E.addAction(8192);
            }
        }
        if (lVar2.p0(i.IS_LIVE_REGION) && i4 > 18) {
            E.setLiveRegion(1);
        }
        if (lVar2.p0(iVar2)) {
            E.setText(lVar2.l0());
        } else if (!lVar2.p0(i.SCOPES_ROUTE)) {
            CharSequence l0 = lVar2.l0();
            if (i4 < 28 && lVar2.y != null) {
                if (l0 != null) {
                    str2 = l0;
                }
                l0 = ((Object) str2) + "\n" + lVar2.y;
            }
            if (l0 != null) {
                E.setContentDescription(l0);
            }
        }
        if (i4 >= 28 && lVar2.y != null) {
            E.setTooltipText(lVar2.y);
        }
        boolean p0 = lVar2.p0(i.HAS_CHECKED_STATE);
        boolean p02 = lVar2.p0(i.HAS_TOGGLED_STATE);
        if (p0 || p02) {
            z2 = true;
        }
        E.setCheckable(z2);
        if (p0) {
            E.setChecked(lVar2.p0(i.IS_CHECKED));
            str = lVar2.p0(i.IS_IN_MUTUALLY_EXCLUSIVE_GROUP) ? "android.widget.RadioButton" : "android.widget.CheckBox";
        } else {
            if (p02) {
                E.setChecked(lVar2.p0(i.IS_TOGGLED));
                str = "android.widget.Switch";
            }
            E.setSelected(lVar2.p0(i.IS_SELECTED));
            if (i4 >= 28) {
                E.setHeading(lVar2.p0(i.IS_HEADER));
            }
            l lVar5 = this.f3348i;
            E.addAction((lVar5 == null && lVar5.b == i2) ? 128 : 64);
            if (i4 >= 21 && lVar2.Q != null) {
                for (h hVar : lVar2.Q) {
                    E.addAction(new AccessibilityNodeInfo.AccessibilityAction(hVar.a, hVar.f3363d));
                }
            }
            for (l lVar6 : lVar2.O) {
                if (!lVar6.p0(i.IS_HIDDEN)) {
                    if (lVar6.f3378i != -1) {
                        E.addChild(this.f3344e.c(lVar6.f3378i));
                    } else {
                        E.addChild(this.a, lVar6.b);
                    }
                }
            }
            return E;
        }
        E.setClassName(str);
        E.setSelected(lVar2.p0(i.IS_SELECTED));
        if (i4 >= 28) {
        }
        l lVar52 = this.f3348i;
        E.addAction((lVar52 == null && lVar52.b == i2) ? 128 : 64);
        if (i4 >= 21) {
            while (r1.hasNext()) {
            }
        }
        while (r1.hasNext()) {
        }
        return E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0016, code lost:
        if (r2 != null) goto L13;
     */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AccessibilityNodeInfo findFocus(int i2) {
        l lVar;
        Integer num;
        int intValue;
        if (i2 == 1) {
            lVar = this.m;
            if (lVar == null) {
                num = this.f3350k;
            }
            intValue = lVar.b;
            return createAccessibilityNodeInfo(intValue);
        } else if (i2 != 2) {
            return null;
        }
        lVar = this.f3348i;
        if (lVar == null) {
            num = this.f3349j;
            if (num == null) {
                return null;
            }
            intValue = num.intValue();
            return createAccessibilityNodeInfo(intValue);
        }
        intValue = lVar.b;
        return createAccessibilityNodeInfo(intValue);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public boolean performAction(int i2, int i3, Bundle bundle) {
        int i4;
        int i5 = Build.VERSION.SDK_INT;
        if (i2 >= 65536) {
            boolean performAction = this.f3343d.performAction(i2, i3, bundle);
            if (performAction && i3 == 128) {
                this.f3349j = null;
            }
            return performAction;
        }
        l lVar = this.f3346g.get(Integer.valueOf(i2));
        boolean z2 = false;
        if (lVar == null) {
            return false;
        }
        switch (i3) {
            case 16:
                this.b.b(i2, g.TAP);
                return true;
            case 32:
                this.b.b(i2, g.LONG_PRESS);
                return true;
            case 64:
                if (this.f3348i == null) {
                    this.a.invalidate();
                }
                this.f3348i = lVar;
                this.b.b(i2, g.DID_GAIN_ACCESSIBILITY_FOCUS);
                N(i2, 32768);
                if (lVar.o0(g.INCREASE) || lVar.o0(g.DECREASE)) {
                    N(i2, 4);
                }
                return true;
            case 128:
                l lVar2 = this.f3348i;
                if (lVar2 != null && lVar2.b == i2) {
                    this.f3348i = null;
                }
                Integer num = this.f3349j;
                if (num != null && num.intValue() == i2) {
                    this.f3349j = null;
                }
                this.b.b(i2, g.DID_LOSE_ACCESSIBILITY_FOCUS);
                N(i2, 65536);
                return true;
            case 256:
                if (i5 < 18) {
                    return false;
                }
                return I(lVar, i2, bundle, true);
            case 512:
                if (i5 < 18) {
                    return false;
                }
                return I(lVar, i2, bundle, false);
            case 4096:
                g gVar = g.SCROLL_UP;
                if (!lVar.o0(gVar)) {
                    gVar = g.SCROLL_LEFT;
                    if (!lVar.o0(gVar)) {
                        gVar = g.INCREASE;
                        if (!lVar.o0(gVar)) {
                            return false;
                        }
                        lVar.q = lVar.s;
                        lVar.r = lVar.t;
                        N(i2, 4);
                    }
                }
                this.b.b(i2, gVar);
                return true;
            case 8192:
                g gVar2 = g.SCROLL_DOWN;
                if (!lVar.o0(gVar2)) {
                    gVar2 = g.SCROLL_RIGHT;
                    if (!lVar.o0(gVar2)) {
                        gVar2 = g.DECREASE;
                        if (!lVar.o0(gVar2)) {
                            return false;
                        }
                        lVar.q = lVar.u;
                        lVar.r = lVar.v;
                        N(i2, 4);
                    }
                }
                this.b.b(i2, gVar2);
                return true;
            case 16384:
                this.b.b(i2, g.COPY);
                return true;
            case 32768:
                this.b.b(i2, g.PASTE);
                return true;
            case 65536:
                this.b.b(i2, g.CUT);
                return true;
            case 131072:
                if (i5 < 18) {
                    return false;
                }
                HashMap hashMap = new HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    z2 = true;
                }
                if (z2) {
                    hashMap.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    i4 = bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT");
                } else {
                    hashMap.put("base", Integer.valueOf(lVar.f3377h));
                    i4 = lVar.f3377h;
                }
                hashMap.put("extent", Integer.valueOf(i4));
                this.b.c(i2, g.SET_SELECTION, hashMap);
                l lVar3 = this.f3346g.get(Integer.valueOf(i2));
                lVar3.f3376g = ((Integer) hashMap.get("base")).intValue();
                lVar3.f3377h = ((Integer) hashMap.get("extent")).intValue();
                return true;
            case 1048576:
                this.b.b(i2, g.DISMISS);
                return true;
            case 2097152:
                if (i5 < 21) {
                    return false;
                }
                return J(lVar, i2, bundle);
            case 16908342:
                this.b.b(i2, g.SHOW_ON_SCREEN);
                return true;
            default:
                h hVar = this.f3347h.get(Integer.valueOf(i3 - A));
                if (hVar == null) {
                    return false;
                }
                this.b.c(i2, g.CUSTOM_ACTION, Integer.valueOf(hVar.b));
                return true;
        }
    }

    public boolean z() {
        return this.c.isEnabled();
    }
}

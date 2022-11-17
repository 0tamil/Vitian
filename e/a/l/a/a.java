package e.a.l.a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.n0;
import e.a.l.a.b;
import e.a.l.a.d;
import e.c.h;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
public class a extends e.a.l.a.d implements androidx.core.graphics.drawable.b {
    private c s;
    private g t;
    private int u;
    private int v;
    private boolean w;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends g {
        private final Animatable a;

        b(Animatable animatable) {
            super();
            this.a = animatable;
        }

        @Override // e.a.l.a.a.g
        public void c() {
            this.a.start();
        }

        @Override // e.a.l.a.a.g
        public void d() {
            this.a.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c extends d.a {
        e.c.d<Long> K;
        h<Integer> L;

        c(c cVar, a aVar, Resources resources) {
            super(cVar, aVar, resources);
            h<Integer> hVar;
            if (cVar != null) {
                this.K = cVar.K;
                hVar = cVar.L;
            } else {
                this.K = new e.c.d<>();
                hVar = new h<>();
            }
            this.L = hVar;
        }

        private static long D(int i2, int i3) {
            return i3 | (i2 << 32);
        }

        int B(int[] iArr, Drawable drawable, int i2) {
            int z = super.z(iArr, drawable);
            this.L.j(z, Integer.valueOf(i2));
            return z;
        }

        int C(int i2, int i3, Drawable drawable, boolean z) {
            int a = super.a(drawable);
            long D = D(i2, i3);
            long j2 = z ? 8589934592L : 0L;
            long j3 = a;
            this.K.b(D, Long.valueOf(j3 | j2));
            if (z) {
                this.K.b(D(i3, i2), Long.valueOf(4294967296L | j3 | j2));
            }
            return a;
        }

        int E(int i2) {
            if (i2 < 0) {
                return 0;
            }
            return this.L.h(i2, 0).intValue();
        }

        int F(int[] iArr) {
            int A = super.A(iArr);
            return A >= 0 ? A : super.A(StateSet.WILD_CARD);
        }

        int G(int i2, int i3) {
            return (int) this.K.h(D(i2, i3), -1L).longValue();
        }

        boolean H(int i2, int i3) {
            return (this.K.h(D(i2, i3), -1L).longValue() & 4294967296L) != 0;
        }

        boolean I(int i2, int i3) {
            return (this.K.h(D(i2, i3), -1L).longValue() & 8589934592L) != 0;
        }

        @Override // e.a.l.a.d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new a(this, null);
        }

        @Override // e.a.l.a.d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }

        @Override // e.a.l.a.d.a, e.a.l.a.b.d
        void r() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d extends g {
        private final e.m.a.a.b a;

        d(e.m.a.a.b bVar) {
            super();
            this.a = bVar;
        }

        @Override // e.a.l.a.a.g
        public void c() {
            this.a.start();
        }

        @Override // e.a.l.a.a.g
        public void d() {
            this.a.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class e extends g {
        private final ObjectAnimator a;
        private final boolean b;

        e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i2 = z ? numberOfFrames - 1 : 0;
            int i3 = z ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i2, i3);
            if (Build.VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration(fVar.a());
            ofInt.setInterpolator(fVar);
            this.b = z2;
            this.a = ofInt;
        }

        @Override // e.a.l.a.a.g
        public boolean a() {
            return this.b;
        }

        @Override // e.a.l.a.a.g
        public void b() {
            this.a.reverse();
        }

        @Override // e.a.l.a.a.g
        public void c() {
            this.a.start();
        }

        @Override // e.a.l.a.a.g
        public void d() {
            this.a.cancel();
        }
    }

    /* loaded from: classes.dex */
    private static class f implements TimeInterpolator {
        private int[] a;
        private int b;
        private int c;

        f(AnimationDrawable animationDrawable, boolean z) {
            b(animationDrawable, z);
        }

        int a() {
            return this.c;
        }

        int b(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.b = numberOfFrames;
            int[] iArr = this.a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.a = new int[numberOfFrames];
            }
            int[] iArr2 = this.a;
            int i2 = 0;
            for (int i3 = 0; i3 < numberOfFrames; i3++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i3) - 1 : i3);
                iArr2[i3] = duration;
                i2 += duration;
            }
            this.c = i2;
            return i2;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            int i2 = (int) ((f2 * this.c) + 0.5f);
            int i3 = this.b;
            int[] iArr = this.a;
            int i4 = 0;
            while (i4 < i3 && i2 >= iArr[i4]) {
                i2 -= iArr[i4];
                i4++;
            }
            return (i4 / i3) + (i4 < i3 ? i2 / this.c : 0.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class g {
        private g() {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public a() {
        this(null, null);
    }

    a(c cVar, Resources resources) {
        super(null);
        this.u = -1;
        this.v = -1;
        h(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    public static a m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            a aVar = new a();
            aVar.n(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private void o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        q(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals("transition")) {
                        r(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    private void p() {
        onStateChange(getState());
    }

    private int q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray k2 = androidx.core.content.d.g.k(resources, theme, attributeSet, e.a.m.b.f1970h);
        int resourceId = k2.getResourceId(e.a.m.b.f1971i, 0);
        int resourceId2 = k2.getResourceId(e.a.m.b.f1972j, -1);
        Drawable j2 = resourceId2 > 0 ? n0.h().j(context, resourceId2) : null;
        k2.recycle();
        int[] k3 = k(attributeSet);
        if (j2 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                j2 = xmlPullParser.getName().equals("vector") ? e.m.a.a.h.c(resources, xmlPullParser, attributeSet, theme) : Build.VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (j2 != null) {
            return this.s.B(k3, j2, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    private int r(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray k2 = androidx.core.content.d.g.k(resources, theme, attributeSet, e.a.m.b.f1973k);
        int resourceId = k2.getResourceId(e.a.m.b.n, -1);
        int resourceId2 = k2.getResourceId(e.a.m.b.m, -1);
        int resourceId3 = k2.getResourceId(e.a.m.b.l, -1);
        Drawable j2 = resourceId3 > 0 ? n0.h().j(context, resourceId3) : null;
        boolean z = k2.getBoolean(e.a.m.b.o, false);
        k2.recycle();
        if (j2 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                j2 = xmlPullParser.getName().equals("animated-vector") ? e.m.a.a.b.a(context, resources, xmlPullParser, attributeSet, theme) : Build.VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (j2 == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.s.C(resourceId, resourceId2, j2, z);
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
    }

    private boolean s(int i2) {
        int i3;
        int G;
        g gVar;
        g gVar2 = this.t;
        if (gVar2 == null) {
            i3 = c();
        } else if (i2 == this.u) {
            return true;
        } else {
            if (i2 != this.v || !gVar2.a()) {
                i3 = this.u;
                gVar2.d();
            } else {
                gVar2.b();
                this.u = this.v;
                this.v = i2;
                return true;
            }
        }
        this.t = null;
        this.v = -1;
        this.u = -1;
        c cVar = this.s;
        int E = cVar.E(i3);
        int E2 = cVar.E(i2);
        if (E2 == 0 || E == 0 || (G = cVar.G(E, E2)) < 0) {
            return false;
        }
        boolean I = cVar.I(E, E2);
        g(G);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            gVar = new e((AnimationDrawable) current, cVar.H(E, E2), I);
        } else if (current instanceof e.m.a.a.b) {
            gVar = new d((e.m.a.a.b) current);
        } else {
            if (current instanceof Animatable) {
                gVar = new b((Animatable) current);
            }
            return false;
        }
        gVar.c();
        this.t = gVar;
        this.v = i3;
        this.u = i2;
        return true;
    }

    private void t(TypedArray typedArray) {
        c cVar = this.s;
        if (Build.VERSION.SDK_INT >= 21) {
            cVar.f1957d |= typedArray.getChangingConfigurations();
        }
        cVar.x(typedArray.getBoolean(e.a.m.b.f1966d, cVar.f1962i));
        cVar.t(typedArray.getBoolean(e.a.m.b.f1967e, cVar.l));
        cVar.u(typedArray.getInt(e.a.m.b.f1968f, cVar.A));
        cVar.v(typedArray.getInt(e.a.m.b.f1969g, cVar.B));
        setDither(typedArray.getBoolean(e.a.m.b.b, cVar.x));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // e.a.l.a.d, e.a.l.a.b
    public void h(b.d dVar) {
        super.h(dVar);
        if (dVar instanceof c) {
            this.s = (c) dVar;
        }
    }

    @Override // e.a.l.a.d, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // e.a.l.a.b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.t;
        if (gVar != null) {
            gVar.d();
            this.t = null;
            g(this.u);
            this.u = -1;
            this.v = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public c j() {
        return new c(this.s, this, null);
    }

    @Override // e.a.l.a.d, e.a.l.a.b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.w) {
            super.mutate();
            if (this == this) {
                this.s.r();
                this.w = true;
            }
        }
        return this;
    }

    public void n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray k2 = androidx.core.content.d.g.k(resources, theme, attributeSet, e.a.m.b.a);
        setVisible(k2.getBoolean(e.a.m.b.c, true), true);
        t(k2);
        i(resources);
        k2.recycle();
        o(context, resources, xmlPullParser, attributeSet, theme);
        p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // e.a.l.a.d, e.a.l.a.b, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int F = this.s.F(iArr);
        boolean z = F != c() && (s(F) || g(F));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    @Override // e.a.l.a.b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        g gVar = this.t;
        if (gVar != null && (visible || z2)) {
            if (z) {
                gVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}

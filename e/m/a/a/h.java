package e.m.a.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import e.d.j.c;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class h extends e.m.a.a.g {
    static final PorterDuff.Mode n = PorterDuff.Mode.SRC_IN;

    /* renamed from: f  reason: collision with root package name */
    private C0086h f2208f;

    /* renamed from: g  reason: collision with root package name */
    private PorterDuffColorFilter f2209g;

    /* renamed from: h  reason: collision with root package name */
    private ColorFilter f2210h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f2211i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f2212j;

    /* renamed from: k  reason: collision with root package name */
    private final float[] f2213k;
    private final Matrix l;
    private final Rect m;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends f {
        b() {
        }

        b(b bVar) {
            super(bVar);
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.a = e.d.j.c.d(string2);
            }
            this.c = androidx.core.content.d.g.g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // e.m.a.a.h.f
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (androidx.core.content.d.g.j(xmlPullParser, "pathData")) {
                TypedArray k2 = androidx.core.content.d.g.k(resources, theme, attributeSet, e.m.a.a.a.f2192d);
                f(k2, xmlPullParser);
                k2.recycle();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends f {

        /* renamed from: e  reason: collision with root package name */
        private int[] f2214e;

        /* renamed from: f  reason: collision with root package name */
        androidx.core.content.d.b f2215f;

        /* renamed from: g  reason: collision with root package name */
        float f2216g;

        /* renamed from: h  reason: collision with root package name */
        androidx.core.content.d.b f2217h;

        /* renamed from: i  reason: collision with root package name */
        float f2218i;

        /* renamed from: j  reason: collision with root package name */
        float f2219j;

        /* renamed from: k  reason: collision with root package name */
        float f2220k;
        float l;
        float m;
        Paint.Cap n;
        Paint.Join o;
        float p;

        c() {
            this.f2216g = 0.0f;
            this.f2218i = 1.0f;
            this.f2219j = 1.0f;
            this.f2220k = 0.0f;
            this.l = 1.0f;
            this.m = 0.0f;
            this.n = Paint.Cap.BUTT;
            this.o = Paint.Join.MITER;
            this.p = 4.0f;
        }

        c(c cVar) {
            super(cVar);
            this.f2216g = 0.0f;
            this.f2218i = 1.0f;
            this.f2219j = 1.0f;
            this.f2220k = 0.0f;
            this.l = 1.0f;
            this.m = 0.0f;
            this.n = Paint.Cap.BUTT;
            this.o = Paint.Join.MITER;
            this.p = 4.0f;
            this.f2214e = cVar.f2214e;
            this.f2215f = cVar.f2215f;
            this.f2216g = cVar.f2216g;
            this.f2218i = cVar.f2218i;
            this.f2217h = cVar.f2217h;
            this.c = cVar.c;
            this.f2219j = cVar.f2219j;
            this.f2220k = cVar.f2220k;
            this.l = cVar.l;
            this.m = cVar.m;
            this.n = cVar.n;
            this.o = cVar.o;
            this.p = cVar.p;
        }

        private Paint.Cap e(int i2, Paint.Cap cap) {
            return i2 != 0 ? i2 != 1 ? i2 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        private Paint.Join f(int i2, Paint.Join join) {
            return i2 != 0 ? i2 != 1 ? i2 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f2214e = null;
            if (androidx.core.content.d.g.j(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.a = e.d.j.c.d(string2);
                }
                this.f2217h = androidx.core.content.d.g.e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f2219j = androidx.core.content.d.g.f(typedArray, xmlPullParser, "fillAlpha", 12, this.f2219j);
                this.n = e(androidx.core.content.d.g.g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.n);
                this.o = f(androidx.core.content.d.g.g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.o);
                this.p = androidx.core.content.d.g.f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.p);
                this.f2215f = androidx.core.content.d.g.e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f2218i = androidx.core.content.d.g.f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f2218i);
                this.f2216g = androidx.core.content.d.g.f(typedArray, xmlPullParser, "strokeWidth", 4, this.f2216g);
                this.l = androidx.core.content.d.g.f(typedArray, xmlPullParser, "trimPathEnd", 6, this.l);
                this.m = androidx.core.content.d.g.f(typedArray, xmlPullParser, "trimPathOffset", 7, this.m);
                this.f2220k = androidx.core.content.d.g.f(typedArray, xmlPullParser, "trimPathStart", 5, this.f2220k);
                this.c = androidx.core.content.d.g.g(typedArray, xmlPullParser, "fillType", 13, this.c);
            }
        }

        @Override // e.m.a.a.h.e
        public boolean a() {
            return this.f2217h.i() || this.f2215f.i();
        }

        @Override // e.m.a.a.h.e
        public boolean b(int[] iArr) {
            return this.f2215f.j(iArr) | this.f2217h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k2 = androidx.core.content.d.g.k(resources, theme, attributeSet, e.m.a.a.a.c);
            h(k2, xmlPullParser, theme);
            k2.recycle();
        }

        float getFillAlpha() {
            return this.f2219j;
        }

        int getFillColor() {
            return this.f2217h.e();
        }

        float getStrokeAlpha() {
            return this.f2218i;
        }

        int getStrokeColor() {
            return this.f2215f.e();
        }

        float getStrokeWidth() {
            return this.f2216g;
        }

        float getTrimPathEnd() {
            return this.l;
        }

        float getTrimPathOffset() {
            return this.m;
        }

        float getTrimPathStart() {
            return this.f2220k;
        }

        void setFillAlpha(float f2) {
            this.f2219j = f2;
        }

        void setFillColor(int i2) {
            this.f2217h.k(i2);
        }

        void setStrokeAlpha(float f2) {
            this.f2218i = f2;
        }

        void setStrokeColor(int i2) {
            this.f2215f.k(i2);
        }

        void setStrokeWidth(float f2) {
            this.f2216g = f2;
        }

        void setTrimPathEnd(float f2) {
            this.l = f2;
        }

        void setTrimPathOffset(float f2) {
            this.m = f2;
        }

        void setTrimPathStart(float f2) {
            this.f2220k = f2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d extends e {
        final Matrix a;
        final ArrayList<e> b;
        float c;

        /* renamed from: d  reason: collision with root package name */
        private float f2221d;

        /* renamed from: e  reason: collision with root package name */
        private float f2222e;

        /* renamed from: f  reason: collision with root package name */
        private float f2223f;

        /* renamed from: g  reason: collision with root package name */
        private float f2224g;

        /* renamed from: h  reason: collision with root package name */
        private float f2225h;

        /* renamed from: i  reason: collision with root package name */
        private float f2226i;

        /* renamed from: j  reason: collision with root package name */
        final Matrix f2227j;

        /* renamed from: k  reason: collision with root package name */
        int f2228k;
        private int[] l;
        private String m;

        public d() {
            super();
            this.a = new Matrix();
            this.b = new ArrayList<>();
            this.c = 0.0f;
            this.f2221d = 0.0f;
            this.f2222e = 0.0f;
            this.f2223f = 1.0f;
            this.f2224g = 1.0f;
            this.f2225h = 0.0f;
            this.f2226i = 0.0f;
            this.f2227j = new Matrix();
            this.m = null;
        }

        public d(d dVar, e.c.a<String, Object> aVar) {
            super();
            f fVar;
            this.a = new Matrix();
            this.b = new ArrayList<>();
            this.c = 0.0f;
            this.f2221d = 0.0f;
            this.f2222e = 0.0f;
            this.f2223f = 1.0f;
            this.f2224g = 1.0f;
            this.f2225h = 0.0f;
            this.f2226i = 0.0f;
            Matrix matrix = new Matrix();
            this.f2227j = matrix;
            this.m = null;
            this.c = dVar.c;
            this.f2221d = dVar.f2221d;
            this.f2222e = dVar.f2222e;
            this.f2223f = dVar.f2223f;
            this.f2224g = dVar.f2224g;
            this.f2225h = dVar.f2225h;
            this.f2226i = dVar.f2226i;
            this.l = dVar.l;
            String str = dVar.m;
            this.m = str;
            this.f2228k = dVar.f2228k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f2227j);
            ArrayList<e> arrayList = dVar.b;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                e eVar = arrayList.get(i2);
                if (eVar instanceof d) {
                    this.b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        fVar = new c((c) eVar);
                    } else if (eVar instanceof b) {
                        fVar = new b((b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.b.add(fVar);
                    String str2 = fVar.b;
                    if (str2 != null) {
                        aVar.put(str2, fVar);
                    }
                }
            }
        }

        private void d() {
            this.f2227j.reset();
            this.f2227j.postTranslate(-this.f2221d, -this.f2222e);
            this.f2227j.postScale(this.f2223f, this.f2224g);
            this.f2227j.postRotate(this.c, 0.0f, 0.0f);
            this.f2227j.postTranslate(this.f2225h + this.f2221d, this.f2226i + this.f2222e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.l = null;
            this.c = androidx.core.content.d.g.f(typedArray, xmlPullParser, "rotation", 5, this.c);
            this.f2221d = typedArray.getFloat(1, this.f2221d);
            this.f2222e = typedArray.getFloat(2, this.f2222e);
            this.f2223f = androidx.core.content.d.g.f(typedArray, xmlPullParser, "scaleX", 3, this.f2223f);
            this.f2224g = androidx.core.content.d.g.f(typedArray, xmlPullParser, "scaleY", 4, this.f2224g);
            this.f2225h = androidx.core.content.d.g.f(typedArray, xmlPullParser, "translateX", 6, this.f2225h);
            this.f2226i = androidx.core.content.d.g.f(typedArray, xmlPullParser, "translateY", 7, this.f2226i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.m = string;
            }
            d();
        }

        @Override // e.m.a.a.h.e
        public boolean a() {
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                if (this.b.get(i2).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // e.m.a.a.h.e
        public boolean b(int[] iArr) {
            boolean z = false;
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                z |= this.b.get(i2).b(iArr);
            }
            return z;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k2 = androidx.core.content.d.g.k(resources, theme, attributeSet, e.m.a.a.a.b);
            e(k2, xmlPullParser);
            k2.recycle();
        }

        public String getGroupName() {
            return this.m;
        }

        public Matrix getLocalMatrix() {
            return this.f2227j;
        }

        public float getPivotX() {
            return this.f2221d;
        }

        public float getPivotY() {
            return this.f2222e;
        }

        public float getRotation() {
            return this.c;
        }

        public float getScaleX() {
            return this.f2223f;
        }

        public float getScaleY() {
            return this.f2224g;
        }

        public float getTranslateX() {
            return this.f2225h;
        }

        public float getTranslateY() {
            return this.f2226i;
        }

        public void setPivotX(float f2) {
            if (f2 != this.f2221d) {
                this.f2221d = f2;
                d();
            }
        }

        public void setPivotY(float f2) {
            if (f2 != this.f2222e) {
                this.f2222e = f2;
                d();
            }
        }

        public void setRotation(float f2) {
            if (f2 != this.c) {
                this.c = f2;
                d();
            }
        }

        public void setScaleX(float f2) {
            if (f2 != this.f2223f) {
                this.f2223f = f2;
                d();
            }
        }

        public void setScaleY(float f2) {
            if (f2 != this.f2224g) {
                this.f2224g = f2;
                d();
            }
        }

        public void setTranslateX(float f2) {
            if (f2 != this.f2225h) {
                this.f2225h = f2;
                d();
            }
        }

        public void setTranslateY(float f2) {
            if (f2 != this.f2226i) {
                this.f2226i = f2;
                d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class f extends e {
        protected c.b[] a;
        String b;
        int c;

        /* renamed from: d  reason: collision with root package name */
        int f2229d;

        public f() {
            super();
            this.a = null;
            this.c = 0;
        }

        public f(f fVar) {
            super();
            this.a = null;
            this.c = 0;
            this.b = fVar.b;
            this.f2229d = fVar.f2229d;
            this.a = e.d.j.c.f(fVar.a);
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            c.b[] bVarArr = this.a;
            if (bVarArr != null) {
                c.b.e(bVarArr, path);
            }
        }

        public c.b[] getPathData() {
            return this.a;
        }

        public String getPathName() {
            return this.b;
        }

        public void setPathData(c.b[] bVarArr) {
            if (!e.d.j.c.b(this.a, bVarArr)) {
                this.a = e.d.j.c.f(bVarArr);
            } else {
                e.d.j.c.j(this.a, bVarArr);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class g {
        private static final Matrix q = new Matrix();
        private final Path a;
        private final Path b;
        private final Matrix c;

        /* renamed from: d  reason: collision with root package name */
        Paint f2230d;

        /* renamed from: e  reason: collision with root package name */
        Paint f2231e;

        /* renamed from: f  reason: collision with root package name */
        private PathMeasure f2232f;

        /* renamed from: g  reason: collision with root package name */
        private int f2233g;

        /* renamed from: h  reason: collision with root package name */
        final d f2234h;

        /* renamed from: i  reason: collision with root package name */
        float f2235i;

        /* renamed from: j  reason: collision with root package name */
        float f2236j;

        /* renamed from: k  reason: collision with root package name */
        float f2237k;
        float l;
        int m;
        String n;
        Boolean o;
        final e.c.a<String, Object> p;

        public g() {
            this.c = new Matrix();
            this.f2235i = 0.0f;
            this.f2236j = 0.0f;
            this.f2237k = 0.0f;
            this.l = 0.0f;
            this.m = 255;
            this.n = null;
            this.o = null;
            this.p = new e.c.a<>();
            this.f2234h = new d();
            this.a = new Path();
            this.b = new Path();
        }

        public g(g gVar) {
            this.c = new Matrix();
            this.f2235i = 0.0f;
            this.f2236j = 0.0f;
            this.f2237k = 0.0f;
            this.l = 0.0f;
            this.m = 255;
            this.n = null;
            this.o = null;
            e.c.a<String, Object> aVar = new e.c.a<>();
            this.p = aVar;
            this.f2234h = new d(gVar.f2234h, aVar);
            this.a = new Path(gVar.a);
            this.b = new Path(gVar.b);
            this.f2235i = gVar.f2235i;
            this.f2236j = gVar.f2236j;
            this.f2237k = gVar.f2237k;
            this.l = gVar.l;
            this.f2233g = gVar.f2233g;
            this.m = gVar.m;
            this.n = gVar.n;
            String str = gVar.n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.o = gVar.o;
        }

        private static float a(float f2, float f3, float f4, float f5) {
            return (f2 * f5) - (f3 * f4);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            dVar.a.set(matrix);
            dVar.a.preConcat(dVar.f2227j);
            canvas.save();
            for (int i4 = 0; i4 < dVar.b.size(); i4++) {
                e eVar = dVar.b.get(i4);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.a, canvas, i2, i3, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, i2, i3, colorFilter);
                }
            }
            canvas.restore();
        }

        private void d(d dVar, f fVar, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            float f2 = i2 / this.f2237k;
            float f3 = i3 / this.l;
            float min = Math.min(f2, f3);
            Matrix matrix = dVar.a;
            this.c.set(matrix);
            this.c.postScale(f2, f3);
            float e2 = e(matrix);
            if (e2 != 0.0f) {
                fVar.d(this.a);
                Path path = this.a;
                this.b.reset();
                if (fVar.c()) {
                    this.b.setFillType(fVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    this.b.addPath(path, this.c);
                    canvas.clipPath(this.b);
                    return;
                }
                c cVar = (c) fVar;
                float f4 = cVar.f2220k;
                if (!(f4 == 0.0f && cVar.l == 1.0f)) {
                    float f5 = cVar.m;
                    float f6 = (f4 + f5) % 1.0f;
                    float f7 = (cVar.l + f5) % 1.0f;
                    if (this.f2232f == null) {
                        this.f2232f = new PathMeasure();
                    }
                    this.f2232f.setPath(this.a, false);
                    float length = this.f2232f.getLength();
                    float f8 = f6 * length;
                    float f9 = f7 * length;
                    path.reset();
                    if (f8 > f9) {
                        this.f2232f.getSegment(f8, length, path, true);
                        this.f2232f.getSegment(0.0f, f9, path, true);
                    } else {
                        this.f2232f.getSegment(f8, f9, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.b.addPath(path, this.c);
                if (cVar.f2217h.l()) {
                    androidx.core.content.d.b bVar = cVar.f2217h;
                    if (this.f2231e == null) {
                        Paint paint = new Paint(1);
                        this.f2231e = paint;
                        paint.setStyle(Paint.Style.FILL);
                    }
                    Paint paint2 = this.f2231e;
                    if (bVar.h()) {
                        Shader f10 = bVar.f();
                        f10.setLocalMatrix(this.c);
                        paint2.setShader(f10);
                        paint2.setAlpha(Math.round(cVar.f2219j * 255.0f));
                    } else {
                        paint2.setShader(null);
                        paint2.setAlpha(255);
                        paint2.setColor(h.a(bVar.e(), cVar.f2219j));
                    }
                    paint2.setColorFilter(colorFilter);
                    this.b.setFillType(cVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.b, paint2);
                }
                if (cVar.f2215f.l()) {
                    androidx.core.content.d.b bVar2 = cVar.f2215f;
                    if (this.f2230d == null) {
                        Paint paint3 = new Paint(1);
                        this.f2230d = paint3;
                        paint3.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint4 = this.f2230d;
                    Paint.Join join = cVar.o;
                    if (join != null) {
                        paint4.setStrokeJoin(join);
                    }
                    Paint.Cap cap = cVar.n;
                    if (cap != null) {
                        paint4.setStrokeCap(cap);
                    }
                    paint4.setStrokeMiter(cVar.p);
                    if (bVar2.h()) {
                        Shader f11 = bVar2.f();
                        f11.setLocalMatrix(this.c);
                        paint4.setShader(f11);
                        paint4.setAlpha(Math.round(cVar.f2218i * 255.0f));
                    } else {
                        paint4.setShader(null);
                        paint4.setAlpha(255);
                        paint4.setColor(h.a(bVar2.e(), cVar.f2218i));
                    }
                    paint4.setColorFilter(colorFilter);
                    paint4.setStrokeWidth(cVar.f2216g * min * e2);
                    canvas.drawPath(this.b, paint4);
                }
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot(fArr[0], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a) / max;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            c(this.f2234h, q, canvas, i2, i3, colorFilter);
        }

        public boolean f() {
            if (this.o == null) {
                this.o = Boolean.valueOf(this.f2234h.a());
            }
            return this.o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f2234h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.m;
        }

        public void setAlpha(float f2) {
            setRootAlpha((int) (f2 * 255.0f));
        }

        public void setRootAlpha(int i2) {
            this.m = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e.m.a.a.h$h  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0086h extends Drawable.ConstantState {
        int a;
        g b;
        ColorStateList c;

        /* renamed from: d  reason: collision with root package name */
        PorterDuff.Mode f2238d;

        /* renamed from: e  reason: collision with root package name */
        boolean f2239e;

        /* renamed from: f  reason: collision with root package name */
        Bitmap f2240f;

        /* renamed from: g  reason: collision with root package name */
        ColorStateList f2241g;

        /* renamed from: h  reason: collision with root package name */
        PorterDuff.Mode f2242h;

        /* renamed from: i  reason: collision with root package name */
        int f2243i;

        /* renamed from: j  reason: collision with root package name */
        boolean f2244j;

        /* renamed from: k  reason: collision with root package name */
        boolean f2245k;
        Paint l;

        public C0086h() {
            this.c = null;
            this.f2238d = h.n;
            this.b = new g();
        }

        public C0086h(C0086h hVar) {
            this.c = null;
            this.f2238d = h.n;
            if (hVar != null) {
                this.a = hVar.a;
                g gVar = new g(hVar.b);
                this.b = gVar;
                if (hVar.b.f2231e != null) {
                    gVar.f2231e = new Paint(hVar.b.f2231e);
                }
                if (hVar.b.f2230d != null) {
                    this.b.f2230d = new Paint(hVar.b.f2230d);
                }
                this.c = hVar.c;
                this.f2238d = hVar.f2238d;
                this.f2239e = hVar.f2239e;
            }
        }

        public boolean a(int i2, int i3) {
            return i2 == this.f2240f.getWidth() && i3 == this.f2240f.getHeight();
        }

        public boolean b() {
            return !this.f2245k && this.f2241g == this.c && this.f2242h == this.f2238d && this.f2244j == this.f2239e && this.f2243i == this.b.getRootAlpha();
        }

        public void c(int i2, int i3) {
            if (this.f2240f == null || !a(i2, i3)) {
                this.f2240f = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                this.f2245k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f2240f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.l == null) {
                Paint paint = new Paint();
                this.l = paint;
                paint.setFilterBitmap(true);
            }
            this.l.setAlpha(this.b.getRootAlpha());
            this.l.setColorFilter(colorFilter);
            return this.l;
        }

        public boolean f() {
            return this.b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a;
        }

        public boolean h(int[] iArr) {
            boolean g2 = this.b.g(iArr);
            this.f2245k |= g2;
            return g2;
        }

        public void i() {
            this.f2241g = this.c;
            this.f2242h = this.f2238d;
            this.f2243i = this.b.getRootAlpha();
            this.f2244j = this.f2239e;
            this.f2245k = false;
        }

        public void j(int i2, int i3) {
            this.f2240f.eraseColor(0);
            this.b.b(new Canvas(this.f2240f), i2, i3, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new h(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new h(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class i extends Drawable.ConstantState {
        private final Drawable.ConstantState a;

        public i(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            h hVar = new h();
            hVar.f2207e = (VectorDrawable) this.a.newDrawable();
            return hVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            h hVar = new h();
            hVar.f2207e = (VectorDrawable) this.a.newDrawable(resources);
            return hVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            h hVar = new h();
            hVar.f2207e = (VectorDrawable) this.a.newDrawable(resources, theme);
            return hVar;
        }
    }

    h() {
        this.f2212j = true;
        this.f2213k = new float[9];
        this.l = new Matrix();
        this.m = new Rect();
        this.f2208f = new C0086h();
    }

    h(C0086h hVar) {
        this.f2212j = true;
        this.f2213k = new float[9];
        this.l = new Matrix();
        this.m = new Rect();
        this.f2208f = hVar;
        this.f2209g = j(this.f2209g, hVar.c, hVar.f2238d);
    }

    static int a(int i2, float f2) {
        return (i2 & 16777215) | (((int) (Color.alpha(i2) * f2)) << 24);
    }

    public static h b(Resources resources, int i2, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            h hVar = new h();
            hVar.f2207e = androidx.core.content.d.f.d(resources, i2, theme);
            new i(hVar.f2207e.getConstantState());
            return hVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i2);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            while (true) {
                next = xml.next();
                if (next == 2 || next == 1) {
                    break;
                }
            }
            if (next == 2) {
                return c(resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        }
    }

    public static h c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        h hVar = new h();
        hVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i2;
        int i3;
        b bVar;
        C0086h hVar = this.f2208f;
        g gVar = hVar.b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f2234h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.p.put(cVar.getPathName(), cVar);
                    }
                    z = false;
                    bVar = cVar;
                } else if ("clip-path".equals(name)) {
                    b bVar2 = new b();
                    bVar2.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.b.add(bVar2);
                    String pathName = bVar2.getPathName();
                    bVar = bVar2;
                    if (pathName != null) {
                        gVar.p.put(bVar2.getPathName(), bVar2);
                        bVar = bVar2;
                    }
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.p.put(dVar2.getGroupName(), dVar2);
                    }
                    i2 = hVar.a;
                    i3 = dVar2.f2228k;
                    hVar.a = i3 | i2;
                }
                i2 = hVar.a;
                i3 = bVar.f2229d;
                hVar.a = i3 | i2;
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean f() {
        return Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && androidx.core.graphics.drawable.a.e(this) == 1;
    }

    private static PorterDuff.Mode g(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        C0086h hVar = this.f2208f;
        g gVar = hVar.b;
        hVar.f2238d = g(androidx.core.content.d.g.g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList c2 = androidx.core.content.d.g.c(typedArray, xmlPullParser, theme, "tint", 1);
        if (c2 != null) {
            hVar.c = c2;
        }
        hVar.f2239e = androidx.core.content.d.g.a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f2239e);
        gVar.f2237k = androidx.core.content.d.g.f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f2237k);
        float f2 = androidx.core.content.d.g.f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.l);
        gVar.l = f2;
        if (gVar.f2237k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f2 > 0.0f) {
            gVar.f2235i = typedArray.getDimension(3, gVar.f2235i);
            float dimension = typedArray.getDimension(2, gVar.f2236j);
            gVar.f2236j = dimension;
            if (gVar.f2235i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                gVar.setAlpha(androidx.core.content.d.g.f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.n = string;
                    gVar.p.put(string, gVar);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f2207e;
        if (drawable == null) {
            return false;
        }
        androidx.core.graphics.drawable.a.b(drawable);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object d(String str) {
        return this.f2208f.b.p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f2207e;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.m);
        if (this.m.width() > 0 && this.m.height() > 0) {
            ColorFilter colorFilter = this.f2210h;
            if (colorFilter == null) {
                colorFilter = this.f2209g;
            }
            canvas.getMatrix(this.l);
            this.l.getValues(this.f2213k);
            float abs = Math.abs(this.f2213k[0]);
            float abs2 = Math.abs(this.f2213k[4]);
            float abs3 = Math.abs(this.f2213k[1]);
            float abs4 = Math.abs(this.f2213k[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (this.m.width() * abs));
            int min2 = Math.min(2048, (int) (this.m.height() * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.m;
                canvas.translate(rect.left, rect.top);
                if (f()) {
                    canvas.translate(this.m.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.m.offsetTo(0, 0);
                this.f2208f.c(min, min2);
                if (!this.f2212j) {
                    this.f2208f.j(min, min2);
                } else if (!this.f2208f.b()) {
                    this.f2208f.j(min, min2);
                    this.f2208f.i();
                }
                this.f2208f.d(canvas, colorFilter, this.m);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f2207e;
        return drawable != null ? androidx.core.graphics.drawable.a.c(drawable) : this.f2208f.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f2207e;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f2208f.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f2207e;
        return drawable != null ? androidx.core.graphics.drawable.a.d(drawable) : this.f2210h;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f2207e != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f2207e.getConstantState());
        }
        this.f2208f.a = getChangingConfigurations();
        return this.f2208f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f2207e;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f2208f.b.f2236j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f2207e;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f2208f.b.f2235i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f2207e;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(boolean z) {
        this.f2212j = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f2207e;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f2207e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.f(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0086h hVar = this.f2208f;
        hVar.b = new g();
        TypedArray k2 = androidx.core.content.d.g.k(resources, theme, attributeSet, e.m.a.a.a.a);
        i(k2, xmlPullParser, theme);
        k2.recycle();
        hVar.a = getChangingConfigurations();
        hVar.f2245k = true;
        e(resources, xmlPullParser, attributeSet, theme);
        this.f2209g = j(this.f2209g, hVar.c, hVar.f2238d);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f2207e;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f2207e;
        return drawable != null ? androidx.core.graphics.drawable.a.g(drawable) : this.f2208f.f2239e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        C0086h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f2207e;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((hVar = this.f2208f) != null && (hVar.g() || ((colorStateList = this.f2208f.c) != null && colorStateList.isStateful())));
    }

    PorterDuffColorFilter j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f2207e;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f2211i && super.mutate() == this) {
            this.f2208f = new C0086h(this.f2208f);
            this.f2211i = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2207e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f2207e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        C0086h hVar = this.f2208f;
        ColorStateList colorStateList = hVar.c;
        if (!(colorStateList == null || (mode = hVar.f2238d) == null)) {
            this.f2209g = j(this.f2209g, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!hVar.g() || !hVar.h(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f2207e;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        Drawable drawable = this.f2207e;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.f2208f.b.getRootAlpha() != i2) {
            this.f2208f.b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f2207e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.i(drawable, z);
        } else {
            this.f2208f.f2239e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f2207e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f2210h = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTint(int i2) {
        Drawable drawable = this.f2207e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.m(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f2207e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, colorStateList);
            return;
        }
        C0086h hVar = this.f2208f;
        if (hVar.c != colorStateList) {
            hVar.c = colorStateList;
            this.f2209g = j(this.f2209g, colorStateList, hVar.f2238d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f2207e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, mode);
            return;
        }
        C0086h hVar = this.f2208f;
        if (hVar.f2238d != mode) {
            hVar.f2238d = mode;
            this.f2209g = j(this.f2209g, hVar.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f2207e;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f2207e;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}

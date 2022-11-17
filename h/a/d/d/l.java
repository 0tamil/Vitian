package h.a.d.d;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import h.a.d.d.l;
import io.flutter.embedding.android.b;
import io.flutter.embedding.android.h;
import io.flutter.embedding.android.k;
import io.flutter.embedding.android.n;
import io.flutter.embedding.engine.FlutterOverlaySurface;
import io.flutter.embedding.engine.f.d;
import io.flutter.embedding.engine.j.j;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.plugin.editing.e;
import io.flutter.view.c;
import io.flutter.view.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/* loaded from: classes.dex */
public class l implements k {
    private b b;
    private Context c;

    /* renamed from: d  reason: collision with root package name */
    private k f2899d;

    /* renamed from: e  reason: collision with root package name */
    private h f2900e;

    /* renamed from: f  reason: collision with root package name */
    private e f2901f;

    /* renamed from: g  reason: collision with root package name */
    private j f2902g;
    private int m = 0;
    private boolean n = false;
    private boolean o = true;
    private boolean s = false;
    private final j.f t = new a();
    private final i a = new i();

    /* renamed from: h  reason: collision with root package name */
    private final d f2903h = new d();

    /* renamed from: k  reason: collision with root package name */
    private final SparseArray<io.flutter.embedding.android.h> f2906k = new SparseArray<>();
    private final HashSet<Integer> p = new HashSet<>();
    private final HashSet<Integer> q = new HashSet<>();
    private final SparseArray<j> l = new SparseArray<>();

    /* renamed from: i  reason: collision with root package name */
    private final SparseArray<f> f2904i = new SparseArray<>();

    /* renamed from: j  reason: collision with root package name */
    private final SparseArray<io.flutter.embedding.engine.mutatorsstack.a> f2905j = new SparseArray<>();
    private final n r = n.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements j.f {
        a() {
        }

        private void j(int i2) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < i2) {
                throw new IllegalStateException("Trying to use platform views with API " + i3 + ", required API level is: " + i2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public /* synthetic */ void l(int i2, View view, boolean z) {
            l lVar = l.this;
            if (z) {
                lVar.f2902g.d(i2);
            } else if (lVar.f2901f != null) {
                l.this.f2901f.l(i2);
            }
        }

        @Override // io.flutter.embedding.engine.j.j.f
        public void a(int i2) {
            StringBuilder sb;
            String str;
            f fVar = (f) l.this.f2904i.get(i2);
            if (fVar == null) {
                sb = new StringBuilder();
                str = "Clearing focus on an unknown view with id: ";
            } else {
                View d2 = fVar.d();
                if (d2 == null) {
                    sb = new StringBuilder();
                    str = "Clearing focus on a null view with id: ";
                } else {
                    d2.clearFocus();
                    return;
                }
            }
            sb.append(str);
            sb.append(i2);
            h.a.b.b("PlatformViewsController", sb.toString());
        }

        @Override // io.flutter.embedding.engine.j.j.f
        @TargetApi(19)
        public void b(j.c cVar) {
            j(19);
            if (l.c0(cVar.f3083g)) {
                g a = l.this.a.a(cVar.b);
                if (a != null) {
                    Object obj = null;
                    if (cVar.f3084h != null) {
                        obj = a.b().a(cVar.f3084h);
                    }
                    f a2 = a.a(l.this.c, cVar.a, obj);
                    a2.d().setLayoutDirection(cVar.f3083g);
                    l.this.f2904i.put(cVar.a, a2);
                    return;
                }
                throw new IllegalStateException("Trying to create a platform view of unregistered type: " + cVar.b);
            }
            throw new IllegalStateException("Trying to create a view with unknown direction value: " + cVar.f3083g + "(view id: " + cVar.a + ")");
        }

        @Override // io.flutter.embedding.engine.j.j.f
        public j.b c(j.d dVar) {
            int i2 = dVar.a;
            j jVar = (j) l.this.l.get(i2);
            if (jVar == null) {
                h.a.b.b("PlatformViewsController", "Resizing unknown platform view with id: " + i2);
                return null;
            }
            int b0 = l.this.b0(dVar.b);
            int b02 = l.this.b0(dVar.c);
            if (b0 > jVar.d() || b02 > jVar.c()) {
                jVar.g(b0, b02);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) jVar.getLayoutParams();
            layoutParams.width = b0;
            layoutParams.height = b02;
            jVar.h(layoutParams);
            return new j.b(l.this.Z(jVar.d()), l.this.Z(jVar.c()));
        }

        @Override // io.flutter.embedding.engine.j.j.f
        public void d(boolean z) {
            l.this.o = z;
        }

        @Override // io.flutter.embedding.engine.j.j.f
        public void e(int i2, double d2, double d3) {
            j jVar = (j) l.this.l.get(i2);
            if (jVar == null) {
                h.a.b.b("PlatformViewsController", "Setting offset for unknown platform view with id: " + i2);
                return;
            }
            int b0 = l.this.b0(d2);
            int b02 = l.this.b0(d3);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) jVar.getLayoutParams();
            layoutParams.topMargin = b0;
            layoutParams.leftMargin = b02;
            jVar.h(layoutParams);
        }

        @Override // io.flutter.embedding.engine.j.j.f
        @TargetApi(17)
        public void f(int i2, int i3) {
            StringBuilder sb;
            String str;
            if (l.c0(i3)) {
                f fVar = (f) l.this.f2904i.get(i2);
                if (fVar == null) {
                    sb = new StringBuilder();
                    str = "Setting direction to an unknown view with id: ";
                } else {
                    j(20);
                    View d2 = fVar.d();
                    if (d2 == null) {
                        sb = new StringBuilder();
                        str = "Setting direction to a null view with id: ";
                    } else {
                        d2.setLayoutDirection(i3);
                        return;
                    }
                }
                sb.append(str);
                sb.append(i2);
                h.a.b.b("PlatformViewsController", sb.toString());
                return;
            }
            throw new IllegalStateException("Trying to set unknown direction value: " + i3 + "(view id: " + i2 + ")");
        }

        @Override // io.flutter.embedding.engine.j.j.f
        @TargetApi(e.a.j.b3)
        public long g(j.c cVar) {
            long j2;
            j jVar;
            final int i2 = cVar.a;
            if (l.this.l.get(i2) != null) {
                throw new IllegalStateException("Trying to create an already created platform view, view id: " + i2);
            } else if (!l.c0(cVar.f3083g)) {
                throw new IllegalStateException("Trying to create a view with unknown direction value: " + cVar.f3083g + "(view id: " + i2 + ")");
            } else if (l.this.f2900e == null) {
                throw new IllegalStateException("Texture registry is null. This means that platform views controller was detached, view id: " + i2);
            } else if (l.this.f2899d != null) {
                g a = l.this.a.a(cVar.b);
                if (a != null) {
                    Object obj = null;
                    if (cVar.f3084h != null) {
                        obj = a.b().a(cVar.f3084h);
                    }
                    f a2 = a.a(l.this.c, i2, obj);
                    l.this.f2904i.put(i2, a2);
                    if (l.this.s) {
                        jVar = new j(l.this.c);
                        j2 = -1;
                    } else {
                        h.b c = l.this.f2900e.c();
                        jVar = new j(l.this.c, c);
                        j2 = c.a();
                    }
                    jVar.k(l.this.b);
                    int b0 = l.this.b0(cVar.c);
                    int b02 = l.this.b0(cVar.f3080d);
                    jVar.g(b0, b02);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b0, b02);
                    int b03 = l.this.b0(cVar.f3081e);
                    int b04 = l.this.b0(cVar.f3082f);
                    layoutParams.topMargin = b03;
                    layoutParams.leftMargin = b04;
                    jVar.h(layoutParams);
                    jVar.setLayoutDirection(cVar.f3083g);
                    View d2 = a2.d();
                    if (d2 == null) {
                        throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
                    } else if (d2.getParent() == null) {
                        jVar.addView(d2);
                        jVar.i(new View.OnFocusChangeListener() { // from class: h.a.d.d.a
                            @Override // android.view.View.OnFocusChangeListener
                            public final void onFocusChange(View view, boolean z) {
                                l.a.this.l(i2, view, z);
                            }
                        });
                        l.this.f2899d.addView(jVar);
                        l.this.l.append(i2, jVar);
                        return j2;
                    } else {
                        throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
                    }
                } else {
                    throw new IllegalStateException("Trying to create a platform view of unregistered type: " + cVar.b);
                }
            } else {
                throw new IllegalStateException("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: " + i2);
            }
        }

        @Override // io.flutter.embedding.engine.j.j.f
        public void h(int i2) {
            f fVar = (f) l.this.f2904i.get(i2);
            if (fVar != null) {
                l.this.f2904i.remove(i2);
                fVar.a();
            }
            j jVar = (j) l.this.l.get(i2);
            if (jVar != null) {
                jVar.removeAllViews();
                jVar.f();
                jVar.m();
                ViewGroup viewGroup = (ViewGroup) jVar.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(jVar);
                }
                l.this.l.remove(i2);
                return;
            }
            io.flutter.embedding.engine.mutatorsstack.a aVar = (io.flutter.embedding.engine.mutatorsstack.a) l.this.f2905j.get(i2);
            if (aVar != null) {
                aVar.removeAllViews();
                aVar.b();
                ViewGroup viewGroup2 = (ViewGroup) aVar.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(aVar);
                }
                l.this.f2905j.remove(i2);
            }
        }

        @Override // io.flutter.embedding.engine.j.j.f
        public void i(j.e eVar) {
            StringBuilder sb;
            String str;
            int i2 = eVar.a;
            f fVar = (f) l.this.f2904i.get(i2);
            if (fVar == null) {
                sb = new StringBuilder();
                str = "Sending touch to an unknown view with id: ";
            } else {
                j(20);
                MotionEvent a0 = l.this.a0(l.this.c.getResources().getDisplayMetrics().density, eVar);
                View d2 = fVar.d();
                if (d2 == null) {
                    sb = new StringBuilder();
                    str = "Sending touch to a null view with id: ";
                } else {
                    d2.dispatchTouchEvent(a0);
                    return;
                }
            }
            sb.append(str);
            sb.append(i2);
            h.a.b.b("PlatformViewsController", sb.toString());
        }
    }

    private void C(boolean z) {
        for (int i2 = 0; i2 < this.f2906k.size(); i2++) {
            int keyAt = this.f2906k.keyAt(i2);
            io.flutter.embedding.android.h valueAt = this.f2906k.valueAt(i2);
            if (this.p.contains(Integer.valueOf(keyAt))) {
                this.f2899d.j(valueAt);
                z &= valueAt.d();
            } else {
                if (!this.n) {
                    valueAt.c();
                }
                valueAt.setVisibility(8);
            }
        }
        for (int i3 = 0; i3 < this.f2905j.size(); i3++) {
            int keyAt2 = this.f2905j.keyAt(i3);
            io.flutter.embedding.engine.mutatorsstack.a aVar = this.f2905j.get(keyAt2);
            if (!this.q.contains(Integer.valueOf(keyAt2)) || (!z && this.o)) {
                aVar.setVisibility(8);
            } else {
                aVar.setVisibility(0);
            }
        }
    }

    private void D() {
        while (this.f2904i.size() > 0) {
            this.t.h(this.f2904i.keyAt(0));
        }
    }

    private float E() {
        return this.c.getResources().getDisplayMetrics().density;
    }

    private void H() {
        if (this.o && !this.n) {
            this.f2899d.m();
            this.n = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public /* synthetic */ void J(int i2, View view, boolean z) {
        if (z) {
            this.f2902g.d(i2);
            return;
        }
        e eVar = this.f2901f;
        if (eVar != null) {
            eVar.l(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ void L() {
        C(false);
    }

    private static MotionEvent.PointerCoords T(Object obj, float f2) {
        List list = (List) obj;
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        pointerCoords.orientation = (float) ((Double) list.get(0)).doubleValue();
        pointerCoords.pressure = (float) ((Double) list.get(1)).doubleValue();
        pointerCoords.size = (float) ((Double) list.get(2)).doubleValue();
        pointerCoords.toolMajor = ((float) ((Double) list.get(3)).doubleValue()) * f2;
        pointerCoords.toolMinor = ((float) ((Double) list.get(4)).doubleValue()) * f2;
        pointerCoords.touchMajor = ((float) ((Double) list.get(5)).doubleValue()) * f2;
        pointerCoords.touchMinor = ((float) ((Double) list.get(6)).doubleValue()) * f2;
        pointerCoords.x = ((float) ((Double) list.get(7)).doubleValue()) * f2;
        pointerCoords.y = ((float) ((Double) list.get(8)).doubleValue()) * f2;
        return pointerCoords;
    }

    private static List<MotionEvent.PointerCoords> U(Object obj, float f2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) obj) {
            arrayList.add(T(obj2, f2));
        }
        return arrayList;
    }

    private static MotionEvent.PointerProperties V(Object obj) {
        List list = (List) obj;
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        pointerProperties.id = ((Integer) list.get(0)).intValue();
        pointerProperties.toolType = ((Integer) list.get(1)).intValue();
        return pointerProperties;
    }

    private static List<MotionEvent.PointerProperties> W(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) obj) {
            arrayList.add(V(obj2));
        }
        return arrayList;
    }

    private void X() {
        if (this.f2899d == null) {
            h.a.b.b("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            return;
        }
        for (int i2 = 0; i2 < this.f2906k.size(); i2++) {
            this.f2899d.removeView(this.f2906k.valueAt(i2));
        }
        this.f2906k.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int Z(double d2) {
        return (int) Math.round(d2 / E());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int b0(double d2) {
        return (int) Math.round(d2 * E());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c0(int i2) {
        return i2 == 0 || i2 == 1;
    }

    public void A() {
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            this.f2899d.removeView(this.l.get(i2));
        }
        for (int i3 = 0; i3 < this.f2905j.size(); i3++) {
            this.f2899d.removeView(this.f2905j.get(i3));
        }
        y();
        X();
        this.f2899d = null;
        this.n = false;
        for (int i4 = 0; i4 < this.f2904i.size(); i4++) {
            this.f2904i.valueAt(i4).c();
        }
    }

    public void B() {
        this.f2901f = null;
    }

    public h F() {
        return this.a;
    }

    void G(final int i2) {
        f fVar = this.f2904i.get(i2);
        if (fVar == null) {
            throw new IllegalStateException("Platform view hasn't been initialized from the platform view channel.");
        } else if (this.f2905j.get(i2) == null) {
            if (fVar.d() == null) {
                throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
            } else if (fVar.d().getParent() == null) {
                Context context = this.c;
                io.flutter.embedding.engine.mutatorsstack.a aVar = new io.flutter.embedding.engine.mutatorsstack.a(context, context.getResources().getDisplayMetrics().density, this.b);
                aVar.setOnDescendantFocusChangeListener(new View.OnFocusChangeListener() { // from class: h.a.d.d.c
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z) {
                        l.this.J(i2, view, z);
                    }
                });
                this.f2905j.put(i2, aVar);
                aVar.addView(fVar.d());
                this.f2899d.addView(aVar);
            } else {
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            }
        }
    }

    public void M() {
    }

    public void N() {
        this.p.clear();
        this.q.clear();
    }

    public void O() {
        D();
    }

    public void P(int i2, int i3, int i4, int i5, int i6) {
        if (this.f2906k.get(i2) != null) {
            H();
            io.flutter.embedding.android.h hVar = this.f2906k.get(i2);
            if (hVar.getParent() == null) {
                this.f2899d.addView(hVar);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i5, i6);
            layoutParams.leftMargin = i3;
            layoutParams.topMargin = i4;
            hVar.setLayoutParams(layoutParams);
            hVar.setVisibility(0);
            hVar.bringToFront();
            this.p.add(Integer.valueOf(i2));
            return;
        }
        throw new IllegalStateException("The overlay surface (id:" + i2 + ") doesn't exist");
    }

    public void Q(int i2, int i3, int i4, int i5, int i6, int i7, int i8, FlutterMutatorsStack flutterMutatorsStack) {
        H();
        G(i2);
        io.flutter.embedding.engine.mutatorsstack.a aVar = this.f2905j.get(i2);
        aVar.a(flutterMutatorsStack, i3, i4, i5, i6);
        aVar.setVisibility(0);
        aVar.bringToFront();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i7, i8);
        View d2 = this.f2904i.get(i2).d();
        if (d2 != null) {
            d2.setLayoutParams(layoutParams);
            d2.bringToFront();
        }
        this.q.add(Integer.valueOf(i2));
    }

    public void R() {
        boolean z = false;
        if (!this.n || !this.q.isEmpty()) {
            if (this.n && this.f2899d.g()) {
                z = true;
            }
            C(z);
            return;
        }
        this.n = false;
        this.f2899d.x(new Runnable() { // from class: h.a.d.d.b
            @Override // java.lang.Runnable
            public final void run() {
                l.this.L();
            }
        });
    }

    public void S() {
        D();
    }

    public void Y(boolean z) {
        this.s = z;
    }

    @Override // h.a.d.d.k
    public void a() {
        this.f2903h.a(null);
    }

    public MotionEvent a0(float f2, j.e eVar) {
        MotionEvent b = this.r.b(n.a.c(eVar.p));
        MotionEvent.PointerProperties[] pointerPropertiesArr = (MotionEvent.PointerProperties[]) W(eVar.f3087f).toArray(new MotionEvent.PointerProperties[eVar.f3086e]);
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) U(eVar.f3088g, f2).toArray(new MotionEvent.PointerCoords[eVar.f3086e]);
        return b != null ? MotionEvent.obtain(b.getDownTime(), b.getEventTime(), b.getAction(), eVar.f3086e, pointerPropertiesArr, pointerCoordsArr, b.getMetaState(), b.getButtonState(), b.getXPrecision(), b.getYPrecision(), b.getDeviceId(), b.getEdgeFlags(), b.getSource(), b.getFlags()) : MotionEvent.obtain(eVar.b.longValue(), eVar.c.longValue(), eVar.f3085d, eVar.f3086e, pointerPropertiesArr, pointerCoordsArr, eVar.f3089h, eVar.f3090i, eVar.f3091j, eVar.f3092k, eVar.l, eVar.m, eVar.n, eVar.o);
    }

    @Override // h.a.d.d.k
    public void b(c cVar) {
        this.f2903h.a(cVar);
    }

    @Override // h.a.d.d.k
    public View c(int i2) {
        f fVar = this.f2904i.get(i2);
        if (fVar == null) {
            return null;
        }
        return fVar.d();
    }

    public void s(Context context, h hVar, d dVar) {
        if (this.c == null) {
            this.c = context;
            this.f2900e = hVar;
            j jVar = new j(dVar);
            this.f2902g = jVar;
            jVar.e(this.t);
            return;
        }
        throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
    }

    public void t(e eVar) {
        this.f2901f = eVar;
    }

    public void u(io.flutter.embedding.engine.renderer.a aVar) {
        this.b = new b(aVar, true);
    }

    public void v(k kVar) {
        this.f2899d = kVar;
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            this.f2899d.addView(this.l.get(i2));
        }
        for (int i3 = 0; i3 < this.f2905j.size(); i3++) {
            this.f2899d.addView(this.f2905j.get(i3));
        }
        for (int i4 = 0; i4 < this.f2904i.size(); i4++) {
            this.f2904i.valueAt(i4).b(this.f2899d);
        }
    }

    @TargetApi(19)
    public FlutterOverlaySurface w() {
        return x(new io.flutter.embedding.android.h(this.f2899d.getContext(), this.f2899d.getWidth(), this.f2899d.getHeight(), h.b.overlay));
    }

    @TargetApi(19)
    public FlutterOverlaySurface x(io.flutter.embedding.android.h hVar) {
        int i2 = this.m;
        this.m = i2 + 1;
        this.f2906k.put(i2, hVar);
        return new FlutterOverlaySurface(i2, hVar.getSurface());
    }

    public void y() {
        for (int i2 = 0; i2 < this.f2906k.size(); i2++) {
            io.flutter.embedding.android.h valueAt = this.f2906k.valueAt(i2);
            valueAt.c();
            valueAt.f();
        }
    }

    public void z() {
        j jVar = this.f2902g;
        if (jVar != null) {
            jVar.e(null);
        }
        y();
        this.f2902g = null;
        this.c = null;
        this.f2900e = null;
    }
}

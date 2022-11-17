package e.d.p;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import e.d.p.a;
import e.d.p.c0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public class u {
    private static Field a;
    private static boolean b;
    private static WeakHashMap<View, String> c;

    /* renamed from: e  reason: collision with root package name */
    private static Field f2142e;

    /* renamed from: d  reason: collision with root package name */
    private static WeakHashMap<View, y> f2141d = null;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f2143f = false;

    /* renamed from: g  reason: collision with root package name */
    private static final r f2144g = new a();

    /* loaded from: classes.dex */
    class a implements r {
        a() {
        }

        @Override // e.d.p.r
        public e.d.p.c a(e.d.p.c cVar) {
            return cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends g<Boolean> {
        b(int i2, Class cls, int i3) {
            super(i2, cls, i3);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: e */
        public Boolean c(View view) {
            return Boolean.valueOf(view.isScreenReaderFocusable());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends g<CharSequence> {
        c(int i2, Class cls, int i3, int i4) {
            super(i2, cls, i3, i4);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: e */
        public CharSequence c(View view) {
            return view.getAccessibilityPaneTitle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends g<CharSequence> {
        d(int i2, Class cls, int i3, int i4) {
            super(i2, cls, i3, i4);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: e */
        public CharSequence c(View view) {
            return view.getStateDescription();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e extends g<Boolean> {
        e(int i2, Class cls, int i3) {
            super(i2, cls, i3);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: e */
        public Boolean c(View view) {
            return Boolean.valueOf(view.isAccessibilityHeading());
        }
    }

    /* loaded from: classes.dex */
    static class f implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: e  reason: collision with root package name */
        private WeakHashMap<View, Boolean> f2145e = new WeakHashMap<>();

        f() {
        }

        private void a(View view, boolean z) {
            boolean z2 = view.getVisibility() == 0;
            if (z != z2) {
                u.A(view, z2 ? 16 : 32);
                this.f2145e.put(view, Boolean.valueOf(z2));
            }
        }

        private void b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f2145e.entrySet()) {
                    a(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            b(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class g<T> {
        private final int a;
        private final Class<T> b;
        private final int c;

        g(int i2, Class<T> cls, int i3) {
            this(i2, cls, 0, i3);
        }

        g(int i2, Class<T> cls, int i3, int i4) {
            this.a = i2;
            this.b = cls;
            this.c = i4;
        }

        private boolean a() {
            return Build.VERSION.SDK_INT >= 19;
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= this.c;
        }

        abstract T c(View view);

        T d(View view) {
            if (b()) {
                return c(view);
            }
            if (!a()) {
                return null;
            }
            T t = (T) view.getTag(this.a);
            if (this.b.isInstance(t)) {
                return t;
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    private static class h {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements View.OnApplyWindowInsetsListener {
            c0 a = null;
            final /* synthetic */ View b;
            final /* synthetic */ p c;

            a(View view, p pVar) {
                this.b = view;
                this.c = pVar;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                c0 v = c0.v(windowInsets, view);
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 30) {
                    h.a(windowInsets, this.b);
                    if (v.equals(this.a)) {
                        return this.c.a(view, v).t();
                    }
                }
                this.a = v;
                c0 a = this.c.a(view, v);
                if (i2 >= 30) {
                    return a.t();
                }
                u.H(view);
                return a.t();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(e.d.e.C_res_0x7f0800b6);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static c0 b(View view, c0 c0Var, Rect rect) {
            WindowInsets t = c0Var.t();
            if (t != null) {
                return c0.v(view.computeSystemWindowInsets(t, rect), view);
            }
            rect.setEmpty();
            return c0Var;
        }

        public static c0 c(View view) {
            return c0.a.a(view);
        }

        static void d(View view, p pVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(e.d.e.u_res_0x7f0800ae, pVar);
            }
            if (pVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(e.d.e.C_res_0x7f0800b6));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, pVar));
            }
        }
    }

    /* loaded from: classes.dex */
    private static class i {
        public static c0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            c0 u = c0.u(rootWindowInsets);
            u.r(u);
            u.d(view.getRootView());
            return u;
        }
    }

    /* loaded from: classes.dex */
    private static class j {
        static void a(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    /* loaded from: classes.dex */
    public interface k {
        boolean a(View view, KeyEvent keyEvent);
    }

    /* loaded from: classes.dex */
    static class l {

        /* renamed from: d  reason: collision with root package name */
        private static final ArrayList<WeakReference<View>> f2146d = new ArrayList<>();
        private WeakHashMap<View, Boolean> a = null;
        private SparseArray<WeakReference<View>> b = null;
        private WeakReference<KeyEvent> c = null;

        l() {
        }

        static l a(View view) {
            int i2 = e.d.e.A_res_0x7f0800b4;
            l lVar = (l) view.getTag(i2);
            if (lVar != null) {
                return lVar;
            }
            l lVar2 = new l();
            view.setTag(i2, lVar2);
            return lVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c != null) {
                            return c;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray<WeakReference<View>> d() {
            if (this.b == null) {
                this.b = new SparseArray<>();
            }
            return this.b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(e.d.e.B_res_0x7f0800b5);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((k) arrayList.get(size)).a(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        private void g() {
            Boolean bool = Boolean.TRUE;
            WeakHashMap<View, Boolean> weakHashMap = this.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f2146d;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    if (this.a == null) {
                        this.a = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = f2146d;
                        View view = arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.a.put(view, bool);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.a.put((View) parent, bool);
                            }
                        }
                    }
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference<>(c));
                }
            }
            return c != null;
        }

        boolean f(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.c = new WeakReference<>(keyEvent);
            WeakReference<View> weakReference2 = null;
            SparseArray<WeakReference<View>> d2 = d();
            if (keyEvent.getAction() == 1 && (indexOfKey = d2.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = d2.valueAt(indexOfKey);
                d2.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = d2.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = weakReference2.get();
            if (view != null && u.x(view)) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    static {
        new AtomicInteger(1);
        new f();
    }

    static void A(View view, int i2) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = j(view) != null && view.getVisibility() == 0;
            int i3 = 32;
            if (i(view) != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z) {
                    i3 = 2048;
                }
                obtain.setEventType(i3);
                obtain.setContentChangeTypes(i2);
                if (z) {
                    obtain.getText().add(j(view));
                    T(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i2 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(i2);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(j(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i2);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e2);
                }
            }
        }
    }

    public static c0 B(View view, c0 c0Var) {
        WindowInsets t;
        if (Build.VERSION.SDK_INT >= 21 && (t = c0Var.t()) != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(t);
            if (!onApplyWindowInsets.equals(t)) {
                return c0.v(onApplyWindowInsets, view);
            }
        }
        return c0Var;
    }

    private static g<CharSequence> C() {
        return new c(e.d.e.t_res_0x7f0800ad, CharSequence.class, 8, 28);
    }

    public static e.d.p.c D(View view, e.d.p.c cVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + cVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        q qVar = (q) view.getTag(e.d.e.v_res_0x7f0800af);
        if (qVar == null) {
            return m(view).a(cVar);
        }
        e.d.p.c a2 = qVar.a(view, cVar);
        if (a2 == null) {
            return null;
        }
        return m(view).a(a2);
    }

    public static void E(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    public static void F(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    public static void G(View view, Runnable runnable, long j2) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j2);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j2);
        }
    }

    public static void H(View view) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 20) {
            view.requestApplyInsets();
        } else if (i2 >= 16) {
            view.requestFitSystemWindows();
        }
    }

    public static void I(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            j.a(view, context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    private static g<Boolean> J() {
        return new b(e.d.e.x_res_0x7f0800b1, Boolean.class, 28);
    }

    public static void K(View view, e.d.p.a aVar) {
        if (aVar == null && (g(view) instanceof a.C0073a)) {
            aVar = new e.d.p.a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.d());
    }

    public static void L(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    public static void M(View view, ColorStateList colorStateList) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            view.setBackgroundTintList(colorStateList);
            if (i2 == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof t) {
            ((t) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    public static void N(View view, PorterDuff.Mode mode) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            view.setBackgroundTintMode(mode);
            if (i2 == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof t) {
            ((t) view).setSupportBackgroundTintMode(mode);
        }
    }

    public static void O(View view, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f2);
        }
    }

    public static void P(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 19) {
            if (i3 < 16) {
                return;
            }
            if (i2 == 4) {
                i2 = 2;
            }
        }
        view.setImportantForAccessibility(i2);
    }

    public static void Q(View view, p pVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            h.d(view, pVar);
        }
    }

    public static void R(View view, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i2, i3);
        }
    }

    public static void S(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (c == null) {
            c = new WeakHashMap<>();
        }
        c.put(view, str);
    }

    private static void T(View view) {
        if (n(view) == 0) {
            P(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (n((View) parent) == 4) {
                P(view, 2);
                return;
            }
        }
    }

    private static g<CharSequence> U() {
        return new d(e.d.e.y_res_0x7f0800b2, CharSequence.class, 64, 30);
    }

    public static void V(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof e.d.p.j) {
            ((e.d.p.j) view).stopNestedScroll();
        }
    }

    private static g<Boolean> a() {
        return new e(e.d.e.s_res_0x7f0800ac, Boolean.class, 28);
    }

    public static y b(View view) {
        if (f2141d == null) {
            f2141d = new WeakHashMap<>();
        }
        y yVar = f2141d.get(view);
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y(view);
        f2141d.put(view, yVar2);
        return yVar2;
    }

    public static c0 c(View view, c0 c0Var, Rect rect) {
        return Build.VERSION.SDK_INT >= 21 ? h.b(view, c0Var, rect) : c0Var;
    }

    public static c0 d(View view, c0 c0Var) {
        WindowInsets t;
        if (Build.VERSION.SDK_INT >= 21 && (t = c0Var.t()) != null) {
            WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(t);
            if (!dispatchApplyWindowInsets.equals(t)) {
                return c0.v(dispatchApplyWindowInsets, view);
            }
        }
        return c0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return l.a(view).b(view, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean f(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return l.a(view).f(keyEvent);
    }

    private static View.AccessibilityDelegate g(View view) {
        return Build.VERSION.SDK_INT >= 29 ? view.getAccessibilityDelegate() : h(view);
    }

    private static View.AccessibilityDelegate h(View view) {
        if (f2143f) {
            return null;
        }
        if (f2142e == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f2142e = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f2143f = true;
                return null;
            }
        }
        try {
            Object obj = f2142e.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f2143f = true;
            return null;
        }
    }

    public static int i(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    public static CharSequence j(View view) {
        return C().d(view);
    }

    public static ColorStateList k(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof t) {
            return ((t) view).getSupportBackgroundTintList();
        }
        return null;
    }

    public static PorterDuff.Mode l(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (view instanceof t) {
            return ((t) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    private static r m(View view) {
        return view instanceof r ? (r) view : f2144g;
    }

    public static int n(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    public static int o(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    public static int p(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!b) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            b = true;
        }
        Field field = a;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    public static String[] q(View view) {
        return (String[]) view.getTag(e.d.e.w_res_0x7f0800b0);
    }

    public static c0 r(View view) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            return i.a(view);
        }
        if (i2 >= 21) {
            return h.c(view);
        }
        return null;
    }

    public static final CharSequence s(View view) {
        return U().d(view);
    }

    public static String t(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = c;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    public static int u(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    public static boolean v(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    public static boolean w(View view) {
        Boolean d2 = a().d(view);
        if (d2 == null) {
            return false;
        }
        return d2.booleanValue();
    }

    public static boolean x(View view) {
        return Build.VERSION.SDK_INT >= 19 ? view.isAttachedToWindow() : view.getWindowToken() != null;
    }

    public static boolean y(View view) {
        return Build.VERSION.SDK_INT >= 19 ? view.isLaidOut() : view.getWidth() > 0 && view.getHeight() > 0;
    }

    public static boolean z(View view) {
        Boolean d2 = J().d(view);
        if (d2 == null) {
            return false;
        }
        return d2.booleanValue();
    }
}

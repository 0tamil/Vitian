package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.p;
import androidx.core.widget.h;
import e.a.j;
import e.d.p.u;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class k0 implements p {
    private static Method J;
    private static Method K;
    private static Method L;
    final f A;
    private final e B;
    private final d C;
    private final b D;
    final Handler E;
    private final Rect F;
    private Rect G;
    private boolean H;
    PopupWindow I;

    /* renamed from: e  reason: collision with root package name */
    private Context f429e;

    /* renamed from: f  reason: collision with root package name */
    private ListAdapter f430f;

    /* renamed from: g  reason: collision with root package name */
    g0 f431g;

    /* renamed from: h  reason: collision with root package name */
    private int f432h;

    /* renamed from: i  reason: collision with root package name */
    private int f433i;

    /* renamed from: j  reason: collision with root package name */
    private int f434j;

    /* renamed from: k  reason: collision with root package name */
    private int f435k;
    private int l;
    private boolean m;
    private boolean n;
    private boolean o;
    private int p;
    private boolean q;
    private boolean r;
    int s;
    private View t;
    private int u;
    private DataSetObserver v;
    private View w;
    private Drawable x;
    private AdapterView.OnItemClickListener y;
    private AdapterView.OnItemSelectedListener z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements AdapterView.OnItemSelectedListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            g0 g0Var;
            if (i2 != -1 && (g0Var = k0.this.f431g) != null) {
                g0Var.setListSelectionHidden(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k0.this.r();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c extends DataSetObserver {
        c() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (k0.this.c()) {
                k0.this.a();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            k0.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d implements AbsListView.OnScrollListener {
        d() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i2) {
            if (i2 == 1 && !k0.this.w() && k0.this.I.getContentView() != null) {
                k0 k0Var = k0.this;
                k0Var.E.removeCallbacks(k0Var.A);
                k0.this.A.run();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class e implements View.OnTouchListener {
        e() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = k0.this.I) != null && popupWindow.isShowing() && x >= 0 && x < k0.this.I.getWidth() && y >= 0 && y < k0.this.I.getHeight()) {
                k0 k0Var = k0.this;
                k0Var.E.postDelayed(k0Var.A, 250L);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                k0 k0Var2 = k0.this;
                k0Var2.E.removeCallbacks(k0Var2.A);
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g0 g0Var = k0.this.f431g;
            if (g0Var != null && u.x(g0Var) && k0.this.f431g.getCount() > k0.this.f431g.getChildCount()) {
                int childCount = k0.this.f431g.getChildCount();
                k0 k0Var = k0.this;
                if (childCount <= k0Var.s) {
                    k0Var.I.setInputMethodMode(2);
                    k0.this.a();
                }
            }
        }
    }

    static {
        Class cls = Boolean.TYPE;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 <= 28) {
            try {
                J = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                L = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (i2 <= 23) {
            try {
                K = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public k0(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public k0(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f432h = -2;
        this.f433i = -2;
        this.l = 1002;
        this.p = 0;
        this.q = false;
        this.r = false;
        this.s = Integer.MAX_VALUE;
        this.u = 0;
        this.A = new f();
        this.B = new e();
        this.C = new d();
        this.D = new b();
        this.F = new Rect();
        this.f429e = context;
        this.E = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.a1, i2, i3);
        this.f434j = obtainStyledAttributes.getDimensionPixelOffset(j.b1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(j.c1, 0);
        this.f435k = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.m = true;
        }
        obtainStyledAttributes.recycle();
        q qVar = new q(context, attributeSet, i2, i3);
        this.I = qVar;
        qVar.setInputMethodMode(1);
    }

    private void J(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = J;
            if (method != null) {
                try {
                    method.invoke(this.I, Boolean.valueOf(z));
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.I.setIsClippedToScreen(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int q() {
        int i2;
        int i3;
        int i4;
        int d2;
        int i5;
        int i6 = Integer.MIN_VALUE;
        boolean z = true;
        if (this.f431g == null) {
            Context context = this.f429e;
            g0 s = s(context, !this.H);
            this.f431g = s;
            Drawable drawable = this.x;
            if (drawable != null) {
                s.setSelector(drawable);
            }
            this.f431g.setAdapter(this.f430f);
            this.f431g.setOnItemClickListener(this.y);
            this.f431g.setFocusable(true);
            this.f431g.setFocusableInTouchMode(true);
            this.f431g.setOnItemSelectedListener(new a());
            this.f431g.setOnScrollListener(this.C);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.z;
            if (onItemSelectedListener != null) {
                this.f431g.setOnItemSelectedListener(onItemSelectedListener);
            }
            g0 g0Var = this.f431g;
            View view = this.t;
            if (view != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i7 = this.u;
                if (i7 == 0) {
                    linearLayout.addView(view);
                    linearLayout.addView(g0Var, layoutParams);
                } else if (i7 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.u);
                } else {
                    linearLayout.addView(g0Var, layoutParams);
                    linearLayout.addView(view);
                }
                int i8 = this.f433i;
                if (i8 >= 0) {
                    i5 = Integer.MIN_VALUE;
                } else {
                    i8 = 0;
                    i5 = 0;
                }
                view.measure(View.MeasureSpec.makeMeasureSpec(i8, i5), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view.getLayoutParams();
                i2 = view.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                g0Var = linearLayout;
            } else {
                i2 = 0;
            }
            this.I.setContentView(g0Var);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.I.getContentView();
            View view2 = this.t;
            if (view2 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i2 = view2.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i2 = 0;
            }
        }
        Drawable background = this.I.getBackground();
        if (background != null) {
            background.getPadding(this.F);
            Rect rect = this.F;
            int i9 = rect.top;
            i3 = rect.bottom + i9;
            if (!this.m) {
                this.f435k = -i9;
            }
        } else {
            this.F.setEmpty();
            i3 = 0;
        }
        if (this.I.getInputMethodMode() != 2) {
            z = false;
        }
        int u = u(t(), this.f435k, z);
        if (this.q || this.f432h == -1) {
            return u + i3;
        }
        int i10 = this.f433i;
        if (i10 != -2) {
            i6 = 1073741824;
            if (i10 != -1) {
                i4 = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
                d2 = this.f431g.d(i4, 0, -1, u - i2, -1);
                if (d2 > 0) {
                    i2 += i3 + this.f431g.getPaddingTop() + this.f431g.getPaddingBottom();
                }
                return d2 + i2;
            }
        }
        int i11 = this.f429e.getResources().getDisplayMetrics().widthPixels;
        Rect rect2 = this.F;
        i4 = View.MeasureSpec.makeMeasureSpec(i11 - (rect2.left + rect2.right), i6);
        d2 = this.f431g.d(i4, 0, -1, u - i2, -1);
        if (d2 > 0) {
        }
        return d2 + i2;
    }

    private int u(View view, int i2, boolean z) {
        if (Build.VERSION.SDK_INT > 23) {
            return this.I.getMaxAvailableHeight(view, i2, z);
        }
        Method method = K;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.I, view, Integer.valueOf(i2), Boolean.valueOf(z))).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.I.getMaxAvailableHeight(view, i2);
    }

    private void y() {
        View view = this.t;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.t);
            }
        }
    }

    public void A(int i2) {
        this.I.setAnimationStyle(i2);
    }

    public void B(int i2) {
        Drawable background = this.I.getBackground();
        if (background != null) {
            background.getPadding(this.F);
            Rect rect = this.F;
            this.f433i = rect.left + rect.right + i2;
            return;
        }
        M(i2);
    }

    public void C(int i2) {
        this.p = i2;
    }

    public void D(Rect rect) {
        this.G = rect != null ? new Rect(rect) : null;
    }

    public void E(int i2) {
        this.I.setInputMethodMode(i2);
    }

    public void F(boolean z) {
        this.H = z;
        this.I.setFocusable(z);
    }

    public void G(PopupWindow.OnDismissListener onDismissListener) {
        this.I.setOnDismissListener(onDismissListener);
    }

    public void H(AdapterView.OnItemClickListener onItemClickListener) {
        this.y = onItemClickListener;
    }

    public void I(boolean z) {
        this.o = true;
        this.n = z;
    }

    public void K(int i2) {
        this.u = i2;
    }

    public void L(int i2) {
        g0 g0Var = this.f431g;
        if (c() && g0Var != null) {
            g0Var.setListSelectionHidden(false);
            g0Var.setSelection(i2);
            if (g0Var.getChoiceMode() != 0) {
                g0Var.setItemChecked(i2, true);
            }
        }
    }

    public void M(int i2) {
        this.f433i = i2;
    }

    @Override // androidx.appcompat.view.menu.p
    public void a() {
        int q = q();
        boolean w = w();
        h.b(this.I, this.l);
        boolean z = true;
        if (!this.I.isShowing()) {
            int i2 = this.f433i;
            if (i2 == -1) {
                i2 = -1;
            } else if (i2 == -2) {
                i2 = t().getWidth();
            }
            int i3 = this.f432h;
            if (i3 == -1) {
                q = -1;
            } else if (i3 != -2) {
                q = i3;
            }
            this.I.setWidth(i2);
            this.I.setHeight(q);
            J(true);
            this.I.setOutsideTouchable(!this.r && !this.q);
            this.I.setTouchInterceptor(this.B);
            if (this.o) {
                h.a(this.I, this.n);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = L;
                if (method != null) {
                    try {
                        method.invoke(this.I, this.G);
                    } catch (Exception e2) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                    }
                }
            } else {
                this.I.setEpicenterBounds(this.G);
            }
            h.c(this.I, t(), this.f434j, this.f435k, this.p);
            this.f431g.setSelection(-1);
            if (!this.H || this.f431g.isInTouchMode()) {
                r();
            }
            if (!this.H) {
                this.E.post(this.D);
            }
        } else if (u.x(t())) {
            int i4 = this.f433i;
            if (i4 == -1) {
                i4 = -1;
            } else if (i4 == -2) {
                i4 = t().getWidth();
            }
            int i5 = this.f432h;
            if (i5 == -1) {
                if (!w) {
                    q = -1;
                }
                if (w) {
                    this.I.setWidth(this.f433i == -1 ? -1 : 0);
                    this.I.setHeight(0);
                } else {
                    this.I.setWidth(this.f433i == -1 ? -1 : 0);
                    this.I.setHeight(-1);
                }
            } else if (i5 != -2) {
                q = i5;
            }
            PopupWindow popupWindow = this.I;
            if (this.r || this.q) {
                z = false;
            }
            popupWindow.setOutsideTouchable(z);
            this.I.update(t(), this.f434j, this.f435k, i4 < 0 ? -1 : i4, q < 0 ? -1 : q);
        }
    }

    public void b(int i2) {
        this.f434j = i2;
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean c() {
        return this.I.isShowing();
    }

    public int d() {
        return this.f434j;
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        this.I.dismiss();
        y();
        this.I.setContentView(null);
        this.f431g = null;
        this.E.removeCallbacks(this.A);
    }

    public int g() {
        if (!this.m) {
            return 0;
        }
        return this.f435k;
    }

    public Drawable i() {
        return this.I.getBackground();
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView k() {
        return this.f431g;
    }

    public void m(Drawable drawable) {
        this.I.setBackgroundDrawable(drawable);
    }

    public void n(int i2) {
        this.f435k = i2;
        this.m = true;
    }

    public void o(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.v;
        if (dataSetObserver == null) {
            this.v = new c();
        } else {
            ListAdapter listAdapter2 = this.f430f;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f430f = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.v);
        }
        g0 g0Var = this.f431g;
        if (g0Var != null) {
            g0Var.setAdapter(this.f430f);
        }
    }

    public void r() {
        g0 g0Var = this.f431g;
        if (g0Var != null) {
            g0Var.setListSelectionHidden(true);
            g0Var.requestLayout();
        }
    }

    g0 s(Context context, boolean z) {
        return new g0(context, z);
    }

    public View t() {
        return this.w;
    }

    public int v() {
        return this.f433i;
    }

    public boolean w() {
        return this.I.getInputMethodMode() == 2;
    }

    public boolean x() {
        return this.H;
    }

    public void z(View view) {
        this.w = view;
    }
}

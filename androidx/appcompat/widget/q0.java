package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.j0;
/* loaded from: classes.dex */
public class q0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: e  reason: collision with root package name */
    Runnable f460e;

    /* renamed from: f  reason: collision with root package name */
    private c f461f;

    /* renamed from: g  reason: collision with root package name */
    j0 f462g;

    /* renamed from: h  reason: collision with root package name */
    private Spinner f463h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f464i;

    /* renamed from: j  reason: collision with root package name */
    int f465j;

    /* renamed from: k  reason: collision with root package name */
    int f466k;
    private int l;
    private int m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ View f467e;

        a(View view) {
            this.f467e = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            q0.this.smoothScrollTo(this.f467e.getLeft() - ((q0.this.getWidth() - this.f467e.getWidth()) / 2), 0);
            q0.this.f460e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends BaseAdapter {
        b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return q0.this.f462g.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i2) {
            return ((d) q0.this.f462g.getChildAt(i2)).b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                return q0.this.c((a.c) getItem(i2), true);
            }
            ((d) view).a((a.c) getItem(i2));
            return view;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).b().e();
            int childCount = q0.this.f462g.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = q0.this.f462g.getChildAt(i2);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d extends LinearLayout {

        /* renamed from: e  reason: collision with root package name */
        private final int[] f471e;

        /* renamed from: f  reason: collision with root package name */
        private a.c f472f;

        /* renamed from: g  reason: collision with root package name */
        private TextView f473g;

        /* renamed from: h  reason: collision with root package name */
        private ImageView f474h;

        /* renamed from: i  reason: collision with root package name */
        private View f475i;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public d(Context context, a.c cVar, boolean z) {
            super(context, null, r5);
            int i2 = e.a.a.f1912d;
            int[] iArr = {16842964};
            this.f471e = iArr;
            this.f472f = cVar;
            x0 u = x0.u(context, null, iArr, i2, 0);
            if (u.r(0)) {
                setBackgroundDrawable(u.f(0));
            }
            u.v();
            if (z) {
                setGravity(8388627);
            }
            c();
        }

        public void a(a.c cVar) {
            this.f472f = cVar;
            c();
        }

        public a.c b() {
            return this.f472f;
        }

        public void c() {
            a.c cVar = this.f472f;
            View b = cVar.b();
            CharSequence charSequence = null;
            if (b != null) {
                ViewParent parent = b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b);
                    }
                    addView(b);
                }
                this.f475i = b;
                TextView textView = this.f473g;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f474h;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f474h.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f475i;
            if (view != null) {
                removeView(view);
                this.f475i = null;
            }
            Drawable c = cVar.c();
            CharSequence d2 = cVar.d();
            if (c != null) {
                if (this.f474h == null) {
                    o oVar = new o(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    oVar.setLayoutParams(layoutParams);
                    addView(oVar, 0);
                    this.f474h = oVar;
                }
                this.f474h.setImageDrawable(c);
                this.f474h.setVisibility(0);
            } else {
                ImageView imageView2 = this.f474h;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f474h.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(d2);
            if (z) {
                if (this.f473g == null) {
                    a0 a0Var = new a0(getContext(), null, e.a.a.f1913e);
                    a0Var.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    a0Var.setLayoutParams(layoutParams2);
                    addView(a0Var);
                    this.f473g = a0Var;
                }
                this.f473g.setText(d2);
                this.f473g.setVisibility(0);
            } else {
                TextView textView2 = this.f473g;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f473g.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f474h;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.a());
            }
            if (!z) {
                charSequence = cVar.a();
            }
            z0.a(this, charSequence);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i2, int i3) {
            super.onMeasure(i2, i3);
            if (q0.this.f465j > 0) {
                int measuredWidth = getMeasuredWidth();
                int i4 = q0.this.f465j;
                if (measuredWidth > i4) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i3);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    static {
        new DecelerateInterpolator();
    }

    private Spinner b() {
        x xVar = new x(getContext(), null, e.a.a.f1916h);
        xVar.setLayoutParams(new j0.a(-2, -1));
        xVar.setOnItemSelectedListener(this);
        return xVar;
    }

    private boolean d() {
        Spinner spinner = this.f463h;
        return spinner != null && spinner.getParent() == this;
    }

    private void e() {
        if (!d()) {
            if (this.f463h == null) {
                this.f463h = b();
            }
            removeView(this.f462g);
            addView(this.f463h, new ViewGroup.LayoutParams(-2, -1));
            if (this.f463h.getAdapter() == null) {
                this.f463h.setAdapter((SpinnerAdapter) new b());
            }
            Runnable runnable = this.f460e;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f460e = null;
            }
            this.f463h.setSelection(this.m);
        }
    }

    private boolean f() {
        if (!d()) {
            return false;
        }
        removeView(this.f463h);
        addView(this.f462g, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f463h.getSelectedItemPosition());
        return false;
    }

    public void a(int i2) {
        View childAt = this.f462g.getChildAt(i2);
        Runnable runnable = this.f460e;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f460e = aVar;
        post(aVar);
    }

    d c(a.c cVar, boolean z) {
        d dVar = new d(getContext(), cVar, z);
        if (z) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.l));
        } else {
            dVar.setFocusable(true);
            if (this.f461f == null) {
                this.f461f = new c();
            }
            dVar.setOnClickListener(this.f461f);
        }
        return dVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f460e;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        e.a.n.a b2 = e.a.n.a.b(getContext());
        setContentHeight(b2.f());
        this.f466k = b2.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f460e;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
        ((d) view).b().e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int i4;
        int mode = View.MeasureSpec.getMode(i2);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f462g.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            i4 = -1;
        } else {
            if (childCount > 2) {
                this.f465j = (int) (View.MeasureSpec.getSize(i2) * 0.4f);
            } else {
                this.f465j = View.MeasureSpec.getSize(i2) / 2;
            }
            i4 = Math.min(this.f465j, this.f466k);
        }
        this.f465j = i4;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.l, 1073741824);
        if (z2 || !this.f464i) {
            z = false;
        }
        if (z) {
            this.f462g.measure(0, makeMeasureSpec);
            if (this.f462g.getMeasuredWidth() > View.MeasureSpec.getSize(i2)) {
                e();
                int measuredWidth = getMeasuredWidth();
                super.onMeasure(i2, makeMeasureSpec);
                int measuredWidth2 = getMeasuredWidth();
                if (z2 && measuredWidth != measuredWidth2) {
                    setTabSelected(this.m);
                    return;
                }
            }
        }
        f();
        int measuredWidth3 = getMeasuredWidth();
        super.onMeasure(i2, makeMeasureSpec);
        int measuredWidth22 = getMeasuredWidth();
        if (z2) {
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f464i = z;
    }

    public void setContentHeight(int i2) {
        this.l = i2;
        requestLayout();
    }

    public void setTabSelected(int i2) {
        this.m = i2;
        int childCount = this.f462g.getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = this.f462g.getChildAt(i3);
            boolean z = i3 == i2;
            childAt.setSelected(z);
            if (z) {
                a(i2);
            }
            i3++;
        }
        Spinner spinner = this.f463h;
        if (spinner != null && i2 >= 0) {
            spinner.setSelection(i2);
        }
    }
}

package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.p;
import e.a.j;
import e.d.p.t;
import e.d.p.u;
/* loaded from: classes.dex */
public class x extends Spinner implements t {
    private static final int[] m = {16843505};

    /* renamed from: e  reason: collision with root package name */
    private final androidx.appcompat.widget.e f496e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f497f;

    /* renamed from: g  reason: collision with root package name */
    private i0 f498g;

    /* renamed from: h  reason: collision with root package name */
    private SpinnerAdapter f499h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f500i;

    /* renamed from: j  reason: collision with root package name */
    private g f501j;

    /* renamed from: k  reason: collision with root package name */
    int f502k;
    final Rect l;

    /* loaded from: classes.dex */
    class a extends i0 {
        final /* synthetic */ e n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, e eVar) {
            super(view);
            this.n = eVar;
        }

        @Override // androidx.appcompat.widget.i0
        public p b() {
            return this.n;
        }

        @Override // androidx.appcompat.widget.i0
        @SuppressLint({"SyntheticAccessor"})
        public boolean c() {
            if (x.this.getInternalPopup().c()) {
                return true;
            }
            x.this.b();
            return true;
        }
    }

    /* loaded from: classes.dex */
    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!x.this.getInternalPopup().c()) {
                x.this.b();
            }
            ViewTreeObserver viewTreeObserver = x.this.getViewTreeObserver();
            if (viewTreeObserver == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 16) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            } else {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements g, DialogInterface.OnClickListener {

        /* renamed from: e  reason: collision with root package name */
        androidx.appcompat.app.b f504e;

        /* renamed from: f  reason: collision with root package name */
        private ListAdapter f505f;

        /* renamed from: g  reason: collision with root package name */
        private CharSequence f506g;

        c() {
        }

        @Override // androidx.appcompat.widget.x.g
        public void b(int i2) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.x.g
        public boolean c() {
            androidx.appcompat.app.b bVar = this.f504e;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.x.g
        public int d() {
            return 0;
        }

        @Override // androidx.appcompat.widget.x.g
        public void dismiss() {
            androidx.appcompat.app.b bVar = this.f504e;
            if (bVar != null) {
                bVar.dismiss();
                this.f504e = null;
            }
        }

        @Override // androidx.appcompat.widget.x.g
        public void e(int i2, int i3) {
            if (this.f505f != null) {
                b.a aVar = new b.a(x.this.getPopupContext());
                CharSequence charSequence = this.f506g;
                if (charSequence != null) {
                    aVar.h(charSequence);
                }
                aVar.g(this.f505f, x.this.getSelectedItemPosition(), this);
                androidx.appcompat.app.b a = aVar.a();
                this.f504e = a;
                ListView e2 = a.e();
                if (Build.VERSION.SDK_INT >= 17) {
                    e2.setTextDirection(i2);
                    e2.setTextAlignment(i3);
                }
                this.f504e.show();
            }
        }

        @Override // androidx.appcompat.widget.x.g
        public int g() {
            return 0;
        }

        @Override // androidx.appcompat.widget.x.g
        public Drawable i() {
            return null;
        }

        @Override // androidx.appcompat.widget.x.g
        public CharSequence j() {
            return this.f506g;
        }

        @Override // androidx.appcompat.widget.x.g
        public void l(CharSequence charSequence) {
            this.f506g = charSequence;
        }

        @Override // androidx.appcompat.widget.x.g
        public void m(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.x.g
        public void n(int i2) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.x.g
        public void o(ListAdapter listAdapter) {
            this.f505f = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            x.this.setSelection(i2);
            if (x.this.getOnItemClickListener() != null) {
                x.this.performItemClick(null, i2, this.f505f.getItemId(i2));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.x.g
        public void p(int i2) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d implements ListAdapter, SpinnerAdapter {

        /* renamed from: e  reason: collision with root package name */
        private SpinnerAdapter f508e;

        /* renamed from: f  reason: collision with root package name */
        private ListAdapter f509f;

        public d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f508e = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f509f = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof t0) {
                t0 t0Var = (t0) spinnerAdapter;
                if (t0Var.getDropDownViewTheme() == null) {
                    t0Var.setDropDownViewTheme(theme);
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f509f;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f508e;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f508e;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i2, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i2) {
            SpinnerAdapter spinnerAdapter = this.f508e;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i2);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            SpinnerAdapter spinnerAdapter = this.f508e;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i2);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i2) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            return getDropDownView(i2, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f508e;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i2) {
            ListAdapter listAdapter = this.f509f;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i2);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f508e;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f508e;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* loaded from: classes.dex */
    class e extends k0 implements g {
        private CharSequence M;
        ListAdapter N;
        private final Rect O = new Rect();
        private int P;

        /* loaded from: classes.dex */
        class a implements AdapterView.OnItemClickListener {
            a(x xVar) {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                x.this.setSelection(i2);
                if (x.this.getOnItemClickListener() != null) {
                    e eVar = e.this;
                    x.this.performItemClick(view, i2, eVar.N.getItemId(i2));
                }
                e.this.dismiss();
            }
        }

        /* loaded from: classes.dex */
        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                e eVar = e.this;
                if (!eVar.Q(x.this)) {
                    e.this.dismiss();
                    return;
                }
                e.this.O();
                e.super.a();
            }
        }

        /* loaded from: classes.dex */
        class c implements PopupWindow.OnDismissListener {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f512e;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f512e = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = x.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f512e);
                }
            }
        }

        public e(Context context, AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2);
            z(x.this);
            F(true);
            K(0);
            H(new a(x.this));
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        void O() {
            int i2;
            Drawable i3 = i();
            int i4 = 0;
            if (i3 != null) {
                i3.getPadding(x.this.l);
                i4 = d1.b(x.this) ? x.this.l.right : -x.this.l.left;
            } else {
                Rect rect = x.this.l;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = x.this.getPaddingLeft();
            int paddingRight = x.this.getPaddingRight();
            int width = x.this.getWidth();
            x xVar = x.this;
            int i5 = xVar.f502k;
            if (i5 == -2) {
                int a2 = xVar.a((SpinnerAdapter) this.N, i());
                int i6 = x.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = x.this.l;
                int i7 = (i6 - rect2.left) - rect2.right;
                if (a2 > i7) {
                    a2 = i7;
                }
                i2 = Math.max(a2, (width - paddingLeft) - paddingRight);
            } else if (i5 == -1) {
                i2 = (width - paddingLeft) - paddingRight;
            } else {
                B(i5);
                b(!d1.b(x.this) ? i4 + (((width - paddingRight) - v()) - P()) : i4 + paddingLeft + P());
            }
            B(i2);
            b(!d1.b(x.this) ? i4 + (((width - paddingRight) - v()) - P()) : i4 + paddingLeft + P());
        }

        public int P() {
            return this.P;
        }

        boolean Q(View view) {
            return u.x(view) && view.getGlobalVisibleRect(this.O);
        }

        @Override // androidx.appcompat.widget.x.g
        public void e(int i2, int i3) {
            ViewTreeObserver viewTreeObserver;
            boolean c2 = c();
            O();
            E(2);
            super.a();
            ListView k2 = k();
            k2.setChoiceMode(1);
            if (Build.VERSION.SDK_INT >= 17) {
                k2.setTextDirection(i2);
                k2.setTextAlignment(i3);
            }
            L(x.this.getSelectedItemPosition());
            if (!c2 && (viewTreeObserver = x.this.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                G(new c(bVar));
            }
        }

        @Override // androidx.appcompat.widget.x.g
        public CharSequence j() {
            return this.M;
        }

        @Override // androidx.appcompat.widget.x.g
        public void l(CharSequence charSequence) {
            this.M = charSequence;
        }

        @Override // androidx.appcompat.widget.k0, androidx.appcompat.widget.x.g
        public void o(ListAdapter listAdapter) {
            super.o(listAdapter);
            this.N = listAdapter;
        }

        @Override // androidx.appcompat.widget.x.g
        public void p(int i2) {
            this.P = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: e  reason: collision with root package name */
        boolean f514e;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<f> {
            a() {
            }

            /* renamed from: a */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            /* renamed from: b */
            public f[] newArray(int i2) {
                return new f[i2];
            }
        }

        f(Parcel parcel) {
            super(parcel);
            this.f514e = parcel.readByte() != 0;
        }

        f(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeByte(this.f514e ? (byte) 1 : (byte) 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface g {
        void b(int i2);

        boolean c();

        int d();

        void dismiss();

        void e(int i2, int i3);

        int g();

        Drawable i();

        CharSequence j();

        void l(CharSequence charSequence);

        void m(Drawable drawable);

        void n(int i2);

        void o(ListAdapter listAdapter);

        void p(int i2);
    }

    public x(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.a.I);
    }

    public x(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, -1);
    }

    public x(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, attributeSet, i2, i3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
        if (r11 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
        r11.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
        if (r11 == null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x(Context context, AttributeSet attributeSet, int i2, int i3, Resources.Theme theme) {
        super(context, attributeSet, i2);
        TypedArray typedArray;
        Throwable th;
        TypedArray typedArray2;
        Exception e2;
        CharSequence[] p;
        SpinnerAdapter spinnerAdapter;
        e.a.n.d dVar;
        this.l = new Rect();
        s0.a(this, getContext());
        x0 u = x0.u(context, attributeSet, j.l2, i2, 0);
        this.f496e = new androidx.appcompat.widget.e(this);
        try {
            if (theme != null) {
                dVar = new e.a.n.d(context, theme);
            } else {
                int m2 = u.m(j.q2, 0);
                if (m2 != 0) {
                    dVar = new e.a.n.d(context, m2);
                } else {
                    this.f497f = context;
                    typedArray = null;
                    if (i3 == -1) {
                        try {
                            typedArray2 = context.obtainStyledAttributes(attributeSet, m, i2, 0);
                            try {
                                i3 = typedArray2.hasValue(0) ? typedArray2.getInt(0, 0) : i3;
                            } catch (Exception e3) {
                                e2 = e3;
                                Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e2);
                            }
                        } catch (Exception e4) {
                            e2 = e4;
                            typedArray2 = null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (typedArray != null) {
                                typedArray.recycle();
                            }
                            throw th;
                        }
                    }
                    if (i3 != 0) {
                        c cVar = new c();
                        this.f501j = cVar;
                        cVar.l(u.n(j.o2));
                    } else if (i3 == 1) {
                        e eVar = new e(this.f497f, attributeSet, i2);
                        x0 u2 = x0.u(this.f497f, attributeSet, j.l2, i2, 0);
                        this.f502k = u2.l(j.p2, -2);
                        eVar.m(u2.f(j.n2));
                        eVar.l(u.n(j.o2));
                        u2.v();
                        this.f501j = eVar;
                        this.f498g = new a(this, eVar);
                    }
                    p = u.p(j.m2);
                    if (p != null) {
                        ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367048, p);
                        arrayAdapter.setDropDownViewResource(e.a.g.t);
                        setAdapter((SpinnerAdapter) arrayAdapter);
                    }
                    u.v();
                    this.f500i = true;
                    spinnerAdapter = this.f499h;
                    if (spinnerAdapter != null) {
                        setAdapter(spinnerAdapter);
                        this.f499h = null;
                    }
                    this.f496e.e(attributeSet, i2);
                    return;
                }
            }
            if (i3 == -1) {
            }
            if (i3 != 0) {
            }
            p = u.p(j.m2);
            if (p != null) {
            }
            u.v();
            this.f500i = true;
            spinnerAdapter = this.f499h;
            if (spinnerAdapter != null) {
            }
            this.f496e.e(attributeSet, i2);
            return;
        } catch (Throwable th3) {
            th = th3;
            typedArray = -1;
        }
        this.f497f = dVar;
        typedArray = null;
    }

    int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i3 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i3;
        }
        drawable.getPadding(this.l);
        Rect rect = this.l;
        return i3 + rect.left + rect.right;
    }

    void b() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f501j.e(getTextDirection(), getTextAlignment());
        } else {
            this.f501j.e(-1, -1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.e eVar = this.f496e;
        if (eVar != null) {
            eVar.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        g gVar = this.f501j;
        if (gVar != null) {
            return gVar.d();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        g gVar = this.f501j;
        if (gVar != null) {
            return gVar.g();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.f501j != null) {
            return this.f502k;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    final g getInternalPopup() {
        return this.f501j;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        g gVar = this.f501j;
        if (gVar != null) {
            return gVar.i();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f497f;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        g gVar = this.f501j;
        return gVar != null ? gVar.j() : super.getPrompt();
    }

    @Override // e.d.p.t
    public ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.e eVar = this.f496e;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // e.d.p.t
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.e eVar = this.f496e;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g gVar = this.f501j;
        if (gVar != null && gVar.c()) {
            this.f501j.dismiss();
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f501j != null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        if (fVar.f514e && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new b());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        g gVar = this.f501j;
        fVar.f514e = gVar != null && gVar.c();
        return fVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        i0 i0Var = this.f498g;
        if (i0Var == null || !i0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        g gVar = this.f501j;
        if (gVar == null) {
            return super.performClick();
        }
        if (gVar.c()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f500i) {
            this.f499h = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f501j != null) {
            Context context = this.f497f;
            if (context == null) {
                context = getContext();
            }
            this.f501j.o(new d(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.e eVar = this.f496e;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        androidx.appcompat.widget.e eVar = this.f496e;
        if (eVar != null) {
            eVar.g(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        g gVar = this.f501j;
        if (gVar != null) {
            gVar.p(i2);
            this.f501j.b(i2);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        g gVar = this.f501j;
        if (gVar != null) {
            gVar.n(i2);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f501j != null) {
            this.f502k = i2;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        g gVar = this.f501j;
        if (gVar != null) {
            gVar.m(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(e.a.k.a.a.d(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        g gVar = this.f501j;
        if (gVar != null) {
            gVar.l(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // e.d.p.t
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        androidx.appcompat.widget.e eVar = this.f496e;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // e.d.p.t
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        androidx.appcompat.widget.e eVar = this.f496e;
        if (eVar != null) {
            eVar.j(mode);
        }
    }
}

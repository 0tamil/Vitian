package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.j0;
import androidx.core.widget.NestedScrollView;
import e.a.j;
import e.d.p.u;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class AlertController {
    NestedScrollView A;
    private Drawable C;
    private ImageView D;
    private TextView E;
    private TextView F;
    private View G;
    ListAdapter H;
    private int J;
    private int K;
    int L;
    int M;
    int N;
    int O;
    private boolean P;
    Handler R;
    private final Context a;
    final androidx.appcompat.app.g b;
    private final Window c;

    /* renamed from: d  reason: collision with root package name */
    private final int f82d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f83e;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f84f;

    /* renamed from: g  reason: collision with root package name */
    ListView f85g;

    /* renamed from: h  reason: collision with root package name */
    private View f86h;

    /* renamed from: i  reason: collision with root package name */
    private int f87i;

    /* renamed from: j  reason: collision with root package name */
    private int f88j;

    /* renamed from: k  reason: collision with root package name */
    private int f89k;
    private int l;
    private int m;
    Button o;
    private CharSequence p;
    Message q;
    private Drawable r;
    Button s;
    private CharSequence t;
    Message u;
    private Drawable v;
    Button w;
    private CharSequence x;
    Message y;
    private Drawable z;
    private boolean n = false;
    private int B = 0;
    int I = -1;
    private int Q = 0;
    private final View.OnClickListener S = new a();

    /* loaded from: classes.dex */
    public static class RecycleListView extends ListView {

        /* renamed from: e  reason: collision with root package name */
        private final int f90e;

        /* renamed from: f  reason: collision with root package name */
        private final int f91f;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.Q1);
            this.f91f = obtainStyledAttributes.getDimensionPixelOffset(j.R1, -1);
            this.f90e = obtainStyledAttributes.getDimensionPixelOffset(j.S1, -1);
        }

        public void a(boolean z, boolean z2) {
            if (!z2 || !z) {
                setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f90e, getPaddingRight(), z2 ? getPaddingBottom() : this.f91f);
            }
        }
    }

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            AlertController alertController = AlertController.this;
            Message obtain = ((view != alertController.o || (message2 = alertController.q) == null) && (view != alertController.s || (message2 = alertController.u) == null)) ? (view != alertController.w || (message = alertController.y) == null) ? null : Message.obtain(message) : Message.obtain(message2);
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.R.obtainMessage(1, alertController2.b).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements NestedScrollView.b {
        final /* synthetic */ View a;
        final /* synthetic */ View b;

        b(AlertController alertController, View view, View view2) {
            this.a = view;
            this.b = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.b
        public void a(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5) {
            AlertController.f(nestedScrollView, this.a, this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ View f93e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ View f94f;

        c(View view, View view2) {
            this.f93e = view;
            this.f94f = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.f(AlertController.this.A, this.f93e, this.f94f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements AbsListView.OnScrollListener {
        final /* synthetic */ View a;
        final /* synthetic */ View b;

        d(AlertController alertController, View view, View view2) {
            this.a = view;
            this.b = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
            AlertController.f(absListView, this.a, this.b);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ View f96e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ View f97f;

        e(View view, View view2) {
            this.f96e = view;
            this.f97f = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.f(AlertController.this.f85g, this.f96e, this.f97f);
        }
    }

    /* loaded from: classes.dex */
    public static class f {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public AdapterView.OnItemSelectedListener N;
        public e O;
        public final Context a;
        public final LayoutInflater b;

        /* renamed from: d  reason: collision with root package name */
        public Drawable f99d;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f101f;

        /* renamed from: g  reason: collision with root package name */
        public View f102g;

        /* renamed from: h  reason: collision with root package name */
        public CharSequence f103h;

        /* renamed from: i  reason: collision with root package name */
        public CharSequence f104i;

        /* renamed from: j  reason: collision with root package name */
        public Drawable f105j;

        /* renamed from: k  reason: collision with root package name */
        public DialogInterface.OnClickListener f106k;
        public CharSequence l;
        public Drawable m;
        public DialogInterface.OnClickListener n;
        public CharSequence o;
        public Drawable p;
        public DialogInterface.OnClickListener q;
        public DialogInterface.OnCancelListener s;
        public DialogInterface.OnDismissListener t;
        public DialogInterface.OnKeyListener u;
        public CharSequence[] v;
        public ListAdapter w;
        public DialogInterface.OnClickListener x;
        public int y;
        public View z;
        public int c = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f100e = 0;
        public boolean E = false;
        public int I = -1;
        public boolean r = true;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a extends ArrayAdapter<CharSequence> {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ RecycleListView f107e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i2, int i3, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i2, i3, charSequenceArr);
                this.f107e = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i2, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i2, view, viewGroup);
                boolean[] zArr = f.this.F;
                if (zArr != null && zArr[i2]) {
                    this.f107e.setItemChecked(i2, true);
                }
                return view2;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class b extends CursorAdapter {

            /* renamed from: e  reason: collision with root package name */
            private final int f109e;

            /* renamed from: f  reason: collision with root package name */
            private final int f110f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ RecycleListView f111g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ AlertController f112h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z);
                this.f111g = recycleListView;
                this.f112h = alertController;
                Cursor cursor2 = getCursor();
                this.f109e = cursor2.getColumnIndexOrThrow(f.this.L);
                this.f110f = cursor2.getColumnIndexOrThrow(f.this.M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f109e));
                RecycleListView recycleListView = this.f111g;
                int position = cursor.getPosition();
                boolean z = true;
                if (cursor.getInt(this.f110f) != 1) {
                    z = false;
                }
                recycleListView.setItemChecked(position, z);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return f.this.b.inflate(this.f112h.M, viewGroup, false);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class c implements AdapterView.OnItemClickListener {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ AlertController f114e;

            c(AlertController alertController) {
                this.f114e = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                f.this.x.onClick(this.f114e.b, i2);
                if (!f.this.H) {
                    this.f114e.b.dismiss();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class d implements AdapterView.OnItemClickListener {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ RecycleListView f116e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ AlertController f117f;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f116e = recycleListView;
                this.f117f = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                boolean[] zArr = f.this.F;
                if (zArr != null) {
                    zArr[i2] = this.f116e.isItemChecked(i2);
                }
                f.this.J.onClick(this.f117f.b, i2, this.f116e.isItemChecked(i2));
            }
        }

        /* loaded from: classes.dex */
        public interface e {
            void a(ListView listView);
        }

        public f(Context context) {
            this.a = context;
            this.b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void b(AlertController alertController) {
            ListAdapter listAdapter;
            AdapterView.OnItemSelectedListener onItemSelectedListener;
            AdapterView.OnItemClickListener dVar;
            RecycleListView recycleListView = (RecycleListView) this.b.inflate(alertController.L, (ViewGroup) null);
            if (this.G) {
                listAdapter = this.K == null ? new a(this.a, alertController.M, 16908308, this.v, recycleListView) : new b(this.a, this.K, false, recycleListView, alertController);
            } else {
                int i2 = this.H ? alertController.N : alertController.O;
                if (this.K != null) {
                    listAdapter = new SimpleCursorAdapter(this.a, i2, this.K, new String[]{this.L}, new int[]{16908308});
                } else {
                    listAdapter = this.w;
                    if (listAdapter == null) {
                        listAdapter = new h(this.a, i2, 16908308, this.v);
                    }
                }
            }
            e eVar = this.O;
            if (eVar != null) {
                eVar.a(recycleListView);
            }
            alertController.H = listAdapter;
            alertController.I = this.I;
            if (this.x != null) {
                dVar = new c(alertController);
            } else {
                if (this.J != null) {
                    dVar = new d(recycleListView, alertController);
                }
                onItemSelectedListener = this.N;
                if (onItemSelectedListener != null) {
                    recycleListView.setOnItemSelectedListener(onItemSelectedListener);
                }
                if (!this.H) {
                    recycleListView.setChoiceMode(1);
                } else if (this.G) {
                    recycleListView.setChoiceMode(2);
                }
                alertController.f85g = recycleListView;
            }
            recycleListView.setOnItemClickListener(dVar);
            onItemSelectedListener = this.N;
            if (onItemSelectedListener != null) {
            }
            if (!this.H) {
            }
            alertController.f85g = recycleListView;
        }

        public void a(AlertController alertController) {
            View view = this.f102g;
            if (view != null) {
                alertController.l(view);
            } else {
                CharSequence charSequence = this.f101f;
                if (charSequence != null) {
                    alertController.q(charSequence);
                }
                Drawable drawable = this.f99d;
                if (drawable != null) {
                    alertController.n(drawable);
                }
                int i2 = this.c;
                if (i2 != 0) {
                    alertController.m(i2);
                }
                int i3 = this.f100e;
                if (i3 != 0) {
                    alertController.m(alertController.c(i3));
                }
            }
            CharSequence charSequence2 = this.f103h;
            if (charSequence2 != null) {
                alertController.o(charSequence2);
            }
            CharSequence charSequence3 = this.f104i;
            if (!(charSequence3 == null && this.f105j == null)) {
                alertController.k(-1, charSequence3, this.f106k, null, this.f105j);
            }
            CharSequence charSequence4 = this.l;
            if (!(charSequence4 == null && this.m == null)) {
                alertController.k(-2, charSequence4, this.n, null, this.m);
            }
            CharSequence charSequence5 = this.o;
            if (!(charSequence5 == null && this.p == null)) {
                alertController.k(-3, charSequence5, this.q, null, this.p);
            }
            if (!(this.v == null && this.K == null && this.w == null)) {
                b(alertController);
            }
            View view2 = this.z;
            if (view2 == null) {
                int i4 = this.y;
                if (i4 != 0) {
                    alertController.r(i4);
                }
            } else if (this.E) {
                alertController.t(view2, this.A, this.B, this.C, this.D);
            } else {
                alertController.s(view2);
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class g extends Handler {
        private WeakReference<DialogInterface> a;

        public g(DialogInterface dialogInterface) {
            this.a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == -3 || i2 == -2 || i2 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.a.get(), message.what);
            } else if (i2 == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class h extends ArrayAdapter<CharSequence> {
        public h(Context context, int i2, int i3, CharSequence[] charSequenceArr) {
            super(context, i2, i3, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, androidx.appcompat.app.g gVar, Window window) {
        this.a = context;
        this.b = gVar;
        this.c = window;
        this.R = new g(gVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, j.D, e.a.a.n, 0);
        this.J = obtainStyledAttributes.getResourceId(j.E, 0);
        this.K = obtainStyledAttributes.getResourceId(j.G, 0);
        this.L = obtainStyledAttributes.getResourceId(j.I, 0);
        this.M = obtainStyledAttributes.getResourceId(j.J, 0);
        this.N = obtainStyledAttributes.getResourceId(j.L, 0);
        this.O = obtainStyledAttributes.getResourceId(j.H, 0);
        this.P = obtainStyledAttributes.getBoolean(j.K, true);
        this.f82d = obtainStyledAttributes.getDimensionPixelSize(j.F, 0);
        obtainStyledAttributes.recycle();
        gVar.d(1);
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    static void f(View view, View view2, View view3) {
        int i2 = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i2 = 4;
            }
            view3.setVisibility(i2);
        }
    }

    private ViewGroup i(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int j() {
        int i2 = this.K;
        return (i2 != 0 && this.Q == 1) ? i2 : this.J;
    }

    private void p(ViewGroup viewGroup, View view, int i2, int i3) {
        View findViewById = this.c.findViewById(e.a.f.v_res_0x7f08008d);
        View findViewById2 = this.c.findViewById(e.a.f.u_res_0x7f08008c);
        if (Build.VERSION.SDK_INT >= 23) {
            u.R(view, i2, i3);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 == null) {
                return;
            }
        } else {
            if (findViewById != null && (i2 & 1) == 0) {
                viewGroup.removeView(findViewById);
                findViewById = null;
            }
            if (findViewById2 != null && (i2 & 2) == 0) {
                viewGroup.removeView(findViewById2);
                findViewById2 = null;
            }
            if (findViewById != null || findViewById2 != null) {
                if (this.f84f != null) {
                    this.A.setOnScrollChangeListener(new b(this, findViewById, findViewById2));
                    this.A.post(new c(findViewById, findViewById2));
                    return;
                }
                ListView listView = this.f85g;
                if (listView != null) {
                    listView.setOnScrollListener(new d(this, findViewById, findViewById2));
                    this.f85g.post(new e(findViewById, findViewById2));
                    return;
                }
                if (findViewById != null) {
                    viewGroup.removeView(findViewById);
                }
                if (findViewById2 == null) {
                    return;
                }
            } else {
                return;
            }
        }
        viewGroup.removeView(findViewById2);
    }

    private void u(ViewGroup viewGroup) {
        boolean z;
        Button button;
        Button button2 = (Button) viewGroup.findViewById(16908313);
        this.o = button2;
        button2.setOnClickListener(this.S);
        boolean z2 = true;
        if (!TextUtils.isEmpty(this.p) || this.r != null) {
            this.o.setText(this.p);
            Drawable drawable = this.r;
            if (drawable != null) {
                int i2 = this.f82d;
                drawable.setBounds(0, 0, i2, i2);
                this.o.setCompoundDrawables(this.r, null, null, null);
            }
            this.o.setVisibility(0);
            z = true;
        } else {
            this.o.setVisibility(8);
            z = false;
        }
        Button button3 = (Button) viewGroup.findViewById(16908314);
        this.s = button3;
        button3.setOnClickListener(this.S);
        if (!TextUtils.isEmpty(this.t) || this.v != null) {
            this.s.setText(this.t);
            Drawable drawable2 = this.v;
            if (drawable2 != null) {
                int i3 = this.f82d;
                drawable2.setBounds(0, 0, i3, i3);
                this.s.setCompoundDrawables(this.v, null, null, null);
            }
            this.s.setVisibility(0);
            z |= true;
        } else {
            this.s.setVisibility(8);
        }
        Button button4 = (Button) viewGroup.findViewById(16908315);
        this.w = button4;
        button4.setOnClickListener(this.S);
        if (!TextUtils.isEmpty(this.x) || this.z != null) {
            this.w.setText(this.x);
            Drawable drawable3 = this.z;
            if (drawable3 != null) {
                int i4 = this.f82d;
                drawable3.setBounds(0, 0, i4, i4);
                this.w.setCompoundDrawables(this.z, null, null, null);
            }
            this.w.setVisibility(0);
            z |= true;
        } else {
            this.w.setVisibility(8);
        }
        if (z(this.a)) {
            if (z) {
                button = this.o;
            } else if (z) {
                button = this.s;
            } else if (z) {
                button = this.w;
            }
            b(button);
        }
        if (!z) {
            z2 = false;
        }
        if (!z2) {
            viewGroup.setVisibility(8);
        }
    }

    private void v(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.c.findViewById(e.a.f.w_res_0x7f08008e);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.F = textView;
        if (textView != null) {
            CharSequence charSequence = this.f84f;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.A.removeView(this.F);
            if (this.f85g != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
                int indexOfChild = viewGroup2.indexOfChild(this.A);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(this.f85g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    private void w(ViewGroup viewGroup) {
        View view = this.f86h;
        boolean z = false;
        if (view == null) {
            view = this.f87i != 0 ? LayoutInflater.from(this.a).inflate(this.f87i, viewGroup, false) : null;
        }
        if (view != null) {
            z = true;
        }
        if (!z || !a(view)) {
            this.c.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.c.findViewById(e.a.f.n_res_0x7f080054);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.n) {
                frameLayout.setPadding(this.f88j, this.f89k, this.l, this.m);
            }
            if (this.f85g != null) {
                ((LinearLayout.LayoutParams) ((j0.a) viewGroup.getLayoutParams())).weight = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void x(ViewGroup viewGroup) {
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.c.findViewById(e.a.f.O).setVisibility(8);
            return;
        }
        this.D = (ImageView) this.c.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f83e)) || !this.P) {
            this.c.findViewById(e.a.f.O).setVisibility(8);
            this.D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.c.findViewById(e.a.f.j_res_0x7f08003e);
        this.E = textView;
        textView.setText(this.f83e);
        int i2 = this.B;
        if (i2 != 0) {
            this.D.setImageResource(i2);
            return;
        }
        Drawable drawable = this.C;
        if (drawable != null) {
            this.D.setImageDrawable(drawable);
            return;
        }
        this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
        this.D.setVisibility(8);
    }

    private void y() {
        ListAdapter listAdapter;
        View findViewById;
        View findViewById2;
        View findViewById3 = this.c.findViewById(e.a.f.t_res_0x7f080083);
        int i2 = e.a.f.P;
        View findViewById4 = findViewById3.findViewById(i2);
        int i3 = e.a.f.m_res_0x7f080053;
        View findViewById5 = findViewById3.findViewById(i3);
        int i4 = e.a.f.k_res_0x7f080047;
        View findViewById6 = findViewById3.findViewById(i4);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(e.a.f.o_res_0x7f080055);
        w(viewGroup);
        View findViewById7 = viewGroup.findViewById(i2);
        View findViewById8 = viewGroup.findViewById(i3);
        View findViewById9 = viewGroup.findViewById(i4);
        ViewGroup i5 = i(findViewById7, findViewById4);
        ViewGroup i6 = i(findViewById8, findViewById5);
        ViewGroup i7 = i(findViewById9, findViewById6);
        v(i6);
        u(i7);
        x(i5);
        int i8 = 0;
        boolean z = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        boolean z2 = (i5 == null || i5.getVisibility() == 8) ? false : true;
        boolean z3 = (i7 == null || i7.getVisibility() == 8) ? false : true;
        if (!(z3 || i6 == null || (findViewById2 = i6.findViewById(e.a.f.K)) == null)) {
            findViewById2.setVisibility(0);
        }
        if (z2) {
            NestedScrollView nestedScrollView = this.A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (!(this.f84f == null && this.f85g == null)) {
                view = i5.findViewById(e.a.f.N);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (!(i6 == null || (findViewById = i6.findViewById(e.a.f.L)) == null)) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f85g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z2, z3);
        }
        if (!z) {
            View view2 = this.f85g;
            if (view2 == null) {
                view2 = this.A;
            }
            if (view2 != null) {
                if (z3) {
                    i8 = 2;
                }
                int i9 = z2 ? 1 : 0;
                char c2 = z2 ? 1 : 0;
                p(i6, view2, i9 | i8, 3);
            }
        }
        ListView listView2 = this.f85g;
        if (listView2 != null && (listAdapter = this.H) != null) {
            listView2.setAdapter(listAdapter);
            int i10 = this.I;
            if (i10 > -1) {
                listView2.setItemChecked(i10, true);
                listView2.setSelection(i10);
            }
        }
    }

    private static boolean z(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(e.a.a.m, typedValue, true);
        return typedValue.data != 0;
    }

    public int c(int i2) {
        TypedValue typedValue = new TypedValue();
        this.a.getTheme().resolveAttribute(i2, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView d() {
        return this.f85g;
    }

    public void e() {
        this.b.setContentView(j());
        y();
    }

    public boolean g(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.q(keyEvent);
    }

    public boolean h(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.q(keyEvent);
    }

    public void k(int i2, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i2, onClickListener);
        }
        if (i2 == -3) {
            this.x = charSequence;
            this.y = message;
            this.z = drawable;
        } else if (i2 == -2) {
            this.t = charSequence;
            this.u = message;
            this.v = drawable;
        } else if (i2 == -1) {
            this.p = charSequence;
            this.q = message;
            this.r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    public void l(View view) {
        this.G = view;
    }

    public void m(int i2) {
        this.C = null;
        this.B = i2;
        ImageView imageView = this.D;
        if (imageView == null) {
            return;
        }
        if (i2 != 0) {
            imageView.setVisibility(0);
            this.D.setImageResource(this.B);
            return;
        }
        imageView.setVisibility(8);
    }

    public void n(Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setVisibility(0);
            this.D.setImageDrawable(drawable);
            return;
        }
        imageView.setVisibility(8);
    }

    public void o(CharSequence charSequence) {
        this.f84f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(CharSequence charSequence) {
        this.f83e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void r(int i2) {
        this.f86h = null;
        this.f87i = i2;
        this.n = false;
    }

    public void s(View view) {
        this.f86h = view;
        this.f87i = 0;
        this.n = false;
    }

    public void t(View view, int i2, int i3, int i4, int i5) {
        this.f86h = view;
        this.f87i = 0;
        this.n = true;
        this.f88j = i2;
        this.f89k = i3;
        this.l = i4;
        this.m = i5;
    }
}

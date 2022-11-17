package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import e.a.d;
import e.a.f;
import e.a.g;
import e.a.i;
/* loaded from: classes.dex */
class b1 {
    private final Context a;
    private final View b;
    private final TextView c;

    /* renamed from: d  reason: collision with root package name */
    private final WindowManager.LayoutParams f371d;

    /* renamed from: e  reason: collision with root package name */
    private final Rect f372e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    private final int[] f373f = new int[2];

    /* renamed from: g  reason: collision with root package name */
    private final int[] f374g = new int[2];

    /* JADX INFO: Access modifiers changed from: package-private */
    public b1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f371d = layoutParams;
        this.a = context;
        View inflate = LayoutInflater.from(context).inflate(g.s, (ViewGroup) null);
        this.b = inflate;
        this.c = (TextView) inflate.findViewById(f.s_res_0x7f080078);
        layoutParams.setTitle(b1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = i.a;
        layoutParams.flags = 24;
    }

    private void a(View view, int i2, int i3, boolean z, WindowManager.LayoutParams layoutParams) {
        int i4;
        int i5;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.a.getResources().getDimensionPixelOffset(d.m);
        if (view.getWidth() < dimensionPixelOffset) {
            i2 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.a.getResources().getDimensionPixelOffset(d.l);
            i5 = i3 + dimensionPixelOffset2;
            i4 = i3 - dimensionPixelOffset2;
        } else {
            i5 = view.getHeight();
            i4 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.a.getResources().getDimensionPixelOffset(z ? d.o : d.n);
        View b = b(view);
        if (b == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        b.getWindowVisibleDisplayFrame(this.f372e);
        Rect rect = this.f372e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f372e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        b.getLocationOnScreen(this.f374g);
        view.getLocationOnScreen(this.f373f);
        int[] iArr = this.f373f;
        int i6 = iArr[0];
        int[] iArr2 = this.f374g;
        iArr[0] = i6 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i2) - (b.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.b.getMeasuredHeight();
        int[] iArr3 = this.f373f;
        int i7 = ((iArr3[1] + i4) - dimensionPixelOffset3) - measuredHeight;
        int i8 = iArr3[1] + i5 + dimensionPixelOffset3;
        if (!z ? measuredHeight + i8 > this.f372e.height() : i7 >= 0) {
            layoutParams.y = i7;
        } else {
            layoutParams.y = i8;
        }
    }

    private static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        if (d()) {
            ((WindowManager) this.a.getSystemService("window")).removeView(this.b);
        }
    }

    boolean d() {
        return this.b.getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(View view, int i2, int i3, boolean z, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.c.setText(charSequence);
        a(view, i2, i3, z, this.f371d);
        ((WindowManager) this.a.getSystemService("window")).addView(this.b, this.f371d);
    }
}

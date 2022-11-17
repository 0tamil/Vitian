package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import e.a.j;
import e.d.p.u;
import e.d.p.y;
import e.d.p.z;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* renamed from: e  reason: collision with root package name */
    protected final C0011a f342e;

    /* renamed from: f  reason: collision with root package name */
    protected final Context f343f;

    /* renamed from: g  reason: collision with root package name */
    protected ActionMenuView f344g;

    /* renamed from: h  reason: collision with root package name */
    protected c f345h;

    /* renamed from: i  reason: collision with root package name */
    protected int f346i;

    /* renamed from: j  reason: collision with root package name */
    protected y f347j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f348k;
    private boolean l;

    /* renamed from: androidx.appcompat.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    protected class C0011a implements z {
        private boolean a = false;
        int b;

        protected C0011a() {
        }

        @Override // e.d.p.z
        public void a(View view) {
            if (!this.a) {
                a aVar = a.this;
                aVar.f347j = null;
                a.super.setVisibility(this.b);
            }
        }

        @Override // e.d.p.z
        public void b(View view) {
            a.super.setVisibility(0);
            this.a = false;
        }

        @Override // e.d.p.z
        public void c(View view) {
            this.a = true;
        }

        public C0011a d(y yVar, int i2) {
            a.this.f347j = yVar;
            this.b = i2;
            return this;
        }
    }

    a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f342e = new C0011a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(e.a.a.a_res_0x7f030002, typedValue, true) || typedValue.resourceId == 0) {
            this.f343f = context;
        } else {
            this.f343f = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int d(int i2, int i3, boolean z) {
        return z ? i2 - i3 : i2 + i3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int c(View view, int i2, int i3, int i4) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), i3);
        return Math.max(0, (i2 - view.getMeasuredWidth()) - i4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int e(View view, int i2, int i3, int i4, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = i3 + ((i4 - measuredHeight) / 2);
        if (z) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
        } else {
            view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public y f(int i2, long j2) {
        y yVar = this.f347j;
        if (yVar != null) {
            yVar.b();
        }
        if (i2 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            y b = u.b(this);
            b.a(1.0f);
            b.d(j2);
            C0011a aVar = this.f342e;
            aVar.d(b, i2);
            b.f(aVar);
            return b;
        }
        y b2 = u.b(this);
        b2.a(0.0f);
        b2.d(j2);
        C0011a aVar2 = this.f342e;
        aVar2.d(b2, i2);
        b2.f(aVar2);
        return b2;
    }

    public int getAnimatedVisibility() {
        return this.f347j != null ? this.f342e.b : getVisibility();
    }

    public int getContentHeight() {
        return this.f346i;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, j.a, e.a.a.c, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(j.f1946j, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.f345h;
        if (cVar != null) {
            cVar.F(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.l = false;
        }
        if (!this.l) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.l = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.l = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f348k = false;
        }
        if (!this.f348k) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f348k = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f348k = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i2);

    @Override // android.view.View
    public void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            y yVar = this.f347j;
            if (yVar != null) {
                yVar.b();
            }
            super.setVisibility(i2);
        }
    }
}

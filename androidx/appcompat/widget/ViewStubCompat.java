package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import e.a.j;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: e  reason: collision with root package name */
    private int f337e;

    /* renamed from: f  reason: collision with root package name */
    private int f338f;

    /* renamed from: g  reason: collision with root package name */
    private WeakReference<View> f339g;

    /* renamed from: h  reason: collision with root package name */
    private LayoutInflater f340h;

    /* renamed from: i  reason: collision with root package name */
    private a f341i;

    /* loaded from: classes.dex */
    public interface a {
        void a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f337e = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.p3, i2, 0);
        this.f338f = obtainStyledAttributes.getResourceId(j.s3, -1);
        this.f337e = obtainStyledAttributes.getResourceId(j.r3, 0);
        setId(obtainStyledAttributes.getResourceId(j.q3, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f337e != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f340h;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f337e, viewGroup, false);
            int i2 = this.f338f;
            if (i2 != -1) {
                inflate.setId(i2);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f339g = new WeakReference<>(inflate);
            a aVar = this.f341i;
            if (aVar != null) {
                aVar.a(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f338f;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f340h;
    }

    public int getLayoutResource() {
        return this.f337e;
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i2) {
        this.f338f = i2;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f340h = layoutInflater;
    }

    public void setLayoutResource(int i2) {
        this.f337e = i2;
    }

    public void setOnInflateListener(a aVar) {
        this.f341i = aVar;
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        WeakReference<View> weakReference = this.f339g;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view != null) {
                view.setVisibility(i2);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i2);
        if (i2 == 0 || i2 == 4) {
            a();
        }
    }
}

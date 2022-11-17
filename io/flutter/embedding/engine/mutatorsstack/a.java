package io.flutter.embedding.engine.mutatorsstack;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import h.a.e.e;
import io.flutter.embedding.android.b;
/* loaded from: classes.dex */
public class a extends FrameLayout {

    /* renamed from: e  reason: collision with root package name */
    private FlutterMutatorsStack f3133e;

    /* renamed from: f  reason: collision with root package name */
    private float f3134f;

    /* renamed from: g  reason: collision with root package name */
    private int f3135g;

    /* renamed from: h  reason: collision with root package name */
    private int f3136h;

    /* renamed from: i  reason: collision with root package name */
    private int f3137i;

    /* renamed from: j  reason: collision with root package name */
    private int f3138j;

    /* renamed from: k  reason: collision with root package name */
    private final b f3139k;
    ViewTreeObserver.OnGlobalFocusChangeListener l;

    /* renamed from: io.flutter.embedding.engine.mutatorsstack.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class ViewTreeObserver$OnGlobalFocusChangeListenerC0131a implements ViewTreeObserver.OnGlobalFocusChangeListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ View.OnFocusChangeListener f3140e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ View f3141f;

        ViewTreeObserver$OnGlobalFocusChangeListenerC0131a(a aVar, View.OnFocusChangeListener onFocusChangeListener, View view) {
            this.f3140e = onFocusChangeListener;
            this.f3141f = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
        public void onGlobalFocusChanged(View view, View view2) {
            View.OnFocusChangeListener onFocusChangeListener = this.f3140e;
            View view3 = this.f3141f;
            onFocusChangeListener.onFocusChange(view3, e.a(view3));
        }
    }

    public a(Context context, float f2, b bVar) {
        super(context, null);
        this.f3134f = f2;
        this.f3139k = bVar;
    }

    private Matrix getPlatformViewMatrix() {
        Matrix matrix = new Matrix(this.f3133e.getFinalMatrix());
        float f2 = this.f3134f;
        matrix.preScale(1.0f / f2, 1.0f / f2);
        matrix.postTranslate(-this.f3135g, -this.f3136h);
        return matrix;
    }

    public void a(FlutterMutatorsStack flutterMutatorsStack, int i2, int i3, int i4, int i5) {
        this.f3133e = flutterMutatorsStack;
        this.f3135g = i2;
        this.f3136h = i3;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i5);
        layoutParams.leftMargin = i2;
        layoutParams.topMargin = i3;
        setLayoutParams(layoutParams);
        setWillNotDraw(false);
    }

    public void b() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && (onGlobalFocusChangeListener = this.l) != null) {
            this.l = null;
            viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.concat(getPlatformViewMatrix());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.save();
        for (Path path : this.f3133e.getFinalClippingPaths()) {
            Path path2 = new Path(path);
            path2.offset(-this.f3135g, -this.f3136h);
            canvas.clipPath(path2);
        }
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i2;
        float f2;
        if (this.f3139k == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i3 = this.f3135g;
            this.f3137i = i3;
            i2 = this.f3136h;
            this.f3138j = i2;
            f2 = i3;
        } else if (action != 2) {
            f2 = this.f3135g;
            i2 = this.f3136h;
        } else {
            matrix.postTranslate(this.f3137i, this.f3138j);
            this.f3137i = this.f3135g;
            this.f3138j = this.f3136h;
            return this.f3139k.f(motionEvent, matrix);
        }
        matrix.postTranslate(f2, i2);
        return this.f3139k.f(motionEvent, matrix);
    }

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        b();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.l == null) {
            ViewTreeObserver$OnGlobalFocusChangeListenerC0131a aVar = new ViewTreeObserver$OnGlobalFocusChangeListenerC0131a(this, onFocusChangeListener, this);
            this.l = aVar;
            viewTreeObserver.addOnGlobalFocusChangeListener(aVar);
        }
    }
}

package io.flutter.embedding.android;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import io.flutter.embedding.android.k;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FlutterSplashView extends FrameLayout {
    private static String n = "FlutterSplashView";

    /* renamed from: e  reason: collision with root package name */
    private q f2907e;

    /* renamed from: f  reason: collision with root package name */
    private k f2908f;

    /* renamed from: g  reason: collision with root package name */
    private View f2909g;

    /* renamed from: h  reason: collision with root package name */
    Bundle f2910h;

    /* renamed from: i  reason: collision with root package name */
    private String f2911i;

    /* renamed from: j  reason: collision with root package name */
    private String f2912j;

    /* renamed from: k  reason: collision with root package name */
    private final k.f f2913k;
    private final io.flutter.embedding.engine.renderer.b l;
    private final Runnable m;

    @Keep
    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static Parcelable.Creator<SavedState> CREATOR = new a();
        private String previousCompletedSplashIsolate;
        private Bundle splashScreenState;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.previousCompletedSplashIsolate = parcel.readString();
            this.splashScreenState = parcel.readBundle(getClass().getClassLoader());
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeString(this.previousCompletedSplashIsolate);
            parcel.writeBundle(this.splashScreenState);
        }
    }

    /* loaded from: classes.dex */
    class a implements k.f {
        a() {
        }

        @Override // io.flutter.embedding.android.k.f
        public void a(io.flutter.embedding.engine.b bVar) {
            FlutterSplashView.this.f2908f.u(this);
            FlutterSplashView flutterSplashView = FlutterSplashView.this;
            flutterSplashView.g(flutterSplashView.f2908f, FlutterSplashView.this.f2907e);
        }

        @Override // io.flutter.embedding.android.k.f
        public void b() {
        }
    }

    /* loaded from: classes.dex */
    class b implements io.flutter.embedding.engine.renderer.b {
        b() {
        }

        @Override // io.flutter.embedding.engine.renderer.b
        public void c() {
        }

        @Override // io.flutter.embedding.engine.renderer.b
        public void f() {
            if (FlutterSplashView.this.f2907e != null) {
                FlutterSplashView.this.k();
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FlutterSplashView flutterSplashView = FlutterSplashView.this;
            flutterSplashView.removeView(flutterSplashView.f2909g);
            FlutterSplashView flutterSplashView2 = FlutterSplashView.this;
            flutterSplashView2.f2912j = flutterSplashView2.f2911i;
        }
    }

    public FlutterSplashView(Context context) {
        this(context, null, 0);
    }

    public FlutterSplashView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f2913k = new a();
        this.l = new b();
        this.m = new c();
        setSaveEnabled(true);
    }

    private boolean h() {
        k kVar = this.f2908f;
        if (kVar == null) {
            throw new IllegalStateException("Cannot determine if splash has completed when no FlutterView is set.");
        } else if (kVar.t()) {
            return this.f2908f.getAttachedFlutterEngine().h().l() != null && this.f2908f.getAttachedFlutterEngine().h().l().equals(this.f2912j);
        } else {
            throw new IllegalStateException("Cannot determine if splash has completed when no FlutterEngine is attached to our FlutterView. This question depends on an isolate ID to differentiate Flutter experiences.");
        }
    }

    private boolean i() {
        k kVar = this.f2908f;
        return kVar != null && kVar.t() && !this.f2908f.r() && !h();
    }

    private boolean j() {
        q qVar;
        k kVar = this.f2908f;
        return kVar != null && kVar.t() && (qVar = this.f2907e) != null && qVar.b() && l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        this.f2911i = this.f2908f.getAttachedFlutterEngine().h().l();
        String str = n;
        h.a.b.e(str, "Transitioning splash screen to a Flutter UI. Isolate: " + this.f2911i);
        this.f2907e.a(this.m);
    }

    private boolean l() {
        k kVar = this.f2908f;
        if (kVar == null) {
            throw new IllegalStateException("Cannot determine if previous splash transition was interrupted when no FlutterView is set.");
        } else if (kVar.t()) {
            return this.f2908f.r() && !h();
        } else {
            throw new IllegalStateException("Cannot determine if previous splash transition was interrupted when no FlutterEngine is attached to our FlutterView. This question depends on an isolate ID to differentiate Flutter experiences.");
        }
    }

    public void g(k kVar, q qVar) {
        k kVar2 = this.f2908f;
        if (kVar2 != null) {
            kVar2.v(this.l);
            removeView(this.f2908f);
        }
        View view = this.f2909g;
        if (view != null) {
            removeView(view);
        }
        this.f2908f = kVar;
        addView(kVar);
        this.f2907e = qVar;
        if (qVar == null) {
            return;
        }
        if (i()) {
            h.a.b.e(n, "Showing splash screen UI.");
            View c2 = qVar.c(getContext(), this.f2910h);
            this.f2909g = c2;
            addView(c2);
            kVar.i(this.l);
        } else if (j()) {
            h.a.b.e(n, "Showing an immediate splash transition to Flutter due to previously interrupted transition.");
            View c3 = qVar.c(getContext(), this.f2910h);
            this.f2909g = c3;
            addView(c3);
            k();
        } else if (!kVar.t()) {
            h.a.b.e(n, "FlutterView is not yet attached to a FlutterEngine. Showing nothing until a FlutterEngine is attached.");
            kVar.h(this.f2913k);
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f2912j = savedState.previousCompletedSplashIsolate;
        this.f2910h = savedState.splashScreenState;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.previousCompletedSplashIsolate = this.f2912j;
        q qVar = this.f2907e;
        savedState.splashScreenState = qVar != null ? qVar.d() : null;
        return savedState;
    }
}

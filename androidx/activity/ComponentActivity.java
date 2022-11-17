package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.d;
import androidx.activity.result.e;
import androidx.activity.result.f;
import androidx.activity.result.g.a;
import androidx.core.app.g;
import androidx.lifecycle.d;
import androidx.lifecycle.h;
import androidx.lifecycle.o;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.savedstate.SavedStateRegistry;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class ComponentActivity extends g implements androidx.lifecycle.g, t, androidx.savedstate.c, androidx.activity.c, e {

    /* renamed from: i  reason: collision with root package name */
    private s f54i;

    /* renamed from: k  reason: collision with root package name */
    private int f56k;

    /* renamed from: f  reason: collision with root package name */
    final androidx.activity.d.a f51f = new androidx.activity.d.a();

    /* renamed from: g  reason: collision with root package name */
    private final h f52g = new h(this);

    /* renamed from: h  reason: collision with root package name */
    final androidx.savedstate.b f53h = androidx.savedstate.b.a(this);

    /* renamed from: j  reason: collision with root package name */
    private final OnBackPressedDispatcher f55j = new OnBackPressedDispatcher(new a());
    private final d l = new b();

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e2) {
                if (!TextUtils.equals(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e2;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    class b extends d {

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ int f59e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ a.C0007a f60f;

            a(int i2, a.C0007a aVar) {
                this.f59e = i2;
                this.f60f = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.c(this.f59e, this.f60f.a());
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0005b implements Runnable {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ int f62e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ IntentSender.SendIntentException f63f;

            RunnableC0005b(int i2, IntentSender.SendIntentException sendIntentException) {
                this.f62e = i2;
                this.f63f = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.b(this.f62e, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f63f));
            }
        }

        b() {
        }

        @Override // androidx.activity.result.d
        public <I, O> void f(int i2, androidx.activity.result.g.a<I, O> aVar, I i3, androidx.core.app.b bVar) {
            Bundle bundle;
            ComponentActivity componentActivity = ComponentActivity.this;
            a.C0007a<O> b = aVar.b(componentActivity, i3);
            if (b != null) {
                new Handler(Looper.getMainLooper()).post(new a(i2, b));
                return;
            }
            Intent a2 = aVar.a(componentActivity, i3);
            if (a2.getExtras() != null && a2.getExtras().getClassLoader() == null) {
                a2.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a2.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundle = a2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else if (bVar == null) {
                bundle = null;
            } else {
                bVar.a();
                throw null;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a2.getAction())) {
                String[] stringArrayExtra = a2.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                androidx.core.app.a.p(componentActivity, stringArrayExtra, i2);
            } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a2.getAction())) {
                f fVar = (f) a2.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    androidx.core.app.a.s(componentActivity, fVar.d(), i2, fVar.a(), fVar.b(), fVar.c(), 0, bundle);
                } catch (IntentSender.SendIntentException e2) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0005b(i2, e2));
                }
            } else {
                androidx.core.app.a.r(componentActivity, a2, i2, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c {
        Object a;
        s b;

        c() {
        }
    }

    public ComponentActivity() {
        new AtomicInteger();
        if (a() != null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 19) {
                a().a(new androidx.lifecycle.e() { // from class: androidx.activity.ComponentActivity.3
                    @Override // androidx.lifecycle.e
                    public void d(androidx.lifecycle.g gVar, d.b bVar) {
                        if (bVar == d.b.ON_STOP) {
                            Window window = ComponentActivity.this.getWindow();
                            View peekDecorView = window != null ? window.peekDecorView() : null;
                            if (peekDecorView != null) {
                                peekDecorView.cancelPendingInputEvents();
                            }
                        }
                    }
                });
            }
            a().a(new androidx.lifecycle.e() { // from class: androidx.activity.ComponentActivity.4
                @Override // androidx.lifecycle.e
                public void d(androidx.lifecycle.g gVar, d.b bVar) {
                    if (bVar == d.b.ON_DESTROY) {
                        ComponentActivity.this.f51f.b();
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.g().a();
                        }
                    }
                }
            });
            a().a(new androidx.lifecycle.e() { // from class: androidx.activity.ComponentActivity.5
                @Override // androidx.lifecycle.e
                public void d(androidx.lifecycle.g gVar, d.b bVar) {
                    ComponentActivity.this.n();
                    ComponentActivity.this.a().c(this);
                }
            });
            if (19 <= i2 && i2 <= 23) {
                a().a(new ImmLeaksCleaner(this));
                return;
            }
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    private void o() {
        u.a(getWindow().getDecorView(), this);
        v.a(getWindow().getDecorView(), this);
        androidx.savedstate.d.a(getWindow().getDecorView(), this);
    }

    @Override // androidx.lifecycle.g
    public androidx.lifecycle.d a() {
        return this.f52g;
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        o();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.activity.result.e
    public final androidx.activity.result.d c() {
        return this.l;
    }

    @Override // androidx.lifecycle.t
    public s g() {
        if (getApplication() != null) {
            n();
            return this.f54i;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // androidx.activity.c
    public final OnBackPressedDispatcher i() {
        return this.f55j;
    }

    @Override // androidx.savedstate.c
    public final SavedStateRegistry j() {
        return this.f53h.b();
    }

    public final void m(androidx.activity.d.b bVar) {
        this.f51f.a(bVar);
    }

    void n() {
        if (this.f54i == null) {
            c cVar = (c) getLastNonConfigurationInstance();
            if (cVar != null) {
                this.f54i = cVar.b;
            }
            if (this.f54i == null) {
                this.f54i = new s();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (!this.l.b(i2, i3, intent)) {
            super.onActivityResult(i2, i3, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f55j.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.app.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f53h.c(bundle);
        this.f51f.c(this);
        super.onCreate(bundle);
        this.l.g(bundle);
        o.f(this);
        int i2 = this.f56k;
        if (i2 != 0) {
            setContentView(i2);
        }
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (!this.l.b(i2, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) && Build.VERSION.SDK_INT >= 23) {
            super.onRequestPermissionsResult(i2, strArr, iArr);
        }
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        c cVar;
        Object p = p();
        s sVar = this.f54i;
        if (sVar == null && (cVar = (c) getLastNonConfigurationInstance()) != null) {
            sVar = cVar.b;
        }
        if (sVar == null && p == null) {
            return null;
        }
        c cVar2 = new c();
        cVar2.a = p;
        cVar2.b = sVar;
        return cVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.app.g, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.d a2 = a();
        if (a2 instanceof h) {
            ((h) a2).o(d.c.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f53h.d(bundle);
        this.l.h(bundle);
    }

    @Deprecated
    public Object p() {
        return null;
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (e.l.a.d()) {
                e.l.a.a("reportFullyDrawn() for " + getComponentName());
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 > 19 || (i2 == 19 && androidx.core.content.a.a(this, "android.permission.UPDATE_DEVICE_STATS") == 0)) {
                super.reportFullyDrawn();
            }
        } finally {
            e.l.a.b();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i2) {
        o();
        super.setContentView(i2);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        o();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        o();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2) {
        super.startActivityForResult(intent, i2);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        super.startActivityForResult(intent, i2, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5) {
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }
}

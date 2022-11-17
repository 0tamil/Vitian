package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.util.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: i  reason: collision with root package name */
    private static final c f1082i = new c();

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f1083e = new AtomicBoolean();

    /* renamed from: f  reason: collision with root package name */
    private final AtomicBoolean f1084f = new AtomicBoolean();

    /* renamed from: g  reason: collision with root package name */
    private final ArrayList<a> f1085g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    private boolean f1086h = false;

    /* loaded from: classes.dex */
    public interface a {
        void a(boolean z);
    }

    private c() {
    }

    public static c b() {
        return f1082i;
    }

    public static void c(Application application) {
        c cVar = f1082i;
        synchronized (cVar) {
            if (!cVar.f1086h) {
                application.registerActivityLifecycleCallbacks(cVar);
                application.registerComponentCallbacks(cVar);
                cVar.f1086h = true;
            }
        }
    }

    private final void f(boolean z) {
        synchronized (f1082i) {
            Iterator<a> it = this.f1085g.iterator();
            while (it.hasNext()) {
                it.next().a(z);
            }
        }
    }

    public void a(a aVar) {
        synchronized (f1082i) {
            this.f1085g.add(aVar);
        }
    }

    public boolean d() {
        return this.f1083e.get();
    }

    @TargetApi(16)
    public boolean e(boolean z) {
        if (!this.f1084f.get()) {
            if (!j.b()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f1084f.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f1083e.set(true);
            }
        }
        return d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f1083e.compareAndSet(true, false);
        this.f1084f.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f1083e.compareAndSet(true, false);
        this.f1084f.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        if (i2 == 20 && this.f1083e.compareAndSet(false, true)) {
            this.f1084f.set(true);
            f(true);
        }
    }
}

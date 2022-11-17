package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
/* loaded from: classes.dex */
final class c {
    protected static final Class<?> a;

    /* renamed from: d  reason: collision with root package name */
    protected static final Method f545d;

    /* renamed from: e  reason: collision with root package name */
    protected static final Method f546e;

    /* renamed from: f  reason: collision with root package name */
    protected static final Method f547f;

    /* renamed from: g  reason: collision with root package name */
    private static final Handler f548g = new Handler(Looper.getMainLooper());
    protected static final Field b = b();
    protected static final Field c = f();

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ d f549e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Object f550f;

        a(d dVar, Object obj) {
            this.f549e = dVar;
            this.f550f = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f549e.f555e = this.f550f;
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Application f551e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ d f552f;

        b(Application application, d dVar) {
            this.f551e = application;
            this.f552f = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f551e.unregisterActivityLifecycleCallbacks(this.f552f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0014c implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f553e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Object f554f;

        RunnableC0014c(Object obj, Object obj2) {
            this.f553e = obj;
            this.f554f = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Boolean bool = Boolean.FALSE;
            try {
                Method method = c.f545d;
                if (method != null) {
                    method.invoke(this.f553e, this.f554f, bool, "AppCompat recreation");
                } else {
                    c.f546e.invoke(this.f553e, this.f554f, bool);
                }
            } catch (RuntimeException e2) {
                if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                    throw e2;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: e  reason: collision with root package name */
        Object f555e;

        /* renamed from: f  reason: collision with root package name */
        private Activity f556f;

        /* renamed from: g  reason: collision with root package name */
        private final int f557g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f558h = false;

        /* renamed from: i  reason: collision with root package name */
        private boolean f559i = false;

        /* renamed from: j  reason: collision with root package name */
        private boolean f560j = false;

        d(Activity activity) {
            this.f556f = activity;
            this.f557g = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f556f == activity) {
                this.f556f = null;
                this.f559i = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (this.f559i && !this.f560j && !this.f558h && c.h(this.f555e, this.f557g, activity)) {
                this.f560j = true;
                this.f555e = null;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f556f == activity) {
                this.f558h = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> a2 = a();
        a = a2;
        f545d = d(a2);
        f546e = c(a2);
        f547f = e(a2);
    }

    private static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 == 26 || i2 == 27;
    }

    protected static boolean h(Object obj, int i2, Activity activity) {
        try {
            Object obj2 = c.get(activity);
            if (obj2 == obj && activity.hashCode() == i2) {
                f548g.postAtFrontOfQueue(new RunnableC0014c(b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (g() && f547f == null) {
            return false;
        } else {
            if (f546e == null && f545d == null) {
                return false;
            }
            try {
                Object obj2 = c.get(activity);
                if (obj2 == null || (obj = b.get(activity)) == null) {
                    return false;
                }
                Application application = activity.getApplication();
                d dVar = new d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                Handler handler = f548g;
                handler.post(new a(dVar, obj2));
                if (g()) {
                    Method method = f547f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}

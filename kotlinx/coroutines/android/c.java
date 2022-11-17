package kotlinx.coroutines.android;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import j.l;
import j.m;
import java.util.Objects;
/* loaded from: classes.dex */
public final class c {
    private static volatile Choreographer choreographer;

    static {
        Object obj;
        b bVar = null;
        try {
            l.a aVar = l.f3445e;
            obj = new a(a(Looper.getMainLooper(), true), null, 2, null);
            l.a(obj);
        } catch (Throwable th) {
            l.a aVar2 = l.f3445e;
            obj = m.a(th);
            l.a(obj);
        }
        if (!l.c(obj)) {
            bVar = obj;
        }
    }

    public static final Handler a(Looper looper, boolean z) {
        int i2;
        if (!z || (i2 = Build.VERSION.SDK_INT) < 16) {
            return new Handler(looper);
        }
        if (i2 >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            Objects.requireNonNull(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}

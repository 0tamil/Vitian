package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
final class ImmLeaksCleaner implements e {
    private static int b;
    private static Field c;

    /* renamed from: d  reason: collision with root package name */
    private static Field f65d;

    /* renamed from: e  reason: collision with root package name */
    private static Field f66e;
    private Activity a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ImmLeaksCleaner(Activity activity) {
        this.a = activity;
    }

    private static void h() {
        try {
            b = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f65d = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f66e = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            c = declaredField3;
            declaredField3.setAccessible(true);
            b = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.e
    public void d(g gVar, d.b bVar) {
        if (bVar == d.b.ON_DESTROY) {
            if (b == 0) {
                h();
            }
            if (b == 1) {
                InputMethodManager inputMethodManager = (InputMethodManager) this.a.getSystemService("input_method");
                try {
                    Object obj = c.get(inputMethodManager);
                    if (obj != null) {
                        synchronized (obj) {
                            try {
                                try {
                                    View view = (View) f65d.get(inputMethodManager);
                                    if (view != null) {
                                        if (!view.isAttachedToWindow()) {
                                            try {
                                                f66e.set(inputMethodManager, null);
                                                inputMethodManager.isActive();
                                            } catch (IllegalAccessException unused) {
                                            }
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            } catch (ClassCastException unused2) {
                            } catch (IllegalAccessException unused3) {
                            }
                        }
                    }
                } catch (IllegalAccessException unused4) {
                }
            }
        }
    }
}

package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class u0 extends ContextWrapper {
    private static final Object c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static ArrayList<WeakReference<u0>> f487d;
    private final Resources a;
    private final Resources.Theme b;

    private u0(Context context) {
        super(context);
        if (c1.b()) {
            c1 c1Var = new c1(this, context.getResources());
            this.a = c1Var;
            Resources.Theme newTheme = c1Var.newTheme();
            this.b = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.a = new w0(this, context.getResources());
        this.b = null;
    }

    private static boolean a(Context context) {
        if ((context instanceof u0) || (context.getResources() instanceof w0) || (context.getResources() instanceof c1)) {
            return false;
        }
        return Build.VERSION.SDK_INT < 21 || c1.b();
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (c) {
            ArrayList<WeakReference<u0>> arrayList = f487d;
            if (arrayList == null) {
                f487d = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference<u0> weakReference = f487d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f487d.remove(size);
                    }
                }
                for (int size2 = f487d.size() - 1; size2 >= 0; size2--) {
                    WeakReference<u0> weakReference2 = f487d.get(size2);
                    u0 u0Var = weakReference2 != null ? weakReference2.get() : null;
                    if (u0Var != null && u0Var.getBaseContext() == context) {
                        return u0Var;
                    }
                }
            }
            u0 u0Var2 = new u0(context);
            f487d.add(new WeakReference<>(u0Var2));
            return u0Var2;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
        Resources.Theme theme = this.b;
        if (theme == null) {
            super.setTheme(i2);
        } else {
            theme.applyStyle(i2, true);
        }
    }
}

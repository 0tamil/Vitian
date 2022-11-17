package androidx.core.content.d;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.core.content.d.c;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public final class f {
    private static final ThreadLocal<TypedValue> a = new ThreadLocal<>();
    private static final WeakHashMap<b, SparseArray<a>> b = new WeakHashMap<>(0);
    private static final Object c = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {
        final ColorStateList a;
        final Configuration b;

        a(ColorStateList colorStateList, Configuration configuration) {
            this.a = colorStateList;
            this.b = configuration;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {
        final Resources a;
        final Resources.Theme b;

        b(Resources resources, Resources.Theme theme) {
            this.a = resources;
            this.b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && e.d.o.c.a(this.b, bVar.b);
        }

        public int hashCode() {
            return e.d.o.c.b(this.a, this.b);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Typeface f624e;

            a(Typeface typeface) {
                this.f624e = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.e(this.f624e);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class b implements Runnable {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ int f626e;

            b(int i2) {
                this.f626e = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.d(this.f626e);
            }
        }

        public static Handler c(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void a(int i2, Handler handler) {
            c(handler).post(new b(i2));
        }

        public final void b(Typeface typeface, Handler handler) {
            c(handler).post(new a(typeface));
        }

        public abstract void d(int i2);

        public abstract void e(Typeface typeface);
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* loaded from: classes.dex */
        static class a {
            private static final Object a = new Object();
            private static Method b;
            private static boolean c;

            static void a(Resources.Theme theme) {
                synchronized (a) {
                    if (!c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e2) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e2);
                        }
                        c = true;
                    }
                    Method method = b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e3) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e3);
                            b = null;
                        }
                    }
                }
            }
        }

        /* loaded from: classes.dex */
        static class b {
            static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 29) {
                b.a(theme);
            } else if (i2 >= 23) {
                a.a(theme);
            }
        }
    }

    private static void a(b bVar, int i2, ColorStateList colorStateList) {
        synchronized (c) {
            WeakHashMap<b, SparseArray<a>> weakHashMap = b;
            SparseArray<a> sparseArray = weakHashMap.get(bVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(bVar, sparseArray);
            }
            sparseArray.append(i2, new a(colorStateList, bVar.a.getConfiguration()));
        }
    }

    private static ColorStateList b(b bVar, int i2) {
        a aVar;
        synchronized (c) {
            SparseArray<a> sparseArray = b.get(bVar);
            if (!(sparseArray == null || sparseArray.size() <= 0 || (aVar = sparseArray.get(i2)) == null)) {
                if (aVar.b.equals(bVar.a.getConfiguration())) {
                    return aVar.a;
                }
                sparseArray.remove(i2);
            }
            return null;
        }
    }

    public static ColorStateList c(Resources resources, int i2, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 23) {
            return resources.getColorStateList(i2, theme);
        }
        b bVar = new b(resources, theme);
        ColorStateList b2 = b(bVar, i2);
        if (b2 != null) {
            return b2;
        }
        ColorStateList g2 = g(resources, i2, theme);
        if (g2 == null) {
            return resources.getColorStateList(i2);
        }
        a(bVar, i2, g2);
        return g2;
    }

    public static Drawable d(Resources resources, int i2, Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 21 ? resources.getDrawable(i2, theme) : resources.getDrawable(i2);
    }

    public static Typeface e(Context context, int i2, TypedValue typedValue, int i3, c cVar) {
        if (context.isRestricted()) {
            return null;
        }
        return i(context, i2, typedValue, i3, cVar, null, true, false);
    }

    private static TypedValue f() {
        ThreadLocal<TypedValue> threadLocal = a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static ColorStateList g(Resources resources, int i2, Resources.Theme theme) {
        if (h(resources, i2)) {
            return null;
        }
        try {
            return androidx.core.content.d.a.a(resources, resources.getXml(i2), theme);
        } catch (Exception e2) {
            Log.e("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            return null;
        }
    }

    private static boolean h(Resources resources, int i2) {
        TypedValue f2 = f();
        resources.getValue(i2, f2, true);
        int i3 = f2.type;
        return i3 >= 28 && i3 <= 31;
    }

    private static Typeface i(Context context, int i2, TypedValue typedValue, int i3, c cVar, Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        Typeface j2 = j(context, resources, typedValue, i2, i3, cVar, handler, z, z2);
        if (j2 != null || cVar != null || z2) {
            return j2;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i2) + " could not be retrieved.");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Typeface j(Context context, Resources resources, TypedValue typedValue, int i2, int i3, c cVar, Handler handler, boolean z, boolean z2) {
        String str;
        StringBuilder sb;
        Throwable e2;
        CharSequence charSequence = typedValue.string;
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            if (!charSequence2.startsWith("res/")) {
                if (cVar != null) {
                    cVar.a(-3, handler);
                }
                return null;
            }
            Typeface f2 = e.d.j.d.f(resources, i2, i3);
            if (f2 != null) {
                if (cVar != null) {
                    cVar.b(f2, handler);
                }
                return f2;
            } else if (z2) {
                return null;
            } else {
                try {
                    if (charSequence2.toLowerCase().endsWith(".xml")) {
                        c.a b2 = androidx.core.content.d.c.b(resources.getXml(i2), resources);
                        if (b2 != null) {
                            return e.d.j.d.c(context, b2, resources, i2, i3, cVar, handler, z);
                        }
                        Log.e("ResourcesCompat", "Failed to find font-family tag");
                        if (cVar != null) {
                            cVar.a(-3, handler);
                        }
                        return null;
                    }
                    Typeface d2 = e.d.j.d.d(context, resources, i2, charSequence2, i3);
                    if (cVar != null) {
                        if (d2 != null) {
                            cVar.b(d2, handler);
                        } else {
                            cVar.a(-3, handler);
                        }
                    }
                    return d2;
                } catch (IOException e3) {
                    e2 = e3;
                    sb = new StringBuilder();
                    str = "Failed to read xml resource ";
                    sb.append(str);
                    sb.append(charSequence2);
                    Log.e("ResourcesCompat", sb.toString(), e2);
                    if (cVar != null) {
                        cVar.a(-3, handler);
                    }
                    return null;
                } catch (XmlPullParserException e4) {
                    e2 = e4;
                    sb = new StringBuilder();
                    str = "Failed to parse xml resource ";
                    sb.append(str);
                    sb.append(charSequence2);
                    Log.e("ResourcesCompat", sb.toString(), e2);
                    if (cVar != null) {
                    }
                    return null;
                }
            }
        } else {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i2) + "\" (" + Integer.toHexString(i2) + ") is not a Font: " + typedValue);
        }
    }
}

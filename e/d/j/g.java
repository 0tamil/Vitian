package e.d.j;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.content.d.c;
import e.d.m.f;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
/* loaded from: classes.dex */
public class g extends e {

    /* renamed from: g  reason: collision with root package name */
    protected final Class<?> f2071g;

    /* renamed from: h  reason: collision with root package name */
    protected final Constructor<?> f2072h;

    /* renamed from: i  reason: collision with root package name */
    protected final Method f2073i;

    /* renamed from: j  reason: collision with root package name */
    protected final Method f2074j;

    /* renamed from: k  reason: collision with root package name */
    protected final Method f2075k;
    protected final Method l;
    protected final Method m;

    public g() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor<?> constructor;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> y = y();
            constructor = z(y);
            method4 = v(y);
            method3 = w(y);
            method2 = A(y);
            method = u(y);
            method5 = x(y);
            cls = y;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e2.getClass().getName(), e2);
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f2071g = cls;
        this.f2072h = constructor;
        this.f2073i = method4;
        this.f2074j = method3;
        this.f2075k = method2;
        this.l = method;
        this.m = method5;
    }

    private Object o() {
        try {
            return this.f2072h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private void p(Object obj) {
        try {
            this.l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean q(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f2073i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean r(Object obj, ByteBuffer byteBuffer, int i2, int i3, int i4) {
        try {
            return ((Boolean) this.f2074j.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Integer.valueOf(i4))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean s(Object obj) {
        try {
            return ((Boolean) this.f2075k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean t() {
        if (this.f2073i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f2073i != null;
    }

    protected Method A(Class<?> cls) {
        return cls.getMethod("freeze", new Class[0]);
    }

    @Override // e.d.j.e, e.d.j.j
    public Typeface b(Context context, c.b bVar, Resources resources, int i2) {
        c.C0017c[] a;
        if (!t()) {
            return super.b(context, bVar, resources, i2);
        }
        Object o = o();
        if (o == null) {
            return null;
        }
        for (c.C0017c cVar : bVar.a()) {
            if (!q(context, o, cVar.a(), cVar.c(), cVar.e(), cVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.d()))) {
                p(o);
                return null;
            }
        }
        if (!s(o)) {
            return null;
        }
        return l(o);
    }

    @Override // e.d.j.e, e.d.j.j
    public Typeface c(Context context, CancellationSignal cancellationSignal, f.b[] bVarArr, int i2) {
        Typeface l;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!t()) {
            f.b h2 = h(bVarArr, i2);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(h2.d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(h2.e()).setItalic(h2.f()).build();
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return build;
            } catch (IOException unused) {
                return null;
            }
        } else {
            Map<Uri, ByteBuffer> h3 = k.h(context, bVarArr, cancellationSignal);
            Object o = o();
            if (o == null) {
                return null;
            }
            boolean z = false;
            for (f.b bVar : bVarArr) {
                ByteBuffer byteBuffer = h3.get(bVar.d());
                if (byteBuffer != null) {
                    if (!r(o, byteBuffer, bVar.c(), bVar.e(), bVar.f() ? 1 : 0)) {
                        p(o);
                        return null;
                    }
                    z = true;
                }
            }
            if (!z) {
                p(o);
                return null;
            } else if (s(o) && (l = l(o)) != null) {
                return Typeface.create(l, i2);
            } else {
                return null;
            }
        }
    }

    @Override // e.d.j.j
    public Typeface e(Context context, Resources resources, int i2, String str, int i3) {
        if (!t()) {
            return super.e(context, resources, i2, str, i3);
        }
        Object o = o();
        if (o == null) {
            return null;
        }
        if (!q(context, o, str, 0, -1, -1, null)) {
            p(o);
            return null;
        } else if (!s(o)) {
            return null;
        } else {
            return l(o);
        }
    }

    protected Typeface l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f2071g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    protected Method u(Class<?> cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    protected Method v(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    protected Method w(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    protected Method x(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    protected Class<?> y() {
        return Class.forName("android.graphics.FontFamily");
    }

    protected Constructor<?> z(Class<?> cls) {
        return cls.getConstructor(new Class[0]);
    }
}

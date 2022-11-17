package e.d.j;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.d.c;
import e.d.m.f;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class j {
    @SuppressLint({"BanConcurrentHashMap"})
    private ConcurrentHashMap<Long, c.b> a = new ConcurrentHashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements c<f.b> {
        a(j jVar) {
        }

        /* renamed from: c */
        public int a(f.b bVar) {
            return bVar.e();
        }

        /* renamed from: d */
        public boolean b(f.b bVar) {
            return bVar.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements c<c.C0017c> {
        b(j jVar) {
        }

        /* renamed from: c */
        public int a(c.C0017c cVar) {
            return cVar.e();
        }

        /* renamed from: d */
        public boolean b(c.C0017c cVar) {
            return cVar.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface c<T> {
        int a(T t);

        boolean b(T t);
    }

    private void a(Typeface typeface, c.b bVar) {
        long j2 = j(typeface);
        if (j2 != 0) {
            this.a.put(Long.valueOf(j2), bVar);
        }
    }

    private c.C0017c f(c.b bVar, int i2) {
        return (c.C0017c) g(bVar.a(), i2, new b(this));
    }

    private static <T> T g(T[] tArr, int i2, c<T> cVar) {
        int i3 = (i2 & 1) == 0 ? 400 : 700;
        boolean z = (i2 & 2) != 0;
        T t = null;
        int i4 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(cVar.a(t2) - i3) * 2) + (cVar.b(t2) == z ? 0 : 1);
            if (t == null || i4 > abs) {
                t = t2;
                i4 = abs;
            }
        }
        return t;
    }

    private static long j(Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0L;
        } catch (NoSuchFieldException e3) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e3);
            return 0L;
        }
    }

    public Typeface b(Context context, c.b bVar, Resources resources, int i2) {
        c.C0017c f2 = f(bVar, i2);
        if (f2 == null) {
            return null;
        }
        Typeface d2 = d.d(context, resources, f2.b(), f2.a(), i2);
        a(d2, bVar);
        return d2;
    }

    public Typeface c(Context context, CancellationSignal cancellationSignal, f.b[] bVarArr, int i2) {
        InputStream inputStream;
        Throwable th;
        InputStream inputStream2 = null;
        if (bVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(h(bVarArr, i2).d());
        } catch (IOException unused) {
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            Typeface d2 = d(context, inputStream);
            k.a(inputStream);
            return d2;
        } catch (IOException unused2) {
            k.a(inputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            inputStream2 = inputStream;
            k.a(inputStream2);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Typeface d(Context context, InputStream inputStream) {
        File e2 = k.e(context);
        if (e2 == null) {
            return null;
        }
        try {
            if (!k.d(e2, inputStream)) {
                return null;
            }
            return Typeface.createFromFile(e2.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e2.delete();
        }
    }

    public Typeface e(Context context, Resources resources, int i2, String str, int i3) {
        File e2 = k.e(context);
        if (e2 == null) {
            return null;
        }
        try {
            if (!k.c(e2, resources, i2)) {
                return null;
            }
            return Typeface.createFromFile(e2.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e2.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public f.b h(f.b[] bVarArr, int i2) {
        return (f.b) g(bVarArr, i2, new a(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c.b i(Typeface typeface) {
        long j2 = j(typeface);
        if (j2 == 0) {
            return null;
        }
        return this.a.get(Long.valueOf(j2));
    }
}

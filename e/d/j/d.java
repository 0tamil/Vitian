package e.d.j;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.d.c;
import androidx.core.content.d.f;
import e.c.e;
import e.d.m.f;
@SuppressLint({"NewApi"})
/* loaded from: classes.dex */
public class d {
    private static final j a;
    private static final e<String, Typeface> b;

    /* loaded from: classes.dex */
    public static class a extends f.c {
        private f.c a;

        public a(f.c cVar) {
            this.a = cVar;
        }

        @Override // e.d.m.f.c
        public void a(int i2) {
            f.c cVar = this.a;
            if (cVar != null) {
                cVar.d(i2);
            }
        }

        @Override // e.d.m.f.c
        public void b(Typeface typeface) {
            f.c cVar = this.a;
            if (cVar != null) {
                cVar.e(typeface);
            }
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        a = i2 >= 29 ? new i() : i2 >= 28 ? new h() : i2 >= 26 ? new g() : (i2 < 24 || !f.m()) ? i2 >= 21 ? new e() : new j() : new f();
        b = new e<>(16);
    }

    public static Typeface a(Context context, Typeface typeface, int i2) {
        Typeface g2;
        if (context != null) {
            return (Build.VERSION.SDK_INT >= 21 || (g2 = g(context, typeface, i2)) == null) ? Typeface.create(typeface, i2) : g2;
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, f.b[] bVarArr, int i2) {
        return a.c(context, cancellationSignal, bVarArr, i2);
    }

    public static Typeface c(Context context, c.a aVar, Resources resources, int i2, int i3, f.c cVar, Handler handler, boolean z) {
        Typeface typeface;
        if (aVar instanceof c.d) {
            c.d dVar = (c.d) aVar;
            Typeface h2 = h(dVar.c());
            if (h2 != null) {
                if (cVar != null) {
                    cVar.b(h2, handler);
                }
                return h2;
            }
            typeface = e.d.m.f.a(context, dVar.b(), i3, !z ? cVar == null : dVar.a() == 0, z ? dVar.d() : -1, f.c.c(handler), new a(cVar));
        } else {
            typeface = a.b(context, (c.b) aVar, resources, i3);
            if (cVar != null) {
                if (typeface != null) {
                    cVar.b(typeface, handler);
                } else {
                    cVar.a(-3, handler);
                }
            }
        }
        if (typeface != null) {
            b.d(e(resources, i2, i3), typeface);
        }
        return typeface;
    }

    public static Typeface d(Context context, Resources resources, int i2, String str, int i3) {
        Typeface e2 = a.e(context, resources, i2, str, i3);
        if (e2 != null) {
            b.d(e(resources, i2, i3), e2);
        }
        return e2;
    }

    private static String e(Resources resources, int i2, int i3) {
        return resources.getResourcePackageName(i2) + "-" + i2 + "-" + i3;
    }

    public static Typeface f(Resources resources, int i2, int i3) {
        return b.c(e(resources, i2, i3));
    }

    private static Typeface g(Context context, Typeface typeface, int i2) {
        j jVar = a;
        c.b i3 = jVar.i(typeface);
        if (i3 == null) {
            return null;
        }
        return jVar.b(context, i3, context.getResources(), i2);
    }

    private static Typeface h(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}

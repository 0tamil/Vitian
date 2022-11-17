package e.d.m;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import e.c.g;
import e.d.m.f;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class e {
    static final e.c.e<String, Typeface> a = new e.c.e<>(16);
    private static final ExecutorService b = g.a("fonts-androidx", 10, 10000);
    static final Object c = new Object();

    /* renamed from: d  reason: collision with root package name */
    static final g<String, ArrayList<e.d.o.a<C0068e>>> f2085d = new g<>();

    /* loaded from: classes.dex */
    class a implements Callable<C0068e> {
        final /* synthetic */ String a;
        final /* synthetic */ Context b;
        final /* synthetic */ e.d.m.d c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f2086d;

        a(String str, Context context, e.d.m.d dVar, int i2) {
            this.a = str;
            this.b = context;
            this.c = dVar;
            this.f2086d = i2;
        }

        /* renamed from: a */
        public C0068e call() {
            return e.c(this.a, this.b, this.c, this.f2086d);
        }
    }

    /* loaded from: classes.dex */
    class b implements e.d.o.a<C0068e> {
        final /* synthetic */ e.d.m.a a;

        b(e.d.m.a aVar) {
            this.a = aVar;
        }

        /* renamed from: a */
        public void accept(C0068e eVar) {
            this.a.b(eVar);
        }
    }

    /* loaded from: classes.dex */
    class c implements Callable<C0068e> {
        final /* synthetic */ String a;
        final /* synthetic */ Context b;
        final /* synthetic */ e.d.m.d c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f2087d;

        c(String str, Context context, e.d.m.d dVar, int i2) {
            this.a = str;
            this.b = context;
            this.c = dVar;
            this.f2087d = i2;
        }

        /* renamed from: a */
        public C0068e call() {
            return e.c(this.a, this.b, this.c, this.f2087d);
        }
    }

    /* loaded from: classes.dex */
    class d implements e.d.o.a<C0068e> {
        final /* synthetic */ String a;

        d(String str) {
            this.a = str;
        }

        /* renamed from: a */
        public void accept(C0068e eVar) {
            synchronized (e.c) {
                g<String, ArrayList<e.d.o.a<C0068e>>> gVar = e.f2085d;
                ArrayList<e.d.o.a<C0068e>> arrayList = gVar.get(this.a);
                if (arrayList != null) {
                    gVar.remove(this.a);
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        arrayList.get(i2).accept(eVar);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e.d.m.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0068e {
        final Typeface a;
        final int b;

        C0068e(int i2) {
            this.a = null;
            this.b = i2;
        }

        @SuppressLint({"WrongConstant"})
        C0068e(Typeface typeface) {
            this.a = typeface;
            this.b = 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @SuppressLint({"WrongConstant"})
        public boolean a() {
            return this.b == 0;
        }
    }

    private static String a(e.d.m.d dVar, int i2) {
        return dVar.d() + "-" + i2;
    }

    @SuppressLint({"WrongConstant"})
    private static int b(f.a aVar) {
        int i2 = 1;
        if (aVar.c() != 0) {
            return aVar.c() != 1 ? -3 : -2;
        }
        f.b[] b2 = aVar.b();
        if (!(b2 == null || b2.length == 0)) {
            i2 = 0;
            for (f.b bVar : b2) {
                int b3 = bVar.b();
                if (b3 != 0) {
                    if (b3 < 0) {
                        return -3;
                    } else {
                        return b3;
                    }
                }
            }
        }
        return i2;
    }

    static C0068e c(String str, Context context, e.d.m.d dVar, int i2) {
        e.c.e<String, Typeface> eVar = a;
        Typeface c2 = eVar.c(str);
        if (c2 != null) {
            return new C0068e(c2);
        }
        try {
            f.a d2 = e.d.m.c.d(context, dVar, null);
            int b2 = b(d2);
            if (b2 != 0) {
                return new C0068e(b2);
            }
            Typeface b3 = e.d.j.d.b(context, null, d2.b(), i2);
            if (b3 == null) {
                return new C0068e(-3);
            }
            eVar.d(str, b3);
            return new C0068e(b3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C0068e(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Typeface d(Context context, e.d.m.d dVar, int i2, Executor executor, e.d.m.a aVar) {
        String a2 = a(dVar, i2);
        Typeface c2 = a.c(a2);
        if (c2 != null) {
            aVar.b(new C0068e(c2));
            return c2;
        }
        b bVar = new b(aVar);
        synchronized (c) {
            g<String, ArrayList<e.d.o.a<C0068e>>> gVar = f2085d;
            ArrayList<e.d.o.a<C0068e>> arrayList = gVar.get(a2);
            if (arrayList != null) {
                arrayList.add(bVar);
                return null;
            }
            ArrayList<e.d.o.a<C0068e>> arrayList2 = new ArrayList<>();
            arrayList2.add(bVar);
            gVar.put(a2, arrayList2);
            c cVar = new c(a2, context, dVar, i2);
            if (executor == null) {
                executor = b;
            }
            g.b(executor, cVar, new d(a2));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Typeface e(Context context, e.d.m.d dVar, e.d.m.a aVar, int i2, int i3) {
        String a2 = a(dVar, i2);
        Typeface c2 = a.c(a2);
        if (c2 != null) {
            aVar.b(new C0068e(c2));
            return c2;
        } else if (i3 == -1) {
            C0068e c3 = c(a2, context, dVar, i2);
            aVar.b(c3);
            return c3.a;
        } else {
            try {
                C0068e eVar = (C0068e) g.c(b, new a(a2, context, dVar, i2), i3);
                aVar.b(eVar);
                return eVar.a;
            } catch (InterruptedException unused) {
                aVar.b(new C0068e(-3));
                return null;
            }
        }
    }
}

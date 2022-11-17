package io.flutter.embedding.engine.h;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import h.a.e.d;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.h.f;
import io.flutter.view.j;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
/* loaded from: classes.dex */
public class f {
    private boolean a;
    private c b;
    private long c;

    /* renamed from: d  reason: collision with root package name */
    private e f3031d;

    /* renamed from: e  reason: collision with root package name */
    private FlutterJNI f3032e;

    /* renamed from: f  reason: collision with root package name */
    private ExecutorService f3033f;

    /* renamed from: g  reason: collision with root package name */
    Future<b> f3034g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Callable<b> {
        final /* synthetic */ Context a;

        a(Context context) {
            this.a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void c() {
            f.this.f3032e.prefetchDefaultFontManager();
        }

        /* renamed from: a */
        public b call() {
            d.a("FlutterLoader initTask");
            try {
                g j2 = f.this.j(this.a);
                f.this.f3032e.loadLibrary();
                f.this.f3032e.updateRefreshRate();
                f.this.f3033f.execute(new Runnable() { // from class: io.flutter.embedding.engine.h.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        f.a.this.c();
                    }
                });
                if (j2 == null) {
                    return new b(h.a.e.a.d(this.a), h.a.e.a.a(this.a), h.a.e.a.c(this.a), null);
                }
                j2.a();
                throw null;
            } finally {
                d.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {
        final String a;
        final String b;

        private b(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
        }

        /* synthetic */ b(String str, String str2, String str3, a aVar) {
            this(str, str2, str3);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        private String a;

        public String a() {
            return this.a;
        }
    }

    public f() {
        this(h.a.a.e().d().a());
    }

    public f(FlutterJNI flutterJNI) {
        this(flutterJNI, h.a.a.e().b());
    }

    public f(FlutterJNI flutterJNI, ExecutorService executorService) {
        this.a = false;
        this.f3032e = flutterJNI;
        this.f3033f = executorService;
    }

    private String h(String str) {
        return this.f3031d.b + File.separator + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public g j(Context context) {
        return null;
    }

    private static boolean k(Bundle bundle) {
        if (bundle == null) {
            return true;
        }
        return bundle.getBoolean("io.flutter.embedding.android.LeakVM", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m(Context context, String[] strArr, Handler handler, Runnable runnable) {
        e(context.getApplicationContext(), strArr);
        handler.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void o(final Context context, final String[] strArr, final Handler handler, final Runnable runnable) {
        try {
            this.f3034g.get();
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.flutter.embedding.engine.h.c
                @Override // java.lang.Runnable
                public final void run() {
                    f.this.m(context, strArr, handler, runnable);
                }
            });
        } catch (Exception e2) {
            h.a.b.c("FlutterLoader", "Flutter initialization failed.", e2);
            throw new RuntimeException(e2);
        }
    }

    public boolean d() {
        return this.f3031d.f3030e;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(Context context, String[] strArr) {
        boolean z;
        if (!this.a) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
            } else if (this.b != null) {
                d.a("FlutterLoader#ensureInitializationComplete");
                try {
                    try {
                        b bVar = this.f3034g.get();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                        StringBuilder sb = new StringBuilder();
                        sb.append("--icu-native-lib-path=");
                        sb.append(this.f3031d.f3029d);
                        String str = File.separator;
                        sb.append(str);
                        sb.append("libflutter.so");
                        arrayList.add(sb.toString());
                        if (strArr != null) {
                            Collections.addAll(arrayList, strArr);
                        }
                        arrayList.add("--aot-shared-library-name=" + this.f3031d.a);
                        arrayList.add("--aot-shared-library-name=" + this.f3031d.f3029d + str + this.f3031d.a);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("--cache-dir-path=");
                        sb2.append(bVar.b);
                        arrayList.add(sb2.toString());
                        if (this.f3031d.c != null) {
                            arrayList.add("--domain-network-policy=" + this.f3031d.c);
                        }
                        if (this.b.a() != null) {
                            arrayList.add("--log-tag=" + this.b.a());
                        }
                        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                        int i2 = bundle != null ? bundle.getInt("io.flutter.embedding.android.OldGenHeapSize") : 0;
                        if (i2 == 0) {
                            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                            i2 = (int) ((memoryInfo.totalMem / 1000000.0d) / 2.0d);
                        }
                        arrayList.add("--old-gen-heap-size=" + i2);
                        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                        arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 12 * 4));
                        arrayList.add("--prefetched-default-font-manager");
                        if (bundle != null && !bundle.getBoolean("io.flutter.embedding.android.EnableSkParagraph", true)) {
                            z = false;
                            arrayList.add("--enable-skparagraph=" + z);
                            String str2 = !k(bundle) ? "true" : "false";
                            arrayList.add("--leak-vm=" + str2);
                            this.f3032e.init(context, (String[]) arrayList.toArray(new String[0]), null, bVar.a, bVar.b, SystemClock.uptimeMillis() - this.c);
                            this.a = true;
                        }
                        z = true;
                        arrayList.add("--enable-skparagraph=" + z);
                        if (!k(bundle)) {
                        }
                        arrayList.add("--leak-vm=" + str2);
                        this.f3032e.init(context, (String[]) arrayList.toArray(new String[0]), null, bVar.a, bVar.b, SystemClock.uptimeMillis() - this.c);
                        this.a = true;
                    } catch (Exception e2) {
                        h.a.b.c("FlutterLoader", "Flutter initialization failed.", e2);
                        throw new RuntimeException(e2);
                    }
                } finally {
                    d.b();
                }
            } else {
                throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
            }
        }
    }

    public void f(final Context context, final String[] strArr, final Handler handler, final Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        } else if (this.b == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        } else if (this.a) {
            handler.post(runnable);
        } else {
            this.f3033f.execute(new Runnable() { // from class: io.flutter.embedding.engine.h.b
                @Override // java.lang.Runnable
                public final void run() {
                    f.this.o(context, strArr, handler, runnable);
                }
            });
        }
    }

    public String g() {
        return this.f3031d.b;
    }

    public String i(String str) {
        return h(str);
    }

    public void p(Context context) {
        q(context, new c());
    }

    public void q(Context context, c cVar) {
        if (this.b == null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                d.a("FlutterLoader#startInitialization");
                try {
                    Context applicationContext = context.getApplicationContext();
                    this.b = cVar;
                    this.c = SystemClock.uptimeMillis();
                    this.f3031d = d.e(applicationContext);
                    (Build.VERSION.SDK_INT >= 17 ? j.e((DisplayManager) applicationContext.getSystemService("display"), this.f3032e) : j.d(((WindowManager) applicationContext.getSystemService("window")).getDefaultDisplay().getRefreshRate(), this.f3032e)).f();
                    this.f3034g = this.f3033f.submit(new a(applicationContext));
                } finally {
                    d.b();
                }
            } else {
                throw new IllegalStateException("startInitialization must be called on the main thread");
            }
        }
    }
}

package com.google.firebase.crashlytics.i.j;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.google.firebase.crashlytics.i.l.a0;
import com.google.firebase.crashlytics.i.l.b0;
import com.google.firebase.crashlytics.i.q.d;
import com.google.firebase.crashlytics.i.q.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes.dex */
public class s {

    /* renamed from: e  reason: collision with root package name */
    private static final Map<String, Integer> f1421e;

    /* renamed from: f  reason: collision with root package name */
    static final String f1422f = String.format(Locale.US, "Crashlytics Android SDK/%s", "18.2.10");
    private final Context a;
    private final a0 b;
    private final h c;

    /* renamed from: d  reason: collision with root package name */
    private final d f1423d;

    static {
        HashMap hashMap = new HashMap();
        f1421e = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
    }

    public s(Context context, a0 a0Var, h hVar, d dVar) {
        this.a = context;
        this.b = a0Var;
        this.c = hVar;
        this.f1423d = dVar;
    }

    private a0.b a() {
        a0.b b = a0.b();
        b.h("18.2.10");
        b.d(this.c.a);
        b.e(this.b.a());
        b.b(this.c.f1382e);
        b.c(this.c.f1383f);
        b.g(4);
        return b;
    }

    private static int e() {
        Integer num;
        String str = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str) && (num = f1421e.get(str.toLowerCase(Locale.US))) != null) {
            return num.intValue();
        }
        return 7;
    }

    private a0.e.d.a.b.AbstractC0037a f() {
        a0.e.d.a.b.AbstractC0037a.AbstractC0038a a = a0.e.d.a.b.AbstractC0037a.a();
        a.b(0L);
        a.d(0L);
        a.c(this.c.f1381d);
        a.e(this.c.b);
        return a.a();
    }

    private b0<a0.e.d.a.b.AbstractC0037a> g() {
        return b0.i(f());
    }

    private a0.e.d.a h(int i2, a0.a aVar) {
        boolean z = aVar.b() != 100;
        a0.e.d.a.AbstractC0036a a = a0.e.d.a.a();
        a.b(Boolean.valueOf(z));
        a.f(i2);
        a.d(m(aVar));
        return a.a();
    }

    private a0.e.d.a i(int i2, e eVar, Thread thread, int i3, int i4, boolean z) {
        Boolean bool;
        ActivityManager.RunningAppProcessInfo j2 = n.j(this.c.f1381d, this.a);
        if (j2 != null) {
            bool = Boolean.valueOf(j2.importance != 100);
        } else {
            bool = null;
        }
        a0.e.d.a.AbstractC0036a a = a0.e.d.a.a();
        a.b(bool);
        a.f(i2);
        a.d(n(eVar, thread, i3, i4, z));
        return a.a();
    }

    private a0.e.d.c j(int i2) {
        k a = k.a(this.a);
        Float b = a.b();
        Double valueOf = b != null ? Double.valueOf(b.doubleValue()) : null;
        int c = a.c();
        boolean o = n.o(this.a);
        long s = n.s() - n.a(this.a);
        long b2 = n.b(Environment.getDataDirectory().getPath());
        a0.e.d.c.a a2 = a0.e.d.c.a();
        a2.b(valueOf);
        a2.c(c);
        a2.f(o);
        a2.e(i2);
        a2.g(s);
        a2.d(b2);
        return a2.a();
    }

    private a0.e.d.a.b.c k(e eVar, int i2, int i3) {
        return l(eVar, i2, i3, 0);
    }

    private a0.e.d.a.b.c l(e eVar, int i2, int i3, int i4) {
        String str = eVar.b;
        String str2 = eVar.a;
        StackTraceElement[] stackTraceElementArr = eVar.c;
        int i5 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        e eVar2 = eVar.f1649d;
        if (i4 >= i3) {
            e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.f1649d;
                i5++;
            }
        }
        a0.e.d.a.b.c.AbstractC0040a a = a0.e.d.a.b.c.a();
        a.f(str);
        a.e(str2);
        a.c(b0.h(p(stackTraceElementArr, i2)));
        a.d(i5);
        if (eVar2 != null && i5 == 0) {
            a.b(l(eVar2, i2, i3, i4 + 1));
        }
        return a.a();
    }

    private a0.e.d.a.b m(a0.a aVar) {
        a0.e.d.a.b.AbstractC0039b a = a0.e.d.a.b.a();
        a.b(aVar);
        a.e(u());
        a.c(g());
        return a.a();
    }

    private a0.e.d.a.b n(e eVar, Thread thread, int i2, int i3, boolean z) {
        a0.e.d.a.b.AbstractC0039b a = a0.e.d.a.b.a();
        a.f(x(eVar, thread, i2, z));
        a.d(k(eVar, i2, i3));
        a.e(u());
        a.c(g());
        return a.a();
    }

    private a0.e.d.a.b.AbstractC0043e.AbstractC0045b o(StackTraceElement stackTraceElement, a0.e.d.a.b.AbstractC0043e.AbstractC0045b.AbstractC0046a aVar) {
        long j2 = 0;
        long max = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            j2 = stackTraceElement.getLineNumber();
        }
        aVar.e(max);
        aVar.f(str);
        aVar.b(fileName);
        aVar.d(j2);
        return aVar.a();
    }

    private b0<a0.e.d.a.b.AbstractC0043e.AbstractC0045b> p(StackTraceElement[] stackTraceElementArr, int i2) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            a0.e.d.a.b.AbstractC0043e.AbstractC0045b.AbstractC0046a a = a0.e.d.a.b.AbstractC0043e.AbstractC0045b.a();
            a.c(i2);
            arrayList.add(o(stackTraceElement, a));
        }
        return b0.h(arrayList);
    }

    private a0.e.a q() {
        a0.e.a.AbstractC0035a a = a0.e.a.a();
        a.e(this.b.f());
        a.g(this.c.f1382e);
        a.d(this.c.f1383f);
        a.f(this.b.a());
        a.b(this.c.f1384g.d());
        a.c(this.c.f1384g.e());
        return a.a();
    }

    private a0.e r(String str, long j2) {
        a0.e.b a = a0.e.a();
        a.l(j2);
        a.i(str);
        a.g(f1422f);
        a.b(q());
        a.k(t());
        a.d(s());
        a.h(3);
        return a.a();
    }

    private a0.e.c s() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int e2 = e();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long s = n.s();
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        boolean y = n.y(this.a);
        int m = n.m(this.a);
        String str = Build.MANUFACTURER;
        String str2 = Build.PRODUCT;
        a0.e.c.a a = a0.e.c.a();
        a.b(e2);
        a.f(Build.MODEL);
        a.c(availableProcessors);
        a.h(s);
        a.d(blockCount);
        a.i(y);
        a.j(m);
        a.e(str);
        a.g(str2);
        return a.a();
    }

    private a0.e.AbstractC0048e t() {
        a0.e.AbstractC0048e.a a = a0.e.AbstractC0048e.a();
        a.d(3);
        a.e(Build.VERSION.RELEASE);
        a.b(Build.VERSION.CODENAME);
        a.c(n.z(this.a));
        return a.a();
    }

    private a0.e.d.a.b.AbstractC0041d u() {
        a0.e.d.a.b.AbstractC0041d.AbstractC0042a a = a0.e.d.a.b.AbstractC0041d.a();
        a.d("0");
        a.c("0");
        a.b(0L);
        return a.a();
    }

    private a0.e.d.a.b.AbstractC0043e v(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return w(thread, stackTraceElementArr, 0);
    }

    private a0.e.d.a.b.AbstractC0043e w(Thread thread, StackTraceElement[] stackTraceElementArr, int i2) {
        a0.e.d.a.b.AbstractC0043e.AbstractC0044a a = a0.e.d.a.b.AbstractC0043e.a();
        a.d(thread.getName());
        a.c(i2);
        a.b(b0.h(p(stackTraceElementArr, i2)));
        return a.a();
    }

    private b0<a0.e.d.a.b.AbstractC0043e> x(e eVar, Thread thread, int i2, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(w(thread, eVar.c, i2));
        if (z) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(v(key, this.f1423d.a(entry.getValue())));
                }
            }
        }
        return b0.h(arrayList);
    }

    public a0.e.d b(a0.a aVar) {
        int i2 = this.a.getResources().getConfiguration().orientation;
        a0.e.d.b a = a0.e.d.a();
        a.f("anr");
        a.e(aVar.h());
        a.b(h(i2, aVar));
        a.c(j(i2));
        return a.a();
    }

    public a0.e.d c(Throwable th, Thread thread, String str, long j2, int i2, int i3, boolean z) {
        int i4 = this.a.getResources().getConfiguration().orientation;
        e eVar = new e(th, this.f1423d);
        a0.e.d.b a = a0.e.d.a();
        a.f(str);
        a.e(j2);
        a.b(i(i4, eVar, thread, i2, i3, z));
        a.c(j(i4));
        return a.a();
    }

    public a0 d(String str, long j2) {
        a0.b a = a();
        a.i(r(str, j2));
        return a.a();
    }
}

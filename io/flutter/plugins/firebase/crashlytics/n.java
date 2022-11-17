package io.flutter.plugins.firebase.crashlytics;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.util.Log;
import com.google.firebase.crashlytics.g;
import com.google.firebase.h;
import f.b.a.b.g.i;
import f.b.a.b.g.j;
import f.b.a.b.g.l;
import h.a.d.a.k;
import io.flutter.embedding.engine.i.a;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public class n implements FlutterFirebasePlugin, io.flutter.embedding.engine.i.a, k.c {

    /* renamed from: e  reason: collision with root package name */
    private k f3264e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends HashMap<String, Object> {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f3265e;

        a(n nVar, boolean z) {
            this.f3265e = z;
            put("unsentReports", Boolean.valueOf(z));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends HashMap<String, Object> {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f3266e;

        b(n nVar, boolean z) {
            this.f3266e = z;
            put("didCrashOnPreviousExecution", Boolean.valueOf(z));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends HashMap<String, Object> {
        c() {
            put("isCrashlyticsCollectionEnabled", Boolean.valueOf(n.this.i(h.l())));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends HashMap<String, Object> {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h f3268e;

        d(h hVar) {
            this.f3268e = hVar;
            if (hVar.n().equals("[DEFAULT]")) {
                put("isCrashlyticsCollectionEnabled", Boolean.valueOf(n.this.i(h.l())));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void A(Map map, j jVar) {
        try {
            Object obj = map.get("identifier");
            Objects.requireNonNull(obj);
            g.d().l((String) obj);
            jVar.c(null);
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    private i<Void> B(final Map<String, Object> map) {
        final j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.d
            @Override // java.lang.Runnable
            public final void run() {
                n.s(map, jVar);
            }
        });
        return jVar.a();
    }

    private i<Void> C(final Map<String, Object> map) {
        final j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.h
            @Override // java.lang.Runnable
            public final void run() {
                n.this.v(map, jVar);
            }
        });
        return jVar.a();
    }

    private i<Void> D() {
        final j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.k
            @Override // java.lang.Runnable
            public final void run() {
                n.w(j.this);
            }
        });
        return jVar.a();
    }

    private i<Map<String, Object>> E(final Map<String, Object> map) {
        final j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.j
            @Override // java.lang.Runnable
            public final void run() {
                n.this.y(map, jVar);
            }
        });
        return jVar.a();
    }

    private i<Void> F(final Map<String, Object> map) {
        final j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.e
            @Override // java.lang.Runnable
            public final void run() {
                n.z(map, jVar);
            }
        });
        return jVar.a();
    }

    private i<Void> G(final Map<String, Object> map) {
        final j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.b
            @Override // java.lang.Runnable
            public final void run() {
                n.A(map, jVar);
            }
        });
        return jVar.a();
    }

    private i<Map<String, Object>> b() {
        final j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.i
            @Override // java.lang.Runnable
            public final void run() {
                n.this.k(jVar);
            }
        });
        return jVar.a();
    }

    private void c() {
        new Handler().postDelayed(f.f3248e, 50L);
    }

    private i<Void> d() {
        final j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.m
            @Override // java.lang.Runnable
            public final void run() {
                n.m(j.this);
            }
        });
        return jVar.a();
    }

    private i<Map<String, Object>> e() {
        final j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.g
            @Override // java.lang.Runnable
            public final void run() {
                n.this.o(jVar);
            }
        });
        return jVar.a();
    }

    private StackTraceElement f(Map<String, String> map) {
        try {
            String str = map.get("file");
            String str2 = map.get("line");
            String str3 = map.get("class");
            String str4 = map.get("method");
            if (str3 == null) {
                str3 = "";
            }
            Objects.requireNonNull(str2);
            return new StackTraceElement(str3, str4, str, Integer.parseInt(str2));
        } catch (Exception unused) {
            Log.e("FLTFirebaseCrashlytics", "Unable to generate stack trace element from Dart error.");
            return null;
        }
    }

    private SharedPreferences g(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    private void h(h.a.d.a.d dVar) {
        k kVar = new k(dVar, "plugins.flutter.io/firebase_crashlytics");
        this.f3264e = kVar;
        kVar.e(this);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_crashlytics", this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i(h hVar) {
        SharedPreferences g2 = g(hVar.j());
        if (g2.contains("firebase_crashlytics_collection_enabled")) {
            return g2.getBoolean("firebase_crashlytics_collection_enabled", true);
        }
        if (!hVar.u()) {
            return false;
        }
        g.d().j(true);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void k(j jVar) {
        try {
            jVar.c(new a(this, ((Boolean) l.a(g.d().a())).booleanValue()));
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void l() {
        throw new FirebaseCrashlyticsTestCrash();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void m(j jVar) {
        try {
            g.d().b();
            jVar.c(null);
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void o(j jVar) {
        try {
            jVar.c(new b(this, g.d().c()));
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void p(j jVar) {
        try {
            jVar.c(null);
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void r(j jVar, h hVar) {
        try {
            jVar.c(new d(hVar));
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void s(Map map, j jVar) {
        try {
            Object obj = map.get("message");
            Objects.requireNonNull(obj);
            g.d().f((String) obj);
            jVar.c(null);
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void t(k.d dVar, i iVar) {
        if (iVar.n()) {
            dVar.b(iVar.j());
            return;
        }
        Exception i2 = iVar.i();
        dVar.a("firebase_crashlytics", i2 != null ? i2.getMessage() : "An unknown error occurred", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void v(Map map, j jVar) {
        FlutterError flutterError;
        try {
            g d2 = g.d();
            Object obj = map.get("exception");
            Objects.requireNonNull(obj);
            String str = (String) obj;
            String str2 = (String) map.get("reason");
            Object obj2 = map.get("information");
            Objects.requireNonNull(obj2);
            String str3 = (String) obj2;
            Object obj3 = map.get("fatal");
            Objects.requireNonNull(obj3);
            boolean booleanValue = ((Boolean) obj3).booleanValue();
            if (str2 != null) {
                d2.k("flutter_error_reason", "thrown " + str2);
                flutterError = new FlutterError(str + ". Error thrown " + str2 + ".");
            } else {
                flutterError = new FlutterError(str);
            }
            d2.k("flutter_error_exception", str);
            ArrayList arrayList = new ArrayList();
            Object obj4 = map.get("stackTraceElements");
            Objects.requireNonNull(obj4);
            for (Map<String, String> map2 : (List) obj4) {
                StackTraceElement f2 = f(map2);
                if (f2 != null) {
                    arrayList.add(f2);
                }
            }
            flutterError.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            if (!str3.isEmpty()) {
                d2.f(str3);
            }
            if (booleanValue) {
                com.google.firebase.crashlytics.h.a(flutterError);
            } else {
                d2.g(flutterError);
            }
            jVar.c(null);
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void w(j jVar) {
        try {
            g.d().h();
            jVar.c(null);
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void y(Map map, j jVar) {
        try {
            Object obj = map.get("enabled");
            Objects.requireNonNull(obj);
            g.d().i((Boolean) obj);
            jVar.c(new c());
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void z(Map map, j jVar) {
        try {
            Object obj = map.get("key");
            Objects.requireNonNull(obj);
            Object obj2 = map.get("value");
            Objects.requireNonNull(obj2);
            g.d().k((String) obj, (String) obj2);
            jVar.c(null);
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public i<Void> didReinitializeFirebaseCore() {
        final j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.a
            @Override // java.lang.Runnable
            public final void run() {
                n.p(j.this);
            }
        });
        return jVar.a();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public i<Map<String, Object>> getPluginConstantsForFirebaseApp(final h hVar) {
        final j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.l
            @Override // java.lang.Runnable
            public final void run() {
                n.this.r(jVar, hVar);
            }
        });
        return jVar.a();
    }

    @Override // io.flutter.embedding.engine.i.a
    public void onAttachedToEngine(a.b bVar) {
        h(bVar.b());
    }

    @Override // io.flutter.embedding.engine.i.a
    public void onDetachedFromEngine(a.b bVar) {
        k kVar = this.f3264e;
        if (kVar != null) {
            kVar.e(null);
            this.f3264e = null;
        }
    }

    @Override // h.a.d.a.k.c
    public void onMethodCall(h.a.d.a.j jVar, final k.d dVar) {
        i iVar;
        String str = jVar.a;
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -2094964816:
                if (str.equals("Crashlytics#didCrashOnPreviousExecution")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1437158995:
                if (str.equals("Crashlytics#recordError")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1025128541:
                if (str.equals("Crashlytics#checkForUnsentReports")) {
                    c2 = 2;
                    break;
                }
                break;
            case -424770276:
                if (str.equals("Crashlytics#sendUnsentReports")) {
                    c2 = 3;
                    break;
                }
                break;
            case -108157790:
                if (str.equals("Crashlytics#setCrashlyticsCollectionEnabled")) {
                    c2 = 4;
                    break;
                }
                break;
            case 28093114:
                if (str.equals("Crashlytics#log")) {
                    c2 = 5;
                    break;
                }
                break;
            case 108415030:
                if (str.equals("Crashlytics#setCustomKey")) {
                    c2 = 6;
                    break;
                }
                break;
            case 213629529:
                if (str.equals("Crashlytics#deleteUnsentReports")) {
                    c2 = 7;
                    break;
                }
                break;
            case 679831756:
                if (str.equals("Crashlytics#setUserIdentifier")) {
                    c2 = '\b';
                    break;
                }
                break;
            case 1219454365:
                if (str.equals("Crashlytics#crash")) {
                    c2 = '\t';
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                iVar = e();
                break;
            case 1:
                iVar = C((Map) jVar.b());
                break;
            case 2:
                iVar = b();
                break;
            case 3:
                iVar = D();
                break;
            case 4:
                iVar = E((Map) jVar.b());
                break;
            case 5:
                iVar = B((Map) jVar.b());
                break;
            case 6:
                iVar = F((Map) jVar.b());
                break;
            case 7:
                iVar = d();
                break;
            case '\b':
                iVar = G((Map) jVar.b());
                break;
            case '\t':
                c();
                return;
            default:
                dVar.c();
                return;
        }
        iVar.b(new f.b.a.b.g.d() { // from class: io.flutter.plugins.firebase.crashlytics.c
            @Override // f.b.a.b.g.d
            public final void a(i iVar2) {
                n.t(k.d.this, iVar2);
            }
        });
    }
}

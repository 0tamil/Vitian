package io.flutter.plugins.firebase.core;

import android.content.Context;
import android.os.Looper;
import com.google.firebase.h;
import com.google.firebase.k;
import f.b.a.b.g.d;
import f.b.a.b.g.i;
import f.b.a.b.g.j;
import f.b.a.b.g.l;
import h.a.d.a.k;
import io.flutter.embedding.engine.i.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public class k implements a, k.c {

    /* renamed from: e  reason: collision with root package name */
    private h.a.d.a.k f3238e;

    /* renamed from: f  reason: collision with root package name */
    private Context f3239f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f3240g = false;

    private i<Void> a(final Map<String, Object> map) {
        final j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.c
            @Override // java.lang.Runnable
            public final void run() {
                k.g(map, jVar);
            }
        });
        return jVar.a();
    }

    private i<Map<String, Object>> b(final h hVar) {
        final j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.h
            @Override // java.lang.Runnable
            public final void run() {
                k.this.i(hVar, jVar);
            }
        });
        return jVar.a();
    }

    private i<Map<String, String>> c() {
        final j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.a
            @Override // java.lang.Runnable
            public final void run() {
                k.this.k(jVar);
            }
        });
        return jVar.a();
    }

    private Map<String, String> d(com.google.firebase.k kVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("apiKey", kVar.b());
        hashMap.put("appId", kVar.c());
        if (kVar.f() != null) {
            hashMap.put("messagingSenderId", kVar.f());
        }
        if (kVar.g() != null) {
            hashMap.put("projectId", kVar.g());
        }
        if (kVar.d() != null) {
            hashMap.put("databaseURL", kVar.d());
        }
        if (kVar.h() != null) {
            hashMap.put("storageBucket", kVar.h());
        }
        if (kVar.e() != null) {
            hashMap.put("trackingId", kVar.e());
        }
        return hashMap;
    }

    private i<Map<String, Object>> e(final Map<String, Object> map) {
        final j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.d
            @Override // java.lang.Runnable
            public final void run() {
                k.this.m(map, jVar);
            }
        });
        return jVar.a();
    }

    private i<List<Map<String, Object>>> f() {
        final j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.b
            @Override // java.lang.Runnable
            public final void run() {
                k.this.o(jVar);
            }
        });
        return jVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void g(Map map, j jVar) {
        try {
            Object obj = map.get("appName");
            Objects.requireNonNull(obj);
            try {
                h.m((String) obj).g();
            } catch (IllegalStateException unused) {
            }
            jVar.c(null);
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void i(h hVar, j jVar) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("name", hVar.n());
            hashMap.put("options", d(hVar.o()));
            hashMap.put("isAutomaticDataCollectionEnabled", Boolean.valueOf(hVar.u()));
            hashMap.put("pluginConstants", l.a(FlutterFirebasePluginRegistry.getPluginConstantsForFirebaseApp(hVar)));
            jVar.c(hashMap);
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void k(j jVar) {
        try {
            com.google.firebase.k a = com.google.firebase.k.a(this.f3239f);
            if (a == null) {
                jVar.c(null);
            } else {
                jVar.c(d(a));
            }
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m(Map map, j jVar) {
        try {
            Object obj = map.get("appName");
            Objects.requireNonNull(obj);
            String str = (String) obj;
            Object obj2 = map.get("options");
            Objects.requireNonNull(obj2);
            Map map2 = (Map) obj2;
            k.b bVar = new k.b();
            String str2 = (String) map2.get("apiKey");
            Objects.requireNonNull(str2);
            bVar.b(str2);
            String str3 = (String) map2.get("appId");
            Objects.requireNonNull(str3);
            bVar.c(str3);
            bVar.d((String) map2.get("databaseURL"));
            bVar.f((String) map2.get("messagingSenderId"));
            bVar.g((String) map2.get("projectId"));
            bVar.h((String) map2.get("storageBucket"));
            bVar.e((String) map2.get("trackingId"));
            com.google.firebase.k a = bVar.a();
            try {
                Looper.prepare();
            } catch (Exception unused) {
            }
            jVar.c((Map) l.a(b(h.t(this.f3239f, a, str))));
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void o(j jVar) {
        try {
            if (!this.f3240g) {
                this.f3240g = true;
            } else {
                l.a(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
            }
            List<h> k2 = h.k(this.f3239f);
            ArrayList arrayList = new ArrayList(k2.size());
            for (h hVar : k2) {
                arrayList.add((Map) l.a(b(hVar)));
            }
            jVar.c(arrayList);
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void p(k.d dVar, i iVar) {
        if (iVar.n()) {
            dVar.b(iVar.j());
            return;
        }
        Exception i2 = iVar.i();
        dVar.a("firebase_core", i2 != null ? i2.getMessage() : null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void q(Map map, j jVar) {
        try {
            Object obj = map.get("appName");
            Objects.requireNonNull(obj);
            Object obj2 = map.get("enabled");
            Objects.requireNonNull(obj2);
            h.m((String) obj).E((Boolean) obj2);
            jVar.c(null);
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void r(Map map, j jVar) {
        try {
            Object obj = map.get("appName");
            Objects.requireNonNull(obj);
            Object obj2 = map.get("enabled");
            Objects.requireNonNull(obj2);
            h.m((String) obj).D(((Boolean) obj2).booleanValue());
            jVar.c(null);
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    private i<Void> s(final Map<String, Object> map) {
        final j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.g
            @Override // java.lang.Runnable
            public final void run() {
                k.q(map, jVar);
            }
        });
        return jVar.a();
    }

    private i<Void> t(final Map<String, Object> map) {
        final j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.f
            @Override // java.lang.Runnable
            public final void run() {
                k.r(map, jVar);
            }
        });
        return jVar.a();
    }

    @Override // io.flutter.embedding.engine.i.a
    public void onAttachedToEngine(a.b bVar) {
        this.f3239f = bVar.a();
        h.a.d.a.k kVar = new h.a.d.a.k(bVar.b(), "plugins.flutter.io/firebase_core");
        this.f3238e = kVar;
        kVar.e(this);
    }

    @Override // io.flutter.embedding.engine.i.a
    public void onDetachedFromEngine(a.b bVar) {
        this.f3238e.e(null);
        this.f3239f = null;
    }

    @Override // h.a.d.a.k.c
    public void onMethodCall(h.a.d.a.j jVar, final k.d dVar) {
        i iVar;
        String str = jVar.a;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1428757205:
                if (str.equals("Firebase#initializeCore")) {
                    c = 0;
                    break;
                }
                break;
            case -941301958:
                if (str.equals("Firebase#optionsFromResource")) {
                    c = 1;
                    break;
                }
                break;
            case -746799097:
                if (str.equals("FirebaseApp#setAutomaticDataCollectionEnabled")) {
                    c = 2;
                    break;
                }
                break;
            case -738827499:
                if (str.equals("Firebase#initializeApp")) {
                    c = 3;
                    break;
                }
                break;
            case 145005524:
                if (str.equals("FirebaseApp#delete")) {
                    c = 4;
                    break;
                }
                break;
            case 1633364958:
                if (str.equals("FirebaseApp#setAutomaticResourceManagementEnabled")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                iVar = f();
                break;
            case 1:
                iVar = c();
                break;
            case 2:
                iVar = s((Map) jVar.b());
                break;
            case 3:
                iVar = e((Map) jVar.b());
                break;
            case 4:
                iVar = a((Map) jVar.b());
                break;
            case 5:
                iVar = t((Map) jVar.b());
                break;
            default:
                dVar.c();
                return;
        }
        iVar.b(new d() { // from class: io.flutter.plugins.firebase.core.e
            @Override // f.b.a.b.g.d
            public final void a(i iVar2) {
                k.p(k.d.this, iVar2);
            }
        });
    }
}

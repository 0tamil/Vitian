package io.flutter.plugins.firebase.messaging;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.app.m;
import com.google.firebase.h;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.w0;
import f.b.a.b.g.i;
import f.b.a.b.g.j;
import f.b.a.b.g.l;
import h.a.d.a.d;
import h.a.d.a.k;
import h.a.d.a.n;
import io.flutter.embedding.engine.e;
import io.flutter.embedding.engine.i.a;
import io.flutter.embedding.engine.i.c.c;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public class q extends BroadcastReceiver implements FlutterFirebasePlugin, k.c, n, io.flutter.embedding.engine.i.a, io.flutter.embedding.engine.i.c.a {

    /* renamed from: e  reason: collision with root package name */
    private final HashMap<String, Boolean> f3305e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private k f3306f;

    /* renamed from: g  reason: collision with root package name */
    private Activity f3307g;

    /* renamed from: h  reason: collision with root package name */
    private w0 f3308h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends HashMap<String, Object> {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f3309e;

        a(q qVar, String str) {
            this.f3309e = str;
            put("token", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends HashMap<String, Object> {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ FirebaseMessaging f3310e;

        b(q qVar, FirebaseMessaging firebaseMessaging) {
            this.f3310e = firebaseMessaging;
            put("isAutoInitEnabled", Boolean.valueOf(firebaseMessaging.n()));
        }
    }

    private i<Void> a() {
        final j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.d
            @Override // java.lang.Runnable
            public final void run() {
                q.g(j.this);
            }
        });
        return jVar.a();
    }

    private Map<String, Object> b(Exception exc) {
        HashMap hashMap = new HashMap();
        hashMap.put("code", "unknown");
        hashMap.put("message", exc != null ? exc.getMessage() : "An unknown error has occurred.");
        return hashMap;
    }

    private i<Map<String, Object>> c(Map<String, Object> map) {
        final j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.l
            @Override // java.lang.Runnable
            public final void run() {
                q.this.j(jVar);
            }
        });
        return jVar.a();
    }

    private i<Map<String, Integer>> d() {
        final j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.m
            @Override // java.lang.Runnable
            public final void run() {
                q.this.l(jVar);
            }
        });
        return jVar.a();
    }

    private i<Map<String, Object>> e() {
        final j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.f
            @Override // java.lang.Runnable
            public final void run() {
                q.this.o(jVar);
            }
        });
        return jVar.a();
    }

    private void f(d dVar) {
        k kVar = new k(dVar, "plugins.flutter.io/firebase_messaging");
        this.f3306f = kVar;
        kVar.e(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("io.flutter.plugins.firebase.messaging.TOKEN");
        intentFilter.addAction("io.flutter.plugins.firebase.messaging.NOTIFICATION");
        e.j.a.a.b(o.a()).c(this, intentFilter);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_messaging", this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void g(j jVar) {
        try {
            l.a(FirebaseMessaging.g().d());
            jVar.c(null);
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void j(j jVar) {
        try {
            w0 w0Var = this.f3308h;
            if (w0Var != null) {
                Map<String, Object> e2 = s.e(w0Var);
                this.f3308h = null;
                jVar.c(e2);
                return;
            }
            Activity activity = this.f3307g;
            if (activity == null) {
                jVar.c(null);
                return;
            }
            Intent intent = activity.getIntent();
            if (!(intent == null || intent.getExtras() == null)) {
                String string = intent.getExtras().getString("google.message_id");
                if (string == null) {
                    string = intent.getExtras().getString("message_id");
                }
                if (string != null && this.f3305e.get(string) == null) {
                    w0 w0Var2 = FlutterFirebaseMessagingReceiver.a.get(string);
                    if (w0Var2 == null) {
                        w0Var2 = r.b().a(string);
                        r.b().g(string);
                    }
                    if (w0Var2 == null) {
                        jVar.c(null);
                        return;
                    }
                    this.f3305e.put(string, Boolean.TRUE);
                    jVar.c(s.e(w0Var2));
                    return;
                }
                jVar.c(null);
                return;
            }
            jVar.c(null);
        } catch (Exception e3) {
            jVar.b(e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void l(j jVar) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("authorizationStatus", Integer.valueOf(m.e(this.f3307g).a() ? 1 : 0));
            jVar.c(hashMap);
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void m(h hVar, j jVar) {
        try {
            HashMap hashMap = new HashMap();
            if (hVar.n().equals("[DEFAULT]")) {
                hashMap.put("AUTO_INIT_ENABLED", Boolean.valueOf(FirebaseMessaging.g().n()));
            }
            jVar.c(hashMap);
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void o(j jVar) {
        try {
            jVar.c(new a(this, (String) l.a(FirebaseMessaging.g().j())));
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void q(k.d dVar, i iVar) {
        if (iVar.n()) {
            dVar.b(iVar.j());
            return;
        }
        Exception i2 = iVar.i();
        dVar.a("firebase_messaging", i2 != null ? i2.getMessage() : null, b(i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void r(Map map, j jVar) {
        try {
            s.a(map).H(s.b(map));
            jVar.c(null);
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void t(Map map, j jVar) {
        try {
            FirebaseMessaging a2 = s.a(map);
            Object obj = map.get("enabled");
            Objects.requireNonNull(obj);
            a2.I(((Boolean) obj).booleanValue());
            jVar.c(new b(this, a2));
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void u(Map map, j jVar) {
        try {
            FirebaseMessaging a2 = s.a(map);
            Object obj = map.get("topic");
            Objects.requireNonNull(obj);
            l.a(a2.M((String) obj));
            jVar.c(null);
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void v(Map map, j jVar) {
        try {
            FirebaseMessaging a2 = s.a(map);
            Object obj = map.get("topic");
            Objects.requireNonNull(obj);
            l.a(a2.P((String) obj));
            jVar.c(null);
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    private i<Void> w(final Map<String, Object> map) {
        final j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.g
            @Override // java.lang.Runnable
            public final void run() {
                q.r(map, jVar);
            }
        });
        return jVar.a();
    }

    private i<Map<String, Object>> x(final Map<String, Object> map) {
        final j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.i
            @Override // java.lang.Runnable
            public final void run() {
                q.this.t(map, jVar);
            }
        });
        return jVar.a();
    }

    private i<Void> y(final Map<String, Object> map) {
        final j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.k
            @Override // java.lang.Runnable
            public final void run() {
                q.u(map, jVar);
            }
        });
        return jVar.a();
    }

    private i<Void> z(final Map<String, Object> map) {
        final j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.n
            @Override // java.lang.Runnable
            public final void run() {
                q.v(map, jVar);
            }
        });
        return jVar.a();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public i<Void> didReinitializeFirebaseCore() {
        final j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.j
            @Override // java.lang.Runnable
            public final void run() {
                f.b.a.b.g.j.this.c(null);
            }
        });
        return jVar.a();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public i<Map<String, Object>> getPluginConstantsForFirebaseApp(final h hVar) {
        final j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.e
            @Override // java.lang.Runnable
            public final void run() {
                q.m(h.this, jVar);
            }
        });
        return jVar.a();
    }

    @Override // io.flutter.embedding.engine.i.c.a
    public void onAttachedToActivity(c cVar) {
        cVar.b(this);
        Activity d2 = cVar.d();
        this.f3307g = d2;
        if (d2.getIntent() != null && this.f3307g.getIntent().getExtras() != null && (this.f3307g.getIntent().getFlags() & 1048576) != 1048576) {
            onNewIntent(this.f3307g.getIntent());
        }
    }

    @Override // io.flutter.embedding.engine.i.a
    public void onAttachedToEngine(a.b bVar) {
        f(bVar.b());
    }

    @Override // io.flutter.embedding.engine.i.c.a
    public void onDetachedFromActivity() {
        this.f3307g = null;
    }

    @Override // io.flutter.embedding.engine.i.c.a
    public void onDetachedFromActivityForConfigChanges() {
        this.f3307g = null;
    }

    @Override // io.flutter.embedding.engine.i.a
    public void onDetachedFromEngine(a.b bVar) {
        if (bVar.a() != null) {
            e.j.a.a.b(bVar.a()).e(this);
        }
    }

    @Override // h.a.d.a.k.c
    public void onMethodCall(h.a.d.a.j jVar, final k.d dVar) {
        i iVar;
        String str = jVar.a;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1704007366:
                if (str.equals("Messaging#getInitialMessage")) {
                    c = 0;
                    break;
                }
                break;
            case -1661255137:
                if (str.equals("Messaging#setAutoInitEnabled")) {
                    c = 1;
                    break;
                }
                break;
            case -657665041:
                if (str.equals("Messaging#deleteToken")) {
                    c = 2;
                    break;
                }
                break;
            case 421314579:
                if (str.equals("Messaging#unsubscribeFromTopic")) {
                    c = 3;
                    break;
                }
                break;
            case 506322569:
                if (str.equals("Messaging#subscribeToTopic")) {
                    c = 4;
                    break;
                }
                break;
            case 928431066:
                if (str.equals("Messaging#startBackgroundIsolate")) {
                    c = 5;
                    break;
                }
                break;
            case 1165917248:
                if (str.equals("Messaging#sendMessage")) {
                    c = 6;
                    break;
                }
                break;
            case 1231338975:
                if (str.equals("Messaging#requestPermission")) {
                    c = 7;
                    break;
                }
                break;
            case 1243856389:
                if (str.equals("Messaging#getNotificationSettings")) {
                    c = '\b';
                    break;
                }
                break;
            case 1459336962:
                if (str.equals("Messaging#getToken")) {
                    c = '\t';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                iVar = c((Map) jVar.b());
                break;
            case 1:
                iVar = x((Map) jVar.b());
                break;
            case 2:
                iVar = a();
                break;
            case 3:
                iVar = z((Map) jVar.b());
                break;
            case 4:
                iVar = y((Map) jVar.b());
                break;
            case 5:
                Map map = (Map) jVar.b;
                Object obj = map.get("pluginCallbackHandle");
                Object obj2 = map.get("userCallbackHandle");
                long longValue = (obj instanceof Long ? (Long) obj : Long.valueOf(((Integer) obj).intValue())).longValue();
                long longValue2 = (obj2 instanceof Long ? (Long) obj2 : Long.valueOf(((Integer) obj2).intValue())).longValue();
                Activity activity = this.f3307g;
                e a2 = activity != null ? e.a(activity.getIntent()) : null;
                FlutterFirebaseMessagingBackgroundService.m(longValue);
                FlutterFirebaseMessagingBackgroundService.n(longValue2);
                FlutterFirebaseMessagingBackgroundService.o(longValue, a2);
                iVar = l.e(null);
                break;
            case 6:
                iVar = w((Map) jVar.b());
                break;
            case 7:
            case '\b':
                iVar = d();
                break;
            case '\t':
                iVar = e();
                break;
            default:
                dVar.c();
                return;
        }
        iVar.b(new f.b.a.b.g.d() { // from class: io.flutter.plugins.firebase.messaging.h
            @Override // f.b.a.b.g.d
            public final void a(i iVar2) {
                q.this.q(dVar, iVar2);
            }
        });
    }

    @Override // h.a.d.a.n
    public boolean onNewIntent(Intent intent) {
        if (intent == null || intent.getExtras() == null) {
            return false;
        }
        String string = intent.getExtras().getString("google.message_id");
        if (string == null) {
            string = intent.getExtras().getString("message_id");
        }
        if (string == null) {
            return false;
        }
        w0 w0Var = FlutterFirebaseMessagingReceiver.a.get(string);
        if (w0Var == null) {
            w0Var = r.b().a(string);
        }
        if (w0Var == null) {
            return false;
        }
        this.f3308h = w0Var;
        FlutterFirebaseMessagingReceiver.a.remove(string);
        this.f3306f.c("Messaging#onMessageOpenedApp", s.e(w0Var));
        this.f3307g.setIntent(intent);
        return true;
    }

    @Override // io.flutter.embedding.engine.i.c.a
    public void onReattachedToActivityForConfigChanges(c cVar) {
        cVar.b(this);
        this.f3307g = cVar.d();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        w0 w0Var;
        Object e2;
        k kVar;
        String str;
        String action = intent.getAction();
        if (action != null) {
            if (action.equals("io.flutter.plugins.firebase.messaging.TOKEN")) {
                e2 = intent.getStringExtra("token");
                kVar = this.f3306f;
                str = "Messaging#onTokenRefresh";
            } else if (action.equals("io.flutter.plugins.firebase.messaging.NOTIFICATION") && (w0Var = (w0) intent.getParcelableExtra("notification")) != null) {
                e2 = s.e(w0Var);
                kVar = this.f3306f;
                str = "Messaging#onMessage";
            } else {
                return;
            }
            kVar.c(str, e2);
        }
    }
}

package io.flutter.plugins.firebase.messaging;

import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.firebase.messaging.w0;
import h.a.d.a.d;
import h.a.d.a.j;
import h.a.d.a.k;
import io.flutter.embedding.engine.e;
import io.flutter.embedding.engine.f.d;
import io.flutter.embedding.engine.h.f;
import io.flutter.view.FlutterCallbackInformation;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class p implements k.c {

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f3300e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    private k f3301f;

    /* renamed from: g  reason: collision with root package name */
    private io.flutter.embedding.engine.b f3302g;

    /* loaded from: classes.dex */
    class a implements k.d {
        final /* synthetic */ CountDownLatch a;

        a(p pVar, CountDownLatch countDownLatch) {
            this.a = countDownLatch;
        }

        @Override // h.a.d.a.k.d
        public void a(String str, String str2, Object obj) {
            this.a.countDown();
        }

        @Override // h.a.d.a.k.d
        public void b(Object obj) {
            this.a.countDown();
        }

        @Override // h.a.d.a.k.d
        public void c() {
            this.a.countDown();
        }
    }

    /* loaded from: classes.dex */
    class b extends HashMap<String, Object> {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Map f3303e;

        b(Map map) {
            this.f3303e = map;
            put("userCallbackHandle", Long.valueOf(p.this.d()));
            put("message", map);
        }
    }

    private long c() {
        return o.a().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).getLong("callback_handle", 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long d() {
        return o.a().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).getLong("user_callback_handle", 0L);
    }

    private void e(d dVar) {
        k kVar = new k(dVar, "plugins.flutter.io/firebase_messaging_background");
        this.f3301f = kVar;
        kVar.e(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void i(f fVar, e eVar, long j2) {
        String g2 = fVar.g();
        AssetManager assets = o.a().getAssets();
        if (g()) {
            if (eVar != null) {
                Log.i("FLTFireBGExecutor", "Creating background FlutterEngine instance, with args: " + Arrays.toString(eVar.b()));
                this.f3302g = new io.flutter.embedding.engine.b(o.a(), eVar.b());
            } else {
                Log.i("FLTFireBGExecutor", "Creating background FlutterEngine instance.");
                this.f3302g = new io.flutter.embedding.engine.b(o.a());
            }
            FlutterCallbackInformation lookupCallbackInformation = FlutterCallbackInformation.lookupCallbackInformation(j2);
            io.flutter.embedding.engine.f.d h2 = this.f3302g.h();
            e(h2);
            h2.i(new d.b(assets, g2, lookupCallbackInformation));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void k(final f fVar, Handler handler, final e eVar, final long j2) {
        fVar.p(o.a());
        fVar.f(o.a(), null, handler, new Runnable() { // from class: io.flutter.plugins.firebase.messaging.b
            @Override // java.lang.Runnable
            public final void run() {
                p.this.i(fVar, eVar, j2);
            }
        });
    }

    private void l() {
        this.f3300e.set(true);
        FlutterFirebaseMessagingBackgroundService.l();
    }

    public static void m(long j2) {
        o.a().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).edit().putLong("callback_handle", j2).apply();
    }

    public static void n(long j2) {
        o.a().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).edit().putLong("user_callback_handle", j2).apply();
    }

    public void b(Intent intent, CountDownLatch countDownLatch) {
        if (this.f3302g == null) {
            Log.i("FLTFireBGExecutor", "A background message could not be handled in Dart as no onBackgroundMessage handler has been registered.");
            return;
        }
        a aVar = null;
        if (countDownLatch != null) {
            aVar = new a(this, countDownLatch);
        }
        w0 w0Var = (w0) intent.getParcelableExtra("notification");
        if (w0Var != null) {
            this.f3301f.d("MessagingBackground#onMessage", new b(s.e(w0Var)), aVar);
            return;
        }
        Log.e("FLTFireBGExecutor", "RemoteMessage instance not found in Intent.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        return c() != 0;
    }

    public boolean g() {
        return !this.f3300e.get();
    }

    public void o() {
        if (g()) {
            long c = c();
            if (c != 0) {
                p(c, null);
            }
        }
    }

    @Override // h.a.d.a.k.c
    public void onMethodCall(j jVar, k.d dVar) {
        try {
            if (jVar.a.equals("MessagingBackground#initialized")) {
                l();
                dVar.b(Boolean.TRUE);
            } else {
                dVar.c();
            }
        } catch (u e2) {
            dVar.a("error", "Flutter FCM error: " + e2.getMessage(), null);
        }
    }

    public void p(final long j2, final e eVar) {
        if (this.f3302g != null) {
            Log.e("FLTFireBGExecutor", "Background isolate already started.");
            return;
        }
        final f fVar = new f();
        final Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.a
            @Override // java.lang.Runnable
            public final void run() {
                p.this.k(fVar, handler, eVar, j2);
            }
        });
    }
}

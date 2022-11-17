package f.c.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import android.util.Log;
import e.k.a.a;
import e.k.a.b;
import f.c.a.d;
import f.c.a.e.c;
import h.a.d.a.j;
import h.a.d.a.k;
import io.flutter.embedding.engine.i.a;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public class d implements k.c, io.flutter.embedding.engine.i.a {

    /* renamed from: e  reason: collision with root package name */
    private k f2799e;

    /* renamed from: f  reason: collision with root package name */
    private SharedPreferences f2800f;

    /* renamed from: g  reason: collision with root package name */
    private SharedPreferences f2801g;

    /* renamed from: h  reason: collision with root package name */
    private Charset f2802h;

    /* renamed from: i  reason: collision with root package name */
    private c f2803i;

    /* renamed from: j  reason: collision with root package name */
    private Context f2804j;

    /* renamed from: k  reason: collision with root package name */
    private HandlerThread f2805k;
    private Handler l;
    private boolean m = false;
    private boolean n = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements k.d {
        private final k.d a;
        private final Handler b = new Handler(Looper.getMainLooper());

        a(k.d dVar) {
            this.a = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void e(String str, String str2, Object obj) {
            this.a.a(str, str2, obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void g(Object obj) {
            this.a.b(obj);
        }

        @Override // h.a.d.a.k.d
        public void a(final String str, final String str2, final Object obj) {
            this.b.post(new Runnable() { // from class: f.c.a.a
                @Override // java.lang.Runnable
                public final void run() {
                    d.a.this.e(str, str2, obj);
                }
            });
        }

        @Override // h.a.d.a.k.d
        public void b(final Object obj) {
            this.b.post(new Runnable() { // from class: f.c.a.b
                @Override // java.lang.Runnable
                public final void run() {
                    d.a.this.g(obj);
                }
            });
        }

        @Override // h.a.d.a.k.d
        public void c() {
            Handler handler = this.b;
            final k.d dVar = this.a;
            Objects.requireNonNull(dVar);
            handler.post(new Runnable() { // from class: f.c.a.c
                @Override // java.lang.Runnable
                public final void run() {
                    k.d.this.c();
                }
            });
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        private final j f2806e;

        /* renamed from: f  reason: collision with root package name */
        private final k.d f2807f;

        b(j jVar, k.d dVar) {
            this.f2806e = jVar;
            this.f2807f = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            k.d dVar;
            try {
                String str = this.f2806e.a;
                char c = 65535;
                switch (str.hashCode()) {
                    case -1335458389:
                        if (str.equals("delete")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -358737930:
                        if (str.equals("deleteAll")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 3496342:
                        if (str.equals("read")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 113399775:
                        if (str.equals("write")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 208013248:
                        if (str.equals("containsKey")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1080375339:
                        if (str.equals("readAll")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                Object obj = null;
                if (c == 0) {
                    String q = d.this.q(this.f2806e);
                    Map map = (Map) this.f2806e.b;
                    d.this.p(map);
                    String str2 = (String) map.get("value");
                    if (str2 != null) {
                        d dVar2 = d.this;
                        dVar2.x(q, str2, dVar2.m);
                        dVar = this.f2807f;
                    } else {
                        this.f2807f.a("null", null, null);
                        return;
                    }
                } else if (c == 1) {
                    String q2 = d.this.q(this.f2806e);
                    d.this.p((Map) this.f2806e.b);
                    if (d.this.f2800f.contains(q2)) {
                        d dVar3 = d.this;
                        obj = dVar3.t(q2, dVar3.m);
                        dVar = this.f2807f;
                    } else {
                        dVar = this.f2807f;
                    }
                } else if (c == 2) {
                    d.this.p((Map) this.f2806e.b);
                    d dVar4 = d.this;
                    obj = dVar4.u(dVar4.m);
                    dVar = this.f2807f;
                } else if (c == 3) {
                    String q3 = d.this.q(this.f2806e);
                    d.this.p((Map) this.f2806e.b);
                    boolean contains = d.this.f2800f.contains(q3);
                    dVar = this.f2807f;
                    obj = Boolean.valueOf(contains);
                } else if (c == 4) {
                    String q4 = d.this.q(this.f2806e);
                    d.this.p((Map) this.f2806e.b);
                    d.this.n(q4);
                    dVar = this.f2807f;
                } else if (c != 5) {
                    this.f2807f.c();
                    return;
                } else {
                    d.this.p((Map) this.f2806e.b);
                    d.this.o();
                    dVar = this.f2807f;
                }
                dVar.b(obj);
            } catch (Exception e2) {
                if (d.this.n) {
                    d.this.o();
                    this.f2807f.b("Data has been reset");
                    return;
                }
                StringWriter stringWriter = new StringWriter();
                e2.printStackTrace(new PrintWriter(stringWriter));
                this.f2807f.a("Exception encountered", this.f2806e.a, stringWriter.toString());
            }
        }
    }

    private String k(String str) {
        return "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIHNlY3VyZSBzdG9yYWdlCg_" + str;
    }

    private void l(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            Object value = entry.getValue();
            String key = entry.getKey();
            if ((value instanceof String) && key.contains("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIHNlY3VyZSBzdG9yYWdlCg")) {
                try {
                    sharedPreferences2.edit().putString(key, m((String) value)).apply();
                    sharedPreferences.edit().remove(key).apply();
                } catch (Exception e2) {
                    Log.e("FlutterSecureStoragePl", "Data migration failed", e2);
                }
            }
        }
    }

    private String m(String str) {
        if (str == null) {
            return null;
        }
        return new String(this.f2803i.b(Base64.decode(str, 0)), this.f2802h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(String str) {
        SharedPreferences.Editor edit = this.f2800f.edit();
        edit.remove(str);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        this.f2800f.edit().clear().apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(Map<String, Object> map) {
        Map<String, Object> map2 = (Map) map.get("options");
        if (map2 != null) {
            this.m = w(map2);
            this.n = v(map2);
            if (this.f2803i == null) {
                try {
                    this.f2803i = new f.c.a.e.b(this.f2804j);
                } catch (Exception e2) {
                    Log.e("FlutterSecureStoragePl", "StorageCipher initialization failed", e2);
                }
            }
            if (!this.m || Build.VERSION.SDK_INT < 23) {
                this.f2800f = this.f2801g;
                return;
            }
            try {
                this.f2800f = s(this.f2804j);
            } catch (Exception e3) {
                Log.e("FlutterSecureStoragePl", "EncryptedSharedPreferences initialization failed", e3);
            }
            l(this.f2801g, this.f2800f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String q(j jVar) {
        return k((String) ((Map) jVar.b).get("key"));
    }

    private SharedPreferences s(Context context) {
        b.a aVar = new b.a(context);
        aVar.c(new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setEncryptionPaddings("NoPadding").setBlockModes("GCM").setKeySize(256).build());
        return e.k.a.a.a(context, "FlutterSecureStorage", aVar.a(), a.d.AES256_SIV, a.e.AES256_GCM);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String t(String str, boolean z) {
        String string = this.f2800f.getString(str, null);
        return z ? string : m(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> u(boolean z) {
        Map<String, ?> all = this.f2800f.getAll();
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (entry.getKey().contains("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIHNlY3VyZSBzdG9yYWdlCg")) {
                String replaceFirst = entry.getKey().replaceFirst("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIHNlY3VyZSBzdG9yYWdlCg_", "");
                String str = (String) entry.getValue();
                if (!z) {
                    str = m(str);
                }
                hashMap.put(replaceFirst, str);
            }
        }
        return hashMap;
    }

    private boolean v(Map<String, Object> map) {
        return map.containsKey("resetOnError") && map.get("resetOnError").equals("true");
    }

    private boolean w(Map<String, Object> map) {
        return Build.VERSION.SDK_INT >= 23 && map.containsKey("encryptedSharedPreferences") && map.get("encryptedSharedPreferences").equals("true");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(String str, String str2, boolean z) {
        SharedPreferences.Editor edit = this.f2800f.edit();
        if (!z) {
            str2 = Base64.encodeToString(this.f2803i.a(str2.getBytes(this.f2802h)), 0);
        }
        edit.putString(str, str2);
        edit.apply();
    }

    @Override // io.flutter.embedding.engine.i.a
    public void onAttachedToEngine(a.b bVar) {
        r(bVar.b(), bVar.a());
    }

    @Override // io.flutter.embedding.engine.i.a
    public void onDetachedFromEngine(a.b bVar) {
        if (this.f2799e != null) {
            this.f2805k.quitSafely();
            this.f2805k = null;
            this.f2799e.e(null);
            this.f2799e = null;
        }
    }

    @Override // h.a.d.a.k.c
    public void onMethodCall(j jVar, k.d dVar) {
        this.l.post(new b(jVar, new a(dVar)));
    }

    public void r(h.a.d.a.d dVar, Context context) {
        try {
            this.f2804j = context.getApplicationContext();
            this.f2801g = context.getSharedPreferences("FlutterSecureStorage", 0);
            this.f2802h = Charset.forName("UTF-8");
            HandlerThread handlerThread = new HandlerThread("com.it_nomads.fluttersecurestorage.worker");
            this.f2805k = handlerThread;
            handlerThread.start();
            this.l = new Handler(this.f2805k.getLooper());
            k kVar = new k(dVar, "plugins.it_nomads.com/flutter_secure_storage");
            this.f2799e = kVar;
            kVar.e(this);
        } catch (Exception e2) {
            Log.e("FlutterSecureStoragePl", "Registration failed", e2);
        }
    }
}

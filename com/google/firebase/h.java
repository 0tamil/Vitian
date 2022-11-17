package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.internal.c;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.util.j;
import com.google.android.gms.common.util.k;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.n;
import com.google.firebase.components.r;
import com.google.firebase.components.s;
import com.google.firebase.components.z;
import com.google.firebase.p.g;
import e.d.l.i;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public class h {

    /* renamed from: k  reason: collision with root package name */
    private static final Object f1650k = new Object();
    private static final Executor l = new d();
    static final Map<String, h> m = new e.c.a();
    private final Context a;
    private final String b;
    private final k c;

    /* renamed from: d  reason: collision with root package name */
    private final s f1651d;

    /* renamed from: g  reason: collision with root package name */
    private final z<com.google.firebase.r.a> f1654g;

    /* renamed from: h  reason: collision with root package name */
    private final com.google.firebase.q.b<g> f1655h;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f1652e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    private final AtomicBoolean f1653f = new AtomicBoolean();

    /* renamed from: i  reason: collision with root package name */
    private final List<b> f1656i = new CopyOnWriteArrayList();

    /* renamed from: j  reason: collision with root package name */
    private final List<i> f1657j = new CopyOnWriteArrayList();

    /* loaded from: classes.dex */
    public interface b {
        void a(boolean z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(14)
    /* loaded from: classes.dex */
    public static class c implements c.a {
        private static AtomicReference<c> a = new AtomicReference<>();

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(Context context) {
            if (j.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (a.get() == null) {
                    c cVar = new c();
                    if (a.compareAndSet(null, cVar)) {
                        com.google.android.gms.common.api.internal.c.c(application);
                        com.google.android.gms.common.api.internal.c.b().a(cVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.c.a
        public void a(boolean z) {
            synchronized (h.f1650k) {
                Iterator it = new ArrayList(h.m.values()).iterator();
                while (it.hasNext()) {
                    h hVar = (h) it.next();
                    if (hVar.f1652e.get()) {
                        hVar.B(z);
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    private static class d implements Executor {

        /* renamed from: e  reason: collision with root package name */
        private static final Handler f1658e = new Handler(Looper.getMainLooper());

        private d() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            f1658e.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(e.a.j.c3)
    /* loaded from: classes.dex */
    public static class e extends BroadcastReceiver {
        private static AtomicReference<e> b = new AtomicReference<>();
        private final Context a;

        public e(Context context) {
            this.a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (b.get() == null) {
                e eVar = new e(context);
                if (b.compareAndSet(null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (h.f1650k) {
                for (h hVar : h.m.values()) {
                    hVar.q();
                }
            }
            c();
        }
    }

    protected h(final Context context, String str, k kVar) {
        p.i(context);
        this.a = context;
        p.e(str);
        this.b = str;
        p.i(kVar);
        this.c = kVar;
        List<com.google.firebase.q.b<r>> a2 = com.google.firebase.components.p.b(context, ComponentDiscoveryService.class).a();
        s.b f2 = s.f(l);
        f2.c(a2);
        f2.b(new FirebaseCommonRegistrar());
        f2.a(n.n(context, Context.class, new Class[0]));
        f2.a(n.n(this, h.class, new Class[0]));
        f2.a(n.n(kVar, k.class, new Class[0]));
        s d2 = f2.d();
        this.f1651d = d2;
        this.f1654g = new z<>(new com.google.firebase.q.b() { // from class: com.google.firebase.b
            @Override // com.google.firebase.q.b
            public final Object a() {
                return h.this.x(context);
            }
        });
        this.f1655h = d2.b(g.class);
        e(new b() { // from class: com.google.firebase.a
            @Override // com.google.firebase.h.b
            public final void a(boolean z) {
                h.this.z(z);
            }
        });
    }

    private static String A(String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (b bVar : this.f1656i) {
            bVar.a(z);
        }
    }

    private void C() {
        for (i iVar : this.f1657j) {
            iVar.a(this.b, this.c);
        }
    }

    private void f() {
        p.l(!this.f1653f.get(), "FirebaseApp was deleted");
    }

    private static List<String> i() {
        ArrayList arrayList = new ArrayList();
        synchronized (f1650k) {
            for (h hVar : m.values()) {
                arrayList.add(hVar.n());
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static List<h> k(Context context) {
        ArrayList arrayList;
        synchronized (f1650k) {
            arrayList = new ArrayList(m.values());
        }
        return arrayList;
    }

    public static h l() {
        h hVar;
        synchronized (f1650k) {
            hVar = m.get("[DEFAULT]");
            if (hVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + k.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return hVar;
    }

    public static h m(String str) {
        h hVar;
        List<String> i2;
        String str2;
        synchronized (f1650k) {
            hVar = m.get(A(str));
            if (hVar != null) {
                hVar.f1655h.a().k();
            } else {
                if (i().isEmpty()) {
                    str2 = "";
                } else {
                    str2 = "Available app names: " + TextUtils.join(", ", i2);
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
            }
        }
        return hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        if (!i.a(this.a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + n());
            e.b(this.a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + n());
        this.f1651d.i(v());
        this.f1655h.a().k();
    }

    public static h r(Context context) {
        synchronized (f1650k) {
            if (m.containsKey("[DEFAULT]")) {
                return l();
            }
            k a2 = k.a(context);
            if (a2 == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return s(context, a2);
        }
    }

    public static h s(Context context, k kVar) {
        return t(context, kVar, "[DEFAULT]");
    }

    public static h t(Context context, k kVar, String str) {
        h hVar;
        c.c(context);
        String A = A(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f1650k) {
            Map<String, h> map = m;
            boolean z = !map.containsKey(A);
            p.l(z, "FirebaseApp name " + A + " already exists!");
            p.j(context, "Application context cannot be null.");
            hVar = new h(context, A, kVar);
            map.put(A, hVar);
        }
        hVar.q();
        return hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ com.google.firebase.r.a x(Context context) {
        return new com.google.firebase.r.a(context, p(), (com.google.firebase.o.c) this.f1651d.a(com.google.firebase.o.c.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void z(boolean z) {
        if (!z) {
            this.f1655h.a().k();
        }
    }

    public void D(boolean z) {
        boolean z2;
        f();
        if (this.f1652e.compareAndSet(!z, z)) {
            boolean d2 = com.google.android.gms.common.api.internal.c.b().d();
            if (z && d2) {
                z2 = true;
            } else if (!z && d2) {
                z2 = false;
            } else {
                return;
            }
            B(z2);
        }
    }

    public void E(Boolean bool) {
        f();
        this.f1654g.a().e(bool);
    }

    public void e(b bVar) {
        f();
        if (this.f1652e.get() && com.google.android.gms.common.api.internal.c.b().d()) {
            bVar.a(true);
        }
        this.f1656i.add(bVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        return this.b.equals(((h) obj).n());
    }

    public void g() {
        if (this.f1653f.compareAndSet(false, true)) {
            synchronized (f1650k) {
                m.remove(this.b);
            }
            C();
        }
    }

    public <T> T h(Class<T> cls) {
        f();
        return (T) this.f1651d.a(cls);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public Context j() {
        f();
        return this.a;
    }

    public String n() {
        f();
        return this.b;
    }

    public k o() {
        f();
        return this.c;
    }

    public String p() {
        return com.google.android.gms.common.util.c.a(n().getBytes(Charset.defaultCharset())) + "+" + com.google.android.gms.common.util.c.a(o().c().getBytes(Charset.defaultCharset()));
    }

    public String toString() {
        o.a c2 = o.c(this);
        c2.a("name", this.b);
        c2.a("options", this.c);
        return c2.toString();
    }

    public boolean u() {
        f();
        return this.f1654g.a().b();
    }

    public boolean v() {
        return "[DEFAULT]".equals(n());
    }
}

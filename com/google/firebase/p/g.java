package com.google.firebase.p;

import android.content.Context;
import android.util.Base64OutputStream;
import com.google.firebase.components.n;
import com.google.firebase.components.o;
import com.google.firebase.components.u;
import com.google.firebase.h;
import com.google.firebase.p.k;
import com.google.firebase.q.b;
import com.google.firebase.s.i;
import f.b.a.b.g.l;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class g implements j, k {

    /* renamed from: f  reason: collision with root package name */
    private static final ThreadFactory f1869f = d.a;
    private final b<l> a;
    private final Context b;
    private final b<i> c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<h> f1870d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f1871e;

    private g(final Context context, final String str, Set<h> set, b<i> bVar) {
        this(new b() { // from class: com.google.firebase.p.a
            @Override // com.google.firebase.q.b
            public final Object a() {
                return g.g(context, str);
            }
        }, set, new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f1869f), bVar, context);
    }

    g(b<l> bVar, Set<h> set, Executor executor, b<i> bVar2, Context context) {
        this.a = bVar;
        this.f1870d = set;
        this.f1871e = executor;
        this.c = bVar2;
        this.b = context;
    }

    public static n<g> c() {
        n.b b = n.b(g.class, j.class, k.class);
        b.b(u.j(Context.class));
        b.b(u.j(h.class));
        b.b(u.l(h.class));
        b.b(u.k(i.class));
        b.f(b.a);
        return b.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ g d(o oVar) {
        return new g((Context) oVar.a(Context.class), ((h) oVar.a(h.class)).p(), oVar.c(h.class), oVar.b(i.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ String f() {
        String byteArrayOutputStream;
        synchronized (this) {
            l a = this.a.a();
            List<m> c = a.c();
            a.b();
            JSONArray jSONArray = new JSONArray();
            for (int i2 = 0; i2 < c.size(); i2++) {
                m mVar = c.get(i2);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", mVar.c());
                jSONObject.put("dates", new JSONArray((Collection) mVar.b()));
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("heartbeats", jSONArray);
            jSONObject2.put("version", "2");
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
            try {
                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                gZIPOutputStream.close();
                base64OutputStream.close();
                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
            } catch (Throwable th) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return byteArrayOutputStream;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ l g(Context context, String str) {
        return new l(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ Void i() {
        synchronized (this) {
            this.a.a().k(System.currentTimeMillis(), this.c.a().a());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Thread j(Runnable runnable) {
        return new Thread(runnable, "heartbeat-information-executor");
    }

    @Override // com.google.firebase.p.j
    public f.b.a.b.g.i<String> a() {
        return e.d.l.i.a(this.b) ^ true ? l.e("") : l.c(this.f1871e, new Callable() { // from class: com.google.firebase.p.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return g.this.f();
            }
        });
    }

    @Override // com.google.firebase.p.k
    public synchronized k.a b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        l a = this.a.a();
        if (a.i(currentTimeMillis)) {
            a.g();
            return k.a.GLOBAL;
        }
        return k.a.NONE;
    }

    public f.b.a.b.g.i<Void> k() {
        if (this.f1870d.size() > 0 && !(!e.d.l.i.a(this.b))) {
            return l.c(this.f1871e, new Callable() { // from class: com.google.firebase.p.e
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return g.this.i();
                }
            });
        }
        return l.e(null);
    }
}

package com.google.firebase.crashlytics.i.p;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.crashlytics.i.j.a0;
import com.google.firebase.crashlytics.i.j.h0;
import com.google.firebase.crashlytics.i.j.n;
import com.google.firebase.crashlytics.i.j.v;
import com.google.firebase.crashlytics.i.j.w;
import com.google.firebase.crashlytics.i.j.x;
import com.google.firebase.crashlytics.i.m.b;
import f.b.a.b.g.h;
import f.b.a.b.g.i;
import f.b.a.b.g.j;
import f.b.a.b.g.l;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class f implements i {
    private final Context a;
    private final j b;
    private final g c;

    /* renamed from: d  reason: collision with root package name */
    private final v f1637d;

    /* renamed from: e  reason: collision with root package name */
    private final com.google.firebase.crashlytics.i.p.a f1638e;

    /* renamed from: f  reason: collision with root package name */
    private final k f1639f;

    /* renamed from: g  reason: collision with root package name */
    private final w f1640g;

    /* renamed from: h  reason: collision with root package name */
    private final AtomicReference<d> f1641h;

    /* renamed from: i  reason: collision with root package name */
    private final AtomicReference<j<d>> f1642i = new AtomicReference<>(new j());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements h<Void, Void> {
        a() {
        }

        /* renamed from: b */
        public i<Void> a(Void r5) {
            JSONObject a = f.this.f1639f.a(f.this.b, true);
            if (a != null) {
                d b = f.this.c.b(a);
                f.this.f1638e.c(b.c, a);
                f.this.q(a, "Loaded settings: ");
                f fVar = f.this;
                fVar.r(fVar.b.f1645f);
                f.this.f1641h.set(b);
                ((j) f.this.f1642i.get()).e(b);
            }
            return l.e(null);
        }
    }

    f(Context context, j jVar, v vVar, g gVar, com.google.firebase.crashlytics.i.p.a aVar, k kVar, w wVar) {
        AtomicReference<d> atomicReference = new AtomicReference<>();
        this.f1641h = atomicReference;
        this.a = context;
        this.b = jVar;
        this.f1637d = vVar;
        this.c = gVar;
        this.f1638e = aVar;
        this.f1639f = kVar;
        this.f1640g = wVar;
        atomicReference.set(b.b(vVar));
    }

    public static f l(Context context, String str, a0 a0Var, b bVar, String str2, String str3, com.google.firebase.crashlytics.i.n.f fVar, w wVar) {
        String g2 = a0Var.g();
        h0 h0Var = new h0();
        return new f(context, new j(str, a0Var.h(), a0Var.i(), a0Var.j(), a0Var, n.h(n.n(context), str, str3, str2), str3, str2, x.a(g2).c()), h0Var, new g(h0Var), new com.google.firebase.crashlytics.i.p.a(fVar), new c(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), bVar), wVar);
    }

    private d m(e eVar) {
        Exception e2;
        d dVar = null;
        try {
            if (!e.SKIP_CACHE_LOOKUP.equals(eVar)) {
                JSONObject b = this.f1638e.b();
                if (b != null) {
                    d b2 = this.c.b(b);
                    if (b2 != null) {
                        q(b, "Loaded cached settings: ");
                        long a2 = this.f1637d.a();
                        if (!e.IGNORE_CACHE_EXPIRATION.equals(eVar) && b2.a(a2)) {
                            com.google.firebase.crashlytics.i.f.f().i("Cached settings have expired.");
                        }
                        try {
                            com.google.firebase.crashlytics.i.f.f().i("Returning cached settings.");
                            dVar = b2;
                        } catch (Exception e3) {
                            e2 = e3;
                            dVar = b2;
                            com.google.firebase.crashlytics.i.f.f().e("Failed to get cached settings", e2);
                            return dVar;
                        }
                    } else {
                        com.google.firebase.crashlytics.i.f.f().e("Failed to parse cached settings data.", null);
                    }
                } else {
                    com.google.firebase.crashlytics.i.f.f().b("No cached settings data found.");
                }
            }
        } catch (Exception e4) {
            e2 = e4;
        }
        return dVar;
    }

    private String n() {
        return n.r(this.a).getString("existing_instance_identifier", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(JSONObject jSONObject, String str) {
        com.google.firebase.crashlytics.i.f f2 = com.google.firebase.crashlytics.i.f.f();
        f2.b(str + jSONObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CommitPrefEdits"})
    public boolean r(String str) {
        SharedPreferences.Editor edit = n.r(this.a).edit();
        edit.putString("existing_instance_identifier", str);
        edit.apply();
        return true;
    }

    @Override // com.google.firebase.crashlytics.i.p.i
    public i<d> a() {
        return this.f1642i.get().a();
    }

    @Override // com.google.firebase.crashlytics.i.p.i
    public d b() {
        return this.f1641h.get();
    }

    boolean k() {
        return !n().equals(this.b.f1645f);
    }

    public i<Void> o(e eVar, Executor executor) {
        d m;
        if (k() || (m = m(eVar)) == null) {
            d m2 = m(e.IGNORE_CACHE_EXPIRATION);
            if (m2 != null) {
                this.f1641h.set(m2);
                this.f1642i.get().e(m2);
            }
            return this.f1640g.j(executor).p(executor, new a());
        }
        this.f1641h.set(m);
        this.f1642i.get().e(m);
        return l.e(null);
    }

    public i<Void> p(Executor executor) {
        return o(e.USE_CACHE, executor);
    }
}

package com.google.firebase.crashlytics;

import android.os.Bundle;
import com.google.firebase.crashlytics.i.h.d;
import com.google.firebase.crashlytics.i.h.f;
import com.google.firebase.crashlytics.i.i.b;
import com.google.firebase.crashlytics.i.i.c;
import com.google.firebase.l.a.a;
import com.google.firebase.q.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class e {
    private final a<com.google.firebase.l.a.a> a;
    private volatile com.google.firebase.crashlytics.i.h.a b;
    private volatile b c;

    /* renamed from: d  reason: collision with root package name */
    private final List<com.google.firebase.crashlytics.i.i.a> f1370d;

    public e(a<com.google.firebase.l.a.a> aVar) {
        this(aVar, new c(), new f());
    }

    public e(a<com.google.firebase.l.a.a> aVar, b bVar, com.google.firebase.crashlytics.i.h.a aVar2) {
        this.a = aVar;
        this.c = bVar;
        this.f1370d = new ArrayList();
        this.b = aVar2;
        c();
    }

    private void c() {
        this.a.b(new a.AbstractC0057a() { // from class: com.google.firebase.crashlytics.a
            @Override // com.google.firebase.q.a.AbstractC0057a
            public final void a(com.google.firebase.q.b bVar) {
                e.this.i(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void e(String str, Bundle bundle) {
        this.b.a(str, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void g(com.google.firebase.crashlytics.i.i.a aVar) {
        synchronized (this) {
            if (this.c instanceof c) {
                this.f1370d.add(aVar);
            }
            this.c.a(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void i(com.google.firebase.q.b bVar) {
        com.google.firebase.crashlytics.i.f.f().b("AnalyticsConnector now available.");
        com.google.firebase.l.a.a aVar = (com.google.firebase.l.a.a) bVar.a();
        com.google.firebase.crashlytics.i.h.e eVar = new com.google.firebase.crashlytics.i.h.e(aVar);
        f fVar = new f();
        if (j(aVar, fVar) != null) {
            com.google.firebase.crashlytics.i.f.f().b("Registered Firebase Analytics listener.");
            d dVar = new d();
            com.google.firebase.crashlytics.i.h.c cVar = new com.google.firebase.crashlytics.i.h.c(eVar, 500, TimeUnit.MILLISECONDS);
            synchronized (this) {
                for (com.google.firebase.crashlytics.i.i.a aVar2 : this.f1370d) {
                    dVar.a(aVar2);
                }
                fVar.a(dVar);
                fVar.b(cVar);
                this.c = dVar;
                this.b = cVar;
            }
            return;
        }
        com.google.firebase.crashlytics.i.f.f().k("Could not register Firebase Analytics listener; a listener is already registered.");
    }

    private static a.AbstractC0054a j(com.google.firebase.l.a.a aVar, f fVar) {
        a.AbstractC0054a b = aVar.b("clx", fVar);
        if (b == null) {
            com.google.firebase.crashlytics.i.f.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            b = aVar.b("crash", fVar);
            if (b != null) {
                com.google.firebase.crashlytics.i.f.f().k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return b;
    }

    public com.google.firebase.crashlytics.i.h.a a() {
        return new com.google.firebase.crashlytics.i.h.a() { // from class: com.google.firebase.crashlytics.b
            @Override // com.google.firebase.crashlytics.i.h.a
            public final void a(String str, Bundle bundle) {
                e.this.e(str, bundle);
            }
        };
    }

    public b b() {
        return new b() { // from class: com.google.firebase.crashlytics.c
            @Override // com.google.firebase.crashlytics.i.i.b
            public final void a(com.google.firebase.crashlytics.i.i.a aVar) {
                e.this.g(aVar);
            }
        };
    }
}

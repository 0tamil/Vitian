package com.google.firebase.crashlytics.i;

import com.google.firebase.crashlytics.i.l.c0;
import com.google.firebase.q.a;
import com.google.firebase.q.b;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class d implements c {
    private static final g c = new b();
    private final com.google.firebase.q.a<c> a;
    private final AtomicReference<c> b = new AtomicReference<>(null);

    /* loaded from: classes.dex */
    private static final class b implements g {
        private b() {
        }

        @Override // com.google.firebase.crashlytics.i.g
        public File a() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.i.g
        public File b() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.i.g
        public File c() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.i.g
        public File d() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.i.g
        public File e() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.i.g
        public File f() {
            return null;
        }
    }

    public d(com.google.firebase.q.a<c> aVar) {
        this.a = aVar;
        aVar.b(new a.AbstractC0057a() { // from class: com.google.firebase.crashlytics.i.a
            @Override // com.google.firebase.q.a.AbstractC0057a
            public final void a(b bVar) {
                d.this.f(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void f(com.google.firebase.q.b bVar) {
        f.f().b("Crashlytics native component now available.");
        this.b.set((c) bVar.a());
    }

    @Override // com.google.firebase.crashlytics.i.c
    public g a(String str) {
        c cVar = this.b.get();
        return cVar == null ? c : cVar.a(str);
    }

    @Override // com.google.firebase.crashlytics.i.c
    public boolean b(String str) {
        c cVar = this.b.get();
        return cVar != null && cVar.b(str);
    }

    @Override // com.google.firebase.crashlytics.i.c
    public boolean c() {
        c cVar = this.b.get();
        return cVar != null && cVar.c();
    }

    @Override // com.google.firebase.crashlytics.i.c
    public void d(final String str, final String str2, final long j2, final c0 c0Var) {
        f f2 = f.f();
        f2.i("Deferring native open session: " + str);
        this.a.b(new a.AbstractC0057a() { // from class: com.google.firebase.crashlytics.i.b
            @Override // com.google.firebase.q.a.AbstractC0057a
            public final void a(com.google.firebase.q.b bVar) {
                ((c) bVar.a()).d(str, str2, j2, c0Var);
            }
        });
    }
}

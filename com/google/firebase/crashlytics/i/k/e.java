package com.google.firebase.crashlytics.i.k;

import com.google.firebase.crashlytics.i.n.f;
import java.io.File;
/* loaded from: classes.dex */
public class e {
    private static final b c = new b();
    private final f a;
    private c b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b implements c {
        private b() {
        }

        @Override // com.google.firebase.crashlytics.i.k.c
        public void a() {
        }

        @Override // com.google.firebase.crashlytics.i.k.c
        public void b() {
        }

        @Override // com.google.firebase.crashlytics.i.k.c
        public String c() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.i.k.c
        public void d(long j2, String str) {
        }

        @Override // com.google.firebase.crashlytics.i.k.c
        public byte[] e() {
            return null;
        }
    }

    public e(f fVar) {
        this.a = fVar;
        this.b = c;
    }

    public e(f fVar, String str) {
        this(fVar);
        e(str);
    }

    private File d(String str) {
        return this.a.n(str, "userlog");
    }

    public void a() {
        this.b.b();
    }

    public byte[] b() {
        return this.b.e();
    }

    public String c() {
        return this.b.c();
    }

    public final void e(String str) {
        this.b.a();
        this.b = c;
        if (str != null) {
            f(d(str), 65536);
        }
    }

    void f(File file, int i2) {
        this.b = new h(file, i2);
    }

    public void g(long j2, String str) {
        this.b.d(j2, str);
    }
}

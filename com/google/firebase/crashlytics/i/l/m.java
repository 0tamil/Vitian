package com.google.firebase.crashlytics.i.l;

import com.google.firebase.crashlytics.i.l.a0;
import java.util.Objects;
/* loaded from: classes.dex */
final class m extends a0.e.d.a.b {
    private final b0<a0.e.d.a.b.AbstractC0043e> a;
    private final a0.e.d.a.b.c b;
    private final a0.a c;

    /* renamed from: d  reason: collision with root package name */
    private final a0.e.d.a.b.AbstractC0041d f1580d;

    /* renamed from: e  reason: collision with root package name */
    private final b0<a0.e.d.a.b.AbstractC0037a> f1581e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends a0.e.d.a.b.AbstractC0039b {
        private b0<a0.e.d.a.b.AbstractC0043e> a;
        private a0.e.d.a.b.c b;
        private a0.a c;

        /* renamed from: d  reason: collision with root package name */
        private a0.e.d.a.b.AbstractC0041d f1582d;

        /* renamed from: e  reason: collision with root package name */
        private b0<a0.e.d.a.b.AbstractC0037a> f1583e;

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.AbstractC0039b
        public a0.e.d.a.b a() {
            String str = "";
            if (this.f1582d == null) {
                str = str + " signal";
            }
            if (this.f1583e == null) {
                str = str + " binaries";
            }
            if (str.isEmpty()) {
                return new m(this.a, this.b, this.c, this.f1582d, this.f1583e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.AbstractC0039b
        public a0.e.d.a.b.AbstractC0039b b(a0.a aVar) {
            this.c = aVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.AbstractC0039b
        public a0.e.d.a.b.AbstractC0039b c(b0<a0.e.d.a.b.AbstractC0037a> b0Var) {
            Objects.requireNonNull(b0Var, "Null binaries");
            this.f1583e = b0Var;
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.AbstractC0039b
        public a0.e.d.a.b.AbstractC0039b d(a0.e.d.a.b.c cVar) {
            this.b = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.AbstractC0039b
        public a0.e.d.a.b.AbstractC0039b e(a0.e.d.a.b.AbstractC0041d dVar) {
            Objects.requireNonNull(dVar, "Null signal");
            this.f1582d = dVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.AbstractC0039b
        public a0.e.d.a.b.AbstractC0039b f(b0<a0.e.d.a.b.AbstractC0043e> b0Var) {
            this.a = b0Var;
            return this;
        }
    }

    private m(b0<a0.e.d.a.b.AbstractC0043e> b0Var, a0.e.d.a.b.c cVar, a0.a aVar, a0.e.d.a.b.AbstractC0041d dVar, b0<a0.e.d.a.b.AbstractC0037a> b0Var2) {
        this.a = b0Var;
        this.b = cVar;
        this.c = aVar;
        this.f1580d = dVar;
        this.f1581e = b0Var2;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b
    public a0.a b() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b
    public b0<a0.e.d.a.b.AbstractC0037a> c() {
        return this.f1581e;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b
    public a0.e.d.a.b.c d() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b
    public a0.e.d.a.b.AbstractC0041d e() {
        return this.f1580d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d.a.b)) {
            return false;
        }
        a0.e.d.a.b bVar = (a0.e.d.a.b) obj;
        b0<a0.e.d.a.b.AbstractC0043e> b0Var = this.a;
        if (b0Var != null ? b0Var.equals(bVar.f()) : bVar.f() == null) {
            a0.e.d.a.b.c cVar = this.b;
            if (cVar != null ? cVar.equals(bVar.d()) : bVar.d() == null) {
                a0.a aVar = this.c;
                if (aVar != null ? aVar.equals(bVar.b()) : bVar.b() == null) {
                    if (this.f1580d.equals(bVar.e()) && this.f1581e.equals(bVar.c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b
    public b0<a0.e.d.a.b.AbstractC0043e> f() {
        return this.a;
    }

    public int hashCode() {
        b0<a0.e.d.a.b.AbstractC0043e> b0Var = this.a;
        int i2 = 0;
        int hashCode = ((b0Var == null ? 0 : b0Var.hashCode()) ^ 1000003) * 1000003;
        a0.e.d.a.b.c cVar = this.b;
        int hashCode2 = (hashCode ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        a0.a aVar = this.c;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return ((((hashCode2 ^ i2) * 1000003) ^ this.f1580d.hashCode()) * 1000003) ^ this.f1581e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.a + ", exception=" + this.b + ", appExitInfo=" + this.c + ", signal=" + this.f1580d + ", binaries=" + this.f1581e + "}";
    }
}

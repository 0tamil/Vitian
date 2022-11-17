package com.google.firebase.crashlytics.i.l;

import com.google.firebase.crashlytics.i.l.a0;
import java.util.Objects;
/* loaded from: classes.dex */
final class l extends a0.e.d.a {
    private final a0.e.d.a.b a;
    private final b0<a0.c> b;
    private final b0<a0.c> c;

    /* renamed from: d  reason: collision with root package name */
    private final Boolean f1576d;

    /* renamed from: e  reason: collision with root package name */
    private final int f1577e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends a0.e.d.a.AbstractC0036a {
        private a0.e.d.a.b a;
        private b0<a0.c> b;
        private b0<a0.c> c;

        /* renamed from: d  reason: collision with root package name */
        private Boolean f1578d;

        /* renamed from: e  reason: collision with root package name */
        private Integer f1579e;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(a0.e.d.a aVar) {
            this.a = aVar.d();
            this.b = aVar.c();
            this.c = aVar.e();
            this.f1578d = aVar.b();
            this.f1579e = Integer.valueOf(aVar.f());
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.AbstractC0036a
        public a0.e.d.a a() {
            String str = "";
            if (this.a == null) {
                str = str + " execution";
            }
            if (this.f1579e == null) {
                str = str + " uiOrientation";
            }
            if (str.isEmpty()) {
                return new l(this.a, this.b, this.c, this.f1578d, this.f1579e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.AbstractC0036a
        public a0.e.d.a.AbstractC0036a b(Boolean bool) {
            this.f1578d = bool;
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.AbstractC0036a
        public a0.e.d.a.AbstractC0036a c(b0<a0.c> b0Var) {
            this.b = b0Var;
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.AbstractC0036a
        public a0.e.d.a.AbstractC0036a d(a0.e.d.a.b bVar) {
            Objects.requireNonNull(bVar, "Null execution");
            this.a = bVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.AbstractC0036a
        public a0.e.d.a.AbstractC0036a e(b0<a0.c> b0Var) {
            this.c = b0Var;
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.AbstractC0036a
        public a0.e.d.a.AbstractC0036a f(int i2) {
            this.f1579e = Integer.valueOf(i2);
            return this;
        }
    }

    private l(a0.e.d.a.b bVar, b0<a0.c> b0Var, b0<a0.c> b0Var2, Boolean bool, int i2) {
        this.a = bVar;
        this.b = b0Var;
        this.c = b0Var2;
        this.f1576d = bool;
        this.f1577e = i2;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a
    public Boolean b() {
        return this.f1576d;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a
    public b0<a0.c> c() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a
    public a0.e.d.a.b d() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a
    public b0<a0.c> e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        b0<a0.c> b0Var;
        b0<a0.c> b0Var2;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d.a)) {
            return false;
        }
        a0.e.d.a aVar = (a0.e.d.a) obj;
        return this.a.equals(aVar.d()) && ((b0Var = this.b) != null ? b0Var.equals(aVar.c()) : aVar.c() == null) && ((b0Var2 = this.c) != null ? b0Var2.equals(aVar.e()) : aVar.e() == null) && ((bool = this.f1576d) != null ? bool.equals(aVar.b()) : aVar.b() == null) && this.f1577e == aVar.f();
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a
    public int f() {
        return this.f1577e;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a
    public a0.e.d.a.AbstractC0036a g() {
        return new b(this);
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        b0<a0.c> b0Var = this.b;
        int i2 = 0;
        int hashCode2 = (hashCode ^ (b0Var == null ? 0 : b0Var.hashCode())) * 1000003;
        b0<a0.c> b0Var2 = this.c;
        int hashCode3 = (hashCode2 ^ (b0Var2 == null ? 0 : b0Var2.hashCode())) * 1000003;
        Boolean bool = this.f1576d;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return ((hashCode3 ^ i2) * 1000003) ^ this.f1577e;
    }

    public String toString() {
        return "Application{execution=" + this.a + ", customAttributes=" + this.b + ", internalKeys=" + this.c + ", background=" + this.f1576d + ", uiOrientation=" + this.f1577e + "}";
    }
}

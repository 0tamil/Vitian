package com.google.firebase.crashlytics.i.l;

import com.google.firebase.crashlytics.i.l.a0;
import java.util.Objects;
/* loaded from: classes.dex */
final class o extends a0.e.d.a.b.c {
    private final String a;
    private final String b;
    private final b0<a0.e.d.a.b.AbstractC0043e.AbstractC0045b> c;

    /* renamed from: d  reason: collision with root package name */
    private final a0.e.d.a.b.c f1586d;

    /* renamed from: e  reason: collision with root package name */
    private final int f1587e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends a0.e.d.a.b.c.AbstractC0040a {
        private String a;
        private String b;
        private b0<a0.e.d.a.b.AbstractC0043e.AbstractC0045b> c;

        /* renamed from: d  reason: collision with root package name */
        private a0.e.d.a.b.c f1588d;

        /* renamed from: e  reason: collision with root package name */
        private Integer f1589e;

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.c.AbstractC0040a
        public a0.e.d.a.b.c a() {
            String str = "";
            if (this.a == null) {
                str = str + " type";
            }
            if (this.c == null) {
                str = str + " frames";
            }
            if (this.f1589e == null) {
                str = str + " overflowCount";
            }
            if (str.isEmpty()) {
                return new o(this.a, this.b, this.c, this.f1588d, this.f1589e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.c.AbstractC0040a
        public a0.e.d.a.b.c.AbstractC0040a b(a0.e.d.a.b.c cVar) {
            this.f1588d = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.c.AbstractC0040a
        public a0.e.d.a.b.c.AbstractC0040a c(b0<a0.e.d.a.b.AbstractC0043e.AbstractC0045b> b0Var) {
            Objects.requireNonNull(b0Var, "Null frames");
            this.c = b0Var;
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.c.AbstractC0040a
        public a0.e.d.a.b.c.AbstractC0040a d(int i2) {
            this.f1589e = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.c.AbstractC0040a
        public a0.e.d.a.b.c.AbstractC0040a e(String str) {
            this.b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.c.AbstractC0040a
        public a0.e.d.a.b.c.AbstractC0040a f(String str) {
            Objects.requireNonNull(str, "Null type");
            this.a = str;
            return this;
        }
    }

    private o(String str, String str2, b0<a0.e.d.a.b.AbstractC0043e.AbstractC0045b> b0Var, a0.e.d.a.b.c cVar, int i2) {
        this.a = str;
        this.b = str2;
        this.c = b0Var;
        this.f1586d = cVar;
        this.f1587e = i2;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.c
    public a0.e.d.a.b.c b() {
        return this.f1586d;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.c
    public b0<a0.e.d.a.b.AbstractC0043e.AbstractC0045b> c() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.c
    public int d() {
        return this.f1587e;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.c
    public String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        String str;
        a0.e.d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d.a.b.c)) {
            return false;
        }
        a0.e.d.a.b.c cVar2 = (a0.e.d.a.b.c) obj;
        return this.a.equals(cVar2.f()) && ((str = this.b) != null ? str.equals(cVar2.e()) : cVar2.e() == null) && this.c.equals(cVar2.c()) && ((cVar = this.f1586d) != null ? cVar.equals(cVar2.b()) : cVar2.b() == null) && this.f1587e == cVar2.d();
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.c
    public String f() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int i2 = 0;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        a0.e.d.a.b.c cVar = this.f1586d;
        if (cVar != null) {
            i2 = cVar.hashCode();
        }
        return ((hashCode2 ^ i2) * 1000003) ^ this.f1587e;
    }

    public String toString() {
        return "Exception{type=" + this.a + ", reason=" + this.b + ", frames=" + this.c + ", causedBy=" + this.f1586d + ", overflowCount=" + this.f1587e + "}";
    }
}

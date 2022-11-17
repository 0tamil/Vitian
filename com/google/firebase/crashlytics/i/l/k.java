package com.google.firebase.crashlytics.i.l;

import com.google.firebase.crashlytics.i.l.a0;
import java.util.Objects;
/* loaded from: classes.dex */
final class k extends a0.e.d {
    private final long a;
    private final String b;
    private final a0.e.d.a c;

    /* renamed from: d  reason: collision with root package name */
    private final a0.e.d.c f1572d;

    /* renamed from: e  reason: collision with root package name */
    private final a0.e.d.AbstractC0047d f1573e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends a0.e.d.b {
        private Long a;
        private String b;
        private a0.e.d.a c;

        /* renamed from: d  reason: collision with root package name */
        private a0.e.d.c f1574d;

        /* renamed from: e  reason: collision with root package name */
        private a0.e.d.AbstractC0047d f1575e;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(a0.e.d dVar) {
            this.a = Long.valueOf(dVar.e());
            this.b = dVar.f();
            this.c = dVar.b();
            this.f1574d = dVar.c();
            this.f1575e = dVar.d();
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.b
        public a0.e.d a() {
            String str = "";
            if (this.a == null) {
                str = str + " timestamp";
            }
            if (this.b == null) {
                str = str + " type";
            }
            if (this.c == null) {
                str = str + " app";
            }
            if (this.f1574d == null) {
                str = str + " device";
            }
            if (str.isEmpty()) {
                return new k(this.a.longValue(), this.b, this.c, this.f1574d, this.f1575e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.b
        public a0.e.d.b b(a0.e.d.a aVar) {
            Objects.requireNonNull(aVar, "Null app");
            this.c = aVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.b
        public a0.e.d.b c(a0.e.d.c cVar) {
            Objects.requireNonNull(cVar, "Null device");
            this.f1574d = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.b
        public a0.e.d.b d(a0.e.d.AbstractC0047d dVar) {
            this.f1575e = dVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.b
        public a0.e.d.b e(long j2) {
            this.a = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.b
        public a0.e.d.b f(String str) {
            Objects.requireNonNull(str, "Null type");
            this.b = str;
            return this;
        }
    }

    private k(long j2, String str, a0.e.d.a aVar, a0.e.d.c cVar, a0.e.d.AbstractC0047d dVar) {
        this.a = j2;
        this.b = str;
        this.c = aVar;
        this.f1572d = cVar;
        this.f1573e = dVar;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.d
    public a0.e.d.a b() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.d
    public a0.e.d.c c() {
        return this.f1572d;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.d
    public a0.e.d.AbstractC0047d d() {
        return this.f1573e;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.d
    public long e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d)) {
            return false;
        }
        a0.e.d dVar = (a0.e.d) obj;
        if (this.a == dVar.e() && this.b.equals(dVar.f()) && this.c.equals(dVar.b()) && this.f1572d.equals(dVar.c())) {
            a0.e.d.AbstractC0047d dVar2 = this.f1573e;
            a0.e.d.AbstractC0047d d2 = dVar.d();
            if (dVar2 == null) {
                if (d2 == null) {
                    return true;
                }
            } else if (dVar2.equals(d2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.d
    public String f() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.d
    public a0.e.d.b g() {
        return new b(this);
    }

    public int hashCode() {
        long j2 = this.a;
        int hashCode = (((((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f1572d.hashCode()) * 1000003;
        a0.e.d.AbstractC0047d dVar = this.f1573e;
        return (dVar == null ? 0 : dVar.hashCode()) ^ hashCode;
    }

    public String toString() {
        return "Event{timestamp=" + this.a + ", type=" + this.b + ", app=" + this.c + ", device=" + this.f1572d + ", log=" + this.f1573e + "}";
    }
}

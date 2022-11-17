package com.google.firebase.crashlytics.i.l;

import com.google.firebase.crashlytics.i.l.a0;
import java.util.Objects;
/* loaded from: classes.dex */
final class u extends a0.e.AbstractC0048e {
    private final int a;
    private final String b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f1600d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends a0.e.AbstractC0048e.a {
        private Integer a;
        private String b;
        private String c;

        /* renamed from: d  reason: collision with root package name */
        private Boolean f1601d;

        @Override // com.google.firebase.crashlytics.i.l.a0.e.AbstractC0048e.a
        public a0.e.AbstractC0048e a() {
            String str = "";
            if (this.a == null) {
                str = str + " platform";
            }
            if (this.b == null) {
                str = str + " version";
            }
            if (this.c == null) {
                str = str + " buildVersion";
            }
            if (this.f1601d == null) {
                str = str + " jailbroken";
            }
            if (str.isEmpty()) {
                return new u(this.a.intValue(), this.b, this.c, this.f1601d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.AbstractC0048e.a
        public a0.e.AbstractC0048e.a b(String str) {
            Objects.requireNonNull(str, "Null buildVersion");
            this.c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.AbstractC0048e.a
        public a0.e.AbstractC0048e.a c(boolean z) {
            this.f1601d = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.AbstractC0048e.a
        public a0.e.AbstractC0048e.a d(int i2) {
            this.a = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.AbstractC0048e.a
        public a0.e.AbstractC0048e.a e(String str) {
            Objects.requireNonNull(str, "Null version");
            this.b = str;
            return this;
        }
    }

    private u(int i2, String str, String str2, boolean z) {
        this.a = i2;
        this.b = str;
        this.c = str2;
        this.f1600d = z;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.AbstractC0048e
    public String b() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.AbstractC0048e
    public int c() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.AbstractC0048e
    public String d() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.AbstractC0048e
    public boolean e() {
        return this.f1600d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.AbstractC0048e)) {
            return false;
        }
        a0.e.AbstractC0048e eVar = (a0.e.AbstractC0048e) obj;
        return this.a == eVar.c() && this.b.equals(eVar.d()) && this.c.equals(eVar.b()) && this.f1600d == eVar.e();
    }

    public int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.f1600d ? 1231 : 1237);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.a + ", version=" + this.b + ", buildVersion=" + this.c + ", jailbroken=" + this.f1600d + "}";
    }
}

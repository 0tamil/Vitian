package com.google.firebase.crashlytics.i.l;

import com.google.firebase.crashlytics.i.l.a0;
import java.util.Objects;
/* loaded from: classes.dex */
final class q extends a0.e.d.a.b.AbstractC0043e {
    private final String a;
    private final int b;
    private final b0<a0.e.d.a.b.AbstractC0043e.AbstractC0045b> c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends a0.e.d.a.b.AbstractC0043e.AbstractC0044a {
        private String a;
        private Integer b;
        private b0<a0.e.d.a.b.AbstractC0043e.AbstractC0045b> c;

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.AbstractC0043e.AbstractC0044a
        public a0.e.d.a.b.AbstractC0043e a() {
            String str = "";
            if (this.a == null) {
                str = str + " name";
            }
            if (this.b == null) {
                str = str + " importance";
            }
            if (this.c == null) {
                str = str + " frames";
            }
            if (str.isEmpty()) {
                return new q(this.a, this.b.intValue(), this.c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.AbstractC0043e.AbstractC0044a
        public a0.e.d.a.b.AbstractC0043e.AbstractC0044a b(b0<a0.e.d.a.b.AbstractC0043e.AbstractC0045b> b0Var) {
            Objects.requireNonNull(b0Var, "Null frames");
            this.c = b0Var;
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.AbstractC0043e.AbstractC0044a
        public a0.e.d.a.b.AbstractC0043e.AbstractC0044a c(int i2) {
            this.b = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.AbstractC0043e.AbstractC0044a
        public a0.e.d.a.b.AbstractC0043e.AbstractC0044a d(String str) {
            Objects.requireNonNull(str, "Null name");
            this.a = str;
            return this;
        }
    }

    private q(String str, int i2, b0<a0.e.d.a.b.AbstractC0043e.AbstractC0045b> b0Var) {
        this.a = str;
        this.b = i2;
        this.c = b0Var;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.AbstractC0043e
    public b0<a0.e.d.a.b.AbstractC0043e.AbstractC0045b> b() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.AbstractC0043e
    public int c() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.d.a.b.AbstractC0043e
    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d.a.b.AbstractC0043e)) {
            return false;
        }
        a0.e.d.a.b.AbstractC0043e eVar = (a0.e.d.a.b.AbstractC0043e) obj;
        return this.a.equals(eVar.d()) && this.b == eVar.c() && this.c.equals(eVar.b());
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.a + ", importance=" + this.b + ", frames=" + this.c + "}";
    }
}

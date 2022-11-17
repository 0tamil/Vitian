package com.google.firebase.crashlytics.i.l;

import com.google.firebase.crashlytics.i.l.a0;
import java.util.Objects;
/* loaded from: classes.dex */
final class d extends a0.c {
    private final String a;
    private final String b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends a0.c.a {
        private String a;
        private String b;

        @Override // com.google.firebase.crashlytics.i.l.a0.c.a
        public a0.c a() {
            String str = "";
            if (this.a == null) {
                str = str + " key";
            }
            if (this.b == null) {
                str = str + " value";
            }
            if (str.isEmpty()) {
                return new d(this.a, this.b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.c.a
        public a0.c.a b(String str) {
            Objects.requireNonNull(str, "Null key");
            this.a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.c.a
        public a0.c.a c(String str) {
            Objects.requireNonNull(str, "Null value");
            this.b = str;
            return this;
        }
    }

    private d(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.c
    public String b() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.c
    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.c)) {
            return false;
        }
        a0.c cVar = (a0.c) obj;
        return this.a.equals(cVar.b()) && this.b.equals(cVar.c());
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.a + ", value=" + this.b + "}";
    }
}

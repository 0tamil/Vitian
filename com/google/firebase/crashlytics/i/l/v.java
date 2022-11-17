package com.google.firebase.crashlytics.i.l;

import com.google.firebase.crashlytics.i.l.a0;
import java.util.Objects;
/* loaded from: classes.dex */
final class v extends a0.e.f {
    private final String a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends a0.e.f.a {
        private String a;

        @Override // com.google.firebase.crashlytics.i.l.a0.e.f.a
        public a0.e.f a() {
            String str = "";
            if (this.a == null) {
                str = str + " identifier";
            }
            if (str.isEmpty()) {
                return new v(this.a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.f.a
        public a0.e.f.a b(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.a = str;
            return this;
        }
    }

    private v(String str) {
        this.a = str;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.f
    public String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.f) {
            return this.a.equals(((a0.e.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.a + "}";
    }
}

package com.google.firebase.crashlytics.i.l;

import com.google.firebase.crashlytics.i.l.a0;
import java.util.Objects;
/* loaded from: classes.dex */
final class t extends a0.e.d.AbstractC0047d {
    private final String a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends a0.e.d.AbstractC0047d.a {
        private String a;

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.AbstractC0047d.a
        public a0.e.d.AbstractC0047d a() {
            String str = "";
            if (this.a == null) {
                str = str + " content";
            }
            if (str.isEmpty()) {
                return new t(this.a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.e.d.AbstractC0047d.a
        public a0.e.d.AbstractC0047d.a b(String str) {
            Objects.requireNonNull(str, "Null content");
            this.a = str;
            return this;
        }
    }

    private t(String str) {
        this.a = str;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.e.d.AbstractC0047d
    public String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.AbstractC0047d) {
            return this.a.equals(((a0.e.d.AbstractC0047d) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.a + "}";
    }
}

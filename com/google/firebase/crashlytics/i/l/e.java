package com.google.firebase.crashlytics.i.l;

import com.google.firebase.crashlytics.i.l.a0;
import java.util.Objects;
/* loaded from: classes.dex */
final class e extends a0.d {
    private final b0<a0.d.b> a;
    private final String b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends a0.d.a {
        private b0<a0.d.b> a;
        private String b;

        @Override // com.google.firebase.crashlytics.i.l.a0.d.a
        public a0.d a() {
            String str = "";
            if (this.a == null) {
                str = str + " files";
            }
            if (str.isEmpty()) {
                return new e(this.a, this.b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.d.a
        public a0.d.a b(b0<a0.d.b> b0Var) {
            Objects.requireNonNull(b0Var, "Null files");
            this.a = b0Var;
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.d.a
        public a0.d.a c(String str) {
            this.b = str;
            return this;
        }
    }

    private e(b0<a0.d.b> b0Var, String str) {
        this.a = b0Var;
        this.b = str;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.d
    public b0<a0.d.b> b() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.d
    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.d)) {
            return false;
        }
        a0.d dVar = (a0.d) obj;
        if (this.a.equals(dVar.b())) {
            String str = this.b;
            String c = dVar.c();
            if (str == null) {
                if (c == null) {
                    return true;
                }
            } else if (str.equals(c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FilesPayload{files=" + this.a + ", orgId=" + this.b + "}";
    }
}

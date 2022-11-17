package com.google.firebase.crashlytics.i.l;

import com.google.firebase.crashlytics.i.l.a0;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
final class f extends a0.d.b {
    private final String a;
    private final byte[] b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends a0.d.b.a {
        private String a;
        private byte[] b;

        @Override // com.google.firebase.crashlytics.i.l.a0.d.b.a
        public a0.d.b a() {
            String str = "";
            if (this.a == null) {
                str = str + " filename";
            }
            if (this.b == null) {
                str = str + " contents";
            }
            if (str.isEmpty()) {
                return new f(this.a, this.b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.d.b.a
        public a0.d.b.a b(byte[] bArr) {
            Objects.requireNonNull(bArr, "Null contents");
            this.b = bArr;
            return this;
        }

        @Override // com.google.firebase.crashlytics.i.l.a0.d.b.a
        public a0.d.b.a c(String str) {
            Objects.requireNonNull(str, "Null filename");
            this.a = str;
            return this;
        }
    }

    private f(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.d.b
    public byte[] b() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.i.l.a0.d.b
    public String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.d.b)) {
            return false;
        }
        a0.d.b bVar = (a0.d.b) obj;
        if (this.a.equals(bVar.c())) {
            if (Arrays.equals(this.b, bVar instanceof f ? ((f) bVar).b : bVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        return "File{filename=" + this.a + ", contents=" + Arrays.toString(this.b) + "}";
    }
}

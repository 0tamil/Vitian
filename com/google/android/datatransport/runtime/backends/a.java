package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.f;
import f.b.a.a.i.j;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
final class a extends f {
    private final Iterable<j> a;
    private final byte[] b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends f.a {
        private Iterable<j> a;
        private byte[] b;

        @Override // com.google.android.datatransport.runtime.backends.f.a
        public f a() {
            String str = "";
            if (this.a == null) {
                str = str + " events";
            }
            if (str.isEmpty()) {
                return new a(this.a, this.b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.backends.f.a
        public f.a b(Iterable<j> iterable) {
            Objects.requireNonNull(iterable, "Null events");
            this.a = iterable;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.backends.f.a
        public f.a c(byte[] bArr) {
            this.b = bArr;
            return this;
        }
    }

    private a(Iterable<j> iterable, byte[] bArr) {
        this.a = iterable;
        this.b = bArr;
    }

    @Override // com.google.android.datatransport.runtime.backends.f
    public Iterable<j> b() {
        return this.a;
    }

    @Override // com.google.android.datatransport.runtime.backends.f
    public byte[] c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.a.equals(fVar.b())) {
            if (Arrays.equals(this.b, fVar instanceof a ? ((a) fVar).b : fVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.a + ", extras=" + Arrays.toString(this.b) + "}";
    }
}

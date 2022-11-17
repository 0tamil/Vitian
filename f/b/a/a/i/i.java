package f.b.a.a.i;

import f.b.a.a.b;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public final class i {
    private final b a;
    private final byte[] b;

    public i(b bVar, byte[] bArr) {
        Objects.requireNonNull(bVar, "encoding is null");
        Objects.requireNonNull(bArr, "bytes is null");
        this.a = bVar;
        this.b = bArr;
    }

    public byte[] a() {
        return this.b;
    }

    public b b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!this.a.equals(iVar.a)) {
            return false;
        }
        return Arrays.equals(this.b, iVar.b);
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}

package f.b.a.a;

import java.util.Objects;
/* loaded from: classes.dex */
public final class b {
    private final String a;

    private b(String str) {
        Objects.requireNonNull(str, "name is null");
        this.a = str;
    }

    public static b b(String str) {
        return new b(str);
    }

    public String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.a.equals(((b) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.a + "\"}";
    }
}

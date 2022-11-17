package f.b.c;

import f.b.c.z.h;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class n extends k {
    private final h<String, k> a = new h<>();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof n) && ((n) obj).a.equals(this.a));
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public void p(String str, k kVar) {
        h<String, k> hVar = this.a;
        if (kVar == null) {
            kVar = m.a;
        }
        hVar.put(str, kVar);
    }

    public Set<Map.Entry<String, k>> q() {
        return this.a.entrySet();
    }

    public boolean r(String str) {
        return this.a.containsKey(str);
    }

    public k s(String str) {
        return this.a.remove(str);
    }
}

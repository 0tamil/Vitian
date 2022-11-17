package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class s {
    private final HashMap<String, q> a = new HashMap<>();

    public final void a() {
        for (q qVar : this.a.values()) {
            qVar.a();
        }
        this.a.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final q b(String str) {
        return this.a.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set<String> c() {
        return new HashSet(this.a.keySet());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(String str, q qVar) {
        q put = this.a.put(str, qVar);
        if (put != null) {
            put.d();
        }
    }
}

package k.a.a.y;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k.a.a.w.d;
/* loaded from: classes.dex */
public abstract class i {
    private static final CopyOnWriteArrayList<i> a = new CopyOnWriteArrayList<>();
    private static final ConcurrentMap<String, i> b = new ConcurrentHashMap(512, 0.75f, 2);

    static {
        h.a();
    }

    public static Set<String> a() {
        return Collections.unmodifiableSet(b.keySet());
    }

    private static i b(String str) {
        ConcurrentMap<String, i> concurrentMap = b;
        i iVar = concurrentMap.get(str);
        if (iVar != null) {
            return iVar;
        }
        if (concurrentMap.isEmpty()) {
            throw new g("No time-zone data files registered");
        }
        throw new g("Unknown time-zone ID: " + str);
    }

    public static f c(String str, boolean z) {
        d.i(str, "zoneId");
        return b(str).d(str, z);
    }

    public static void f(i iVar) {
        d.i(iVar, "provider");
        g(iVar);
        a.add(iVar);
    }

    private static void g(i iVar) {
        for (String str : iVar.e()) {
            d.i(str, "zoneId");
            if (b.putIfAbsent(str, iVar) != null) {
                throw new g("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + iVar);
            }
        }
    }

    protected abstract f d(String str, boolean z);

    protected abstract Set<String> e();
}

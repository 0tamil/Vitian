package kotlinx.coroutines.internal;

import j.b0.b;
import j.b0.f;
import j.b0.h;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.x1;
/* loaded from: classes.dex */
public final class r {
    public static final r a;
    private static final boolean b = a0.e("kotlinx.coroutines.fast.service.loader", true);
    public static final x1 c;

    static {
        r rVar = new r();
        a = rVar;
        c = rVar.a();
    }

    private r() {
    }

    private final x1 a() {
        List<MainDispatcherFactory> list;
        Object obj;
        b a2;
        try {
            if (b) {
                list = j.a.c();
            } else {
                a2 = f.a(a.b());
                list = h.e(a2);
            }
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                obj = null;
            } else {
                obj = it.next();
                if (it.hasNext()) {
                    int loadPriority = ((MainDispatcherFactory) obj).getLoadPriority();
                    do {
                        Object next = it.next();
                        int loadPriority2 = ((MainDispatcherFactory) next).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            obj = next;
                            loadPriority = loadPriority2;
                        }
                    } while (it.hasNext());
                }
            }
            MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) obj;
            return mainDispatcherFactory == null ? s.b(null, null, 3, null) : s.d(mainDispatcherFactory, list);
        } catch (Throwable th) {
            return s.b(th, null, 2, null);
        }
    }
}

package j.b0;

import j.x.c.l;
import j.x.d.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class h extends g {
    public static <T, R> b<R> c(b<? extends T> bVar, l<? super T, ? extends R> lVar) {
        i.d(bVar, "<this>");
        i.d(lVar, "transform");
        return new i(bVar, lVar);
    }

    public static final <T, C extends Collection<? super T>> C d(b<? extends T> bVar, C c) {
        i.d(bVar, "<this>");
        i.d(c, "destination");
        for (T t : bVar) {
            c.add(t);
        }
        return c;
    }

    public static <T> List<T> e(b<? extends T> bVar) {
        List<T> e2;
        i.d(bVar, "<this>");
        e2 = j.s.i.e(f(bVar));
        return e2;
    }

    public static final <T> List<T> f(b<? extends T> bVar) {
        i.d(bVar, "<this>");
        ArrayList arrayList = new ArrayList();
        d(bVar, arrayList);
        return arrayList;
    }
}

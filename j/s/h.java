package j.s;

import j.x.d.i;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
class h {
    public static final <T> List<T> a(T t) {
        List<T> singletonList = Collections.singletonList(t);
        i.c(singletonList, "singletonList(element)");
        return singletonList;
    }
}

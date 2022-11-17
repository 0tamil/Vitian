package j.s;

import j.x.d.i;
import java.util.Collections;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c0 {
    public static final <T> Set<T> a(T t) {
        Set<T> singleton = Collections.singleton(t);
        i.c(singleton, "singleton(element)");
        return singleton;
    }
}

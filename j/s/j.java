package j.s;

import j.x.d.i;
import java.util.Collection;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class j extends i {
    public static <T> int g(Iterable<? extends T> iterable, int i2) {
        i.d(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i2;
    }
}

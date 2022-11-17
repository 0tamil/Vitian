package j.s;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class i extends h {
    public static <T> List<T> b() {
        return s.f3451e;
    }

    public static <T> int c(List<? extends T> list) {
        j.x.d.i.d(list, "<this>");
        return list.size() - 1;
    }

    public static <T> List<T> d(T... tArr) {
        List<T> b;
        List<T> a;
        j.x.d.i.d(tArr, "elements");
        if (tArr.length > 0) {
            a = d.a(tArr);
            return a;
        }
        b = b();
        return b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> e(List<? extends T> list) {
        List<T> b;
        j.x.d.i.d(list, "<this>");
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : h.a(list.get(0));
        }
        b = b();
        return b;
    }

    public static void f() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}

package j.s;

import j.x.d.i;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
/* loaded from: classes.dex */
public class d extends c {
    public static <T> List<T> a(T[] tArr) {
        i.d(tArr, "<this>");
        List<T> a = f.a(tArr);
        i.c(a, "asList(this)");
        return a;
    }

    public static final <T> T[] b(T[] tArr, T[] tArr2, int i2, int i3, int i4) {
        i.d(tArr, "<this>");
        i.d(tArr2, "destination");
        System.arraycopy(tArr, i3, tArr2, i2, i4 - i3);
        return tArr2;
    }

    public static /* synthetic */ Object[] c(Object[] objArr, Object[] objArr2, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = objArr.length;
        }
        b(objArr, objArr2, i2, i3, i4);
        return objArr2;
    }

    public static <T> void d(T[] tArr, T t, int i2, int i3) {
        i.d(tArr, "<this>");
        Arrays.fill(tArr, i2, i3, t);
    }

    public static /* synthetic */ void e(Object[] objArr, Object obj, int i2, int i3, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = objArr.length;
        }
        d(objArr, obj, i2, i3);
    }

    public static final <T> void f(T[] tArr, Comparator<? super T> comparator) {
        i.d(tArr, "<this>");
        i.d(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }
}

package j.s;

import j.x.d.i;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class e extends d {
    public static <T> T g(T[] tArr) {
        i.d(tArr, "<this>");
        if (!(tArr.length == 0)) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static char h(char[] cArr) {
        i.d(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    public static <T> T i(T[] tArr) {
        i.d(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static final <T> T[] j(T[] tArr, Comparator<? super T> comparator) {
        i.d(tArr, "<this>");
        i.d(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        i.c(tArr2, "copyOf(this, size)");
        d.f(tArr2, comparator);
        return tArr2;
    }

    public static <T> List<T> k(T[] tArr, Comparator<? super T> comparator) {
        List<T> a;
        i.d(tArr, "<this>");
        i.d(comparator, "comparator");
        a = d.a(j(tArr, comparator));
        return a;
    }
}

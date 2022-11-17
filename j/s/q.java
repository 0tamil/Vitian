package j.s;

import j.c0.e;
import j.x.c.l;
import j.x.d.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
/* loaded from: classes.dex */
public class q extends p {
    public static final <T, A extends Appendable> A i(Iterable<? extends T> iterable, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, l<? super T, ? extends CharSequence> lVar) {
        i.d(iterable, "<this>");
        i.d(a, "buffer");
        i.d(charSequence, "separator");
        i.d(charSequence2, "prefix");
        i.d(charSequence3, "postfix");
        i.d(charSequence4, "truncated");
        a.append(charSequence2);
        int i3 = 0;
        for (T t : iterable) {
            i3++;
            if (i3 > 1) {
                a.append(charSequence);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            e.a(a, t, lVar);
        }
        if (i2 >= 0 && i3 > i2) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    public static /* synthetic */ Appendable j(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, l lVar, int i3, Object obj) {
        String str = (i3 & 2) != 0 ? ", " : charSequence;
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i3 & 4) != 0 ? charSequence5 : charSequence2;
        if ((i3 & 8) == 0) {
            charSequence5 = charSequence3;
        }
        i(iterable, appendable, str, charSequence6, charSequence5, (i3 & 16) != 0 ? -1 : i2, (i3 & 32) != 0 ? "..." : charSequence4, (i3 & 64) != 0 ? null : lVar);
        return appendable;
    }

    public static final <T> String k(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, l<? super T, ? extends CharSequence> lVar) {
        i.d(iterable, "<this>");
        i.d(charSequence, "separator");
        i.d(charSequence2, "prefix");
        i.d(charSequence3, "postfix");
        i.d(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        i(iterable, sb, charSequence, charSequence2, charSequence3, i2, charSequence4, lVar);
        String sb2 = sb.toString();
        i.c(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static /* synthetic */ String l(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, l lVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i3 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i3 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        int i4 = (i3 & 8) != 0 ? -1 : i2;
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i3 & 32) != 0) {
            lVar = null;
        }
        return k(iterable, charSequence, charSequence6, charSequence5, i4, charSequence7, lVar);
    }

    public static <T extends Comparable<? super T>> T m(Iterable<? extends T> iterable) {
        i.d(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static <T> T n(Iterable<? extends T> iterable) {
        i.d(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) o((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T o(List<? extends T> list) {
        i.d(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        } else if (size == 1) {
            return list.get(0);
        } else {
            throw new IllegalArgumentException("List has more than one element.");
        }
    }

    public static final <T, C extends Collection<? super T>> C p(Iterable<? extends T> iterable, C c) {
        i.d(iterable, "<this>");
        i.d(c, "destination");
        for (T t : iterable) {
            c.add(t);
        }
        return c;
    }

    public static <T> List<T> q(Iterable<? extends T> iterable) {
        List<T> e2;
        List<T> b;
        i.d(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                b = i.b();
                return b;
            } else if (size != 1) {
                return s(collection);
            } else {
                return h.a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
            }
        } else {
            e2 = i.e(r(iterable));
            return e2;
        }
    }

    public static final <T> List<T> r(Iterable<? extends T> iterable) {
        i.d(iterable, "<this>");
        if (iterable instanceof Collection) {
            return s((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        p(iterable, arrayList);
        return arrayList;
    }

    public static final <T> List<T> s(Collection<? extends T> collection) {
        i.d(collection, "<this>");
        return new ArrayList(collection);
    }

    public static <T> Set<T> t(Iterable<? extends T> iterable) {
        Set<T> b;
        int a;
        i.d(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                b = d0.b();
                return b;
            } else if (size != 1) {
                a = y.a(collection.size());
                LinkedHashSet linkedHashSet = new LinkedHashSet(a);
                p(iterable, linkedHashSet);
                return linkedHashSet;
            } else {
                return c0.a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            p(iterable, linkedHashSet2);
            return d0.c(linkedHashSet2);
        }
    }
}

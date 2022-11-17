package e.c;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class b<E> implements Collection<E>, Set<E> {

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f2014i = new int[0];

    /* renamed from: j  reason: collision with root package name */
    private static final Object[] f2015j = new Object[0];

    /* renamed from: k  reason: collision with root package name */
    private static Object[] f2016k;
    private static int l;
    private static Object[] m;
    private static int n;

    /* renamed from: e  reason: collision with root package name */
    private int[] f2017e;

    /* renamed from: f  reason: collision with root package name */
    Object[] f2018f;

    /* renamed from: g  reason: collision with root package name */
    int f2019g;

    /* renamed from: h  reason: collision with root package name */
    private f<E, E> f2020h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends f<E, E> {
        a() {
        }

        @Override // e.c.f
        protected void a() {
            b.this.clear();
        }

        @Override // e.c.f
        protected Object b(int i2, int i3) {
            return b.this.f2018f[i2];
        }

        @Override // e.c.f
        protected Map<E, E> c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // e.c.f
        protected int d() {
            return b.this.f2019g;
        }

        @Override // e.c.f
        protected int e(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // e.c.f
        protected int f(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // e.c.f
        protected void g(E e2, E e3) {
            b.this.add(e2);
        }

        @Override // e.c.f
        protected void h(int i2) {
            b.this.n(i2);
        }

        @Override // e.c.f
        protected E i(int i2, E e2) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public b() {
        this(0);
    }

    public b(int i2) {
        if (i2 == 0) {
            this.f2017e = f2014i;
            this.f2018f = f2015j;
        } else {
            h(i2);
        }
        this.f2019g = 0;
    }

    private void h(int i2) {
        if (i2 == 8) {
            synchronized (b.class) {
                Object[] objArr = m;
                if (objArr != null) {
                    this.f2018f = objArr;
                    m = (Object[]) objArr[0];
                    this.f2017e = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    n--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (b.class) {
                Object[] objArr2 = f2016k;
                if (objArr2 != null) {
                    this.f2018f = objArr2;
                    f2016k = (Object[]) objArr2[0];
                    this.f2017e = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    l--;
                    return;
                }
            }
        }
        this.f2017e = new int[i2];
        this.f2018f = new Object[i2];
    }

    private static void j(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                if (n < 10) {
                    objArr[0] = m;
                    objArr[1] = iArr;
                    for (int i3 = i2 - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    m = objArr;
                    n++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (b.class) {
                if (l < 10) {
                    objArr[0] = f2016k;
                    objArr[1] = iArr;
                    for (int i4 = i2 - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f2016k = objArr;
                    l++;
                }
            }
        }
    }

    private f<E, E> k() {
        if (this.f2020h == null) {
            this.f2020h = new a();
        }
        return this.f2020h;
    }

    private int l(Object obj, int i2) {
        int i3 = this.f2019g;
        if (i3 == 0) {
            return -1;
        }
        int a2 = c.a(this.f2017e, i3, i2);
        if (a2 < 0 || obj.equals(this.f2018f[a2])) {
            return a2;
        }
        int i4 = a2 + 1;
        while (i4 < i3 && this.f2017e[i4] == i2) {
            if (obj.equals(this.f2018f[i4])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = a2 - 1; i5 >= 0 && this.f2017e[i5] == i2; i5--) {
            if (obj.equals(this.f2018f[i5])) {
                return i5;
            }
        }
        return ~i4;
    }

    private int m() {
        int i2 = this.f2019g;
        if (i2 == 0) {
            return -1;
        }
        int a2 = c.a(this.f2017e, i2, 0);
        if (a2 < 0 || this.f2018f[a2] == null) {
            return a2;
        }
        int i3 = a2 + 1;
        while (i3 < i2 && this.f2017e[i3] == 0) {
            if (this.f2018f[i3] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = a2 - 1; i4 >= 0 && this.f2017e[i4] == 0; i4--) {
            if (this.f2018f[i4] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e2) {
        int i2;
        int i3;
        if (e2 == null) {
            i3 = m();
            i2 = 0;
        } else {
            int hashCode = e2.hashCode();
            i3 = l(e2, hashCode);
            i2 = hashCode;
        }
        if (i3 >= 0) {
            return false;
        }
        int i4 = ~i3;
        int i5 = this.f2019g;
        int[] iArr = this.f2017e;
        if (i5 >= iArr.length) {
            int i6 = 4;
            if (i5 >= 8) {
                i6 = (i5 >> 1) + i5;
            } else if (i5 >= 4) {
                i6 = 8;
            }
            Object[] objArr = this.f2018f;
            h(i6);
            int[] iArr2 = this.f2017e;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f2018f, 0, objArr.length);
            }
            j(iArr, objArr, this.f2019g);
        }
        int i7 = this.f2019g;
        if (i4 < i7) {
            int[] iArr3 = this.f2017e;
            int i8 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i8, i7 - i4);
            Object[] objArr2 = this.f2018f;
            System.arraycopy(objArr2, i4, objArr2, i8, this.f2019g - i4);
        }
        this.f2017e[i4] = i2;
        this.f2018f[i4] = e2;
        this.f2019g++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        i(this.f2019g + collection.size());
        boolean z = false;
        for (E e2 : collection) {
            z |= add(e2);
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i2 = this.f2019g;
        if (i2 != 0) {
            j(this.f2017e, this.f2018f, i2);
            this.f2017e = f2014i;
            this.f2018f = f2015j;
            this.f2019g = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f2019g; i2++) {
                try {
                    if (!set.contains(o(i2))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f2017e;
        int i2 = this.f2019g;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public void i(int i2) {
        int[] iArr = this.f2017e;
        if (iArr.length < i2) {
            Object[] objArr = this.f2018f;
            h(i2);
            int i3 = this.f2019g;
            if (i3 > 0) {
                System.arraycopy(iArr, 0, this.f2017e, 0, i3);
                System.arraycopy(objArr, 0, this.f2018f, 0, this.f2019g);
            }
            j(iArr, objArr, this.f2019g);
        }
    }

    public int indexOf(Object obj) {
        return obj == null ? m() : l(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f2019g <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return k().m().iterator();
    }

    public E n(int i2) {
        Object[] objArr = this.f2018f;
        E e2 = (E) objArr[i2];
        int i3 = this.f2019g;
        if (i3 <= 1) {
            j(this.f2017e, objArr, i3);
            this.f2017e = f2014i;
            this.f2018f = f2015j;
            this.f2019g = 0;
        } else {
            int[] iArr = this.f2017e;
            int i4 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                int i5 = i3 - 1;
                this.f2019g = i5;
                if (i2 < i5) {
                    int i6 = i2 + 1;
                    System.arraycopy(iArr, i6, iArr, i2, i5 - i2);
                    Object[] objArr2 = this.f2018f;
                    System.arraycopy(objArr2, i6, objArr2, i2, this.f2019g - i2);
                }
                this.f2018f[this.f2019g] = null;
            } else {
                if (i3 > 8) {
                    i4 = i3 + (i3 >> 1);
                }
                h(i4);
                this.f2019g--;
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.f2017e, 0, i2);
                    System.arraycopy(objArr, 0, this.f2018f, 0, i2);
                }
                int i7 = this.f2019g;
                if (i2 < i7) {
                    int i8 = i2 + 1;
                    System.arraycopy(iArr, i8, this.f2017e, i2, i7 - i2);
                    System.arraycopy(objArr, i8, this.f2018f, i2, this.f2019g - i2);
                }
            }
        }
        return e2;
    }

    public E o(int i2) {
        return (E) this.f2018f[i2];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        n(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i2 = this.f2019g - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f2018f[i2])) {
                n(i2);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f2019g;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i2 = this.f2019g;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.f2018f, 0, objArr, 0, i2);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f2019g) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f2019g));
        }
        System.arraycopy(this.f2018f, 0, tArr, 0, this.f2019g);
        int length = tArr.length;
        int i2 = this.f2019g;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2019g * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.f2019g; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            E o = o(i2);
            if (o != this) {
                sb.append(o);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}

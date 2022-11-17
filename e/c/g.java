package e.c;

import java.util.ConcurrentModificationException;
import java.util.Map;
/* loaded from: classes.dex */
public class g<K, V> {

    /* renamed from: h  reason: collision with root package name */
    static Object[] f2044h;

    /* renamed from: i  reason: collision with root package name */
    static int f2045i;

    /* renamed from: j  reason: collision with root package name */
    static Object[] f2046j;

    /* renamed from: k  reason: collision with root package name */
    static int f2047k;

    /* renamed from: e  reason: collision with root package name */
    int[] f2048e;

    /* renamed from: f  reason: collision with root package name */
    Object[] f2049f;

    /* renamed from: g  reason: collision with root package name */
    int f2050g;

    public g() {
        this.f2048e = c.a;
        this.f2049f = c.c;
        this.f2050g = 0;
    }

    public g(int i2) {
        if (i2 == 0) {
            this.f2048e = c.a;
            this.f2049f = c.c;
        } else {
            a(i2);
        }
        this.f2050g = 0;
    }

    private void a(int i2) {
        if (i2 == 8) {
            synchronized (g.class) {
                Object[] objArr = f2046j;
                if (objArr != null) {
                    this.f2049f = objArr;
                    f2046j = (Object[]) objArr[0];
                    this.f2048e = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f2047k--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (g.class) {
                Object[] objArr2 = f2044h;
                if (objArr2 != null) {
                    this.f2049f = objArr2;
                    f2044h = (Object[]) objArr2[0];
                    this.f2048e = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f2045i--;
                    return;
                }
            }
        }
        this.f2048e = new int[i2];
        this.f2049f = new Object[i2 << 1];
    }

    private static int b(int[] iArr, int i2, int i3) {
        try {
            return c.a(iArr, i2, i3);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void d(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (g.class) {
                if (f2047k < 10) {
                    objArr[0] = f2046j;
                    objArr[1] = iArr;
                    for (int i3 = (i2 << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f2046j = objArr;
                    f2047k++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (g.class) {
                if (f2045i < 10) {
                    objArr[0] = f2044h;
                    objArr[1] = iArr;
                    for (int i4 = (i2 << 1) - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f2044h = objArr;
                    f2045i++;
                }
            }
        }
    }

    public void c(int i2) {
        int i3 = this.f2050g;
        int[] iArr = this.f2048e;
        if (iArr.length < i2) {
            Object[] objArr = this.f2049f;
            a(i2);
            if (this.f2050g > 0) {
                System.arraycopy(iArr, 0, this.f2048e, 0, i3);
                System.arraycopy(objArr, 0, this.f2049f, 0, i3 << 1);
            }
            d(iArr, objArr, i3);
        }
        if (this.f2050g != i3) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i2 = this.f2050g;
        if (i2 > 0) {
            int[] iArr = this.f2048e;
            Object[] objArr = this.f2049f;
            this.f2048e = c.a;
            this.f2049f = c.c;
            this.f2050g = 0;
            d(iArr, objArr, i2);
        }
        if (this.f2050g > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    int e(Object obj, int i2) {
        int i3 = this.f2050g;
        if (i3 == 0) {
            return -1;
        }
        int b = b(this.f2048e, i3, i2);
        if (b < 0 || obj.equals(this.f2049f[b << 1])) {
            return b;
        }
        int i4 = b + 1;
        while (i4 < i3 && this.f2048e[i4] == i2) {
            if (obj.equals(this.f2049f[i4 << 1])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = b - 1; i5 >= 0 && this.f2048e[i5] == i2; i5--) {
            if (obj.equals(this.f2049f[i5 << 1])) {
                return i5;
            }
        }
        return ~i4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (size() != gVar.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f2050g; i2++) {
                try {
                    K i3 = i(i2);
                    V l = l(i2);
                    Object obj2 = gVar.get(i3);
                    if (l == null) {
                        if (obj2 != null || !gVar.containsKey(i3)) {
                            return false;
                        }
                    } else if (!l.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i4 = 0; i4 < this.f2050g; i4++) {
                try {
                    K i5 = i(i4);
                    V l2 = l(i4);
                    Object obj3 = map.get(i5);
                    if (l2 == null) {
                        if (obj3 != null || !map.containsKey(i5)) {
                            return false;
                        }
                    } else if (!l2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f(Object obj) {
        return obj == null ? g() : e(obj, obj.hashCode());
    }

    int g() {
        int i2 = this.f2050g;
        if (i2 == 0) {
            return -1;
        }
        int b = b(this.f2048e, i2, 0);
        if (b < 0 || this.f2049f[b << 1] == null) {
            return b;
        }
        int i3 = b + 1;
        while (i3 < i2 && this.f2048e[i3] == 0) {
            if (this.f2049f[i3 << 1] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = b - 1; i4 >= 0 && this.f2048e[i4] == 0; i4--) {
            if (this.f2049f[i4 << 1] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int f2 = f(obj);
        return f2 >= 0 ? (V) this.f2049f[(f2 << 1) + 1] : v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h(Object obj) {
        int i2 = this.f2050g * 2;
        Object[] objArr = this.f2049f;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.f2048e;
        Object[] objArr = this.f2049f;
        int i2 = this.f2050g;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            i5 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i4];
            i4++;
            i3 += 2;
        }
        return i5;
    }

    public K i(int i2) {
        return (K) this.f2049f[i2 << 1];
    }

    public boolean isEmpty() {
        return this.f2050g <= 0;
    }

    public V j(int i2) {
        Object[] objArr = this.f2049f;
        int i3 = i2 << 1;
        V v = (V) objArr[i3 + 1];
        int i4 = this.f2050g;
        int i5 = 0;
        if (i4 <= 1) {
            d(this.f2048e, objArr, i4);
            this.f2048e = c.a;
            this.f2049f = c.c;
        } else {
            int i6 = i4 - 1;
            int[] iArr = this.f2048e;
            int i7 = 8;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i2 < i6) {
                    int i8 = i2 + 1;
                    int i9 = i6 - i2;
                    System.arraycopy(iArr, i8, iArr, i2, i9);
                    Object[] objArr2 = this.f2049f;
                    System.arraycopy(objArr2, i8 << 1, objArr2, i3, i9 << 1);
                }
                Object[] objArr3 = this.f2049f;
                int i10 = i6 << 1;
                objArr3[i10] = null;
                objArr3[i10 + 1] = null;
            } else {
                if (i4 > 8) {
                    i7 = i4 + (i4 >> 1);
                }
                a(i7);
                if (i4 == this.f2050g) {
                    if (i2 > 0) {
                        System.arraycopy(iArr, 0, this.f2048e, 0, i2);
                        System.arraycopy(objArr, 0, this.f2049f, 0, i3);
                    }
                    if (i2 < i6) {
                        int i11 = i2 + 1;
                        int i12 = i6 - i2;
                        System.arraycopy(iArr, i11, this.f2048e, i2, i12);
                        System.arraycopy(objArr, i11 << 1, this.f2049f, i3, i12 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i5 = i6;
        }
        if (i4 == this.f2050g) {
            this.f2050g = i5;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public V k(int i2, V v) {
        int i3 = (i2 << 1) + 1;
        Object[] objArr = this.f2049f;
        V v2 = (V) objArr[i3];
        objArr[i3] = v;
        return v2;
    }

    public V l(int i2) {
        return (V) this.f2049f[(i2 << 1) + 1];
    }

    public V put(K k2, V v) {
        int i2;
        int i3;
        int i4 = this.f2050g;
        if (k2 == null) {
            i3 = g();
            i2 = 0;
        } else {
            int hashCode = k2.hashCode();
            i3 = e(k2, hashCode);
            i2 = hashCode;
        }
        if (i3 >= 0) {
            int i5 = (i3 << 1) + 1;
            Object[] objArr = this.f2049f;
            V v2 = (V) objArr[i5];
            objArr[i5] = v;
            return v2;
        }
        int i6 = ~i3;
        int[] iArr = this.f2048e;
        if (i4 >= iArr.length) {
            int i7 = 4;
            if (i4 >= 8) {
                i7 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i7 = 8;
            }
            Object[] objArr2 = this.f2049f;
            a(i7);
            if (i4 == this.f2050g) {
                int[] iArr2 = this.f2048e;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f2049f, 0, objArr2.length);
                }
                d(iArr, objArr2, i4);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i6 < i4) {
            int[] iArr3 = this.f2048e;
            int i8 = i6 + 1;
            System.arraycopy(iArr3, i6, iArr3, i8, i4 - i6);
            Object[] objArr3 = this.f2049f;
            System.arraycopy(objArr3, i6 << 1, objArr3, i8 << 1, (this.f2050g - i6) << 1);
        }
        int i9 = this.f2050g;
        if (i4 == i9) {
            int[] iArr4 = this.f2048e;
            if (i6 < iArr4.length) {
                iArr4[i6] = i2;
                Object[] objArr4 = this.f2049f;
                int i10 = i6 << 1;
                objArr4[i10] = k2;
                objArr4[i10 + 1] = v;
                this.f2050g = i9 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k2, V v) {
        V v2 = get(k2);
        return v2 == null ? put(k2, v) : v2;
    }

    public V remove(Object obj) {
        int f2 = f(obj);
        if (f2 >= 0) {
            return j(f2);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int f2 = f(obj);
        if (f2 < 0) {
            return false;
        }
        V l = l(f2);
        if (obj2 != l && (obj2 == null || !obj2.equals(l))) {
            return false;
        }
        j(f2);
        return true;
    }

    public V replace(K k2, V v) {
        int f2 = f(k2);
        if (f2 >= 0) {
            return k(f2, v);
        }
        return null;
    }

    public boolean replace(K k2, V v, V v2) {
        int f2 = f(k2);
        if (f2 < 0) {
            return false;
        }
        V l = l(f2);
        if (l != v && (v == null || !v.equals(l))) {
            return false;
        }
        k(f2, v2);
        return true;
    }

    public int size() {
        return this.f2050g;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2050g * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f2050g; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            K i3 = i(i2);
            if (i3 != this) {
                sb.append(i3);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V l = l(i2);
            if (l != this) {
                sb.append(l);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}

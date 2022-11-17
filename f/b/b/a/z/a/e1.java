package f.b.b.a.z.a;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e1<E> extends c<E> implements RandomAccess {

    /* renamed from: h  reason: collision with root package name */
    private static final e1<Object> f2513h;

    /* renamed from: f  reason: collision with root package name */
    private E[] f2514f;

    /* renamed from: g  reason: collision with root package name */
    private int f2515g;

    static {
        e1<Object> e1Var = new e1<>(new Object[0], 0);
        f2513h = e1Var;
        e1Var.b();
    }

    private e1(E[] eArr, int i2) {
        this.f2514f = eArr;
        this.f2515g = i2;
    }

    private static <E> E[] i(int i2) {
        return (E[]) new Object[i2];
    }

    public static <E> e1<E> j() {
        return (e1<E>) f2513h;
    }

    private void k(int i2) {
        if (i2 < 0 || i2 >= this.f2515g) {
            throw new IndexOutOfBoundsException(l(i2));
        }
    }

    private String l(int i2) {
        return "Index:" + i2 + ", Size:" + this.f2515g;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i2, E e2) {
        int i3;
        h();
        if (i2 < 0 || i2 > (i3 = this.f2515g)) {
            throw new IndexOutOfBoundsException(l(i2));
        }
        E[] eArr = this.f2514f;
        if (i3 < eArr.length) {
            System.arraycopy(eArr, i2, eArr, i2 + 1, i3 - i2);
        } else {
            E[] eArr2 = (E[]) i(((i3 * 3) / 2) + 1);
            System.arraycopy(this.f2514f, 0, eArr2, 0, i2);
            System.arraycopy(this.f2514f, i2, eArr2, i2 + 1, this.f2515g - i2);
            this.f2514f = eArr2;
        }
        this.f2514f[i2] = e2;
        this.f2515g++;
        ((AbstractList) this).modCount++;
    }

    @Override // f.b.b.a.z.a.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e2) {
        h();
        int i2 = this.f2515g;
        E[] eArr = this.f2514f;
        if (i2 == eArr.length) {
            this.f2514f = (E[]) Arrays.copyOf(eArr, ((i2 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f2514f;
        int i3 = this.f2515g;
        this.f2515g = i3 + 1;
        eArr2[i3] = e2;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i2) {
        k(i2);
        return this.f2514f[i2];
    }

    /* renamed from: m */
    public e1<E> d(int i2) {
        if (i2 >= this.f2515g) {
            return new e1<>(Arrays.copyOf(this.f2514f, i2), this.f2515g);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i2) {
        int i3;
        h();
        k(i2);
        E[] eArr = this.f2514f;
        E e2 = eArr[i2];
        if (i2 < this.f2515g - 1) {
            System.arraycopy(eArr, i2 + 1, eArr, i2, (i3 - i2) - 1);
        }
        this.f2515g--;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i2, E e2) {
        h();
        k(i2);
        E[] eArr = this.f2514f;
        E e3 = eArr[i2];
        eArr[i2] = e2;
        ((AbstractList) this).modCount++;
        return e3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f2515g;
    }
}

package f.b.b.a.z.a;

import f.b.b.a.z.a.b0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a0 extends c<Integer> implements b0.g, RandomAccess, b1 {

    /* renamed from: h  reason: collision with root package name */
    private static final a0 f2494h;

    /* renamed from: f  reason: collision with root package name */
    private int[] f2495f;

    /* renamed from: g  reason: collision with root package name */
    private int f2496g;

    static {
        a0 a0Var = new a0(new int[0], 0);
        f2494h = a0Var;
        a0Var.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0() {
        this(new int[10], 0);
    }

    private a0(int[] iArr, int i2) {
        this.f2495f = iArr;
        this.f2496g = i2;
    }

    private void l(int i2, int i3) {
        int i4;
        h();
        if (i2 < 0 || i2 > (i4 = this.f2496g)) {
            throw new IndexOutOfBoundsException(p(i2));
        }
        int[] iArr = this.f2495f;
        if (i4 < iArr.length) {
            System.arraycopy(iArr, i2, iArr, i2 + 1, i4 - i2);
        } else {
            int[] iArr2 = new int[((i4 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.f2495f, i2, iArr2, i2 + 1, this.f2496g - i2);
            this.f2495f = iArr2;
        }
        this.f2495f[i2] = i3;
        this.f2496g++;
        ((AbstractList) this).modCount++;
    }

    private void m(int i2) {
        if (i2 < 0 || i2 >= this.f2496g) {
            throw new IndexOutOfBoundsException(p(i2));
        }
    }

    private String p(int i2) {
        return "Index:" + i2 + ", Size:" + this.f2496g;
    }

    @Override // f.b.b.a.z.a.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        h();
        b0.a(collection);
        if (!(collection instanceof a0)) {
            return super.addAll(collection);
        }
        a0 a0Var = (a0) collection;
        int i2 = a0Var.f2496g;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f2496g;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            int[] iArr = this.f2495f;
            if (i4 > iArr.length) {
                this.f2495f = Arrays.copyOf(iArr, i4);
            }
            System.arraycopy(a0Var.f2495f, 0, this.f2495f, this.f2496g, a0Var.f2496g);
            this.f2496g = i4;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // f.b.b.a.z.a.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return super.equals(obj);
        }
        a0 a0Var = (a0) obj;
        if (this.f2496g != a0Var.f2496g) {
            return false;
        }
        int[] iArr = a0Var.f2495f;
        for (int i2 = 0; i2 < this.f2496g; i2++) {
            if (this.f2495f[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // f.b.b.a.z.a.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f2496g; i3++) {
            i2 = (i2 * 31) + this.f2495f[i3];
        }
        return i2;
    }

    /* renamed from: i */
    public void add(int i2, Integer num) {
        l(i2, num.intValue());
    }

    /* renamed from: j */
    public boolean add(Integer num) {
        k(num.intValue());
        return true;
    }

    public void k(int i2) {
        h();
        int i3 = this.f2496g;
        int[] iArr = this.f2495f;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[((i3 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f2495f = iArr2;
        }
        int[] iArr3 = this.f2495f;
        int i4 = this.f2496g;
        this.f2496g = i4 + 1;
        iArr3[i4] = i2;
    }

    /* renamed from: n */
    public Integer get(int i2) {
        return Integer.valueOf(o(i2));
    }

    public int o(int i2) {
        m(i2);
        return this.f2495f[i2];
    }

    /* renamed from: q */
    public b0.g d(int i2) {
        if (i2 >= this.f2496g) {
            return new a0(Arrays.copyOf(this.f2495f, i2), this.f2496g);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: r */
    public Integer remove(int i2) {
        int i3;
        h();
        m(i2);
        int[] iArr = this.f2495f;
        int i4 = iArr[i2];
        if (i2 < this.f2496g - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (i3 - i2) - 1);
        }
        this.f2496g--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i4);
    }

    @Override // f.b.b.a.z.a.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        h();
        for (int i2 = 0; i2 < this.f2496g; i2++) {
            if (obj.equals(Integer.valueOf(this.f2495f[i2]))) {
                int[] iArr = this.f2495f;
                System.arraycopy(iArr, i2 + 1, iArr, i2, (this.f2496g - i2) - 1);
                this.f2496g--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i2, int i3) {
        h();
        if (i3 >= i2) {
            int[] iArr = this.f2495f;
            System.arraycopy(iArr, i3, iArr, i2, this.f2496g - i3);
            this.f2496g -= i3 - i2;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public Integer set(int i2, Integer num) {
        return Integer.valueOf(t(i2, num.intValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f2496g;
    }

    public int t(int i2, int i3) {
        h();
        m(i2);
        int[] iArr = this.f2495f;
        int i4 = iArr[i2];
        iArr[i2] = i3;
        return i4;
    }
}

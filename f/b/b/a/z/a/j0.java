package f.b.b.a.z.a;

import f.b.b.a.z.a.b0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j0 extends c<Long> implements b0.h, RandomAccess, b1 {

    /* renamed from: h  reason: collision with root package name */
    private static final j0 f2543h;

    /* renamed from: f  reason: collision with root package name */
    private long[] f2544f;

    /* renamed from: g  reason: collision with root package name */
    private int f2545g;

    static {
        j0 j0Var = new j0(new long[0], 0);
        f2543h = j0Var;
        j0Var.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j0() {
        this(new long[10], 0);
    }

    private j0(long[] jArr, int i2) {
        this.f2544f = jArr;
        this.f2545g = i2;
    }

    private void k(int i2, long j2) {
        int i3;
        h();
        if (i2 < 0 || i2 > (i3 = this.f2545g)) {
            throw new IndexOutOfBoundsException(p(i2));
        }
        long[] jArr = this.f2544f;
        if (i3 < jArr.length) {
            System.arraycopy(jArr, i2, jArr, i2 + 1, i3 - i2);
        } else {
            long[] jArr2 = new long[((i3 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            System.arraycopy(this.f2544f, i2, jArr2, i2 + 1, this.f2545g - i2);
            this.f2544f = jArr2;
        }
        this.f2544f[i2] = j2;
        this.f2545g++;
        ((AbstractList) this).modCount++;
    }

    private void m(int i2) {
        if (i2 < 0 || i2 >= this.f2545g) {
            throw new IndexOutOfBoundsException(p(i2));
        }
    }

    private String p(int i2) {
        return "Index:" + i2 + ", Size:" + this.f2545g;
    }

    @Override // f.b.b.a.z.a.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        h();
        b0.a(collection);
        if (!(collection instanceof j0)) {
            return super.addAll(collection);
        }
        j0 j0Var = (j0) collection;
        int i2 = j0Var.f2545g;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f2545g;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            long[] jArr = this.f2544f;
            if (i4 > jArr.length) {
                this.f2544f = Arrays.copyOf(jArr, i4);
            }
            System.arraycopy(j0Var.f2544f, 0, this.f2544f, this.f2545g, j0Var.f2545g);
            this.f2545g = i4;
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
        if (!(obj instanceof j0)) {
            return super.equals(obj);
        }
        j0 j0Var = (j0) obj;
        if (this.f2545g != j0Var.f2545g) {
            return false;
        }
        long[] jArr = j0Var.f2544f;
        for (int i2 = 0; i2 < this.f2545g; i2++) {
            if (this.f2544f[i2] != jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // f.b.b.a.z.a.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f2545g; i3++) {
            i2 = (i2 * 31) + b0.f(this.f2544f[i3]);
        }
        return i2;
    }

    /* renamed from: i */
    public void add(int i2, Long l) {
        k(i2, l.longValue());
    }

    /* renamed from: j */
    public boolean add(Long l) {
        l(l.longValue());
        return true;
    }

    public void l(long j2) {
        h();
        int i2 = this.f2545g;
        long[] jArr = this.f2544f;
        if (i2 == jArr.length) {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            this.f2544f = jArr2;
        }
        long[] jArr3 = this.f2544f;
        int i3 = this.f2545g;
        this.f2545g = i3 + 1;
        jArr3[i3] = j2;
    }

    /* renamed from: n */
    public Long get(int i2) {
        return Long.valueOf(o(i2));
    }

    public long o(int i2) {
        m(i2);
        return this.f2544f[i2];
    }

    /* renamed from: q */
    public b0.h d(int i2) {
        if (i2 >= this.f2545g) {
            return new j0(Arrays.copyOf(this.f2544f, i2), this.f2545g);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: r */
    public Long remove(int i2) {
        int i3;
        h();
        m(i2);
        long[] jArr = this.f2544f;
        long j2 = jArr[i2];
        if (i2 < this.f2545g - 1) {
            System.arraycopy(jArr, i2 + 1, jArr, i2, (i3 - i2) - 1);
        }
        this.f2545g--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j2);
    }

    @Override // f.b.b.a.z.a.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        h();
        for (int i2 = 0; i2 < this.f2545g; i2++) {
            if (obj.equals(Long.valueOf(this.f2544f[i2]))) {
                long[] jArr = this.f2544f;
                System.arraycopy(jArr, i2 + 1, jArr, i2, (this.f2545g - i2) - 1);
                this.f2545g--;
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
            long[] jArr = this.f2544f;
            System.arraycopy(jArr, i3, jArr, i2, this.f2545g - i3);
            this.f2545g -= i3 - i2;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public Long set(int i2, Long l) {
        return Long.valueOf(t(i2, l.longValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f2545g;
    }

    public long t(int i2, long j2) {
        h();
        m(i2);
        long[] jArr = this.f2544f;
        long j3 = jArr[i2];
        jArr[i2] = j2;
        return j3;
    }
}

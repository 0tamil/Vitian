package f.b.b.a.z.a;

import f.b.b.a.z.a.b0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class n extends c<Double> implements b0.b, RandomAccess, b1 {

    /* renamed from: h  reason: collision with root package name */
    private static final n f2576h;

    /* renamed from: f  reason: collision with root package name */
    private double[] f2577f;

    /* renamed from: g  reason: collision with root package name */
    private int f2578g;

    static {
        n nVar = new n(new double[0], 0);
        f2576h = nVar;
        nVar.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n() {
        this(new double[10], 0);
    }

    private n(double[] dArr, int i2) {
        this.f2577f = dArr;
        this.f2578g = i2;
    }

    private void l(int i2, double d2) {
        int i3;
        h();
        if (i2 < 0 || i2 > (i3 = this.f2578g)) {
            throw new IndexOutOfBoundsException(p(i2));
        }
        double[] dArr = this.f2577f;
        if (i3 < dArr.length) {
            System.arraycopy(dArr, i2, dArr, i2 + 1, i3 - i2);
        } else {
            double[] dArr2 = new double[((i3 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            System.arraycopy(this.f2577f, i2, dArr2, i2 + 1, this.f2578g - i2);
            this.f2577f = dArr2;
        }
        this.f2577f[i2] = d2;
        this.f2578g++;
        ((AbstractList) this).modCount++;
    }

    private void m(int i2) {
        if (i2 < 0 || i2 >= this.f2578g) {
            throw new IndexOutOfBoundsException(p(i2));
        }
    }

    private String p(int i2) {
        return "Index:" + i2 + ", Size:" + this.f2578g;
    }

    @Override // f.b.b.a.z.a.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        h();
        b0.a(collection);
        if (!(collection instanceof n)) {
            return super.addAll(collection);
        }
        n nVar = (n) collection;
        int i2 = nVar.f2578g;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f2578g;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            double[] dArr = this.f2577f;
            if (i4 > dArr.length) {
                this.f2577f = Arrays.copyOf(dArr, i4);
            }
            System.arraycopy(nVar.f2577f, 0, this.f2577f, this.f2578g, nVar.f2578g);
            this.f2578g = i4;
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
        if (!(obj instanceof n)) {
            return super.equals(obj);
        }
        n nVar = (n) obj;
        if (this.f2578g != nVar.f2578g) {
            return false;
        }
        double[] dArr = nVar.f2577f;
        for (int i2 = 0; i2 < this.f2578g; i2++) {
            if (Double.doubleToLongBits(this.f2577f[i2]) != Double.doubleToLongBits(dArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // f.b.b.a.z.a.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f2578g; i3++) {
            i2 = (i2 * 31) + b0.f(Double.doubleToLongBits(this.f2577f[i3]));
        }
        return i2;
    }

    /* renamed from: i */
    public void add(int i2, Double d2) {
        l(i2, d2.doubleValue());
    }

    /* renamed from: j */
    public boolean add(Double d2) {
        k(d2.doubleValue());
        return true;
    }

    public void k(double d2) {
        h();
        int i2 = this.f2578g;
        double[] dArr = this.f2577f;
        if (i2 == dArr.length) {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            this.f2577f = dArr2;
        }
        double[] dArr3 = this.f2577f;
        int i3 = this.f2578g;
        this.f2578g = i3 + 1;
        dArr3[i3] = d2;
    }

    /* renamed from: n */
    public Double get(int i2) {
        return Double.valueOf(o(i2));
    }

    public double o(int i2) {
        m(i2);
        return this.f2577f[i2];
    }

    /* renamed from: q */
    public b0.b d(int i2) {
        if (i2 >= this.f2578g) {
            return new n(Arrays.copyOf(this.f2577f, i2), this.f2578g);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: r */
    public Double remove(int i2) {
        int i3;
        h();
        m(i2);
        double[] dArr = this.f2577f;
        double d2 = dArr[i2];
        if (i2 < this.f2578g - 1) {
            System.arraycopy(dArr, i2 + 1, dArr, i2, (i3 - i2) - 1);
        }
        this.f2578g--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d2);
    }

    @Override // f.b.b.a.z.a.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        h();
        for (int i2 = 0; i2 < this.f2578g; i2++) {
            if (obj.equals(Double.valueOf(this.f2577f[i2]))) {
                double[] dArr = this.f2577f;
                System.arraycopy(dArr, i2 + 1, dArr, i2, (this.f2578g - i2) - 1);
                this.f2578g--;
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
            double[] dArr = this.f2577f;
            System.arraycopy(dArr, i3, dArr, i2, this.f2578g - i3);
            this.f2578g -= i3 - i2;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public Double set(int i2, Double d2) {
        return Double.valueOf(t(i2, d2.doubleValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f2578g;
    }

    public double t(int i2, double d2) {
        h();
        m(i2);
        double[] dArr = this.f2577f;
        double d3 = dArr[i2];
        dArr[i2] = d2;
        return d3;
    }
}

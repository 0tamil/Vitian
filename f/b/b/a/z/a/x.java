package f.b.b.a.z.a;

import f.b.b.a.z.a.b0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class x extends c<Float> implements b0.f, RandomAccess, b1 {

    /* renamed from: h  reason: collision with root package name */
    private static final x f2637h;

    /* renamed from: f  reason: collision with root package name */
    private float[] f2638f;

    /* renamed from: g  reason: collision with root package name */
    private int f2639g;

    static {
        x xVar = new x(new float[0], 0);
        f2637h = xVar;
        xVar.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x() {
        this(new float[10], 0);
    }

    private x(float[] fArr, int i2) {
        this.f2638f = fArr;
        this.f2639g = i2;
    }

    private void l(int i2, float f2) {
        int i3;
        h();
        if (i2 < 0 || i2 > (i3 = this.f2639g)) {
            throw new IndexOutOfBoundsException(p(i2));
        }
        float[] fArr = this.f2638f;
        if (i3 < fArr.length) {
            System.arraycopy(fArr, i2, fArr, i2 + 1, i3 - i2);
        } else {
            float[] fArr2 = new float[((i3 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            System.arraycopy(this.f2638f, i2, fArr2, i2 + 1, this.f2639g - i2);
            this.f2638f = fArr2;
        }
        this.f2638f[i2] = f2;
        this.f2639g++;
        ((AbstractList) this).modCount++;
    }

    private void m(int i2) {
        if (i2 < 0 || i2 >= this.f2639g) {
            throw new IndexOutOfBoundsException(p(i2));
        }
    }

    private String p(int i2) {
        return "Index:" + i2 + ", Size:" + this.f2639g;
    }

    @Override // f.b.b.a.z.a.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        h();
        b0.a(collection);
        if (!(collection instanceof x)) {
            return super.addAll(collection);
        }
        x xVar = (x) collection;
        int i2 = xVar.f2639g;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f2639g;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            float[] fArr = this.f2638f;
            if (i4 > fArr.length) {
                this.f2638f = Arrays.copyOf(fArr, i4);
            }
            System.arraycopy(xVar.f2638f, 0, this.f2638f, this.f2639g, xVar.f2639g);
            this.f2639g = i4;
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
        if (!(obj instanceof x)) {
            return super.equals(obj);
        }
        x xVar = (x) obj;
        if (this.f2639g != xVar.f2639g) {
            return false;
        }
        float[] fArr = xVar.f2638f;
        for (int i2 = 0; i2 < this.f2639g; i2++) {
            if (Float.floatToIntBits(this.f2638f[i2]) != Float.floatToIntBits(fArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // f.b.b.a.z.a.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f2639g; i3++) {
            i2 = (i2 * 31) + Float.floatToIntBits(this.f2638f[i3]);
        }
        return i2;
    }

    /* renamed from: i */
    public void add(int i2, Float f2) {
        l(i2, f2.floatValue());
    }

    /* renamed from: j */
    public boolean add(Float f2) {
        k(f2.floatValue());
        return true;
    }

    public void k(float f2) {
        h();
        int i2 = this.f2639g;
        float[] fArr = this.f2638f;
        if (i2 == fArr.length) {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            this.f2638f = fArr2;
        }
        float[] fArr3 = this.f2638f;
        int i3 = this.f2639g;
        this.f2639g = i3 + 1;
        fArr3[i3] = f2;
    }

    /* renamed from: n */
    public Float get(int i2) {
        return Float.valueOf(o(i2));
    }

    public float o(int i2) {
        m(i2);
        return this.f2638f[i2];
    }

    /* renamed from: q */
    public b0.f d(int i2) {
        if (i2 >= this.f2639g) {
            return new x(Arrays.copyOf(this.f2638f, i2), this.f2639g);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: r */
    public Float remove(int i2) {
        int i3;
        h();
        m(i2);
        float[] fArr = this.f2638f;
        float f2 = fArr[i2];
        if (i2 < this.f2639g - 1) {
            System.arraycopy(fArr, i2 + 1, fArr, i2, (i3 - i2) - 1);
        }
        this.f2639g--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f2);
    }

    @Override // f.b.b.a.z.a.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        h();
        for (int i2 = 0; i2 < this.f2639g; i2++) {
            if (obj.equals(Float.valueOf(this.f2638f[i2]))) {
                float[] fArr = this.f2638f;
                System.arraycopy(fArr, i2 + 1, fArr, i2, (this.f2639g - i2) - 1);
                this.f2639g--;
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
            float[] fArr = this.f2638f;
            System.arraycopy(fArr, i3, fArr, i2, this.f2639g - i3);
            this.f2639g -= i3 - i2;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public Float set(int i2, Float f2) {
        return Float.valueOf(t(i2, f2.floatValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f2639g;
    }

    public float t(int i2, float f2) {
        h();
        m(i2);
        float[] fArr = this.f2638f;
        float f3 = fArr[i2];
        fArr[i2] = f2;
        return f3;
    }
}

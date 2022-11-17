package e.c;
/* loaded from: classes.dex */
public class d<E> implements Cloneable {

    /* renamed from: i  reason: collision with root package name */
    private static final Object f2022i = new Object();

    /* renamed from: e  reason: collision with root package name */
    private boolean f2023e;

    /* renamed from: f  reason: collision with root package name */
    private long[] f2024f;

    /* renamed from: g  reason: collision with root package name */
    private Object[] f2025g;

    /* renamed from: h  reason: collision with root package name */
    private int f2026h;

    public d() {
        this(10);
    }

    public d(int i2) {
        this.f2023e = false;
        if (i2 == 0) {
            this.f2024f = c.b;
            this.f2025g = c.c;
            return;
        }
        int f2 = c.f(i2);
        this.f2024f = new long[f2];
        this.f2025g = new Object[f2];
    }

    private void f() {
        int i2 = this.f2026h;
        long[] jArr = this.f2024f;
        Object[] objArr = this.f2025g;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f2022i) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f2023e = false;
        this.f2026h = i3;
    }

    public void b(long j2, E e2) {
        int i2 = this.f2026h;
        if (i2 == 0 || j2 > this.f2024f[i2 - 1]) {
            if (this.f2023e && i2 >= this.f2024f.length) {
                f();
            }
            int i3 = this.f2026h;
            if (i3 >= this.f2024f.length) {
                int f2 = c.f(i3 + 1);
                long[] jArr = new long[f2];
                Object[] objArr = new Object[f2];
                long[] jArr2 = this.f2024f;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f2025g;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f2024f = jArr;
                this.f2025g = objArr;
            }
            this.f2024f[i3] = j2;
            this.f2025g[i3] = e2;
            this.f2026h = i3 + 1;
            return;
        }
        j(j2, e2);
    }

    public void c() {
        int i2 = this.f2026h;
        Object[] objArr = this.f2025g;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.f2026h = 0;
        this.f2023e = false;
    }

    /* renamed from: e */
    public d<E> clone() {
        try {
            d<E> dVar = (d) super.clone();
            dVar.f2024f = (long[]) this.f2024f.clone();
            dVar.f2025g = (Object[]) this.f2025g.clone();
            return dVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public E g(long j2) {
        return h(j2, null);
    }

    public E h(long j2, E e2) {
        int b = c.b(this.f2024f, this.f2026h, j2);
        if (b >= 0) {
            Object[] objArr = this.f2025g;
            if (objArr[b] != f2022i) {
                return (E) objArr[b];
            }
        }
        return e2;
    }

    public long i(int i2) {
        if (this.f2023e) {
            f();
        }
        return this.f2024f[i2];
    }

    public void j(long j2, E e2) {
        int b = c.b(this.f2024f, this.f2026h, j2);
        if (b >= 0) {
            this.f2025g[b] = e2;
            return;
        }
        int i2 = ~b;
        int i3 = this.f2026h;
        if (i2 < i3) {
            Object[] objArr = this.f2025g;
            if (objArr[i2] == f2022i) {
                this.f2024f[i2] = j2;
                objArr[i2] = e2;
                return;
            }
        }
        if (this.f2023e && i3 >= this.f2024f.length) {
            f();
            i2 = ~c.b(this.f2024f, this.f2026h, j2);
        }
        int i4 = this.f2026h;
        if (i4 >= this.f2024f.length) {
            int f2 = c.f(i4 + 1);
            long[] jArr = new long[f2];
            Object[] objArr2 = new Object[f2];
            long[] jArr2 = this.f2024f;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f2025g;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2024f = jArr;
            this.f2025g = objArr2;
        }
        int i5 = this.f2026h;
        if (i5 - i2 != 0) {
            long[] jArr3 = this.f2024f;
            int i6 = i2 + 1;
            System.arraycopy(jArr3, i2, jArr3, i6, i5 - i2);
            Object[] objArr4 = this.f2025g;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f2026h - i2);
        }
        this.f2024f[i2] = j2;
        this.f2025g[i2] = e2;
        this.f2026h++;
    }

    public void k(long j2) {
        int b = c.b(this.f2024f, this.f2026h, j2);
        if (b >= 0) {
            Object[] objArr = this.f2025g;
            Object obj = objArr[b];
            Object obj2 = f2022i;
            if (obj != obj2) {
                objArr[b] = obj2;
                this.f2023e = true;
            }
        }
    }

    public int l() {
        if (this.f2023e) {
            f();
        }
        return this.f2026h;
    }

    public E m(int i2) {
        if (this.f2023e) {
            f();
        }
        return (E) this.f2025g[i2];
    }

    public String toString() {
        if (l() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2026h * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f2026h; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(i(i2));
            sb.append('=');
            E m = m(i2);
            if (m != this) {
                sb.append(m);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}

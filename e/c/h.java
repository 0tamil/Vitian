package e.c;
/* loaded from: classes.dex */
public class h<E> implements Cloneable {

    /* renamed from: i  reason: collision with root package name */
    private static final Object f2051i = new Object();

    /* renamed from: e  reason: collision with root package name */
    private boolean f2052e;

    /* renamed from: f  reason: collision with root package name */
    private int[] f2053f;

    /* renamed from: g  reason: collision with root package name */
    private Object[] f2054g;

    /* renamed from: h  reason: collision with root package name */
    private int f2055h;

    public h() {
        this(10);
    }

    public h(int i2) {
        this.f2052e = false;
        if (i2 == 0) {
            this.f2053f = c.a;
            this.f2054g = c.c;
            return;
        }
        int e2 = c.e(i2);
        this.f2053f = new int[e2];
        this.f2054g = new Object[e2];
    }

    private void f() {
        int i2 = this.f2055h;
        int[] iArr = this.f2053f;
        Object[] objArr = this.f2054g;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f2051i) {
                if (i4 != i3) {
                    iArr[i3] = iArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f2052e = false;
        this.f2055h = i3;
    }

    public void b(int i2, E e2) {
        int i3 = this.f2055h;
        if (i3 == 0 || i2 > this.f2053f[i3 - 1]) {
            if (this.f2052e && i3 >= this.f2053f.length) {
                f();
            }
            int i4 = this.f2055h;
            if (i4 >= this.f2053f.length) {
                int e3 = c.e(i4 + 1);
                int[] iArr = new int[e3];
                Object[] objArr = new Object[e3];
                int[] iArr2 = this.f2053f;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f2054g;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f2053f = iArr;
                this.f2054g = objArr;
            }
            this.f2053f[i4] = i2;
            this.f2054g[i4] = e2;
            this.f2055h = i4 + 1;
            return;
        }
        j(i2, e2);
    }

    public void c() {
        int i2 = this.f2055h;
        Object[] objArr = this.f2054g;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.f2055h = 0;
        this.f2052e = false;
    }

    /* renamed from: e */
    public h<E> clone() {
        try {
            h<E> hVar = (h) super.clone();
            hVar.f2053f = (int[]) this.f2053f.clone();
            hVar.f2054g = (Object[]) this.f2054g.clone();
            return hVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public E g(int i2) {
        return h(i2, null);
    }

    public E h(int i2, E e2) {
        int a = c.a(this.f2053f, this.f2055h, i2);
        if (a >= 0) {
            Object[] objArr = this.f2054g;
            if (objArr[a] != f2051i) {
                return (E) objArr[a];
            }
        }
        return e2;
    }

    public int i(int i2) {
        if (this.f2052e) {
            f();
        }
        return this.f2053f[i2];
    }

    public void j(int i2, E e2) {
        int a = c.a(this.f2053f, this.f2055h, i2);
        if (a >= 0) {
            this.f2054g[a] = e2;
            return;
        }
        int i3 = ~a;
        int i4 = this.f2055h;
        if (i3 < i4) {
            Object[] objArr = this.f2054g;
            if (objArr[i3] == f2051i) {
                this.f2053f[i3] = i2;
                objArr[i3] = e2;
                return;
            }
        }
        if (this.f2052e && i4 >= this.f2053f.length) {
            f();
            i3 = ~c.a(this.f2053f, this.f2055h, i2);
        }
        int i5 = this.f2055h;
        if (i5 >= this.f2053f.length) {
            int e3 = c.e(i5 + 1);
            int[] iArr = new int[e3];
            Object[] objArr2 = new Object[e3];
            int[] iArr2 = this.f2053f;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f2054g;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2053f = iArr;
            this.f2054g = objArr2;
        }
        int i6 = this.f2055h;
        if (i6 - i3 != 0) {
            int[] iArr3 = this.f2053f;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr4 = this.f2054g;
            System.arraycopy(objArr4, i3, objArr4, i7, this.f2055h - i3);
        }
        this.f2053f[i3] = i2;
        this.f2054g[i3] = e2;
        this.f2055h++;
    }

    public int k() {
        if (this.f2052e) {
            f();
        }
        return this.f2055h;
    }

    public E l(int i2) {
        if (this.f2052e) {
            f();
        }
        return (E) this.f2054g[i2];
    }

    public String toString() {
        if (k() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2055h * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f2055h; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(i(i2));
            sb.append('=');
            E l = l(i2);
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

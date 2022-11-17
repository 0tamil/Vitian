package f.b.b.a.z.a;

import f.b.b.a.z.a.v1;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: f  reason: collision with root package name */
    private static final p1 f2579f = new p1(0, new int[0], new Object[0], false);
    private int a;
    private int[] b;
    private Object[] c;

    /* renamed from: d  reason: collision with root package name */
    private int f2580d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f2581e;

    private p1() {
        this(0, new int[8], new Object[8], true);
    }

    private p1(int i2, int[] iArr, Object[] objArr, boolean z) {
        this.f2580d = -1;
        this.a = i2;
        this.b = iArr;
        this.c = objArr;
        this.f2581e = z;
    }

    private void b() {
        int i2 = this.a;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.b = Arrays.copyOf(iArr, i3);
            this.c = Arrays.copyOf(this.c, i3);
        }
    }

    private static boolean c(int[] iArr, int[] iArr2, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (iArr[i3] != iArr2[i3]) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(Object[] objArr, Object[] objArr2, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (!objArr[i3].equals(objArr2[i3])) {
                return false;
            }
        }
        return true;
    }

    public static p1 e() {
        return f2579f;
    }

    private static int h(int[] iArr, int i2) {
        int i3 = 17;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        return i3;
    }

    private static int i(Object[] objArr, int i2) {
        int i3 = 17;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 = (i3 * 31) + objArr[i4].hashCode();
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static p1 k(p1 p1Var, p1 p1Var2) {
        int i2 = p1Var.a + p1Var2.a;
        int[] copyOf = Arrays.copyOf(p1Var.b, i2);
        System.arraycopy(p1Var2.b, 0, copyOf, p1Var.a, p1Var2.a);
        Object[] copyOf2 = Arrays.copyOf(p1Var.c, i2);
        System.arraycopy(p1Var2.c, 0, copyOf2, p1Var.a, p1Var2.a);
        return new p1(i2, copyOf, copyOf2, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static p1 l() {
        return new p1();
    }

    private static void p(int i2, Object obj, v1 v1Var) {
        int a = u1.a(i2);
        int b = u1.b(i2);
        if (b == 0) {
            v1Var.f(a, ((Long) obj).longValue());
        } else if (b == 1) {
            v1Var.j(a, ((Long) obj).longValue());
        } else if (b == 2) {
            v1Var.a(a, (i) obj);
        } else if (b != 3) {
            if (b == 5) {
                v1Var.C(a, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(c0.d());
        } else if (v1Var.n() == v1.a.ASCENDING) {
            v1Var.s(a);
            ((p1) obj).q(v1Var);
            v1Var.t(a);
        } else {
            v1Var.t(a);
            ((p1) obj).q(v1Var);
            v1Var.s(a);
        }
    }

    void a() {
        if (!this.f2581e) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        int i2 = this.a;
        return i2 == p1Var.a && c(this.b, p1Var.b, i2) && d(this.c, p1Var.c, this.a);
    }

    public int f() {
        int i2;
        int i3 = this.f2580d;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.a; i5++) {
            int i6 = this.b[i5];
            int a = u1.a(i6);
            int b = u1.b(i6);
            if (b == 0) {
                i2 = l.X(a, ((Long) this.c[i5]).longValue());
            } else if (b == 1) {
                i2 = l.o(a, ((Long) this.c[i5]).longValue());
            } else if (b == 2) {
                i2 = l.g(a, (i) this.c[i5]);
            } else if (b == 3) {
                i2 = (l.U(a) * 2) + ((p1) this.c[i5]).f();
            } else if (b == 5) {
                i2 = l.m(a, ((Integer) this.c[i5]).intValue());
            } else {
                throw new IllegalStateException(c0.d());
            }
            i4 += i2;
        }
        this.f2580d = i4;
        return i4;
    }

    public int g() {
        int i2 = this.f2580d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.a; i4++) {
            i3 += l.I(u1.a(this.b[i4]), (i) this.c[i4]);
        }
        this.f2580d = i3;
        return i3;
    }

    public int hashCode() {
        int i2 = this.a;
        return ((((527 + i2) * 31) + h(this.b, i2)) * 31) + i(this.c, this.a);
    }

    public void j() {
        this.f2581e = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < this.a; i3++) {
            u0.c(sb, i2, String.valueOf(u1.a(this.b[i3])), this.c[i3]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(int i2, Object obj) {
        a();
        b();
        int[] iArr = this.b;
        int i3 = this.a;
        iArr[i3] = i2;
        this.c[i3] = obj;
        this.a = i3 + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(v1 v1Var) {
        if (v1Var.n() == v1.a.DESCENDING) {
            for (int i2 = this.a - 1; i2 >= 0; i2--) {
                v1Var.m(u1.a(this.b[i2]), this.c[i2]);
            }
            return;
        }
        for (int i3 = 0; i3 < this.a; i3++) {
            v1Var.m(u1.a(this.b[i3]), this.c[i3]);
        }
    }

    public void q(v1 v1Var) {
        if (this.a != 0) {
            if (v1Var.n() == v1.a.ASCENDING) {
                for (int i2 = 0; i2 < this.a; i2++) {
                    p(this.b[i2], this.c[i2], v1Var);
                }
                return;
            }
            for (int i3 = this.a - 1; i3 >= 0; i3--) {
                p(this.b[i3], this.c[i3], v1Var);
            }
        }
    }
}

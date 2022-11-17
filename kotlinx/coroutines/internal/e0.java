package kotlinx.coroutines.internal;

import j.x.d.i;
import java.lang.Comparable;
import java.util.Arrays;
import kotlinx.coroutines.internal.f0;
import kotlinx.coroutines.o0;
/* loaded from: classes.dex */
public class e0<T extends f0 & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;
    private T[] a;

    private final T[] f() {
        T[] tArr = this.a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new f0[4];
            this.a = tArr2;
            return tArr2;
        } else if (c() < tArr.length) {
            return tArr;
        } else {
            Object[] copyOf = Arrays.copyOf(tArr, c() * 2);
            i.c(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            T[] tArr3 = (T[]) ((f0[]) copyOf);
            this.a = tArr3;
            return tArr3;
        }
    }

    private final void j(int i2) {
        this._size = i2;
    }

    private final void k(int i2) {
        while (true) {
            int i3 = (i2 * 2) + 1;
            if (i3 < c()) {
                T[] tArr = this.a;
                i.b(tArr);
                int i4 = i3 + 1;
                if (i4 < c()) {
                    T t = tArr[i4];
                    i.b(t);
                    T t2 = tArr[i3];
                    i.b(t2);
                    if (((Comparable) t).compareTo(t2) < 0) {
                        i3 = i4;
                    }
                }
                T t3 = tArr[i2];
                i.b(t3);
                T t4 = tArr[i3];
                i.b(t4);
                if (((Comparable) t3).compareTo(t4) > 0) {
                    m(i2, i3);
                    i2 = i3;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private final void l(int i2) {
        while (i2 > 0) {
            T[] tArr = this.a;
            i.b(tArr);
            int i3 = (i2 - 1) / 2;
            T t = tArr[i3];
            i.b(t);
            T t2 = tArr[i2];
            i.b(t2);
            if (((Comparable) t).compareTo(t2) > 0) {
                m(i2, i3);
                i2 = i3;
            } else {
                return;
            }
        }
    }

    private final void m(int i2, int i3) {
        T[] tArr = this.a;
        i.b(tArr);
        T t = tArr[i3];
        i.b(t);
        T t2 = tArr[i2];
        i.b(t2);
        tArr[i2] = t;
        tArr[i3] = t2;
        t.c(i2);
        t2.c(i3);
    }

    public final void a(T t) {
        if (o0.a()) {
            if (!(t.g() == null)) {
                throw new AssertionError();
            }
        }
        t.d(this);
        T[] f2 = f();
        int c = c();
        j(c + 1);
        f2[c] = t;
        t.c(c);
        l(c);
    }

    public final T b() {
        T[] tArr = this.a;
        if (tArr == null) {
            return null;
        }
        return tArr[0];
    }

    public final int c() {
        return this._size;
    }

    public final boolean d() {
        return c() == 0;
    }

    public final T e() {
        T b;
        synchronized (this) {
            b = b();
        }
        return b;
    }

    public final boolean g(T t) {
        boolean z;
        synchronized (this) {
            z = true;
            boolean z2 = false;
            if (t.g() == null) {
                z = false;
            } else {
                int h2 = t.h();
                if (o0.a()) {
                    if (h2 >= 0) {
                        z2 = true;
                    }
                    if (!z2) {
                        throw new AssertionError();
                    }
                }
                h(h2);
            }
        }
        return z;
    }

    public final T h(int i2) {
        boolean z = false;
        if (o0.a()) {
            if (!(c() > 0)) {
                throw new AssertionError();
            }
        }
        T[] tArr = this.a;
        i.b(tArr);
        j(c() - 1);
        if (i2 < c()) {
            m(i2, c());
            int i3 = (i2 - 1) / 2;
            if (i2 > 0) {
                T t = tArr[i2];
                i.b(t);
                T t2 = tArr[i3];
                i.b(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    m(i2, i3);
                    l(i3);
                }
            }
            k(i2);
        }
        T t3 = tArr[c()];
        i.b(t3);
        if (o0.a()) {
            if (t3.g() == this) {
                z = true;
            }
            if (!z) {
                throw new AssertionError();
            }
        }
        t3.d(null);
        t3.c(-1);
        tArr[c()] = null;
        return t3;
    }

    public final T i() {
        T h2;
        synchronized (this) {
            h2 = c() > 0 ? h(0) : null;
        }
        return h2;
    }
}

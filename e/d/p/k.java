package e.d.p;

import android.view.View;
import android.view.ViewParent;
/* loaded from: classes.dex */
public class k {
    private ViewParent a;
    private ViewParent b;
    private final View c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f2136d;

    /* renamed from: e  reason: collision with root package name */
    private int[] f2137e;

    public k(View view) {
        this.c = view;
    }

    private boolean f(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        ViewParent g2;
        int i7;
        int i8;
        int[] iArr3;
        if (!j() || (g2 = g(i6)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.c.getLocationInWindow(iArr);
            i8 = iArr[0];
            i7 = iArr[1];
        } else {
            i8 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            int[] h2 = h();
            h2[0] = 0;
            h2[1] = 0;
            iArr3 = h2;
        } else {
            iArr3 = iArr2;
        }
        x.d(g2, this.c, i2, i3, i4, i5, i6, iArr3);
        if (iArr != null) {
            this.c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i8;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    private ViewParent g(int i2) {
        if (i2 == 0) {
            return this.a;
        }
        if (i2 != 1) {
            return null;
        }
        return this.b;
    }

    private int[] h() {
        if (this.f2137e == null) {
            this.f2137e = new int[2];
        }
        return this.f2137e;
    }

    private void l(int i2, ViewParent viewParent) {
        if (i2 == 0) {
            this.a = viewParent;
        } else if (i2 == 1) {
            this.b = viewParent;
        }
    }

    public boolean a(float f2, float f3, boolean z) {
        ViewParent g2;
        if (!j() || (g2 = g(0)) == null) {
            return false;
        }
        return x.a(g2, this.c, f2, f3, z);
    }

    public boolean b(float f2, float f3) {
        ViewParent g2;
        if (!j() || (g2 = g(0)) == null) {
            return false;
        }
        return x.b(g2, this.c, f2, f3);
    }

    public boolean c(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        ViewParent g2;
        int i5;
        int i6;
        if (!j() || (g2 = g(i4)) == null) {
            return false;
        }
        if (i2 != 0 || i3 != 0) {
            if (iArr2 != null) {
                this.c.getLocationInWindow(iArr2);
                i6 = iArr2[0];
                i5 = iArr2[1];
            } else {
                i6 = 0;
                i5 = 0;
            }
            if (iArr == null) {
                iArr = h();
            }
            iArr[0] = 0;
            iArr[1] = 0;
            x.c(g2, this.c, i2, i3, iArr, i4);
            if (iArr2 != null) {
                this.c.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i6;
                iArr2[1] = iArr2[1] - i5;
            }
            return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
        } else if (iArr2 == null) {
            return false;
        } else {
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
    }

    public void d(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        f(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public boolean e(int i2, int i3, int i4, int i5, int[] iArr) {
        return f(i2, i3, i4, i5, iArr, 0, null);
    }

    public boolean i(int i2) {
        return g(i2) != null;
    }

    public boolean j() {
        return this.f2136d;
    }

    public void k(boolean z) {
        if (this.f2136d) {
            u.V(this.c);
        }
        this.f2136d = z;
    }

    public boolean m(int i2, int i3) {
        if (i(i3)) {
            return true;
        }
        if (!j()) {
            return false;
        }
        View view = this.c;
        for (ViewParent parent = this.c.getParent(); parent != null; parent = parent.getParent()) {
            if (x.f(parent, view, this.c, i2, i3)) {
                l(i3, parent);
                x.e(parent, view, this.c, i2, i3);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void n(int i2) {
        ViewParent g2 = g(i2);
        if (g2 != null) {
            x.g(g2, this.c, i2);
            l(i2, null);
        }
    }
}

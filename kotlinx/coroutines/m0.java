package kotlinx.coroutines;

import j.j;
import j.u.d;
import j.u.f;
import j.x.c.p;
import kotlinx.coroutines.l2.b;
/* loaded from: classes.dex */
public enum m0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[m0.values().length];
            iArr[m0.DEFAULT.ordinal()] = 1;
            iArr[m0.ATOMIC.ordinal()] = 2;
            iArr[m0.UNDISPATCHED.ordinal()] = 3;
            iArr[m0.LAZY.ordinal()] = 4;
            a = iArr;
        }
    }

    public final <R, T> void c(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r, d<? super T> dVar) {
        int i2 = a.a[ordinal()];
        if (i2 == 1) {
            kotlinx.coroutines.l2.a.e(pVar, r, dVar, null, 4, null);
        } else if (i2 == 2) {
            f.a(pVar, r, dVar);
        } else if (i2 == 3) {
            b.a(pVar, r, dVar);
        } else if (i2 != 4) {
            throw new j();
        }
    }

    public final boolean d() {
        return this == LAZY;
    }
}

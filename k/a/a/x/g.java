package k.a.a.x;

import k.a.a.c;
import k.a.a.w.d;
/* loaded from: classes.dex */
public final class g {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b implements f {

        /* renamed from: e  reason: collision with root package name */
        private final int f3731e;

        /* renamed from: f  reason: collision with root package name */
        private final int f3732f;

        private b(int i2, c cVar) {
            d.i(cVar, "dayOfWeek");
            this.f3731e = i2;
            this.f3732f = cVar.getValue();
        }

        @Override // k.a.a.x.f
        public d s(d dVar) {
            int e2 = dVar.e(k.a.a.x.a.DAY_OF_WEEK);
            int i2 = this.f3731e;
            if (i2 < 2 && e2 == this.f3732f) {
                return dVar;
            }
            if ((i2 & 1) == 0) {
                int i3 = e2 - this.f3732f;
                return dVar.r(i3 >= 0 ? 7 - i3 : -i3, k.a.a.x.b.DAYS);
            }
            int i4 = this.f3732f - e2;
            return dVar.k(i4 >= 0 ? 7 - i4 : -i4, k.a.a.x.b.DAYS);
        }
    }

    public static f a(c cVar) {
        return new b(0, cVar);
    }

    public static f b(c cVar) {
        return new b(1, cVar);
    }
}

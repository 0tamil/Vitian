package k.a.a.u;

import java.io.Serializable;
import k.a.a.h;
import k.a.a.u.b;
import k.a.a.x.d;
import k.a.a.x.f;
import k.a.a.x.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class a<D extends b> extends b implements d, f, Serializable {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k.a.a.u.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0146a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[k.a.a.x.b.values().length];
            a = iArr;
            try {
                iArr[k.a.a.x.b.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[k.a.a.x.b.WEEKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[k.a.a.x.b.MONTHS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[k.a.a.x.b.YEARS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[k.a.a.x.b.DECADES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[k.a.a.x.b.CENTURIES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[k.a.a.x.b.MILLENNIA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: F */
    public a<D> r(long j2, l lVar) {
        if (!(lVar instanceof k.a.a.x.b)) {
            return (a) w().d(lVar.c(this, j2));
        }
        switch (C0146a.a[((k.a.a.x.b) lVar).ordinal()]) {
            case 1:
                return G(j2);
            case 2:
                return G(k.a.a.w.d.l(j2, 7));
            case 3:
                return H(j2);
            case 4:
                return I(j2);
            case 5:
                return I(k.a.a.w.d.l(j2, 10));
            case 6:
                return I(k.a.a.w.d.l(j2, 100));
            case 7:
                return I(k.a.a.w.d.l(j2, 1000));
            default:
                throw new k.a.a.b(lVar + " not valid for chronology " + w().l());
        }
    }

    abstract a<D> G(long j2);

    abstract a<D> H(long j2);

    abstract a<D> I(long j2);

    @Override // k.a.a.u.b
    public c<?> u(h hVar) {
        return d.H(this, hVar);
    }
}

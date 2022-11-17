package j.z;

import j.s.v;
import j.v.c;
import j.x.d.e;
/* loaded from: classes.dex */
public class a implements Iterable<Integer> {

    /* renamed from: h  reason: collision with root package name */
    public static final C0144a f3485h = new C0144a(null);

    /* renamed from: e  reason: collision with root package name */
    private final int f3486e;

    /* renamed from: f  reason: collision with root package name */
    private final int f3487f;

    /* renamed from: g  reason: collision with root package name */
    private final int f3488g;

    /* renamed from: j.z.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0144a {
        private C0144a() {
        }

        public /* synthetic */ C0144a(e eVar) {
            this();
        }

        public final a a(int i2, int i3, int i4) {
            return new a(i2, i3, i4);
        }
    }

    public a(int i2, int i3, int i4) {
        if (i4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i4 != Integer.MIN_VALUE) {
            this.f3486e = i2;
            this.f3487f = c.b(i2, i3, i4);
            this.f3488g = i4;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (!(this.f3486e == aVar.f3486e && this.f3487f == aVar.f3487f && this.f3488g == aVar.f3488g)) {
                }
            }
            return true;
        }
        return false;
    }

    public final int h() {
        return this.f3486e;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f3486e * 31) + this.f3487f) * 31) + this.f3488g;
    }

    public final int i() {
        return this.f3487f;
    }

    public boolean isEmpty() {
        if (this.f3488g > 0) {
            if (this.f3486e > this.f3487f) {
                return true;
            }
        } else if (this.f3486e < this.f3487f) {
            return true;
        }
        return false;
    }

    public final int j() {
        return this.f3488g;
    }

    /* renamed from: k */
    public v iterator() {
        return new b(this.f3486e, this.f3487f, this.f3488g);
    }

    public String toString() {
        int i2;
        StringBuilder sb;
        if (this.f3488g > 0) {
            sb = new StringBuilder();
            sb.append(this.f3486e);
            sb.append("..");
            sb.append(this.f3487f);
            sb.append(" step ");
            i2 = this.f3488g;
        } else {
            sb = new StringBuilder();
            sb.append(this.f3486e);
            sb.append(" downTo ");
            sb.append(this.f3487f);
            sb.append(" step ");
            i2 = -this.f3488g;
        }
        sb.append(i2);
        return sb.toString();
    }
}

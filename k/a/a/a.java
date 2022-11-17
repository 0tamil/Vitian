package k.a.a;

import java.io.Serializable;
import k.a.a.w.d;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: k.a.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0145a extends a implements Serializable {

        /* renamed from: e  reason: collision with root package name */
        private final q f3495e;

        C0145a(q qVar) {
            this.f3495e = qVar;
        }

        @Override // k.a.a.a
        public q a() {
            return this.f3495e;
        }

        @Override // k.a.a.a
        public e b() {
            return e.z(d());
        }

        public long d() {
            return System.currentTimeMillis();
        }

        public boolean equals(Object obj) {
            if (obj instanceof C0145a) {
                return this.f3495e.equals(((C0145a) obj).f3495e);
            }
            return false;
        }

        public int hashCode() {
            return this.f3495e.hashCode() + 1;
        }

        public String toString() {
            return "SystemClock[" + this.f3495e + "]";
        }
    }

    protected a() {
    }

    public static a c(q qVar) {
        d.i(qVar, "zone");
        return new C0145a(qVar);
    }

    public abstract q a();

    public abstract e b();
}

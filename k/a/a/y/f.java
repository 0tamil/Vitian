package k.a.a.y;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import k.a.a.e;
import k.a.a.g;
import k.a.a.r;
import k.a.a.w.d;
/* loaded from: classes.dex */
public abstract class f {

    /* loaded from: classes.dex */
    static final class a extends f implements Serializable {

        /* renamed from: e  reason: collision with root package name */
        private final r f3766e;

        a(r rVar) {
            this.f3766e = rVar;
        }

        @Override // k.a.a.y.f
        public r a(e eVar) {
            return this.f3766e;
        }

        @Override // k.a.a.y.f
        public d b(g gVar) {
            return null;
        }

        @Override // k.a.a.y.f
        public List<r> c(g gVar) {
            return Collections.singletonList(this.f3766e);
        }

        @Override // k.a.a.y.f
        public boolean d() {
            return true;
        }

        @Override // k.a.a.y.f
        public boolean e(g gVar, r rVar) {
            return this.f3766e.equals(rVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return this.f3766e.equals(((a) obj).f3766e);
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.d() && this.f3766e.equals(bVar.a(e.f3506g));
        }

        public int hashCode() {
            return ((((this.f3766e.hashCode() + 31) ^ 1) ^ 1) ^ (this.f3766e.hashCode() + 31)) ^ 1;
        }

        public String toString() {
            return "FixedRules:" + this.f3766e;
        }
    }

    public static f f(r rVar) {
        d.i(rVar, "offset");
        return new a(rVar);
    }

    public abstract r a(e eVar);

    public abstract d b(g gVar);

    public abstract List<r> c(g gVar);

    public abstract boolean d();

    public abstract boolean e(g gVar, r rVar);
}

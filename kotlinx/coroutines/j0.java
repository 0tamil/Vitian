package kotlinx.coroutines;

import j.u.g;
import j.x.d.e;
import j.x.d.i;
/* loaded from: classes.dex */
public final class j0 extends j.u.a {

    /* renamed from: f  reason: collision with root package name */
    public static final a f3819f = new a(null);

    /* renamed from: e  reason: collision with root package name */
    private final String f3820e;

    /* loaded from: classes.dex */
    public static final class a implements g.c<j0> {
        private a() {
        }

        public /* synthetic */ a(e eVar) {
            this();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && i.a(this.f3820e, ((j0) obj).f3820e);
    }

    public int hashCode() {
        return this.f3820e.hashCode();
    }

    public String toString() {
        return "CoroutineName(" + this.f3820e + ')';
    }

    public final String w() {
        return this.f3820e;
    }
}

package j;

import j.x.d.e;
import j.x.d.i;
import java.io.Serializable;
/* loaded from: classes.dex */
public final class l<T> implements Serializable {

    /* renamed from: e  reason: collision with root package name */
    public static final a f3445e = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(e eVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Serializable {

        /* renamed from: e  reason: collision with root package name */
        public final Throwable f3446e;

        public b(Throwable th) {
            i.d(th, "exception");
            this.f3446e = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && i.a(this.f3446e, ((b) obj).f3446e);
        }

        public int hashCode() {
            return this.f3446e.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f3446e + ')';
        }
    }

    public static <T> Object a(Object obj) {
        return obj;
    }

    public static final Throwable b(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f3446e;
        }
        return null;
    }

    public static final boolean c(Object obj) {
        return obj instanceof b;
    }

    public static final boolean d(Object obj) {
        return !(obj instanceof b);
    }
}

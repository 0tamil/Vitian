package f.b.a.a.i.x.a;

import com.google.firebase.n.j.f;
/* loaded from: classes.dex */
public final class e {
    private final long a;
    private final long b;

    /* loaded from: classes.dex */
    public static final class a {
        private long a = 0;
        private long b = 0;

        a() {
        }

        public e a() {
            return new e(this.a, this.b);
        }

        public a b(long j2) {
            this.a = j2;
            return this;
        }

        public a c(long j2) {
            this.b = j2;
            return this;
        }
    }

    static {
        new a().a();
    }

    e(long j2, long j3) {
        this.a = j2;
        this.b = j3;
    }

    public static a c() {
        return new a();
    }

    @f(tag = 1)
    public long a() {
        return this.a;
    }

    @f(tag = 2)
    public long b() {
        return this.b;
    }
}

package f.b.a.a.i.x.a;
/* loaded from: classes.dex */
public final class f {
    private final long a;
    private final long b;

    /* loaded from: classes.dex */
    public static final class a {
        private long a = 0;
        private long b = 0;

        a() {
        }

        public f a() {
            return new f(this.a, this.b);
        }

        public a b(long j2) {
            this.b = j2;
            return this;
        }

        public a c(long j2) {
            this.a = j2;
            return this;
        }
    }

    static {
        new a().a();
    }

    f(long j2, long j3) {
        this.a = j2;
        this.b = j3;
    }

    public static a c() {
        return new a();
    }

    @com.google.firebase.n.j.f(tag = 2)
    public long a() {
        return this.b;
    }

    @com.google.firebase.n.j.f(tag = 1)
    public long b() {
        return this.a;
    }
}

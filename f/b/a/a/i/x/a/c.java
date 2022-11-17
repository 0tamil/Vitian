package f.b.a.a.i.x.a;

import com.google.firebase.n.j.e;
import com.google.firebase.n.j.f;
/* loaded from: classes.dex */
public final class c {
    private final long a;
    private final b b;

    /* loaded from: classes.dex */
    public static final class a {
        private long a = 0;
        private b b = b.REASON_UNKNOWN;

        a() {
        }

        public c a() {
            return new c(this.a, this.b);
        }

        public a b(long j2) {
            this.a = j2;
            return this;
        }

        public a c(b bVar) {
            this.b = bVar;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public enum b implements e {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        

        /* renamed from: e  reason: collision with root package name */
        private final int f2318e;

        b(int i2) {
            this.f2318e = i2;
        }

        @Override // com.google.firebase.n.j.e
        public int b() {
            return this.f2318e;
        }
    }

    static {
        new a().a();
    }

    c(long j2, b bVar) {
        this.a = j2;
        this.b = bVar;
    }

    public static a c() {
        return new a();
    }

    @f(tag = 1)
    public long a() {
        return this.a;
    }

    @f(tag = 3)
    public b b() {
        return this.b;
    }
}

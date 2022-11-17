package f.b.a.a.i;

import f.b.a.a.i.j;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
final class c extends j {
    private final String a;
    private final Integer b;
    private final i c;

    /* renamed from: d  reason: collision with root package name */
    private final long f2285d;

    /* renamed from: e  reason: collision with root package name */
    private final long f2286e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, String> f2287f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends j.a {
        private String a;
        private Integer b;
        private i c;

        /* renamed from: d  reason: collision with root package name */
        private Long f2288d;

        /* renamed from: e  reason: collision with root package name */
        private Long f2289e;

        /* renamed from: f  reason: collision with root package name */
        private Map<String, String> f2290f;

        @Override // f.b.a.a.i.j.a
        public j d() {
            String str = "";
            if (this.a == null) {
                str = str + " transportName";
            }
            if (this.c == null) {
                str = str + " encodedPayload";
            }
            if (this.f2288d == null) {
                str = str + " eventMillis";
            }
            if (this.f2289e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f2290f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new c(this.a, this.b, this.c, this.f2288d.longValue(), this.f2289e.longValue(), this.f2290f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // f.b.a.a.i.j.a
        protected Map<String, String> e() {
            Map<String, String> map = this.f2290f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // f.b.a.a.i.j.a
        public j.a f(Map<String, String> map) {
            Objects.requireNonNull(map, "Null autoMetadata");
            this.f2290f = map;
            return this;
        }

        @Override // f.b.a.a.i.j.a
        public j.a g(Integer num) {
            this.b = num;
            return this;
        }

        @Override // f.b.a.a.i.j.a
        public j.a h(i iVar) {
            Objects.requireNonNull(iVar, "Null encodedPayload");
            this.c = iVar;
            return this;
        }

        @Override // f.b.a.a.i.j.a
        public j.a i(long j2) {
            this.f2288d = Long.valueOf(j2);
            return this;
        }

        @Override // f.b.a.a.i.j.a
        public j.a j(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.a = str;
            return this;
        }

        @Override // f.b.a.a.i.j.a
        public j.a k(long j2) {
            this.f2289e = Long.valueOf(j2);
            return this;
        }
    }

    private c(String str, Integer num, i iVar, long j2, long j3, Map<String, String> map) {
        this.a = str;
        this.b = num;
        this.c = iVar;
        this.f2285d = j2;
        this.f2286e = j3;
        this.f2287f = map;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // f.b.a.a.i.j
    public Map<String, String> c() {
        return this.f2287f;
    }

    @Override // f.b.a.a.i.j
    public Integer d() {
        return this.b;
    }

    @Override // f.b.a.a.i.j
    public i e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.a.equals(jVar.j()) && ((num = this.b) != null ? num.equals(jVar.d()) : jVar.d() == null) && this.c.equals(jVar.e()) && this.f2285d == jVar.f() && this.f2286e == jVar.k() && this.f2287f.equals(jVar.c());
    }

    @Override // f.b.a.a.i.j
    public long f() {
        return this.f2285d;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j2 = this.f2285d;
        long j3 = this.f2286e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.c.hashCode()) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ this.f2287f.hashCode();
    }

    @Override // f.b.a.a.i.j
    public String j() {
        return this.a;
    }

    @Override // f.b.a.a.i.j
    public long k() {
        return this.f2286e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.f2285d + ", uptimeMillis=" + this.f2286e + ", autoMetadata=" + this.f2287f + "}";
    }
}

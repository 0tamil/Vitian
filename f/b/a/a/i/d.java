package f.b.a.a.i;

import f.b.a.a.c;
import f.b.a.a.e;
import f.b.a.a.i.o;
import java.util.Objects;
/* loaded from: classes.dex */
final class d extends o {
    private final p a;
    private final String b;
    private final c<?> c;

    /* renamed from: d  reason: collision with root package name */
    private final e<?, byte[]> f2291d;

    /* renamed from: e  reason: collision with root package name */
    private final f.b.a.a.b f2292e;

    /* loaded from: classes.dex */
    static final class b extends o.a {
        private p a;
        private String b;
        private c<?> c;

        /* renamed from: d  reason: collision with root package name */
        private e<?, byte[]> f2293d;

        /* renamed from: e  reason: collision with root package name */
        private f.b.a.a.b f2294e;

        @Override // f.b.a.a.i.o.a
        public o a() {
            String str = "";
            if (this.a == null) {
                str = str + " transportContext";
            }
            if (this.b == null) {
                str = str + " transportName";
            }
            if (this.c == null) {
                str = str + " event";
            }
            if (this.f2293d == null) {
                str = str + " transformer";
            }
            if (this.f2294e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new d(this.a, this.b, this.c, this.f2293d, this.f2294e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // f.b.a.a.i.o.a
        o.a b(f.b.a.a.b bVar) {
            Objects.requireNonNull(bVar, "Null encoding");
            this.f2294e = bVar;
            return this;
        }

        @Override // f.b.a.a.i.o.a
        o.a c(c<?> cVar) {
            Objects.requireNonNull(cVar, "Null event");
            this.c = cVar;
            return this;
        }

        @Override // f.b.a.a.i.o.a
        o.a d(e<?, byte[]> eVar) {
            Objects.requireNonNull(eVar, "Null transformer");
            this.f2293d = eVar;
            return this;
        }

        @Override // f.b.a.a.i.o.a
        public o.a e(p pVar) {
            Objects.requireNonNull(pVar, "Null transportContext");
            this.a = pVar;
            return this;
        }

        @Override // f.b.a.a.i.o.a
        public o.a f(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.b = str;
            return this;
        }
    }

    private d(p pVar, String str, c<?> cVar, e<?, byte[]> eVar, f.b.a.a.b bVar) {
        this.a = pVar;
        this.b = str;
        this.c = cVar;
        this.f2291d = eVar;
        this.f2292e = bVar;
    }

    @Override // f.b.a.a.i.o
    public f.b.a.a.b b() {
        return this.f2292e;
    }

    @Override // f.b.a.a.i.o
    c<?> c() {
        return this.c;
    }

    @Override // f.b.a.a.i.o
    e<?, byte[]> e() {
        return this.f2291d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.a.equals(oVar.f()) && this.b.equals(oVar.g()) && this.c.equals(oVar.c()) && this.f2291d.equals(oVar.e()) && this.f2292e.equals(oVar.b());
    }

    @Override // f.b.a.a.i.o
    public p f() {
        return this.a;
    }

    @Override // f.b.a.a.i.o
    public String g() {
        return this.b;
    }

    public int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f2291d.hashCode()) * 1000003) ^ this.f2292e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.a + ", transportName=" + this.b + ", event=" + this.c + ", transformer=" + this.f2291d + ", encoding=" + this.f2292e + "}";
    }
}

package f.b.a.a.i.x.a;

import com.google.firebase.n.j.f;
import f.b.a.a.i.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class a {
    private final f a;
    private final List<d> b;
    private final b c;

    /* renamed from: d  reason: collision with root package name */
    private final String f2310d;

    /* renamed from: f.b.a.a.i.x.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0088a {
        private f a = null;
        private List<d> b = new ArrayList();
        private b c = null;

        /* renamed from: d  reason: collision with root package name */
        private String f2311d = "";

        C0088a() {
        }

        public C0088a a(d dVar) {
            this.b.add(dVar);
            return this;
        }

        public a b() {
            return new a(this.a, Collections.unmodifiableList(this.b), this.c, this.f2311d);
        }

        public C0088a c(String str) {
            this.f2311d = str;
            return this;
        }

        public C0088a d(b bVar) {
            this.c = bVar;
            return this;
        }

        public C0088a e(f fVar) {
            this.a = fVar;
            return this;
        }
    }

    static {
        new C0088a().b();
    }

    a(f fVar, List<d> list, b bVar, String str) {
        this.a = fVar;
        this.b = list;
        this.c = bVar;
        this.f2310d = str;
    }

    public static C0088a e() {
        return new C0088a();
    }

    @f(tag = 4)
    public String a() {
        return this.f2310d;
    }

    @f(tag = 3)
    public b b() {
        return this.c;
    }

    @f(tag = 2)
    public List<d> c() {
        return this.b;
    }

    @f(tag = 1)
    public f d() {
        return this.a;
    }

    public byte[] f() {
        return m.a(this);
    }
}

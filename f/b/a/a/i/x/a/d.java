package f.b.a.a.i.x.a;

import com.google.firebase.n.j.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class d {
    private final String a;
    private final List<c> b;

    /* loaded from: classes.dex */
    public static final class a {
        private String a = "";
        private List<c> b = new ArrayList();

        a() {
        }

        public d a() {
            return new d(this.a, Collections.unmodifiableList(this.b));
        }

        public a b(List<c> list) {
            this.b = list;
            return this;
        }

        public a c(String str) {
            this.a = str;
            return this;
        }
    }

    static {
        new a().a();
    }

    d(String str, List<c> list) {
        this.a = str;
        this.b = list;
    }

    public static a c() {
        return new a();
    }

    @f(tag = 2)
    public List<c> a() {
        return this.b;
    }

    @f(tag = 1)
    public String b() {
        return this.a;
    }
}

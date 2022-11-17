package f.e.a.f;

import f.e.a.d;
import java.util.List;
/* loaded from: classes.dex */
public abstract class b implements f {
    private Boolean g(String str) {
        Object c = c(str);
        if (c instanceof Boolean) {
            return (Boolean) c;
        }
        return null;
    }

    private String i() {
        return (String) c("sql");
    }

    private List<Object> j() {
        return (List) c("arguments");
    }

    @Override // f.e.a.f.f
    public d d() {
        return new d(i(), j());
    }

    @Override // f.e.a.f.f
    public boolean e() {
        return Boolean.TRUE.equals(c("noResult"));
    }

    @Override // f.e.a.f.f
    public Boolean f() {
        return g("inTransaction");
    }

    public boolean h() {
        return Boolean.TRUE.equals(c("continueOnError"));
    }
}

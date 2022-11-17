package f.b.b.a.z.a;
/* loaded from: classes.dex */
public class f0 {
    private i a;
    private q b;
    protected volatile s0 c;

    /* renamed from: d  reason: collision with root package name */
    private volatile i f2519d;

    static {
        q.b();
    }

    protected void a(s0 s0Var) {
        i iVar;
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    try {
                        if (this.a != null) {
                            this.c = s0Var.j().a(this.a, this.b);
                            iVar = this.a;
                        } else {
                            this.c = s0Var;
                            iVar = i.f2526f;
                        }
                        this.f2519d = iVar;
                    } catch (c0 unused) {
                        this.c = s0Var;
                        this.f2519d = i.f2526f;
                    }
                }
            }
        }
    }

    public int b() {
        if (this.f2519d != null) {
            return this.f2519d.size();
        }
        i iVar = this.a;
        if (iVar != null) {
            return iVar.size();
        }
        if (this.c != null) {
            return this.c.e();
        }
        return 0;
    }

    public s0 c(s0 s0Var) {
        a(s0Var);
        return this.c;
    }

    public s0 d(s0 s0Var) {
        s0 s0Var2 = this.c;
        this.a = null;
        this.f2519d = null;
        this.c = s0Var;
        return s0Var2;
    }

    public i e() {
        if (this.f2519d != null) {
            return this.f2519d;
        }
        i iVar = this.a;
        if (iVar != null) {
            return iVar;
        }
        synchronized (this) {
            if (this.f2519d != null) {
                return this.f2519d;
            }
            this.f2519d = this.c == null ? i.f2526f : this.c.i();
            return this.f2519d;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        s0 s0Var = this.c;
        s0 s0Var2 = f0Var.c;
        return (s0Var == null && s0Var2 == null) ? e().equals(f0Var.e()) : (s0Var == null || s0Var2 == null) ? s0Var != null ? s0Var.equals(f0Var.c(s0Var.g())) : c(s0Var2.g()).equals(s0Var2) : s0Var.equals(s0Var2);
    }

    public int hashCode() {
        return 1;
    }
}

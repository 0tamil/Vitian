package kotlinx.coroutines;

import j.c0.n;
import j.r;
import j.u.g;
import j.x.d.e;
import j.x.d.i;
import java.util.Objects;
/* loaded from: classes.dex */
public final class i0 extends j.u.a implements d2<String> {

    /* renamed from: f  reason: collision with root package name */
    public static final a f3785f = new a(null);

    /* renamed from: e  reason: collision with root package name */
    private final long f3786e;

    /* loaded from: classes.dex */
    public static final class a implements g.c<i0> {
        private a() {
        }

        public /* synthetic */ a(e eVar) {
            this();
        }
    }

    public i0(long j2) {
        super(f3785f);
        this.f3786e = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && this.f3786e == ((i0) obj).f3786e;
    }

    public int hashCode() {
        return c.a(this.f3786e);
    }

    public String toString() {
        return "CoroutineId(" + this.f3786e + ')';
    }

    public final long w() {
        return this.f3786e;
    }

    /* renamed from: x */
    public void o(g gVar, String str) {
        Thread.currentThread().setName(str);
    }

    /* renamed from: y */
    public String q(g gVar) {
        int F;
        String w;
        j0 j0Var = (j0) gVar.get(j0.f3819f);
        String str = "coroutine";
        if (!(j0Var == null || (w = j0Var.w()) == null)) {
            str = w;
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        F = n.F(name, " @", 0, false, 6, null);
        if (F < 0) {
            F = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + F + 10);
        Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
        String substring = name.substring(0, F);
        i.c(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append(" @");
        sb.append(str);
        sb.append('#');
        sb.append(w());
        r rVar = r.a;
        String sb2 = sb.toString();
        i.c(sb2, "StringBuilder(capacity).…builderAction).toString()");
        currentThread.setName(sb2);
        return name;
    }
}

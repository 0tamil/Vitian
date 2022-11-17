package f.b.a.b.g;

import java.util.concurrent.ExecutionException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class p implements o {
    private final Object a = new Object();
    private final int b;
    private final i0<Void> c;

    /* renamed from: d  reason: collision with root package name */
    private int f2415d;

    /* renamed from: e  reason: collision with root package name */
    private int f2416e;

    /* renamed from: f  reason: collision with root package name */
    private int f2417f;

    /* renamed from: g  reason: collision with root package name */
    private Exception f2418g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f2419h;

    public p(int i2, i0<Void> i0Var) {
        this.b = i2;
        this.c = i0Var;
    }

    private final void c() {
        if (this.f2415d + this.f2416e + this.f2417f != this.b) {
            return;
        }
        if (this.f2418g != null) {
            i0<Void> i0Var = this.c;
            int i2 = this.f2416e;
            int i3 = this.b;
            StringBuilder sb = new StringBuilder(54);
            sb.append(i2);
            sb.append(" out of ");
            sb.append(i3);
            sb.append(" underlying tasks failed");
            i0Var.q(new ExecutionException(sb.toString(), this.f2418g));
        } else if (this.f2419h) {
            this.c.s();
        } else {
            this.c.r(null);
        }
    }

    @Override // f.b.a.b.g.c
    public final void a() {
        synchronized (this.a) {
            this.f2417f++;
            this.f2419h = true;
            c();
        }
    }

    @Override // f.b.a.b.g.e
    public final void b(Exception exc) {
        synchronized (this.a) {
            this.f2416e++;
            this.f2418g = exc;
            c();
        }
    }

    @Override // f.b.a.b.g.f
    public final void d(Object obj) {
        synchronized (this.a) {
            this.f2415d++;
            c();
        }
    }
}

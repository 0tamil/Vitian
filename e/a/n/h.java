package e.a.n;

import android.view.View;
import android.view.animation.Interpolator;
import e.d.p.a0;
import e.d.p.y;
import e.d.p.z;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class h {
    private Interpolator c;

    /* renamed from: d  reason: collision with root package name */
    z f1995d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1996e;
    private long b = -1;

    /* renamed from: f  reason: collision with root package name */
    private final a0 f1997f = new a();
    final ArrayList<y> a = new ArrayList<>();

    /* loaded from: classes.dex */
    class a extends a0 {
        private boolean a = false;
        private int b = 0;

        a() {
        }

        @Override // e.d.p.z
        public void a(View view) {
            int i2 = this.b + 1;
            this.b = i2;
            if (i2 == h.this.a.size()) {
                z zVar = h.this.f1995d;
                if (zVar != null) {
                    zVar.a(null);
                }
                d();
            }
        }

        @Override // e.d.p.a0, e.d.p.z
        public void b(View view) {
            if (!this.a) {
                this.a = true;
                z zVar = h.this.f1995d;
                if (zVar != null) {
                    zVar.b(null);
                }
            }
        }

        void d() {
            this.b = 0;
            this.a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f1996e) {
            Iterator<y> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.f1996e = false;
        }
    }

    void b() {
        this.f1996e = false;
    }

    public h c(y yVar) {
        if (!this.f1996e) {
            this.a.add(yVar);
        }
        return this;
    }

    public h d(y yVar, y yVar2) {
        this.a.add(yVar);
        yVar2.h(yVar.c());
        this.a.add(yVar2);
        return this;
    }

    public h e(long j2) {
        if (!this.f1996e) {
            this.b = j2;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f1996e) {
            this.c = interpolator;
        }
        return this;
    }

    public h g(z zVar) {
        if (!this.f1996e) {
            this.f1995d = zVar;
        }
        return this;
    }

    public void h() {
        if (!this.f1996e) {
            Iterator<y> it = this.a.iterator();
            while (it.hasNext()) {
                y next = it.next();
                long j2 = this.b;
                if (j2 >= 0) {
                    next.d(j2);
                }
                Interpolator interpolator = this.c;
                if (interpolator != null) {
                    next.e(interpolator);
                }
                if (this.f1995d != null) {
                    next.f(this.f1997f);
                }
                next.j();
            }
            this.f1996e = true;
        }
    }
}

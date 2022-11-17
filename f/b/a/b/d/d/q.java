package f.b.a.b.d.d;

import android.content.Context;
import android.location.Location;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.b;
import com.google.android.gms.location.c;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class q {
    private final y<h> a;
    private final Context b;
    private boolean c = false;

    /* renamed from: d  reason: collision with root package name */
    private final Map<j.a<c>, p> f2360d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final Map<j.a, n> f2361e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private final Map<j.a<b>, m> f2362f = new HashMap();

    public q(Context context, y<h> yVar) {
        this.b = context;
        this.a = yVar;
    }

    public final Location a(String str) {
        ((d0) this.a).a.v();
        return ((d0) this.a).a().t(str);
    }

    @Deprecated
    public final Location b() {
        ((d0) this.a).a.v();
        return ((d0) this.a).a().C();
    }

    public final LocationAvailability c() {
        ((d0) this.a).a.v();
        return ((d0) this.a).a().A(this.b.getPackageName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(LocationRequest locationRequest, j<c> jVar, f fVar) {
        p pVar;
        p pVar2;
        ((d0) this.a).a.v();
        j.a<c> b = jVar.b();
        if (b == null) {
            pVar = null;
        } else {
            synchronized (this.f2360d) {
                pVar2 = this.f2360d.get(b);
                if (pVar2 == null) {
                    pVar2 = new p(jVar);
                }
                this.f2360d.put(b, pVar2);
            }
            pVar = pVar2;
        }
        if (pVar != null) {
            ((d0) this.a).a().u(new w(1, u.b(null, locationRequest), pVar, null, null, fVar));
        }
    }

    public final void e(j.a<c> aVar, f fVar) {
        ((d0) this.a).a.v();
        p.j(aVar, "Invalid null listener key");
        synchronized (this.f2360d) {
            p remove = this.f2360d.remove(aVar);
            if (remove != null) {
                remove.c();
                ((d0) this.a).a().u(w.b(remove, fVar));
            }
        }
    }

    public final void f(boolean z) {
        ((d0) this.a).a.v();
        ((d0) this.a).a().N(z);
        this.c = z;
    }

    public final void g() {
        synchronized (this.f2360d) {
            for (p pVar : this.f2360d.values()) {
                if (pVar != null) {
                    ((d0) this.a).a().u(w.b(pVar, null));
                }
            }
            this.f2360d.clear();
        }
        synchronized (this.f2362f) {
            for (m mVar : this.f2362f.values()) {
                if (mVar != null) {
                    ((d0) this.a).a().u(w.c(mVar, null));
                }
            }
            this.f2362f.clear();
        }
        synchronized (this.f2361e) {
            for (n nVar : this.f2361e.values()) {
                if (nVar != null) {
                    ((d0) this.a).a().K(new h0(2, null, nVar, null));
                }
            }
            this.f2361e.clear();
        }
    }

    public final void h() {
        if (this.c) {
            f(false);
        }
    }
}

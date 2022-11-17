package h.a.c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import h.a.d.a.m;
import h.a.d.a.n;
import h.a.d.a.p;
import h.a.d.a.q;
import h.a.d.a.r;
import h.a.d.d.l;
import io.flutter.view.g;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
@Deprecated
/* loaded from: classes.dex */
public class e implements p, m, n, q, r {

    /* renamed from: f  reason: collision with root package name */
    private final List<p> f2877f = new ArrayList(0);

    /* renamed from: g  reason: collision with root package name */
    private final List<m> f2878g = new ArrayList(0);

    /* renamed from: h  reason: collision with root package name */
    private final List<n> f2879h = new ArrayList(0);

    /* renamed from: i  reason: collision with root package name */
    private final List<q> f2880i = new ArrayList(0);

    /* renamed from: j  reason: collision with root package name */
    private final List<r> f2881j = new ArrayList(0);

    /* renamed from: e  reason: collision with root package name */
    private final l f2876e = new l();

    public e(io.flutter.view.e eVar, Context context) {
        new LinkedHashMap(0);
    }

    @Override // h.a.d.a.m
    public boolean a(int i2, int i3, Intent intent) {
        for (m mVar : this.f2878g) {
            if (mVar.a(i2, i3, intent)) {
                return true;
            }
        }
        return false;
    }

    @Override // h.a.d.a.r
    public boolean b(io.flutter.view.e eVar) {
        boolean z = false;
        for (r rVar : this.f2881j) {
            if (rVar.b(eVar)) {
                z = true;
            }
        }
        return z;
    }

    public void c(g gVar, Activity activity) {
        this.f2876e.s(activity, gVar, gVar.getDartExecutor());
    }

    public void d() {
        this.f2876e.O();
    }

    public void e() {
        this.f2876e.z();
        this.f2876e.O();
    }

    public l f() {
        return this.f2876e;
    }

    public void g() {
        this.f2876e.S();
    }

    @Override // h.a.d.a.n
    public boolean onNewIntent(Intent intent) {
        for (n nVar : this.f2879h) {
            if (nVar.onNewIntent(intent)) {
                return true;
            }
        }
        return false;
    }

    @Override // h.a.d.a.p
    public boolean onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        for (p pVar : this.f2877f) {
            if (pVar.onRequestPermissionsResult(i2, strArr, iArr)) {
                return true;
            }
        }
        return false;
    }

    @Override // h.a.d.a.q
    public void onUserLeaveHint() {
        for (q qVar : this.f2880i) {
            qVar.onUserLeaveHint();
        }
    }
}

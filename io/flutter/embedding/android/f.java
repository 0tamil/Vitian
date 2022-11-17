package io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.lifecycle.d;
import h.a.d.d.e;
import io.flutter.embedding.engine.f.d;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
class f implements d<Activity> {
    private c a;
    private io.flutter.embedding.engine.b b;
    k c;

    /* renamed from: d  reason: collision with root package name */
    private e f2920d;

    /* renamed from: e  reason: collision with root package name */
    ViewTreeObserver.OnPreDrawListener f2921e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f2922f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f2923g;

    /* renamed from: i  reason: collision with root package name */
    private boolean f2925i;

    /* renamed from: j  reason: collision with root package name */
    private final io.flutter.embedding.engine.renderer.b f2926j = new a();

    /* renamed from: h  reason: collision with root package name */
    private boolean f2924h = false;

    /* loaded from: classes.dex */
    class a implements io.flutter.embedding.engine.renderer.b {
        a() {
        }

        @Override // io.flutter.embedding.engine.renderer.b
        public void c() {
            f.this.a.c();
            f.this.f2923g = false;
        }

        @Override // io.flutter.embedding.engine.renderer.b
        public void f() {
            f.this.a.f();
            f.this.f2923g = true;
            f.this.f2924h = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k f2927e;

        b(k kVar) {
            this.f2927e = kVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (f.this.f2923g && f.this.f2921e != null) {
                this.f2927e.getViewTreeObserver().removeOnPreDrawListener(this);
                f.this.f2921e = null;
            }
            return f.this.f2923g;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface c extends e.d {
        boolean A();

        r B();

        void C(j jVar);

        void D(io.flutter.embedding.engine.b bVar);

        d a();

        void c();

        Activity d();

        void e();

        void f();

        String g();

        Context getContext();

        io.flutter.embedding.engine.e h();

        List<String> k();

        boolean l();

        o m();

        boolean n();

        boolean o();

        String p();

        boolean r();

        String s();

        void t(io.flutter.embedding.engine.b bVar);

        q u();

        String v();

        e w(Activity activity, io.flutter.embedding.engine.b bVar);

        void x(i iVar);

        String y();

        io.flutter.embedding.engine.b z(Context context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(c cVar) {
        this.a = cVar;
    }

    private void g(k kVar) {
        if (this.a.m() == o.surface) {
            if (this.f2921e != null) {
                kVar.getViewTreeObserver().removeOnPreDrawListener(this.f2921e);
            }
            this.f2921e = new b(kVar);
            kVar.getViewTreeObserver().addOnPreDrawListener(this.f2921e);
            return;
        }
        throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
    }

    private void h() {
        String str;
        if (this.a.p() == null && !this.b.h().m()) {
            String g2 = this.a.g();
            if (g2 == null && (g2 = n(this.a.d().getIntent())) == null) {
                g2 = "/";
            }
            String v = this.a.v();
            if (("Executing Dart entrypoint: " + this.a.s() + ", library uri: " + v) == null) {
                str = "\"\"";
            } else {
                str = v + ", and sending initial route: " + g2;
            }
            h.a.b.e("FlutterActivityAndFragmentDelegate", str);
            this.b.m().c(g2);
            String y = this.a.y();
            if (y == null || y.isEmpty()) {
                y = h.a.a.e().c().g();
            }
            this.b.h().j(v == null ? new d.c(y, this.a.s()) : new d.c(y, v, this.a.s()), this.a.k());
        }
    }

    private void i() {
        if (this.a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    private String n(Intent intent) {
        Uri data;
        String path;
        if (!this.a.A() || (data = intent.getData()) == null || (path = data.getPath()) == null || path.isEmpty()) {
            return null;
        }
        if (data.getQuery() != null && !data.getQuery().isEmpty()) {
            path = path + "?" + data.getQuery();
        }
        if (data.getFragment() == null || data.getFragment().isEmpty()) {
            return path;
        }
        return path + "#" + data.getFragment();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A(Bundle bundle) {
        h.a.b.e("FlutterActivityAndFragmentDelegate", "onSaveInstanceState. Giving framework and plugins an opportunity to save state.");
        i();
        if (this.a.r()) {
            bundle.putByteArray("framework", this.b.r().h());
        }
        if (this.a.l()) {
            Bundle bundle2 = new Bundle();
            this.b.g().c(bundle2);
            bundle.putBundle("plugins", bundle2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B() {
        h.a.b.e("FlutterActivityAndFragmentDelegate", "onStart()");
        i();
        h();
        this.c.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C() {
        h.a.b.e("FlutterActivityAndFragmentDelegate", "onStop()");
        i();
        if (this.a.o()) {
            this.b.j().c();
        }
        this.c.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D(int i2) {
        i();
        io.flutter.embedding.engine.b bVar = this.b;
        if (bVar != null) {
            if (this.f2924h && i2 >= 10) {
                bVar.h().n();
                this.b.t().a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void E() {
        i();
        if (this.b != null) {
            h.a.b.e("FlutterActivityAndFragmentDelegate", "Forwarding onUserLeaveHint() to FlutterEngine.");
            this.b.g().onUserLeaveHint();
            return;
        }
        h.a.b.f("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void F() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.f2920d = null;
    }

    void G() {
        h.a.b.e("FlutterActivityAndFragmentDelegate", "Setting up FlutterEngine.");
        String p = this.a.p();
        if (p != null) {
            io.flutter.embedding.engine.b a2 = io.flutter.embedding.engine.c.b().a(p);
            this.b = a2;
            this.f2922f = true;
            if (a2 == null) {
                throw new IllegalStateException("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '" + p + "'");
            }
            return;
        }
        c cVar = this.a;
        io.flutter.embedding.engine.b z = cVar.z(cVar.getContext());
        this.b = z;
        if (z != null) {
            this.f2922f = true;
            return;
        }
        h.a.b.e("FlutterActivityAndFragmentDelegate", "No preferred FlutterEngine was provided. Creating a new FlutterEngine for this FlutterFragment.");
        this.b = new io.flutter.embedding.engine.b(this.a.getContext(), this.a.h().b(), false, this.a.r());
        this.f2922f = false;
    }

    void H() {
        e eVar = this.f2920d;
        if (eVar != null) {
            eVar.A();
        }
    }

    @Override // io.flutter.embedding.android.d
    public void e() {
        if (!this.a.n()) {
            this.a.e();
            return;
        }
        throw new AssertionError("The internal FlutterEngine created by " + this.a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
    }

    /* renamed from: j */
    public Activity f() {
        Activity d2 = this.a.d();
        if (d2 != null) {
            return d2;
        }
        throw new AssertionError("FlutterActivityAndFragmentDelegate's getAppComponent should only be queried after onAttach, when the host's activity should always be non-null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public io.flutter.embedding.engine.b k() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean l() {
        return this.f2925i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean m() {
        return this.f2922f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(int i2, int i3, Intent intent) {
        i();
        if (this.b != null) {
            h.a.b.e("FlutterActivityAndFragmentDelegate", "Forwarding onActivityResult() to FlutterEngine:\nrequestCode: " + i2 + "\nresultCode: " + i3 + "\ndata: " + intent);
            this.b.g().a(i2, i3, intent);
            return;
        }
        h.a.b.f("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(Context context) {
        i();
        if (this.b == null) {
            G();
        }
        if (this.a.l()) {
            h.a.b.e("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to the Activity that owns this delegate.");
            this.b.g().d(this, this.a.a());
        }
        c cVar = this.a;
        this.f2920d = cVar.w(cVar.d(), this.b);
        this.a.D(this.b);
        this.f2925i = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q() {
        i();
        if (this.b != null) {
            h.a.b.e("FlutterActivityAndFragmentDelegate", "Forwarding onBackPressed() to FlutterEngine.");
            this.b.m().a();
            return;
        }
        h.a.b.f("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View r(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, int i2, boolean z) {
        k kVar;
        h.a.b.e("FlutterActivityAndFragmentDelegate", "Creating FlutterView.");
        i();
        boolean z2 = true;
        if (this.a.m() == o.surface) {
            Context context = this.a.getContext();
            if (this.a.B() != r.transparent) {
                z2 = false;
            }
            i iVar = new i(context, z2);
            this.a.x(iVar);
            kVar = new k(this.a.getContext(), iVar);
        } else {
            j jVar = new j(this.a.getContext());
            if (this.a.B() != r.opaque) {
                z2 = false;
            }
            jVar.setOpaque(z2);
            this.a.C(jVar);
            kVar = new k(this.a.getContext(), jVar);
        }
        this.c = kVar;
        this.c.i(this.f2926j);
        h.a.b.e("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to FlutterView.");
        this.c.k(this.b);
        this.c.setId(i2);
        q u = this.a.u();
        if (u != null) {
            h.a.b.f("FlutterActivityAndFragmentDelegate", "A splash screen was provided to Flutter, but this is deprecated. See flutter.dev/go/android-splash-migration for migration steps.");
            FlutterSplashView flutterSplashView = new FlutterSplashView(this.a.getContext());
            flutterSplashView.setId(h.a.e.e.b(486947586));
            flutterSplashView.g(this.c, u);
            return flutterSplashView;
        }
        if (z) {
            g(this.c);
        }
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s() {
        h.a.b.e("FlutterActivityAndFragmentDelegate", "onDestroyView()");
        i();
        if (this.f2921e != null) {
            this.c.getViewTreeObserver().removeOnPreDrawListener(this.f2921e);
            this.f2921e = null;
        }
        this.c.p();
        this.c.v(this.f2926j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t() {
        h.a.b.e("FlutterActivityAndFragmentDelegate", "onDetach()");
        i();
        this.a.t(this.b);
        if (this.a.l()) {
            h.a.b.e("FlutterActivityAndFragmentDelegate", "Detaching FlutterEngine from the Activity that owns this Fragment.");
            if (this.a.d().isChangingConfigurations()) {
                this.b.g().g();
            } else {
                this.b.g().e();
            }
        }
        e eVar = this.f2920d;
        if (eVar != null) {
            eVar.o();
            this.f2920d = null;
        }
        if (this.a.o()) {
            this.b.j().a();
        }
        if (this.a.n()) {
            this.b.e();
            if (this.a.p() != null) {
                io.flutter.embedding.engine.c.b().d(this.a.p());
            }
            this.b = null;
        }
        this.f2925i = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(Intent intent) {
        i();
        if (this.b != null) {
            h.a.b.e("FlutterActivityAndFragmentDelegate", "Forwarding onNewIntent() to FlutterEngine and sending pushRoute message.");
            this.b.g().onNewIntent(intent);
            String n = n(intent);
            if (n != null && !n.isEmpty()) {
                this.b.m().b(n);
                return;
            }
            return;
        }
        h.a.b.f("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v() {
        h.a.b.e("FlutterActivityAndFragmentDelegate", "onPause()");
        i();
        if (this.a.o()) {
            this.b.j().b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w() {
        h.a.b.e("FlutterActivityAndFragmentDelegate", "onPostResume()");
        i();
        if (this.b != null) {
            H();
        } else {
            h.a.b.f("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(int i2, String[] strArr, int[] iArr) {
        i();
        if (this.b != null) {
            h.a.b.e("FlutterActivityAndFragmentDelegate", "Forwarding onRequestPermissionsResult() to FlutterEngine:\nrequestCode: " + i2 + "\npermissions: " + Arrays.toString(strArr) + "\ngrantResults: " + Arrays.toString(iArr));
            this.b.g().onRequestPermissionsResult(i2, strArr, iArr);
            return;
        }
        h.a.b.f("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(Bundle bundle) {
        Bundle bundle2;
        h.a.b.e("FlutterActivityAndFragmentDelegate", "onRestoreInstanceState. Giving framework and plugins an opportunity to restore state.");
        i();
        byte[] bArr = null;
        if (bundle != null) {
            bundle2 = bundle.getBundle("plugins");
            bArr = bundle.getByteArray("framework");
        } else {
            bundle2 = null;
        }
        if (this.a.r()) {
            this.b.r().j(bArr);
        }
        if (this.a.l()) {
            this.b.g().b(bundle2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z() {
        h.a.b.e("FlutterActivityAndFragmentDelegate", "onResume()");
        i();
        if (this.a.o()) {
            this.b.j().d();
        }
    }
}

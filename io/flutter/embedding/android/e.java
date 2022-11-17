package io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.d;
import androidx.lifecycle.g;
import androidx.lifecycle.h;
import h.a.b;
import io.flutter.embedding.android.f;
import io.flutter.embedding.engine.i.g.a;
import java.util.List;
/* loaded from: classes.dex */
public class e extends Activity implements f.c, g {

    /* renamed from: g  reason: collision with root package name */
    public static final int f2917g = h.a.e.e.b(61938);

    /* renamed from: e  reason: collision with root package name */
    protected f f2918e;

    /* renamed from: f  reason: collision with root package name */
    private h f2919f = new h(this);

    private void E() {
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(1073741824);
            window.getDecorView().setSystemUiVisibility(1280);
        }
    }

    private void F() {
        if (H() == g.transparent) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    private View G() {
        return this.f2918e.r(null, null, null, f2917g, m() == o.surface);
    }

    private Drawable K() {
        try {
            Bundle J = J();
            int i2 = J != null ? J.getInt("io.flutter.embedding.android.SplashScreenDrawable") : 0;
            if (i2 != 0) {
                return androidx.core.content.d.f.d(getResources(), i2, getTheme());
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        } catch (Resources.NotFoundException e2) {
            b.b("FlutterActivity", "Splash screen not found. Ensure the drawable exists and that it's valid.");
            throw e2;
        }
    }

    private boolean L() {
        return (getApplicationInfo().flags & 2) != 0;
    }

    private void M() {
        f fVar = this.f2918e;
        if (fVar != null) {
            fVar.F();
            this.f2918e = null;
        }
    }

    private boolean N(String str) {
        StringBuilder sb;
        String str2;
        f fVar = this.f2918e;
        if (fVar == null) {
            sb = new StringBuilder();
            sb.append("FlutterActivity ");
            sb.append(hashCode());
            sb.append(" ");
            sb.append(str);
            str2 = " called after release.";
        } else if (fVar.l()) {
            return true;
        } else {
            sb = new StringBuilder();
            sb.append("FlutterActivity ");
            sb.append(hashCode());
            sb.append(" ");
            sb.append(str);
            str2 = " called after detach.";
        }
        sb.append(str2);
        b.f("FlutterActivity", sb.toString());
        return false;
    }

    private void O() {
        try {
            Bundle J = J();
            if (J != null) {
                int i2 = J.getInt("io.flutter.embedding.android.NormalTheme", -1);
                if (i2 != -1) {
                    setTheme(i2);
                }
            } else {
                b.e("FlutterActivity", "Using the launch theme as normal theme.");
            }
        } catch (PackageManager.NameNotFoundException unused) {
            b.b("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
    }

    @Override // io.flutter.embedding.android.f.c
    public boolean A() {
        try {
            Bundle J = J();
            if (J != null) {
                return J.getBoolean("flutter_deeplinking_enabled");
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // io.flutter.embedding.android.f.c
    public r B() {
        return H() == g.opaque ? r.opaque : r.transparent;
    }

    @Override // io.flutter.embedding.android.f.c
    public void C(j jVar) {
    }

    @Override // io.flutter.embedding.android.f.c
    public void D(io.flutter.embedding.engine.b bVar) {
        if (!this.f2918e.m()) {
            a.a(bVar);
        }
    }

    protected g H() {
        return getIntent().hasExtra("background_mode") ? g.valueOf(getIntent().getStringExtra("background_mode")) : g.opaque;
    }

    protected io.flutter.embedding.engine.b I() {
        return this.f2918e.k();
    }

    protected Bundle J() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    @Override // io.flutter.embedding.android.f.c, androidx.lifecycle.g
    public d a() {
        return this.f2919f;
    }

    @Override // h.a.d.d.e.d
    public boolean b() {
        return false;
    }

    @Override // io.flutter.embedding.android.f.c
    public void c() {
    }

    @Override // io.flutter.embedding.android.f.c
    public Activity d() {
        return this;
    }

    @Override // io.flutter.embedding.android.f.c
    public void e() {
        b.f("FlutterActivity", "FlutterActivity " + this + " connection to the engine " + I() + " evicted by another attaching activity");
        f fVar = this.f2918e;
        if (fVar != null) {
            fVar.s();
            this.f2918e.t();
        }
    }

    @Override // io.flutter.embedding.android.f.c
    public void f() {
        if (Build.VERSION.SDK_INT >= 29) {
            reportFullyDrawn();
        }
    }

    @Override // io.flutter.embedding.android.f.c
    public String g() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle J = J();
            if (J != null) {
                return J.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // io.flutter.embedding.android.f.c
    public Context getContext() {
        return this;
    }

    @Override // io.flutter.embedding.android.f.c
    public io.flutter.embedding.engine.e h() {
        return io.flutter.embedding.engine.e.a(getIntent());
    }

    @Override // io.flutter.embedding.android.f.c
    public List<String> k() {
        return (List) getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    @Override // io.flutter.embedding.android.f.c
    public boolean l() {
        return true;
    }

    @Override // io.flutter.embedding.android.f.c
    public o m() {
        return H() == g.opaque ? o.surface : o.texture;
    }

    @Override // io.flutter.embedding.android.f.c
    public boolean n() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (p() != null || this.f2918e.m()) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    @Override // io.flutter.embedding.android.f.c
    public boolean o() {
        return true;
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        if (N("onActivityResult")) {
            this.f2918e.o(i2, i3, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (N("onBackPressed")) {
            this.f2918e.q();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        O();
        super.onCreate(bundle);
        f fVar = new f(this);
        this.f2918e = fVar;
        fVar.p(this);
        this.f2918e.y(bundle);
        this.f2919f.h(d.b.ON_CREATE);
        F();
        setContentView(G());
        E();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (N("onDestroy")) {
            this.f2918e.s();
            this.f2918e.t();
        }
        M();
        this.f2919f.h(d.b.ON_DESTROY);
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (N("onNewIntent")) {
            this.f2918e.u(intent);
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        if (N("onPause")) {
            this.f2918e.v();
        }
        this.f2919f.h(d.b.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        if (N("onPostResume")) {
            this.f2918e.w();
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (N("onRequestPermissionsResult")) {
            this.f2918e.x(i2, strArr, iArr);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f2919f.h(d.b.ON_RESUME);
        if (N("onResume")) {
            this.f2918e.z();
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (N("onSaveInstanceState")) {
            this.f2918e.A(bundle);
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.f2919f.h(d.b.ON_START);
        if (N("onStart")) {
            this.f2918e.B();
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        if (N("onStop")) {
            this.f2918e.C();
        }
        this.f2919f.h(d.b.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
        super.onTrimMemory(i2);
        if (N("onTrimMemory")) {
            this.f2918e.D(i2);
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        if (N("onUserLeaveHint")) {
            this.f2918e.E();
        }
    }

    @Override // io.flutter.embedding.android.f.c
    public String p() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    @Override // io.flutter.embedding.android.f.c
    public boolean r() {
        return getIntent().hasExtra("enable_state_restoration") ? getIntent().getBooleanExtra("enable_state_restoration", false) : p() == null;
    }

    @Override // io.flutter.embedding.android.f.c
    public String s() {
        try {
            Bundle J = J();
            String string = J != null ? J.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : "main";
        } catch (PackageManager.NameNotFoundException unused) {
            return "main";
        }
    }

    @Override // io.flutter.embedding.android.f.c
    public void t(io.flutter.embedding.engine.b bVar) {
    }

    @Override // io.flutter.embedding.android.f.c
    public q u() {
        Drawable K = K();
        if (K != null) {
            return new c(K);
        }
        return null;
    }

    @Override // io.flutter.embedding.android.f.c
    public String v() {
        try {
            Bundle J = J();
            if (J != null) {
                return J.getString("io.flutter.EntrypointUri");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // io.flutter.embedding.android.f.c
    public h.a.d.d.e w(Activity activity, io.flutter.embedding.engine.b bVar) {
        d();
        return new h.a.d.d.e(this, bVar.n(), this);
    }

    @Override // io.flutter.embedding.android.f.c
    public void x(i iVar) {
    }

    @Override // io.flutter.embedding.android.f.c
    public String y() {
        String dataString;
        if (!L() || !"android.intent.action.RUN".equals(getIntent().getAction()) || (dataString = getIntent().getDataString()) == null) {
            return null;
        }
        return dataString;
    }

    @Override // io.flutter.embedding.android.f.c
    public io.flutter.embedding.engine.b z(Context context) {
        return null;
    }
}

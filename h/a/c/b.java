package h.a.c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import io.flutter.view.d;
import io.flutter.view.e;
import io.flutter.view.f;
import io.flutter.view.g;
import java.util.ArrayList;
@Deprecated
/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: i  reason: collision with root package name */
    private static final WindowManager.LayoutParams f2870i = new WindowManager.LayoutParams(-1, -1);

    /* renamed from: e  reason: collision with root package name */
    private final Activity f2871e;

    /* renamed from: f  reason: collision with root package name */
    private final AbstractC0118b f2872f;

    /* renamed from: g  reason: collision with root package name */
    private g f2873g;

    /* renamed from: h  reason: collision with root package name */
    private View f2874h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements g.d {

        /* renamed from: h.a.c.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0117a extends AnimatorListenerAdapter {
            C0117a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ((ViewGroup) b.this.f2874h.getParent()).removeView(b.this.f2874h);
                b.this.f2874h = null;
            }
        }

        a() {
        }

        @Override // io.flutter.view.g.d
        public void a() {
            b.this.f2874h.animate().alpha(0.0f).setListener(new C0117a());
            b.this.f2873g.C(this);
        }
    }

    /* renamed from: h.a.c.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface AbstractC0118b {
        boolean a();

        g b(Context context);

        e c();
    }

    public b(Activity activity, AbstractC0118b bVar) {
        h.a.e.b.a(activity);
        this.f2871e = activity;
        h.a.e.b.a(bVar);
        this.f2872f = bVar;
    }

    private void e() {
        View view = this.f2874h;
        if (view != null) {
            this.f2871e.addContentView(view, f2870i);
            this.f2873g.k(new a());
            this.f2871e.setTheme(16973833);
        }
    }

    private View f() {
        Drawable h2;
        if (!l().booleanValue() || (h2 = h()) == null) {
            return null;
        }
        View view = new View(this.f2871e);
        view.setLayoutParams(f2870i);
        view.setBackground(h2);
        return view;
    }

    private static String[] g(Intent intent) {
        ArrayList arrayList = new ArrayList();
        if (intent.getBooleanExtra("trace-startup", false)) {
            arrayList.add("--trace-startup");
        }
        if (intent.getBooleanExtra("start-paused", false)) {
            arrayList.add("--start-paused");
        }
        if (intent.getBooleanExtra("disable-service-auth-codes", false)) {
            arrayList.add("--disable-service-auth-codes");
        }
        if (intent.getBooleanExtra("use-test-fonts", false)) {
            arrayList.add("--use-test-fonts");
        }
        if (intent.getBooleanExtra("enable-dart-profiling", false)) {
            arrayList.add("--enable-dart-profiling");
        }
        if (intent.getBooleanExtra("enable-software-rendering", false)) {
            arrayList.add("--enable-software-rendering");
        }
        if (intent.getBooleanExtra("skia-deterministic-rendering", false)) {
            arrayList.add("--skia-deterministic-rendering");
        }
        if (intent.getBooleanExtra("trace-skia", false)) {
            arrayList.add("--trace-skia");
        }
        if (intent.getBooleanExtra("trace-systrace", false)) {
            arrayList.add("--trace-systrace");
        }
        if (intent.getBooleanExtra("dump-skp-on-shader-compilation", false)) {
            arrayList.add("--dump-skp-on-shader-compilation");
        }
        if (intent.getBooleanExtra("cache-sksl", false)) {
            arrayList.add("--cache-sksl");
        }
        if (intent.getBooleanExtra("purge-persistent-cache", false)) {
            arrayList.add("--purge-persistent-cache");
        }
        if (intent.getBooleanExtra("verbose-logging", false)) {
            arrayList.add("--verbose-logging");
        }
        int intExtra = intent.getIntExtra("observatory-port", 0);
        if (intExtra > 0) {
            arrayList.add("--observatory-port=" + Integer.toString(intExtra));
        }
        if (intent.getBooleanExtra("endless-trace-buffer", false)) {
            arrayList.add("--endless-trace-buffer");
        }
        if (intent.hasExtra("dart-flags")) {
            arrayList.add("--dart-flags=" + intent.getStringExtra("dart-flags"));
        }
        if (!arrayList.isEmpty()) {
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        return null;
    }

    private Drawable h() {
        TypedValue typedValue = new TypedValue();
        if (!this.f2871e.getTheme().resolveAttribute(16842836, typedValue, true) || typedValue.resourceId == 0) {
            return null;
        }
        try {
            return this.f2871e.getResources().getDrawable(typedValue.resourceId);
        } catch (Resources.NotFoundException unused) {
            h.a.b.b("FlutterActivityDelegate", "Referenced launch screen windowBackground resource does not exist");
            return null;
        }
    }

    private boolean i() {
        return (this.f2871e.getApplicationInfo().flags & 2) != 0;
    }

    private boolean j(Intent intent) {
        if (!"android.intent.action.RUN".equals(intent.getAction())) {
            return false;
        }
        String stringExtra = intent.getStringExtra("route");
        String dataString = intent.getDataString();
        if (dataString == null) {
            dataString = d.b();
        }
        if (stringExtra != null) {
            this.f2873g.setInitialRoute(stringExtra);
        }
        k(dataString);
        return true;
    }

    private void k(String str) {
        if (!this.f2873g.getFlutterNativeView().p()) {
            f fVar = new f();
            fVar.a = str;
            fVar.b = "main";
            this.f2873g.F(fVar);
        }
    }

    private Boolean l() {
        try {
            Bundle bundle = this.f2871e.getPackageManager().getActivityInfo(this.f2871e.getComponentName(), 128).metaData;
            return Boolean.valueOf(bundle != null && bundle.getBoolean("io.flutter.app.android.SplashScreenUntilFirstFrame"));
        } catch (PackageManager.NameNotFoundException unused) {
            return Boolean.FALSE;
        }
    }

    @Override // h.a.d.a.m
    public boolean a(int i2, int i3, Intent intent) {
        return this.f2873g.getPluginRegistry().a(i2, i3, intent);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // h.a.c.c
    public void onCreate(Bundle bundle) {
        String b;
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.f2871e.getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(1073741824);
            window.getDecorView().setSystemUiVisibility(1280);
        }
        d.a(this.f2871e.getApplicationContext(), g(this.f2871e.getIntent()));
        g b2 = this.f2872f.b(this.f2871e);
        this.f2873g = b2;
        if (b2 == null) {
            g gVar = new g(this.f2871e, null, this.f2872f.c());
            this.f2873g = gVar;
            gVar.setLayoutParams(f2870i);
            this.f2871e.setContentView(this.f2873g);
            View f2 = f();
            this.f2874h = f2;
            if (f2 != null) {
                e();
            }
        }
        if (!j(this.f2871e.getIntent()) && (b = d.b()) != null) {
            k(b);
        }
    }

    @Override // h.a.c.c
    public void onDestroy() {
        Application application = (Application) this.f2871e.getApplicationContext();
        if (application instanceof d) {
            d dVar = (d) application;
            if (this.f2871e.equals(dVar.a())) {
                dVar.b(null);
            }
        }
        g gVar = this.f2873g;
        if (gVar == null) {
            return;
        }
        if (gVar.getPluginRegistry().b(this.f2873g.getFlutterNativeView()) || this.f2872f.a()) {
            this.f2873g.o();
        } else {
            this.f2873g.n();
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f2873g.s();
    }

    @Override // h.a.c.c
    public void onNewIntent(Intent intent) {
        if (!i() || !j(intent)) {
            this.f2873g.getPluginRegistry().onNewIntent(intent);
        }
    }

    @Override // h.a.c.c
    public void onPause() {
        Application application = (Application) this.f2871e.getApplicationContext();
        if (application instanceof d) {
            d dVar = (d) application;
            if (this.f2871e.equals(dVar.a())) {
                dVar.b(null);
            }
        }
        g gVar = this.f2873g;
        if (gVar != null) {
            gVar.t();
        }
    }

    @Override // h.a.c.c
    public void onPostResume() {
        g gVar = this.f2873g;
        if (gVar != null) {
            gVar.u();
        }
    }

    @Override // h.a.d.a.p
    public boolean onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        return this.f2873g.getPluginRegistry().onRequestPermissionsResult(i2, strArr, iArr);
    }

    @Override // h.a.c.c
    public void onResume() {
        Application application = (Application) this.f2871e.getApplicationContext();
        if (application instanceof d) {
            ((d) application).b(this.f2871e);
        }
    }

    @Override // h.a.c.c
    public void onStart() {
        g gVar = this.f2873g;
        if (gVar != null) {
            gVar.v();
        }
    }

    @Override // h.a.c.c
    public void onStop() {
        this.f2873g.w();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
        if (i2 == 10) {
            this.f2873g.s();
        }
    }

    @Override // h.a.c.c
    public void onUserLeaveHint() {
        this.f2873g.getPluginRegistry().onUserLeaveHint();
    }

    @Override // h.a.c.c
    public boolean q() {
        g gVar = this.f2873g;
        if (gVar == null) {
            return false;
        }
        gVar.x();
        return true;
    }
}

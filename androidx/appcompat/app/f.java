package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.c1;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.d1;
import androidx.appcompat.widget.h0;
import androidx.appcompat.widget.x0;
import androidx.core.content.d.f;
import androidx.lifecycle.d;
import e.a.n.b;
import e.a.n.f;
import e.d.p.a0;
import e.d.p.c0;
import e.d.p.f;
import e.d.p.y;
import java.lang.Thread;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f extends androidx.appcompat.app.e implements g.a, LayoutInflater.Factory2 {
    private static final e.c.g<String, Integer> f0 = new e.c.g<>();
    private static final boolean g0;
    private static final int[] h0;
    private static final boolean i0;
    private static final boolean j0;
    private static boolean k0;
    private TextView A;
    private View B;
    private boolean C;
    private boolean D;
    boolean E;
    boolean F;
    boolean G;
    boolean H;
    boolean I;
    private boolean J;
    private t[] K;
    private t L;
    private boolean M;
    private boolean N;
    private boolean O;
    private boolean P;
    boolean Q;
    private int R;
    private int S;
    private boolean T;
    private boolean U;
    private p V;
    private p W;
    boolean X;
    int Y;
    private final Runnable Z;
    private boolean a0;
    private Rect b0;
    private Rect c0;
    private androidx.appcompat.app.h d0;
    private androidx.appcompat.app.i e0;

    /* renamed from: h  reason: collision with root package name */
    final Object f123h;

    /* renamed from: i  reason: collision with root package name */
    final Context f124i;

    /* renamed from: j  reason: collision with root package name */
    Window f125j;

    /* renamed from: k  reason: collision with root package name */
    private n f126k;
    final androidx.appcompat.app.d l;
    androidx.appcompat.app.a m;
    MenuInflater n;
    private CharSequence o;
    private d0 p;
    private h q;
    private u r;
    e.a.n.b s;
    ActionBarContextView t;
    PopupWindow u;
    Runnable v;
    y w;
    private boolean x;
    private boolean y;
    ViewGroup z;

    /* loaded from: classes.dex */
    class a implements Thread.UncaughtExceptionHandler {
        final /* synthetic */ Thread.UncaughtExceptionHandler a;

        a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.a = uncaughtExceptionHandler;
        }

        private boolean a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            if (a(th)) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.a.uncaughtException(thread, notFoundException);
                return;
            }
            this.a.uncaughtException(thread, th);
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            if ((fVar.Y & 1) != 0) {
                fVar.U(0);
            }
            f fVar2 = f.this;
            if ((fVar2.Y & 4096) != 0) {
                fVar2.U(108);
            }
            f fVar3 = f.this;
            fVar3.X = false;
            fVar3.Y = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements e.d.p.p {
        c() {
        }

        @Override // e.d.p.p
        public c0 a(View view, c0 c0Var) {
            int k2 = c0Var.k();
            int L0 = f.this.L0(c0Var, null);
            if (k2 != L0) {
                c0Var = c0Var.o(c0Var.i(), L0, c0Var.j(), c0Var.h());
            }
            return e.d.p.u.B(view, c0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements h0.a {
        d() {
        }

        @Override // androidx.appcompat.widget.h0.a
        public void a(Rect rect) {
            rect.top = f.this.L0(null, rect);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements ContentFrameLayout.a {
        e() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            f.this.S();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.f$f  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0009f implements Runnable {

        /* renamed from: androidx.appcompat.app.f$f$a */
        /* loaded from: classes.dex */
        class a extends a0 {
            a() {
            }

            @Override // e.d.p.z
            public void a(View view) {
                f.this.t.setAlpha(1.0f);
                f.this.w.f(null);
                f.this.w = null;
            }

            @Override // e.d.p.a0, e.d.p.z
            public void b(View view) {
                f.this.t.setVisibility(0);
            }
        }

        RunnableC0009f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            fVar.u.showAtLocation(fVar.t, 55, 0, 0);
            f.this.V();
            if (f.this.D0()) {
                f.this.t.setAlpha(0.0f);
                f fVar2 = f.this;
                y b = e.d.p.u.b(fVar2.t);
                b.a(1.0f);
                fVar2.w = b;
                f.this.w.f(new a());
                return;
            }
            f.this.t.setAlpha(1.0f);
            f.this.t.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g extends a0 {
        g() {
        }

        @Override // e.d.p.z
        public void a(View view) {
            f.this.t.setAlpha(1.0f);
            f.this.w.f(null);
            f.this.w = null;
        }

        @Override // e.d.p.a0, e.d.p.z
        public void b(View view) {
            f.this.t.setVisibility(0);
            f.this.t.sendAccessibilityEvent(32);
            if (f.this.t.getParent() instanceof View) {
                e.d.p.u.H((View) f.this.t.getParent());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class h implements m.a {
        h() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void b(androidx.appcompat.view.menu.g gVar, boolean z) {
            f.this.L(gVar);
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean c(androidx.appcompat.view.menu.g gVar) {
            Window.Callback f0 = f.this.f0();
            if (f0 == null) {
                return true;
            }
            f0.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class i implements b.a {
        private b.a a;

        /* loaded from: classes.dex */
        class a extends a0 {
            a() {
            }

            @Override // e.d.p.z
            public void a(View view) {
                f.this.t.setVisibility(8);
                f fVar = f.this;
                PopupWindow popupWindow = fVar.u;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (fVar.t.getParent() instanceof View) {
                    e.d.p.u.H((View) f.this.t.getParent());
                }
                f.this.t.k();
                f.this.w.f(null);
                f fVar2 = f.this;
                fVar2.w = null;
                e.d.p.u.H(fVar2.z);
            }
        }

        public i(b.a aVar) {
            this.a = aVar;
        }

        @Override // e.a.n.b.a
        public boolean a(e.a.n.b bVar, Menu menu) {
            e.d.p.u.H(f.this.z);
            return this.a.a(bVar, menu);
        }

        @Override // e.a.n.b.a
        public boolean b(e.a.n.b bVar, MenuItem menuItem) {
            return this.a.b(bVar, menuItem);
        }

        @Override // e.a.n.b.a
        public boolean c(e.a.n.b bVar, Menu menu) {
            return this.a.c(bVar, menu);
        }

        @Override // e.a.n.b.a
        public void d(e.a.n.b bVar) {
            this.a.d(bVar);
            f fVar = f.this;
            if (fVar.u != null) {
                fVar.f125j.getDecorView().removeCallbacks(f.this.v);
            }
            f fVar2 = f.this;
            if (fVar2.t != null) {
                fVar2.V();
                f fVar3 = f.this;
                y b = e.d.p.u.b(fVar3.t);
                b.a(0.0f);
                fVar3.w = b;
                f.this.w.f(new a());
            }
            f fVar4 = f.this;
            androidx.appcompat.app.d dVar = fVar4.l;
            if (dVar != null) {
                dVar.h(fVar4.s);
            }
            f fVar5 = f.this;
            fVar5.s = null;
            e.d.p.u.H(fVar5.z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class j {
        static Context a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        static void b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i2 = configuration.densityDpi;
            int i3 = configuration2.densityDpi;
            if (i2 != i3) {
                configuration3.densityDpi = i3;
            }
        }
    }

    /* loaded from: classes.dex */
    static class k {
        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class l {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (!locales.equals(locales2)) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class m {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i2 = configuration.colorMode & 3;
            int i3 = configuration2.colorMode;
            if (i2 != (i3 & 3)) {
                configuration3.colorMode |= i3 & 3;
            }
            int i4 = configuration.colorMode & 12;
            int i5 = configuration2.colorMode;
            if (i4 != (i5 & 12)) {
                configuration3.colorMode |= i5 & 12;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class n extends e.a.n.i {
        n(Window.Callback callback) {
            super(callback);
        }

        final ActionMode b(ActionMode.Callback callback) {
            f.a aVar = new f.a(f.this.f124i, callback);
            e.a.n.b F0 = f.this.F0(aVar);
            if (F0 != null) {
                return aVar.e(F0);
            }
            return null;
        }

        @Override // e.a.n.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return f.this.T(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // e.a.n.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || f.this.r0(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // e.a.n.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i2, Menu menu) {
            if (i2 != 0 || (menu instanceof androidx.appcompat.view.menu.g)) {
                return super.onCreatePanelMenu(i2, menu);
            }
            return false;
        }

        @Override // e.a.n.i, android.view.Window.Callback
        public boolean onMenuOpened(int i2, Menu menu) {
            super.onMenuOpened(i2, menu);
            f.this.u0(i2);
            return true;
        }

        @Override // e.a.n.i, android.view.Window.Callback
        public void onPanelClosed(int i2, Menu menu) {
            super.onPanelClosed(i2, menu);
            f.this.v0(i2);
        }

        @Override // e.a.n.i, android.view.Window.Callback
        public boolean onPreparePanel(int i2, View view, Menu menu) {
            androidx.appcompat.view.menu.g gVar = menu instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) menu : null;
            if (i2 == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.a0(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i2, view, menu);
            if (gVar != null) {
                gVar.a0(false);
            }
            return onPreparePanel;
        }

        @Override // e.a.n.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i2) {
            androidx.appcompat.view.menu.g gVar;
            t d0 = f.this.d0(0, true);
            if (d0 == null || (gVar = d0.f139j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i2);
            } else {
                super.onProvideKeyboardShortcuts(list, gVar, i2);
            }
        }

        @Override // e.a.n.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return f.this.m0() ? b(callback) : super.onWindowStartingActionMode(callback);
        }

        @Override // e.a.n.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
            return (!f.this.m0() || i2 != 0) ? super.onWindowStartingActionMode(callback, i2) : b(callback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class o extends p {
        private final PowerManager c;

        o(Context context) {
            super();
            this.c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.f.p
        IntentFilter b() {
            if (Build.VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.f.p
        public int c() {
            return (Build.VERSION.SDK_INT < 21 || !k.a(this.c)) ? 1 : 2;
        }

        @Override // androidx.appcompat.app.f.p
        public void d() {
            f.this.F();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public abstract class p {
        private BroadcastReceiver a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                p.this.d();
            }
        }

        p() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.a;
            if (broadcastReceiver != null) {
                try {
                    f.this.f124i.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.a = null;
            }
        }

        abstract IntentFilter b();

        abstract int c();

        abstract void d();

        void e() {
            a();
            IntentFilter b = b();
            if (b != null && b.countActions() != 0) {
                if (this.a == null) {
                    this.a = new a();
                }
                f.this.f124i.registerReceiver(this.a, b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class q extends p {
        private final androidx.appcompat.app.l c;

        q(androidx.appcompat.app.l lVar) {
            super();
            this.c = lVar;
        }

        @Override // androidx.appcompat.app.f.p
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.f.p
        public int c() {
            return this.c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.f.p
        public void d() {
            f.this.F();
        }
    }

    /* loaded from: classes.dex */
    private static class r {
        static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class s extends ContentFrameLayout {
        public s(Context context) {
            super(context);
        }

        private boolean c(int i2, int i3) {
            return i2 < -5 || i3 < -5 || i2 > getWidth() + 5 || i3 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return f.this.T(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            f.this.N(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i2) {
            setBackgroundDrawable(e.a.k.a.a.d(getContext(), i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static final class t {
        int a;
        int b;
        int c;

        /* renamed from: d  reason: collision with root package name */
        int f133d;

        /* renamed from: e  reason: collision with root package name */
        int f134e;

        /* renamed from: f  reason: collision with root package name */
        int f135f;

        /* renamed from: g  reason: collision with root package name */
        ViewGroup f136g;

        /* renamed from: h  reason: collision with root package name */
        View f137h;

        /* renamed from: i  reason: collision with root package name */
        View f138i;

        /* renamed from: j  reason: collision with root package name */
        androidx.appcompat.view.menu.g f139j;

        /* renamed from: k  reason: collision with root package name */
        androidx.appcompat.view.menu.e f140k;
        Context l;
        boolean m;
        boolean n;
        boolean o;
        public boolean p;
        boolean q = false;
        boolean r;
        Bundle s;

        t(int i2) {
            this.a = i2;
        }

        androidx.appcompat.view.menu.n a(m.a aVar) {
            if (this.f139j == null) {
                return null;
            }
            if (this.f140k == null) {
                androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(this.l, e.a.g.f1937j);
                this.f140k = eVar;
                eVar.h(aVar);
                this.f139j.b(this.f140k);
            }
            return this.f140k.c(this.f136g);
        }

        public boolean b() {
            if (this.f137h == null) {
                return false;
            }
            return this.f138i != null || this.f140k.a().getCount() > 0;
        }

        void c(androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.e eVar;
            androidx.appcompat.view.menu.g gVar2 = this.f139j;
            if (gVar != gVar2) {
                if (gVar2 != null) {
                    gVar2.O(this.f140k);
                }
                this.f139j = gVar;
                if (gVar != null && (eVar = this.f140k) != null) {
                    gVar.b(eVar);
                }
            }
        }

        void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(e.a.a.a_res_0x7f030002, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                newTheme.applyStyle(i2, true);
            }
            newTheme.resolveAttribute(e.a.a.D, typedValue, true);
            int i3 = typedValue.resourceId;
            if (i3 == 0) {
                i3 = e.a.i.b;
            }
            newTheme.applyStyle(i3, true);
            e.a.n.d dVar = new e.a.n.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(e.a.j.u0);
            this.b = obtainStyledAttributes.getResourceId(e.a.j.x0, 0);
            this.f135f = obtainStyledAttributes.getResourceId(e.a.j.w0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class u implements m.a {
        u() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void b(androidx.appcompat.view.menu.g gVar, boolean z) {
            androidx.appcompat.view.menu.g D = gVar.D();
            boolean z2 = D != gVar;
            f fVar = f.this;
            if (z2) {
                gVar = D;
            }
            t Y = fVar.Y(gVar);
            if (Y == null) {
                return;
            }
            if (z2) {
                f.this.K(Y.a, Y, D);
                f.this.O(Y, true);
                return;
            }
            f.this.O(Y, z);
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean c(androidx.appcompat.view.menu.g gVar) {
            Window.Callback f0;
            if (gVar != gVar.D()) {
                return true;
            }
            f fVar = f.this;
            if (!fVar.E || (f0 = fVar.f0()) == null || f.this.Q) {
                return true;
            }
            f0.onMenuOpened(108, gVar);
            return true;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        boolean z = false;
        boolean z2 = i2 < 21;
        g0 = z2;
        h0 = new int[]{16842836};
        i0 = !"robolectric".equals(Build.FINGERPRINT);
        if (i2 >= 17) {
            z = true;
        }
        j0 = z;
        if (z2 && !k0) {
            Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
            k0 = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(Activity activity, androidx.appcompat.app.d dVar) {
        this(activity, null, dVar, activity);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(Dialog dialog, androidx.appcompat.app.d dVar) {
        this(dialog.getContext(), dialog.getWindow(), dVar, dialog);
    }

    private f(Context context, Window window, androidx.appcompat.app.d dVar, Object obj) {
        e.c.g<String, Integer> gVar;
        Integer num;
        androidx.appcompat.app.c I0;
        this.w = null;
        this.x = true;
        this.R = -100;
        this.Z = new b();
        this.f124i = context;
        this.l = dVar;
        this.f123h = obj;
        if ((obj instanceof Dialog) && (I0 = I0()) != null) {
            this.R = I0.A().k();
        }
        if (this.R == -100 && (num = (gVar = f0).get(obj.getClass().getName())) != null) {
            this.R = num.intValue();
            gVar.remove(obj.getClass().getName());
        }
        if (window != null) {
            I(window);
        }
        androidx.appcompat.widget.j.h();
    }

    private boolean A0(t tVar, KeyEvent keyEvent) {
        d0 d0Var;
        d0 d0Var2;
        d0 d0Var3;
        d0 d0Var4;
        if (this.Q) {
            return false;
        }
        if (tVar.m) {
            return true;
        }
        t tVar2 = this.L;
        if (!(tVar2 == null || tVar2 == tVar)) {
            O(tVar2, false);
        }
        Window.Callback f02 = f0();
        if (f02 != null) {
            tVar.f138i = f02.onCreatePanelView(tVar.a);
        }
        int i2 = tVar.a;
        boolean z = i2 == 0 || i2 == 108;
        if (z && (d0Var4 = this.p) != null) {
            d0Var4.f();
        }
        if (tVar.f138i == null) {
            if (z) {
                y0();
            }
            androidx.appcompat.view.menu.g gVar = tVar.f139j;
            if (gVar == null || tVar.r) {
                if (gVar == null && (!j0(tVar) || tVar.f139j == null)) {
                    return false;
                }
                if (z && (d0Var3 = this.p) != null) {
                    if (this.q == null) {
                        this.q = new h();
                    }
                    d0Var3.a(tVar.f139j, this.q);
                }
                tVar.f139j.d0();
                if (!f02.onCreatePanelMenu(tVar.a, tVar.f139j)) {
                    tVar.c(null);
                    if (z && (d0Var2 = this.p) != null) {
                        d0Var2.a(null, this.q);
                    }
                    return false;
                }
                tVar.r = false;
            }
            tVar.f139j.d0();
            Bundle bundle = tVar.s;
            if (bundle != null) {
                tVar.f139j.P(bundle);
                tVar.s = null;
            }
            if (!f02.onPreparePanel(0, tVar.f138i, tVar.f139j)) {
                if (z && (d0Var = this.p) != null) {
                    d0Var.a(null, this.q);
                }
                tVar.f139j.c0();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            tVar.p = z2;
            tVar.f139j.setQwertyMode(z2);
            tVar.f139j.c0();
        }
        tVar.m = true;
        tVar.n = false;
        this.L = tVar;
        return true;
    }

    private void B0(boolean z) {
        d0 d0Var = this.p;
        if (d0Var == null || !d0Var.g() || (ViewConfiguration.get(this.f124i).hasPermanentMenuKey() && !this.p.b())) {
            t d0 = d0(0, true);
            d0.q = true;
            O(d0, false);
            x0(d0, null);
            return;
        }
        Window.Callback f02 = f0();
        if (this.p.c() && z) {
            this.p.d();
            if (!this.Q) {
                f02.onPanelClosed(108, d0(0, true).f139j);
            }
        } else if (f02 != null && !this.Q) {
            if (this.X && (this.Y & 1) != 0) {
                this.f125j.getDecorView().removeCallbacks(this.Z);
                this.Z.run();
            }
            t d02 = d0(0, true);
            androidx.appcompat.view.menu.g gVar = d02.f139j;
            if (gVar != null && !d02.r && f02.onPreparePanel(0, d02.f138i, gVar)) {
                f02.onMenuOpened(108, d02.f139j);
                this.p.e();
            }
        }
    }

    private int C0(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i2 != 9) {
            return i2;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    private boolean E0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f125j.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || e.d.p.u.x((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private boolean G(boolean z) {
        if (this.Q) {
            return false;
        }
        int J = J();
        boolean J0 = J0(n0(this.f124i, J), z);
        if (J == 0) {
            c0(this.f124i).e();
        } else {
            p pVar = this.V;
            if (pVar != null) {
                pVar.a();
            }
        }
        if (J == 3) {
            b0(this.f124i).e();
        } else {
            p pVar2 = this.W;
            if (pVar2 != null) {
                pVar2.a();
            }
        }
        return J0;
    }

    private void H() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.z.findViewById(16908290);
        View decorView = this.f125j.getDecorView();
        contentFrameLayout.b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f124i.obtainStyledAttributes(e.a.j.u0);
        obtainStyledAttributes.getValue(e.a.j.G0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(e.a.j.H0, contentFrameLayout.getMinWidthMinor());
        int i2 = e.a.j.E0;
        if (obtainStyledAttributes.hasValue(i2)) {
            obtainStyledAttributes.getValue(i2, contentFrameLayout.getFixedWidthMajor());
        }
        int i3 = e.a.j.F0;
        if (obtainStyledAttributes.hasValue(i3)) {
            obtainStyledAttributes.getValue(i3, contentFrameLayout.getFixedWidthMinor());
        }
        int i4 = e.a.j.C0;
        if (obtainStyledAttributes.hasValue(i4)) {
            obtainStyledAttributes.getValue(i4, contentFrameLayout.getFixedHeightMajor());
        }
        int i5 = e.a.j.D0;
        if (obtainStyledAttributes.hasValue(i5)) {
            obtainStyledAttributes.getValue(i5, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void H0() {
        if (this.y) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private void I(Window window) {
        if (this.f125j == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof n)) {
                n nVar = new n(callback);
                this.f126k = nVar;
                window.setCallback(nVar);
                x0 t2 = x0.t(this.f124i, null, h0);
                Drawable g2 = t2.g(0);
                if (g2 != null) {
                    window.setBackgroundDrawable(g2);
                }
                t2.v();
                this.f125j = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    private androidx.appcompat.app.c I0() {
        for (Context context = this.f124i; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof androidx.appcompat.app.c) {
                return (androidx.appcompat.app.c) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private int J() {
        int i2 = this.R;
        return i2 != -100 ? i2 : androidx.appcompat.app.e.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean J0(int i2, boolean z) {
        boolean z2;
        Configuration P = P(this.f124i, i2, null);
        boolean l0 = l0();
        int i3 = this.f124i.getResources().getConfiguration().uiMode & 48;
        int i4 = P.uiMode & 48;
        boolean z3 = true;
        if (i3 != i4 && z && !l0 && this.N && (i0 || this.O)) {
            Object obj = this.f123h;
            if ((obj instanceof Activity) && !((Activity) obj).isChild()) {
                androidx.core.app.a.o((Activity) this.f123h);
                z2 = true;
                if (!z2 || i3 == i4) {
                    z3 = z2;
                } else {
                    K0(i4, l0, null);
                }
                if (z3) {
                    Object obj2 = this.f123h;
                    if (obj2 instanceof androidx.appcompat.app.c) {
                        ((androidx.appcompat.app.c) obj2).E(i2);
                    }
                }
                return z3;
            }
        }
        z2 = false;
        if (!z2) {
        }
        z3 = z2;
        if (z3) {
        }
        return z3;
    }

    private void K0(int i2, boolean z, Configuration configuration) {
        Resources resources = this.f124i.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i2 | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration2, null);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 26) {
            androidx.appcompat.app.j.a(resources);
        }
        int i4 = this.S;
        if (i4 != 0) {
            this.f124i.setTheme(i4);
            if (i3 >= 23) {
                this.f124i.getTheme().applyStyle(this.S, true);
            }
        }
        if (z) {
            Object obj = this.f123h;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof androidx.lifecycle.g) {
                    if (!((androidx.lifecycle.g) activity).a().b().a(d.c.STARTED)) {
                        return;
                    }
                } else if (!this.P) {
                    return;
                }
                activity.onConfigurationChanged(configuration2);
            }
        }
    }

    private void M() {
        p pVar = this.V;
        if (pVar != null) {
            pVar.a();
        }
        p pVar2 = this.W;
        if (pVar2 != null) {
            pVar2.a();
        }
    }

    private void M0(View view) {
        int i2;
        Context context;
        if ((e.d.p.u.u(view) & 8192) != 0) {
            context = this.f124i;
            i2 = e.a.c.b;
        } else {
            context = this.f124i;
            i2 = e.a.c.a_res_0x7f050005;
        }
        view.setBackgroundColor(androidx.core.content.a.d(context, i2));
    }

    private Configuration P(Context context, int i2, Configuration configuration) {
        int i3 = i2 != 1 ? i2 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    private ViewGroup Q() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f124i.obtainStyledAttributes(e.a.j.u0);
        int i2 = e.a.j.z0;
        if (obtainStyledAttributes.hasValue(i2)) {
            if (obtainStyledAttributes.getBoolean(e.a.j.I0, false)) {
                z(1);
            } else if (obtainStyledAttributes.getBoolean(i2, false)) {
                z(108);
            }
            if (obtainStyledAttributes.getBoolean(e.a.j.A0, false)) {
                z(109);
            }
            if (obtainStyledAttributes.getBoolean(e.a.j.B0, false)) {
                z(10);
            }
            this.H = obtainStyledAttributes.getBoolean(e.a.j.v0, false);
            obtainStyledAttributes.recycle();
            X();
            this.f125j.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f124i);
            if (this.I) {
                viewGroup = (ViewGroup) from.inflate(this.G ? e.a.g.o : e.a.g.n, (ViewGroup) null);
            } else if (this.H) {
                viewGroup = (ViewGroup) from.inflate(e.a.g.f1933f, (ViewGroup) null);
                this.F = false;
                this.E = false;
            } else if (this.E) {
                TypedValue typedValue = new TypedValue();
                this.f124i.getTheme().resolveAttribute(e.a.a.f1914f, typedValue, true);
                viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new e.a.n.d(this.f124i, typedValue.resourceId) : this.f124i).inflate(e.a.g.p, (ViewGroup) null);
                d0 d0Var = (d0) viewGroup.findViewById(e.a.f.p_res_0x7f080057);
                this.p = d0Var;
                d0Var.setWindowCallback(f0());
                if (this.F) {
                    this.p.k(109);
                }
                if (this.C) {
                    this.p.k(2);
                }
                if (this.D) {
                    this.p.k(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                if (Build.VERSION.SDK_INT >= 21) {
                    e.d.p.u.Q(viewGroup, new c());
                } else if (viewGroup instanceof h0) {
                    ((h0) viewGroup).setOnFitSystemWindowsListener(new d());
                }
                if (this.p == null) {
                    this.A = (TextView) viewGroup.findViewById(e.a.f.M);
                }
                d1.c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(e.a.f.b_res_0x7f080029);
                ViewGroup viewGroup2 = (ViewGroup) this.f125j.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
                this.f125j.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new e());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.E + ", windowActionBarOverlay: " + this.F + ", android:windowIsFloating: " + this.H + ", windowActionModeOverlay: " + this.G + ", windowNoTitle: " + this.I + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    private void W() {
        if (!this.y) {
            this.z = Q();
            CharSequence e0 = e0();
            if (!TextUtils.isEmpty(e0)) {
                d0 d0Var = this.p;
                if (d0Var != null) {
                    d0Var.setWindowTitle(e0);
                } else if (y0() != null) {
                    y0().t(e0);
                } else {
                    TextView textView = this.A;
                    if (textView != null) {
                        textView.setText(e0);
                    }
                }
            }
            H();
            w0(this.z);
            this.y = true;
            t d0 = d0(0, false);
            if (this.Q) {
                return;
            }
            if (d0 == null || d0.f139j == null) {
                k0(108);
            }
        }
    }

    private void X() {
        if (this.f125j == null) {
            Object obj = this.f123h;
            if (obj instanceof Activity) {
                I(((Activity) obj).getWindow());
            }
        }
        if (this.f125j == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static Configuration Z(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (!(configuration2 == null || configuration.diff(configuration2) == 0)) {
            float f2 = configuration.fontScale;
            float f3 = configuration2.fontScale;
            if (f2 != f3) {
                configuration3.fontScale = f3;
            }
            int i2 = configuration.mcc;
            int i3 = configuration2.mcc;
            if (i2 != i3) {
                configuration3.mcc = i3;
            }
            int i4 = configuration.mnc;
            int i5 = configuration2.mnc;
            if (i4 != i5) {
                configuration3.mnc = i5;
            }
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 24) {
                l.a(configuration, configuration2, configuration3);
            } else if (!e.d.o.c.a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i7 = configuration.touchscreen;
            int i8 = configuration2.touchscreen;
            if (i7 != i8) {
                configuration3.touchscreen = i8;
            }
            int i9 = configuration.keyboard;
            int i10 = configuration2.keyboard;
            if (i9 != i10) {
                configuration3.keyboard = i10;
            }
            int i11 = configuration.keyboardHidden;
            int i12 = configuration2.keyboardHidden;
            if (i11 != i12) {
                configuration3.keyboardHidden = i12;
            }
            int i13 = configuration.navigation;
            int i14 = configuration2.navigation;
            if (i13 != i14) {
                configuration3.navigation = i14;
            }
            int i15 = configuration.navigationHidden;
            int i16 = configuration2.navigationHidden;
            if (i15 != i16) {
                configuration3.navigationHidden = i16;
            }
            int i17 = configuration.orientation;
            int i18 = configuration2.orientation;
            if (i17 != i18) {
                configuration3.orientation = i18;
            }
            int i19 = configuration.screenLayout & 15;
            int i20 = configuration2.screenLayout;
            if (i19 != (i20 & 15)) {
                configuration3.screenLayout |= i20 & 15;
            }
            int i21 = configuration.screenLayout & 192;
            int i22 = configuration2.screenLayout;
            if (i21 != (i22 & 192)) {
                configuration3.screenLayout |= i22 & 192;
            }
            int i23 = configuration.screenLayout & 48;
            int i24 = configuration2.screenLayout;
            if (i23 != (i24 & 48)) {
                configuration3.screenLayout |= i24 & 48;
            }
            int i25 = configuration.screenLayout & 768;
            int i26 = configuration2.screenLayout;
            if (i25 != (i26 & 768)) {
                configuration3.screenLayout |= i26 & 768;
            }
            if (i6 >= 26) {
                m.a(configuration, configuration2, configuration3);
            }
            int i27 = configuration.uiMode & 15;
            int i28 = configuration2.uiMode;
            if (i27 != (i28 & 15)) {
                configuration3.uiMode |= i28 & 15;
            }
            int i29 = configuration.uiMode & 48;
            int i30 = configuration2.uiMode;
            if (i29 != (i30 & 48)) {
                configuration3.uiMode |= i30 & 48;
            }
            int i31 = configuration.screenWidthDp;
            int i32 = configuration2.screenWidthDp;
            if (i31 != i32) {
                configuration3.screenWidthDp = i32;
            }
            int i33 = configuration.screenHeightDp;
            int i34 = configuration2.screenHeightDp;
            if (i33 != i34) {
                configuration3.screenHeightDp = i34;
            }
            int i35 = configuration.smallestScreenWidthDp;
            int i36 = configuration2.smallestScreenWidthDp;
            if (i35 != i36) {
                configuration3.smallestScreenWidthDp = i36;
            }
            if (i6 >= 17) {
                j.b(configuration, configuration2, configuration3);
            }
        }
        return configuration3;
    }

    private p b0(Context context) {
        if (this.W == null) {
            this.W = new o(context);
        }
        return this.W;
    }

    private p c0(Context context) {
        if (this.V == null) {
            this.V = new q(androidx.appcompat.app.l.a(context));
        }
        return this.V;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void g0() {
        androidx.appcompat.app.a aVar;
        androidx.appcompat.app.m mVar;
        W();
        if (this.E && this.m == null) {
            Object obj = this.f123h;
            if (obj instanceof Activity) {
                mVar = new androidx.appcompat.app.m((Activity) this.f123h, this.F);
            } else {
                if (obj instanceof Dialog) {
                    mVar = new androidx.appcompat.app.m((Dialog) this.f123h);
                }
                aVar = this.m;
                if (aVar == null) {
                    aVar.r(this.a0);
                    return;
                }
                return;
            }
            this.m = mVar;
            aVar = this.m;
            if (aVar == null) {
            }
        }
    }

    private boolean h0(t tVar) {
        View view = tVar.f138i;
        if (view != null) {
            tVar.f137h = view;
            return true;
        } else if (tVar.f139j == null) {
            return false;
        } else {
            if (this.r == null) {
                this.r = new u();
            }
            View view2 = (View) tVar.a(this.r);
            tVar.f137h = view2;
            return view2 != null;
        }
    }

    private boolean i0(t tVar) {
        tVar.d(a0());
        tVar.f136g = new s(tVar.l);
        tVar.c = 81;
        return true;
    }

    private boolean j0(t tVar) {
        Context context = this.f124i;
        int i2 = tVar.a;
        if ((i2 == 0 || i2 == 108) && this.p != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(e.a.a.f1914f, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(e.a.a.f1915g, typedValue, true);
            } else {
                theme.resolveAttribute(e.a.a.f1915g, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                e.a.n.d dVar = new e.a.n.d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
        gVar.R(this);
        tVar.c(gVar);
        return true;
    }

    private void k0(int i2) {
        this.Y = (1 << i2) | this.Y;
        if (!this.X) {
            e.d.p.u.F(this.f125j.getDecorView(), this.Z);
            this.X = true;
        }
    }

    private boolean l0() {
        if (!this.U && (this.f123h instanceof Activity)) {
            PackageManager packageManager = this.f124i.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                int i2 = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f124i, this.f123h.getClass()), i2 >= 29 ? 269221888 : i2 >= 24 ? 786432 : 0);
                this.T = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e2) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                this.T = false;
            }
        }
        this.U = true;
        return this.T;
    }

    private boolean q0(int i2, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        t d0 = d0(i2, true);
        if (!d0.o) {
            return A0(d0, keyEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean t0(int i2, KeyEvent keyEvent) {
        boolean z;
        d0 d0Var;
        if (this.s != null) {
            return false;
        }
        boolean z2 = true;
        t d0 = d0(i2, true);
        if (i2 != 0 || (d0Var = this.p) == null || !d0Var.g() || ViewConfiguration.get(this.f124i).hasPermanentMenuKey()) {
            boolean z3 = d0.o;
            if (z3 || d0.n) {
                O(d0, true);
                z2 = z3;
            } else {
                if (d0.m) {
                    if (d0.r) {
                        d0.m = false;
                        z = A0(d0, keyEvent);
                    } else {
                        z = true;
                    }
                    if (z) {
                        x0(d0, keyEvent);
                    }
                }
                z2 = false;
            }
            if (z2) {
                AudioManager audioManager = (AudioManager) this.f124i.getApplicationContext().getSystemService("audio");
                if (audioManager != null) {
                    audioManager.playSoundEffect(0);
                } else {
                    Log.w("AppCompatDelegate", "Couldn't get audio manager");
                }
            }
            return z2;
        }
        if (!this.p.c()) {
            if (!this.Q && A0(d0, keyEvent)) {
                z2 = this.p.e();
            }
            z2 = false;
        } else {
            z2 = this.p.d();
        }
        if (z2) {
        }
        return z2;
    }

    private void x0(t tVar, KeyEvent keyEvent) {
        int i2;
        ViewGroup.LayoutParams layoutParams;
        if (!tVar.o && !this.Q) {
            if (tVar.a == 0) {
                if ((this.f124i.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Window.Callback f02 = f0();
            if (f02 == null || f02.onMenuOpened(tVar.a, tVar.f139j)) {
                WindowManager windowManager = (WindowManager) this.f124i.getSystemService("window");
                if (windowManager != null && A0(tVar, keyEvent)) {
                    ViewGroup viewGroup = tVar.f136g;
                    if (viewGroup == null || tVar.q) {
                        if (viewGroup == null) {
                            if (!i0(tVar) || tVar.f136g == null) {
                                return;
                            }
                        } else if (tVar.q && viewGroup.getChildCount() > 0) {
                            tVar.f136g.removeAllViews();
                        }
                        if (!h0(tVar) || !tVar.b()) {
                            tVar.q = true;
                            return;
                        }
                        ViewGroup.LayoutParams layoutParams2 = tVar.f137h.getLayoutParams();
                        if (layoutParams2 == null) {
                            layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                        }
                        tVar.f136g.setBackgroundResource(tVar.b);
                        ViewParent parent = tVar.f137h.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).removeView(tVar.f137h);
                        }
                        tVar.f136g.addView(tVar.f137h, layoutParams2);
                        if (!tVar.f137h.hasFocus()) {
                            tVar.f137h.requestFocus();
                        }
                    } else {
                        View view = tVar.f138i;
                        if (!(view == null || (layoutParams = view.getLayoutParams()) == null || layoutParams.width != -1)) {
                            i2 = -1;
                            tVar.n = false;
                            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i2, -2, tVar.f133d, tVar.f134e, 1002, 8519680, -3);
                            layoutParams3.gravity = tVar.c;
                            layoutParams3.windowAnimations = tVar.f135f;
                            windowManager.addView(tVar.f136g, layoutParams3);
                            tVar.o = true;
                            return;
                        }
                    }
                    i2 = -2;
                    tVar.n = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i2, -2, tVar.f133d, tVar.f134e, 1002, 8519680, -3);
                    layoutParams32.gravity = tVar.c;
                    layoutParams32.windowAnimations = tVar.f135f;
                    windowManager.addView(tVar.f136g, layoutParams32);
                    tVar.o = true;
                    return;
                }
                return;
            }
            O(tVar, true);
        }
    }

    private boolean z0(t tVar, int i2, KeyEvent keyEvent, int i3) {
        androidx.appcompat.view.menu.g gVar;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((tVar.m || A0(tVar, keyEvent)) && (gVar = tVar.f139j) != null) {
            z = gVar.performShortcut(i2, keyEvent, i3);
        }
        if (z && (i3 & 1) == 0 && this.p == null) {
            O(tVar, true);
        }
        return z;
    }

    @Override // androidx.appcompat.app.e
    public void A(int i2) {
        W();
        ViewGroup viewGroup = (ViewGroup) this.z.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f124i).inflate(i2, viewGroup);
        this.f126k.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.e
    public void B(View view) {
        W();
        ViewGroup viewGroup = (ViewGroup) this.z.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f126k.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.e
    public void C(View view, ViewGroup.LayoutParams layoutParams) {
        W();
        ViewGroup viewGroup = (ViewGroup) this.z.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f126k.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.e
    public void D(int i2) {
        this.S = i2;
    }

    final boolean D0() {
        ViewGroup viewGroup;
        return this.y && (viewGroup = this.z) != null && e.d.p.u.y(viewGroup);
    }

    @Override // androidx.appcompat.app.e
    public final void E(CharSequence charSequence) {
        this.o = charSequence;
        d0 d0Var = this.p;
        if (d0Var != null) {
            d0Var.setWindowTitle(charSequence);
        } else if (y0() != null) {
            y0().t(charSequence);
        } else {
            TextView textView = this.A;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    public boolean F() {
        return G(true);
    }

    public e.a.n.b F0(b.a aVar) {
        androidx.appcompat.app.d dVar;
        if (aVar != null) {
            e.a.n.b bVar = this.s;
            if (bVar != null) {
                bVar.c();
            }
            i iVar = new i(aVar);
            androidx.appcompat.app.a m2 = m();
            if (m2 != null) {
                e.a.n.b u2 = m2.u(iVar);
                this.s = u2;
                if (!(u2 == null || (dVar = this.l) == null)) {
                    dVar.f(u2);
                }
            }
            if (this.s == null) {
                this.s = G0(iVar);
            }
            return this.s;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    e.a.n.b G0(b.a aVar) {
        e.a.n.b bVar;
        e.a.n.b bVar2;
        androidx.appcompat.app.d dVar;
        Context context;
        V();
        e.a.n.b bVar3 = this.s;
        if (bVar3 != null) {
            bVar3.c();
        }
        if (!(aVar instanceof i)) {
            aVar = new i(aVar);
        }
        androidx.appcompat.app.d dVar2 = this.l;
        if (dVar2 != null && !this.Q) {
            try {
                bVar = dVar2.k(aVar);
            } catch (AbstractMethodError unused) {
            }
            if (bVar == null) {
                this.s = bVar;
            } else {
                boolean z = true;
                if (this.t == null) {
                    if (this.H) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = this.f124i.getTheme();
                        theme.resolveAttribute(e.a.a.f1914f, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Resources.Theme newTheme = this.f124i.getResources().newTheme();
                            newTheme.setTo(theme);
                            newTheme.applyStyle(typedValue.resourceId, true);
                            context = new e.a.n.d(this.f124i, 0);
                            context.getTheme().setTo(newTheme);
                        } else {
                            context = this.f124i;
                        }
                        this.t = new ActionBarContextView(context);
                        PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, e.a.a.f1917i);
                        this.u = popupWindow;
                        androidx.core.widget.h.b(popupWindow, 2);
                        this.u.setContentView(this.t);
                        this.u.setWidth(-1);
                        context.getTheme().resolveAttribute(e.a.a.b_res_0x7f030003, typedValue, true);
                        this.t.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                        this.u.setHeight(-2);
                        this.v = new RunnableC0009f();
                    } else {
                        ViewStubCompat viewStubCompat = (ViewStubCompat) this.z.findViewById(e.a.f.h_res_0x7f080036);
                        if (viewStubCompat != null) {
                            viewStubCompat.setLayoutInflater(LayoutInflater.from(a0()));
                            this.t = (ActionBarContextView) viewStubCompat.a();
                        }
                    }
                }
                if (this.t != null) {
                    V();
                    this.t.k();
                    Context context2 = this.t.getContext();
                    ActionBarContextView actionBarContextView = this.t;
                    if (this.u != null) {
                        z = false;
                    }
                    e.a.n.e eVar = new e.a.n.e(context2, actionBarContextView, aVar, z);
                    if (aVar.c(eVar, eVar.e())) {
                        eVar.k();
                        this.t.h(eVar);
                        this.s = eVar;
                        if (D0()) {
                            this.t.setAlpha(0.0f);
                            y b2 = e.d.p.u.b(this.t);
                            b2.a(1.0f);
                            this.w = b2;
                            b2.f(new g());
                        } else {
                            this.t.setAlpha(1.0f);
                            this.t.setVisibility(0);
                            this.t.sendAccessibilityEvent(32);
                            if (this.t.getParent() instanceof View) {
                                e.d.p.u.H((View) this.t.getParent());
                            }
                        }
                        if (this.u != null) {
                            this.f125j.getDecorView().post(this.v);
                        }
                    } else {
                        this.s = null;
                    }
                }
            }
            bVar2 = this.s;
            if (!(bVar2 == null || (dVar = this.l) == null)) {
                dVar.f(bVar2);
            }
            return this.s;
        }
        bVar = null;
        if (bVar == null) {
        }
        bVar2 = this.s;
        if (bVar2 == null) {
            dVar.f(bVar2);
        }
        return this.s;
    }

    void K(int i2, t tVar, Menu menu) {
        if (menu == null) {
            if (tVar == null && i2 >= 0) {
                t[] tVarArr = this.K;
                if (i2 < tVarArr.length) {
                    tVar = tVarArr[i2];
                }
            }
            if (tVar != null) {
                menu = tVar.f139j;
            }
        }
        if ((tVar == null || tVar.o) && !this.Q) {
            this.f126k.a().onPanelClosed(i2, menu);
        }
    }

    void L(androidx.appcompat.view.menu.g gVar) {
        if (!this.J) {
            this.J = true;
            this.p.l();
            Window.Callback f02 = f0();
            if (f02 != null && !this.Q) {
                f02.onPanelClosed(108, gVar);
            }
            this.J = false;
        }
    }

    final int L0(c0 c0Var, Rect rect) {
        boolean z;
        boolean z2;
        int i2 = 0;
        int k2 = c0Var != null ? c0Var.k() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.t;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.t.getLayoutParams();
            boolean z3 = true;
            if (this.t.isShown()) {
                if (this.b0 == null) {
                    this.b0 = new Rect();
                    this.c0 = new Rect();
                }
                Rect rect2 = this.b0;
                Rect rect3 = this.c0;
                if (c0Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(c0Var.i(), c0Var.k(), c0Var.j(), c0Var.h());
                }
                d1.a(this.z, rect2, rect3);
                int i3 = rect2.top;
                int i4 = rect2.left;
                int i5 = rect2.right;
                c0 r2 = e.d.p.u.r(this.z);
                int i6 = r2 == null ? 0 : r2.i();
                int j2 = r2 == null ? 0 : r2.j();
                if (marginLayoutParams.topMargin == i3 && marginLayoutParams.leftMargin == i4 && marginLayoutParams.rightMargin == i5) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i3;
                    marginLayoutParams.leftMargin = i4;
                    marginLayoutParams.rightMargin = i5;
                    z2 = true;
                }
                if (i3 <= 0 || this.B != null) {
                    View view = this.B;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i7 = marginLayoutParams2.height;
                        int i8 = marginLayoutParams.topMargin;
                        if (!(i7 == i8 && marginLayoutParams2.leftMargin == i6 && marginLayoutParams2.rightMargin == j2)) {
                            marginLayoutParams2.height = i8;
                            marginLayoutParams2.leftMargin = i6;
                            marginLayoutParams2.rightMargin = j2;
                            this.B.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f124i);
                    this.B = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i6;
                    layoutParams.rightMargin = j2;
                    this.z.addView(this.B, -1, layoutParams);
                }
                View view3 = this.B;
                if (view3 == null) {
                    z3 = false;
                }
                if (z3 && view3.getVisibility() != 0) {
                    M0(this.B);
                }
                if (!this.G && z3) {
                    k2 = 0;
                }
                z = z3;
                z3 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                this.t.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.B;
        if (view4 != null) {
            if (!z) {
                i2 = 8;
            }
            view4.setVisibility(i2);
        }
        return k2;
    }

    void N(int i2) {
        O(d0(i2, true), true);
    }

    void O(t tVar, boolean z) {
        ViewGroup viewGroup;
        d0 d0Var;
        if (!z || tVar.a != 0 || (d0Var = this.p) == null || !d0Var.c()) {
            WindowManager windowManager = (WindowManager) this.f124i.getSystemService("window");
            if (!(windowManager == null || !tVar.o || (viewGroup = tVar.f136g) == null)) {
                windowManager.removeView(viewGroup);
                if (z) {
                    K(tVar.a, tVar, null);
                }
            }
            tVar.m = false;
            tVar.n = false;
            tVar.o = false;
            tVar.f137h = null;
            tVar.q = true;
            if (this.L == tVar) {
                this.L = null;
                return;
            }
            return;
        }
        L(tVar.f139j);
    }

    public View R(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        androidx.appcompat.app.h hVar;
        boolean z2 = false;
        if (this.d0 == null) {
            String string = this.f124i.obtainStyledAttributes(e.a.j.u0).getString(e.a.j.y0);
            if (string == null) {
                hVar = new androidx.appcompat.app.h();
            } else {
                try {
                    this.d0 = (androidx.appcompat.app.h) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    hVar = new androidx.appcompat.app.h();
                }
            }
            this.d0 = hVar;
        }
        boolean z3 = g0;
        if (z3) {
            if (this.e0 == null) {
                this.e0 = new androidx.appcompat.app.i();
            }
            if (this.e0.a(attributeSet)) {
                z = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    z2 = E0((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    z2 = true;
                }
                z = z2;
            }
        } else {
            z = false;
        }
        return this.d0.q(view, str, context, attributeSet, z, z3, true, c1.b());
    }

    void S() {
        androidx.appcompat.view.menu.g gVar;
        d0 d0Var = this.p;
        if (d0Var != null) {
            d0Var.l();
        }
        if (this.u != null) {
            this.f125j.getDecorView().removeCallbacks(this.v);
            if (this.u.isShowing()) {
                try {
                    this.u.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.u = null;
        }
        V();
        t d0 = d0(0, false);
        if (d0 != null && (gVar = d0.f139j) != null) {
            gVar.close();
        }
    }

    boolean T(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f123h;
        boolean z = true;
        if (((obj instanceof f.a) || (obj instanceof androidx.appcompat.app.g)) && (decorView = this.f125j.getDecorView()) != null && e.d.p.f.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f126k.a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        return z ? p0(keyCode, keyEvent) : s0(keyCode, keyEvent);
    }

    void U(int i2) {
        t d0;
        t d02 = d0(i2, true);
        if (d02.f139j != null) {
            Bundle bundle = new Bundle();
            d02.f139j.Q(bundle);
            if (bundle.size() > 0) {
                d02.s = bundle;
            }
            d02.f139j.d0();
            d02.f139j.clear();
        }
        d02.r = true;
        d02.q = true;
        if ((i2 == 108 || i2 == 0) && this.p != null && (d0 = d0(0, false)) != null) {
            d0.m = false;
            A0(d0, null);
        }
    }

    void V() {
        y yVar = this.w;
        if (yVar != null) {
            yVar.b();
        }
    }

    t Y(Menu menu) {
        t[] tVarArr = this.K;
        int length = tVarArr != null ? tVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            t tVar = tVarArr[i2];
            if (tVar != null && tVar.f139j == menu) {
                return tVar;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        t Y;
        Window.Callback f02 = f0();
        if (f02 == null || this.Q || (Y = Y(gVar.D())) == null) {
            return false;
        }
        return f02.onMenuItemSelected(Y.a, menuItem);
    }

    final Context a0() {
        androidx.appcompat.app.a m2 = m();
        Context k2 = m2 != null ? m2.k() : null;
        return k2 == null ? this.f124i : k2;
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void b(androidx.appcompat.view.menu.g gVar) {
        B0(true);
    }

    @Override // androidx.appcompat.app.e
    public void d(View view, ViewGroup.LayoutParams layoutParams) {
        W();
        ((ViewGroup) this.z.findViewById(16908290)).addView(view, layoutParams);
        this.f126k.a().onContentChanged();
    }

    protected t d0(int i2, boolean z) {
        t[] tVarArr = this.K;
        if (tVarArr == null || tVarArr.length <= i2) {
            t[] tVarArr2 = new t[i2 + 1];
            if (tVarArr != null) {
                System.arraycopy(tVarArr, 0, tVarArr2, 0, tVarArr.length);
            }
            this.K = tVarArr2;
            tVarArr = tVarArr2;
        }
        t tVar = tVarArr[i2];
        if (tVar != null) {
            return tVar;
        }
        t tVar2 = new t(i2);
        tVarArr[i2] = tVar2;
        return tVar2;
    }

    final CharSequence e0() {
        Object obj = this.f123h;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.o;
    }

    @Override // androidx.appcompat.app.e
    public Context f(Context context) {
        boolean z = true;
        this.N = true;
        int n0 = n0(context, J());
        Configuration configuration = null;
        if (j0 && (context instanceof ContextThemeWrapper)) {
            try {
                r.a((ContextThemeWrapper) context, P(context, n0, null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof e.a.n.d) {
            try {
                ((e.a.n.d) context).a(P(context, n0, null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!i0) {
            super.f(context);
            return context;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = j.a(context, configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = Z(configuration3, configuration4);
            }
        }
        Configuration P = P(context, n0, configuration);
        e.a.n.d dVar = new e.a.n.d(context, e.a.i.c);
        dVar.a(P);
        boolean z2 = false;
        try {
            if (context.getTheme() == null) {
                z = false;
            }
            z2 = z;
        } catch (NullPointerException unused3) {
        }
        if (z2) {
            f.d.a(dVar.getTheme());
        }
        super.f(dVar);
        return dVar;
    }

    final Window.Callback f0() {
        return this.f125j.getCallback();
    }

    @Override // androidx.appcompat.app.e
    public <T extends View> T i(int i2) {
        W();
        return (T) this.f125j.findViewById(i2);
    }

    @Override // androidx.appcompat.app.e
    public int k() {
        return this.R;
    }

    @Override // androidx.appcompat.app.e
    public MenuInflater l() {
        if (this.n == null) {
            g0();
            androidx.appcompat.app.a aVar = this.m;
            this.n = new e.a.n.g(aVar != null ? aVar.k() : this.f124i);
        }
        return this.n;
    }

    @Override // androidx.appcompat.app.e
    public androidx.appcompat.app.a m() {
        g0();
        return this.m;
    }

    public boolean m0() {
        return this.x;
    }

    @Override // androidx.appcompat.app.e
    public void n() {
        LayoutInflater from = LayoutInflater.from(this.f124i);
        if (from.getFactory() == null) {
            e.d.p.g.b(from, this);
        } else if (!(from.getFactory2() instanceof f)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    int n0(Context context, int i2) {
        p c0;
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 != 0) {
                if (!(i2 == 1 || i2 == 2)) {
                    if (i2 == 3) {
                        c0 = b0(context);
                    } else {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                c0 = c0(context);
            }
            return c0.c();
        }
        return i2;
    }

    @Override // androidx.appcompat.app.e
    public void o() {
        androidx.appcompat.app.a m2 = m();
        if (m2 == null || !m2.l()) {
            k0(0);
        }
    }

    boolean o0() {
        e.a.n.b bVar = this.s;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        androidx.appcompat.app.a m2 = m();
        return m2 != null && m2.h();
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return R(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.e
    public void p(Configuration configuration) {
        androidx.appcompat.app.a m2;
        if (this.E && this.y && (m2 = m()) != null) {
            m2.m(configuration);
        }
        androidx.appcompat.widget.j.b().g(this.f124i);
        G(false);
    }

    boolean p0(int i2, KeyEvent keyEvent) {
        boolean z = true;
        if (i2 == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z = false;
            }
            this.M = z;
        } else if (i2 == 82) {
            q0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.e
    public void q(Bundle bundle) {
        this.N = true;
        G(false);
        X();
        Object obj = this.f123h;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = androidx.core.app.h.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                androidx.appcompat.app.a y0 = y0();
                if (y0 == null) {
                    this.a0 = true;
                } else {
                    y0.r(true);
                }
            }
            androidx.appcompat.app.e.c(this);
        }
        this.O = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    @Override // androidx.appcompat.app.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void r() {
        androidx.appcompat.app.a aVar;
        if (this.f123h instanceof Activity) {
            androidx.appcompat.app.e.x(this);
        }
        if (this.X) {
            this.f125j.getDecorView().removeCallbacks(this.Z);
        }
        this.P = false;
        this.Q = true;
        if (this.R != -100) {
            Object obj = this.f123h;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f0.put(this.f123h.getClass().getName(), Integer.valueOf(this.R));
                aVar = this.m;
                if (aVar != null) {
                    aVar.n();
                }
                M();
            }
        }
        f0.remove(this.f123h.getClass().getName());
        aVar = this.m;
        if (aVar != null) {
        }
        M();
    }

    boolean r0(int i2, KeyEvent keyEvent) {
        androidx.appcompat.app.a m2 = m();
        if (m2 != null && m2.o(i2, keyEvent)) {
            return true;
        }
        t tVar = this.L;
        if (tVar == null || !z0(tVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.L == null) {
                t d0 = d0(0, true);
                A0(d0, keyEvent);
                boolean z0 = z0(d0, keyEvent.getKeyCode(), keyEvent, 1);
                d0.m = false;
                if (z0) {
                    return true;
                }
            }
            return false;
        }
        t tVar2 = this.L;
        if (tVar2 != null) {
            tVar2.n = true;
        }
        return true;
    }

    @Override // androidx.appcompat.app.e
    public void s(Bundle bundle) {
        W();
    }

    boolean s0(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            boolean z = this.M;
            this.M = false;
            t d0 = d0(0, false);
            if (d0 != null && d0.o) {
                if (!z) {
                    O(d0, true);
                }
                return true;
            } else if (o0()) {
                return true;
            }
        } else if (i2 == 82) {
            t0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.e
    public void t() {
        androidx.appcompat.app.a m2 = m();
        if (m2 != null) {
            m2.s(true);
        }
    }

    @Override // androidx.appcompat.app.e
    public void u(Bundle bundle) {
    }

    void u0(int i2) {
        androidx.appcompat.app.a m2;
        if (i2 == 108 && (m2 = m()) != null) {
            m2.i(true);
        }
    }

    @Override // androidx.appcompat.app.e
    public void v() {
        this.P = true;
        F();
    }

    void v0(int i2) {
        if (i2 == 108) {
            androidx.appcompat.app.a m2 = m();
            if (m2 != null) {
                m2.i(false);
            }
        } else if (i2 == 0) {
            t d0 = d0(i2, true);
            if (d0.o) {
                O(d0, false);
            }
        }
    }

    @Override // androidx.appcompat.app.e
    public void w() {
        this.P = false;
        androidx.appcompat.app.a m2 = m();
        if (m2 != null) {
            m2.s(false);
        }
    }

    void w0(ViewGroup viewGroup) {
    }

    final androidx.appcompat.app.a y0() {
        return this.m;
    }

    @Override // androidx.appcompat.app.e
    public boolean z(int i2) {
        int C0 = C0(i2);
        if (this.I && C0 == 108) {
            return false;
        }
        if (this.E && C0 == 1) {
            this.E = false;
        }
        if (C0 == 1) {
            H0();
            this.I = true;
            return true;
        } else if (C0 == 2) {
            H0();
            this.C = true;
            return true;
        } else if (C0 == 5) {
            H0();
            this.D = true;
            return true;
        } else if (C0 == 10) {
            H0();
            this.G = true;
            return true;
        } else if (C0 == 108) {
            H0();
            this.E = true;
            return true;
        } else if (C0 != 109) {
            return this.f125j.requestFeature(C0);
        } else {
            H0();
            this.F = true;
            return true;
        }
    }
}

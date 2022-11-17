package e.d.p;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import e.c.g;
/* loaded from: classes.dex */
public final class d0 {
    private final e a;

    /* loaded from: classes.dex */
    private static class a extends e {
        protected final Window a;

        a(Window window, View view) {
            this.a = window;
        }

        protected void c(int i2) {
            View decorView = this.a.getDecorView();
            decorView.setSystemUiVisibility(i2 | decorView.getSystemUiVisibility());
        }

        protected void d(int i2) {
            this.a.addFlags(i2);
        }

        protected void e(int i2) {
            View decorView = this.a.getDecorView();
            decorView.setSystemUiVisibility((~i2) & decorView.getSystemUiVisibility());
        }

        protected void f(int i2) {
            this.a.clearFlags(i2);
        }
    }

    /* loaded from: classes.dex */
    private static class b extends a {
        b(Window window, View view) {
            super(window, view);
        }

        @Override // e.d.p.d0.e
        public void b(boolean z) {
            if (z) {
                f(67108864);
                d(Integer.MIN_VALUE);
                c(8192);
                return;
            }
            e(8192);
        }
    }

    /* loaded from: classes.dex */
    private static class c extends b {
        c(Window window, View view) {
            super(window, view);
        }

        @Override // e.d.p.d0.e
        public void a(boolean z) {
            if (z) {
                f(134217728);
                d(Integer.MIN_VALUE);
                c(16);
                return;
            }
            e(16);
        }
    }

    /* loaded from: classes.dex */
    private static class d extends e {
        final WindowInsetsController a;

        d(Window window, d0 d0Var) {
            this(window.getInsetsController(), d0Var);
        }

        d(WindowInsetsController windowInsetsController, d0 d0Var) {
            new g();
            this.a = windowInsetsController;
        }

        @Override // e.d.p.d0.e
        public void a(boolean z) {
            if (z) {
                this.a.setSystemBarsAppearance(16, 16);
            } else {
                this.a.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // e.d.p.d0.e
        public void b(boolean z) {
            if (z) {
                this.a.setSystemBarsAppearance(8, 8);
            } else {
                this.a.setSystemBarsAppearance(0, 8);
            }
        }
    }

    /* loaded from: classes.dex */
    private static class e {
        e() {
        }

        public void a(boolean z) {
        }

        public void b(boolean z) {
        }
    }

    public d0(Window window, View view) {
        e aVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.a = new d(window, this);
            return;
        }
        if (i2 >= 26) {
            aVar = new c(window, view);
        } else if (i2 >= 23) {
            aVar = new b(window, view);
        } else if (i2 >= 20) {
            aVar = new a(window, view);
        } else {
            this.a = new e();
            return;
        }
        this.a = aVar;
    }

    public void a(boolean z) {
        this.a.a(z);
    }

    public void b(boolean z) {
        this.a.b(z);
    }
}

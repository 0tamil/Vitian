package e.d.m;

import android.graphics.Typeface;
import android.os.Handler;
import e.d.m.e;
import e.d.m.f;
/* loaded from: classes.dex */
class a {
    private final f.c a;
    private final Handler b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e.d.m.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0067a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f.c f2078e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Typeface f2079f;

        RunnableC0067a(a aVar, f.c cVar, Typeface typeface) {
            this.f2078e = cVar;
            this.f2079f = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2078e.b(this.f2079f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f.c f2080e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f2081f;

        b(a aVar, f.c cVar, int i2) {
            this.f2080e = cVar;
            this.f2081f = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2080e.a(this.f2081f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(f.c cVar, Handler handler) {
        this.a = cVar;
        this.b = handler;
    }

    private void a(int i2) {
        this.b.post(new b(this, this.a, i2));
    }

    private void c(Typeface typeface) {
        this.b.post(new RunnableC0067a(this, this.a, typeface));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(e.C0068e eVar) {
        if (eVar.a()) {
            c(eVar.a);
        } else {
            a(eVar.b);
        }
    }
}

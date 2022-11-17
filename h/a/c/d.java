package h.a.c;

import android.app.Activity;
import android.app.Application;
import h.a.a;
/* loaded from: classes.dex */
public class d extends Application {

    /* renamed from: e  reason: collision with root package name */
    private Activity f2875e = null;

    public Activity a() {
        return this.f2875e;
    }

    public void b(Activity activity) {
        this.f2875e = activity;
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        a.e().c().p(this);
    }
}

package f.f.a;

import android.content.Context;
import android.os.Build;
import f.f.a.d.d;
import h.a.d.a.j;
import h.a.d.a.k;
import io.flutter.embedding.engine.i.a;
/* loaded from: classes.dex */
public class e implements a, k.c {

    /* renamed from: e  reason: collision with root package name */
    private Context f2862e;

    @Override // io.flutter.embedding.engine.i.a
    public void onAttachedToEngine(a.b bVar) {
        this.f2862e = bVar.a();
        new k(bVar.b(), "safe_device").e(this);
    }

    @Override // io.flutter.embedding.engine.i.a
    public void onDetachedFromEngine(a.b bVar) {
        this.f2862e = null;
    }

    @Override // h.a.d.a.k.c
    public void onMethodCall(j jVar, k.d dVar) {
        boolean a;
        Object valueOf;
        if (jVar.a.equals("getPlatformVersion")) {
            valueOf = "Android " + Build.VERSION.RELEASE;
        } else {
            if (jVar.a.equals("isJailBroken")) {
                a = d.a(this.f2862e);
            } else if (jVar.a.equals("isRealDevice")) {
                a = !f.f.a.b.a.a();
            } else if (jVar.a.equals("isOnExternalStorage")) {
                a = f.f.a.c.a.a(this.f2862e);
            } else if (jVar.a.equals("isDevelopmentModeEnable")) {
                a = f.f.a.a.a.a(this.f2862e);
            } else {
                dVar.c();
                return;
            }
            valueOf = Boolean.valueOf(a);
        }
        dVar.b(valueOf);
    }
}

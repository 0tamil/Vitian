package f.a.a;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import h.a.d.a.d;
import h.a.d.a.j;
import h.a.d.a.k;
import io.flutter.embedding.engine.i.a;
import io.flutter.embedding.engine.i.c.c;
/* loaded from: classes.dex */
public class a implements k.c, io.flutter.embedding.engine.i.a, io.flutter.embedding.engine.i.c.a {

    /* renamed from: e  reason: collision with root package name */
    private Activity f2246e;

    /* renamed from: f  reason: collision with root package name */
    private k f2247f;

    private void a(d dVar) {
        k kVar = new k(dVar, "store_redirect");
        this.f2247f = kVar;
        kVar.e(this);
    }

    @Override // io.flutter.embedding.engine.i.c.a
    public void onAttachedToActivity(c cVar) {
        this.f2246e = cVar.d();
    }

    @Override // io.flutter.embedding.engine.i.a
    public void onAttachedToEngine(a.b bVar) {
        a(bVar.b());
    }

    @Override // io.flutter.embedding.engine.i.c.a
    public void onDetachedFromActivity() {
        this.f2246e = null;
    }

    @Override // io.flutter.embedding.engine.i.c.a
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.i.a
    public void onDetachedFromEngine(a.b bVar) {
        this.f2247f.e(null);
        this.f2247f = null;
    }

    @Override // h.a.d.a.k.c
    public void onMethodCall(j jVar, k.d dVar) {
        if (jVar.a.equals("redirect")) {
            String str = (String) jVar.a("android_id");
            if (str == null) {
                str = this.f2246e.getPackageName();
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str));
            intent.addFlags(1208483840);
            this.f2246e.startActivity(intent);
            dVar.b(null);
            return;
        }
        dVar.c();
    }

    @Override // io.flutter.embedding.engine.i.c.a
    public void onReattachedToActivityForConfigChanges(c cVar) {
        onAttachedToActivity(cVar);
    }
}

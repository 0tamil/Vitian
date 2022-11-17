package com.wongpiwat.trust_location;

import android.content.Context;
import h.a.c.a;
import h.a.d.a.j;
import h.a.d.a.k;
import io.flutter.embedding.engine.i.a;
/* loaded from: classes.dex */
public class TrustLocationPlugin extends a implements io.flutter.embedding.engine.i.a, k.c {

    /* renamed from: h  reason: collision with root package name */
    private static b f1880h;

    /* renamed from: i  reason: collision with root package name */
    private static Context f1881i;

    /* renamed from: g  reason: collision with root package name */
    private k f1882g;

    @Override // io.flutter.embedding.engine.i.a
    public void onAttachedToEngine(a.b bVar) {
        k kVar = new k(bVar.b(), "trust_location");
        this.f1882g = kVar;
        kVar.e(new TrustLocationPlugin());
        Context a = bVar.a();
        f1881i = a;
        f1880h = new b(a);
    }

    @Override // io.flutter.embedding.engine.i.a
    public void onDetachedFromEngine(a.b bVar) {
        this.f1882g.e(null);
    }

    @Override // h.a.d.a.k.c
    public void onMethodCall(j jVar, k.d dVar) {
        b bVar;
        Boolean bool = Boolean.TRUE;
        String str = jVar.a;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1902705239:
                if (str.equals("isMockLocation")) {
                    c = 0;
                    break;
                }
                break;
            case 127761145:
                if (str.equals("getLongitude")) {
                    c = 1;
                    break;
                }
                break;
            case 637921762:
                if (str.equals("getLatitude")) {
                    c = 2;
                    break;
                }
                break;
        }
        Object obj = null;
        switch (c) {
            case 0:
                if (!f1880h.l()) {
                    if (f1880h.j() != null && f1880h.k() != null) {
                        obj = Boolean.FALSE;
                        break;
                    } else {
                        f1880h = new b(f1881i);
                    }
                }
                dVar.b(bool);
                return;
            case 1:
                if (f1880h.k() == null) {
                    bVar = new b(f1881i);
                    f1880h = bVar;
                    break;
                } else {
                    obj = f1880h.k();
                    break;
                }
            case 2:
                if (f1880h.j() == null) {
                    bVar = new b(f1881i);
                    f1880h = bVar;
                    break;
                } else {
                    obj = f1880h.j();
                    break;
                }
            default:
                dVar.c();
                return;
        }
        dVar.b(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // h.a.c.a, android.app.Activity
    public void onPause() {
        f1880h.i().B();
        super.onPause();
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        f1880h.i().u(i2, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // h.a.c.a, android.app.Activity
    public void onResume() {
        super.onResume();
        f1880h.i().A();
    }
}

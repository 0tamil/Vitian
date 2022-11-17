package io.flutter.plugins.urllauncher;

import android.os.Bundle;
import android.util.Log;
import h.a.d.a.d;
import h.a.d.a.j;
import h.a.d.a.k;
import io.flutter.plugins.urllauncher.b;
import java.util.Map;
/* loaded from: classes.dex */
final class a implements k.c {

    /* renamed from: e  reason: collision with root package name */
    private final b f3332e;

    /* renamed from: f  reason: collision with root package name */
    private k f3333f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(b bVar) {
        this.f3332e = bVar;
    }

    private static Bundle a(Map<String, String> map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            bundle.putString(str, map.get(str));
        }
        return bundle;
    }

    private void b(k.d dVar, String str) {
        dVar.b(Boolean.valueOf(this.f3332e.a(str)));
    }

    private void c(k.d dVar) {
        this.f3332e.b();
        dVar.b(null);
    }

    private void d(j jVar, k.d dVar, String str) {
        b.a c = this.f3332e.c(str, a((Map) jVar.a("headers")), ((Boolean) jVar.a("useWebView")).booleanValue(), ((Boolean) jVar.a("enableJavaScript")).booleanValue(), ((Boolean) jVar.a("enableDomStorage")).booleanValue());
        if (c == b.a.NO_ACTIVITY) {
            dVar.a("NO_ACTIVITY", "Launching a URL requires a foreground activity.", null);
        } else if (c == b.a.ACTIVITY_NOT_FOUND) {
            dVar.a("ACTIVITY_NOT_FOUND", String.format("No Activity found to handle intent { %s }", str), null);
        } else {
            dVar.b(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(d dVar) {
        if (this.f3333f != null) {
            Log.wtf("MethodCallHandlerImpl", "Setting a method call handler before the last was disposed.");
            f();
        }
        k kVar = new k(dVar, "plugins.flutter.io/url_launcher_android");
        this.f3333f = kVar;
        kVar.e(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        k kVar = this.f3333f;
        if (kVar == null) {
            Log.d("MethodCallHandlerImpl", "Tried to stop listening when no MethodChannel had been initialized.");
            return;
        }
        kVar.e(null);
        this.f3333f = null;
    }

    @Override // h.a.d.a.k.c
    public void onMethodCall(j jVar, k.d dVar) {
        String str = (String) jVar.a("url");
        String str2 = jVar.a;
        str2.hashCode();
        char c = 65535;
        switch (str2.hashCode()) {
            case -1109843021:
                if (str2.equals("launch")) {
                    c = 0;
                    break;
                }
                break;
            case -185306205:
                if (str2.equals("canLaunch")) {
                    c = 1;
                    break;
                }
                break;
            case -121617663:
                if (str2.equals("closeWebView")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                d(jVar, dVar, str);
                return;
            case 1:
                b(dVar, str);
                return;
            case 2:
                c(dVar);
                return;
            default:
                dVar.c();
                return;
        }
    }
}

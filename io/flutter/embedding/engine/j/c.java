package io.flutter.embedding.engine.j;

import h.a.b;
import h.a.d.a.j;
import h.a.d.a.k;
import h.a.d.a.t;
import io.flutter.embedding.engine.f.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class c {
    private final k a;
    private io.flutter.embedding.engine.g.a b = h.a.a.e().a();
    private Map<String, List<k.d>> c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    final k.c f3036d;

    /* loaded from: classes.dex */
    class a implements k.c {
        a() {
        }

        @Override // h.a.d.a.k.c
        public void onMethodCall(j jVar, k.d dVar) {
            String str;
            if (c.this.b != null) {
                String str2 = jVar.a;
                Map map = (Map) jVar.b();
                b.e("DeferredComponentChannel", "Received '" + str2 + "' message.");
                int intValue = ((Integer) map.get("loadingUnitId")).intValue();
                String str3 = (String) map.get("componentName");
                str2.hashCode();
                char c = 65535;
                switch (str2.hashCode()) {
                    case -1004447972:
                        if (str2.equals("uninstallDeferredComponent")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 399701758:
                        if (str2.equals("getDeferredComponentInstallState")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 520962947:
                        if (str2.equals("installDeferredComponent")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        c.this.b.d(intValue, str3);
                        str = null;
                        break;
                    case 1:
                        str = c.this.b.a(intValue, str3);
                        break;
                    case 2:
                        c.this.b.c(intValue, str3);
                        if (!c.this.c.containsKey(str3)) {
                            c.this.c.put(str3, new ArrayList());
                        }
                        ((List) c.this.c.get(str3)).add(dVar);
                        return;
                    default:
                        dVar.c();
                        return;
                }
                dVar.b(str);
            }
        }
    }

    public c(d dVar) {
        a aVar = new a();
        this.f3036d = aVar;
        k kVar = new k(dVar, "flutter/deferredcomponent", t.b);
        this.a = kVar;
        kVar.e(aVar);
    }

    public void c(io.flutter.embedding.engine.g.a aVar) {
        this.b = aVar;
    }
}

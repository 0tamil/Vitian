package io.flutter.plugins.firebase.core;

import androidx.annotation.Keep;
import com.google.firebase.h;
import f.b.a.b.g.i;
import f.b.a.b.g.j;
import f.b.a.b.g.l;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
@Keep
/* loaded from: classes.dex */
public class FlutterFirebasePluginRegistry {
    private static final Map<String, FlutterFirebasePlugin> registeredPlugins = new WeakHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(j jVar) {
        try {
            for (Map.Entry<String, FlutterFirebasePlugin> entry : registeredPlugins.entrySet()) {
                l.a(entry.getValue().didReinitializeFirebaseCore());
            }
            jVar.c(null);
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b(h hVar, j jVar) {
        try {
            Map<String, FlutterFirebasePlugin> map = registeredPlugins;
            HashMap hashMap = new HashMap(map.size());
            for (Map.Entry<String, FlutterFirebasePlugin> entry : map.entrySet()) {
                hashMap.put(entry.getKey(), l.a(entry.getValue().getPluginConstantsForFirebaseApp(hVar)));
            }
            jVar.c(hashMap);
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i<Void> didReinitializeFirebaseCore() {
        final j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.j
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebasePluginRegistry.a(f.b.a.b.g.j.this);
            }
        });
        return jVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i<Map<String, Object>> getPluginConstantsForFirebaseApp(final h hVar) {
        final j jVar = new j();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.i
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebasePluginRegistry.b(h.this, jVar);
            }
        });
        return jVar.a();
    }

    public static void registerPlugin(String str, FlutterFirebasePlugin flutterFirebasePlugin) {
        registeredPlugins.put(str, flutterFirebasePlugin);
    }
}

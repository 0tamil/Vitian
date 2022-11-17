package io.flutter.plugins.firebase.core;

import androidx.annotation.Keep;
import com.google.firebase.h;
import f.b.a.b.g.i;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
@Keep
/* loaded from: classes.dex */
public interface FlutterFirebasePlugin {
    public static final ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

    i<Void> didReinitializeFirebaseCore();

    i<Map<String, Object>> getPluginConstantsForFirebaseApp(h hVar);
}

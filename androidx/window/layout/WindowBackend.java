package androidx.window.layout;

import android.app.Activity;
import e.d.o.a;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public interface WindowBackend {
    void registerLayoutChangeCallback(Activity activity, Executor executor, a<WindowLayoutInfo> aVar);

    void unregisterLayoutChangeCallback(a<WindowLayoutInfo> aVar);
}

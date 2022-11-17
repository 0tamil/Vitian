package io.flutter.embedding.android;

import android.app.Activity;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import androidx.window.layout.WindowLayoutInfo;
import e.d.o.a;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class s {
    final WindowInfoTrackerCallbackAdapter a;

    public s(WindowInfoTrackerCallbackAdapter windowInfoTrackerCallbackAdapter) {
        this.a = windowInfoTrackerCallbackAdapter;
    }

    public void a(Activity activity, Executor executor, a<WindowLayoutInfo> aVar) {
        this.a.addWindowLayoutInfoListener(activity, executor, aVar);
    }

    public void b(a<WindowLayoutInfo> aVar) {
        this.a.removeWindowLayoutInfoListener(aVar);
    }
}

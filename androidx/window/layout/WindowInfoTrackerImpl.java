package androidx.window.layout;

import android.app.Activity;
import j.x.d.e;
import j.x.d.i;
import kotlinx.coroutines.k2.b;
import kotlinx.coroutines.k2.d;
/* loaded from: classes.dex */
public final class WindowInfoTrackerImpl implements WindowInfoTracker {
    private static final int BUFFER_CAPACITY = 10;
    public static final Companion Companion = new Companion(null);
    private final WindowBackend windowBackend;
    private final WindowMetricsCalculator windowMetricsCalculator;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }
    }

    public WindowInfoTrackerImpl(WindowMetricsCalculator windowMetricsCalculator, WindowBackend windowBackend) {
        i.d(windowMetricsCalculator, "windowMetricsCalculator");
        i.d(windowBackend, "windowBackend");
        this.windowMetricsCalculator = windowMetricsCalculator;
        this.windowBackend = windowBackend;
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public b<WindowLayoutInfo> windowLayoutInfo(Activity activity) {
        i.d(activity, "activity");
        return d.a(new WindowInfoTrackerImpl$windowLayoutInfo$1(this, activity, null));
    }
}

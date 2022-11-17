package io.flutter.view;

import android.annotation.TargetApi;
import android.hardware.display.DisplayManager;
import android.view.Choreographer;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;
/* loaded from: classes.dex */
public class j {

    /* renamed from: d  reason: collision with root package name */
    private static j f3417d;

    /* renamed from: e  reason: collision with root package name */
    private static b f3418e;
    private FlutterJNI b;
    private long a = -1;
    private final FlutterJNI.b c = new a();

    /* loaded from: classes.dex */
    class a implements FlutterJNI.b {

        /* renamed from: io.flutter.view.j$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class Choreographer$FrameCallbackC0139a implements Choreographer.FrameCallback {
            final /* synthetic */ long a;

            Choreographer$FrameCallbackC0139a(long j2) {
                this.a = j2;
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j2) {
                long nanoTime = System.nanoTime() - j2;
                j.this.b.onVsync(nanoTime < 0 ? 0L : nanoTime, j.this.a, this.a);
            }
        }

        a() {
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.b
        public void a(long j2) {
            Choreographer.getInstance().postFrameCallback(new Choreographer$FrameCallbackC0139a(j2));
        }
    }

    @TargetApi(17)
    /* loaded from: classes.dex */
    class b implements DisplayManager.DisplayListener {
        private DisplayManager a;

        b(DisplayManager displayManager) {
            this.a = displayManager;
        }

        void a() {
            this.a.registerDisplayListener(this, null);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i2) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i2) {
            if (i2 == 0) {
                float refreshRate = this.a.getDisplay(0).getRefreshRate();
                j.this.a = (long) (1.0E9d / refreshRate);
                j.this.b.setRefreshRateFPS(refreshRate);
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i2) {
        }
    }

    private j(FlutterJNI flutterJNI) {
        this.b = flutterJNI;
    }

    public static j d(float f2, FlutterJNI flutterJNI) {
        if (f3417d == null) {
            f3417d = new j(flutterJNI);
        }
        flutterJNI.setRefreshRateFPS(f2);
        j jVar = f3417d;
        jVar.a = (long) (1.0E9d / f2);
        return jVar;
    }

    @TargetApi(17)
    public static j e(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f3417d == null) {
            f3417d = new j(flutterJNI);
        }
        if (f3418e == null) {
            j jVar = f3417d;
            Objects.requireNonNull(jVar);
            b bVar = new b(displayManager);
            f3418e = bVar;
            bVar.a();
        }
        if (f3417d.a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f3417d.a = (long) (1.0E9d / refreshRate);
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f3417d;
    }

    public void f() {
        this.b.setAsyncWaitForVsyncDelegate(this.c);
    }
}

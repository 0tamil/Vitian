package io.flutter.plugins.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.util.Log;
import com.google.firebase.messaging.w0;
import io.flutter.embedding.engine.e;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
/* loaded from: classes.dex */
public class FlutterFirebaseMessagingBackgroundService extends t {
    private static final List<Intent> m = Collections.synchronizedList(new LinkedList());
    private static p n;

    public static void j(Context context, Intent intent) {
        boolean z = true;
        if (((w0) intent.getExtras().get("notification")).i() != 1) {
            z = false;
        }
        t.d(context, FlutterFirebaseMessagingBackgroundService.class, 2020, intent, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void l() {
        Log.i("FLTFireMsgService", "FlutterFirebaseMessagingBackgroundService started!");
        List<Intent> list = m;
        synchronized (list) {
            for (Intent intent : list) {
                n.b(intent, null);
            }
            m.clear();
        }
    }

    public static void m(long j2) {
        p.m(j2);
    }

    public static void n(long j2) {
        p.n(j2);
    }

    public static void o(long j2, e eVar) {
        if (n != null) {
            Log.w("FLTFireMsgService", "Attempted to start a duplicate background isolate. Returning...");
            return;
        }
        p pVar = new p();
        n = pVar;
        pVar.p(j2, eVar);
    }

    @Override // io.flutter.plugins.firebase.messaging.t
    protected void g(final Intent intent) {
        if (!n.f()) {
            Log.w("FLTFireMsgService", "A background message could not be handled in Dart as no onBackgroundMessage handler has been registered.");
            return;
        }
        List<Intent> list = m;
        synchronized (list) {
            if (n.g()) {
                Log.i("FLTFireMsgService", "Service has not yet started, messages will be queued.");
                list.add(intent);
                return;
            }
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            new Handler(getMainLooper()).post(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.c
                @Override // java.lang.Runnable
                public final void run() {
                    FlutterFirebaseMessagingBackgroundService.n.b(intent, countDownLatch);
                }
            });
            try {
                countDownLatch.await();
            } catch (InterruptedException e2) {
                Log.i("FLTFireMsgService", "Exception waiting to execute Dart callback", e2);
            }
        }
    }

    @Override // io.flutter.plugins.firebase.messaging.t, android.app.Service
    public void onCreate() {
        super.onCreate();
        if (n == null) {
            n = new p();
        }
        n.o();
    }
}

package com.google.firebase.crashlytics.i.h;

import android.os.Bundle;
import com.google.firebase.crashlytics.i.f;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class c implements b, a {
    private final e a;
    private final int b;
    private final TimeUnit c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f1372d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private CountDownLatch f1373e;

    public c(e eVar, int i2, TimeUnit timeUnit) {
        this.a = eVar;
        this.b = i2;
        this.c = timeUnit;
    }

    @Override // com.google.firebase.crashlytics.i.h.a
    public void a(String str, Bundle bundle) {
        synchronized (this.f1372d) {
            f f2 = f.f();
            f2.i("Logging event " + str + " to Firebase Analytics with params " + bundle);
            this.f1373e = new CountDownLatch(1);
            this.a.a(str, bundle);
            f.f().i("Awaiting app exception callback from Analytics...");
            try {
                if (this.f1373e.await(this.b, this.c)) {
                    f.f().i("App exception callback received from Analytics listener.");
                } else {
                    f.f().k("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                }
            } catch (InterruptedException unused) {
                f.f().d("Interrupted while awaiting app exception callback from Analytics listener.");
            }
            this.f1373e = null;
        }
    }
}

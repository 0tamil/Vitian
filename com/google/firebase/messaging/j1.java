package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.firebase.messaging.k1;
import f.b.a.b.g.d;
import f.b.a.b.g.i;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class j1 extends Binder {
    private final a a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        i<Void> a(Intent intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j1(a aVar) {
        this.a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(final k1.a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            this.a.a(aVar.a).c(x.f1843e, new d() { // from class: com.google.firebase.messaging.c0
                @Override // f.b.a.b.g.d
                public final void a(i iVar) {
                    k1.a.this.b();
                }
            });
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}

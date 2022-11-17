package com.google.firebase.messaging;

import android.util.Log;
import f.b.a.b.g.i;
import java.util.Map;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class y0 {
    private final Executor a;
    private final Map<String, i<String>> b = new e.c.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        i<String> start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y0(Executor executor) {
        this.a = executor;
    }

    private /* synthetic */ i b(String str, i iVar) {
        synchronized (this) {
            this.b.remove(str);
        }
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public synchronized i<String> a(final String str, a aVar) {
        i<String> iVar = this.b.get(str);
        if (iVar != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + str);
            }
            return iVar;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: " + str);
        }
        i h2 = aVar.start().h(this.a, new f.b.a.b.g.a() { // from class: com.google.firebase.messaging.z
            @Override // f.b.a.b.g.a
            public final Object a(i iVar2) {
                y0.this.c(str, iVar2);
                return iVar2;
            }
        });
        this.b.put(str, h2);
        return h2;
    }

    public /* synthetic */ i c(String str, i iVar) {
        b(str, iVar);
        return iVar;
    }
}

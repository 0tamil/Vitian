package io.flutter.plugins.firebase.messaging;

import android.content.Intent;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.w0;
import e.j.a.a;
/* loaded from: classes.dex */
public class FlutterFirebaseMessagingService extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void r(w0 w0Var) {
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void t(String str) {
        Intent intent = new Intent("io.flutter.plugins.firebase.messaging.TOKEN");
        intent.putExtra("token", str);
        a.b(getApplicationContext()).d(intent);
    }
}

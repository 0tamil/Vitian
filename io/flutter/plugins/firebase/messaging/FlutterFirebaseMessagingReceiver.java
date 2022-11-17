package io.flutter.plugins.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.firebase.messaging.w0;
import e.j.a.a;
import java.util.HashMap;
/* loaded from: classes.dex */
public class FlutterFirebaseMessagingReceiver extends BroadcastReceiver {
    static HashMap<String, w0> a = new HashMap<>();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Log.d("FLTFireMsgReceiver", "broadcast received for message");
        if (o.a() == null) {
            o.b(context.getApplicationContext());
        }
        if (intent.getExtras() == null) {
            Log.d("FLTFireMsgReceiver", "broadcast received but intent contained no extras to process RemoteMessage. Operation cancelled.");
            return;
        }
        w0 w0Var = new w0(intent.getExtras());
        if (w0Var.h() != null) {
            a.put(w0Var.e(), w0Var);
            r.b().i(w0Var);
        }
        if (s.c(context)) {
            Intent intent2 = new Intent("io.flutter.plugins.firebase.messaging.NOTIFICATION");
            intent2.putExtra("notification", w0Var);
            a.b(context).d(intent2);
            return;
        }
        Intent intent3 = new Intent(context, FlutterFirebaseMessagingBackgroundService.class);
        intent3.putExtra("notification", w0Var);
        FlutterFirebaseMessagingBackgroundService.j(context, intent3);
    }
}

package com.dexterous.flutterlocalnotifications;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class a extends Service {
    private static int a(ArrayList<Integer> arrayList) {
        int intValue = arrayList.get(0).intValue();
        for (int i2 = 1; i2 < arrayList.size(); i2++) {
            intValue |= arrayList.get(i2).intValue();
        }
        return intValue;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        b bVar = (b) intent.getSerializableExtra("com.dexterous.flutterlocalnotifications.ForegroundServiceStartParameter");
        Notification createNotification = FlutterLocalNotificationsPlugin.createNotification(this, bVar.f910e);
        if (bVar.f912g == null || Build.VERSION.SDK_INT < 29) {
            startForeground(bVar.f910e.id.intValue(), createNotification);
        } else {
            startForeground(bVar.f910e.id.intValue(), createNotification, a(bVar.f912g));
        }
        return bVar.f911f;
    }
}

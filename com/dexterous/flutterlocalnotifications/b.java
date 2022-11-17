package com.dexterous.flutterlocalnotifications;

import com.dexterous.flutterlocalnotifications.models.NotificationDetails;
import java.io.Serializable;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class b implements Serializable {

    /* renamed from: e  reason: collision with root package name */
    public final NotificationDetails f910e;

    /* renamed from: f  reason: collision with root package name */
    public final int f911f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList<Integer> f912g;

    public b(NotificationDetails notificationDetails, int i2, ArrayList<Integer> arrayList) {
        this.f910e = notificationDetails;
        this.f911f = i2;
        this.f912g = arrayList;
    }

    public String toString() {
        return "ForegroundServiceStartParameter{notificationData=" + this.f910e + ", startMode=" + this.f911f + ", foregroundServiceTypes=" + this.f912g + '}';
    }
}

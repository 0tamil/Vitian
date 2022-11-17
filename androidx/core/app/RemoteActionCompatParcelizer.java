package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.b;
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(b bVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.a = (IconCompat) bVar.v(remoteActionCompat.a, 1);
        remoteActionCompat.b = bVar.l(remoteActionCompat.b, 2);
        remoteActionCompat.c = bVar.l(remoteActionCompat.c, 3);
        remoteActionCompat.f537d = (PendingIntent) bVar.r(remoteActionCompat.f537d, 4);
        remoteActionCompat.f538e = bVar.h(remoteActionCompat.f538e, 5);
        remoteActionCompat.f539f = bVar.h(remoteActionCompat.f539f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, b bVar) {
        bVar.x(false, false);
        bVar.M(remoteActionCompat.a, 1);
        bVar.D(remoteActionCompat.b, 2);
        bVar.D(remoteActionCompat.c, 3);
        bVar.H(remoteActionCompat.f537d, 4);
        bVar.z(remoteActionCompat.f538e, 5);
        bVar.z(remoteActionCompat.f539f, 6);
    }
}

package f.b.a.b.d.a;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
/* loaded from: classes.dex */
public final class e {
    public static final int a;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (r0.charAt(0) <= 'Z') goto L13;
     */
    static {
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 33554432;
        if (i2 < 31) {
            if (i2 >= 30) {
                String str = Build.VERSION.CODENAME;
                if (str.length() == 1) {
                    if (str.charAt(0) >= 'S') {
                    }
                }
            }
            i3 = 0;
        }
        a = i3;
    }

    public static PendingIntent a(Context context, int i2, Intent intent, int i3) {
        return PendingIntent.getActivity(context, i2, intent, i3);
    }
}

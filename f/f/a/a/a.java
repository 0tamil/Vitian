package f.f.a.a;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
/* loaded from: classes.dex */
public class a {
    public static boolean a(Context context) {
        int i2 = Build.VERSION.SDK_INT;
        return Integer.valueOf(i2).intValue() == 16 ? Settings.Secure.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0 : Integer.valueOf(i2).intValue() >= 17 && Settings.Secure.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0;
    }
}

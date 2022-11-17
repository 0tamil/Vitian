package f.f.a.b;

import android.os.Build;
/* loaded from: classes.dex */
public class a {
    public static boolean a() {
        String str = Build.FINGERPRINT;
        if (!str.startsWith("generic") && !str.startsWith("unknown")) {
            String str2 = Build.MODEL;
            if (!str2.contains("google_sdk") && !str2.contains("Emulator") && !str2.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion") && !str2.startsWith("sdk_")) {
                String str3 = Build.DEVICE;
                if (!str3.startsWith("emulator") && ((!Build.BRAND.startsWith("generic") || !str3.startsWith("generic")) && !"google_sdk".equals(Build.PRODUCT))) {
                    return false;
                }
            }
        }
        return true;
    }
}

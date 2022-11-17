package f.f.a.d;

import java.io.File;
/* loaded from: classes.dex */
public class c implements a {
    private static boolean b(String str) {
        try {
            return Runtime.getRuntime().exec(str).waitFor() == 0;
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean c() {
        String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su"};
        for (int i2 = 0; i2 < 9; i2++) {
            if (new File(strArr[i2]).exists()) {
                return true;
            }
        }
        return false;
    }

    @Override // f.f.a.d.a
    public boolean a() {
        return b("/system/xbin/which su") || c();
    }
}

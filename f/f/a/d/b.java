package f.f.a.d;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
/* loaded from: classes.dex */
public class b implements a {
    private boolean b() {
        String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su"};
        for (int i2 = 0; i2 < 9; i2++) {
            if (new File(strArr[i2]).exists()) {
                return true;
            }
        }
        return false;
    }

    private boolean c() {
        Process process = null;
        try {
            process = Runtime.getRuntime().exec(new String[]{"/system/xbin/which", "su"});
            if (new BufferedReader(new InputStreamReader(process.getInputStream())).readLine() != null) {
                if (process != null) {
                    process.destroy();
                }
                return true;
            }
            if (process != null) {
                process.destroy();
            }
            return false;
        } catch (Throwable unused) {
            if (process != null) {
                process.destroy();
            }
            return false;
        }
    }

    @Override // f.f.a.d.a
    public boolean a() {
        return b() || c();
    }
}

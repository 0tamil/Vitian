package h.a.e;

import android.content.Context;
import android.os.Build;
import java.io.File;
/* loaded from: classes.dex */
public final class a {
    public static String a(Context context) {
        File file;
        if (Build.VERSION.SDK_INT < 21 || (file = context.getCodeCacheDir()) == null) {
            file = context.getCacheDir();
        }
        if (file == null) {
            file = new File(b(context), "cache");
        }
        return file.getPath();
    }

    private static String b(Context context) {
        return Build.VERSION.SDK_INT >= 24 ? context.getDataDir().getPath() : context.getApplicationInfo().dataDir;
    }

    public static String c(Context context) {
        File dir = context.getDir("flutter", 0);
        if (dir == null) {
            dir = new File(b(context), "app_flutter");
        }
        return dir.getPath();
    }

    public static String d(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            filesDir = new File(b(context), "files");
        }
        return filesDir.getPath();
    }
}

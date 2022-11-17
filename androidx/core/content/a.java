package androidx.core.content;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.util.Log;
import android.util.TypedValue;
import java.io.File;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class a {
    private static final Object a = new Object();
    private static final Object b = new Object();
    private static TypedValue c;

    /* renamed from: androidx.core.content.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0016a {
        static void a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        static void b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* loaded from: classes.dex */
    static class b {
        static File[] a(Context context) {
            return context.getExternalCacheDirs();
        }

        static File[] b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        static File[] c(Context context) {
            return context.getObbDirs();
        }
    }

    /* loaded from: classes.dex */
    static class c {
        static File a(Context context) {
            return context.getCodeCacheDir();
        }

        static Drawable b(Context context, int i2) {
            return context.getDrawable(i2);
        }

        static File c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* loaded from: classes.dex */
    static class d {
        static int a(Context context, int i2) {
            return context.getColor(i2);
        }

        static ColorStateList b(Context context, int i2) {
            return context.getColorStateList(i2);
        }

        static <T> T c(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        static String d(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* loaded from: classes.dex */
    static class e {
        static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        static File b(Context context) {
            return context.getDataDir();
        }

        static boolean c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* loaded from: classes.dex */
    static class f {
        static ComponentName a(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    /* loaded from: classes.dex */
    static class g {
        static Executor a(Context context) {
            return context.getMainExecutor();
        }
    }

    public static int a(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    public static Context b(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return e.a(context);
        }
        return null;
    }

    private static File c(File file) {
        synchronized (b) {
            if (!file.exists()) {
                if (file.mkdirs()) {
                    return file;
                }
                Log.w("ContextCompat", "Unable to create files subdir " + file.getPath());
            }
            return file;
        }
    }

    public static int d(Context context, int i2) {
        return Build.VERSION.SDK_INT >= 23 ? d.a(context, i2) : context.getResources().getColor(i2);
    }

    public static ColorStateList e(Context context, int i2) {
        return androidx.core.content.d.f.c(context.getResources(), i2, context.getTheme());
    }

    public static Drawable f(Context context, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 21) {
            return c.b(context, i2);
        }
        if (i3 < 16) {
            synchronized (a) {
                if (c == null) {
                    c = new TypedValue();
                }
                context.getResources().getValue(i2, c, true);
                i2 = c.resourceId;
            }
        }
        return context.getResources().getDrawable(i2);
    }

    public static File[] g(Context context) {
        return Build.VERSION.SDK_INT >= 19 ? b.a(context) : new File[]{context.getExternalCacheDir()};
    }

    public static File[] h(Context context, String str) {
        return Build.VERSION.SDK_INT >= 19 ? b.b(context, str) : new File[]{context.getExternalFilesDir(str)};
    }

    public static Executor i(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? g.a(context) : e.d.l.d.a(new Handler(context.getMainLooper()));
    }

    public static File j(Context context) {
        if (Build.VERSION.SDK_INT >= 21) {
            return c.c(context);
        }
        File file = new File(context.getApplicationInfo().dataDir, "no_backup");
        c(file);
        return file;
    }

    public static boolean k(Context context, Intent[] intentArr, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0016a.a(context, intentArr, bundle);
            return true;
        }
        context.startActivities(intentArr);
        return true;
    }

    public static void l(Context context, Intent intent, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0016a.b(context, intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }

    public static void m(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            f.a(context, intent);
        } else {
            context.startService(intent);
        }
    }
}

package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.o1;
import com.google.android.gms.common.l.c;
import com.google.android.gms.common.util.g;
import f.b.a.b.d.c.d;
/* loaded from: classes.dex */
public class e {
    public static final int a = g.a;

    public void a(Context context) {
        g.a(context);
    }

    @Deprecated
    public Intent b(int i2) {
        return c(null, i2, null);
    }

    public Intent c(Context context, int i2, String str) {
        if (i2 == 1 || i2 == 2) {
            if (context != null && g.c(context)) {
                return o1.a();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("gcore_");
            sb.append(a);
            sb.append("-");
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
            }
            sb.append("-");
            if (context != null) {
                sb.append(context.getPackageName());
            }
            sb.append("-");
            if (context != null) {
                try {
                    sb.append(c.a(context).d(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            return o1.b("com.google.android.gms", sb.toString());
        } else if (i2 != 3) {
            return null;
        } else {
            return o1.c("com.google.android.gms");
        }
    }

    public PendingIntent d(Context context, int i2, int i3) {
        return e(context, i2, i3, null);
    }

    public PendingIntent e(Context context, int i2, int i3, String str) {
        Intent c = c(context, i2, str);
        if (c == null) {
            return null;
        }
        return d.a(context, i3, c, d.a | 134217728);
    }

    public String f(int i2) {
        return g.b(i2);
    }

    public int g(Context context) {
        return h(context, a);
    }

    public int h(Context context, int i2) {
        int d2 = g.d(context, i2);
        if (g.e(context, d2)) {
            return 18;
        }
        return d2;
    }

    public boolean i(Context context, int i2) {
        return g.e(context, i2);
    }

    public boolean j(Context context, String str) {
        return g.h(context, str);
    }

    public boolean k(int i2) {
        return g.g(i2);
    }
}

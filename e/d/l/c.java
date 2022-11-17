package e.d.l;

import android.content.res.Configuration;
import android.os.Build;
/* loaded from: classes.dex */
public final class c {
    public static e a(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? e.d(configuration.getLocales()) : e.a(configuration.locale);
    }
}

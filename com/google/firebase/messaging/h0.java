package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.j;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class h0 {
    private static final AtomicInteger a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* loaded from: classes.dex */
    public static class a {
        public final j.e a;
        public final String b;
        public final int c;

        a(j.e eVar, String str, int i2) {
            this.a = eVar;
            this.b = str;
            this.c = i2;
        }
    }

    private static PendingIntent a(Context context, s0 s0Var, String str, PackageManager packageManager) {
        Intent g2 = g(str, s0Var, packageManager);
        if (g2 == null) {
            return null;
        }
        g2.addFlags(67108864);
        g2.putExtras(s0Var.y());
        if (r(s0Var)) {
            g2.putExtra("gcm.n.analytics_data", s0Var.x());
        }
        return PendingIntent.getActivity(context, h(), g2, m(1073741824));
    }

    private static PendingIntent b(Context context, Context context2, s0 s0Var) {
        if (!r(s0Var)) {
            return null;
        }
        return c(context, context2, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(s0Var.x()));
    }

    private static PendingIntent c(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, h(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context2, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), m(1073741824));
    }

    public static a d(Context context, Context context2, s0 s0Var, String str, Bundle bundle) {
        return e(context, context2, s0Var, str, bundle, context2.getPackageName(), context2.getResources(), context2.getPackageManager());
    }

    public static a e(Context context, Context context2, s0 s0Var, String str, Bundle bundle, String str2, Resources resources, PackageManager packageManager) {
        j.e eVar = new j.e(context2, str);
        String n = s0Var.n(resources, str2, "gcm.n.title");
        if (!TextUtils.isEmpty(n)) {
            eVar.s(n);
        }
        String n2 = s0Var.n(resources, str2, "gcm.n.body");
        if (!TextUtils.isEmpty(n2)) {
            eVar.r(n2);
            j.c cVar = new j.c();
            cVar.x(n2);
            eVar.M(cVar);
        }
        eVar.K(n(packageManager, resources, str2, s0Var.p("gcm.n.icon"), bundle));
        Uri o = o(str2, s0Var, resources);
        if (o != null) {
            eVar.L(o);
        }
        eVar.q(a(context, s0Var, str2, packageManager));
        PendingIntent b = b(context, context2, s0Var);
        if (b != null) {
            eVar.u(b);
        }
        Integer i2 = i(context2, s0Var.p("gcm.n.color"), bundle);
        if (i2 != null) {
            eVar.o(i2.intValue());
        }
        eVar.l(!s0Var.a("gcm.n.sticky"));
        eVar.C(s0Var.a("gcm.n.local_only"));
        String p = s0Var.p("gcm.n.ticker");
        if (p != null) {
            eVar.O(p);
        }
        Integer m = s0Var.m();
        if (m != null) {
            eVar.G(m.intValue());
        }
        Integer r = s0Var.r();
        if (r != null) {
            eVar.S(r.intValue());
        }
        Integer l = s0Var.l();
        if (l != null) {
            eVar.D(l.intValue());
        }
        Long j2 = s0Var.j("gcm.n.event_time");
        if (j2 != null) {
            eVar.J(true);
            eVar.T(j2.longValue());
        }
        long[] q = s0Var.q();
        if (q != null) {
            eVar.R(q);
        }
        int[] e2 = s0Var.e();
        if (e2 != null) {
            eVar.B(e2[0], e2[1], e2[2]);
        }
        eVar.t(j(s0Var));
        return new a(eVar, p(s0Var), 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a f(Context context, s0 s0Var) {
        Bundle k2 = k(context.getPackageManager(), context.getPackageName());
        return d(context, context, s0Var, l(context, s0Var.k(), k2), k2);
    }

    private static Intent g(String str, s0 s0Var, PackageManager packageManager) {
        String p = s0Var.p("gcm.n.click_action");
        if (!TextUtils.isEmpty(p)) {
            Intent intent = new Intent(p);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri f2 = s0Var.f();
        if (f2 != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(f2);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    private static int h() {
        return a.incrementAndGet();
    }

    private static Integer i(Context context, String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                Log.w("FirebaseMessaging", "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i2 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i2 != 0) {
            try {
                return Integer.valueOf(androidx.core.content.a.d(context, i2));
            } catch (Resources.NotFoundException unused2) {
                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            }
        }
        return null;
    }

    private static int j(s0 s0Var) {
        int i2 = s0Var.a("gcm.n.default_sound") ? 1 : 0;
        if (s0Var.a("gcm.n.default_vibrate_timings")) {
            i2 |= 2;
        }
        return s0Var.a("gcm.n.default_light_settings") ? i2 | 4 : i2;
    }

    private static Bundle k(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e2);
        }
        return Bundle.EMPTY;
    }

    @TargetApi(26)
    public static String l(Context context, String str, Bundle bundle) {
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                Log.w("FirebaseMessaging", "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            String string = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (TextUtils.isEmpty(string)) {
                str2 = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.";
            } else if (notificationManager.getNotificationChannel(string) != null) {
                return string;
            } else {
                str2 = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.";
            }
            Log.w("FirebaseMessaging", str2);
            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                if (identifier == 0) {
                    Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                    str3 = "Misc";
                } else {
                    str3 = context.getString(identifier);
                }
                notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", str3, 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static int m(int i2) {
        return Build.VERSION.SDK_INT >= 23 ? i2 | 67108864 : i2;
    }

    private static int n(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && q(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && q(resources, identifier2)) {
                return identifier2;
            }
            Log.w("FirebaseMessaging", "Icon resource " + str2 + " not found. Notification will use default icon.");
        }
        int i2 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i2 == 0 || !q(resources, i2)) {
            try {
                i2 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e2) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: " + e2);
            }
        }
        if (i2 == 0 || !q(resources, i2)) {
            return 17301651;
        }
        return i2;
    }

    private static Uri o(String str, s0 s0Var, Resources resources) {
        String o = s0Var.o();
        if (TextUtils.isEmpty(o)) {
            return null;
        }
        if ("default".equals(o) || resources.getIdentifier(o, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        return Uri.parse("android.resource://" + str + "/raw/" + o);
    }

    private static String p(s0 s0Var) {
        String p = s0Var.p("gcm.n.tag");
        if (!TextUtils.isEmpty(p)) {
            return p;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    @TargetApi(26)
    private static boolean q(Resources resources, int i2) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i2, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i2);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i2 + ", treating it as an invalid icon");
            return false;
        }
    }

    static boolean r(s0 s0Var) {
        return s0Var.a("google.c.a.e");
    }
}

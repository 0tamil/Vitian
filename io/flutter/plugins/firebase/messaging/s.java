package io.flutter.plugins.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.w0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class s {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static FirebaseMessaging a(Map<String, Object> map) {
        return FirebaseMessaging.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static w0 b(Map<String, Object> map) {
        Object obj = map.get("message");
        Objects.requireNonNull(obj);
        Map map2 = (Map) obj;
        Object obj2 = map2.get("to");
        Objects.requireNonNull(obj2);
        w0.b bVar = new w0.b((String) obj2);
        String str = (String) map2.get("collapseKey");
        String str2 = (String) map2.get("messageId");
        String str3 = (String) map2.get("messageType");
        Integer num = (Integer) map2.get("ttl");
        Map<String, String> map3 = (Map) map2.get("data");
        if (str != null) {
            bVar.b(str);
        }
        if (str3 != null) {
            bVar.e(str3);
        }
        if (str2 != null) {
            bVar.d(str2);
        }
        if (num != null) {
            bVar.f(num.intValue());
        }
        if (map3 != null) {
            bVar.c(map3);
        }
        return bVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(Context context) {
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        if ((keyguardManager != null && keyguardManager.isKeyguardLocked()) || (activityManager = (ActivityManager) context.getSystemService("activity")) == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return false;
        }
        String packageName = context.getPackageName();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.equals(packageName)) {
                return true;
            }
        }
        return false;
    }

    private static Map<String, Object> d(w0.c cVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (cVar.p() != null) {
            hashMap.put("title", cVar.p());
        }
        if (cVar.r() != null) {
            hashMap.put("titleLocKey", cVar.r());
        }
        if (cVar.q() != null) {
            hashMap.put("titleLocArgs", Arrays.asList(cVar.q()));
        }
        if (cVar.a() != null) {
            hashMap.put("body", cVar.a());
        }
        if (cVar.c() != null) {
            hashMap.put("bodyLocKey", cVar.c());
        }
        if (cVar.b() != null) {
            hashMap.put("bodyLocArgs", Arrays.asList(cVar.b()));
        }
        if (cVar.d() != null) {
            hashMap2.put("channelId", cVar.d());
        }
        if (cVar.e() != null) {
            hashMap2.put("clickAction", cVar.e());
        }
        if (cVar.f() != null) {
            hashMap2.put("color", cVar.f());
        }
        if (cVar.g() != null) {
            hashMap2.put("smallIcon", cVar.g());
        }
        if (cVar.h() != null) {
            hashMap2.put("imageUrl", cVar.h().toString());
        }
        if (cVar.i() != null) {
            hashMap2.put("link", cVar.i().toString());
        }
        if (cVar.k() != null) {
            hashMap2.put("count", cVar.k());
        }
        if (cVar.l() != null) {
            hashMap2.put("priority", cVar.l());
        }
        if (cVar.m() != null) {
            hashMap2.put("sound", cVar.m());
        }
        if (cVar.o() != null) {
            hashMap2.put("ticker", cVar.o());
        }
        if (cVar.s() != null) {
            hashMap2.put("visibility", cVar.s());
        }
        if (cVar.n() != null) {
            hashMap2.put("tag", cVar.n());
        }
        hashMap.put("android", hashMap2);
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Object> e(w0 w0Var) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (w0Var.b() != null) {
            hashMap.put("collapseKey", w0Var.b());
        }
        if (w0Var.d() != null) {
            hashMap.put("from", w0Var.d());
        }
        if (w0Var.k() != null) {
            hashMap.put("to", w0Var.k());
        }
        if (w0Var.e() != null) {
            hashMap.put("messageId", w0Var.e());
        }
        if (w0Var.g() != null) {
            hashMap.put("messageType", w0Var.g());
        }
        if (w0Var.c().size() > 0) {
            for (Map.Entry<String, String> entry : w0Var.c().entrySet()) {
                hashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        hashMap.put("data", hashMap2);
        hashMap.put("ttl", Integer.valueOf(w0Var.l()));
        hashMap.put("sentTime", Long.valueOf(w0Var.j()));
        if (w0Var.h() != null) {
            hashMap.put("notification", d(w0Var.h()));
        }
        return hashMap;
    }
}

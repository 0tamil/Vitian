package com.google.firebase.messaging;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class i0 {
    public static final long a = TimeUnit.MINUTES.toMillis(3);

    /* loaded from: classes.dex */
    public static final class a {
        public static e.c.a<String, String> a(Bundle bundle) {
            e.c.a<String, String> aVar = new e.c.a<>();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        aVar.put(str, str2);
                    }
                }
            }
            return aVar;
        }
    }
}
